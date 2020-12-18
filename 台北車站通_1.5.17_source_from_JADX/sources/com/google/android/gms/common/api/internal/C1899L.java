package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1991e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1930f;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2033l;
import com.google.android.gms.common.internal.C2061y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.L */
public final class C1899L extends GoogleApiClient implements C1932fa {

    /* renamed from: b */
    private final Lock f6151b;

    /* renamed from: c */
    private boolean f6152c;

    /* renamed from: d */
    private final C2033l f6153d;

    /* renamed from: e */
    private C1929ea f6154e = null;

    /* renamed from: f */
    private final int f6155f;

    /* renamed from: g */
    private final Context f6156g;

    /* renamed from: h */
    private final Looper f6157h;

    /* renamed from: i */
    final Queue<C1921c<?, ?>> f6158i = new LinkedList();

    /* renamed from: j */
    private volatile boolean f6159j;

    /* renamed from: k */
    private long f6160k = 120000;

    /* renamed from: l */
    private long f6161l = 5000;

    /* renamed from: m */
    private final C1905O f6162m;

    /* renamed from: n */
    private final C1991e f6163n;

    /* renamed from: o */
    private C1930f f6164o;

    /* renamed from: p */
    final Map<C1850a.C1853c<?>, C1850a.C1861f> f6165p;

    /* renamed from: q */
    Set<Scope> f6166q = new HashSet();

    /* renamed from: r */
    private final C2025f f6167r;

    /* renamed from: s */
    private final Map<C1850a<?>, Boolean> f6168s;

    /* renamed from: t */
    private final C1850a.C1851a<? extends C5524b, C5525c> f6169t;

    /* renamed from: u */
    private final C1944k f6170u = new C1944k();

    /* renamed from: v */
    private final ArrayList<C1884Da> f6171v;

    /* renamed from: w */
    private Integer f6172w = null;

    /* renamed from: x */
    Set<C1953oa> f6173x = null;

    /* renamed from: y */
    final C1959ra f6174y;

    /* renamed from: z */
    private final C2033l.C2034a f6175z = new C1901M(this);

    public C1899L(Context context, Lock lock, Looper looper, C2025f fVar, C1991e eVar, C1850a.C1851a<? extends C5524b, C5525c> aVar, Map<C1850a<?>, Boolean> map, List<GoogleApiClient.C1848b> list, List<GoogleApiClient.C1849c> list2, Map<C1850a.C1853c<?>, C1850a.C1861f> map2, int i, int i2, ArrayList<C1884Da> arrayList, boolean z) {
        this.f6156g = context;
        this.f6151b = lock;
        this.f6152c = false;
        this.f6153d = new C2033l(looper, this.f6175z);
        this.f6157h = looper;
        this.f6162m = new C1905O(this, looper);
        this.f6163n = eVar;
        this.f6155f = i;
        if (this.f6155f >= 0) {
            this.f6172w = Integer.valueOf(i2);
        }
        this.f6168s = map;
        this.f6165p = map2;
        this.f6171v = arrayList;
        this.f6174y = new C1959ra(this.f6165p);
        for (GoogleApiClient.C1848b a : list) {
            this.f6153d.mo7684a(a);
        }
        for (GoogleApiClient.C1849c a2 : list2) {
            this.f6153d.mo7685a(a2);
        }
        this.f6167r = fVar;
        this.f6169t = aVar;
    }

