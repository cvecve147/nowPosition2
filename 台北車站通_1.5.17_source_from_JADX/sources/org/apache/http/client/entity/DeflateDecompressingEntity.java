package org.apache.http.client.entity;

import java.io.InputStream;
import org.apache.http.HttpEntity;

public class DeflateDecompressingEntity extends DecompressingEntity {
    public DeflateDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, new InputStreamFactory() {
            public InputStream create(InputStream inputStream) {
                return new DeflateInputStream(inputStream);
            }
        });
    }
}
