package org.apache.http.client.entity;

import java.io.InputStream;

public interface InputStreamFactory {
    InputStream create(InputStream inputStream);
}
