package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@C2478La
public final class zzaej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaej> CREATOR = new C3286mb();

    /* renamed from: A */
    public final String f10778A;

    /* renamed from: B */
    public final boolean f10779B;

    /* renamed from: C */
    public final boolean f10780C;

    /* renamed from: D */
    public final zzaig f10781D;

    /* renamed from: E */
    public final List<String> f10782E;

    /* renamed from: F */
    public final List<String> f10783F;

    /* renamed from: G */
    public final boolean f10784G;

    /* renamed from: H */
    public final zzael f10785H;

    /* renamed from: I */
    public final boolean f10786I;

    /* renamed from: J */
    public String f10787J;

    /* renamed from: K */
    public final List<String> f10788K;

    /* renamed from: L */
    public final boolean f10789L;

    /* renamed from: M */
    public final String f10790M;

    /* renamed from: N */
    public final zzaiq f10791N;

    /* renamed from: O */
    public final String f10792O;

    /* renamed from: P */
    public final boolean f10793P;

    /* renamed from: Q */
    public final boolean f10794Q;

    /* renamed from: R */
    private Bundle f10795R;

    /* renamed from: S */
    public final boolean f10796S;

    /* renamed from: T */
    public final int f10797T;

    /* renamed from: U */
    public final boolean f10798U;

    /* renamed from: V */
    public final List<String> f10799V;

    /* renamed from: W */
    public final boolean f10800W;

    /* renamed from: X */
    public final String f10801X;

    /* renamed from: a */
    private zzaef f10802a;

    /* renamed from: b */
    private final int f10803b;

    /* renamed from: c */
    public final String f10804c;

    /* renamed from: d */
    public String f10805d;

    /* renamed from: e */
    public final List<String> f10806e;

    /* renamed from: f */
    public final int f10807f;

    /* renamed from: g */
    public final List<String> f10808g;

    /* renamed from: h */
    public final long f10809h;

    /* renamed from: i */
    public final boolean f10810i;

    /* renamed from: j */
    public final long f10811j;

    /* renamed from: k */
    public final List<String> f10812k;

    /* renamed from: l */
    public final long f10813l;

    /* renamed from: m */
    public final int f10814m;

    /* renamed from: n */
    public final String f10815n;

    /* renamed from: o */
    public final long f10816o;

    /* renamed from: p */
    public final String f10817p;

    /* renamed from: q */
    public final boolean f10818q;

    /* renamed from: r */
    public final String f10819r;

    /* renamed from: s */
    public final String f10820s;

    /* renamed from: t */
    public final boolean f10821t;

    /* renamed from: u */
    public final boolean f10822u;

    /* renamed from: v */
    public final boolean f10823v;

    /* renamed from: w */
    public final boolean f10824w;

    /* renamed from: x */
    public final boolean f10825x;

    /* renamed from: y */
    private zzaev f10826y;

    /* renamed from: z */
    public String f10827z;

    public zzaej(int i) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, -1, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzaev) null, (String) null, (String) null, false, false, (zzaig) null, (List<String>) null, (List<String>) null, false, (zzael) null, false, (String) null, (List<String>) null, false, (String) null, (zzaiq) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null);
    }

    public zzaej(int i, long j) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, j, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzaev) null, (String) null, (String) null, false, false, (zzaig) null, (List<String>) null, (List<String>) null, false, (zzael) null, false, (String) null, (List<String>) null, false, (String) null, (zzaiq) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null);
    }

    zzaej(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaev zzaev, String str7, String str8, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaiq zzaiq, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12) {
        zzaev zzaev2;
        zzafj zzafj;
        this.f10803b = i;
        this.f10804c = str;
        this.f10805d = str2;
        List<String> list8 = null;
        this.f10806e = list != null ? Collections.unmodifiableList(list) : null;
        this.f10807f = i2;
        this.f10808g = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f10809h = j;
        this.f10810i = z;
        this.f10811j = j2;
        this.f10812k = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f10813l = j3;
        this.f10814m = i3;
        this.f10815n = str3;
        this.f10816o = j4;
        this.f10817p = str4;
        this.f10818q = z2;
        this.f10819r = str5;
        this.f10820s = str6;
        this.f10821t = z3;
        this.f10822u = z4;
        this.f10823v = z5;
        this.f10824w = z6;
        this.f10793P = z13;
        this.f10825x = z7;
        this.f10826y = zzaev;
        this.f10827z = str7;
        this.f10778A = str8;
        if (this.f10805d == null && (zzaev2 = this.f10826y) != null && (zzafj = (zzafj) zzaev2.mo10292a(zzafj.CREATOR)) != null && !TextUtils.isEmpty(zzafj.f10842a)) {
            this.f10805d = zzafj.f10842a;
        }
        this.f10779B = z8;
        this.f10780C = z9;
        this.f10781D = zzaig;
        this.f10782E = list4;
        this.f10783F = list5;
        this.f10784G = z10;
        this.f10785H = zzael;
        this.f10786I = z11;
        this.f10787J = str9;
        this.f10788K = list6;
        this.f10789L = z12;
        this.f10790M = str10;
        this.f10791N = zzaiq;
        this.f10792O = str11;
        this.f10794Q = z14;
        this.f10795R = bundle;
        this.f10796S = z15;
        this.f10797T = i4;
        this.f10798U = z16;
        this.f10799V = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.f10800W = z17;
        this.f10801X = str12;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzaig zzaig, List<String> list4, List<String> list5, boolean z9, zzael zzael, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaiq zzaiq, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, (String) null, str5, z2, z3, z4, z5, false, (zzaev) null, (String) null, str6, z7, z8, zzaig, list4, list5, z9, zzael, z10, str7, list6, z11, str8, zzaiq, str9, z12, z13, (Bundle) null, z14, i2, z15, list7, z16, str10);
        this.f10802a = zzaef;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaiq zzaiq, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, (zzaev) null, (String) null, str7, z8, z9, zzaig, list4, list5, z10, zzael, z11, str8, list6, z12, str9, zzaiq, str10, z13, z14, (Bundle) null, z15, 0, z16, list7, z17, str11);
        this.f10802a = zzaef;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzaef zzaef = this.f10802a;
        if (zzaef != null && zzaef.f10749a >= 9 && !TextUtils.isEmpty(this.f10805d)) {
            this.f10826y = new zzaev((SafeParcelable) new zzafj(this.f10805d));
            this.f10805d = null;
        }
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10803b);
        C2049b.m9038a(parcel, 2, this.f10804c, false);
        C2049b.m9038a(parcel, 3, this.f10805d, false);
        C2049b.m9047b(parcel, 4, this.f10806e, false);
        C2049b.m9030a(parcel, 5, this.f10807f);
        C2049b.m9047b(parcel, 6, this.f10808g, false);
        C2049b.m9031a(parcel, 7, this.f10809h);
        C2049b.m9040a(parcel, 8, this.f10810i);
        C2049b.m9031a(parcel, 9, this.f10811j);
        C2049b.m9047b(parcel, 10, this.f10812k, false);
        C2049b.m9031a(parcel, 11, this.f10813l);
        C2049b.m9030a(parcel, 12, this.f10814m);
        C2049b.m9038a(parcel, 13, this.f10815n, false);
        C2049b.m9031a(parcel, 14, this.f10816o);
        C2049b.m9038a(parcel, 15, this.f10817p, false);
        C2049b.m9040a(parcel, 18, this.f10818q);
        C2049b.m9038a(parcel, 19, this.f10819r, false);
        C2049b.m9038a(parcel, 21, this.f10820s, false);
        C2049b.m9040a(parcel, 22, this.f10821t);
        C2049b.m9040a(parcel, 23, this.f10822u);
        C2049b.m9040a(parcel, 24, this.f10823v);
        C2049b.m9040a(parcel, 25, this.f10824w);
        C2049b.m9040a(parcel, 26, this.f10825x);
        C2049b.m9034a(parcel, 28, (Parcelable) this.f10826y, i, false);
        C2049b.m9038a(parcel, 29, this.f10827z, false);
        C2049b.m9038a(parcel, 30, this.f10778A, false);
        C2049b.m9040a(parcel, 31, this.f10779B);
        C2049b.m9040a(parcel, 32, this.f10780C);
        C2049b.m9034a(parcel, 33, (Parcelable) this.f10781D, i, false);
        C2049b.m9047b(parcel, 34, this.f10782E, false);
        C2049b.m9047b(parcel, 35, this.f10783F, false);
        C2049b.m9040a(parcel, 36, this.f10784G);
        C2049b.m9034a(parcel, 37, (Parcelable) this.f10785H, i, false);
        C2049b.m9040a(parcel, 38, this.f10786I);
        C2049b.m9038a(parcel, 39, this.f10787J, false);
        C2049b.m9047b(parcel, 40, this.f10788K, false);
        C2049b.m9040a(parcel, 42, this.f10789L);
        C2049b.m9038a(parcel, 43, this.f10790M, false);
        C2049b.m9034a(parcel, 44, (Parcelable) this.f10791N, i, false);
        C2049b.m9038a(parcel, 45, this.f10792O, false);
        C2049b.m9040a(parcel, 46, this.f10793P);
        C2049b.m9040a(parcel, 47, this.f10794Q);
        C2049b.m9032a(parcel, 48, this.f10795R, false);
        C2049b.m9040a(parcel, 49, this.f10796S);
        C2049b.m9030a(parcel, 50, this.f10797T);
        C2049b.m9040a(parcel, 51, this.f10798U);
        C2049b.m9047b(parcel, 52, this.f10799V, false);
        C2049b.m9040a(parcel, 53, this.f10800W);
        C2049b.m9038a(parcel, 54, this.f10801X, false);
        C2049b.m9026a(parcel, a);
    }
}
