package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@NotThreadSafe
public class BufferedHttpEntity extends HttpEntityWrapper {
    private final byte[] buffer;

    public BufferedHttpEntity(HttpEntity httpEntity) {
        super(httpEntity);
        this.buffer = (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) ? EntityUtils.toByteArray(httpEntity) : null;
    }

    public InputStream getContent() {
        byte[] bArr = this.buffer;
        return bArr != null ? new ByteArrayInputStream(bArr) : super.getContent();
    }

    public long getContentLength() {
        byte[] bArr = this.buffer;
        return bArr != null ? (long) bArr.length : super.getContentLength();
    }

    public boolean isChunked() {
        return this.buffer == null && super.isChunked();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.buffer == null && super.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        byte[] bArr = this.buffer;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }
}
