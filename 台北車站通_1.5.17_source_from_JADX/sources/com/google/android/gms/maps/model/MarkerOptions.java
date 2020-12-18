package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import p101d.p129g.p131b.p132a.p134b.C5464b;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C3995h();

    /* renamed from: a */
    private LatLng f11886a;

    /* renamed from: b */
    private String f11887b;

    /* renamed from: c */
    private String f11888c;

    /* renamed from: d */
    private C3988a f11889d;

    /* renamed from: e */
    private float f11890e = 0.5f;

    /* renamed from: f */
    private float f11891f = 1.0f;

    /* renamed from: g */
    private boolean f11892g;

    /* renamed from: h */
    private boolean f11893h = true;

    /* renamed from: i */
    private boolean f11894i = false;

    /* renamed from: j */
    private float f11895j = 0.0f;

    /* renamed from: k */
    private float f11896k = 0.5f;

    /* renamed from: l */
    private float f11897l = 0.0f;

    /* renamed from: m */
    private float f11898m = 1.0f;

    /* renamed from: n */
    private float f11899n;

    public MarkerOptions() {
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f11886a = latLng;
        this.f11887b = str;
        this.f11888c = str2;
        this.f11889d = iBinder == null ? null : new C3988a(C5464b.C5465a.asInterface(iBinder));
        this.f11890e = f;
        this.f11891f = f2;
        this.f11892g = z;
        this.f11893h = z2;
        this.f11894i = z3;
        this.f11895j = f3;
        this.f11896k = f4;
        this.f11897l = f5;
        this.f11898m = f6;
        this.f11899n = f7;
    }

    /* renamed from: a */
    public final MarkerOptions mo11269a(float f, float f2) {
        this.f11890e = f;
        this.f11891f = f2;
        return this;
    }

    /* renamed from: a */
    public final MarkerOptions mo11270a(LatLng latLng) {
        if (latLng != null) {
            this.f11886a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: a */
    public final MarkerOptions mo11271a(C3988a aVar) {
        this.f11889d = aVar;
        return this;
    }

    /* renamed from: b */
    public final float mo11272b() {
        return this.f11898m;
    }

    /* renamed from: c */
    public final float mo11273c() {
        return this.f11890e;
    }

    /* renamed from: d */
    public final float mo11274d() {
        return this.f11891f;
    }

    /* renamed from: e */
    public final float mo11275e() {
        return this.f11896k;
    }

    /* renamed from: f */
    public final float mo11276f() {
        return this.f11897l;
    }

    /* renamed from: g */
    public final LatLng mo11277g() {
        return this.f11886a;
    }

    /* renamed from: h */
    public final float mo11278h() {
        return this.f11895j;
    }

    /* renamed from: i */
    public final String mo11279i() {
        return this.f11888c;
    }

    /* renamed from: j */
    public final String mo11280j() {
        return this.f11887b;
    }

    /* renamed from: o */
    public final float mo11281o() {
        return this.f11899n;
    }

    /* renamed from: p */
    public final boolean mo11282p() {
        return this.f11892g;
    }

    /* renamed from: q */
    public final boolean mo11283q() {
        return this.f11894i;
    }

    /* renamed from: r */
    public final boolean mo11284r() {
        return this.f11893h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) mo11277g(), i, false);
        C2049b.m9038a(parcel, 3, mo11280j(), false);
        C2049b.m9038a(parcel, 4, mo11279i(), false);
        C3988a aVar = this.f11889d;
        C2049b.m9033a(parcel, 5, aVar == null ? null : aVar.mo11286a().asBinder(), false);
        C2049b.m9029a(parcel, 6, mo11273c());
        C2049b.m9029a(parcel, 7, mo11274d());
        C2049b.m9040a(parcel, 8, mo11282p());
        C2049b.m9040a(parcel, 9, mo11284r());
        C2049b.m9040a(parcel, 10, mo11283q());
        C2049b.m9029a(parcel, 11, mo11278h());
        C2049b.m9029a(parcel, 12, mo11275e());
        C2049b.m9029a(parcel, 13, mo11276f());
        C2049b.m9029a(parcel, 14, mo11272b());
        C2049b.m9029a(parcel, 15, mo11281o());
        C2049b.m9026a(parcel, a);
    }
}
