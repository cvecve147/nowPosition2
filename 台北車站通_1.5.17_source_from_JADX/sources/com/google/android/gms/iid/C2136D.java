package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.iid.D */
abstract class C2136D<T> {

    /* renamed from: a */
    final int f6608a;

    /* renamed from: b */
    final C5537h<T> f6609b = new C5537h<>();

    /* renamed from: c */
    final int f6610c;

    /* renamed from: d */
    final Bundle f6611d;

    C2136D(int i, int i2, Bundle bundle) {
        this.f6608a = i;
        this.f6610c = i2;
        this.f6611d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo7750a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7751a(C2139c cVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(cVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6609b.mo14997a((Exception) cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo7752a();

    public String toString() {
        int i = this.f6610c;
        int i2 = this.f6608a;
        mo7752a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
