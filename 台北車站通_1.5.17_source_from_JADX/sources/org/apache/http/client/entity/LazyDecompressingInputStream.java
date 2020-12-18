package org.apache.http.client.entity;

import java.io.InputStream;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
class LazyDecompressingInputStream extends InputStream {
    private final InputStreamFactory inputStreamFactory;
    private final InputStream wrappedStream;
    private InputStream wrapperStream;

    public LazyDecompressingInputStream(InputStream inputStream, InputStreamFactory inputStreamFactory2) {
        this.wrappedStream = inputStream;
        this.inputStreamFactory = inputStreamFactory2;
    }

    private void initWrapper() {
        if (this.wrapperStream == null) {
            this.wrapperStream = this.inputStreamFactory.create(this.wrappedStream);
        }
    }

    public int available() {
        initWrapper();
        return this.wrapperStream.available();
    }

    public void close() {
        try {
            if (this.wrapperStream != null) {
                this.wrapperStream.close();
            }
        } finally {
            this.wrappedStream.close();
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        initWrapper();
        return this.wrapperStream.read();
    }

    public int read(byte[] bArr) {
        initWrapper();
        return this.wrapperStream.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        initWrapper();
        return this.wrapperStream.read(bArr, i, i2);
    }

    public long skip(long j) {
        initWrapper();
        return this.wrapperStream.skip(j);
    }
}
