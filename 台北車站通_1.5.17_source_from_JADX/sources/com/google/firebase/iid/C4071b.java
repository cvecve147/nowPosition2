package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.firebase.iid.b */
abstract class C4071b<T> {

    /* renamed from: a */
    final int f12074a;

    /* renamed from: b */
    final C5537h<T> f12075b = new C5537h<>();

    /* renamed from: c */
    final int f12076c;

    /* renamed from: d */
    final Bundle f12077d;

    C4071b(int i, int i2, Bundle bundle) {
        this.f12074a = i;
        this.f12076c = i2;
        this.f12077d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo11498a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11499a(C4072c cVar) {
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
        this.f12075b.mo14997a((Exception) cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11500a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f12075b.mo14998a(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo11501a();

    public String toString() {
        int i = this.f12076c;
        int i2 = this.f12074a;
        boolean a = mo11501a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
