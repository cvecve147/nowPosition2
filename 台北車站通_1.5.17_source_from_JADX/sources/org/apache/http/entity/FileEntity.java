package org.apache.http.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class FileEntity extends AbstractHttpEntity implements Cloneable {
    protected final File file;

    public FileEntity(File file2) {
        Args.notNull(file2, "File");
        this.file = file2;
    }

    @Deprecated
    public FileEntity(File file2, String str) {
        Args.notNull(file2, "File");
        this.file = file2;
        setContentType(str);
    }

    public FileEntity(File file2, ContentType contentType) {
        Args.notNull(file2, "File");
        this.file = file2;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new FileInputStream(this.file);
    }

    public long getContentLength() {
        return this.file.length();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            byte[] bArr = new byte[SVGParser.ENTITY_WATCH_BUFFER_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }
}
