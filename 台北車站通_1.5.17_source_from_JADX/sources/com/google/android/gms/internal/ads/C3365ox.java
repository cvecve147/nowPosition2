package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1763m;
import com.google.android.gms.ads.internal.C1804ua;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ox */
public final class C3365ox {

    /* renamed from: a */
    private final Context f9976a;

    /* renamed from: b */
    private final C2533Mz f9977b;

    /* renamed from: c */
    private final zzang f9978c;

    /* renamed from: d */
    private final C1804ua f9979d;

    C3365ox(Context context, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        this.f9976a = context;
        this.f9977b = mz;
        this.f9978c = zzang;
        this.f9979d = uaVar;
    }

    /* renamed from: a */
    public final Context mo9842a() {
        return this.f9976a.getApplicationContext();
    }

    /* renamed from: a */
    public final C1763m mo9843a(String str) {
        return new C1763m(this.f9976a, new zzjn(), str, this.f9977b, this.f9978c, this.f9979d);
    }

    /* renamed from: b */
    public final C1763m mo9844b(String str) {
        return new C1763m(this.f9976a.getApplicationContext(), new zzjn(), str, this.f9977b, this.f9978c, this.f9979d);
    }

    /* renamed from: b */
    public final C3365ox mo9845b() {
        return new C3365ox(this.f9976a.getApplicationContext(), this.f9977b, this.f9978c, this.f9979d);
    }
}
