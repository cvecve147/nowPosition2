package org.apache.http.impl.client;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HTTP;

@NotThreadSafe
@Deprecated
public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {
    /* access modifiers changed from: private */
    public boolean consumed;
    private HttpEntity entity;

    class EntityWrapper extends HttpEntityWrapper {
        EntityWrapper(HttpEntity httpEntity) {
            super(httpEntity);
        }

        public void consumeContent() {
            boolean unused = EntityEnclosingRequestWrapper.this.consumed = true;
            super.consumeContent();
        }

        public InputStream getContent() {
            boolean unused = EntityEnclosingRequestWrapper.this.consumed = true;
            return super.getContent();
        }

        public void writeTo(OutputStream outputStream) {
            boolean unused = EntityEnclosingRequestWrapper.this.consumed = true;
            super.writeTo(outputStream);
        }
    }

    public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        super(httpEntityEnclosingRequest);
        setEntity(httpEntityEnclosingRequest.getEntity());
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader("Expect");
        return firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.entity;
    }

    public boolean isRepeatable() {
        HttpEntity httpEntity = this.entity;
        return httpEntity == null || httpEntity.isRepeatable() || !this.consumed;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity != null ? new EntityWrapper(httpEntity) : null;
        this.consumed = false;
    }
}
