package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.List;

@C2478La
public final class zzaey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaey> CREATOR = new C3628yb();

    /* renamed from: a */
    private final Bundle f10833a;

    /* renamed from: b */
    private final zzang f10834b;

    /* renamed from: c */
    private final ApplicationInfo f10835c;

    /* renamed from: d */
    private final String f10836d;

    /* renamed from: e */
    private final List<String> f10837e;

    /* renamed from: f */
    private final PackageInfo f10838f;

    /* renamed from: g */
    private final String f10839g;

    /* renamed from: h */
    private final boolean f10840h;

    /* renamed from: i */
    private final String f10841i;

    public zzaey(Bundle bundle, zzang zzang, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f10833a = bundle;
        this.f10834b = zzang;
        this.f10836d = str;
        this.f10835c = applicationInfo;
        this.f10837e = list;
        this.f10838f = packageInfo;
        this.f10839g = str2;
        this.f10840h = z;
        this.f10841i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9032a(parcel, 1, this.f10833a, false);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f10834b, i, false);
        C2049b.m9034a(parcel, 3, (Parcelable) this.f10835c, i, false);
        C2049b.m9038a(parcel, 4, this.f10836d, false);
        C2049b.m9047b(parcel, 5, this.f10837e, false);
        C2049b.m9034a(parcel, 6, (Parcelable) this.f10838f, i, false);
        C2049b.m9038a(parcel, 7, this.f10839g, false);
        C2049b.m9040a(parcel, 8, this.f10840h);
        C2049b.m9038a(parcel, 9, this.f10841i, false);
        C2049b.m9026a(parcel, a);
    }
}
