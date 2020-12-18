package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.impl.p297io.EmptyInputStream;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@NotThreadSafe
public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private long length = -1;

    public InputStream getContent() {
        Asserts.check(this.content != null, "Content has not been provided");
        return this.content;
    }

    public long getContentLength() {
        return this.length;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        InputStream inputStream = this.content;
        return (inputStream == null || inputStream == EmptyInputStream.INSTANCE) ? false : true;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
    }

    public void setContentLength(long j) {
        this.length = j;
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        InputStream content2 = getContent();
        try {
            byte[] bArr = new byte[SVGParser.ENTITY_WATCH_BUFFER_SIZE];
            while (true) {
                int read = content2.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            content2.close();
        }
    }
}
