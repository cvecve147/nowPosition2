package org.apache.http.p298io;

import org.apache.http.HttpMessage;

/* renamed from: org.apache.http.io.HttpMessageWriter */
public interface HttpMessageWriter<T extends HttpMessage> {
    void write(T t);
}
