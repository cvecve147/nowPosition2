package p101d.p129g.p131b.p132a.p137e.p139b;

/* renamed from: d.g.b.a.e.b.g */
public final class C5494g {

    /* renamed from: a */
    private static final C5496h f15402a;

    /* renamed from: b */
    private static final int f15403b;

    /* renamed from: d.g.b.a.e.b.g$a */
    static final class C5495a extends C5496h {
        C5495a() {
        }

        /* renamed from: a */
        public final void mo14944a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m20997a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            d.g.b.a.e.b.l r2 = new d.g.b.a.e.b.l     // Catch:{ Throwable -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0063
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            d.g.b.a.e.b.k r2 = new d.g.b.a.e.b.k     // Catch:{ Throwable -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0063
        L_0x0024:
            d.g.b.a.e.b.g$a r2 = new d.g.b.a.e.b.g$a     // Catch:{ Throwable -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<d.g.b.a.e.b.g$a> r4 = p101d.p129g.p131b.p132a.p137e.p139b.C5494g.C5495a.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 132
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            d.g.b.a.e.b.g$a r2 = new d.g.b.a.e.b.g$a
            r2.<init>()
        L_0x0063:
            f15402a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f15403b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p131b.p132a.p137e.p139b.C5494g.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m20997a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m20998a(Throwable th, Throwable th2) {
        f15402a.mo14944a(th, th2);
    }
}
