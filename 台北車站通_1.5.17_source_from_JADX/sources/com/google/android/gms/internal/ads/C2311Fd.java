package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Fd */
public final class C2311Fd {

    /* renamed from: a */
    private final C2658Rd f6978a;

    /* renamed from: b */
    private final LinkedList<C2339Gd> f6979b;

    /* renamed from: c */
    private final Object f6980c;

    /* renamed from: d */
    private final String f6981d;

    /* renamed from: e */
    private final String f6982e;

    /* renamed from: f */
    private long f6983f;

    /* renamed from: g */
    private long f6984g;

    /* renamed from: h */
    private boolean f6985h;

    /* renamed from: i */
    private long f6986i;

    /* renamed from: j */
    private long f6987j;

    /* renamed from: k */
    private long f6988k;

    /* renamed from: l */
    private long f6989l;

    private C2311Fd(C2658Rd rd, String str, String str2) {
        this.f6980c = new Object();
        this.f6983f = -1;
        this.f6984g = -1;
        this.f6985h = false;
        this.f6986i = -1;
        this.f6987j = 0;
        this.f6988k = -1;
        this.f6989l = -1;
        this.f6978a = rd;
        this.f6981d = str;
        this.f6982e = str2;
        this.f6979b = new LinkedList<>();
    }

    public C2311Fd(String str, String str2) {
        this(C1697X.m7703j(), str, str2);
    }

    /* renamed from: a */
    public final Bundle mo8066a() {
        Bundle bundle;
        synchronized (this.f6980c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6981d);
            bundle.putString("slotid", this.f6982e);
            bundle.putBoolean("ismediation", this.f6985h);
            bundle.putLong("treq", this.f6988k);
            bundle.putLong("tresponse", this.f6989l);
            bundle.putLong("timp", this.f6984g);
            bundle.putLong("tload", this.f6986i);
            bundle.putLong("pcc", this.f6987j);
            bundle.putLong("tfetch", this.f6983f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6979b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2339Gd) it.next()).mo8113a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo8067a(long j) {
        synchronized (this.f6980c) {
            this.f6989l = j;
            if (this.f6989l != -1) {
                this.f6978a.mo8773a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo8068a(zzjj zzjj) {
        synchronized (this.f6980c) {
            this.f6988k = SystemClock.elapsedRealtime();
            this.f6978a.mo8775a(zzjj, this.f6988k);
        }
    }

    /* renamed from: a */
    public final void mo8069a(boolean z) {
        synchronized (this.f6980c) {
            if (this.f6989l != -1) {
                this.f6986i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f6984g = this.f6986i;
                    this.f6978a.mo8773a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8070b() {
        synchronized (this.f6980c) {
            if (this.f6989l != -1 && this.f6984g == -1) {
                this.f6984g = SystemClock.elapsedRealtime();
                this.f6978a.mo8773a(this);
            }
            this.f6978a.mo8772a();
        }
    }

    /* renamed from: b */
    public final void mo8071b(long j) {
        synchronized (this.f6980c) {
            if (this.f6989l != -1) {
                this.f6983f = j;
                this.f6978a.mo8773a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo8072b(boolean z) {
        synchronized (this.f6980c) {
            if (this.f6989l != -1) {
                this.f6985h = z;
                this.f6978a.mo8773a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo8073c() {
        synchronized (this.f6980c) {
            if (this.f6989l != -1) {
                C2339Gd gd = new C2339Gd();
                gd.mo8116d();
                this.f6979b.add(gd);
                this.f6987j++;
                this.f6978a.mo8777b();
                this.f6978a.mo8773a(this);
            }
        }
    }

    /* renamed from: d */
    public final void mo8074d() {
        synchronized (this.f6980c) {
            if (this.f6989l != -1 && !this.f6979b.isEmpty()) {
                C2339Gd last = this.f6979b.getLast();
                if (last.mo8114b() == -1) {
                    last.mo8115c();
                    this.f6978a.mo8773a(this);
                }
            }
        }
    }
}
