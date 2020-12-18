package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzang extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzang> CREATOR = new C2284Ef();

    /* renamed from: a */
    public String f10855a;

    /* renamed from: b */
    public int f10856b;

    /* renamed from: c */
    public int f10857c;

    /* renamed from: d */
    public boolean f10858d;

    /* renamed from: e */
    public boolean f10859e;

    public zzang(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzang(int i, int i2, boolean z, boolean z2) {
        this((int) C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, false, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzang(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            int r0 = r12.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.<init>(int, int, boolean, boolean, boolean):void");
    }

    zzang(String str, int i, int i2, boolean z, boolean z2) {
        this.f10855a = str;
        this.f10856b = i;
        this.f10857c = i2;
        this.f10858d = z;
        this.f10859e = z2;
    }

    /* renamed from: b */
    public static zzang m14766b() {
        return new zzang(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10855a, false);
        C2049b.m9030a(parcel, 3, this.f10856b);
        C2049b.m9030a(parcel, 4, this.f10857c);
        C2049b.m9040a(parcel, 5, this.f10858d);
        C2049b.m9040a(parcel, 6, this.f10859e);
        C2049b.m9026a(parcel, a);
    }
}
