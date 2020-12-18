package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.ap */
public final class C2953ap {
    /* renamed from: a */
    public static String m11934a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    /* renamed from: a */
    public static byte[] m11935a(String str, boolean z) {
        byte[] decode = Base64.decode(str, z ? 11 : 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to decode ".concat(valueOf) : new String("Unable to decode "));
    }
}
