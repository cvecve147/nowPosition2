package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.jo */
final class C3210jo {

    /* renamed from: a */
    private static final Logger f9612a = Logger.getLogger(C3210jo.class.getName());

    /* renamed from: b */
    private static final Unsafe f9613b = m12751d();

    /* renamed from: c */
    private static final Class<?> f9614c = C3007cm.m12091b();

    /* renamed from: d */
    private static final boolean f9615d = m12748c(Long.TYPE);

    /* renamed from: e */
    private static final boolean f9616e = m12748c(Integer.TYPE);

    /* renamed from: f */
    private static final C3214d f9617f;

    /* renamed from: g */
    private static final boolean f9618g = m12758f();

    /* renamed from: h */
    private static final boolean f9619h = m12756e();

    /* renamed from: i */
    private static final long f9620i = ((long) m12726a((Class<?>) byte[].class));

    /* renamed from: j */
    private static final long f9621j = ((long) m12726a((Class<?>) boolean[].class));

    /* renamed from: k */
    private static final long f9622k = ((long) m12739b((Class<?>) boolean[].class));

    /* renamed from: l */
    private static final long f9623l = ((long) m12726a((Class<?>) int[].class));

    /* renamed from: m */
    private static final long f9624m = ((long) m12739b((Class<?>) int[].class));

    /* renamed from: n */
    private static final long f9625n = ((long) m12726a((Class<?>) long[].class));

    /* renamed from: o */
    private static final long f9626o = ((long) m12739b((Class<?>) long[].class));

    /* renamed from: p */
    private static final long f9627p = ((long) m12726a((Class<?>) float[].class));

    /* renamed from: q */
    private static final long f9628q = ((long) m12739b((Class<?>) float[].class));

    /* renamed from: r */
    private static final long f9629r = ((long) m12726a((Class<?>) double[].class));

    /* renamed from: s */
    private static final long f9630s = ((long) m12739b((Class<?>) double[].class));

    /* renamed from: t */
    private static final long f9631t = ((long) m12726a((Class<?>) Object[].class));

    /* renamed from: u */
    private static final long f9632u = ((long) m12739b((Class<?>) Object[].class));

    /* renamed from: v */
    private static final long f9633v = m12741b(m12760g());

