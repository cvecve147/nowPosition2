package org.apache.http.client.methods;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.CloneUtils;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

public abstract class AbstractExecutionAwareRequest extends AbstractHttpMessage implements HttpExecutionAware, AbortableHttpRequest, Cloneable, HttpRequest {
    private final AtomicBoolean aborted = new AtomicBoolean(false);
    private final AtomicReference<Cancellable> cancellableRef = new AtomicReference<>((Object) null);

    protected AbstractExecutionAwareRequest() {
    }

    public void abort() {
        Cancellable andSet;
        if (this.aborted.compareAndSet(false, true) && (andSet = this.cancellableRef.getAndSet((Object) null)) != null) {
            andSet.cancel();
        }
    }

    public Object clone() {
        AbstractExecutionAwareRequest abstractExecutionAwareRequest = (AbstractExecutionAwareRequest) super.clone();
        abstractExecutionAwareRequest.headergroup = (HeaderGroup) CloneUtils.cloneObject(this.headergroup);
        abstractExecutionAwareRequest.params = (HttpParams) CloneUtils.cloneObject(this.params);
        return abstractExecutionAwareRequest;
    }

    public void completed() {
        this.cancellableRef.set((Object) null);
    }

    public boolean isAborted() {
        return this.aborted.get();
    }

    public void reset() {
        Cancellable andSet = this.cancellableRef.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel();
        }
        this.aborted.set(false);
    }

    public void setCancellable(Cancellable cancellable) {
        if (!this.aborted.get()) {
            this.cancellableRef.set(cancellable);
        }
    }

    @Deprecated
    public void setConnectionRequest(final ClientConnectionRequest clientConnectionRequest) {
        setCancellable(new Cancellable() {
            public boolean cancel() {
                clientConnectionRequest.abortRequest();
                return true;
            }
        });
    }

    @Deprecated
    public void setReleaseTrigger(final ConnectionReleaseTrigger connectionReleaseTrigger) {
        setCancellable(new Cancellable() {
            public boolean cancel() {
                try {
                    connectionReleaseTrigger.abortConnection();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        });
    }
}
