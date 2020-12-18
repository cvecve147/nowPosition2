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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2061y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.Fa */
final class C1888Fa implements C1929ea {

    /* renamed from: a */
    private final Context f6107a;

    /* renamed from: b */
    private final C1899L f6108b;

    /* renamed from: c */
    private final Looper f6109c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1908S f6110d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1908S f6111e;

    /* renamed from: f */
    private final Map<C1850a.C1853c<?>, C1908S> f6112f;

    /* renamed from: g */
    private final Set<C1948m> f6113g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C1850a.C1861f f6114h;

    /* renamed from: i */
    private Bundle f6115i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f6116j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f6117k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6118l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f6119m;

    /* renamed from: n */
    private int f6120n = 0;

    private C1888Fa(Context context, C1899L l, Lock lock, Looper looper, C1993f fVar, Map<C1850a.C1853c<?>, C1850a.C1861f> map, Map<C1850a.C1853c<?>, C1850a.C1861f> map2, C2025f fVar2, C1850a.C1851a<? extends C5524b, C5525c> aVar, C1850a.C1861f fVar3, ArrayList<C1884Da> arrayList, ArrayList<C1884Da> arrayList2, Map<C1850a<?>, Boolean> map3, Map<C1850a<?>, Boolean> map4) {
        this.f6107a = context;
        this.f6108b = l;
        this.f6119m = lock;
        this.f6109c = looper;
        this.f6114h = fVar3;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C1993f fVar4 = fVar;
        C1908S s = r3;
        C1908S s2 = new C1908S(context2, this.f6108b, lock2, looper2, fVar4, map2, (C2025f) null, map4, (C1850a.C1851a<? extends C5524b, C5525c>) null, arrayList2, new C1892Ha(this, (C1890Ga) null));
        this.f6110d = s;
        this.f6111e = new C1908S(context2, this.f6108b, lock2, looper2, fVar4, map, fVar2, map3, aVar, arrayList, new C1894Ia(this, (C1890Ga) null));
        C1080b bVar = new C1080b();
        for (C1850a.C1853c<?> put : map2.keySet()) {
            bVar.put(put, this.f6110d);
        }
        for (C1850a.C1853c<?> put2 : map.keySet()) {
            bVar.put(put2, this.f6111e);
        }
        this.f6112f = Collections.unmodifiableMap(bVar);
    }

