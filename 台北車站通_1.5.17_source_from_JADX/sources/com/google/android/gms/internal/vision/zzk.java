package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import p101d.p129g.p131b.p132a.p145h.C5566c;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C3933j();

    /* renamed from: a */
    public int f11803a;

    /* renamed from: b */
    public int f11804b;

    /* renamed from: c */
    private int f11805c;

    /* renamed from: d */
    private long f11806d;

    /* renamed from: e */
    public int f11807e;

    public zzk() {
    }

    public zzk(int i, int i2, int i3, long j, int i4) {
        this.f11803a = i;
        this.f11804b = i2;
        this.f11805c = i3;
        this.f11806d = j;
        this.f11807e = i4;
    }

    /* renamed from: a */
    public static zzk m15975a(C5566c cVar) {
        zzk zzk = new zzk();
        zzk.f11803a = cVar.mo15038c().mo15048e();
        zzk.f11804b = cVar.mo15038c().mo15044a();
        zzk.f11807e = cVar.mo15038c().mo15046c();
        zzk.f11805c = cVar.mo15038c().mo15045b();
        zzk.f11806d = cVar.mo15038c().mo15047d();
        return zzk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 2, this.f11803a);
        C2049b.m9030a(parcel, 3, this.f11804b);
        C2049b.m9030a(parcel, 4, this.f11805c);
        C2049b.m9031a(parcel, 5, this.f11806d);
        C2049b.m9030a(parcel, 6, this.f11807e);
        C2049b.m9026a(parcel, a);
    }
}
