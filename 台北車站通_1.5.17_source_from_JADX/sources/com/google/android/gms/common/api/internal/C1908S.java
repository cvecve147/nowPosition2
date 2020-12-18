package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.internal.C2025f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.S */
public final class C1908S implements C1929ea, C1886Ea {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f6181a;

    /* renamed from: b */
    private final Condition f6182b;

    /* renamed from: c */
    private final Context f6183c;

    /* renamed from: d */
    private final C1993f f6184d;

    /* renamed from: e */
    private final C1910U f6185e;

    /* renamed from: f */
    final Map<C1850a.C1853c<?>, C1850a.C1861f> f6186f;

    /* renamed from: g */
    final Map<C1850a.C1853c<?>, ConnectionResult> f6187g = new HashMap();

    /* renamed from: h */
    private final C2025f f6188h;

    /* renamed from: i */
    private final Map<C1850a<?>, Boolean> f6189i;

    /* renamed from: j */
    private final C1850a.C1851a<? extends C5524b, C5525c> f6190j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C1907Q f6191k;

    /* renamed from: l */
    private ConnectionResult f6192l = null;

    /* renamed from: m */
    int f6193m;

    /* renamed from: n */
    final C1899L f6194n;

    /* renamed from: o */
    final C1932fa f6195o;

    public C1908S(Context context, C1899L l, Lock lock, Looper looper, C1993f fVar, Map<C1850a.C1853c<?>, C1850a.C1861f> map, C2025f fVar2, Map<C1850a<?>, Boolean> map2, C1850a.C1851a<? extends C5524b, C5525c> aVar, ArrayList<C1884Da> arrayList, C1932fa faVar) {
        this.f6183c = context;
        this.f6181a = lock;
        this.f6184d = fVar;
        this.f6186f = map;
        this.f6188h = fVar2;
        this.f6189i = map2;
        this.f6190j = aVar;
        this.f6194n = l;
        this.f6195o = faVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1884Da da = arrayList.get(i);
            i++;
            da.mo7344a((C1886Ea) this);
        }
        this.f6185e = new C1910U(this, looper);
        this.f6182b = lock.newCondition();
        this.f6191k = new C1897K(this);
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7346a(T t) {
        t.mo7337f();
        return this.f6191k.mo7358a(t);
    }

    /* renamed from: a */
    public final void mo7347a() {
        if (this.f6191k.mo7360a()) {
            this.f6187g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7381a(ConnectionResult connectionResult) {
        this.f6181a.lock();
        try {
            this.f6192l = connectionResult;
            this.f6191k = new C1897K(this);
            this.f6191k.mo7361b();
            this.f6182b.signalAll();
        } finally {
            this.f6181a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7345a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z) {
        this.f6181a.lock();
        try {
            this.f6191k.mo7359a(connectionResult, aVar, z);
        } finally {
            this.f6181a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7382a(C1909T t) {
        this.f6185e.sendMessage(this.f6185e.obtainMessage(1, t));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7383a(RuntimeException runtimeException) {
        this.f6185e.sendMessage(this.f6185e.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo7348a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f6191k);
        for (C1850a next : this.f6189i.keySet()) {
            printWriter.append(str).append(next.mo7280b()).println(":");
            this.f6186f.get(next.mo7279a()).mo7292a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: b */
    public final void mo7349b() {
        if (isConnected()) {
            ((C1968w) this.f6191k).mo7489c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7384c() {
        this.f6181a.lock();
        try {
            this.f6191k = new C1974z(this, this.f6188h, this.f6189i, this.f6184d, this.f6190j, this.f6181a, this.f6183c);
            this.f6191k.mo7361b();
            this.f6182b.signalAll();
        } finally {
            this.f6181a.unlock();
        }
    }

    public final void connect() {
        this.f6191k.connect();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7385d() {
        this.f6181a.lock();
        try {
            this.f6194n.mo7368d();
            this.f6191k = new C1968w(this);
            this.f6191k.mo7361b();
            this.f6182b.signalAll();
        } finally {
            this.f6181a.unlock();
        }
    }

    /* renamed from: f */
    public final void mo7261f(int i) {
        this.f6181a.lock();
        try {
            this.f6191k.mo7363f(i);
        } finally {
            this.f6181a.unlock();
        }
    }

    public final boolean isConnected() {
        return this.f6191k instanceof C1968w;
    }

    /* renamed from: j */
    public final void mo7262j(Bundle bundle) {
        this.f6181a.lock();
        try {
            this.f6191k.mo7364j(bundle);
        } finally {
            this.f6181a.unlock();
        }
    }
}
