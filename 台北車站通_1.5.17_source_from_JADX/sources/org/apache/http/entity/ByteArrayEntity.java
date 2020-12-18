package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class ByteArrayEntity extends AbstractHttpEntity implements Cloneable {

    /* renamed from: b */
    private final byte[] f19297b;
    @Deprecated
    protected final byte[] content;
    private final int len;
    private final int off;

    public ByteArrayEntity(byte[] bArr) {
        this(bArr, (ContentType) null);
    }

    public ByteArrayEntity(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, (ContentType) null);
    }

    public ByteArrayEntity(byte[] bArr, int i, int i2, ContentType contentType) {
        int i3;
        Args.notNull(bArr, "Source byte array");
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
        }
        this.content = bArr;
        this.f19297b = bArr;
        this.off = i;
        this.len = i2;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public ByteArrayEntity(byte[] bArr, ContentType contentType) {
        Args.notNull(bArr, "Source byte array");
        this.content = bArr;
        this.f19297b = bArr;
        this.off = 0;
        this.len = this.f19297b.length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f19297b, this.off, this.len);
    }

    public long getContentLength() {
        return (long) this.len;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        outputStream.write(this.f19297b, this.off, this.len);
        outputStream.flush();
    }
}
