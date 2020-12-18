package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2237Co;

/* renamed from: com.google.android.gms.internal.ads.Co */
public abstract class C2237Co<M extends C2237Co<M>> extends C2408Io {

    /* renamed from: b */
    protected C2294Eo f6812b;

    /* renamed from: a */
    public void mo7848a(C2180Ao ao) {
        if (this.f6812b != null) {
            for (int i = 0; i < this.f6812b.mo8048d(); i++) {
                this.f6812b.mo8046b(i).mo8086a(ao);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7936a(C3641yo yoVar, int i) {
        int a = yoVar.mo10234a();
        if (!yoVar.mo10239b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C2464Ko ko = new C2464Ko(i, yoVar.mo10237a(a, yoVar.mo10234a() - a));
        C2322Fo fo = null;
        C2294Eo eo = this.f6812b;
        if (eo == null) {
            this.f6812b = new C2294Eo();
        } else {
            fo = eo.mo8044a(i2);
        }
        if (fo == null) {
            fo = new C2322Fo();
            this.f6812b.mo8045a(i2, fo);
        }
        fo.mo8087a(ko);
        return true;
    }

    /* renamed from: b */
    public final /* synthetic */ C2408Io mo7937b() {
        return (C2237Co) clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo7849c() {
        if (this.f6812b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f6812b.mo8048d(); i2++) {
            i += this.f6812b.mo8046b(i2).mo8089d();
        }
        return i;
    }

    public /* synthetic */ Object clone() {
        C2237Co co = (C2237Co) super.clone();
        C2352Go.m9995a(this, co);
        return co;
    }
}
