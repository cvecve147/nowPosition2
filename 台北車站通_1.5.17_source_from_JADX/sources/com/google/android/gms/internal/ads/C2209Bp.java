package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Bp */
public final class C2209Bp {

    /* renamed from: a */
    private static final String[] f6745a = {"/aclk", "/pcs/click"};

    /* renamed from: b */
    private String f6746b = "googleads.g.doubleclick.net";

    /* renamed from: c */
    private String f6747c = "/pagead/ads";

    /* renamed from: d */
    private String f6748d = "ad.doubleclick.net";

    /* renamed from: e */
    private String[] f6749e = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private C3614xp f6750f;

    public C2209Bp(C3614xp xpVar) {
        this.f6750f = xpVar;
    }

    /* renamed from: a */
    private final Uri m9449a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean c = m9450c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new C2238Cp("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new C2238Cp("Query parameter already exists: ms");
            }
            String a = z ? this.f6750f.mo6945a(context, str, view, activity) : this.f6750f.mo6943a(context);
            if (c) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + a + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + a + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", a).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + a + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new C2238Cp("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: c */
    private final boolean m9450c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f6748d);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final Uri mo7867a(Uri uri, Context context) {
        return m9449a(uri, context, (String) null, false, (View) null, (Activity) null);
    }

    /* renamed from: a */
    public final Uri mo7868a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m9449a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new C2238Cp("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public final C3614xp mo7869a() {
        return this.f6750f;
    }

    /* renamed from: a */
    public final void mo7870a(MotionEvent motionEvent) {
        this.f6750f.mo6947a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo7871a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f6749e) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final boolean mo7872b(Uri uri) {
        if (mo7871a(uri)) {
            for (String endsWith : f6745a) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
