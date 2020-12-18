package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.C1435F;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.facebook.internal.Y */
class C1474Y {

    /* renamed from: a */
    static final String f5113a = "Y";

    /* renamed from: b */
    private static final String f5114b = (f5113a + "_Redirect");

    /* renamed from: c */
    private static volatile C1435F f5115c;

    C1474Y() {
    }

    /* renamed from: a */
    static Uri m6911a(Uri uri) {
        InputStreamReader inputStreamReader;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            C1435F a = m6912a();
            InputStreamReader inputStreamReader2 = null;
            boolean z = false;
            while (true) {
                try {
                    InputStream a2 = a.mo6105a(uri2, f5114b);
                    if (a2 == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader = new InputStreamReader(a2);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        C1480ba.m6940a((Closeable) inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        C1480ba.m6940a((Closeable) inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        C1480ba.m6940a((Closeable) inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                    C1480ba.m6940a((Closeable) inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    C1480ba.m6940a((Closeable) inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                C1480ba.m6940a((Closeable) inputStreamReader2);
                return parse;
            }
            C1480ba.m6940a((Closeable) inputStreamReader2);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            C1480ba.m6940a((Closeable) inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            C1480ba.m6940a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    static synchronized C1435F m6912a() {
        C1435F f;
        synchronized (C1474Y.class) {
            if (f5115c == null) {
                f5115c = new C1435F(f5113a, new C1435F.C1439d());
            }
            f = f5115c;
        }
        return f;
    }

    /* renamed from: a */
    static void m6913a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                outputStream = m6912a().mo6107b(uri.toString(), f5114b);
                outputStream.write(uri2.toString().getBytes());
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1480ba.m6940a((Closeable) outputStream);
                throw th;
            }
            C1480ba.m6940a((Closeable) outputStream);
        }
    }
}
