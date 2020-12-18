package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Lr */
public abstract class C2497Lr {

    /* renamed from: a */
    private static MessageDigest f7534a;

    /* renamed from: b */
    protected Object f7535b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo8512a() {
        synchronized (this.f7535b) {
            if (f7534a != null) {
                MessageDigest messageDigest = f7534a;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f7534a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f7534a;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte[] mo8513a(String str);
}
