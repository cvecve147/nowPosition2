package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.In */
final class C2407In {

    /* renamed from: A */
    private int f7263A;

    /* renamed from: B */
    private int f7264B;

    /* renamed from: C */
    private Field f7265C;

    /* renamed from: D */
    private Object f7266D;

    /* renamed from: E */
    private Object f7267E;

    /* renamed from: F */
    private Object f7268F;

    /* renamed from: a */
    private final C2435Jn f7269a;

    /* renamed from: b */
    private final Object[] f7270b;

    /* renamed from: c */
    private Class<?> f7271c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f7272d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f7273e;

    /* renamed from: f */
    private final int f7274f;

    /* renamed from: g */
    private final int f7275g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f7276h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f7277i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f7278j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f7279k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f7280l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f7281m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int[] f7282n;

    /* renamed from: o */
    private int f7283o;

    /* renamed from: p */
    private int f7284p;

    /* renamed from: q */
    private int f7285q = Integer.MAX_VALUE;

    /* renamed from: r */
    private int f7286r = Integer.MIN_VALUE;

    /* renamed from: s */
    private int f7287s = 0;

    /* renamed from: t */
    private int f7288t = 0;

    /* renamed from: u */
    private int f7289u = 0;

    /* renamed from: v */
    private int f7290v = 0;

    /* renamed from: w */
    private int f7291w = 0;

    /* renamed from: x */
    private int f7292x;

    /* renamed from: y */
    private int f7293y;

    /* renamed from: z */
    private int f7294z;

    C2407In(Class<?> cls, String str, Object[] objArr) {
        this.f7271c = cls;
        this.f7269a = new C2435Jn(str);
        this.f7270b = objArr;
        this.f7272d = this.f7269a.mo8379b();
        this.f7273e = this.f7269a.mo8379b();
        int[] iArr = null;
        if (this.f7273e == 0) {
            this.f7274f = 0;
            this.f7275g = 0;
            this.f7276h = 0;
            this.f7277i = 0;
            this.f7278j = 0;
            this.f7280l = 0;
            this.f7279k = 0;
            this.f7281m = 0;
            this.f7282n = null;
            return;
        }
        this.f7274f = this.f7269a.mo8379b();
        this.f7275g = this.f7269a.mo8379b();
        this.f7276h = this.f7269a.mo8379b();
        this.f7277i = this.f7269a.mo8379b();
        this.f7280l = this.f7269a.mo8379b();
        this.f7279k = this.f7269a.mo8379b();
        this.f7278j = this.f7269a.mo8379b();
        this.f7281m = this.f7269a.mo8379b();
        int b = this.f7269a.mo8379b();
        this.f7282n = b != 0 ? new int[b] : iArr;
        this.f7283o = (this.f7274f << 1) + this.f7275g;
    }

    /* renamed from: a */
    private static Field m10282a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: p */
    private final Object m10291p() {
        Object[] objArr = this.f7270b;
        int i = this.f7283o;
        this.f7283o = i + 1;
        return objArr[i];
    }

