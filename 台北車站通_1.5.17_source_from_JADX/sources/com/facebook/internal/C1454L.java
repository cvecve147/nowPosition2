package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.C1355K;
import com.facebook.internal.C1435F;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.facebook.internal.L */
class C1454L {

    /* renamed from: a */
    static final String f5072a = "L";

    /* renamed from: b */
    private static volatile C1435F f5073b;

    /* renamed from: com.facebook.internal.L$a */
    private static class C1455a extends BufferedInputStream {

        /* renamed from: a */
        HttpURLConnection f5074a;

        C1455a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f5074a = httpURLConnection;
        }

        public void close() {
            super.close();
            C1480ba.m6945a((URLConnection) this.f5074a);
        }
    }

    C1454L() {
    }

    /* renamed from: a */
    static synchronized C1435F m6830a(Context context) {
        C1435F f;
        synchronized (C1454L.class) {
            if (f5073b == null) {
                f5073b = new C1435F(f5072a, new C1435F.C1439d());
            }
            f = f5073b;
        }
        return f;
    }

    /* renamed from: a */
    static InputStream m6831a(Context context, HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return m6833a(parse) ? m6830a(context).mo6104a(parse.toString(), (InputStream) new C1455a(inputStream, httpURLConnection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    /* renamed from: a */
    static InputStream m6832a(Uri uri, Context context) {
        if (uri != null && m6833a(uri)) {
            try {
                return m6830a(context).mo6103a(uri.toString());
            } catch (IOException e) {
                C1459P.m6839a(C1355K.CACHE, 5, f5072a, e.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m6833a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (host.endsWith("fbcdn.net")) {
            return true;
        }
        return host.startsWith("fbcdn") && host.endsWith("akamaihd.net");
    }
}
