package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Rd */
public final class C2658Rd implements C2297Er {

    /* renamed from: a */
    private final Object f8198a;

    /* renamed from: b */
    private final C2539Nd f8199b;

    /* renamed from: c */
    private final HashSet<C2311Fd> f8200c;

    /* renamed from: d */
    private final HashSet<C2631Qd> f8201d;

    public C2658Rd() {
        this(C3390pt.m13455c());
    }

    private C2658Rd(String str) {
        this.f8198a = new Object();
        this.f8200c = new HashSet<>();
        this.f8201d = new HashSet<>();
        this.f8199b = new C2539Nd(str);
    }

    /* renamed from: a */
    public final Bundle mo8771a(Context context, C2568Od od, String str) {
        Bundle bundle;
        synchronized (this.f8198a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f8199b.mo8560a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator<C2631Qd> it = this.f8201d.iterator();
            while (it.hasNext()) {
                C2631Qd next = it.next();
                bundle2.putBundle(next.mo8737b(), next.mo8735a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator<C2311Fd> it2 = this.f8200c.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().mo8066a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            od.mo6864a(this.f8200c);
            this.f8200c.clear();
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo8772a() {
        synchronized (this.f8198a) {
            this.f8199b.mo8561a();
        }
    }

    /* renamed from: a */
    public final void mo8773a(C2311Fd fd) {
        synchronized (this.f8198a) {
            this.f8200c.add(fd);
        }
    }

    /* renamed from: a */
    public final void mo8774a(C2631Qd qd) {
        synchronized (this.f8198a) {
            this.f8201d.add(qd);
        }
    }

    /* renamed from: a */
    public final void mo8775a(zzjj zzjj, long j) {
        synchronized (this.f8198a) {
            this.f8199b.mo8562a(zzjj, j);
        }
    }

    /* renamed from: a */
    public final void mo8776a(HashSet<C2311Fd> hashSet) {
        synchronized (this.f8198a) {
            this.f8200c.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final void mo8053a(boolean z) {
        long a = C1697X.m7705l().mo7725a();
        if (z) {
            if (a - C1697X.m7702i().mo8333m().mo9159i() > ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7901hb)).longValue()) {
                this.f8199b.f7639d = -1;
                return;
            }
            this.f8199b.f7639d = C1697X.m7702i().mo8333m().mo9160j();
            return;
        }
        C1697X.m7702i().mo8333m().mo9135a(a);
        C1697X.m7702i().mo8333m().mo9142b(this.f8199b.f7639d);
    }

    /* renamed from: b */
    public final void mo8777b() {
        synchronized (this.f8198a) {
            this.f8199b.mo8563b();
        }
    }
}
