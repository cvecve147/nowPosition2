package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zn */
final class C3669zn<T> implements C2493Ln<T> {

    /* renamed from: a */
    private final C3498tn f10675a;

    /* renamed from: b */
    private final C3039do<?, ?> f10676b;

    /* renamed from: c */
    private final boolean f10677c;

    /* renamed from: d */
    private final C2263Dm<?> f10678d;

    private C3669zn(C3039do<?, ?> doVar, C2263Dm<?> dm, C3498tn tnVar) {
        this.f10676b = doVar;
        this.f10677c = dm.mo8001a(tnVar);
        this.f10678d = dm;
        this.f10675a = tnVar;
    }

    /* renamed from: a */
    static <T> C3669zn<T> m14699a(C3039do<?, ?> doVar, C2263Dm<?> dm, C3498tn tnVar) {
        return new C3669zn<>(doVar, dm, tnVar);
    }

    /* renamed from: a */
    public final T mo8496a() {
        return this.f10675a.mo8618g().mo8625b();
    }

    /* renamed from: a */
    public final void mo8497a(T t, C2463Kn kn, C2206Bm bm) {
        boolean z;
        C3039do<?, ?> doVar = this.f10676b;
        C2263Dm<?> dm = this.f10678d;
        Object b = doVar.mo9329b(t);
        C2350Gm<?> b2 = dm.mo8002b(t);
        do {
            try {
                if (kn.mo8437i() == Integer.MAX_VALUE) {
                    doVar.mo9332b((Object) t, b);
                    return;
                }
                int tag = kn.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    C3150hm hmVar = null;
                    while (kn.mo8437i() != Integer.MAX_VALUE) {
                        int tag2 = kn.getTag();
                        if (tag2 == 16) {
                            i = kn.mo8420b();
                            obj = dm.mo7996a(bm, this.f10675a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                hmVar = kn.mo8451p();
                            } else {
                                dm.mo7998a(kn, obj, bm, b2);
                                throw null;
                            }
                        } else if (!kn.mo8442k()) {
                            break;
                        }
                    }
                    if (kn.getTag() == 12) {
                        if (hmVar != null) {
                            if (obj == null) {
                                doVar.mo9323a(b, i, hmVar);
                            } else {
                                dm.mo7999a(hmVar, obj, bm, b2);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw C2755Um.m11351e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a = dm.mo7996a(bm, this.f10675a, tag >>> 3);
                    if (a == null) {
                        z = doVar.mo9328a(b, kn);
                        continue;
                    } else {
                        dm.mo7998a(kn, a, bm, b2);
                        throw null;
                    }
                } else {
                    z = kn.mo8442k();
                    continue;
                }
            } finally {
                doVar.mo9332b((Object) t, b);
            }
        } while (z);
    }

    /* renamed from: a */
    public final void mo8498a(T t, C3613xo xoVar) {
        int i;
        Object obj;
        Iterator<Map.Entry<?, Object>> e = this.f10678d.mo7995a((Object) t).mo8226e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            C2406Im im = (C2406Im) next.getKey();
            if (im.mo8346j() != C3585wo.MESSAGE || im.mo8343g() || im.mo8344h()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C2894Zm) {
                i = im.mo8342d();
                obj = ((C2894Zm) next).mo9118a().mo9253a();
            } else {
                i = im.mo8342d();
                obj = next.getValue();
            }
            xoVar.mo10172a(i, obj);
        }
        C3039do<?, ?> doVar = this.f10676b;
        doVar.mo9331b(doVar.mo9320a((Object) t), xoVar);
    }

    /* renamed from: a */
    public final void mo8499a(T t, T t2) {
        C2551Nn.m10697a(this.f10676b, t, t2);
        if (this.f10677c) {
            C2551Nn.m10696a(this.f10678d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo8500a(T t, byte[] bArr, int i, int i2, C3065em emVar) {
        C2577Om om = (C2577Om) t;
        C3067eo eoVar = om.zzdtt;
        if (eoVar == C3067eo.m12291c()) {
            eoVar = C3067eo.m12292d();
            om.zzdtt = eoVar;
        }
        C3067eo eoVar2 = eoVar;
        while (i < i2) {
            int a = C3037dm.m12178a(bArr, i, emVar);
            int i3 = emVar.f9105a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? C3037dm.m12174a(i3, bArr, a, i2, eoVar2, emVar) : C3037dm.m12173a(i3, bArr, a, i2, emVar);
            } else {
                int i4 = 0;
                C3150hm hmVar = null;
                while (a < i2) {
                    a = C3037dm.m12178a(bArr, a, emVar);
                    int i5 = emVar.f9105a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            a = C3037dm.m12185e(bArr, a, emVar);
                            hmVar = (C3150hm) emVar.f9107c;
                        }
                    } else if (i7 == 0) {
                        a = C3037dm.m12178a(bArr, a, emVar);
                        i4 = emVar.f9105a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C3037dm.m12173a(i5, bArr, a, i2, emVar);
                }
                if (hmVar != null) {
                    eoVar2.mo9399a((i4 << 3) | 2, (Object) hmVar);
                }
                i = a;
            }
        }
        if (i != i2) {
            throw C2755Um.m11353g();
        }
    }

    /* renamed from: a */
    public final boolean mo8501a(T t) {
        return this.f10678d.mo7995a((Object) t).mo8225d();
    }

    /* renamed from: b */
    public final int mo8502b(T t) {
        C3039do<?, ?> doVar = this.f10676b;
        int c = doVar.mo9333c(doVar.mo9320a((Object) t)) + 0;
        return this.f10677c ? c + this.f10678d.mo7995a((Object) t).mo8231i() : c;
    }

    /* renamed from: b */
    public final boolean mo8503b(T t, T t2) {
        if (!this.f10676b.mo9320a((Object) t).equals(this.f10676b.mo9320a((Object) t2))) {
            return false;
        }
        if (this.f10677c) {
            return this.f10678d.mo7995a((Object) t).equals(this.f10678d.mo7995a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public final void mo8504c(T t) {
        this.f10676b.mo9335d(t);
        this.f10678d.mo8003c(t);
    }

    /* renamed from: d */
    public final int mo8505d(T t) {
        int hashCode = this.f10676b.mo9320a((Object) t).hashCode();
        return this.f10677c ? (hashCode * 53) + this.f10678d.mo7995a((Object) t).hashCode() : hashCode;
    }
}
