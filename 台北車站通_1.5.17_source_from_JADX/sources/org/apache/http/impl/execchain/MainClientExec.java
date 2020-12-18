package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;

@Immutable
public class MainClientExec implements ClientExecChain {
    private final HttpAuthenticator authenticator;
    private final HttpClientConnectionManager connManager;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    private final AuthenticationStrategy proxyAuthStrategy;
    private final HttpProcessor proxyHttpProcessor;
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;
    private final HttpRouteDirector routeDirector;
    private final AuthenticationStrategy targetAuthStrategy;
    private final UserTokenHandler userTokenHandler;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainClientExec(org.apache.http.protocol.HttpRequestExecutor r10, org.apache.http.conn.HttpClientConnectionManager r11, org.apache.http.ConnectionReuseStrategy r12, org.apache.http.conn.ConnectionKeepAliveStrategy r13, org.apache.http.client.AuthenticationStrategy r14, org.apache.http.client.AuthenticationStrategy r15, org.apache.http.client.UserTokenHandler r16) {
        /*
            r9 = this;
            org.apache.http.protocol.ImmutableHttpProcessor r5 = new org.apache.http.protocol.ImmutableHttpProcessor
            r0 = 1
            org.apache.http.HttpRequestInterceptor[] r0 = new org.apache.http.HttpRequestInterceptor[r0]
            org.apache.http.protocol.RequestTargetHost r1 = new org.apache.http.protocol.RequestTargetHost
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            r5.<init>((org.apache.http.HttpRequestInterceptor[]) r0)
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.<init>(org.apache.http.protocol.HttpRequestExecutor, org.apache.http.conn.HttpClientConnectionManager, org.apache.http.ConnectionReuseStrategy, org.apache.http.conn.ConnectionKeepAliveStrategy, org.apache.http.client.AuthenticationStrategy, org.apache.http.client.AuthenticationStrategy, org.apache.http.client.UserTokenHandler):void");
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler2) {
        this.log = LogFactory.getLog(MainClientExec.class);
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler2, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler2;
    }

    private boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r0.reuseStrategy.keepAlive(r3, r8) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        r0.log.debug("Connection kept alive");
        org.apache.http.util.EntityUtils.consume(r3.getEntity());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r18.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean createTunnelToTarget(org.apache.http.auth.AuthState r17, org.apache.http.HttpClientConnection r18, org.apache.http.conn.routing.HttpRoute r19, org.apache.http.HttpRequest r20, org.apache.http.client.protocol.HttpClientContext r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r8 = r21
            org.apache.http.client.config.RequestConfig r9 = r21.getRequestConfig()
            int r10 = r9.getConnectTimeout()
            org.apache.http.HttpHost r2 = r19.getTargetHost()
            org.apache.http.HttpHost r11 = r19.getProxyHost()
            java.lang.String r2 = r2.toHostString()
            org.apache.http.message.BasicHttpRequest r12 = new org.apache.http.message.BasicHttpRequest
            org.apache.http.ProtocolVersion r3 = r20.getProtocolVersion()
            java.lang.String r4 = "CONNECT"
            r12.<init>(r4, r2, r3)
            org.apache.http.protocol.HttpRequestExecutor r2 = r0.requestExecutor
            org.apache.http.protocol.HttpProcessor r3 = r0.proxyHttpProcessor
            r2.preProcess(r12, r3, r8)
            r13 = 0
        L_0x002d:
            r2 = r13
        L_0x002e:
            r3 = 0
            if (r2 != 0) goto L_0x00ce
            boolean r2 = r18.isOpen()
            if (r2 != 0) goto L_0x0045
            org.apache.http.conn.HttpClientConnectionManager r2 = r0.connManager
            if (r10 <= 0) goto L_0x003f
            r14 = r19
            r3 = r10
            goto L_0x0041
        L_0x003f:
            r14 = r19
        L_0x0041:
            r2.connect(r1, r14, r3, r8)
            goto L_0x0047
        L_0x0045:
            r14 = r19
        L_0x0047:
            java.lang.String r2 = "Proxy-Authorization"
            r12.removeHeaders(r2)
            org.apache.http.impl.auth.HttpAuthenticator r2 = r0.authenticator
            r15 = r17
            r2.generateAuthResponse(r12, r15, r8)
            org.apache.http.protocol.HttpRequestExecutor r2 = r0.requestExecutor
            org.apache.http.HttpResponse r7 = r2.execute(r12, r1, r8)
            org.apache.http.StatusLine r2 = r7.getStatusLine()
            int r2 = r2.getStatusCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L_0x00b2
            boolean r2 = r9.isAuthenticationEnabled()
            if (r2 == 0) goto L_0x00ae
            org.apache.http.impl.auth.HttpAuthenticator r2 = r0.authenticator
            org.apache.http.client.AuthenticationStrategy r5 = r0.proxyAuthStrategy
            r3 = r11
            r4 = r7
            r6 = r17
            r20 = r7
            r7 = r21
            boolean r2 = r2.isAuthenticationRequested(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00ab
            org.apache.http.impl.auth.HttpAuthenticator r2 = r0.authenticator
            org.apache.http.client.AuthenticationStrategy r5 = r0.proxyAuthStrategy
            r3 = r11
            r4 = r20
            r6 = r17
            r7 = r21
            boolean r2 = r2.handleAuthChallenge(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00ab
            org.apache.http.ConnectionReuseStrategy r2 = r0.reuseStrategy
            r3 = r20
            boolean r2 = r2.keepAlive(r3, r8)
            if (r2 == 0) goto L_0x00a7
            org.apache.commons.logging.Log r2 = r0.log
            java.lang.String r4 = "Connection kept alive"
            r2.debug(r4)
            org.apache.http.HttpEntity r2 = r3.getEntity()
            org.apache.http.util.EntityUtils.consume(r2)
            goto L_0x002d
        L_0x00a7:
            r18.close()
            goto L_0x002d
        L_0x00ab:
            r3 = r20
            goto L_0x00af
        L_0x00ae:
            r3 = r7
        L_0x00af:
            r2 = r3
            goto L_0x002e
        L_0x00b2:
            r3 = r7
            org.apache.http.HttpException r1 = new org.apache.http.HttpException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unexpected response to CONNECT request: "
            r2.append(r4)
            org.apache.http.StatusLine r3 = r3.getStatusLine()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ce:
            org.apache.http.StatusLine r4 = r2.getStatusLine()
            int r4 = r4.getStatusCode()
            r5 = 299(0x12b, float:4.19E-43)
            if (r4 <= r5) goto L_0x0106
            org.apache.http.HttpEntity r3 = r2.getEntity()
            if (r3 == 0) goto L_0x00e8
            org.apache.http.entity.BufferedHttpEntity r4 = new org.apache.http.entity.BufferedHttpEntity
            r4.<init>(r3)
            r2.setEntity(r4)
        L_0x00e8:
            r18.close()
            org.apache.http.impl.execchain.TunnelRefusedException r1 = new org.apache.http.impl.execchain.TunnelRefusedException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CONNECT refused by proxy: "
            r3.append(r4)
            org.apache.http.StatusLine r4 = r2.getStatusLine()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
            throw r1
        L_0x0106:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.createTunnelToTarget(org.apache.http.auth.AuthState, org.apache.http.HttpClientConnection, org.apache.http.conn.routing.HttpRoute, org.apache.http.HttpRequest, org.apache.http.client.protocol.HttpClientContext):boolean");
    }

    private boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (!httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            return false;
        }
        HttpHost targetHost = httpClientContext.getTargetHost();
        if (targetHost == null) {
            targetHost = httpRoute.getTargetHost();
        }
        if (targetHost.getPort() < 0) {
            targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
        }
        boolean isAuthenticationRequested = this.authenticator.isAuthenticationRequested(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        HttpHost proxyHost = httpRoute.getProxyHost();
        if (proxyHost == null) {
            proxyHost = httpRoute.getTargetHost();
        }
        boolean isAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
        if (isAuthenticationRequested) {
            return this.authenticator.handleAuthChallenge(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        } else if (!isAuthenticationRequested2) {
            return false;
        } else {
            return this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
        }
    }

    /* access modifiers changed from: package-private */
    public void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) {
        int nextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.routeDirector.nextStep(httpRoute, route);
            int i = 0;
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    continue;
                case 1:
                    HttpClientConnectionManager httpClientConnectionManager = this.connManager;
                    if (connectTimeout > 0) {
                        i = connectTimeout;
                    }
                    httpClientConnectionManager.connect(httpClientConnection, httpRoute, i, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(createTunnelToTarget);
                    continue;
                case 4:
                    createTunnelToProxy(httpRoute, route.getHopCount() - 1, httpClientContext);
                    throw null;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0353, code lost:
        r2 = new java.io.InterruptedIOException("Connection has been shut down");
        r2.initCause(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x035d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x020b A[Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0261 A[Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x027c A[Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x02f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6 A[Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }, ExcHandler: ConnectionShutdownException (r0v18 'e' org.apache.http.impl.conn.ConnectionShutdownException A[CUSTOM_DECLARE, Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }]), Splitter:B:105:0x01c5] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r25, org.apache.http.client.methods.HttpRequestWrapper r26, org.apache.http.client.protocol.HttpClientContext r27, org.apache.http.client.methods.HttpExecutionAware r28) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            java.lang.String r12 = "Proxy-Authorization"
            java.lang.String r13 = "Authorization"
            java.lang.String r1 = "HTTP route"
            org.apache.http.util.Args.notNull(r8, r1)
            java.lang.String r1 = "HTTP request"
            org.apache.http.util.Args.notNull(r9, r1)
            java.lang.String r1 = "HTTP context"
            org.apache.http.util.Args.notNull(r10, r1)
            org.apache.http.auth.AuthState r1 = r27.getTargetAuthState()
            if (r1 != 0) goto L_0x002d
            org.apache.http.auth.AuthState r1 = new org.apache.http.auth.AuthState
            r1.<init>()
            java.lang.String r2 = "http.auth.target-scope"
            r10.setAttribute(r2, r1)
        L_0x002d:
            r14 = r1
            org.apache.http.auth.AuthState r1 = r27.getProxyAuthState()
            if (r1 != 0) goto L_0x003e
            org.apache.http.auth.AuthState r1 = new org.apache.http.auth.AuthState
            r1.<init>()
            java.lang.String r2 = "http.auth.proxy-scope"
            r10.setAttribute(r2, r1)
        L_0x003e:
            r15 = r1
            boolean r1 = r9 instanceof org.apache.http.HttpEntityEnclosingRequest
            if (r1 == 0) goto L_0x0049
            r1 = r9
            org.apache.http.HttpEntityEnclosingRequest r1 = (org.apache.http.HttpEntityEnclosingRequest) r1
            org.apache.http.impl.execchain.RequestEntityProxy.enhance(r1)
        L_0x0049:
            java.lang.Object r6 = r27.getUserToken()
            org.apache.http.conn.HttpClientConnectionManager r1 = r7.connManager
            org.apache.http.conn.ConnectionRequest r1 = r1.requestConnection(r8, r6)
            java.lang.String r5 = "Request aborted"
            if (r11 == 0) goto L_0x006a
            boolean r2 = r28.isAborted()
            if (r2 != 0) goto L_0x0061
            r11.setCancellable(r1)
            goto L_0x006a
        L_0x0061:
            r1.cancel()
            org.apache.http.impl.execchain.RequestAbortedException r1 = new org.apache.http.impl.execchain.RequestAbortedException
            r1.<init>(r5)
            throw r1
        L_0x006a:
            org.apache.http.client.config.RequestConfig r16 = r27.getRequestConfig()
            int r2 = r16.getConnectionRequestTimeout()     // Catch:{ InterruptedException -> 0x0370, ExecutionException -> 0x035e }
            r17 = 0
            if (r2 <= 0) goto L_0x0078
            long r2 = (long) r2     // Catch:{ InterruptedException -> 0x0370, ExecutionException -> 0x035e }
            goto L_0x007a
        L_0x0078:
            r2 = r17
        L_0x007a:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0370, ExecutionException -> 0x035e }
            org.apache.http.HttpClientConnection r4 = r1.get(r2, r4)     // Catch:{ InterruptedException -> 0x0370, ExecutionException -> 0x035e }
            java.lang.String r1 = "http.connection"
            r10.setAttribute(r1, r4)
            boolean r1 = r16.isStaleConnectionCheckEnabled()
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r4.isOpen()
            if (r1 == 0) goto L_0x00a8
            org.apache.commons.logging.Log r1 = r7.log
            java.lang.String r2 = "Stale connection check"
            r1.debug(r2)
            boolean r1 = r4.isStale()
            if (r1 == 0) goto L_0x00a8
            org.apache.commons.logging.Log r1 = r7.log
            java.lang.String r2 = "Stale connection detected"
            r1.debug(r2)
            r4.close()
        L_0x00a8:
            org.apache.http.impl.execchain.ConnectionHolder r3 = new org.apache.http.impl.execchain.ConnectionHolder
            org.apache.commons.logging.Log r1 = r7.log
            org.apache.http.conn.HttpClientConnectionManager r2 = r7.connManager
            r3.<init>(r1, r2, r4)
            if (r11 == 0) goto L_0x00ca
            r11.setCancellable(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            goto L_0x00ca
        L_0x00b7:
            r0 = move-exception
            r1 = r0
            r11 = r3
            goto L_0x0341
        L_0x00bc:
            r0 = move-exception
            r1 = r0
            r11 = r3
            goto L_0x0348
        L_0x00c1:
            r0 = move-exception
            r1 = r0
            r11 = r3
            goto L_0x034f
        L_0x00c6:
            r0 = move-exception
            r1 = r0
            goto L_0x0353
        L_0x00ca:
            r2 = 1
            r1 = r2
        L_0x00cc:
            if (r1 <= r2) goto L_0x00dd
            boolean r19 = org.apache.http.impl.execchain.RequestEntityProxy.isRepeatable(r26)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            if (r19 == 0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            org.apache.http.client.NonRepeatableRequestException r1 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            java.lang.String r2 = "Cannot retry request with a non-repeatable request entity."
            r1.<init>(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            throw r1     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
        L_0x00dd:
            if (r11 == 0) goto L_0x00ec
            boolean r19 = r28.isAborted()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            if (r19 != 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            org.apache.http.impl.execchain.RequestAbortedException r1 = new org.apache.http.impl.execchain.RequestAbortedException     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            r1.<init>(r5)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            throw r1     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
        L_0x00ec:
            boolean r19 = r4.isOpen()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x034c, IOException -> 0x0345, RuntimeException -> 0x033e }
            if (r19 != 0) goto L_0x013f
            org.apache.commons.logging.Log r2 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            r20 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            r1.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x00c1, IOException -> 0x00bc, RuntimeException -> 0x00b7 }
            r21 = r3
            java.lang.String r3 = "Opening connection "
            r1.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.append(r8)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.debug(r1)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1 = r24
            r19 = 1
            r2 = r15
            r8 = r21
            r3 = r4
            r8 = r4
            r4 = r25
            r22 = r15
            r15 = r5
            r5 = r26
            r23 = r6
            r6 = r27
            r1.establishRoute(r2, r3, r4, r5, r6)     // Catch:{ TunnelRefusedException -> 0x0124 }
            goto L_0x014b
        L_0x0124:
            r0 = move-exception
            r1 = r0
            org.apache.commons.logging.Log r2 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            boolean r2 = r2.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            if (r2 == 0) goto L_0x0137
            org.apache.commons.logging.Log r2 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.debug(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x0137:
            org.apache.http.HttpResponse r1 = r1.getResponse()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r11 = r21
            goto L_0x02fa
        L_0x013f:
            r20 = r1
            r19 = r2
            r21 = r3
            r8 = r4
            r23 = r6
            r22 = r15
            r15 = r5
        L_0x014b:
            int r1 = r16.getSocketTimeout()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r1 < 0) goto L_0x0167
            r8.setSocketTimeout(r1)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            goto L_0x0167
        L_0x0155:
            r0 = move-exception
            r1 = r0
            r11 = r21
            goto L_0x0341
        L_0x015b:
            r0 = move-exception
            r1 = r0
            r11 = r21
            goto L_0x0348
        L_0x0161:
            r0 = move-exception
            r1 = r0
            r11 = r21
            goto L_0x034f
        L_0x0167:
            if (r11 == 0) goto L_0x0176
            boolean r1 = r28.isAborted()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            if (r1 != 0) goto L_0x0170
            goto L_0x0176
        L_0x0170:
            org.apache.http.impl.execchain.RequestAbortedException r1 = new org.apache.http.impl.execchain.RequestAbortedException     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.<init>(r15)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            throw r1     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x0176:
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r1 == 0) goto L_0x0198
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = "Executing request "
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            org.apache.http.RequestLine r3 = r26.getRequestLine()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.debug(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x0198:
            boolean r1 = r9.containsHeader(r13)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r1 != 0) goto L_0x01c5
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            if (r1 == 0) goto L_0x01c0
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = "Target auth state: "
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            org.apache.http.auth.AuthProtocolState r3 = r14.getState()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.debug(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x01c0:
            org.apache.http.impl.auth.HttpAuthenticator r1 = r7.authenticator     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.generateAuthResponse(r9, r14, r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x01c5:
            boolean r1 = r9.containsHeader(r12)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r1 != 0) goto L_0x01fb
            boolean r1 = r25.isTunnelled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            if (r1 != 0) goto L_0x01fb
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            if (r1 == 0) goto L_0x01f3
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = "Proxy auth state: "
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            org.apache.http.auth.AuthProtocolState r3 = r22.getState()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r2.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r1.debug(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
        L_0x01f3:
            org.apache.http.impl.auth.HttpAuthenticator r1 = r7.authenticator     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r6 = r22
            r1.generateAuthResponse(r9, r6, r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            goto L_0x01fd
        L_0x01fb:
            r6 = r22
        L_0x01fd:
            org.apache.http.protocol.HttpRequestExecutor r1 = r7.requestExecutor     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            org.apache.http.HttpResponse r5 = r1.execute(r9, r8, r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            org.apache.http.ConnectionReuseStrategy r1 = r7.reuseStrategy     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            boolean r1 = r1.keepAlive(r5, r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r1 == 0) goto L_0x0261
            org.apache.http.conn.ConnectionKeepAliveStrategy r1 = r7.keepAliveStrategy     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            long r1 = r1.getKeepAliveDuration(r5, r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            org.apache.commons.logging.Log r3 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            boolean r3 = r3.isDebugEnabled()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            if (r3 == 0) goto L_0x0254
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x0239
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r3.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r4 = "for "
            r3.append(r4)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r3.append(r1)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r3.append(r4)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = r3.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            goto L_0x023b
        L_0x0239:
            java.lang.String r3 = "indefinitely"
        L_0x023b:
            org.apache.commons.logging.Log r4 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r22 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r5.<init>()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r11 = "Connection can be kept alive "
            r5.append(r11)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r5.append(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            java.lang.String r3 = r5.toString()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            r4.debug(r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x0161, IOException -> 0x015b, RuntimeException -> 0x0155 }
            goto L_0x0256
        L_0x0254:
            r22 = r5
        L_0x0256:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x033a, IOException -> 0x0336, RuntimeException -> 0x0332 }
            r11 = r21
            r11.setValidFor(r1, r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            r11.markReusable()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            goto L_0x0268
        L_0x0261:
            r22 = r5
            r11 = r21
            r11.markNonReusable()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x0268:
            r1 = r24
            r2 = r14
            r3 = r6
            r4 = r25
            r21 = r22
            r5 = r21
            r22 = r6
            r6 = r27
            boolean r1 = r1.needAuthentication(r2, r3, r4, r5, r6)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 == 0) goto L_0x02f8
            org.apache.http.HttpEntity r1 = r21.getEntity()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            boolean r2 = r11.isReusable()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r2 == 0) goto L_0x028a
            org.apache.http.util.EntityUtils.consume(r1)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            goto L_0x02d1
        L_0x028a:
            r8.close()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            org.apache.http.auth.AuthProtocolState r1 = r22.getState()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            org.apache.http.auth.AuthProtocolState r2 = org.apache.http.auth.AuthProtocolState.SUCCESS     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 != r2) goto L_0x02af
            org.apache.http.auth.AuthScheme r1 = r22.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 == 0) goto L_0x02af
            org.apache.http.auth.AuthScheme r1 = r22.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            boolean r1 = r1.isConnectionBased()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 == 0) goto L_0x02af
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            java.lang.String r2 = "Resetting proxy auth state"
            r1.debug(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            r22.reset()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x02af:
            org.apache.http.auth.AuthProtocolState r1 = r14.getState()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            org.apache.http.auth.AuthProtocolState r2 = org.apache.http.auth.AuthProtocolState.SUCCESS     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 != r2) goto L_0x02d1
            org.apache.http.auth.AuthScheme r1 = r14.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 == 0) goto L_0x02d1
            org.apache.http.auth.AuthScheme r1 = r14.getAuthScheme()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            boolean r1 = r1.isConnectionBased()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 == 0) goto L_0x02d1
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            java.lang.String r2 = "Resetting target auth state"
            r1.debug(r2)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            r14.reset()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x02d1:
            org.apache.http.HttpRequest r1 = r26.getOriginal()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            boolean r2 = r1.containsHeader(r13)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r2 != 0) goto L_0x02de
            r9.removeHeaders(r13)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x02de:
            boolean r1 = r1.containsHeader(r12)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r1 != 0) goto L_0x02e7
            r9.removeHeaders(r12)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x02e7:
            int r1 = r20 + 1
            r4 = r8
            r3 = r11
            r5 = r15
            r2 = r19
            r15 = r22
            r6 = r23
            r8 = r25
            r11 = r28
            goto L_0x00cc
        L_0x02f8:
            r1 = r21
        L_0x02fa:
            if (r23 != 0) goto L_0x030e
            org.apache.http.client.UserTokenHandler r2 = r7.userTokenHandler     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            java.lang.Object r6 = r2.getUserToken(r10)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            java.lang.String r2 = "http.user-token"
            r10.setAttribute(r2, r6)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            goto L_0x0310
        L_0x0308:
            r0 = move-exception
            goto L_0x0340
        L_0x030a:
            r0 = move-exception
            goto L_0x0347
        L_0x030c:
            r0 = move-exception
            goto L_0x034e
        L_0x030e:
            r6 = r23
        L_0x0310:
            if (r6 == 0) goto L_0x0315
            r11.setState(r6)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
        L_0x0315:
            org.apache.http.HttpEntity r2 = r1.getEntity()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r2 == 0) goto L_0x0328
            boolean r2 = r2.isStreaming()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            if (r2 != 0) goto L_0x0322
            goto L_0x0328
        L_0x0322:
            org.apache.http.impl.execchain.HttpResponseProxy r2 = new org.apache.http.impl.execchain.HttpResponseProxy     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            r2.<init>(r1, r11)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            return r2
        L_0x0328:
            r11.releaseConnection()     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            org.apache.http.impl.execchain.HttpResponseProxy r2 = new org.apache.http.impl.execchain.HttpResponseProxy     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ ConnectionShutdownException -> 0x00c6, HttpException -> 0x030c, IOException -> 0x030a, RuntimeException -> 0x0308 }
            return r2
        L_0x0332:
            r0 = move-exception
            r11 = r21
            goto L_0x0340
        L_0x0336:
            r0 = move-exception
            r11 = r21
            goto L_0x0347
        L_0x033a:
            r0 = move-exception
            r11 = r21
            goto L_0x034e
        L_0x033e:
            r0 = move-exception
            r11 = r3
        L_0x0340:
            r1 = r0
        L_0x0341:
            r11.abortConnection()
            throw r1
        L_0x0345:
            r0 = move-exception
            r11 = r3
        L_0x0347:
            r1 = r0
        L_0x0348:
            r11.abortConnection()
            throw r1
        L_0x034c:
            r0 = move-exception
            r11 = r3
        L_0x034e:
            r1 = r0
        L_0x034f:
            r11.abortConnection()
            throw r1
        L_0x0353:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            java.lang.String r3 = "Connection has been shut down"
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
        L_0x035e:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x0367
            goto L_0x0368
        L_0x0367:
            r1 = r2
        L_0x0368:
            org.apache.http.impl.execchain.RequestAbortedException r2 = new org.apache.http.impl.execchain.RequestAbortedException
            java.lang.String r3 = "Request execution failed"
            r2.<init>(r3, r1)
            throw r2
        L_0x0370:
            r0 = move-exception
            r15 = r5
            r1 = r0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            org.apache.http.impl.execchain.RequestAbortedException r2 = new org.apache.http.impl.execchain.RequestAbortedException
            r2.<init>(r15, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
