package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Jz */
public final class C2447Jz implements C3540uz {

    /* renamed from: a */
    private final zzaef f7395a;

    /* renamed from: b */
    private final C2533Mz f7396b;

    /* renamed from: c */
    private final Context f7397c;

    /* renamed from: d */
    private final Object f7398d = new Object();

    /* renamed from: e */
    private final C3596wz f7399e;

    /* renamed from: f */
    private final boolean f7400f;

    /* renamed from: g */
    private final long f7401g;

    /* renamed from: h */
    private final long f7402h;

    /* renamed from: i */
    private final C2930_u f7403i;

    /* renamed from: j */
    private final boolean f7404j;

    /* renamed from: k */
    private final String f7405k;

    /* renamed from: l */
    private boolean f7406l = false;

    /* renamed from: m */
    private C2191Az f7407m;

    /* renamed from: n */
    private List<C2276Dz> f7408n = new ArrayList();

    /* renamed from: o */
    private final boolean f7409o;

    public C2447Jz(Context context, zzaef zzaef, C2533Mz mz, C3596wz wzVar, boolean z, boolean z2, String str, long j, long j2, C2930_u _uVar, boolean z3) {
        this.f7397c = context;
        this.f7395a = zzaef;
        this.f7396b = mz;
        this.f7399e = wzVar;
        this.f7400f = z;
        this.f7404j = z2;
        this.f7405k = str;
        this.f7401g = j;
        this.f7402h = j2;
        this.f7403i = _uVar;
        this.f7409o = z3;
    }

    /* renamed from: a */
    public final C2276Dz mo8248a(List<C3568vz> list) {
        Object obj;
        C2276Dz dz;
        C2227Cf.m9532b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        C2875Yu a = this.f7403i.mo9174a();
        zzjn zzjn = this.f7395a.f10755d;
        int[] iArr = new int[2];
        if (zzjn.f10899g != null) {
            C1697X.m7717x();
            if (C2333Fz.m9844a(this.f7405k, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.f10899g;
                int length = zzjnArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.f10897e && i3 == zzjn2.f10894b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<C3568vz> it = list.iterator();
        while (it.hasNext()) {
            C3568vz next = it.next();
            String valueOf = String.valueOf(next.f10406b);
            C2227Cf.m9534c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.f10407c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    C2875Yu a2 = this.f7403i.mo9174a();
                    Object obj2 = this.f7398d;
                    synchronized (obj2) {
                        try {
                            if (this.f7406l) {
                                dz = new C2276Dz(-1);
                            } else {
                                Context context = this.f7397c;
                                C2533Mz mz = this.f7396b;
                                C3596wz wzVar = this.f7399e;
                                zzjj zzjj = this.f7395a.f10753c;
                                zzang zzang = this.f7395a.f10762k;
                                Iterator<C3568vz> it3 = it;
                                boolean z = this.f7400f;
                                Iterator<String> it4 = it2;
                                boolean z2 = this.f7404j;
                                zzjj zzjj2 = zzjj;
                                zzpl zzpl = this.f7395a.f10776y;
                                C2875Yu yu = a;
                                C2875Yu yu2 = a2;
                                C2191Az az = r10;
                                obj = obj2;
                                try {
                                    C2191Az az2 = new C2191Az(context, next2, mz, wzVar, next, zzjj2, zzjn, zzang, z, z2, zzpl, this.f7395a.f10765n, this.f7395a.f10777z, this.f7395a.f10746X, this.f7409o);
                                    this.f7407m = az;
                                    C2276Dz a3 = this.f7407m.mo7856a(this.f7401g, this.f7402h);
                                    this.f7408n.add(a3);
                                    if (a3.f6934a == 0) {
                                        C2227Cf.m9532b("Adapter succeeded.");
                                        this.f7403i.mo9178a("mediation_network_succeed", next2);
                                        if (!arrayList.isEmpty()) {
                                            this.f7403i.mo9178a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f7403i.mo9180a(yu2, "mls");
                                        this.f7403i.mo9180a(yu, "ttm");
                                        return a3;
                                    }
                                    C2875Yu yu3 = yu;
                                    arrayList.add(next2);
                                    this.f7403i.mo9180a(yu2, "mlf");
                                    if (a3.f6936c != null) {
                                        C3114ge.f9351a.post(new C2475Kz(this, a3));
                                    }
                                    it = it3;
                                    a = yu3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return dz;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f7403i.mo9178a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new C2276Dz(1);
    }

    /* renamed from: a */
    public final List<C2276Dz> mo8249a() {
        return this.f7408n;
    }

    public final void cancel() {
        synchronized (this.f7398d) {
            this.f7406l = true;
            if (this.f7407m != null) {
                this.f7407m.mo7857a();
            }
        }
    }
}
