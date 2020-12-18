package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.hi */
public final class C3146hi {

    /* renamed from: a */
    private final int f9423a;

    /* renamed from: b */
    public final int f9424b;

    /* renamed from: c */
    public final int f9425c;

    private C3146hi(int i, int i2, int i3) {
        this.f9423a = i;
        this.f9425c = i2;
        this.f9424b = i3;
    }

    /* renamed from: a */
    public static C3146hi m12524a(int i, int i2) {
        return new C3146hi(1, i, i2);
    }

    /* renamed from: a */
    public static C3146hi m12525a(zzjn zzjn) {
        return zzjn.f10896d ? new C3146hi(3, 0, 0) : zzjn.f10901i ? new C3146hi(2, 0, 0) : zzjn.f10900h ? m12526b() : m12524a(zzjn.f10898f, zzjn.f10895c);
    }

    /* renamed from: b */
    public static C3146hi m12526b() {
        return new C3146hi(0, 0, 0);
    }

    /* renamed from: c */
    public static C3146hi m12527c() {
        return new C3146hi(4, 0, 0);
    }

    /* renamed from: a */
    public final boolean mo9496a() {
        return this.f9423a == 2;
    }

    /* renamed from: d */
    public final boolean mo9497d() {
        return this.f9423a == 3;
    }

    /* renamed from: e */
    public final boolean mo9498e() {
        return this.f9423a == 0;
    }

    /* renamed from: f */
    public final boolean mo9499f() {
        return this.f9423a == 4;
    }
}
