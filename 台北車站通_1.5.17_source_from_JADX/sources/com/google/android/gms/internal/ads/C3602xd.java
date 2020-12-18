package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.xd */
public final class C3602xd {
    /* renamed from: a */
    public static Uri m14407a(Uri uri, Context context) {
        if (!C1697X.m7689B().mo10047i(context) || !TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri;
        }
        String b = C1697X.m7689B().mo10035b(context);
        Uri a = m14408a(uri.toString(), "fbs_aeid", b);
        C1697X.m7689B().mo10039d(context, b);
        return a;
    }

    /* renamed from: a */
    private static Uri m14408a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: a */
    public static String m14409a(String str, Context context) {
        String b;
        if (!C1697X.m7689B().mo10040d(context) || TextUtils.isEmpty(str) || (b = C1697X.m7689B().mo10035b(context)) == null) {
            return str;
        }
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7807Ra)).booleanValue()) {
            String str2 = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7813Sa);
            if (!str.contains(str2)) {
                return str;
            }
            if (C1697X.m7698e().mo9460d(str)) {
                C1697X.m7689B().mo10039d(context, b);
                return str.replace(str2, b);
            } else if (!C1697X.m7698e().mo9461e(str)) {
                return str;
            } else {
                C1697X.m7689B().mo10041e(context, b);
                return str.replace(str2, b);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (C1697X.m7698e().mo9460d(str)) {
                C1697X.m7689B().mo10039d(context, b);
                return m14408a(str, "fbs_aeid", b).toString();
            } else if (!C1697X.m7698e().mo9461e(str)) {
                return str;
            } else {
                C1697X.m7689B().mo10041e(context, b);
                return m14408a(str, "fbs_aeid", b).toString();
            }
        }
    }

    /* renamed from: b */
    public static String m14410b(String str, Context context) {
        String b;
        if (!C1697X.m7689B().mo10040d(context) || TextUtils.isEmpty(str) || (b = C1697X.m7689B().mo10035b(context)) == null || !C1697X.m7698e().mo9461e(str)) {
            return str;
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7807Ra)).booleanValue()) {
            return !str.contains("fbs_aeid") ? m14408a(str, "fbs_aeid", b).toString() : str;
        }
        String str2 = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7813Sa);
        return str.contains(str2) ? str.replace(str2, b) : str;
    }
}
