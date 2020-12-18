package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1991e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1869e;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.C1980n;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1918b;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.common.internal.C1999B;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2039p;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2080b;
import com.google.android.gms.common.util.C2092n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p028h.p039h.C1082d;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p144g.C5536g;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.e */
public class C1925e implements Handler.Callback {

    /* renamed from: a */
    public static final Status f6216a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f6217b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f6218c = new Object();

    /* renamed from: d */
    private static C1925e f6219d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f6220e = 5000;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f6221f = 120000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f6222g = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f6223h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1991e f6224i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2039p f6225j;

    /* renamed from: k */
    private final AtomicInteger f6226k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f6227l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C1973ya<?>, C1926a<?>> f6228m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1962t f6229n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Set<C1973ya<?>> f6230o = new C1082d();

    /* renamed from: p */
    private final Set<C1973ya<?>> f6231p = new C1082d();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f6232q;

    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public class C1926a<O extends C1850a.C1854d> implements GoogleApiClient.C1848b, GoogleApiClient.C1849c, C1886Ea {

        /* renamed from: a */
        private final Queue<C1903N> f6233a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1850a.C1861f f6234b;

        /* renamed from: c */
        private final C1850a.C1852b f6235c;

        /* renamed from: d */
        private final C1973ya<O> f6236d;

        /* renamed from: e */
        private final C1956q f6237e;

        /* renamed from: f */
        private final Set<C1876Aa> f6238f = new HashSet();

        /* renamed from: g */
        private final Map<C1939j.C1940a<?>, C1936ha> f6239g = new HashMap();

        /* renamed from: h */
        private final int f6240h;

        /* renamed from: i */
        private final C1943ja f6241i;

        /* renamed from: j */
        private boolean f6242j;

        /* renamed from: k */
        private final List<C1927b> f6243k = new ArrayList();

        /* renamed from: l */
        private ConnectionResult f6244l = null;

        public C1926a(C1869e<O> eVar) {
            this.f6234b = eVar.mo7310a(C1925e.this.f6232q.getLooper(), (C1926a<O>) this);
            C1850a.C1852b bVar = this.f6234b;
            this.f6235c = bVar instanceof C1999B ? ((C1999B) bVar).mo7557D() : bVar;
            this.f6236d = eVar.mo7317e();
            this.f6237e = new C1956q();
            this.f6240h = eVar.mo7315c();
            if (this.f6234b.mo7301j()) {
                this.f6241i = eVar.mo7312a(C1925e.this.f6223h, C1925e.this.f6232q);
            } else {
                this.f6241i = null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8533a(C1927b bVar) {
            if (!this.f6243k.contains(bVar) || this.f6242j) {
                return;
            }
            if (!this.f6234b.isConnected()) {
                mo7425a();
            } else {
                m8546p();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m8535a(boolean z) {
            C2061y.m9071a(C1925e.this.f6232q);
            if (!this.f6234b.isConnected() || this.f6239g.size() != 0) {
                return false;
            }
            if (this.f6237e.mo7479a()) {
                if (z) {
                    m8548r();
                }
                return false;
            }
            this.f6234b.mo7288a();
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m8538b(C1927b bVar) {
            Feature[] a;
            if (this.f6243k.remove(bVar)) {
                C1925e.this.f6232q.removeMessages(15, bVar);
                C1925e.this.f6232q.removeMessages(16, bVar);
                Feature b = bVar.f6247b;
                ArrayList arrayList = new ArrayList(this.f6233a.size());
                for (C1903N n : this.f6233a) {
                    if ((n instanceof C1969wa) && (a = ((C1969wa) n).mo7490a()) != null && C2080b.m9104a((T[]) a, b)) {
                        arrayList.add(n);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C1903N n2 = (C1903N) obj;
                    this.f6233a.remove(n2);
                    n2.mo7377a((RuntimeException) new C1980n(b));
                }
            }
        }

        /* renamed from: b */
        private final boolean m8539b(C1903N n) {
            if (!(n instanceof C1969wa)) {
                m8541c(n);
                return true;
            }
            C1969wa waVar = (C1969wa) n;
            Feature[] a = waVar.mo7490a();
            if (a == null || a.length == 0) {
                m8541c(n);
                return true;
            }
            Feature[] h = this.f6234b.mo7298h();
            if (h == null) {
                h = new Feature[0];
            }
            C1080b bVar = new C1080b(h.length);
            for (Feature feature : h) {
                bVar.put(feature.mo7222b(), Long.valueOf(feature.mo7223c()));
            }
            for (Feature feature2 : a) {
                if (!bVar.containsKey(feature2.mo7222b()) || ((Long) bVar.get(feature2.mo7222b())).longValue() < feature2.mo7223c()) {
                    if (waVar.mo7491b()) {
                        C1927b bVar2 = new C1927b(this.f6236d, feature2, (C1912W) null);
                        int indexOf = this.f6243k.indexOf(bVar2);
                        if (indexOf >= 0) {
                            C1927b bVar3 = this.f6243k.get(indexOf);
                            C1925e.this.f6232q.removeMessages(15, bVar3);
                            C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 15, bVar3), C1925e.this.f6220e);
                        } else {
                            this.f6243k.add(bVar2);
                            C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 15, bVar2), C1925e.this.f6220e);
                            C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 16, bVar2), C1925e.this.f6221f);
                            ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                            if (!m8542c(connectionResult)) {
                                C1925e.this.mo7422b(connectionResult, this.f6240h);
                            }
                        }
                    } else {
                        waVar.mo7377a((RuntimeException) new C1980n(feature2));
                    }
                    return false;
                }
                this.f6243k.remove(new C1927b(this.f6236d, feature2, (C1912W) null));
            }
            m8541c(n);
            return true;
        }

        /* renamed from: c */
        private final void m8541c(C1903N n) {
            n.mo7376a(this.f6237e, mo7432d());
            try {
                n.mo7375a((C1926a<?>) this);
            } catch (DeadObjectException unused) {
                mo7261f(1);
                this.f6234b.mo7288a();
            }
        }

        /* renamed from: c */
        private final boolean m8542c(ConnectionResult connectionResult) {
            synchronized (C1925e.f6218c) {
                if (C1925e.this.f6229n == null || !C1925e.this.f6230o.contains(this.f6236d)) {
                    return false;
                }
                C1925e.this.f6229n.mo7325a(connectionResult, this.f6240h);
                return true;
            }
        }

        /* renamed from: d */
        private final void m8543d(ConnectionResult connectionResult) {
            for (C1876Aa next : this.f6238f) {
                String str = null;
                if (C2059x.m9064a(connectionResult, ConnectionResult.f6007a)) {
                    str = this.f6234b.mo7295e();
                }
                next.mo7322a(this.f6236d, connectionResult, str);
            }
            this.f6238f.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m8544n() {
            mo7438j();
            m8543d(ConnectionResult.f6007a);
            m8547q();
            for (C1936ha haVar : this.f6239g.values()) {
                try {
                    haVar.f6265a.mo7466a(this.f6235c, new C5537h());
                } catch (DeadObjectException unused) {
                    mo7261f(1);
                    this.f6234b.mo7288a();
                } catch (RemoteException unused2) {
                }
            }
            m8546p();
            m8548r();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m8545o() {
            mo7438j();
            this.f6242j = true;
            this.f6237e.mo7481c();
            C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 9, this.f6236d), C1925e.this.f6220e);
            C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 11, this.f6236d), C1925e.this.f6221f);
            C1925e.this.f6225j.mo7703a();
        }

        /* renamed from: p */
        private final void m8546p() {
            ArrayList arrayList = new ArrayList(this.f6233a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1903N n = (C1903N) obj;
                if (!this.f6234b.isConnected()) {
                    return;
                }
                if (m8539b(n)) {
                    this.f6233a.remove(n);
                }
            }
        }

        /* renamed from: q */
        private final void m8547q() {
            if (this.f6242j) {
                C1925e.this.f6232q.removeMessages(11, this.f6236d);
                C1925e.this.f6232q.removeMessages(9, this.f6236d);
                this.f6242j = false;
            }
        }

        /* renamed from: r */
        private final void m8548r() {
            C1925e.this.f6232q.removeMessages(12, this.f6236d);
            C1925e.this.f6232q.sendMessageDelayed(C1925e.this.f6232q.obtainMessage(12, this.f6236d), C1925e.this.f6222g);
        }

        /* renamed from: a */
        public final void mo7425a() {
            C2061y.m9071a(C1925e.this.f6232q);
            if (!this.f6234b.isConnected() && !this.f6234b.mo7294d()) {
                int a = C1925e.this.f6225j.mo7702a(C1925e.this.f6223h, this.f6234b);
                if (a != 0) {
                    mo7263a(new ConnectionResult(a, (PendingIntent) null));
                    return;
                }
                C1928c cVar = new C1928c(this.f6234b, this.f6236d);
                if (this.f6234b.mo7301j()) {
                    this.f6241i.mo7462a((C1951na) cVar);
                }
                this.f6234b.mo7289a((C2011d.C2015d) cVar);
            }
        }

        /* renamed from: a */
        public final void mo7263a(ConnectionResult connectionResult) {
            C2061y.m9071a(C1925e.this.f6232q);
            C1943ja jaVar = this.f6241i;
            if (jaVar != null) {
                jaVar.mo7461Ya();
            }
            mo7438j();
            C1925e.this.f6225j.mo7703a();
            m8543d(connectionResult);
            if (connectionResult.mo7213b() == 4) {
                mo7426a(C1925e.f6217b);
            } else if (this.f6233a.isEmpty()) {
                this.f6244l = connectionResult;
            } else if (!m8542c(connectionResult) && !C1925e.this.mo7422b(connectionResult, this.f6240h)) {
                if (connectionResult.mo7213b() == 18) {
                    this.f6242j = true;
                }
                if (this.f6242j) {
                    C1925e.this.f6232q.sendMessageDelayed(Message.obtain(C1925e.this.f6232q, 9, this.f6236d), C1925e.this.f6220e);
                    return;
                }
                String a = this.f6236d.mo7492a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                mo7426a(new Status(17, sb.toString()));
            }
        }

        /* renamed from: a */
        public final void mo7345a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z) {
            if (Looper.myLooper() == C1925e.this.f6232q.getLooper()) {
                mo7263a(connectionResult);
            } else {
                C1925e.this.f6232q.post(new C1915Z(this, connectionResult));
            }
        }

        /* renamed from: a */
        public final void mo7426a(Status status) {
            C2061y.m9071a(C1925e.this.f6232q);
            for (C1903N a : this.f6233a) {
                a.mo7374a(status);
            }
            this.f6233a.clear();
        }

        /* renamed from: a */
        public final void mo7427a(C1876Aa aa) {
            C2061y.m9071a(C1925e.this.f6232q);
            this.f6238f.add(aa);
        }

        /* renamed from: a */
        public final void mo7428a(C1903N n) {
            C2061y.m9071a(C1925e.this.f6232q);
            if (!this.f6234b.isConnected()) {
                this.f6233a.add(n);
                ConnectionResult connectionResult = this.f6244l;
                if (connectionResult == null || !connectionResult.mo7216e()) {
                    mo7425a();
                } else {
                    mo7263a(this.f6244l);
                }
            } else if (m8539b(n)) {
                m8548r();
            } else {
                this.f6233a.add(n);
            }
        }

        /* renamed from: b */
        public final int mo7429b() {
            return this.f6240h;
        }

        /* renamed from: b */
        public final void mo7430b(ConnectionResult connectionResult) {
            C2061y.m9071a(C1925e.this.f6232q);
            this.f6234b.mo7288a();
            mo7263a(connectionResult);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo7431c() {
            return this.f6234b.isConnected();
        }

        /* renamed from: d */
        public final boolean mo7432d() {
            return this.f6234b.mo7301j();
        }

        /* renamed from: e */
        public final void mo7433e() {
            C2061y.m9071a(C1925e.this.f6232q);
            if (this.f6242j) {
                mo7425a();
            }
        }

        /* renamed from: f */
        public final C1850a.C1861f mo7434f() {
            return this.f6234b;
        }

        /* renamed from: f */
        public final void mo7261f(int i) {
            if (Looper.myLooper() == C1925e.this.f6232q.getLooper()) {
                m8545o();
            } else {
                C1925e.this.f6232q.post(new C1914Y(this));
            }
        }

        /* renamed from: g */
        public final void mo7435g() {
            C2061y.m9071a(C1925e.this.f6232q);
            if (this.f6242j) {
                m8547q();
                mo7426a(C1925e.this.f6224i.mo7540c(C1925e.this.f6223h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f6234b.mo7288a();
            }
        }

        /* renamed from: h */
        public final void mo7436h() {
            C2061y.m9071a(C1925e.this.f6232q);
            mo7426a(C1925e.f6216a);
            this.f6237e.mo7480b();
            for (C1939j.C1940a xaVar : (C1939j.C1940a[]) this.f6239g.keySet().toArray(new C1939j.C1940a[this.f6239g.size()])) {
                mo7428a((C1903N) new C1971xa(xaVar, new C5537h()));
            }
            m8543d(new ConnectionResult(4));
            if (this.f6234b.isConnected()) {
                this.f6234b.mo7290a((C2011d.C2021j) new C1917aa(this));
            }
        }

        /* renamed from: i */
        public final Map<C1939j.C1940a<?>, C1936ha> mo7437i() {
            return this.f6239g;
        }

        /* renamed from: j */
        public final void mo7438j() {
            C2061y.m9071a(C1925e.this.f6232q);
            this.f6244l = null;
        }

        /* renamed from: j */
        public final void mo7262j(Bundle bundle) {
            if (Looper.myLooper() == C1925e.this.f6232q.getLooper()) {
                m8544n();
            } else {
                C1925e.this.f6232q.post(new C1913X(this));
            }
        }

        /* renamed from: k */
        public final ConnectionResult mo7439k() {
            C2061y.m9071a(C1925e.this.f6232q);
            return this.f6244l;
        }

        /* renamed from: l */
        public final boolean mo7440l() {
            return m8535a(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final C5524b mo7441m() {
            C1943ja jaVar = this.f6241i;
            if (jaVar == null) {
                return null;
            }
            return jaVar.mo7460Xa();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    private static class C1927b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1973ya<?> f6246a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f6247b;

        private C1927b(C1973ya<?> yaVar, Feature feature) {
            this.f6246a = yaVar;
            this.f6247b = feature;
        }

        /* synthetic */ C1927b(C1973ya yaVar, Feature feature, C1912W w) {
            this(yaVar, feature);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1927b)) {
                C1927b bVar = (C1927b) obj;
                return C2059x.m9064a(this.f6246a, bVar.f6246a) && C2059x.m9064a(this.f6247b, bVar.f6247b);
            }
        }

        public final int hashCode() {
            return C2059x.m9062a(this.f6246a, this.f6247b);
        }

        public final String toString() {
            C2059x.C2060a a = C2059x.m9063a((Object) this);
            a.mo7711a("key", this.f6246a);
            a.mo7711a("feature", this.f6247b);
            return a.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$c */
    private class C1928c implements C1951na, C2011d.C2015d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1850a.C1861f f6248a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1973ya<?> f6249b;

        /* renamed from: c */
        private C2040q f6250c = null;

        /* renamed from: d */
        private Set<Scope> f6251d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f6252e = false;

        public C1928c(C1850a.C1861f fVar, C1973ya<?> yaVar) {
            this.f6248a = fVar;
            this.f6249b = yaVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8573a() {
            C2040q qVar;
            if (this.f6252e && (qVar = this.f6250c) != null) {
                this.f6248a.mo7291a(qVar, this.f6251d);
            }
        }

        /* renamed from: a */
        public final void mo7324a(ConnectionResult connectionResult) {
            C1925e.this.f6232q.post(new C1922ca(this, connectionResult));
        }

        /* renamed from: a */
        public final void mo7445a(C2040q qVar, Set<Scope> set) {
            if (qVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo7446b(new ConnectionResult(4));
                return;
            }
            this.f6250c = qVar;
            this.f6251d = set;
            m8573a();
        }

        /* renamed from: b */
        public final void mo7446b(ConnectionResult connectionResult) {
            ((C1926a) C1925e.this.f6228m.get(this.f6249b)).mo7430b(connectionResult);
        }
    }

    private C1925e(Context context, Looper looper, C1991e eVar) {
        this.f6223h = context;
        this.f6232q = new Handler(looper, this);
        this.f6224i = eVar;
        this.f6225j = new C2039p(eVar);
        Handler handler = this.f6232q;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C1925e m8509a() {
        C1925e eVar;
        synchronized (f6218c) {
            C2061y.m9068a(f6219d, (Object) "Must guarantee manager is non-null before using getInstance");
            eVar = f6219d;
        }
        return eVar;
    }

    /* renamed from: a */
    public static C1925e m8510a(Context context) {
        C1925e eVar;
        synchronized (f6218c) {
            if (f6219d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f6219d = new C1925e(context.getApplicationContext(), handlerThread.getLooper(), C1991e.m8751a());
            }
            eVar = f6219d;
        }
        return eVar;
    }

    /* renamed from: b */
    private final void m8512b(C1869e<?> eVar) {
        C1973ya<?> e = eVar.mo7317e();
        C1926a aVar = this.f6228m.get(e);
        if (aVar == null) {
            aVar = new C1926a(eVar);
            this.f6228m.put(e, aVar);
        }
        if (aVar.mo7432d()) {
            this.f6231p.add(e);
        }
        aVar.mo7425a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo7416a(C1973ya<?> yaVar, int i) {
        C5524b m;
        C1926a aVar = this.f6228m.get(yaVar);
        if (aVar == null || (m = aVar.mo7441m()) == null) {
            return null;
        }
        Context context = this.f6223h;
        m.mo7299i();
        throw null;
    }

    /* renamed from: a */
    public final C5536g<Map<C1973ya<?>, String>> mo7417a(Iterable<? extends C1869e<?>> iterable) {
        C1876Aa aa = new C1876Aa(iterable);
        Handler handler = this.f6232q;
        handler.sendMessage(handler.obtainMessage(2, aa));
        return aa.mo7321a();
    }

    /* renamed from: a */
    public final void mo7418a(ConnectionResult connectionResult, int i) {
        if (!mo7422b(connectionResult, i)) {
            Handler handler = this.f6232q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: a */
    public final void mo7419a(C1869e<?> eVar) {
        Handler handler = this.f6232q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: a */
    public final <O extends C1850a.C1854d> void mo7420a(C1869e<O> eVar, int i, C1921c<? extends C1874i, C1850a.C1852b> cVar) {
        C1967va vaVar = new C1967va(i, cVar);
        Handler handler = this.f6232q;
        handler.sendMessage(handler.obtainMessage(4, new C1934ga(vaVar, this.f6227l.get(), eVar)));
    }

    /* renamed from: b */
    public final int mo7421b() {
        return this.f6226k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo7422b(ConnectionResult connectionResult, int i) {
        return this.f6224i.mo7534a(this.f6223h, connectionResult, i);
    }

    /* renamed from: e */
    public final void mo7423e() {
        Handler handler = this.f6232q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public boolean handleMessage(Message message) {
        C1926a aVar;
        C5537h<Boolean> hVar;
        boolean z;
        int i = message.what;
        long j = 300000;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f6222g = j;
                this.f6232q.removeMessages(12);
                for (C1973ya<?> obtainMessage : this.f6228m.keySet()) {
                    Handler handler = this.f6232q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f6222g);
                }
                break;
            case 2:
                C1876Aa aa = (C1876Aa) message.obj;
                Iterator<C1973ya<?>> it = aa.mo7323b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1973ya next = it.next();
                        C1926a aVar2 = this.f6228m.get(next);
                        if (aVar2 == null) {
                            aa.mo7322a(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (aVar2.mo7431c()) {
                            aa.mo7322a(next, ConnectionResult.f6007a, aVar2.mo7434f().mo7295e());
                        } else if (aVar2.mo7439k() != null) {
                            aa.mo7322a(next, aVar2.mo7439k(), (String) null);
                        } else {
                            aVar2.mo7427a(aa);
                        }
                    }
                }
            case 3:
                for (C1926a next2 : this.f6228m.values()) {
                    next2.mo7438j();
                    next2.mo7425a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1934ga gaVar = (C1934ga) message.obj;
                C1926a aVar3 = this.f6228m.get(gaVar.f6264c.mo7317e());
                if (aVar3 == null) {
                    m8512b(gaVar.f6264c);
                    aVar3 = this.f6228m.get(gaVar.f6264c.mo7317e());
                }
                if (aVar3.mo7432d() && this.f6227l.get() != gaVar.f6263b) {
                    gaVar.f6262a.mo7374a(f6216a);
                    aVar3.mo7436h();
                    break;
                } else {
                    aVar3.mo7428a(gaVar.f6262a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C1926a<?>> it2 = this.f6228m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.mo7429b() == i2) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String b = this.f6224i.mo7536b(connectionResult.mo7213b());
                    String c = connectionResult.mo7214c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 69 + String.valueOf(c).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(c);
                    aVar.mo7426a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C2092n.m9161b() && (this.f6223h.getApplicationContext() instanceof Application)) {
                    C1918b.m8490a((Application) this.f6223h.getApplicationContext());
                    C1918b.m8489a().mo7394a((C1918b.C1919a) new C1912W(this));
                    if (!C1918b.m8489a().mo7395a(true)) {
                        this.f6222g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m8512b((C1869e<?>) (C1869e) message.obj);
                break;
            case 9:
                if (this.f6228m.containsKey(message.obj)) {
                    this.f6228m.get(message.obj).mo7433e();
                    break;
                }
                break;
            case 10:
                for (C1973ya<?> remove : this.f6231p) {
                    this.f6228m.remove(remove).mo7436h();
                }
                this.f6231p.clear();
                break;
            case 11:
                if (this.f6228m.containsKey(message.obj)) {
                    this.f6228m.get(message.obj).mo7435g();
                    break;
                }
                break;
            case 12:
                if (this.f6228m.containsKey(message.obj)) {
                    this.f6228m.get(message.obj).mo7440l();
                    break;
                }
                break;
            case 14:
                C1964u uVar = (C1964u) message.obj;
                C1973ya<?> b2 = uVar.mo7488b();
                if (!this.f6228m.containsKey(b2)) {
                    hVar = uVar.mo7487a();
                    z = false;
                } else {
                    boolean a = this.f6228m.get(b2).m8535a(false);
                    hVar = uVar.mo7487a();
                    z = Boolean.valueOf(a);
                }
                hVar.mo14998a(z);
                break;
            case 15:
                C1927b bVar = (C1927b) message.obj;
                if (this.f6228m.containsKey(bVar.f6246a)) {
                    this.f6228m.get(bVar.f6246a).m8533a(bVar);
                    break;
                }
                break;
            case 16:
                C1927b bVar2 = (C1927b) message.obj;
                if (this.f6228m.containsKey(bVar2.f6246a)) {
                    this.f6228m.get(bVar2.f6246a).m8538b(bVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
