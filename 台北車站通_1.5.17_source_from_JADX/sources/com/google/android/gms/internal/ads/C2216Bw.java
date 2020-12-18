package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3656zb;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bw */
public abstract class C2216Bw<T> implements Comparable<C2216Bw<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3656zb.C3657a f6772a;

    /* renamed from: b */
    private final int f6773b;

    /* renamed from: c */
    private final String f6774c;

    /* renamed from: d */
    private final int f6775d;

    /* renamed from: e */
    private final Object f6776e;

    /* renamed from: f */
    private C2907Zz f6777f;

    /* renamed from: g */
    private Integer f6778g;

    /* renamed from: h */
    private C3623xy f6779h;

    /* renamed from: i */
    private boolean f6780i;

    /* renamed from: j */
    private boolean f6781j;

    /* renamed from: k */
    private boolean f6782k;

    /* renamed from: l */
    private boolean f6783l;

    /* renamed from: m */
    private C2220C f6784m;

    /* renamed from: n */
    private C3471sp f6785n;

    /* renamed from: o */
    private C3594wx f6786o;

    public C2216Bw(int i, String str, C2907Zz zz) {
        Uri parse;
        String host;
        this.f6772a = C3656zb.C3657a.f10641a ? new C3656zb.C3657a() : null;
        this.f6776e = new Object();
        this.f6780i = true;
        int i2 = 0;
        this.f6781j = false;
        this.f6782k = false;
        this.f6783l = false;
        this.f6785n = null;
        this.f6773b = i;
        this.f6774c = str;
        this.f6777f = zz;
        this.f6784m = new C2789Vr();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f6775d = i2;
    }

    /* renamed from: a */
    public final C2216Bw<?> mo7897a(int i) {
        this.f6778g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final C2216Bw<?> mo7898a(C3471sp spVar) {
        this.f6785n = spVar;
        return this;
    }

    /* renamed from: a */
    public final C2216Bw<?> mo7899a(C3623xy xyVar) {
        this.f6779h = xyVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3652yz<T> mo7900a(C2272Dv dv);

    /* renamed from: a */
    public Map<String, String> mo7901a() {
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final void mo7902a(C3024db dbVar) {
        C2907Zz zz;
        synchronized (this.f6776e) {
            zz = this.f6777f;
        }
        if (zz != null) {
            zz.mo8922a(dbVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7903a(C3594wx wxVar) {
        synchronized (this.f6776e) {
            this.f6786o = wxVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7904a(C3652yz<?> yzVar) {
        C3594wx wxVar;
        synchronized (this.f6776e) {
            wxVar = this.f6786o;
        }
        if (wxVar != null) {
            wxVar.mo8936a(this, yzVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7905a(T t);

    /* renamed from: a */
    public final void mo7906a(String str) {
        if (C3656zb.C3657a.f10641a) {
            this.f6772a.mo10262a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: b */
    public final int mo7907b() {
        return this.f6773b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7908b(String str) {
        C3623xy xyVar = this.f6779h;
        if (xyVar != null) {
            xyVar.mo10223b(this);
        }
        if (C3656zb.C3657a.f10641a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C2961ax(this, str, id));
                return;
            }
            this.f6772a.mo10262a(str, id);
            this.f6772a.mo10261a(toString());
        }
    }

    /* renamed from: c */
    public final String mo7909c() {
        return this.f6774c;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C2216Bw bw = (C2216Bw) obj;
        C2850Xx xx = C2850Xx.NORMAL;
        return xx == xx ? this.f6778g.intValue() - bw.f6778g.intValue() : xx.ordinal() - xx.ordinal();
    }

    /* renamed from: k */
    public final boolean mo7911k() {
        synchronized (this.f6776e) {
        }
        return false;
    }

    /* renamed from: l */
    public final int mo7912l() {
        return this.f6775d;
    }

    /* renamed from: m */
    public final C3471sp mo7913m() {
        return this.f6785n;
    }

    /* renamed from: n */
    public byte[] mo7914n() {
        return null;
    }

    /* renamed from: o */
    public final boolean mo7915o() {
        return this.f6780i;
    }

    /* renamed from: p */
    public final int mo7916p() {
        return this.f6784m.mo7925K();
    }

    /* renamed from: q */
    public final C2220C mo7917q() {
        return this.f6784m;
    }

    /* renamed from: r */
    public final void mo7918r() {
        synchronized (this.f6776e) {
            this.f6782k = true;
        }
    }

    /* renamed from: s */
    public final boolean mo7919s() {
        boolean z;
        synchronized (this.f6776e) {
            z = this.f6782k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo7920t() {
        C3594wx wxVar;
        synchronized (this.f6776e) {
            wxVar = this.f6786o;
        }
        if (wxVar != null) {
            wxVar.mo8935a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f6775d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        String str = this.f6774c;
        String valueOf2 = String.valueOf(C2850Xx.NORMAL);
        String valueOf3 = String.valueOf(this.f6778g);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
