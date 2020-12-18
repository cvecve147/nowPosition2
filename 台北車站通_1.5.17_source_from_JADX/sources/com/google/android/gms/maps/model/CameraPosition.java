package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C3992e();

    /* renamed from: a */
    public final LatLng f11874a;

    /* renamed from: b */
    public final float f11875b;

    /* renamed from: c */
    public final float f11876c;

    /* renamed from: d */
    public final float f11877d;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C3987a {

        /* renamed from: a */
        private LatLng f11878a;

        /* renamed from: b */
        private float f11879b;

        /* renamed from: c */
        private float f11880c;

        /* renamed from: d */
        private float f11881d;

        /* renamed from: a */
        public final C3987a mo11256a(float f) {
            this.f11881d = f;
            return this;
        }

        /* renamed from: a */
        public final C3987a mo11257a(LatLng latLng) {
            this.f11878a = latLng;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition mo11258a() {
            return new CameraPosition(this.f11878a, this.f11879b, this.f11880c, this.f11881d);
        }

        /* renamed from: b */
        public final C3987a mo11259b(float f) {
            this.f11880c = f;
            return this;
        }

        /* renamed from: c */
        public final C3987a mo11260c(float f) {
            this.f11879b = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C2061y.m9068a(latLng, (Object) "null camera target");
        C2061y.m9075a(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f11874a = latLng;
        this.f11875b = f;
        this.f11876c = f2 + 0.0f;
        this.f11877d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: b */
    public static C3987a m16098b() {
        return new C3987a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f11874a.equals(cameraPosition.f11874a) && Float.floatToIntBits(this.f11875b) == Float.floatToIntBits(cameraPosition.f11875b) && Float.floatToIntBits(this.f11876c) == Float.floatToIntBits(cameraPosition.f11876c) && Float.floatToIntBits(this.f11877d) == Float.floatToIntBits(cameraPosition.f11877d);
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f11874a, Float.valueOf(this.f11875b), Float.valueOf(this.f11876c), Float.valueOf(this.f11877d));
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("target", this.f11874a);
        a.mo7711a("zoom", Float.valueOf(this.f11875b));
        a.mo7711a("tilt", Float.valueOf(this.f11876c));
        a.mo7711a("bearing", Float.valueOf(this.f11877d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f11874a, i, false);
        C2049b.m9029a(parcel, 3, this.f11875b);
        C2049b.m9029a(parcel, 4, this.f11876c);
        C2049b.m9029a(parcel, 5, this.f11877d);
        C2049b.m9026a(parcel, a);
    }
}
