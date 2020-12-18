package org.apache.http.client.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;

public class DecompressingEntity extends HttpEntityWrapper {
    private static final int BUFFER_SIZE = 2048;
    private InputStream content;
    private final InputStreamFactory inputStreamFactory;

    public DecompressingEntity(HttpEntity httpEntity, InputStreamFactory inputStreamFactory2) {
        super(httpEntity);
        this.inputStreamFactory = inputStreamFactory2;
    }

    private InputStream getDecompressingStream() {
        return new LazyDecompressingInputStream(this.wrappedEntity.getContent(), this.inputStreamFactory);
    }

    public InputStream getContent() {
        if (!this.wrappedEntity.isStreaming()) {
            return getDecompressingStream();
        }
        if (this.content == null) {
            this.content = getDecompressingStream();
        }
        return this.content;
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        return -1;
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        InputStream content2 = getContent();
        try {
            byte[] bArr = new byte[BUFFER_SIZE];
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