    /* renamed from: a */
    public static int m8427a(Iterable<C1850a.C1861f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C1850a.C1861f next : iterable) {
            if (next.mo7301j()) {
                z2 = true;
            }
            if (next.mo7293b()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    private final void m8429b(int i) {
        Integer num = this.f6172w;
        if (num == null) {
            this.f6172w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m8431c(i);
            String c2 = m8431c(this.f6172w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f6154e == null) {
            boolean z = false;
            boolean z2 = false;
            for (C1850a.C1861f next : this.f6165p.values()) {
                if (next.mo7301j()) {
                    z = true;
                }
                if (next.mo7293b()) {
                    z2 = true;
                }
            }
            int intValue = this.f6172w.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z) {
                        if (this.f6152c) {
                            this.f6154e = new C1898Ka(this.f6156g, this.f6151b, this.f6157h, this.f6163n, this.f6165p, this.f6167r, this.f6168s, this.f6169t, this.f6171v, this, true);
                            return;
                        }
                        this.f6154e = C1888Fa.m8355a(this.f6156g, this, this.f6151b, this.f6157h, this.f6163n, this.f6165p, this.f6167r, this.f6168s, this.f6169t, this.f6171v);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f6152c || z2) {
                this.f6154e = new C1908S(this.f6156g, this, this.f6151b, this.f6157h, this.f6163n, this.f6165p, this.f6167r, this.f6168s, this.f6169t, this.f6171v, this);
                return;
            }
            this.f6154e = new C1898Ka(this.f6156g, this.f6151b, this.f6157h, this.f6163n, this.f6165p, this.f6167r, this.f6168s, this.f6169t, this.f6171v, this, false);
        }
    }

    /* renamed from: c */
    private static String m8431c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m8432g() {
        this.f6151b.lock();
        try {
            if (this.f6159j) {
                m8433h();
            }
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: h */
    private final void m8433h() {
        this.f6153d.mo7686b();
        this.f6154e.connect();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m8434i() {
        this.f6151b.lock();
        try {
            if (mo7368d()) {
                m8433h();
            }
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: a */
    public final Looper mo7244a() {
        return this.f6157h;
    }

    /* renamed from: a */
    public final <C extends C1850a.C1861f> C mo7245a(C1850a.C1853c<C> cVar) {
        C c = (C1850a.C1861f) this.f6165p.get(cVar);
        C2061y.m9068a(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7246a(T t) {
        C2061y.m9074a(t.mo7414h() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f6165p.containsKey(t.mo7414h());
        String b = t.mo7413g() != null ? t.mo7413g().mo7280b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C2061y.m9074a(containsKey, (Object) sb.toString());
        this.f6151b.lock();
        try {
            if (this.f6154e != null) {
                if (this.f6159j) {
                    this.f6158i.add(t);
                    while (!this.f6158i.isEmpty()) {
                        C1921c remove = this.f6158i.remove();
                        this.f6174y.mo7483a(remove);
                        remove.mo7411c(Status.f6046c);
                    }
                } else {
                    t = this.f6154e.mo7346a(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7366a(int i) {
        this.f6151b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C2061y.m9074a(z, (Object) sb.toString());
            m8429b(i);
            m8433h();
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7353a(int i, boolean z) {
        if (i == 1 && !z && !this.f6159j) {
            this.f6159j = true;
            if (this.f6164o == null) {
                this.f6164o = this.f6163n.mo7533a(this.f6156g.getApplicationContext(), (C1930f.C1931a) new C1906P(this));
            }
            C1905O o = this.f6162m;
            o.sendMessageDelayed(o.obtainMessage(1), this.f6160k);
            C1905O o2 = this.f6162m;
            o2.sendMessageDelayed(o2.obtainMessage(2), this.f6161l);
        }
        this.f6174y.mo7484b();
        this.f6153d.mo7681a(i);
        this.f6153d.mo7680a();
        if (i == 2) {
            m8433h();
        }
    }

    /* renamed from: a */
    public final void mo7354a(Bundle bundle) {
        while (!this.f6158i.isEmpty()) {
            mo7246a(this.f6158i.remove());
        }
        this.f6153d.mo7682a(bundle);
    }

    /* renamed from: a */
    public final void mo7355a(ConnectionResult connectionResult) {
        if (!this.f6163n.mo7539b(this.f6156g, connectionResult.mo7213b())) {
            mo7368d();
        }
        if (!this.f6159j) {
            this.f6153d.mo7683a(connectionResult);
            this.f6153d.mo7680a();
        }
    }

    /* renamed from: a */
    public final void mo7247a(GoogleApiClient.C1848b bVar) {
        this.f6153d.mo7684a(bVar);
    }

    /* renamed from: a */
    public final void mo7248a(GoogleApiClient.C1849c cVar) {
        this.f6153d.mo7685a(cVar);
    }

    /* renamed from: a */
    public final void mo7249a(C1953oa oaVar) {
        String str;
        Exception exc;
        this.f6151b.lock();
        try {
            if (this.f6173x == null) {
                str = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (!this.f6173x.remove(oaVar)) {
                str = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            } else {
                if (!mo7369e()) {
                    this.f6154e.mo7349b();
                }
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7367a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f6156g);
        printWriter.append(str).append("mResuming=").print(this.f6159j);
        printWriter.append(" mWorkQueue.size()=").print(this.f6158i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f6174y.f6302c.size());
        C1929ea eaVar = this.f6154e;
        if (eaVar != null) {
            eaVar.mo7348a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: b */
    public final void mo7250b(GoogleApiClient.C1848b bVar) {
        this.f6153d.mo7687b(bVar);
    }

    /* renamed from: b */
    public final void mo7251b(GoogleApiClient.C1849c cVar) {
        this.f6153d.mo7688b(cVar);
    }

    /* renamed from: b */
    public final boolean mo7252b() {
        C1929ea eaVar = this.f6154e;
        return eaVar != null && eaVar.isConnected();
    }

    public final void connect() {
        this.f6151b.lock();
        try {
            boolean z = false;
            if (this.f6155f >= 0) {
                if (this.f6172w != null) {
                    z = true;
                }
                C2061y.m9078b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f6172w == null) {
                this.f6172w = Integer.valueOf(m8427a((Iterable<C1850a.C1861f>) this.f6165p.values(), false));
            } else if (this.f6172w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo7366a(this.f6172w.intValue());
        } finally {
            this.f6151b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo7368d() {
        if (!this.f6159j) {
            return false;
        }
        this.f6159j = false;
        this.f6162m.removeMessages(2);
        this.f6162m.removeMessages(1);
        C1930f fVar = this.f6164o;
        if (fVar != null) {
            fVar.mo7447a();
            this.f6164o = null;
        }
        return true;
    }

    public final void disconnect() {
        this.f6151b.lock();
        try {
            this.f6174y.mo7482a();
            if (this.f6154e != null) {
                this.f6154e.mo7347a();
            }
            this.f6170u.mo7463a();
            for (C1921c cVar : this.f6158i) {
                cVar.mo7330a((C1965ua) null);
                cVar.mo7327a();
            }
            this.f6158i.clear();
            if (this.f6154e != null) {
                mo7368d();
                this.f6153d.mo7680a();
            }
        } finally {
            this.f6151b.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo7369e() {
        this.f6151b.lock();
        try {
            if (this.f6173x == null) {
                this.f6151b.unlock();
                return false;
            }
            boolean z = !this.f6173x.isEmpty();
            this.f6151b.unlock();
            return z;
        } catch (Throwable th) {
            this.f6151b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo7370f() {
        StringWriter stringWriter = new StringWriter();
        mo7367a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
