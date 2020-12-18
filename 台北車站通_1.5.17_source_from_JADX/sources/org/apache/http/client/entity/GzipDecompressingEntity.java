package org.apache.http.client.entity;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;

public class GzipDecompressingEntity extends DecompressingEntity {
    public GzipDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, new InputStreamFactory() {
            public InputStream create(InputStream inputStream) {
                return new GZIPInputStream(inputStream);
            }
        });
    }
}
