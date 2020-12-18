package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class C1974z implements C1907Q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1908S f6327a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f6328b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f6329c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1993f f6330d;

    /* renamed from: e */
    private ConnectionResult f6331e;

    /* renamed from: f */
    private int f6332f;

    /* renamed from: g */
    private int f6333g = 0;

    /* renamed from: h */
    private int f6334h;

    /* renamed from: i */
    private final Bundle f6335i = new Bundle();

    /* renamed from: j */
    private final Set<C1850a.C1853c> f6336j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5524b f6337k;

    /* renamed from: l */
    private boolean f6338l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6339m;

    /* renamed from: n */
    private boolean f6340n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2040q f6341o;

    /* renamed from: p */
    private boolean f6342p;

    /* renamed from: q */
    private boolean f6343q;

    /* renamed from: r */
    private final C2025f f6344r;

    /* renamed from: s */
    private final Map<C1850a<?>, Boolean> f6345s;

    /* renamed from: t */
    private final C1850a.C1851a<? extends C5524b, C5525c> f6346t;

    /* renamed from: u */
    private ArrayList<Future<?>> f6347u = new ArrayList<>();

    public C1974z(C1908S s, C2025f fVar, Map<C1850a<?>, Boolean> map, C1993f fVar2, C1850a.C1851a<? extends C5524b, C5525c> aVar, Lock lock, Context context) {
        this.f6327a = s;
        this.f6344r = fVar;
        this.f6345s = map;
        this.f6330d = fVar2;
        this.f6346t = aVar;
        this.f6328b = lock;
        this.f6329c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8693a(SignInResponse signInResponse) {
        if (m8695a(0)) {
            ConnectionResult b = signInResponse.mo11351b();
            if (b.mo7218f()) {
                ResolveAccountResponse c = signInResponse.mo11352c();
                ConnectionResult c2 = c.mo7601c();
                if (!c2.mo7218f()) {
                    String valueOf = String.valueOf(c2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m8700b(c2);
                    return;
                }
                this.f6340n = true;
                this.f6341o = c.mo7600b();
                this.f6342p = c.mo7602d();
                this.f6343q = c.mo7603e();
                m8706d();
            } else if (m8696a(b)) {
                m8710f();
                m8706d();
            } else {
                m8700b(b);
            }
        }
    }

    /* renamed from: a */
    private final void m8694a(boolean z) {
        C5524b bVar = this.f6337k;
        if (bVar != null) {
            if (bVar.isConnected() && z) {
                this.f6337k.mo11365c();
            }
            this.f6337k.mo7288a();
            this.f6341o = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8695a(int i) {
        if (this.f6333g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f6327a.f6194n.mo7370f());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i2 = this.f6334h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String b = m8699b(this.f6333g);
        String b2 = m8699b(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 70 + String.valueOf(b2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(b);
        sb3.append(" but received callback for step ");
        sb3.append(b2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m8700b(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8696a(ConnectionResult connectionResult) {
        return this.f6338l && !connectionResult.mo7216e();
    }

    /* renamed from: b */
    private static String m8699b(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m8700b(ConnectionResult connectionResult) {
        m8712g();
        m8694a(!connectionResult.mo7216e());
        this.f6327a.mo7381a(connectionResult);
        this.f6327a.f6195o.mo7355a(connectionResult);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r5.mo7216e() || r4.f6330d.mo7531a(r5.mo7213b()) != null) != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8701b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C1850a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo7281c()
            int r0 = r0.mo7286a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo7216e()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = r2
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.f r7 = r4.f6330d
            int r3 = r5.mo7213b()
            android.content.Intent r7 = r7.mo7531a((int) r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = r1
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f6331e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f6332f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f6331e = r5
            r4.f6332f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.S r7 = r4.f6327a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f6187g
            com.google.android.gms.common.api.a$c r6 = r6.mo7279a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1974z.m8701b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m8704c() {
        ConnectionResult connectionResult;
        this.f6334h--;
        int i = this.f6334h;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GoogleApiClientConnecting", this.f6327a.f6194n.mo7370f());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, (PendingIntent) null);
        } else {
            connectionResult = this.f6331e;
            if (connectionResult == null) {
                return true;
            }
            this.f6327a.f6193m = this.f6332f;
        }
        m8700b(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m8706d() {
        if (this.f6334h == 0) {
            if (!this.f6339m || this.f6340n) {
                ArrayList arrayList = new ArrayList();
                this.f6333g = 1;
                this.f6334h = this.f6327a.f6186f.size();
                for (C1850a.C1853c next : this.f6327a.f6186f.keySet()) {
                    if (!this.f6327a.f6187g.containsKey(next)) {
                        arrayList.add(this.f6327a.f6186f.get(next));
                    } else if (m8704c()) {
                        m8707e();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f6347u.add(C1911V.m8485a().submit(new C1887F(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: e */
    private final void m8707e() {
        this.f6327a.mo7385d();
        C1911V.m8485a().execute(new C1875A(this));
        C5524b bVar = this.f6337k;
        if (bVar != null) {
            if (this.f6342p) {
                bVar.mo11363a(this.f6341o, this.f6343q);
            }
            m8694a(false);
        }
        for (C1850a.C1853c<?> cVar : this.f6327a.f6187g.keySet()) {
            this.f6327a.f6186f.get(cVar).mo7288a();
        }
        this.f6327a.f6195o.mo7354a(this.f6335i.isEmpty() ? null : this.f6335i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m8710f() {
        this.f6339m = false;
        this.f6327a.f6194n.f6166q = Collections.emptySet();
        for (C1850a.C1853c next : this.f6336j) {
            if (!this.f6327a.f6187g.containsKey(next)) {
                this.f6327a.f6187g.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: g */
    private final void m8712g() {
        ArrayList<Future<?>> arrayList = this.f6347u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f6347u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final Set<Scope> m8714h() {
        C2025f fVar = this.f6344r;
        if (fVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(fVar.mo7667h());
        Map<C1850a<?>, C2025f.C2027b> e = this.f6344r.mo7664e();
        for (C1850a next : e.keySet()) {
            if (!this.f6327a.f6187g.containsKey(next.mo7279a())) {
                hashSet.addAll(e.get(next).f6488a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7358a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo7359a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z) {
        if (m8695a(1)) {
            m8701b(connectionResult, aVar, z);
            if (m8704c()) {
                m8707e();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7360a() {
        m8712g();
        m8694a(true);
        this.f6327a.mo7381a((ConnectionResult) null);
        return true;
    }

    /* renamed from: b */
    public final void mo7361b() {
        this.f6327a.f6187g.clear();
        this.f6339m = false;
        this.f6331e = null;
        this.f6333g = 0;
        this.f6338l = true;
        this.f6340n = false;
        this.f6342p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C1850a next : this.f6345s.keySet()) {
            C1850a.C1861f fVar = this.f6327a.f6186f.get(next.mo7279a());
            z |= next.mo7281c().mo7286a() == 1;
            boolean booleanValue = this.f6345s.get(next).booleanValue();
            if (fVar.mo7301j()) {
                this.f6339m = true;
                if (booleanValue) {
                    this.f6336j.add(next.mo7279a());
                } else {
                    this.f6338l = false;
                }
            }
            hashMap.put(fVar, new C1877B(this, next, booleanValue));
        }
        if (z) {
            this.f6339m = false;
        }
        if (this.f6339m) {
            this.f6344r.mo7660a(Integer.valueOf(System.identityHashCode(this.f6327a.f6194n)));
            C1893I i = new C1893I(this, (C1875A) null);
            C1850a.C1851a<? extends C5524b, C5525c> aVar = this.f6346t;
            Context context = this.f6329c;
            Looper a = this.f6327a.f6194n.mo7244a();
            C2025f fVar2 = this.f6344r;
            this.f6337k = (C5524b) aVar.mo7283a(context, a, fVar2, fVar2.mo7668i(), i, i);
        }
        this.f6334h = this.f6327a.f6186f.size();
        this.f6347u.add(C1911V.m8485a().submit(new C1881C(this, hashMap)));
    }

    public final void connect() {
    }

    /* renamed from: f */
    public final void mo7363f(int i) {
        m8700b(new ConnectionResult(8, (PendingIntent) null));
    }

    /* renamed from: j */
    public final void mo7364j(Bundle bundle) {
        if (m8695a(1)) {
            if (bundle != null) {
                this.f6335i.putAll(bundle);
            }
            if (m8704c()) {
                m8707e();
            }
        }
    }
}
