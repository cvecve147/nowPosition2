package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2032k;

/* renamed from: com.google.android.gms.internal.location.z */
public class C3713z extends C2032k<C3696i> {

    /* renamed from: G */
    private final String f10952G;

    /* renamed from: H */
    protected final C3709v<C3696i> f10953H = new C3682A(this);

    public C3713z(Context context, Looper looper, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar, String str, C2025f fVar) {
        super(context, looper, 23, fVar, bVar, cVar);
        this.f10952G = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo7556A() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C3696i ? (C3696i) queryLocalInterface : new C3697j(iBinder);
    }

    /* renamed from: g */
    public int mo7297g() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo7636s() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f10952G);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo7560z() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