    /* renamed from: w */
    private static final long f9634w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final boolean f9635x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.jo$a */
    static final class C3211a extends C3214d {
        C3211a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo9597a(Object obj, long j, byte b) {
            if (C3210jo.f9635x) {
                C3210jo.m12745c(obj, j, b);
            } else {
                C3210jo.m12752d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo9598a(Object obj, long j, double d) {
            mo9608a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo9599a(Object obj, long j, float f) {
            mo9607a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo9600a(Object obj, long j, boolean z) {
            if (C3210jo.f9635x) {
                C3210jo.m12753d(obj, j, z);
            } else {
                C3210jo.m12755e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final boolean mo9601c(Object obj, long j) {
            return C3210jo.f9635x ? C3210jo.m12766m(obj, j) : C3210jo.m12767n(obj, j);
        }

        /* renamed from: d */
        public final float mo9602d(Object obj, long j) {
            return Float.intBitsToFloat(mo9605a(obj, j));
        }

        /* renamed from: e */
        public final double mo9603e(Object obj, long j) {
            return Double.longBitsToDouble(mo9609b(obj, j));
        }

        /* renamed from: f */
        public final byte mo9604f(Object obj, long j) {
            return C3210jo.f9635x ? C3210jo.m12764k(obj, j) : C3210jo.m12765l(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jo$b */
    static final class C3212b extends C3214d {
        C3212b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo9597a(Object obj, long j, byte b) {
            if (C3210jo.f9635x) {
                C3210jo.m12745c(obj, j, b);
            } else {
                C3210jo.m12752d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo9598a(Object obj, long j, double d) {
            mo9608a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo9599a(Object obj, long j, float f) {
            mo9607a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo9600a(Object obj, long j, boolean z) {
            if (C3210jo.f9635x) {
                C3210jo.m12753d(obj, j, z);
            } else {
                C3210jo.m12755e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final boolean mo9601c(Object obj, long j) {
            return C3210jo.f9635x ? C3210jo.m12766m(obj, j) : C3210jo.m12767n(obj, j);
        }

        /* renamed from: d */
        public final float mo9602d(Object obj, long j) {
            return Float.intBitsToFloat(mo9605a(obj, j));
        }

        /* renamed from: e */
        public final double mo9603e(Object obj, long j) {
            return Double.longBitsToDouble(mo9609b(obj, j));
        }

        /* renamed from: f */
        public final byte mo9604f(Object obj, long j) {
            return C3210jo.f9635x ? C3210jo.m12764k(obj, j) : C3210jo.m12765l(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jo$c */
    static final class C3213c extends C3214d {
        C3213c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo9597a(Object obj, long j, byte b) {
            this.f9636a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo9598a(Object obj, long j, double d) {
            this.f9636a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo9599a(Object obj, long j, float f) {
            this.f9636a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo9600a(Object obj, long j, boolean z) {
            this.f9636a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final boolean mo9601c(Object obj, long j) {
            return this.f9636a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final float mo9602d(Object obj, long j) {
            return this.f9636a.getFloat(obj, j);
        }

        /* renamed from: e */
        public final double mo9603e(Object obj, long j) {
            return this.f9636a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final byte mo9604f(Object obj, long j) {
            return this.f9636a.getByte(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jo$d */
    static abstract class C3214d {

        /* renamed from: a */
        Unsafe f9636a;

        C3214d(Unsafe unsafe) {
            this.f9636a = unsafe;
        }

        /* renamed from: a */
        public final int mo9605a(Object obj, long j) {
            return this.f9636a.getInt(obj, j);
        }

        /* renamed from: a */
        public final long mo9606a(Field field) {
            return this.f9636a.objectFieldOffset(field);
        }

        /* renamed from: a */
        public abstract void mo9597a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo9598a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo9599a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo9607a(Object obj, long j, int i) {
            this.f9636a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo9608a(Object obj, long j, long j2) {
            this.f9636a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo9600a(Object obj, long j, boolean z);

        /* renamed from: b */
        public final long mo9609b(Object obj, long j) {
            return this.f9636a.getLong(obj, j);
        }

        /* renamed from: c */
        public abstract boolean mo9601c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo9602d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo9603e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo9604f(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0105  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.jo> r0 = com.google.android.gms.internal.ads.C3210jo.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f9612a = r0
            sun.misc.Unsafe r0 = m12751d()
            f9613b = r0
            java.lang.Class r0 = com.google.android.gms.internal.ads.C3007cm.m12091b()
            f9614c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = m12748c(r0)
            f9615d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = m12748c(r0)
            f9616e = r0
            sun.misc.Unsafe r0 = f9613b
            r1 = 0
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r0 = r1
            goto L_0x0054
        L_0x002f:
            boolean r0 = com.google.android.gms.internal.ads.C3007cm.m12090a()
            if (r0 == 0) goto L_0x004d
            boolean r0 = f9615d
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.jo$b r0 = new com.google.android.gms.internal.ads.jo$b
            sun.misc.Unsafe r2 = f9613b
            r0.<init>(r2)
            goto L_0x0054
        L_0x0041:
            boolean r0 = f9616e
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.jo$a r0 = new com.google.android.gms.internal.ads.jo$a
            sun.misc.Unsafe r2 = f9613b
            r0.<init>(r2)
            goto L_0x0054
        L_0x004d:
            com.google.android.gms.internal.ads.jo$c r0 = new com.google.android.gms.internal.ads.jo$c
            sun.misc.Unsafe r2 = f9613b
            r0.<init>(r2)
        L_0x0054:
            f9617f = r0
            boolean r0 = m12758f()
            f9618g = r0
            boolean r0 = m12756e()
            f9619h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9620i = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9621j = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9622k = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9623l = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9624m = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9625n = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9626o = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9627p = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9628q = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9629r = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9630s = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m12726a((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9631t = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m12739b((java.lang.Class<?>) r0)
            long r2 = (long) r0
            f9632u = r2
            java.lang.reflect.Field r0 = m12760g()
            long r2 = m12741b((java.lang.reflect.Field) r0)
            f9633v = r2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r2 = "value"
            java.lang.reflect.Field r0 = m12729a((java.lang.Class<?>) r0, (java.lang.String) r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.Class r2 = r0.getType()
            java.lang.Class<char[]> r3 = char[].class
            if (r2 != r3) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r0 = r1
        L_0x00f5:
            long r0 = m12741b((java.lang.reflect.Field) r0)
            f9634w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0105
            r0 = 1
            goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            f9635x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3210jo.<clinit>():void");
    }

    private C3210jo() {
    }

    /* renamed from: a */
    static byte m12725a(byte[] bArr, long j) {
        return f9617f.mo9604f(bArr, f9620i + j);
    }

    /* renamed from: a */
    private static int m12726a(Class<?> cls) {
        if (f9619h) {
            return f9617f.f9636a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m12727a(Object obj, long j) {
        return f9617f.mo9605a(obj, j);
    }

    /* renamed from: a */
    static long m12728a(Field field) {
        return f9617f.mo9606a(field);
    }

    /* renamed from: a */
    private static Field m12729a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m12731a(Object obj, long j, double d) {
        f9617f.mo9598a(obj, j, d);
    }

    /* renamed from: a */
    static void m12732a(Object obj, long j, float f) {
        f9617f.mo9599a(obj, j, f);
    }

    /* renamed from: a */
    static void m12733a(Object obj, long j, int i) {
        f9617f.mo9607a(obj, j, i);
    }

    /* renamed from: a */
    static void m12734a(Object obj, long j, long j2) {
        f9617f.mo9608a(obj, j, j2);
    }

    /* renamed from: a */
    static void m12735a(Object obj, long j, Object obj2) {
        f9617f.f9636a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m12736a(Object obj, long j, boolean z) {
        f9617f.mo9600a(obj, j, z);
    }

    /* renamed from: a */
    static void m12737a(byte[] bArr, long j, byte b) {
        f9617f.mo9597a((Object) bArr, f9620i + j, b);
    }

    /* renamed from: b */
    private static int m12739b(Class<?> cls) {
        if (f9619h) {
            return f9617f.f9636a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m12740b(Object obj, long j) {
        return f9617f.mo9609b(obj, j);
    }

    /* renamed from: b */
    private static long m12741b(Field field) {
        C3214d dVar;
        if (field == null || (dVar = f9617f) == null) {
            return -1;
        }
        return dVar.mo9606a(field);
    }

    /* renamed from: b */
    static boolean m12744b() {
        return f9619h;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m12745c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int a = m12727a(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m12733a(obj, j2, ((255 & b) << i) | (a & (~(255 << i))));
    }

    /* renamed from: c */
    static boolean m12747c() {
        return f9618g;
    }

    /* renamed from: c */
    private static boolean m12748c(Class<?> cls) {
        if (!C3007cm.m12090a()) {
            return false;
        }
        try {
            Class<?> cls2 = f9614c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    static boolean m12749c(Object obj, long j) {
        return f9617f.mo9601c(obj, j);
    }

    /* renamed from: d */
    static float m12750d(Object obj, long j) {
        return f9617f.mo9602d(obj, j);
    }

    /* renamed from: d */
    static Unsafe m12751d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3242ko());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m12752d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m12733a(obj, j2, ((255 & b) << i) | (m12727a(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m12753d(Object obj, long j, boolean z) {
        m12745c(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    static double m12754e(Object obj, long j) {
        return f9617f.mo9603e(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m12755e(Object obj, long j, boolean z) {
        m12752d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    private static boolean m12756e() {
        Unsafe unsafe = f9613b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C3007cm.m12090a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f9612a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    static Object m12757f(Object obj, long j) {
        return f9617f.f9636a.getObject(obj, j);
    }

    /* renamed from: f */
    private static boolean m12758f() {
        Unsafe unsafe = f9613b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m12760g() == null) {
                return false;
            }
            if (C3007cm.m12090a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f9612a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static Field m12760g() {
        Field a;
        if (C3007cm.m12090a() && (a = m12729a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m12729a((Class<?>) Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m12764k(Object obj, long j) {
        return (byte) (m12727a(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m12765l(Object obj, long j) {
        return (byte) (m12727a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m12766m(Object obj, long j) {
        return m12764k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m12767n(Object obj, long j) {
        return m12765l(obj, j) != 0;
    }
}
