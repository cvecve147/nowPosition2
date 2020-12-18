package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.ep */
final class C3068ep implements Runnable {
    private C3068ep() {
    }

    public final void run() {
        try {
            MessageDigest unused = C3010cp.f9004b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            C3010cp.f9007e.countDown();
            throw th;
        }
        C3010cp.f9007e.countDown();
    }
}
