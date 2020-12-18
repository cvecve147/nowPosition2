package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p075a.C3964f;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C3984h();

    /* renamed from: a */
    private Boolean f11838a;

    /* renamed from: b */
    private Boolean f11839b;

    /* renamed from: c */
    private int f11840c = -1;

    /* renamed from: d */
    private CameraPosition f11841d;

    /* renamed from: e */
    private Boolean f11842e;

    /* renamed from: f */
    private Boolean f11843f;

    /* renamed from: g */
    private Boolean f11844g;

    /* renamed from: h */
    private Boolean f11845h;

    /* renamed from: i */
    private Boolean f11846i;

    /* renamed from: j */
    private Boolean f11847j;

    /* renamed from: k */
    private Boolean f11848k;

    /* renamed from: l */
    private Boolean f11849l;

    /* renamed from: m */
    private Boolean f11850m;

    /* renamed from: n */
    private Float f11851n = null;

    /* renamed from: o */
    private Float f11852o = null;

    /* renamed from: p */
    private LatLngBounds f11853p = null;

    public GoogleMapOptions() {
    }

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f11838a = C3964f.m16051a(b);
        this.f11839b = C3964f.m16051a(b2);
        this.f11840c = i;
        this.f11841d = cameraPosition;
        this.f11842e = C3964f.m16051a(b3);
        this.f11843f = C3964f.m16051a(b4);
        this.f11844g = C3964f.m16051a(b5);
        this.f11845h = C3964f.m16051a(b6);
        this.f11846i = C3964f.m16051a(b7);
        this.f11847j = C3964f.m16051a(b8);
        this.f11848k = C3964f.m16051a(b9);
        this.f11849l = C3964f.m16051a(b10);
        this.f11850m = C3964f.m16051a(b11);
        this.f11851n = f;
        this.f11852o = f2;
        this.f11853p = latLngBounds;
    }

    /* renamed from: a */
    public static GoogleMapOptions m16000a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3982f.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C3982f.MapAttrs_mapType)) {
            googleMapOptions.mo11182c(obtainAttributes.getInt(C3982f.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_zOrderOnTop)) {
            googleMapOptions.mo11193i(obtainAttributes.getBoolean(C3982f.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_useViewLifecycle)) {
            googleMapOptions.mo11192h(obtainAttributes.getBoolean(C3982f.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiCompass)) {
            googleMapOptions.mo11180b(obtainAttributes.getBoolean(C3982f.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiRotateGestures)) {
            googleMapOptions.mo11187e(obtainAttributes.getBoolean(C3982f.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiScrollGestures)) {
            googleMapOptions.mo11189f(obtainAttributes.getBoolean(C3982f.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiTiltGestures)) {
            googleMapOptions.mo11191g(obtainAttributes.getBoolean(C3982f.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiZoomGestures)) {
            googleMapOptions.mo11195k(obtainAttributes.getBoolean(C3982f.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiZoomControls)) {
            googleMapOptions.mo11194j(obtainAttributes.getBoolean(C3982f.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_liteMode)) {
            googleMapOptions.mo11183c(obtainAttributes.getBoolean(C3982f.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mo11186d(obtainAttributes.getBoolean(C3982f.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_ambientEnabled)) {
            googleMapOptions.mo11178a(obtainAttributes.getBoolean(C3982f.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.mo11179b(obtainAttributes.getFloat(C3982f.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.mo11175a(obtainAttributes.getFloat(C3982f.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.mo11177a(m16001b(context, attributeSet));
        googleMapOptions.mo11176a(m16002c(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: b */
    public static LatLngBounds m16001b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3982f.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(C3982f.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(C3982f.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(C3982f.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(C3982f.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(C3982f.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(C3982f.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(C3982f.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(C3982f.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    /* renamed from: c */
    public static CameraPosition m16002c(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3982f.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(C3982f.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C3982f.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(C3982f.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C3982f.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        CameraPosition.C3987a b = CameraPosition.m16098b();
        b.mo11257a(latLng);
        if (obtainAttributes.hasValue(C3982f.MapAttrs_cameraZoom)) {
            b.mo11260c(obtainAttributes.getFloat(C3982f.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_cameraBearing)) {
            b.mo11256a(obtainAttributes.getFloat(C3982f.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(C3982f.MapAttrs_cameraTilt)) {
            b.mo11259b(obtainAttributes.getFloat(C3982f.MapAttrs_cameraTilt, 0.0f));
        }
        obtainAttributes.recycle();
        return b.mo11258a();
    }

    /* renamed from: a */
    public final GoogleMapOptions mo11175a(float f) {
        this.f11852o = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo11176a(CameraPosition cameraPosition) {
        this.f11841d = cameraPosition;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo11177a(LatLngBounds latLngBounds) {
        this.f11853p = latLngBounds;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo11178a(boolean z) {
        this.f11850m = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo11179b(float f) {
        this.f11851n = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo11180b(boolean z) {
        this.f11843f = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final CameraPosition mo11181b() {
        return this.f11841d;
    }

    /* renamed from: c */
    public final GoogleMapOptions mo11182c(int i) {
        this.f11840c = i;
        return this;
    }

    /* renamed from: c */
    public final GoogleMapOptions mo11183c(boolean z) {
        this.f11848k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final LatLngBounds mo11184c() {
        return this.f11853p;
    }

    /* renamed from: d */
    public final int mo11185d() {
        return this.f11840c;
    }

    /* renamed from: d */
    public final GoogleMapOptions mo11186d(boolean z) {
        this.f11849l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final GoogleMapOptions mo11187e(boolean z) {
        this.f11847j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final Float mo11188e() {
        return this.f11852o;
    }

    /* renamed from: f */
    public final GoogleMapOptions mo11189f(boolean z) {
        this.f11844g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public final Float mo11190f() {
        return this.f11851n;
    }

    /* renamed from: g */
    public final GoogleMapOptions mo11191g(boolean z) {
        this.f11846i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    public final GoogleMapOptions mo11192h(boolean z) {
        this.f11839b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: i */
    public final GoogleMapOptions mo11193i(boolean z) {
        this.f11838a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: j */
    public final GoogleMapOptions mo11194j(boolean z) {
        this.f11842e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: k */
    public final GoogleMapOptions mo11195k(boolean z) {
        this.f11845h = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("MapType", Integer.valueOf(this.f11840c));
        a.mo7711a("LiteMode", this.f11848k);
        a.mo7711a("Camera", this.f11841d);
        a.mo7711a("CompassEnabled", this.f11843f);
        a.mo7711a("ZoomControlsEnabled", this.f11842e);
        a.mo7711a("ScrollGesturesEnabled", this.f11844g);
        a.mo7711a("ZoomGesturesEnabled", this.f11845h);
        a.mo7711a("TiltGesturesEnabled", this.f11846i);
        a.mo7711a("RotateGesturesEnabled", this.f11847j);
        a.mo7711a("MapToolbarEnabled", this.f11849l);
        a.mo7711a("AmbientEnabled", this.f11850m);
        a.mo7711a("MinZoomPreference", this.f11851n);
        a.mo7711a("MaxZoomPreference", this.f11852o);
        a.mo7711a("LatLngBoundsForCameraTarget", this.f11853p);
        a.mo7711a("ZOrderOnTop", this.f11838a);
        a.mo7711a("UseViewLifecycleInFragment", this.f11839b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9027a(parcel, 2, C3964f.m16050a(this.f11838a));
        C2049b.m9027a(parcel, 3, C3964f.m16050a(this.f11839b));
        C2049b.m9030a(parcel, 4, mo11185d());
        C2049b.m9034a(parcel, 5, (Parcelable) mo11181b(), i, false);
        C2049b.m9027a(parcel, 6, C3964f.m16050a(this.f11842e));
        C2049b.m9027a(parcel, 7, C3964f.m16050a(this.f11843f));
        C2049b.m9027a(parcel, 8, C3964f.m16050a(this.f11844g));
        C2049b.m9027a(parcel, 9, C3964f.m16050a(this.f11845h));
        C2049b.m9027a(parcel, 10, C3964f.m16050a(this.f11846i));
        C2049b.m9027a(parcel, 11, C3964f.m16050a(this.f11847j));
        C2049b.m9027a(parcel, 12, C3964f.m16050a(this.f11848k));
        C2049b.m9027a(parcel, 14, C3964f.m16050a(this.f11849l));
        C2049b.m9027a(parcel, 15, C3964f.m16050a(this.f11850m));
        C2049b.m9036a(parcel, 16, mo11190f(), false);
        C2049b.m9036a(parcel, 17, mo11188e(), false);
        C2049b.m9034a(parcel, 18, (Parcelable) mo11184c(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
