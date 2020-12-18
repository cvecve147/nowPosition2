package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.C1817m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public class zzjn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjn> CREATOR = new C3101ft();

    /* renamed from: a */
    public final String f10893a;

    /* renamed from: b */
    public final int f10894b;

    /* renamed from: c */
    public final int f10895c;

    /* renamed from: d */
    public final boolean f10896d;

    /* renamed from: e */
    public final int f10897e;

    /* renamed from: f */
    public final int f10898f;

    /* renamed from: g */
    public final zzjn[] f10899g;

    /* renamed from: h */
    public final boolean f10900h;

    /* renamed from: i */
    public final boolean f10901i;

    /* renamed from: j */
    public boolean f10902j;

    public zzjn() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzjn[]) null, false, false, false);
    }

    public zzjn(Context context, C1642d dVar) {
        this(context, new C1642d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzjn(android.content.Context r12, com.google.android.gms.ads.C1642d[] r13) {
        /*
            r11 = this;
            r11.<init>()
            r0 = 0
            r1 = r13[r0]
            r11.f10896d = r0
            boolean r2 = r1.mo6582c()
            r11.f10901i = r2
            boolean r2 = r11.f10901i
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C1642d.f5458a
            int r2 = r2.mo6580b()
            r11.f10897e = r2
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C1642d.f5458a
            int r2 = r2.mo6578a()
            goto L_0x002b
        L_0x0021:
            int r2 = r1.mo6580b()
            r11.f10897e = r2
            int r2 = r1.mo6578a()
        L_0x002b:
            r11.f10894b = r2
            int r2 = r11.f10897e
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0035
            r2 = r4
            goto L_0x0036
        L_0x0035:
            r2 = r0
        L_0x0036:
            int r3 = r11.f10894b
            r5 = -2
            if (r3 != r5) goto L_0x003d
            r3 = r4
            goto L_0x003e
        L_0x003d:
            r3 = r0
        L_0x003e:
            android.content.res.Resources r5 = r12.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            boolean r6 = com.google.android.gms.internal.ads.C3432rf.m13615g(r12)
            if (r6 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            boolean r6 = com.google.android.gms.internal.ads.C3432rf.m13616h(r12)
            if (r6 == 0) goto L_0x0065
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            int r7 = com.google.android.gms.internal.ads.C3432rf.m13617i(r12)
            int r6 = r6 - r7
            goto L_0x0067
        L_0x0065:
            int r6 = r5.widthPixels
        L_0x0067:
            r11.f10898f = r6
            int r6 = r11.f10898f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x008c
            int r8 = r8 + 1
            goto L_0x008c
        L_0x007f:
            int r8 = r11.f10897e
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            int r6 = r11.f10897e
            int r6 = com.google.android.gms.internal.ads.C3432rf.m13596a((android.util.DisplayMetrics) r5, (int) r6)
            r11.f10898f = r6
        L_0x008c:
            if (r3 == 0) goto L_0x0093
            int r6 = m14779c(r5)
            goto L_0x0095
        L_0x0093:
            int r6 = r11.f10894b
        L_0x0095:
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            int r5 = com.google.android.gms.internal.ads.C3432rf.m13596a((android.util.DisplayMetrics) r5, (int) r6)
            r11.f10895c = r5
            if (r2 != 0) goto L_0x00af
            if (r3 == 0) goto L_0x00a3
            goto L_0x00af
        L_0x00a3:
            boolean r2 = r11.f10901i
            if (r2 == 0) goto L_0x00aa
            java.lang.String r1 = "320x50_mb"
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r1 = r1.toString()
            goto L_0x00ca
        L_0x00af:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00ca:
            r11.f10893a = r1
            int r1 = r13.length
            if (r1 <= r4) goto L_0x00e6
            int r1 = r13.length
            com.google.android.gms.internal.ads.zzjn[] r1 = new com.google.android.gms.internal.ads.zzjn[r1]
            r11.f10899g = r1
            r1 = r0
        L_0x00d5:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x00e9
            com.google.android.gms.internal.ads.zzjn[] r2 = r11.f10899g
            com.google.android.gms.internal.ads.zzjn r3 = new com.google.android.gms.internal.ads.zzjn
            r4 = r13[r1]
            r3.<init>((android.content.Context) r12, (com.google.android.gms.ads.C1642d) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00e6:
            r12 = 0
            r11.f10899g = r12
        L_0x00e9:
            r11.f10900h = r0
            r11.f10902j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjn.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public zzjn(zzjn zzjn, zzjn[] zzjnArr) {
        this(zzjn.f10893a, zzjn.f10894b, zzjn.f10895c, zzjn.f10896d, zzjn.f10897e, zzjn.f10898f, zzjnArr, zzjn.f10900h, zzjn.f10901i, zzjn.f10902j);
    }

    zzjn(String str, int i, int i2, boolean z, int i3, int i4, zzjn[] zzjnArr, boolean z2, boolean z3, boolean z4) {
        this.f10893a = str;
        this.f10894b = i;
        this.f10895c = i2;
        this.f10896d = z;
        this.f10897e = i3;
        this.f10898f = i4;
        this.f10899g = zzjnArr;
        this.f10900h = z2;
        this.f10901i = z3;
        this.f10902j = z4;
    }

    /* renamed from: a */
    public static int m14775a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static zzjn m14776a(Context context) {
        return new zzjn("320x50_mb", 0, 0, false, 0, 0, (zzjn[]) null, true, false, false);
    }

    /* renamed from: b */
    public static int m14777b(DisplayMetrics displayMetrics) {
        return (int) (((float) m14779c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: b */
    public static zzjn m14778b() {
        return new zzjn("reward_mb", 0, 0, true, 0, 0, (zzjn[]) null, false, false, false);
    }

    /* renamed from: c */
    private static int m14779c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: c */
    public final C1642d mo10314c() {
        return C1817m.m8088a(this.f10897e, this.f10894b, this.f10893a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10893a, false);
        C2049b.m9030a(parcel, 3, this.f10894b);
        C2049b.m9030a(parcel, 4, this.f10895c);
        C2049b.m9040a(parcel, 5, this.f10896d);
        C2049b.m9030a(parcel, 6, this.f10897e);
        C2049b.m9030a(parcel, 7, this.f10898f);
        C2049b.m9042a(parcel, 8, (T[]) this.f10899g, i, false);
        C2049b.m9040a(parcel, 9, this.f10900h);
        C2049b.m9040a(parcel, 10, this.f10901i);
        C2049b.m9040a(parcel, 11, this.f10902j);
        C2049b.m9026a(parcel, a);
    }
}