    /* renamed from: q */
    private final boolean m10292q() {
        return (this.f7272d & 1) == 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (m10292q() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r1 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (m10292q() != false) goto L_0x00d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8347a() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Jn r0 = r5.f7269a
            boolean r0 = r0.mo8378a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.gms.internal.ads.Jn r0 = r5.f7269a
            int r0 = r0.mo8379b()
            r5.f7292x = r0
            com.google.android.gms.internal.ads.Jn r0 = r5.f7269a
            int r0 = r0.mo8379b()
            r5.f7293y = r0
            int r0 = r5.f7293y
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f7294z = r0
            int r0 = r5.f7292x
            int r2 = r5.f7285q
            if (r0 >= r2) goto L_0x0028
            r5.f7285q = r0
        L_0x0028:
            int r0 = r5.f7292x
            int r2 = r5.f7286r
            if (r0 <= r2) goto L_0x0030
            r5.f7286r = r0
        L_0x0030:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.MAP
            int r2 = r2.mo8377a()
            r3 = 1
            if (r0 != r2) goto L_0x0041
            int r0 = r5.f7287s
            int r0 = r0 + r3
            r5.f7287s = r0
            goto L_0x005a
        L_0x0041:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.DOUBLE_LIST
            int r2 = r2.mo8377a()
            if (r0 < r2) goto L_0x005a
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.GROUP_LIST
            int r2 = r2.mo8377a()
            if (r0 > r2) goto L_0x005a
            int r0 = r5.f7288t
            int r0 = r0 + r3
            r5.f7288t = r0
        L_0x005a:
            int r0 = r5.f7291w
            int r0 = r0 + r3
            r5.f7291w = r0
            int r0 = r5.f7285q
            int r2 = r5.f7292x
            int r4 = r5.f7291w
            boolean r0 = com.google.android.gms.internal.ads.C2551Nn.m10700a((int) r0, (int) r2, (int) r4)
            if (r0 == 0) goto L_0x0076
            int r0 = r5.f7292x
            int r0 = r0 + r3
            r5.f7290v = r0
            int r0 = r5.f7290v
            int r2 = r5.f7285q
            int r0 = r0 - r2
            goto L_0x0079
        L_0x0076:
            int r0 = r5.f7289u
            int r0 = r0 + r3
        L_0x0079:
            r5.f7289u = r0
            int r0 = r5.f7293y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0083
            r0 = r3
            goto L_0x0084
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 == 0) goto L_0x0092
            int[] r0 = r5.f7282n
            int r2 = r5.f7284p
            int r4 = r2 + 1
            r5.f7284p = r4
            int r4 = r5.f7292x
            r0[r2] = r4
        L_0x0092:
            r0 = 0
            r5.f7266D = r0
            r5.f7267E = r0
            r5.f7268F = r0
            boolean r0 = r5.mo8350d()
            if (r0 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.Jn r0 = r5.f7269a
            int r0 = r0.mo8379b()
            r5.f7263A = r0
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r1 = com.google.android.gms.internal.ads.C2434Jm.MESSAGE
            int r1 = r1.mo8377a()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00da
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r1 = com.google.android.gms.internal.ads.C2434Jm.GROUP
            int r1 = r1.mo8377a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00c0
            goto L_0x00da
        L_0x00c0:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r1 = com.google.android.gms.internal.ads.C2434Jm.ENUM
            int r1 = r1.mo8377a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0171
            boolean r0 = r5.m10292q()
            if (r0 == 0) goto L_0x0171
        L_0x00d2:
            java.lang.Object r0 = r5.m10291p()
            r5.f7267E = r0
            goto L_0x0171
        L_0x00da:
            java.lang.Object r0 = r5.m10291p()
        L_0x00de:
            r5.f7266D = r0
            goto L_0x0171
        L_0x00e2:
            java.lang.Class<?> r0 = r5.f7271c
            java.lang.Object r2 = r5.m10291p()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = m10282a(r0, r2)
            r5.f7265C = r0
            boolean r0 = r5.mo8354h()
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.internal.ads.Jn r0 = r5.f7269a
            int r0 = r0.mo8379b()
            r5.f7264B = r0
        L_0x00fe:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.MESSAGE
            int r2 = r2.mo8377a()
            if (r0 == r2) goto L_0x0169
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.GROUP
            int r2 = r2.mo8377a()
            if (r0 != r2) goto L_0x0113
            goto L_0x0169
        L_0x0113:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.MESSAGE_LIST
            int r2 = r2.mo8377a()
            if (r0 == r2) goto L_0x00da
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.GROUP_LIST
            int r2 = r2.mo8377a()
            if (r0 != r2) goto L_0x0128
            goto L_0x00da
        L_0x0128:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.ENUM
            int r2 = r2.mo8377a()
            if (r0 == r2) goto L_0x0161
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.ENUM_LIST
            int r2 = r2.mo8377a()
            if (r0 == r2) goto L_0x0161
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.ENUM_LIST_PACKED
            int r2 = r2.mo8377a()
            if (r0 != r2) goto L_0x0147
            goto L_0x0161
        L_0x0147:
            int r0 = r5.f7294z
            com.google.android.gms.internal.ads.Jm r2 = com.google.android.gms.internal.ads.C2434Jm.MAP
            int r2 = r2.mo8377a()
            if (r0 != r2) goto L_0x0171
            java.lang.Object r0 = r5.m10291p()
            r5.f7268F = r0
            int r0 = r5.f7293y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015e
            r1 = r3
        L_0x015e:
            if (r1 == 0) goto L_0x0171
            goto L_0x0167
        L_0x0161:
            boolean r0 = r5.m10292q()
            if (r0 == 0) goto L_0x0171
        L_0x0167:
            goto L_0x00d2
        L_0x0169:
            java.lang.reflect.Field r0 = r5.f7265C
            java.lang.Class r0 = r0.getType()
            goto L_0x00de
        L_0x0171:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2407In.mo8347a():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo8348b() {
        return this.f7292x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo8349c() {
        return this.f7294z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo8350d() {
        return this.f7294z > C2434Jm.MAP.mo8377a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Field mo8351e() {
        int i = this.f7263A << 1;
        Object obj = this.f7270b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m10282a(this.f7271c, (String) obj);
        this.f7270b[i] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Field mo8352f() {
        int i = (this.f7263A << 1) + 1;
        Object obj = this.f7270b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m10282a(this.f7271c, (String) obj);
        this.f7270b[i] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Field mo8353g() {
        return this.f7265C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo8354h() {
        return m10292q() && this.f7294z <= C2434Jm.GROUP.mo8377a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Field mo8355i() {
        int i = (this.f7274f << 1) + (this.f7264B / 32);
        Object obj = this.f7270b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m10282a(this.f7271c, (String) obj);
        this.f7270b[i] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo8356j() {
        return this.f7264B % 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo8357k() {
        return (this.f7293y & 256) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo8358l() {
        return (this.f7293y & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Object mo8359m() {
        return this.f7266D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Object mo8360n() {
        return this.f7267E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object mo8361o() {
        return this.f7268F;
    }
}
