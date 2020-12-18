package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1868d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2050t;
import com.google.android.gms.common.internal.C2052u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C2011d<T extends IInterface> {

    /* renamed from: a */
    private static final Feature[] f6426a = new Feature[0];

    /* renamed from: b */
    public static final String[] f6427b = {"service_esmobile", "service_googleme"};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f6428A;

    /* renamed from: B */
    private volatile ConnectionInfo f6429B;

    /* renamed from: C */
    protected AtomicInteger f6430C;

    /* renamed from: c */
    private int f6431c;

    /* renamed from: d */
    private long f6432d;

    /* renamed from: e */
    private long f6433e;

    /* renamed from: f */
    private int f6434f;

    /* renamed from: g */
    private long f6435g;

    /* renamed from: h */
    private C2038o f6436h;

    /* renamed from: i */
    private final Context f6437i;

    /* renamed from: j */
    private final Looper f6438j;

    /* renamed from: k */
    private final C2035m f6439k;

    /* renamed from: l */
    private final C1993f f6440l;

    /* renamed from: m */
    final Handler f6441m;

    /* renamed from: n */
    private final Object f6442n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Object f6443o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2052u f6444p;

    /* renamed from: q */
    protected C2015d f6445q;

    /* renamed from: r */
    private T f6446r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ArrayList<C2011d<T>.c<?>> f6447s;

    /* renamed from: t */
    private C2011d<T>.f f6448t;

    /* renamed from: u */
    private int f6449u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C2012a f6450v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C2013b f6451w;

    /* renamed from: x */
    private final int f6452x;

    /* renamed from: y */
    private final String f6453y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ConnectionResult f6454z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public interface C2012a {
        /* renamed from: f */
        void mo7570f(int i);

        /* renamed from: j */
        void mo7571j(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public interface C2013b {
        /* renamed from: a */
        void mo7572a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    protected abstract class C2014c<TListener> {

        /* renamed from: a */
        private TListener f6455a;

        /* renamed from: b */
        private boolean f6456b = false;

        public C2014c(TListener tlistener) {
            this.f6455a = tlistener;
        }

        /* renamed from: a */
        public void mo7643a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6455a;
                if (this.f6456b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo7644a(tlistener);
                } catch (RuntimeException e) {
                    mo7645b();
                    throw e;
                }
            } else {
                mo7645b();
            }
            synchronized (this) {
                this.f6456b = true;
            }
            mo7647d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo7644a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo7645b();

        /* renamed from: c */
        public void mo7646c() {
            synchronized (this) {
                this.f6455a = null;
            }
        }

        /* renamed from: d */
        public void mo7647d() {
            mo7646c();
            synchronized (C2011d.this.f6447s) {
                C2011d.this.f6447s.remove(this);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    public interface C2015d {
        /* renamed from: a */
        void mo7324a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    public static final class C2016e extends C2050t.C2051a {

        /* renamed from: a */
        private C2011d f6458a;

        /* renamed from: b */
        private final int f6459b;

        public C2016e(C2011d dVar, int i) {
            this.f6458a = dVar;
            this.f6459b = i;
        }

        /* renamed from: a */
        public final void mo7648a(int i, IBinder iBinder, Bundle bundle) {
            C2061y.m9068a(this.f6458a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6458a.mo7611a(i, iBinder, bundle, this.f6459b);
            this.f6458a = null;
        }

        /* renamed from: a */
        public final void mo7649a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
            C2061y.m9068a(this.f6458a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C2061y.m9067a(connectionInfo);
            this.f6458a.m8849a(connectionInfo);
            mo7648a(i, iBinder, connectionInfo.mo7567c());
        }

        /* renamed from: c */
        public final void mo7650c(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    public final class C2017f implements ServiceConnection {

        /* renamed from: a */
        private final int f6460a;

        public C2017f(int i) {
            this.f6460a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                C2011d.this.m8857c(16);
                return;
            }
            synchronized (C2011d.this.f6443o) {
                C2052u unused = C2011d.this.f6444p = C2052u.C2053a.m9055a(iBinder);
            }
            C2011d.this.mo7610a(0, (Bundle) null, this.f6460a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C2011d.this.f6443o) {
                C2052u unused = C2011d.this.f6444p = null;
            }
            Handler handler = C2011d.this.f6441m;
            handler.sendMessage(handler.obtainMessage(6, this.f6460a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$g */
    protected class C2018g implements C2015d {
        public C2018g() {
        }

        /* renamed from: a */
        public void mo7324a(ConnectionResult connectionResult) {
            if (connectionResult.mo7218f()) {
                C2011d dVar = C2011d.this;
                dVar.mo7617a((C2040q) null, dVar.mo7640w());
            } else if (C2011d.this.f6451w != null) {
                C2011d.this.f6451w.mo7572a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    protected final class C2019h extends C2022k {

        /* renamed from: g */
        public final IBinder f6463g;

        public C2019h(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6463g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7653a(ConnectionResult connectionResult) {
            if (C2011d.this.f6451w != null) {
                C2011d.this.f6451w.mo7572a(connectionResult);
            }
            C2011d.this.mo7613a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo7654e() {
            try {
                String interfaceDescriptor = this.f6463g.getInterfaceDescriptor();
                if (!C2011d.this.mo7560z().equals(interfaceDescriptor)) {
                    String z = C2011d.this.mo7560z();
                    StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(z);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a = C2011d.this.mo7558a(this.f6463g);
                if (a == null || (!C2011d.this.m8853a(2, 4, a) && !C2011d.this.m8853a(3, 4, a))) {
                    return false;
                }
                ConnectionResult unused = C2011d.this.f6454z = null;
                Bundle l = C2011d.this.mo7629l();
                if (C2011d.this.f6450v == null) {
                    return true;
                }
                C2011d.this.f6450v.mo7571j(l);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$i */
    protected final class C2020i extends C2022k {
        public C2020i(int i, Bundle bundle) {
            super(i, bundle);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7653a(ConnectionResult connectionResult) {
            C2011d.this.f6445q.mo7324a(connectionResult);
            C2011d.this.mo7613a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo7654e() {
            C2011d.this.f6445q.mo7324a(ConnectionResult.f6007a);
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$j */
    public interface C2021j {
        /* renamed from: a */
        void mo7393a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$k */
    private abstract class C2022k extends C2011d<T>.c<Boolean> {

        /* renamed from: d */
        public final int f6466d;

        /* renamed from: e */
        public final Bundle f6467e;

        protected C2022k(int i, Bundle bundle) {
            super(true);
            this.f6466d = i;
            this.f6467e = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo7653a(ConnectionResult connectionResult);

        /* JADX WARNING: type inference failed for: r4v10, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7644a(java.lang.Boolean r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                if (r4 != 0) goto L_0x000a
                com.google.android.gms.common.internal.d r4 = com.google.android.gms.common.internal.C2011d.this
                r4.m8855b(r0, null)
                return
            L_0x000a:
                int r4 = r3.f6466d
                if (r4 == 0) goto L_0x003c
                r2 = 10
                if (r4 == r2) goto L_0x002f
                com.google.android.gms.common.internal.d r4 = com.google.android.gms.common.internal.C2011d.this
                r4.m8855b(r0, null)
                android.os.Bundle r4 = r3.f6467e
                if (r4 == 0) goto L_0x0024
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r4 = r4.getParcelable(r0)
                r1 = r4
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0024:
                com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
                int r0 = r3.f6466d
                r4.<init>(r0, r1)
                r3.mo7653a((com.google.android.gms.common.ConnectionResult) r4)
                goto L_0x0051
            L_0x002f:
                com.google.android.gms.common.internal.d r4 = com.google.android.gms.common.internal.C2011d.this
                r4.m8855b(r0, null)
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "A fatal developer error has occurred. Check the logs for further information."
                r4.<init>(r0)
                throw r4
            L_0x003c:
                boolean r4 = r3.mo7654e()
                if (r4 != 0) goto L_0x0051
                com.google.android.gms.common.internal.d r4 = com.google.android.gms.common.internal.C2011d.this
                r4.m8855b(r0, null)
                com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r4.<init>(r0, r1)
                r3.mo7653a((com.google.android.gms.common.ConnectionResult) r4)
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C2011d.C2022k.mo7644a(java.lang.Boolean):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo7645b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract boolean mo7654e();
    }

    /* renamed from: com.google.android.gms.common.internal.d$l */
    final class C2023l extends Handler {
        public C2023l(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m8927a(Message message) {
            C2014c cVar = (C2014c) message.obj;
            cVar.mo7645b();
            cVar.mo7647d();
        }

        /* renamed from: b */
        private static boolean m8928b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f6430C
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = m8928b(r8)
                if (r0 == 0) goto L_0x0015
                m8927a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x0024
                r4 = 7
                if (r0 == r4) goto L_0x0024
                if (r0 == r1) goto L_0x0024
                if (r0 != r3) goto L_0x0030
            L_0x0024:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                boolean r0 = r0.mo7621d()
                if (r0 != 0) goto L_0x0030
                m8927a(r8)
                return
            L_0x0030:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x007b
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.ConnectionResult unused = r0.f6454z = r1
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                boolean r8 = r8.m8845E()
                if (r8 == 0) goto L_0x005a
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                boolean r8 = r8.f6428A
                if (r8 != 0) goto L_0x005a
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                r8.m8855b(r5, null)
                return
            L_0x005a:
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f6454z
                if (r8 == 0) goto L_0x0069
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f6454z
                goto L_0x006e
            L_0x0069:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x006e:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.internal.d$d r0 = r0.f6445q
                r0.mo7324a(r8)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                r0.mo7613a((com.google.android.gms.common.ConnectionResult) r8)
                return
            L_0x007b:
                if (r0 != r3) goto L_0x009e
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f6454z
                if (r8 == 0) goto L_0x008c
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f6454z
                goto L_0x0091
            L_0x008c:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0091:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.internal.d$d r0 = r0.f6445q
                r0.mo7324a(r8)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                r0.mo7613a((com.google.android.gms.common.ConnectionResult) r8)
                return
            L_0x009e:
                if (r0 != r5) goto L_0x00bd
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a9
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00a9:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.internal.d$d r8 = r8.f6445q
                r8.mo7324a(r0)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                r8.mo7613a((com.google.android.gms.common.ConnectionResult) r0)
                return
            L_0x00bd:
                r1 = 6
                if (r0 != r1) goto L_0x00e5
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                r0.m8855b(r3, null)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.internal.d$a r0 = r0.f6450v
                if (r0 == 0) goto L_0x00d8
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                com.google.android.gms.common.internal.d$a r0 = r0.f6450v
                int r1 = r8.arg2
                r0.mo7570f(r1)
            L_0x00d8:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                int r8 = r8.arg2
                r0.mo7609a((int) r8)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C2011d.this
                boolean unused = r8.m8853a((int) r3, (int) r2, r6)
                return
            L_0x00e5:
                r1 = 2
                if (r0 != r1) goto L_0x00f4
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C2011d.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x00f4
                m8927a(r8)
                return
            L_0x00f4:
                boolean r0 = m8928b(r8)
                if (r0 == 0) goto L_0x0102
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.d$c r8 = (com.google.android.gms.common.internal.C2011d.C2014c) r8
                r8.mo7643a()
                return
            L_0x0102:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C2011d.C2023l.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C2011d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C2011d.C2012a r13, com.google.android.gms.common.internal.C2011d.C2013b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.m r3 = com.google.android.gms.common.internal.C2035m.m8974a(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.C1993f.m8774a()
            com.google.android.gms.common.internal.C2061y.m9067a(r13)
            r6 = r13
            com.google.android.gms.common.internal.d$a r6 = (com.google.android.gms.common.internal.C2011d.C2012a) r6
            com.google.android.gms.common.internal.C2061y.m9067a(r14)
            r7 = r14
            com.google.android.gms.common.internal.d$b r7 = (com.google.android.gms.common.internal.C2011d.C2013b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C2011d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    protected C2011d(Context context, Looper looper, C2035m mVar, C1993f fVar, int i, C2012a aVar, C2013b bVar, String str) {
        this.f6442n = new Object();
        this.f6443o = new Object();
        this.f6447s = new ArrayList<>();
        this.f6449u = 1;
        this.f6454z = null;
        this.f6428A = false;
        this.f6429B = null;
        this.f6430C = new AtomicInteger(0);
        C2061y.m9068a(context, (Object) "Context must not be null");
        this.f6437i = context;
        C2061y.m9068a(looper, (Object) "Looper must not be null");
        this.f6438j = looper;
        C2061y.m9068a(mVar, (Object) "Supervisor must not be null");
        this.f6439k = mVar;
        C2061y.m9068a(fVar, (Object) "API availability must not be null");
        this.f6440l = fVar;
        this.f6441m = new C2023l(looper);
        this.f6452x = i;
        this.f6450v = aVar;
        this.f6451w = bVar;
        this.f6453y = str;
    }

    /* renamed from: D */
    private final boolean mo7557D() {
        boolean z;
        synchronized (this.f6442n) {
            z = this.f6449u == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final boolean m8845E() {
        if (this.f6428A || TextUtils.isEmpty(mo7560z()) || TextUtils.isEmpty(mo7637t())) {
            return false;
        }
        try {
            Class.forName(mo7560z());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8849a(ConnectionInfo connectionInfo) {
        this.f6429B = connectionInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8853a(int i, int i2, T t) {
        synchronized (this.f6442n) {
            if (this.f6449u != i) {
                return false;
            }
            m8855b(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m8855b(int i, T t) {
        C2061y.m9073a((i == 4) == (t != null));
        synchronized (this.f6442n) {
            this.f6449u = i;
            this.f6446r = t;
            mo7559a(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f6448t == null || this.f6436h == null)) {
                        String c = this.f6436h.mo7701c();
                        String b = this.f6436h.mo7700b();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(b).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(b);
                        Log.e("GmsClient", sb.toString());
                        this.f6439k.mo7691b(this.f6436h.mo7701c(), this.f6436h.mo7700b(), this.f6436h.mo7699a(), this.f6448t, mo7638u());
                        this.f6430C.incrementAndGet();
                    }
                    this.f6448t = new C2017f(this.f6430C.get());
                    this.f6436h = (this.f6449u != 3 || mo7637t() == null) ? new C2038o(mo7606B(), mo7556A(), false, mo7642y()) : new C2038o(mo7635r().getPackageName(), mo7637t(), true, mo7642y());
                    if (!this.f6439k.mo7690a(this.f6436h.mo7701c(), this.f6436h.mo7700b(), this.f6436h.mo7699a(), this.f6448t, mo7638u())) {
                        String c2 = this.f6436h.mo7701c();
                        String b2 = this.f6436h.mo7700b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        mo7610a(16, (Bundle) null, this.f6430C.get());
                    }
                } else if (i == 4) {
                    mo7612a(t);
                }
            } else if (this.f6448t != null) {
                this.f6439k.mo7691b(mo7556A(), mo7606B(), mo7642y(), this.f6448t, mo7638u());
                this.f6448t = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8857c(int i) {
        int i2;
        if (mo7557D()) {
            i2 = 5;
            this.f6428A = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f6441m;
        handler.sendMessage(handler.obtainMessage(i2, this.f6430C.get(), 16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract String mo7556A();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo7606B() {
        return "com.google.android.gms";
    }

    /* renamed from: C */
    public boolean mo7607C() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo7558a(IBinder iBinder);

    /* renamed from: a */
    public void mo7608a() {
        this.f6430C.incrementAndGet();
        synchronized (this.f6447s) {
            int size = this.f6447s.size();
            for (int i = 0; i < size; i++) {
                this.f6447s.get(i).mo7646c();
            }
            this.f6447s.clear();
        }
        synchronized (this.f6443o) {
            this.f6444p = null;
        }
        m8855b(1, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7609a(int i) {
        this.f6431c = i;
        this.f6432d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7610a(int i, Bundle bundle, int i2) {
        Handler handler = this.f6441m;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2020i(i, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7611a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f6441m;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2019h(i, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7559a(int i, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7612a(T t) {
        this.f6433e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7613a(ConnectionResult connectionResult) {
        this.f6434f = connectionResult.mo7213b();
        this.f6435g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo7614a(C2015d dVar) {
        C2061y.m9068a(dVar, (Object) "Connection progress callbacks cannot be null.");
        this.f6445q = dVar;
        m8855b(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7615a(C2015d dVar, int i, PendingIntent pendingIntent) {
        C2061y.m9068a(dVar, (Object) "Connection progress callbacks cannot be null.");
        this.f6445q = dVar;
        Handler handler = this.f6441m;
        handler.sendMessage(handler.obtainMessage(3, this.f6430C.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public void mo7616a(C2021j jVar) {
        jVar.mo7393a();
    }

    /* renamed from: a */
    public void mo7617a(C2040q qVar, Set<Scope> set) {
        Bundle s = mo7636s();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f6452x);
        getServiceRequest.mo7576a(this.f6437i.getPackageName());
        getServiceRequest.mo7574a(s);
        if (set != null) {
            getServiceRequest.mo7577a((Collection<Scope>) set);
        }
        if (mo7627j()) {
            getServiceRequest.mo7573a(mo7633p());
            getServiceRequest.mo7575a(qVar);
        } else if (mo7607C()) {
            getServiceRequest.mo7573a(mo7632o());
        }
        getServiceRequest.mo7579b(mo7639v());
        getServiceRequest.mo7578a(mo7634q());
        try {
            synchronized (this.f6443o) {
                if (this.f6444p != null) {
                    this.f6444p.mo7708a(new C2016e(this, this.f6430C.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo7619b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo7611a(8, (IBinder) null, (Bundle) null, this.f6430C.get());
        }
    }

    /* renamed from: a */
    public void mo7618a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C2052u uVar;
        synchronized (this.f6442n) {
            i = this.f6449u;
            t = this.f6446r;
        }
        synchronized (this.f6443o) {
            uVar = this.f6444p;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo7560z()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (uVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(uVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f6433e > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f6433e;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f6432d > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f6431c;
            printWriter.append(i2 != 1 ? i2 != 2 ? String.valueOf(i2) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f6432d;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f6435g > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C1868d.m8308a(this.f6434f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f6435g;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: b */
    public void mo7619b(int i) {
        Handler handler = this.f6441m;
        handler.sendMessage(handler.obtainMessage(6, this.f6430C.get(), i));
    }

    /* renamed from: b */
    public boolean mo7620b() {
        return false;
    }

    /* renamed from: d */
    public boolean mo7621d() {
        boolean z;
        synchronized (this.f6442n) {
            if (this.f6449u != 2) {
                if (this.f6449u != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public String mo7622e() {
        C2038o oVar;
        if (isConnected() && (oVar = this.f6436h) != null) {
            return oVar.mo7700b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: f */
    public boolean mo7623f() {
        return true;
    }

    /* renamed from: g */
    public int mo7297g() {
        return C1993f.f6371a;
    }

    /* renamed from: h */
    public final Feature[] mo7624h() {
        ConnectionInfo connectionInfo = this.f6429B;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.mo7566b();
    }

    /* renamed from: i */
    public Intent mo7625i() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f6442n) {
            z = this.f6449u == 4;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo7627j() {
        return false;
    }

    /* renamed from: k */
    public IBinder mo7628k() {
        synchronized (this.f6443o) {
            if (this.f6444p == null) {
                return null;
            }
            IBinder asBinder = this.f6444p.asBinder();
            return asBinder;
        }
    }

    /* renamed from: l */
    public Bundle mo7629l() {
        return null;
    }

    /* renamed from: m */
    public void mo7630m() {
        int a = this.f6440l.mo7526a(this.f6437i, mo7297g());
        if (a != 0) {
            m8855b(1, (IInterface) null);
            mo7615a((C2015d) new C2018g(), a, (PendingIntent) null);
            return;
        }
        mo7614a((C2015d) new C2018g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo7631n() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: o */
    public Account mo7632o() {
        return null;
    }

    /* renamed from: p */
    public final Account mo7633p() {
        return mo7632o() != null ? mo7632o() : new Account("<<default account>>", "com.google");
    }

    /* renamed from: q */
    public Feature[] mo7634q() {
        return f6426a;
    }

    /* renamed from: r */
    public final Context mo7635r() {
        return this.f6437i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo7636s() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo7637t() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo7638u() {
        String str = this.f6453y;
        return str == null ? this.f6437i.getClass().getName() : str;
    }

    /* renamed from: v */
    public Feature[] mo7639v() {
        return f6426a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Set<Scope> mo7640w() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: x */
    public final T mo7641x() {
        T t;
        synchronized (this.f6442n) {
            if (this.f6449u != 5) {
                mo7631n();
                C2061y.m9078b(this.f6446r != null, "Client is connected but service is null");
                t = this.f6446r;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo7642y() {
        return 129;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract String mo7560z();
}
