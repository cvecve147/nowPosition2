package com.google.android.gms.location;

import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C1921c;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.location.C3685D;
import com.google.android.gms.internal.location.C3692e;
import com.google.android.gms.internal.location.C3705r;
import com.google.android.gms.internal.location.C3710w;

/* renamed from: com.google.android.gms.location.e */
public class C3938e {

    /* renamed from: a */
    private static final C1850a.C1862g<C3705r> f11823a = new C1850a.C1862g<>();

    /* renamed from: b */
    private static final C1850a.C1851a<C3705r, Object> f11824b = new C3944j();

    /* renamed from: c */
    public static final C1850a<Object> f11825c = new C1850a<>("LocationServices.API", f11824b, f11823a);
    @Deprecated

    /* renamed from: d */
    public static final C3934a f11826d = new C3685D();
    @Deprecated

    /* renamed from: e */
    public static final C3935b f11827e = new C3692e();
    @Deprecated

    /* renamed from: f */
    public static final C3940f f11828f = new C3710w();

    /* renamed from: com.google.android.gms.location.e$a */
    public static abstract class C3939a<R extends C1874i> extends C1921c<R, C3705r> {
        public C3939a(GoogleApiClient googleApiClient) {
            super(C3938e.f11825c, googleApiClient);
        }
    }

    /* renamed from: a */
    public static C3705r m15990a(GoogleApiClient googleApiClient) {
        boolean z = true;
        C2061y.m9074a(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C3705r rVar = (C3705r) googleApiClient.mo7245a(f11823a);
        if (rVar == null) {
            z = false;
        }
        C2061y.m9078b(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return rVar;
    }
}
