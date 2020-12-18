package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.internal.C1973ya;
import com.google.android.gms.common.internal.C2061y;
import java.util.ArrayList;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.common.api.c */
public class C1867c extends Exception {

    /* renamed from: a */
    private final C1080b<C1973ya<?>, ConnectionResult> f6061a;

    public C1867c(C1080b<C1973ya<?>, ConnectionResult> bVar) {
        this.f6061a = bVar;
    }

    /* renamed from: a */
    public final C1080b<C1973ya<?>, ConnectionResult> mo7307a() {
        return this.f6061a;
    }

    /* renamed from: a */
    public ConnectionResult mo7308a(C1869e<? extends C1850a.C1854d> eVar) {
        C1973ya<? extends C1850a.C1854d> e = eVar.mo7317e();
        C2061y.m9074a(this.f6061a.get(e) != null, (Object) "The given API was not part of the availability request.");
        return this.f6061a.get(e);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1973ya next : this.f6061a.keySet()) {
            ConnectionResult connectionResult = this.f6061a.get(next);
            if (connectionResult.mo7218f()) {
                z = false;
            }
            String a = next.mo7492a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
