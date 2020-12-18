package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ci */
final class C2230Ci {

    /* renamed from: a */
    private static final String[] f6807a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f6808b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    C2230Ci() {
    }

    /* renamed from: a */
    private static void m9541a(String str, String str2, String str3) {
        String str4;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7840Xb)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7930a(int i, String str) {
        String str2;
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = f6807a;
            if (i2 < strArr.length) {
                str2 = strArr[i2];
                m9541a("http_err", str2, str);
            }
        }
        str2 = String.valueOf(i);
        m9541a("http_err", str2, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7931a(SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f6808b;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    m9541a("ssl_err", str, sslError.getUrl());
                }
            }
            str = String.valueOf(primaryError);
            m9541a("ssl_err", str, sslError.getUrl());
        }
    }
}
