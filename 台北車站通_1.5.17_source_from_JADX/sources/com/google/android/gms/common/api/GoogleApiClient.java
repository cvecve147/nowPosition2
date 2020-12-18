package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C1991e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.internal.C1884Da;
import com.google.android.gms.common.api.internal.C1899L;
import com.google.android.gms.common.api.internal.C1921c;
import com.google.android.gms.common.api.internal.C1935h;
import com.google.android.gms.common.api.internal.C1953oa;
import com.google.android.gms.common.api.internal.C1975za;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2061y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p143f.C5522a;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<GoogleApiClient> f6023a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    public static final class C1847a {

        /* renamed from: a */
        private Account f6024a;

        /* renamed from: b */
        private final Set<Scope> f6025b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f6026c = new HashSet();

        /* renamed from: d */
        private int f6027d;

        /* renamed from: e */
        private View f6028e;

        /* renamed from: f */
        private String f6029f;

        /* renamed from: g */
        private String f6030g;

        /* renamed from: h */
        private final Map<C1850a<?>, C2025f.C2027b> f6031h = new C1080b();

        /* renamed from: i */
        private final Context f6032i;

        /* renamed from: j */
        private final Map<C1850a<?>, C1850a.C1854d> f6033j = new C1080b();

        /* renamed from: k */
        private C1935h f6034k;

        /* renamed from: l */
        private int f6035l = -1;

        /* renamed from: m */
        private Looper f6036m;

        /* renamed from: n */
        private C1991e f6037n = C1991e.m8751a();

        /* renamed from: o */
        private C1850a.C1851a<? extends C5524b, C5525c> f6038o = C5522a.f15427c;

        /* renamed from: p */
        private final ArrayList<C1848b> f6039p = new ArrayList<>();

        /* renamed from: q */
        private final ArrayList<C1849c> f6040q = new ArrayList<>();

        /* renamed from: r */
        private boolean f6041r = false;

        public C1847a(Context context) {
            this.f6032i = context;
            this.f6036m = context.getMainLooper();
            this.f6029f = context.getPackageName();
            this.f6030g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C1847a mo7255a(Handler handler) {
            C2061y.m9068a(handler, (Object) "Handler must not be null");
            this.f6036m = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C1847a mo7256a(C1848b bVar) {
            C2061y.m9068a(bVar, (Object) "Listener must not be null");
            this.f6039p.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C1847a mo7257a(C1849c cVar) {
            C2061y.m9068a(cVar, (Object) "Listener must not be null");
            this.f6040q.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C1847a mo7258a(C1850a<? extends C1850a.C1854d.C1858d> aVar) {
            C2061y.m9068a(aVar, (Object) "Api must not be null");
            this.f6033j.put(aVar, (Object) null);
            List<Scope> a = aVar.mo7281c().mo7287a(null);
            this.f6026c.addAll(a);
            this.f6025b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final GoogleApiClient mo7259a() {
            C2061y.m9074a(!this.f6033j.isEmpty(), (Object) "must call addApi() to add at least one API");
            C2025f b = mo7260b();
            Map<C1850a<?>, C2025f.C2027b> e = b.mo7664e();
            C1080b bVar = new C1080b();
            C1080b bVar2 = new C1080b();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            C1850a aVar = null;
            for (C1850a next : this.f6033j.keySet()) {
                C1850a.C1854d dVar = this.f6033j.get(next);
                boolean z2 = e.get(next) != null;
                bVar.put(next, Boolean.valueOf(z2));
                C1884Da da = new C1884Da(next, z2);
                arrayList.add(da);
                C1850a.C1851a d = next.mo7282d();
                C1850a aVar2 = next;
                C1850a.C1861f a = d.mo7283a(this.f6032i, this.f6036m, b, dVar, da, da);
                bVar2.put(aVar2.mo7279a(), a);
                if (d.mo7286a() == 1) {
                    z = dVar != null;
                }
                if (a.mo7293b()) {
                    if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        String b2 = aVar2.mo7280b();
                        String b3 = aVar.mo7280b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(" cannot be used with ");
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    C2061y.m9079b(this.f6024a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo7280b());
                    C2061y.m9079b(this.f6025b.equals(this.f6026c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo7280b());
                } else {
                    String b4 = aVar.mo7280b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C1899L l = new C1899L(this.f6032i, new ReentrantLock(), this.f6036m, b, this.f6037n, this.f6038o, bVar, this.f6039p, this.f6040q, bVar2, this.f6035l, C1899L.m8427a((Iterable<C1850a.C1861f>) bVar2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.f6023a) {
                GoogleApiClient.f6023a.add(l);
            }
            if (this.f6035l < 0) {
                return l;
            }
            C1975za.m8724b(this.f6034k);
            throw null;
        }

        /* renamed from: b */
        public final C2025f mo7260b() {
            C5525c cVar = C5525c.f15434a;
            if (this.f6033j.containsKey(C5522a.f15431g)) {
                cVar = (C5525c) this.f6033j.get(C5522a.f15431g);
            }
            return new C2025f(this.f6024a, this.f6025b, this.f6031h, this.f6027d, this.f6028e, this.f6029f, this.f6030g, cVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$b */
    public interface C1848b {
        /* renamed from: f */
        void mo7261f(int i);

        /* renamed from: j */
        void mo7262j(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$c */
    public interface C1849c {
        /* renamed from: a */
        void mo7263a(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public Looper mo7244a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <C extends C1850a.C1861f> C mo7245a(C1850a.C1853c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7246a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo7247a(C1848b bVar);

    /* renamed from: a */
    public abstract void mo7248a(C1849c cVar);

    /* renamed from: a */
    public void mo7249a(C1953oa oaVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo7250b(C1848b bVar);

    /* renamed from: b */
    public abstract void mo7251b(C1849c cVar);

    /* renamed from: b */
    public abstract boolean mo7252b();

    public abstract void connect();

    public abstract void disconnect();
}
