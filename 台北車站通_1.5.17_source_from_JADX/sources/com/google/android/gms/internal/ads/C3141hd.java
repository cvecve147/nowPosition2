package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.hd */
final class C3141hd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f9413a;

    /* renamed from: b */
    private final /* synthetic */ C3056ed f9414b;

    C3141hd(C3056ed edVar, Bitmap bitmap) {
        this.f9414b = edVar;
        this.f9413a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f9413a.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f9414b.f9092l) {
            this.f9414b.f9083c.f7598k = new C2730To();
            this.f9414b.f9083c.f7598k.f8350e = byteArrayOutputStream.toByteArray();
            this.f9414b.f9083c.f7598k.f8349d = "image/png";
            this.f9414b.f9083c.f7598k.f8348c = 1;
        }
    }
}
