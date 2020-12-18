package com.facebook.internal;

import android.graphics.Bitmap;
import com.facebook.internal.C1450J;

/* renamed from: com.facebook.internal.G */
class C1443G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1450J f5039a;

    /* renamed from: b */
    final /* synthetic */ Exception f5040b;

    /* renamed from: c */
    final /* synthetic */ boolean f5041c;

    /* renamed from: d */
    final /* synthetic */ Bitmap f5042d;

    /* renamed from: e */
    final /* synthetic */ C1450J.C1452b f5043e;

    C1443G(C1450J j, Exception exc, boolean z, Bitmap bitmap, C1450J.C1452b bVar) {
        this.f5039a = j;
        this.f5040b = exc;
        this.f5041c = z;
        this.f5042d = bitmap;
        this.f5043e = bVar;
    }

    public void run() {
        this.f5043e.mo6149a(new C1453K(this.f5039a, this.f5040b, this.f5041c, this.f5042d));
    }
}
