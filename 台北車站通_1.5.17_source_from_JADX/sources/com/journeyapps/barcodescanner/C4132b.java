package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;

/* renamed from: com.journeyapps.barcodescanner.b */
public class C4132b {

    /* renamed from: a */
    protected C5917m f12271a;

    /* renamed from: b */
    protected C4102D f12272b;

    /* renamed from: c */
    private final int f12273c = 2;

    public C4132b(C5917m mVar, C4102D d) {
        this.f12271a = mVar;
        this.f12272b = d;
    }

    /* renamed from: a */
    public C5743a mo11672a() {
        return this.f12271a.mo15693a();
    }

    /* renamed from: b */
    public Bitmap mo11673b() {
        return this.f12272b.mo11578a(2);
    }

    /* renamed from: c */
    public byte[] mo11674c() {
        return this.f12271a.mo15697b();
    }

    /* renamed from: d */
    public Map<C5918n, Object> mo11675d() {
        return this.f12271a.mo15698c();
    }

    public String toString() {
        return this.f12271a.mo15700e();
    }
}
