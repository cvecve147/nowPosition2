package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@C2478La
public final class zzaef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaef> CREATOR = new C3229kb();

    /* renamed from: A */
    public final long f10723A;

    /* renamed from: B */
    public final String f10724B;

    /* renamed from: C */
    public final float f10725C;

    /* renamed from: D */
    public final int f10726D;

    /* renamed from: E */
    public final int f10727E;

    /* renamed from: F */
    public final boolean f10728F;

    /* renamed from: G */
    public final boolean f10729G;

    /* renamed from: H */
    public final String f10730H;

    /* renamed from: I */
    public final boolean f10731I;

    /* renamed from: J */
    public final String f10732J;

    /* renamed from: K */
    public final boolean f10733K;

    /* renamed from: L */
    public final int f10734L;

    /* renamed from: M */
    public final Bundle f10735M;

    /* renamed from: N */
    public final String f10736N;

    /* renamed from: O */
    public final zzlu f10737O;

    /* renamed from: P */
    public final boolean f10738P;

    /* renamed from: Q */
    public final Bundle f10739Q;

    /* renamed from: R */
    public final String f10740R;

    /* renamed from: S */
    public final String f10741S;

    /* renamed from: T */
    public final String f10742T;

    /* renamed from: U */
    public final boolean f10743U;

    /* renamed from: V */
    public final List<Integer> f10744V;

    /* renamed from: W */
    public final String f10745W;

    /* renamed from: X */
    public final List<String> f10746X;

    /* renamed from: Y */
    public final int f10747Y;

    /* renamed from: Z */
    public final boolean f10748Z;

    /* renamed from: a */
    public final int f10749a;

    /* renamed from: aa */
    public final boolean f10750aa;

    /* renamed from: b */
    public final Bundle f10751b;

    /* renamed from: ba */
    public final boolean f10752ba;

    /* renamed from: c */
    public final zzjj f10753c;

    /* renamed from: ca */
    public final ArrayList<String> f10754ca;

    /* renamed from: d */
    public final zzjn f10755d;

    /* renamed from: e */
    public final String f10756e;

    /* renamed from: f */
    public final ApplicationInfo f10757f;

    /* renamed from: g */
    public final PackageInfo f10758g;

    /* renamed from: h */
    public final String f10759h;

    /* renamed from: i */
    public final String f10760i;

    /* renamed from: j */
    public final String f10761j;

    /* renamed from: k */
    public final zzang f10762k;

    /* renamed from: l */
    public final Bundle f10763l;

    /* renamed from: m */
    public final int f10764m;

    /* renamed from: n */
    public final List<String> f10765n;

    /* renamed from: o */
    public final Bundle f10766o;

    /* renamed from: p */
    public final boolean f10767p;

    /* renamed from: q */
    public final int f10768q;

    /* renamed from: r */
    public final int f10769r;

    /* renamed from: s */
    public final float f10770s;

    /* renamed from: t */
    public final String f10771t;

    /* renamed from: u */
    public final long f10772u;

    /* renamed from: v */
    public final String f10773v;

    /* renamed from: w */
    public final List<String> f10774w;

    /* renamed from: x */
    public final String f10775x;

    /* renamed from: y */
    public final zzpl f10776y;

    /* renamed from: z */
    public final List<String> f10777z;

    zzaef(int i, Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzpl zzpl, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this.f10749a = i;
        this.f10751b = bundle;
        this.f10753c = zzjj;
        this.f10755d = zzjn;
        this.f10756e = str;
        this.f10757f = applicationInfo;
        this.f10758g = packageInfo;
        this.f10759h = str2;
        this.f10760i = str3;
        this.f10761j = str4;
        this.f10762k = zzang;
        this.f10763l = bundle2;
        this.f10764m = i2;
        this.f10765n = list;
        this.f10777z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f10766o = bundle3;
        this.f10767p = z;
        this.f10768q = i3;
        this.f10769r = i4;
        this.f10770s = f;
        this.f10771t = str5;
        this.f10772u = j;
        this.f10773v = str6;
        this.f10774w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f10775x = str7;
        this.f10776y = zzpl;
        this.f10723A = j2;
        this.f10724B = str8;
        this.f10725C = f2;
        this.f10731I = z2;
        this.f10726D = i5;
        this.f10727E = i6;
        this.f10728F = z3;
        this.f10729G = z4;
        this.f10730H = str9;
        this.f10732J = str10;
        this.f10733K = z5;
        this.f10734L = i7;
        this.f10735M = bundle4;
        this.f10736N = str11;
        this.f10737O = zzlu;
        this.f10738P = z6;
        this.f10739Q = bundle5;
        this.f10740R = str12;
        this.f10741S = str13;
        this.f10742T = str14;
        this.f10743U = z7;
        this.f10744V = list4;
        this.f10745W = str15;
        this.f10746X = list5;
        this.f10747Y = i8;
        this.f10748Z = z8;
        this.f10750aa = z9;
        this.f10752ba = z10;
        this.f10754ca = arrayList;
    }

    private zzaef(Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzpl zzpl, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this(24, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzang, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzpl, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzlu, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzaef(com.google.android.gms.internal.ads.C3196jb r60, long r61, java.lang.String r63, java.lang.String r64, java.lang.String r65) {
        /*
            r59 = this;
            r0 = r60
            r1 = r59
            r28 = r61
            r46 = r63
            r47 = r64
            r48 = r65
            android.os.Bundle r2 = r0.f9573a
            com.google.android.gms.internal.ads.zzjj r3 = r0.f9574b
            com.google.android.gms.internal.ads.zzjn r4 = r0.f9575c
            java.lang.String r5 = r0.f9576d
            android.content.pm.ApplicationInfo r6 = r0.f9577e
            android.content.pm.PackageInfo r7 = r0.f9578f
            java.util.concurrent.Future<java.lang.String> r8 = r0.f9565Q
            java.lang.String r15 = ""
            java.lang.Object r8 = com.google.android.gms.internal.ads.C2483Lf.m10500a(r8, r15)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r0.f9579g
            java.lang.String r10 = r0.f9580h
            com.google.android.gms.internal.ads.zzang r11 = r0.f9582j
            android.os.Bundle r12 = r0.f9581i
            int r13 = r0.f9583k
            java.util.List<java.lang.String> r14 = r0.f9584l
            r61 = r15
            java.util.List<java.lang.String> r15 = r0.f9585m
            r58 = r1
            r1 = r61
            r61 = r2
            android.os.Bundle r2 = r0.f9587o
            r16 = r2
            boolean r2 = r0.f9588p
            r17 = r2
            int r2 = r0.f9589q
            r18 = r2
            int r2 = r0.f9590r
            r19 = r2
            float r2 = r0.f9591s
            r20 = r2
            java.lang.String r2 = r0.f9592t
            r21 = r2
            r62 = r3
            long r2 = r0.f9593u
            r22 = r2
            java.lang.String r2 = r0.f9594v
            r24 = r2
            java.util.List<java.lang.String> r2 = r0.f9595w
            r25 = r2
            java.lang.String r2 = r0.f9596x
            r26 = r2
            com.google.android.gms.internal.ads.zzpl r2 = r0.f9597y
            r27 = r2
            java.lang.String r2 = r0.f9598z
            r30 = r2
            float r2 = r0.f9549A
            r31 = r2
            boolean r2 = r0.f9550B
            r32 = r2
            int r2 = r0.f9551C
            r33 = r2
            int r2 = r0.f9552D
            r34 = r2
            boolean r2 = r0.f9553E
            r35 = r2
            boolean r2 = r0.f9554F
            r36 = r2
            java.util.concurrent.Future<java.lang.String> r2 = r0.f9555G
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r63 = r4
            r64 = r5
            r4 = 1
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2483Lf.m10501a(r2, r1, (long) r4, (java.util.concurrent.TimeUnit) r3)
            r37 = r1
            java.lang.String r37 = (java.lang.String) r37
            java.lang.String r1 = r0.f9556H
            r38 = r1
            boolean r1 = r0.f9557I
            r39 = r1
            int r1 = r0.f9558J
            r40 = r1
            android.os.Bundle r1 = r0.f9559K
            r41 = r1
            java.lang.String r1 = r0.f9560L
            r42 = r1
            com.google.android.gms.internal.ads.zzlu r1 = r0.f9561M
            r43 = r1
            boolean r1 = r0.f9562N
            r44 = r1
            android.os.Bundle r1 = r0.f9563O
            r45 = r1
            boolean r1 = r0.f9564P
            r49 = r1
            java.util.List<java.lang.Integer> r1 = r0.f9566R
            r50 = r1
            java.lang.String r1 = r0.f9567S
            r51 = r1
            java.util.List<java.lang.String> r1 = r0.f9586n
            r52 = r1
            int r1 = r0.f9568T
            r53 = r1
            boolean r1 = r0.f9569U
            r54 = r1
            boolean r1 = r0.f9570V
            r55 = r1
            boolean r1 = r0.f9571W
            r56 = r1
            java.util.ArrayList<java.lang.String> r0 = r0.f9572X
            r57 = r0
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r1 = r58
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaef.<init>(com.google.android.gms.internal.ads.jb, long, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10749a);
        C2049b.m9032a(parcel, 2, this.f10751b, false);
        C2049b.m9034a(parcel, 3, (Parcelable) this.f10753c, i, false);
        C2049b.m9034a(parcel, 4, (Parcelable) this.f10755d, i, false);
        C2049b.m9038a(parcel, 5, this.f10756e, false);
        C2049b.m9034a(parcel, 6, (Parcelable) this.f10757f, i, false);
        C2049b.m9034a(parcel, 7, (Parcelable) this.f10758g, i, false);
        C2049b.m9038a(parcel, 8, this.f10759h, false);
        C2049b.m9038a(parcel, 9, this.f10760i, false);
        C2049b.m9038a(parcel, 10, this.f10761j, false);
        C2049b.m9034a(parcel, 11, (Parcelable) this.f10762k, i, false);
        C2049b.m9032a(parcel, 12, this.f10763l, false);
        C2049b.m9030a(parcel, 13, this.f10764m);
        C2049b.m9047b(parcel, 14, this.f10765n, false);
        C2049b.m9032a(parcel, 15, this.f10766o, false);
        C2049b.m9040a(parcel, 16, this.f10767p);
        C2049b.m9030a(parcel, 18, this.f10768q);
        C2049b.m9030a(parcel, 19, this.f10769r);
        C2049b.m9029a(parcel, 20, this.f10770s);
        C2049b.m9038a(parcel, 21, this.f10771t, false);
        C2049b.m9031a(parcel, 25, this.f10772u);
        C2049b.m9038a(parcel, 26, this.f10773v, false);
        C2049b.m9047b(parcel, 27, this.f10774w, false);
        C2049b.m9038a(parcel, 28, this.f10775x, false);
        C2049b.m9034a(parcel, 29, (Parcelable) this.f10776y, i, false);
        C2049b.m9047b(parcel, 30, this.f10777z, false);
        C2049b.m9031a(parcel, 31, this.f10723A);
        C2049b.m9038a(parcel, 33, this.f10724B, false);
        C2049b.m9029a(parcel, 34, this.f10725C);
        C2049b.m9030a(parcel, 35, this.f10726D);
        C2049b.m9030a(parcel, 36, this.f10727E);
        C2049b.m9040a(parcel, 37, this.f10728F);
        C2049b.m9040a(parcel, 38, this.f10729G);
        C2049b.m9038a(parcel, 39, this.f10730H, false);
        C2049b.m9040a(parcel, 40, this.f10731I);
        C2049b.m9038a(parcel, 41, this.f10732J, false);
        C2049b.m9040a(parcel, 42, this.f10733K);
        C2049b.m9030a(parcel, 43, this.f10734L);
        C2049b.m9032a(parcel, 44, this.f10735M, false);
        C2049b.m9038a(parcel, 45, this.f10736N, false);
        C2049b.m9034a(parcel, 46, (Parcelable) this.f10737O, i, false);
        C2049b.m9040a(parcel, 47, this.f10738P);
        C2049b.m9032a(parcel, 48, this.f10739Q, false);
        C2049b.m9038a(parcel, 49, this.f10740R, false);
        C2049b.m9038a(parcel, 50, this.f10741S, false);
        C2049b.m9038a(parcel, 51, this.f10742T, false);
        C2049b.m9040a(parcel, 52, this.f10743U);
        C2049b.m9039a(parcel, 53, this.f10744V, false);
        C2049b.m9038a(parcel, 54, this.f10745W, false);
        C2049b.m9047b(parcel, 55, this.f10746X, false);
        C2049b.m9030a(parcel, 56, this.f10747Y);
        C2049b.m9040a(parcel, 57, this.f10748Z);
        C2049b.m9040a(parcel, 58, this.f10750aa);
        C2049b.m9040a(parcel, 59, this.f10752ba);
        C2049b.m9047b(parcel, 60, this.f10754ca, false);
        C2049b.m9026a(parcel, a);
    }
}
