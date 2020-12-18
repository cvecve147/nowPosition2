package p101d.p129g.p131b.p132a.p137e.p140c;

/* renamed from: d.g.b.a.e.c.c */
public final class C5503c {

    /* renamed from: a */
    private static final C5505d f15412a;

    /* renamed from: b */
    private static final int f15413b;

    /* renamed from: d.g.b.a.e.c.c$a */
    static final class C5504a extends C5505d {
        C5504a() {
        }

        /* renamed from: a */
        public final void mo14951a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m21007a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            d.g.b.a.e.c.h r2 = new d.g.b.a.e.c.h     // Catch:{ Throwable -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0063
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            d.g.b.a.e.c.g r2 = new d.g.b.a.e.c.g     // Catch:{ Throwable -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0063
        L_0x0024:
            d.g.b.a.e.c.c$a r2 = new d.g.b.a.e.c.c$a     // Catch:{ Throwable -> 0x002a }
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
            java.lang.Class<d.g.b.a.e.c.c$a> r4 = p101d.p129g.p131b.p132a.p137e.p140c.C5503c.C5504a.class
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
            d.g.b.a.e.c.c$a r2 = new d.g.b.a.e.c.c$a
            r2.<init>()
        L_0x0063:
            f15412a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f15413b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p131b.p132a.p137e.p140c.C5503c.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m21007a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m21008a(Throwable th, Throwable th2) {
        f15412a.mo14951a(th, th2);
    }
}
