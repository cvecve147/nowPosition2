package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1678D;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.V */
public final class C2769V extends C2717Td {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2534N f8423d;

    /* renamed from: e */
    private final zzaej f8424e;

    /* renamed from: f */
    private final C2282Ed f8425f;

    /* renamed from: g */
    private final C2825X f8426g;

    /* renamed from: h */
    private final Object f8427h;

    /* renamed from: i */
    private Future<C2254Dd> f8428i;

    public C2769V(Context context, C1678D d, C2282Ed ed, C2209Bp bp, C2534N n, C2930_u _uVar) {
        this(ed, n, new C2825X(context, d, new C2632Qe(context), bp, ed, _uVar));
    }

    private C2769V(C2282Ed ed, C2534N n, C2825X x) {
        this.f8427h = new Object();
        this.f8425f = ed;
        this.f8424e = ed.f6943b;
        this.f8423d = n;
        this.f8426g = x;
    }

    /* renamed from: c */
    public final void mo7015c() {
        synchronized (this.f8427h) {
            if (this.f8428i != null) {
                this.f8428i.cancel(true);
            }
        }
    }

    /* renamed from: d */
    public final void mo7016d() {
        C2254Dd dd;
        int i = 0;
        C2254Dd dd2 = null;
        try {
            synchronized (this.f8427h) {
                this.f8428i = C3057ee.m12270a(this.f8426g);
            }
            i = -2;
            dd2 = this.f8428i.get(60000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            C2227Cf.m9536d("Timed out waiting for native ad.");
            i = 2;
            this.f8428i.cancel(true);
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
        }
        int i2 = i;
        if (dd2 != null) {
            dd = dd2;
        } else {
            C2282Ed ed = this.f8425f;
            zzaef zzaef = ed.f6942a;
            zzjj zzjj = zzaef.f10753c;
            zzaej zzaej = this.f8424e;
            int i3 = zzaej.f10814m;
            long j = zzaej.f10813l;
            String str = zzaef.f10760i;
            zzaej zzaej2 = zzaej;
            long j2 = zzaej2.f10811j;
            zzjn zzjn = ed.f6945d;
            long j3 = zzaej2.f10809h;
            long j4 = ed.f6947f;
            long j5 = zzaej2.f10816o;
            String str2 = zzaej2.f10817p;
            JSONObject jSONObject = ed.f6949h;
            zzaej zzaej3 = ed.f6943b;
            dd = new C2254Dd(zzjj, (C3520uh) null, (List<String>) null, i2, (List<String>) null, (List<String>) null, i3, j, str, false, (C3568vz) null, (C2626Pz) null, (String) null, (C3596wz) null, (C3681zz) null, j2, zzjn, j3, j4, j5, str2, jSONObject, (C2329Fv) null, (zzaig) null, (List<String>) null, (List<String>) null, zzaej3.f10784G, zzaej3.f10785H, (String) null, (List<String>) null, zzaej2.f10792O, ed.f6950i, zzaej3.f10796S, false, zzaej3.f10798U, (List<String>) null, zzaej3.f10800W, zzaej3.f10801X);
        }
        C3114ge.f9351a.post(new C2798W(this, dd));
    }
}
