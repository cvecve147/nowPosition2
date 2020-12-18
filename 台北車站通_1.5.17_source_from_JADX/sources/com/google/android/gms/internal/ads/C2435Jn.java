package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jn */
final class C2435Jn {

    /* renamed from: a */
    private final String f7379a;

    /* renamed from: b */
    private int f7380b = 0;

    C2435Jn(String str) {
        this.f7379a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8378a() {
        return this.f7380b < this.f7379a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo8379b() {
        String str = this.f7379a;
        int i = this.f7380b;
        this.f7380b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f7379a;
            int i3 = this.f7380b;
            this.f7380b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
