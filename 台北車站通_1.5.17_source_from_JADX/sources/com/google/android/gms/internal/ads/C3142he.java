package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.he */
final class C3142he implements C3278lv {

    /* renamed from: a */
    private final /* synthetic */ List f9415a;

    /* renamed from: b */
    private final /* synthetic */ C3249kv f9416b;

    /* renamed from: c */
    private final /* synthetic */ Context f9417c;

    C3142he(C3114ge geVar, List list, C3249kv kvVar, Context context) {
        this.f9415a = list;
        this.f9416b = kvVar;
        this.f9417c = context;
    }

    /* renamed from: a */
    public final void mo9491a() {
        for (String str : this.f9415a) {
            String valueOf = String.valueOf(str);
            C2227Cf.m9534c(valueOf.length() != 0 ? "Pinging url: ".concat(valueOf) : new String("Pinging url: "));
            this.f9416b.mo9670a(Uri.parse(str), (Bundle) null, (List<Bundle>) null);
        }
        this.f9416b.mo9668a((Activity) this.f9417c);
    }

    /* renamed from: b */
    public final void mo9492b() {
    }
}
