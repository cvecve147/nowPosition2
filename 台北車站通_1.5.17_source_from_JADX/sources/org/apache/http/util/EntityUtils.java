package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

public final class EntityUtils {
    private EntityUtils() {
    }

    public static void consume(HttpEntity httpEntity) {
        InputStream content;
        if (httpEntity != null && httpEntity.isStreaming() && (content = httpEntity.getContent()) != null) {
            content.close();
        }
    }

    public static void consumeQuietly(HttpEntity httpEntity) {
        try {
            consume(httpEntity);
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static String getContentCharSet(HttpEntity httpEntity) {
        NameValuePair parameterByName;
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0 && (parameterByName = elements[0].getParameterByName("charset")) != null) {
                return parameterByName.getValue();
            }
        }
        return null;
    }

    @Deprecated
    public static String getContentMimeType(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0) {
                return elements[0].getName();
            }
        }
        return null;
    }

    public static byte[] toByteArray(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            if (contentLength < 0) {
                contentLength = 4096;
            }
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
            byte[] bArr = new byte[SVGParser.ENTITY_WATCH_BUFFER_SIZE];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return byteArrayBuffer.toByteArray();
                }
                byteArrayBuffer.append(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    public static String toString(HttpEntity httpEntity) {
        return toString(httpEntity, (Charset) null);
    }

    public static String toString(HttpEntity httpEntity, String str) {
        return toString(httpEntity, str != null ? Charset.forName(str) : null);
    }

    public static String toString(HttpEntity httpEntity, Charset charset) {
        int contentLength;
        Args.notNull(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        Charset charset2 = null;
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            contentLength = (int) httpEntity.getContentLength();
            if (contentLength < 0) {
                contentLength = SVGParser.ENTITY_WATCH_BUFFER_SIZE;
            }
            ContentType contentType = ContentType.get(httpEntity);
            if (contentType != null) {
                charset2 = contentType.getCharset();
            }
        } catch (UnsupportedCharsetException e) {
            if (charset == null) {
                throw new UnsupportedEncodingException(e.getMessage());
            }
        } catch (Throwable th) {
            content.close();
            throw th;
        }
        if (charset2 != null) {
            charset = charset2;
        }
        if (charset == null) {
            charset = HTTP.DEF_CONTENT_CHARSET;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength);
        char[] cArr = new char[1024];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                charArrayBuffer.append(cArr, 0, read);
            } else {
                String charArrayBuffer2 = charArrayBuffer.toString();
                content.close();
                return charArrayBuffer2;
            }
        }
    }

    public static void updateEntity(HttpResponse httpResponse, HttpEntity httpEntity) {
        Args.notNull(httpResponse, "Response");
        consume(httpResponse.getEntity());
        httpResponse.setEntity(httpEntity);
    }
}
