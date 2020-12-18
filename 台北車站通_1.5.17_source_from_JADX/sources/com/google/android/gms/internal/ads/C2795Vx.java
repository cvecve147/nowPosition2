package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C2061y;
import java.util.Iterator;
import java.util.LinkedList;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Vx */
final class C2795Vx {

    /* renamed from: a */
    private final LinkedList<C2822Wx> f8474a = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzjj f8475b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f8476c;

    /* renamed from: d */
    private final int f8477d;

    /* renamed from: e */
    private boolean f8478e;

    C2795Vx(zzjj zzjj, String str, int i) {
        C2061y.m9067a(zzjj);
        C2061y.m9067a(str);
        this.f8475b = zzjj;
        this.f8476c = str;
        this.f8477d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2822Wx mo8975a(zzjj zzjj) {
        if (zzjj != null) {
            this.f8475b = zzjj;
        }
        return this.f8474a.remove();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo8976a() {
        return this.f8476c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8977a(C3365ox oxVar, zzjj zzjj) {
        this.f8474a.add(new C2822Wx(this, oxVar, zzjj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8978a(C3365ox oxVar) {
        C2822Wx wx = new C2822Wx(this, oxVar);
        this.f8474a.add(wx);
        return wx.mo9011a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo8979b() {
        return this.f8477d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo8980c() {
        return this.f8474a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzjj mo8981d() {
        return this.f8475b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo8982e() {
        Iterator it = this.f8474a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C2822Wx) it.next()).f8580e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo8983f() {
        Iterator it = this.f8474a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C2822Wx) it.next()).mo9011a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo8984g() {
        this.f8478e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo8985h() {
        return this.f8478e;
    }
}
