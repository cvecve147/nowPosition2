package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.zzjn;
import org.apache.http.HttpStatus;

/* renamed from: com.google.android.gms.ads.d */
public final class C1642d {

    /* renamed from: a */
    public static final C1642d f5458a = new C1642d(320, 50, "320x50_mb");

    /* renamed from: b */
    public static final C1642d f5459b = new C1642d(468, 60, "468x60_as");

    /* renamed from: c */
    public static final C1642d f5460c = new C1642d(320, 100, "320x100_as");

    /* renamed from: d */
    public static final C1642d f5461d = new C1642d(728, 90, "728x90_as");

    /* renamed from: e */
    public static final C1642d f5462e = new C1642d(HttpStatus.SC_MULTIPLE_CHOICES, 250, "300x250_as");

    /* renamed from: f */
    public static final C1642d f5463f = new C1642d(160, 600, "160x600_as");

    /* renamed from: g */
    public static final C1642d f5464g = new C1642d(-1, -2, "smart_banner");

    /* renamed from: h */
    public static final C1642d f5465h = new C1642d(-3, -4, "fluid");

    /* renamed from: i */
    public static final C1642d f5466i = new C1642d(50, 50, "50x50_mb");

    /* renamed from: j */
    public static final C1642d f5467j = new C1642d(-3, 0, "search_v2");

    /* renamed from: k */
    private final int f5468k;

    /* renamed from: l */
    private final int f5469l;

    /* renamed from: m */
    private final String f5470m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1642d(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x000a:
            r1 = -2
            if (r6 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 4
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.C1642d.<init>(int, int):void");
    }

    C1642d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f5468k = i;
            this.f5469l = i2;
            this.f5470m = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final int mo6578a() {
        return this.f5469l;
    }

    /* renamed from: a */
    public final int mo6579a(Context context) {
        int i = this.f5469l;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzjn.m14777b(context.getResources().getDisplayMetrics());
        }
        C3390pt.m13453a();
        return C3432rf.m13595a(context, this.f5469l);
    }

    /* renamed from: b */
    public final int mo6580b() {
        return this.f5468k;
    }

    /* renamed from: b */
    public final int mo6581b(Context context) {
        int i = this.f5468k;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -1) {
            return zzjn.m14775a(context.getResources().getDisplayMetrics());
        }
        C3390pt.m13453a();
        return C3432rf.m13595a(context, this.f5468k);
    }

    /* renamed from: c */
    public final boolean mo6582c() {
        return this.f5468k == -3 && this.f5469l == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1642d)) {
            return false;
        }
        C1642d dVar = (C1642d) obj;
        return this.f5468k == dVar.f5468k && this.f5469l == dVar.f5469l && this.f5470m.equals(dVar.f5470m);
    }

    public final int hashCode() {
        return this.f5470m.hashCode();
    }

    public final String toString() {
        return this.f5470m;
    }
}
