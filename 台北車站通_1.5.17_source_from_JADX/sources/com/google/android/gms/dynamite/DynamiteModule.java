package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.C2107a;
import com.google.android.gms.dynamite.C2110b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

public final class DynamiteModule {

    /* renamed from: a */
    private static Boolean f6568a;

    /* renamed from: b */
    private static C2107a f6569b;

    /* renamed from: c */
    private static C2110b f6570c;

    /* renamed from: d */
    private static String f6571d;

    /* renamed from: e */
    private static final ThreadLocal<C2105c> f6572e = new ThreadLocal<>();

    /* renamed from: f */
    private static final C2102b.C2103a f6573f = new C2113c();

    /* renamed from: g */
    public static final C2102b f6574g = new C2114d();

    /* renamed from: h */
    public static final C2102b f6575h = new C2115e();

    /* renamed from: i */
    public static final C2102b f6576i = new C2116f();

    /* renamed from: j */
    public static final C2102b f6577j = new C2117g();

    /* renamed from: k */
    public static final C2102b f6578k = new C2118h();

    /* renamed from: l */
    public static final C2102b f6579l = new C2119i();

    /* renamed from: m */
    private final Context f6580m;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C2101a extends Exception {
        private C2101a(String str) {
            super(str);
        }

        /* synthetic */ C2101a(String str, C2113c cVar) {
            this(str);
        }

        private C2101a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C2101a(String str, Throwable th, C2113c cVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C2102b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C2103a {
            /* renamed from: a */
            int mo7732a(Context context, String str);

            /* renamed from: a */
            int mo7733a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C2104b {

            /* renamed from: a */
            public int f6581a = 0;

            /* renamed from: b */
            public int f6582b = 0;

            /* renamed from: c */
            public int f6583c = 0;
        }

        /* renamed from: a */
        C2104b mo7731a(Context context, String str, C2103a aVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C2105c {

        /* renamed from: a */
        public Cursor f6584a;

        private C2105c() {
        }

        /* synthetic */ C2105c(C2113c cVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C2106d implements C2102b.C2103a {

        /* renamed from: a */
        private final int f6585a;

        /* renamed from: b */
        private final int f6586b = 0;

        public C2106d(int i, int i2) {
            this.f6585a = i;
        }

        /* renamed from: a */
        public final int mo7732a(Context context, String str) {
            return this.f6585a;
        }

        /* renamed from: a */
        public final int mo7733a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        C2061y.m9067a(context);
        this.f6580m = context;
    }

    /* renamed from: a */
    public static int m9183a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:17:0x0035=Splitter:B:17:0x0035, B:34:0x0079=Splitter:B:34:0x0079} */
    /* renamed from: a */
    public static int m9184a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f6568a     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x00b7
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0087 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0032:
            m9190a((java.lang.ClassLoader) r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0087 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0050:
            int r4 = m9197d(r8, r9, r10)     // Catch:{ a -> 0x007c }
            java.lang.String r5 = f6571d     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = f6571d     // Catch:{ a -> 0x007c }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            com.google.android.gms.dynamite.j r5 = new com.google.android.gms.dynamite.j     // Catch:{ a -> 0x007c }
            java.lang.String r6 = f6571d     // Catch:{ a -> 0x007c }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007c }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007c }
            m9190a((java.lang.ClassLoader) r5)     // Catch:{ a -> 0x007c }
            r2.set(r3, r5)     // Catch:{ a -> 0x007c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007c }
            f6568a = r5     // Catch:{ a -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x007c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            r1 = r2
            goto L_0x00b5
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        L_0x008a:
            r1 = move-exception
            goto L_0x008f
        L_0x008c:
            r1 = move-exception
            goto L_0x008f
        L_0x008e:
            r1 = move-exception
        L_0x008f:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            int r3 = r3.length()     // Catch:{ all -> 0x00ea }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r4.<init>(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ea }
            r4.append(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ea }
        L_0x00b5:
            f6568a = r1     // Catch:{ all -> 0x00ea }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00e5
            int r8 = m9197d(r8, r9, r10)     // Catch:{ a -> 0x00c3 }
            return r8
        L_0x00c3:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto L_0x00d9
            java.lang.String r8 = r9.concat(r8)
            goto L_0x00de
        L_0x00d9:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
        L_0x00de:
            java.lang.String r9 = "DynamiteModule"
            android.util.Log.w(r9, r8)
            r8 = 0
            return r8
        L_0x00e5:
            int r8 = m9194c((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)
            return r8
        L_0x00ea:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9184a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static Context m9185a(Context context, String str, int i, Cursor cursor, C2110b bVar) {
        try {
            return (Context) C5468d.m20962z(bVar.mo7736a(C5468d.m20961a(context), str, i, C5468d.m20961a(cursor)));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* renamed from: a */
    public static Uri m9186a(String str, boolean z) {
        String str2 = z ? "api_force_staging" : "api";
        StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
        sb.append("content://com.google.android.gms.chimera/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m9187a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.C2102b r11, java.lang.String r12) {
        /*
            java.lang.String r0 = ":"
            java.lang.String r1 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = f6572e
            java.lang.Object r2 = r2.get()
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.C2105c) r2
            com.google.android.gms.dynamite.DynamiteModule$c r3 = new com.google.android.gms.dynamite.DynamiteModule$c
            r4 = 0
            r3.<init>(r4)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = f6572e
            r5.set(r3)
            com.google.android.gms.dynamite.DynamiteModule$b$a r5 = f6573f     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$b r5 = r11.mo7731a(r10, r12, r5)     // Catch:{ all -> 0x011f }
            int r6 = r5.f6581a     // Catch:{ all -> 0x011f }
            int r7 = r5.f6582b     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r8 = r8.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + 68
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r9 = r9.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>(r8)     // Catch:{ all -> 0x011f }
            java.lang.String r8 = "Considering local module "
            r9.append(r8)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r6)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = " and remote module "
            r9.append(r6)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r7)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x011f }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011f }
            int r0 = r5.f6583c     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
            int r0 = r5.f6583c     // Catch:{ all -> 0x011f }
            r6 = -1
            if (r0 != r6) goto L_0x0069
            int r0 = r5.f6581a     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0069:
            int r0 = r5.f6583c     // Catch:{ all -> 0x011f }
            r7 = 1
            if (r0 != r7) goto L_0x0072
            int r0 = r5.f6582b     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0072:
            int r0 = r5.f6583c     // Catch:{ all -> 0x011f }
            if (r0 != r6) goto L_0x0087
            com.google.android.gms.dynamite.DynamiteModule r10 = m9195c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6584a
            if (r11 == 0) goto L_0x0081
        L_0x007e:
            r11.close()
        L_0x0081:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6572e
            r11.set(r2)
            return r10
        L_0x0087:
            int r0 = r5.f6583c     // Catch:{ all -> 0x011f }
            if (r0 != r7) goto L_0x00da
            int r0 = r5.f6582b     // Catch:{ a -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule r10 = m9188a((android.content.Context) r10, (java.lang.String) r12, (int) r0)     // Catch:{ a -> 0x0096 }
            android.database.Cursor r11 = r3.f6584a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x0096:
            r0 = move-exception
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011f }
            int r9 = r8.length()     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x011f }
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x011f }
            r8.<init>(r7)     // Catch:{ all -> 0x011f }
            r7 = r8
        L_0x00b2:
            android.util.Log.w(r1, r7)     // Catch:{ all -> 0x011f }
            int r1 = r5.f6581a     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule$d r1 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x011f }
            int r5 = r5.f6581a     // Catch:{ all -> 0x011f }
            r7 = 0
            r1.<init>(r5, r7)     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$b r11 = r11.mo7731a(r10, r12, r1)     // Catch:{ all -> 0x011f }
            int r11 = r11.f6583c     // Catch:{ all -> 0x011f }
            if (r11 != r6) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule r10 = m9195c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6584a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x00d2:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r0, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00da:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6583c     // Catch:{ all -> 0x011f }
            r12 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r0.<init>(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r0.append(r12)     // Catch:{ all -> 0x011f }
            r0.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.C2113c) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00f5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6581a     // Catch:{ all -> 0x011f }
            int r12 = r5.f6582b     // Catch:{ all -> 0x011f }
            r0 = 91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r1.<init>(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x011f }
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = " and remote version is "
            r1.append(r11)     // Catch:{ all -> 0x011f }
            r1.append(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "."
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.C2113c) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x011f:
            r10 = move-exception
            android.database.Cursor r11 = r3.f6584a
            if (r11 == 0) goto L_0x0127
            r11.close()
        L_0x0127:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6572e
            r11.set(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9187a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    private static DynamiteModule m9188a(Context context, String str, int i) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = f6568a;
        }
        if (bool != null) {
            return bool.booleanValue() ? m9196c(context, str, i) : m9193b(context, str, i);
        }
        throw new C2101a("Failed to determine which loading route to use.", (C2113c) null);
    }

    /* renamed from: a */
    private static C2107a m9189a(Context context) {
        synchronized (DynamiteModule.class) {
            if (f6569b != null) {
                C2107a aVar = f6569b;
                return aVar;
            } else if (C1993f.m8774a().mo7540c(context) != 0) {
                return null;
            } else {
                try {
                    C2107a asInterface = C2107a.C2108a.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (asInterface != null) {
                        f6569b = asInterface;
                        return asInterface;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m9190a(ClassLoader classLoader) {
        try {
            f6570c = C2110b.C2111a.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C2101a("Failed to instantiate dynamite loader", e, (C2113c) null);
        }
    }

    /* renamed from: b */
    public static int m9191b(Context context, String str) {
        return m9184a(context, str, false);
    }

    /* renamed from: b */
    public static Cursor m9192b(Context context, String str, boolean z) {
        return context.getContentResolver().query(m9186a(str, z), (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* renamed from: b */
    private static DynamiteModule m9193b(Context context, String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        C2107a a = m9189a(context);
        if (a != null) {
            try {
                C5464b a2 = a.mo7735a(C5468d.m20961a(context), str, i);
                if (C5468d.m20962z(a2) != null) {
                    return new DynamiteModule((Context) C5468d.m20962z(a2));
                }
                throw new C2101a("Failed to load remote module.", (C2113c) null);
            } catch (RemoteException e) {
                throw new C2101a("Failed to load remote module.", e, (C2113c) null);
            }
        } else {
            throw new C2101a("Failed to create IDynamiteLoader.", (C2113c) null);
        }
    }

    /* renamed from: c */
    private static int m9194c(Context context, String str, boolean z) {
        C2107a a = m9189a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.mo7734a(C5468d.m20961a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* renamed from: c */
    private static DynamiteModule m9195c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: c */
    private static DynamiteModule m9196c(Context context, String str, int i) {
        C2110b bVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            bVar = f6570c;
        }
        if (bVar != null) {
            C2105c cVar = f6572e.get();
            if (cVar == null || cVar.f6584a == null) {
                throw new C2101a("No result cursor", (C2113c) null);
            }
            Context a = m9185a(context.getApplicationContext(), str, i, cVar.f6584a, bVar);
            if (a != null) {
                return new DynamiteModule(a);
            }
            throw new C2101a("Failed to get module context", (C2113c) null);
        }
        throw new C2101a("DynamiteLoaderV2 was not cached.", (C2113c) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0060  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9197d(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            android.database.Cursor r2 = m9192b((android.content.Context) r2, (java.lang.String) r3, (boolean) r4)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r2 == 0) goto L_0x003a
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x003a
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x0049 }
            if (r3 <= 0) goto L_0x0034
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ Exception -> 0x0049 }
            r1 = 2
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0031 }
            f6571d = r1     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r4 = f6572e     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0049 }
            com.google.android.gms.dynamite.DynamiteModule$c r4 = (com.google.android.gms.dynamite.DynamiteModule.C2105c) r4     // Catch:{ Exception -> 0x0049 }
            if (r4 == 0) goto L_0x0034
            android.database.Cursor r1 = r4.f6584a     // Catch:{ Exception -> 0x0049 }
            if (r1 != 0) goto L_0x0034
            r4.f6584a = r2     // Catch:{ Exception -> 0x0049 }
            r2 = r0
            goto L_0x0034
        L_0x0031:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            throw r3     // Catch:{ Exception -> 0x0049 }
        L_0x0034:
            if (r2 == 0) goto L_0x0039
            r2.close()
        L_0x0039:
            return r3
        L_0x003a:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Failed to retrieve remote module version."
            android.util.Log.w(r3, r4)     // Catch:{ Exception -> 0x0049 }
            com.google.android.gms.dynamite.DynamiteModule$a r3 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0049 }
            java.lang.String r4 = "Failed to connect to dynamite module ContentResolver."
            r3.<init>((java.lang.String) r4, (com.google.android.gms.dynamite.C2113c) r0)     // Catch:{ Exception -> 0x0049 }
            throw r3     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r3 = move-exception
            goto L_0x0050
        L_0x004b:
            r3 = move-exception
            r2 = r0
            goto L_0x005e
        L_0x004e:
            r3 = move-exception
            r2 = r0
        L_0x0050:
            boolean r4 = r3 instanceof com.google.android.gms.dynamite.DynamiteModule.C2101a     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0055
            throw r3     // Catch:{ all -> 0x005d }
        L_0x0055:
            com.google.android.gms.dynamite.DynamiteModule$a r4 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "V2 version check failed"
            r4.<init>(r1, r3, r0)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.close()
        L_0x0063:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9197d(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    public final Context mo7729a() {
        return this.f6580m;
    }

    /* renamed from: a */
    public final IBinder mo7730a(String str) {
        try {
            return (IBinder) this.f6580m.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C2101a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C2113c) null);
        }
    }
}
