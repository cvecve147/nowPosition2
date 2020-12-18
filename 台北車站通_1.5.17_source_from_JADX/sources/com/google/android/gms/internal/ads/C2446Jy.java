package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jy */
final class C2446Jy implements C1718E<C2934_y> {

    /* renamed from: a */
    private final /* synthetic */ C2209Bp f7391a;

    /* renamed from: b */
    private final /* synthetic */ C3452ry f7392b;

    /* renamed from: c */
    private final /* synthetic */ C3143hf f7393c;

    /* renamed from: d */
    private final /* synthetic */ C2275Dy f7394d;

    C2446Jy(C2275Dy dy, C2209Bp bp, C3452ry ryVar, C3143hf hfVar) {
        this.f7394d = dy;
        this.f7391a = bp;
        this.f7392b = ryVar;
        this.f7393c = hfVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f7394d.f6926a) {
            C2227Cf.m9534c("JS Engine is requesting an update");
            if (this.f7394d.f6933h == 0) {
                C2227Cf.m9534c("Starting reload.");
                int unused = this.f7394d.f6933h = 2;
                this.f7394d.mo8019a(this.f7391a);
            }
            this.f7392b.mo9185a("/requestReload", (C1718E) this.f7393c.mo9493a());
        }
    }
}