    /* renamed from: a */
    public static C1888Fa m8355a(Context context, C1899L l, Lock lock, Looper looper, C1993f fVar, Map<C1850a.C1853c<?>, C1850a.C1861f> map, C2025f fVar2, Map<C1850a<?>, Boolean> map2, C1850a.C1851a<? extends C5524b, C5525c> aVar, ArrayList<C1884Da> arrayList) {
        Map<C1850a<?>, Boolean> map3 = map2;
        C1080b bVar = new C1080b();
        C1080b bVar2 = new C1080b();
        C1850a.C1861f fVar3 = null;
        for (Map.Entry next : map.entrySet()) {
            C1850a.C1861f fVar4 = (C1850a.C1861f) next.getValue();
            if (fVar4.mo7293b()) {
                fVar3 = fVar4;
            }
            if (fVar4.mo7301j()) {
                bVar.put((C1850a.C1853c) next.getKey(), fVar4);
            } else {
                bVar2.put((C1850a.C1853c) next.getKey(), fVar4);
            }
        }
        C2061y.m9078b(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C1080b bVar3 = new C1080b();
        C1080b bVar4 = new C1080b();
        for (C1850a next2 : map2.keySet()) {
            C1850a.C1853c<?> a = next2.mo7279a();
            if (bVar.containsKey(a)) {
                bVar3.put(next2, map3.get(next2));
            } else if (bVar2.containsKey(a)) {
                bVar4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1884Da da = arrayList.get(i);
            i++;
            C1884Da da2 = da;
            if (bVar3.containsKey(da2.f6101a)) {
                arrayList2.add(da2);
            } else if (bVar4.containsKey(da2.f6101a)) {
                arrayList3.add(da2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C1888Fa(context, l, lock, looper, fVar, bVar, bVar2, fVar2, aVar, fVar3, arrayList2, arrayList3, bVar3, bVar4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8357a(int i, boolean z) {
        this.f6108b.mo7353a(i, z);
        this.f6117k = null;
        this.f6116j = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8358a(Bundle bundle) {
        Bundle bundle2 = this.f6115i;
        if (bundle2 == null) {
            this.f6115i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: a */
    private final void m8359a(ConnectionResult connectionResult) {
        int i = this.f6120n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f6120n = 0;
            }
            this.f6108b.mo7355a(connectionResult);
        }
        m8370d();
        this.f6120n = 0;
    }

    /* renamed from: b */
    private static boolean m8365b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo7218f();
    }

    /* renamed from: b */
    private final boolean m8366b(C1921c<? extends C1874i, ? extends C1850a.C1852b> cVar) {
        C1850a.C1853c<? extends C1850a.C1852b> h = cVar.mo7414h();
        C2061y.m9074a(this.f6112f.containsKey(h), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return this.f6112f.get(h).equals(this.f6111e);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8367c() {
        ConnectionResult connectionResult;
        if (m8365b(this.f6116j)) {
            if (m8365b(this.f6117k) || m8372e()) {
                int i = this.f6120n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f6120n = 0;
                        return;
                    }
                    this.f6108b.mo7354a(this.f6115i);
                }
                m8370d();
                this.f6120n = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.f6117k;
            if (connectionResult2 == null) {
                return;
            }
            if (this.f6120n == 1) {
                m8370d();
                return;
            }
            m8359a(connectionResult2);
            this.f6110d.mo7347a();
        } else if (this.f6116j == null || !m8365b(this.f6117k)) {
            ConnectionResult connectionResult3 = this.f6116j;
            if (connectionResult3 != null && (connectionResult = this.f6117k) != null) {
                if (this.f6111e.f6193m < this.f6110d.f6193m) {
                    connectionResult3 = connectionResult;
                }
                m8359a(connectionResult3);
            }
        } else {
            this.f6111e.mo7347a();
            m8359a(this.f6116j);
        }
    }

    /* renamed from: d */
    private final void m8370d() {
        for (C1948m c : this.f6113g) {
            c.mo7468c();
        }
        this.f6113g.clear();
    }

    /* renamed from: e */
    private final boolean m8372e() {
        ConnectionResult connectionResult = this.f6117k;
        return connectionResult != null && connectionResult.mo7213b() == 4;
    }

    /* renamed from: f */
    private final PendingIntent m8373f() {
        if (this.f6114h == null) {
            return null;
        }
        Context context = this.f6107a;
        System.identityHashCode(this.f6108b);
        this.f6114h.mo7299i();
        throw null;
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7346a(T t) {
        if (!m8366b((C1921c<? extends C1874i, ? extends C1850a.C1852b>) t)) {
            return this.f6110d.mo7346a(t);
        }
        if (!m8372e()) {
            return this.f6111e.mo7346a(t);
        }
        t.mo7411c(new Status(4, (String) null, m8373f()));
        return t;
    }

    /* renamed from: a */
    public final void mo7347a() {
        this.f6117k = null;
        this.f6116j = null;
        this.f6120n = 0;
        this.f6110d.mo7347a();
        this.f6111e.mo7347a();
        m8370d();
    }

    /* renamed from: a */
    public final void mo7348a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f6111e.mo7348a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f6110d.mo7348a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: b */
    public final void mo7349b() {
        this.f6110d.mo7349b();
        this.f6111e.mo7349b();
    }

    public final void connect() {
        this.f6120n = 2;
        this.f6118l = false;
        this.f6117k = null;
        this.f6116j = null;
        this.f6110d.connect();
        this.f6111e.connect();
    }

    public final boolean isConnected() {
        this.f6119m.lock();
        try {
            boolean z = true;
            if (!this.f6110d.isConnected() || (!this.f6111e.isConnected() && !m8372e() && this.f6120n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f6119m.unlock();
        }
    }
}
