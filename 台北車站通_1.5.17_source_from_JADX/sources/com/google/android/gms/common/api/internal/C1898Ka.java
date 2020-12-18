package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1869e;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.util.p073a.C2076a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.Ka */
public final class C1898Ka implements C1929ea {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C1850a.C1853c<?>, C1896Ja<?>> f6133a = new HashMap();

    /* renamed from: b */
    private final Map<C1850a.C1853c<?>, C1896Ja<?>> f6134b = new HashMap();

    /* renamed from: c */
    private final Map<C1850a<?>, Boolean> f6135c;

    /* renamed from: d */
    private final C1925e f6136d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1899L f6137e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f6138f;

    /* renamed from: g */
    private final Looper f6139g;

    /* renamed from: h */
    private final C1993f f6140h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f6141i;

    /* renamed from: j */
    private final C2025f f6142j;

    /* renamed from: k */
    private final boolean f6143k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f6144l;

    /* renamed from: m */
    private final Queue<C1921c<?, ?>> f6145m = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6146n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<C1973ya<?>, ConnectionResult> f6147o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<C1973ya<?>, ConnectionResult> f6148p;

    /* renamed from: q */
    private C1904Na f6149q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ConnectionResult f6150r;

    public C1898Ka(Context context, Lock lock, Looper looper, C1993f fVar, Map<C1850a.C1853c<?>, C1850a.C1861f> map, C2025f fVar2, Map<C1850a<?>, Boolean> map2, C1850a.C1851a<? extends C5524b, C5525c> aVar, ArrayList<C1884Da> arrayList, C1899L l, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f6138f = lock;
        this.f6139g = looper;
        this.f6141i = lock.newCondition();
        this.f6140h = fVar;
        this.f6137e = l;
        this.f6135c = map2;
        this.f6142j = fVar2;
        this.f6143k = z;
        HashMap hashMap = new HashMap();
        for (C1850a next : map2.keySet()) {
            hashMap.put(next.mo7279a(), next);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1884Da da = arrayList.get(i);
            i++;
            C1884Da da2 = da;
            hashMap2.put(da2.f6101a, da2);
        }
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = false;
        for (Map.Entry next2 : map.entrySet()) {
            C1850a aVar2 = (C1850a) hashMap.get(next2.getKey());
            C1850a.C1861f fVar3 = (C1850a.C1861f) next2.getValue();
            if (!fVar3.mo7296f()) {
                z2 = z7;
                z4 = z8;
                z3 = false;
            } else if (!this.f6135c.get(aVar2).booleanValue()) {
                z3 = z6;
                z4 = true;
                z2 = true;
            } else {
                z3 = z6;
                z4 = z8;
                z2 = true;
            }
            C1896Ja ja = r1;
            C1896Ja ja2 = new C1896Ja(context, aVar2, looper, fVar3, (C1884Da) hashMap2.get(aVar2), fVar2, aVar);
            this.f6133a.put((C1850a.C1853c) next2.getKey(), ja);
            if (fVar3.mo7301j()) {
                this.f6134b.put((C1850a.C1853c) next2.getKey(), ja);
            }
            z8 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.f6144l = (!z7 || z6 || z8) ? false : z5;
        this.f6136d = C1925e.m8509a();
    }

    /* renamed from: a */
    private final ConnectionResult m8400a(C1850a.C1853c<?> cVar) {
        this.f6138f.lock();
        try {
            C1896Ja ja = this.f6133a.get(cVar);
            if (this.f6147o != null && ja != null) {
                return this.f6147o.get(ja.mo7317e());
            }
            this.f6138f.unlock();
            return null;
        } finally {
            this.f6138f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8404a(C1896Ja<?> ja, ConnectionResult connectionResult) {
        return !connectionResult.mo7218f() && !connectionResult.mo7216e() && this.f6135c.get(ja.mo7314b()).booleanValue() && ja.mo7357f().mo7296f() && this.f6140h.mo7542c(connectionResult.mo7213b());
    }

    /* renamed from: b */
    private final <T extends C1921c<? extends C1874i, ? extends C1850a.C1852b>> boolean m8408b(T t) {
        C1850a.C1853c h = t.mo7414h();
        ConnectionResult a = m8400a((C1850a.C1853c<?>) h);
        if (a == null || a.mo7213b() != 4) {
            return false;
        }
        t.mo7411c(new Status(4, (String) null, this.f6136d.mo7416a((C1973ya<?>) this.f6133a.get(h).mo7317e(), System.identityHashCode(this.f6137e))));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8410c() {
        Set<Scope> hashSet;
        C1899L l;
        C2025f fVar = this.f6142j;
        if (fVar == null) {
            l = this.f6137e;
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet<>(fVar.mo7667h());
            Map<C1850a<?>, C2025f.C2027b> e = this.f6142j.mo7664e();
            for (C1850a next : e.keySet()) {
                ConnectionResult a = mo7365a((C1850a<?>) next);
                if (a != null && a.mo7218f()) {
                    hashSet.addAll(e.get(next).f6488a);
                }
            }
            l = this.f6137e;
        }
        l.f6166q = hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m8412d() {
        while (!this.f6145m.isEmpty()) {
            mo7346a(this.f6145m.remove());
        }
        this.f6137e.mo7354a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final ConnectionResult m8413e() {
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        ConnectionResult connectionResult2 = null;
        for (C1896Ja next : this.f6133a.values()) {
            C1850a b = next.mo7314b();
            ConnectionResult connectionResult3 = this.f6147o.get(next.mo7317e());
            if (!connectionResult3.mo7218f() && (!this.f6135c.get(b).booleanValue() || connectionResult3.mo7216e() || this.f6140h.mo7542c(connectionResult3.mo7213b()))) {
                if (connectionResult3.mo7213b() != 4 || !this.f6143k) {
                    int a = b.mo7281c().mo7286a();
                    if (connectionResult == null || i > a) {
                        connectionResult = connectionResult3;
                        i = a;
                    }
                } else {
                    int a2 = b.mo7281c().mo7286a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: a */
    public final ConnectionResult mo7365a(C1850a<?> aVar) {
        return m8400a(aVar.mo7279a());
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7346a(T t) {
        C1850a.C1853c h = t.mo7414h();
        if (this.f6143k && m8408b(t)) {
            return t;
        }
        this.f6137e.f6174y.mo7483a(t);
        this.f6133a.get(h).mo7311a(t);
        return t;
    }

    /* renamed from: a */
    public final void mo7347a() {
        this.f6138f.lock();
        try {
            this.f6146n = false;
            this.f6147o = null;
            this.f6148p = null;
            if (this.f6149q == null) {
                this.f6150r = null;
                while (!this.f6145m.isEmpty()) {
                    C1921c remove = this.f6145m.remove();
                    remove.mo7330a((C1965ua) null);
                    remove.mo7327a();
                }
                this.f6141i.signalAll();
                return;
            }
            this.f6149q.mo7378a();
            throw null;
        } finally {
            this.f6138f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7348a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public final void mo7349b() {
    }

    public final void connect() {
        this.f6138f.lock();
        try {
            if (!this.f6146n) {
                this.f6146n = true;
                this.f6147o = null;
                this.f6148p = null;
                this.f6149q = null;
                this.f6150r = null;
                this.f6136d.mo7423e();
                this.f6136d.mo7417a((Iterable<? extends C1869e<?>>) this.f6133a.values()).mo14987a((Executor) new C2076a(this.f6139g), new C1902Ma(this));
            }
        } finally {
            this.f6138f.unlock();
        }
    }

    public final boolean isConnected() {
        this.f6138f.lock();
        try {
            return this.f6147o != null && this.f6150r == null;
        } finally {
            this.f6138f.unlock();
        }
    }
}
