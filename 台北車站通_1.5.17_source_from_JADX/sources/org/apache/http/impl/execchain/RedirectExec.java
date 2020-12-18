package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@ThreadSafe
public class RedirectExec implements ClientExecChain {
    private final Log log = LogFactory.getLog(RedirectExec.class);
    private final RedirectStrategy redirectStrategy;
    private final ClientExecChain requestExecutor;
    private final HttpRoutePlanner routePlanner;

    public RedirectExec(ClientExecChain clientExecChain, HttpRoutePlanner httpRoutePlanner, RedirectStrategy redirectStrategy2) {
        Args.notNull(clientExecChain, "HTTP client request executor");
        Args.notNull(httpRoutePlanner, "HTTP route planner");
        Args.notNull(redirectStrategy2, "HTTP redirect strategy");
        this.requestExecutor = clientExecChain;
        this.routePlanner = httpRoutePlanner;
        this.redirectStrategy = redirectStrategy2;
    }

    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) {
        CloseableHttpResponse execute;
        AuthScheme authScheme;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        List<URI> redirectLocations = httpClientContext.getRedirectLocations();
        if (redirectLocations != null) {
            redirectLocations.clear();
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        int maxRedirects = requestConfig.getMaxRedirects() > 0 ? requestConfig.getMaxRedirects() : 50;
        int i = 0;
        HttpRequestWrapper httpRequestWrapper2 = httpRequestWrapper;
        while (true) {
            execute = this.requestExecutor.execute(httpRoute, httpRequestWrapper2, httpClientContext, httpExecutionAware);
            try {
                if (!requestConfig.isRedirectsEnabled() || !this.redirectStrategy.isRedirected(httpRequestWrapper2, execute, httpClientContext)) {
                    return execute;
                }
                if (i < maxRedirects) {
                    i++;
                    HttpUriRequest redirect = this.redirectStrategy.getRedirect(httpRequestWrapper2, execute, httpClientContext);
                    if (!redirect.headerIterator().hasNext()) {
                        redirect.setHeaders(httpRequestWrapper.getOriginal().getAllHeaders());
                    }
                    httpRequestWrapper2 = HttpRequestWrapper.wrap(redirect);
                    if (httpRequestWrapper2 instanceof HttpEntityEnclosingRequest) {
                        RequestEntityProxy.enhance((HttpEntityEnclosingRequest) httpRequestWrapper2);
                    }
                    URI uri = httpRequestWrapper2.getURI();
                    HttpHost extractHost = URIUtils.extractHost(uri);
                    if (extractHost != null) {
                        if (!httpRoute.getTargetHost().equals(extractHost)) {
                            AuthState targetAuthState = httpClientContext.getTargetAuthState();
                            if (targetAuthState != null) {
                                this.log.debug("Resetting target auth state");
                                targetAuthState.reset();
                            }
                            AuthState proxyAuthState = httpClientContext.getProxyAuthState();
                            if (!(proxyAuthState == null || (authScheme = proxyAuthState.getAuthScheme()) == null || !authScheme.isConnectionBased())) {
                                this.log.debug("Resetting proxy auth state");
                                proxyAuthState.reset();
                            }
                        }
                        httpRoute = this.routePlanner.determineRoute(extractHost, httpRequestWrapper2, httpClientContext);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Redirecting to '" + uri + "' via " + httpRoute);
                        }
                        EntityUtils.consume(execute.getEntity());
                        execute.close();
                    } else {
                        throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
                    }
                } else {
                    throw new RedirectException("Maximum redirects (" + maxRedirects + ") exceeded");
                }
            } catch (RuntimeException e) {
                execute.close();
                throw e;
            } catch (IOException e2) {
                execute.close();
                throw e2;
            } catch (HttpException e3) {
                try {
                    EntityUtils.consume(execute.getEntity());
                } catch (IOException e4) {
                    this.log.debug("I/O error while releasing connection", e4);
                } catch (Throwable th) {
                    execute.close();
                    throw th;
                }
                execute.close();
                throw e3;
            }
        }
        return execute;
    }
}
