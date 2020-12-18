package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Go */
public final class C2352Go {

    /* renamed from: a */
    protected static final Charset f7087a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    private static final Charset f7088b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Object f7089c = new Object();

    /* renamed from: a */
    public static void m9995a(C2237Co co, C2237Co co2) {
        C2294Eo eo = co.f6812b;
        if (eo != null) {
            co2.f6812b = (C2294Eo) eo.clone();
        }
    }
}
