package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C1870f;
import com.google.android.gms.common.api.C1872g;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.C1976j;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2043r;
import com.google.android.gms.common.internal.C2061y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends C1874i> extends C1870f<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f6080a = new C1882Ca();

    /* renamed from: b */
    private final Object f6081b;

    /* renamed from: c */
    private final C1879a<R> f6082c;

    /* renamed from: d */
    private final WeakReference<GoogleApiClient> f6083d;

    /* renamed from: e */
    private final CountDownLatch f6084e;

    /* renamed from: f */
    private final ArrayList<C1870f.C1871a> f6085f;

    /* renamed from: g */
    private C1976j<? super R> f6086g;

    /* renamed from: h */
    private final AtomicReference<C1965ua> f6087h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public R f6088i;

    /* renamed from: j */
    private Status f6089j;

    /* renamed from: k */
    private volatile boolean f6090k;

    /* renamed from: l */
    private boolean f6091l;

    /* renamed from: m */
    private boolean f6092m;
    @KeepName
    private C1880b mResultGuardian;

    /* renamed from: n */
    private C2043r f6093n;

    /* renamed from: o */
    private volatile C1953oa<R> f6094o;

    /* renamed from: p */
    private boolean f6095p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C1879a<R extends C1874i> extends Handler {
        public C1879a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo7338a(C1976j<? super R> jVar, R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C1976j jVar = (C1976j) pair.first;
                C1874i iVar = (C1874i) pair.second;
                try {
                    jVar.mo7474a(iVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m8328b(iVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo7332b(Status.f6047d);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C1880b {
        private C1880b() {
        }

        /* synthetic */ C1880b(BasePendingResult basePendingResult, C1882Ca ca) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m8328b(BasePendingResult.this.f6088i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f6081b = new Object();
        this.f6084e = new CountDownLatch(1);
        this.f6085f = new ArrayList<>();
        this.f6087h = new AtomicReference<>();
        this.f6095p = false;
        this.f6082c = new C1879a<>(Looper.getMainLooper());
        this.f6083d = new WeakReference<>((Object) null);
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f6081b = new Object();
        this.f6084e = new CountDownLatch(1);
        this.f6085f = new ArrayList<>();
        this.f6087h = new AtomicReference<>();
        this.f6095p = false;
        this.f6082c = new C1879a<>(googleApiClient != null ? googleApiClient.mo7244a() : Looper.getMainLooper());
        this.f6083d = new WeakReference<>(googleApiClient);
    }

    /* renamed from: b */
    public static void m8328b(C1874i iVar) {
        if (iVar instanceof C1872g) {
            try {
                ((C1872g) iVar).mo7319a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: c */
    private final void mo7412c(R r) {
        this.f6088i = r;
        this.f6093n = null;
        this.f6084e.countDown();
        this.f6089j = this.f6088i.mo7269a();
        if (this.f6091l) {
            this.f6086g = null;
        } else if (this.f6086g != null) {
            this.f6082c.removeMessages(2);
            this.f6082c.mo7338a(this.f6086g, mo7413g());
        } else if (this.f6088i instanceof C1872g) {
            this.mResultGuardian = new C1880b(this, (C1882Ca) null);
        }
        ArrayList<C1870f.C1871a> arrayList = this.f6085f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1870f.C1871a aVar = arrayList.get(i);
            i++;
            aVar.mo7318a(this.f6089j);
        }
        this.f6085f.clear();
    }

    /* renamed from: g */
    private final R mo7413g() {
        R r;
        synchronized (this.f6081b) {
            C2061y.m9078b(!this.f6090k, "Result has already been consumed.");
            C2061y.m9078b(mo7334c(), "Result is not ready.");
            r = this.f6088i;
            this.f6088i = null;
            this.f6086g = null;
            this.f6090k = true;
        }
        C1965ua andSet = this.f6087h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo7485a(this);
        }
        return r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo7326a(Status status);

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7327a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6081b
            monitor-enter(r0)
            boolean r1 = r2.f6091l     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027
            boolean r1 = r2.f6090k     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0027
        L_0x000c:
            com.google.android.gms.common.internal.r r1 = r2.f6093n     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.r r1 = r2.f6093n     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f6088i     // Catch:{ all -> 0x0029 }
            m8328b((com.google.android.gms.common.api.C1874i) r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r2.f6091l = r1     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f6048e     // Catch:{ all -> 0x0029 }
            r2.mo7326a((com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x0029 }
            r2.mo7412c(r1)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo7327a():void");
    }

    /* renamed from: a */
    public final void mo7328a(C1870f.C1871a aVar) {
        C2061y.m9074a(aVar != null, (Object) "Callback cannot be null.");
        synchronized (this.f6081b) {
            if (mo7334c()) {
                aVar.mo7318a(this.f6089j);
            } else {
                this.f6085f.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo7329a(R r) {
        synchronized (this.f6081b) {
            if (this.f6092m || this.f6091l) {
                m8328b((C1874i) r);
                return;
            }
            mo7334c();
            boolean z = true;
            C2061y.m9078b(!mo7334c(), "Results have already been set");
            if (this.f6090k) {
                z = false;
            }
            C2061y.m9078b(z, "Result has already been consumed");
            mo7412c(r);
        }
    }

    /* renamed from: a */
    public final void mo7330a(C1965ua uaVar) {
        this.f6087h.set(uaVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7331a(com.google.android.gms.common.api.C1976j<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6081b
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f6086g = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.f6090k     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.C2061y.m9078b(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.oa<R> r1 = r5.f6094o     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C2061y.m9078b(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.mo7333b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.mo7334c()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r5.f6082c     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.i r2 = r5.mo7413g()     // Catch:{ all -> 0x003f }
            r1.mo7338a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f6086g = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo7331a(com.google.android.gms.common.api.j):void");
    }

    /* renamed from: b */
    public final void mo7332b(Status status) {
        synchronized (this.f6081b) {
            if (!mo7334c()) {
                mo7326a(status);
                mo7329a(status);
                this.f6092m = true;
            }
        }
    }

    /* renamed from: b */
    public boolean mo7333b() {
        boolean z;
        synchronized (this.f6081b) {
            z = this.f6091l;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo7334c() {
        return this.f6084e.getCount() == 0;
    }

    /* renamed from: d */
    public final Integer mo7335d() {
        return null;
    }

    /* renamed from: e */
    public final boolean mo7336e() {
        boolean b;
        synchronized (this.f6081b) {
            if (((GoogleApiClient) this.f6083d.get()) == null || !this.f6095p) {
                mo7327a();
            }
            b = mo7333b();
        }
        return b;
    }

    /* renamed from: f */
    public final void mo7337f() {
        this.f6095p = this.f6095p || f6080a.get().booleanValue();
    }
}
