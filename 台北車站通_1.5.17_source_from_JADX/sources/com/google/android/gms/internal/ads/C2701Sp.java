package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2063j;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Sp */
public class C2701Sp {

    /* renamed from: a */
    private static final String f8285a = "Sp";

    /* renamed from: b */
    protected Context f8286b;

    /* renamed from: c */
    private ExecutorService f8287c;

    /* renamed from: d */
    private DexClassLoader f8288d;

    /* renamed from: e */
    private C2266Dp f8289e;

    /* renamed from: f */
    private byte[] f8290f;

    /* renamed from: g */
    private volatile AdvertisingIdClient f8291g = null;

    /* renamed from: h */
    private volatile boolean f8292h = false;

    /* renamed from: i */
    private Future f8293i = null;

    /* renamed from: j */
    private boolean f8294j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C2921_l f8295k = null;

    /* renamed from: l */
    private Future f8296l = null;

    /* renamed from: m */
    private C3558vp f8297m;

    /* renamed from: n */
    private boolean f8298n = false;

    /* renamed from: o */
    private boolean f8299o = false;

    /* renamed from: p */
    private Map<Pair<String, String>, C2182Aq> f8300p;

    /* renamed from: q */
    private boolean f8301q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f8302r;

    /* renamed from: s */
    private boolean f8303s;

    /* renamed from: com.google.android.gms.internal.ads.Sp$a */
    final class C2702a extends BroadcastReceiver {
        private C2702a() {
        }

        /* synthetic */ C2702a(C2701Sp sp, C2758Up up) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                boolean unused = C2701Sp.this.f8302r = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = C2701Sp.this.f8302r = false;
            }
        }
    }

    private C2701Sp(Context context) {
        boolean z = true;
        this.f8302r = true;
        this.f8303s = false;
        Context applicationContext = context.getApplicationContext();
        this.f8294j = applicationContext == null ? false : z;
        this.f8286b = this.f8294j ? applicationContext : context;
        this.f8300p = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ Ep -> 0x0150, Pp -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ Ep -> 0x0150, Pp -> 0x0157 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C2701Sp m11174a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.Sp r1 = new com.google.android.gms.internal.ads.Sp
            r1.<init>(r9)
            com.google.android.gms.internal.ads.Up r9 = new com.google.android.gms.internal.ads.Up     // Catch:{ Pp -> 0x0157 }
            r9.<init>()     // Catch:{ Pp -> 0x0157 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ Pp -> 0x0157 }
            r1.f8287c = r9     // Catch:{ Pp -> 0x0157 }
            r1.f8292h = r12     // Catch:{ Pp -> 0x0157 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.f8287c     // Catch:{ Pp -> 0x0157 }
            com.google.android.gms.internal.ads.Vp r12 = new com.google.android.gms.internal.ads.Vp     // Catch:{ Pp -> 0x0157 }
            r12.<init>(r1)     // Catch:{ Pp -> 0x0157 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ Pp -> 0x0157 }
            r1.f8293i = r9     // Catch:{ Pp -> 0x0157 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.f8287c     // Catch:{ Pp -> 0x0157 }
            com.google.android.gms.internal.ads.Xp r12 = new com.google.android.gms.internal.ads.Xp     // Catch:{ Pp -> 0x0157 }
            r12.<init>(r1)     // Catch:{ Pp -> 0x0157 }
            r9.execute(r12)     // Catch:{ Pp -> 0x0157 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.f r2 = com.google.android.gms.common.C1993f.m8774a()     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.f8286b     // Catch:{ Throwable -> 0x004d }
            int r3 = r2.mo7535b((android.content.Context) r3)     // Catch:{ Throwable -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = r9
            goto L_0x003e
        L_0x003d:
            r3 = r12
        L_0x003e:
            r1.f8298n = r3     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.f8286b     // Catch:{ Throwable -> 0x004d }
            int r2 = r2.mo7540c((android.content.Context) r3)     // Catch:{ Throwable -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = r9
            goto L_0x004b
        L_0x004a:
            r2 = r12
        L_0x004b:
            r1.f8299o = r2     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            r1.mo8834a((int) r12, (boolean) r9)     // Catch:{ Pp -> 0x0157 }
            boolean r2 = com.google.android.gms.internal.ads.C2925_p.m11871a()     // Catch:{ Pp -> 0x0157 }
            if (r2 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C2558Nu.f7998xc     // Catch:{ Pp -> 0x0157 }
            com.google.android.gms.internal.ads.Lu r3 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ Pp -> 0x0157 }
            java.lang.Object r2 = r3.mo8515a(r2)     // Catch:{ Pp -> 0x0157 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Pp -> 0x0157 }
            boolean r2 = r2.booleanValue()     // Catch:{ Pp -> 0x0157 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Pp -> 0x0157 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ Pp -> 0x0157 }
            throw r9     // Catch:{ Pp -> 0x0157 }
        L_0x0071:
            com.google.android.gms.internal.ads.Dp r2 = new com.google.android.gms.internal.ads.Dp     // Catch:{ Pp -> 0x0157 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ Pp -> 0x0157 }
            r1.f8289e = r2     // Catch:{ Pp -> 0x0157 }
            com.google.android.gms.internal.ads.Dp r2 = r1.f8289e     // Catch:{ Ep -> 0x0150 }
            byte[] r10 = r2.mo8005a(r10)     // Catch:{ Ep -> 0x0150 }
            r1.f8290f = r10     // Catch:{ Ep -> 0x0150 }
            android.content.Context r10 = r1.f8286b     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 != 0) goto L_0x009a
            android.content.Context r10 = r1.f8286b     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 == 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            com.google.android.gms.internal.ads.Pp r9 = new com.google.android.gms.internal.ads.Pp     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            throw r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
        L_0x009a:
            java.lang.String r2 = "1521499837408"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r7[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r7[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            if (r5 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.Dp r5 = r1.f8289e     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r7 = r1.f8290f     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r11 = r5.mo8006a((byte[]) r7, (java.lang.String) r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            int r7 = r11.length     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r5.write(r11, r12, r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
        L_0x00cb:
            r1.m11183b((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r7 = r10.getAbsolutePath()     // Catch:{ all -> 0x011f }
            android.content.Context r8 = r1.f8286b     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x011f }
            r11.<init>(r5, r7, r3, r8)     // Catch:{ all -> 0x011f }
            r1.f8288d = r11     // Catch:{ all -> 0x011f }
            m11177a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r1.m11178a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            m11179a((java.lang.String) r10)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            boolean r10 = r1.f8303s     // Catch:{ Pp -> 0x0157 }
            if (r10 != 0) goto L_0x0115
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ Pp -> 0x0157 }
            r10.<init>()     // Catch:{ Pp -> 0x0157 }
            java.lang.String r11 = "android.intent.action.USER_PRESENT"
            r10.addAction(r11)     // Catch:{ Pp -> 0x0157 }
            java.lang.String r11 = "android.intent.action.SCREEN_OFF"
            r10.addAction(r11)     // Catch:{ Pp -> 0x0157 }
            android.content.Context r11 = r1.f8286b     // Catch:{ Pp -> 0x0157 }
            com.google.android.gms.internal.ads.Sp$a r12 = new com.google.android.gms.internal.ads.Sp$a     // Catch:{ Pp -> 0x0157 }
            r12.<init>(r1, r3)     // Catch:{ Pp -> 0x0157 }
            r11.registerReceiver(r12, r10)     // Catch:{ Pp -> 0x0157 }
            r1.f8303s = r9     // Catch:{ Pp -> 0x0157 }
        L_0x0115:
            com.google.android.gms.internal.ads.vp r10 = new com.google.android.gms.internal.ads.vp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r1)     // Catch:{ Pp -> 0x0157 }
            r1.f8297m = r10     // Catch:{ Pp -> 0x0157 }
            r1.f8301q = r9     // Catch:{ Pp -> 0x0157 }
            goto L_0x0157
        L_0x011f:
            r11 = move-exception
            m11177a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r1.m11178a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            m11179a((java.lang.String) r9)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, Ep -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0134:
            r9 = move-exception
            com.google.android.gms.internal.ads.Pp r10 = new com.google.android.gms.internal.ads.Pp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r9)     // Catch:{ Pp -> 0x0157 }
            throw r10     // Catch:{ Pp -> 0x0157 }
        L_0x013b:
            r9 = move-exception
            com.google.android.gms.internal.ads.Pp r10 = new com.google.android.gms.internal.ads.Pp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r9)     // Catch:{ Pp -> 0x0157 }
            throw r10     // Catch:{ Pp -> 0x0157 }
        L_0x0142:
            r9 = move-exception
            com.google.android.gms.internal.ads.Pp r10 = new com.google.android.gms.internal.ads.Pp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r9)     // Catch:{ Pp -> 0x0157 }
            throw r10     // Catch:{ Pp -> 0x0157 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.internal.ads.Pp r10 = new com.google.android.gms.internal.ads.Pp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r9)     // Catch:{ Pp -> 0x0157 }
            throw r10     // Catch:{ Pp -> 0x0157 }
        L_0x0150:
            r9 = move-exception
            com.google.android.gms.internal.ads.Pp r10 = new com.google.android.gms.internal.ads.Pp     // Catch:{ Pp -> 0x0157 }
            r10.<init>(r9)     // Catch:{ Pp -> 0x0157 }
            throw r10     // Catch:{ Pp -> 0x0157 }
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2701Sp.m11174a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.Sp");
    }

    /* renamed from: a */
    private static void m11177a(File file) {
        if (!file.exists()) {
            Log.d(f8285a, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[SYNTHETIC, Splitter:B:43:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[SYNTHETIC, Splitter:B:52:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[SYNTHETIC, Splitter:B:56:0x00b7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11178a(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            r4 = 1
            r2[r4] = r10
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r4] = r10
            java.lang.String r9 = "%s/%s.dex"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r2.<init>(r9)
            boolean r9 = r2.exists()
            if (r9 != 0) goto L_0x0033
            return
        L_0x0033:
            long r4 = r2.length()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x003e
            return
        L_0x003e:
            int r9 = (int) r4
            byte[] r9 = new byte[r9]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            r4.<init>(r2)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            int r5 = r4.read(r9)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            if (r5 > 0) goto L_0x0054
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            m11177a((java.io.File) r2)
            return
        L_0x0054:
            com.google.android.gms.internal.ads.Zn r5 = new com.google.android.gms.internal.ads.Zn     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.<init>()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r6.getBytes()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f8696f = r6     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r10 = r10.getBytes()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f8695e = r10     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            com.google.android.gms.internal.ads.Dp r10 = r8.f8289e     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r8.f8290f     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r9 = r10.mo8004a((byte[]) r6, (byte[]) r9)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = r9.getBytes()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f8693c = r9     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = com.google.android.gms.internal.ads.C3010cp.m12105a((byte[]) r9)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f8694d = r9     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r0.createNewFile()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r9.<init>(r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r10 = com.google.android.gms.internal.ads.C2408Io.m10310a((com.google.android.gms.internal.ads.C2408Io) r5)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            int r0 = r10.length     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r9.write(r10, r3, r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r9.close()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r4.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r9.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            m11177a((java.io.File) r2)
            return
        L_0x0098:
            r10 = move-exception
            r1 = r9
            goto L_0x00a1
        L_0x009b:
            r1 = r9
            goto L_0x00b0
        L_0x009d:
            r10 = move-exception
            goto L_0x00a1
        L_0x009f:
            r10 = move-exception
            r4 = r1
        L_0x00a1:
            if (r4 == 0) goto L_0x00a6
            r4.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            m11177a((java.io.File) r2)
            throw r10
        L_0x00af:
            r4 = r1
        L_0x00b0:
            if (r4 == 0) goto L_0x00b5
            r4.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            m11177a((java.io.File) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2701Sp.m11178a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m11179a(String str) {
        m11177a(new File(str));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r5 = r5.f10679c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11182b(int r4, com.google.android.gms.internal.ads.C2921_l r5) {
        /*
            r0 = 4
            if (r4 >= r0) goto L_0x004b
            r4 = 1
            if (r5 != 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7707Ac
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r1.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r5.f8848y
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7713Bc
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r1.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zo r5 = r5.f8842sa
            if (r5 == 0) goto L_0x004a
            java.lang.Long r5 = r5.f10679c
            if (r5 == 0) goto L_0x004a
            long r0 = r5.longValue()
            r2 = -2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x004b
        L_0x004a:
            return r4
        L_0x004b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2701Sp.m11182b(int, com.google.android.gms.internal.ads._l):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b0 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6 A[SYNTHETIC, Splitter:B:52:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cb A[SYNTHETIC, Splitter:B:56:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[SYNTHETIC, Splitter:B:64:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC, Splitter:B:68:0x00d7] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m11183b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            m11177a((java.io.File) r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            byte[] r1 = new byte[r1]     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            r5.<init>(r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00cf, all -> 0x00c2 }
            int r6 = r5.read(r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f8285a     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            m11177a((java.io.File) r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.Zn r6 = new com.google.android.gms.internal.ads.Zn     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r6.<init>()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            com.google.android.gms.internal.ads.C2408Io.m10308a(r6, r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            com.google.android.gms.internal.ads.Zn r6 = (com.google.android.gms.internal.ads.C2895Zn) r6     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r7 = r6.f8695e     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r1.<init>(r7)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            boolean r11 = r11.equals(r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            if (r11 == 0) goto L_0x00b9
            byte[] r11 = r6.f8694d     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r1 = r6.f8693c     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r1 = com.google.android.gms.internal.ads.C3010cp.m12105a((byte[]) r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            boolean r11 = java.util.Arrays.equals(r11, r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            if (r11 == 0) goto L_0x00b9
            byte[] r11 = r6.f8696f     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            java.lang.String r1 = android.os.Build.VERSION.SDK     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r1 = r1.getBytes()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            boolean r11 = java.util.Arrays.equals(r11, r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            if (r11 != 0) goto L_0x0092
            goto L_0x00b9
        L_0x0092:
            com.google.android.gms.internal.ads.Dp r11 = r9.f8289e     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r0 = r9.f8290f     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r6 = r6.f8693c     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r1.<init>(r6)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            byte[] r11 = r11.mo8006a((byte[]) r0, (java.lang.String) r1)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r2.createNewFile()     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r0.<init>(r2)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            int r10 = r11.length     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b7, all -> 0x00b4 }
            r0.write(r11, r3, r10)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00b7, all -> 0x00b4 }
            r5.close()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            r0.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            return r4
        L_0x00b4:
            r11 = move-exception
            r10 = r0
            goto L_0x00c4
        L_0x00b7:
            r10 = r0
            goto L_0x00d0
        L_0x00b9:
            m11177a((java.io.File) r0)     // Catch:{ Ep | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c0 }
            r5.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            return r3
        L_0x00c0:
            r11 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r11 = move-exception
            r5 = r10
        L_0x00c4:
            if (r5 == 0) goto L_0x00c9
            r5.close()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            if (r10 == 0) goto L_0x00ce
            r10.close()     // Catch:{ IOException -> 0x00ce }
        L_0x00ce:
            throw r11
        L_0x00cf:
            r5 = r10
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            r5.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            if (r10 == 0) goto L_0x00da
            r10.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2701Sp.m11183b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m11184o() {
        try {
            if (this.f8291g == null && this.f8294j) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f8286b);
                advertisingIdClient.start();
                this.f8291g = advertisingIdClient;
            }
        } catch (C1997i | C2063j | IOException unused) {
            this.f8291g = null;
        }
    }

    /* renamed from: p */
    private final C2921_l m11185p() {
        try {
            return C2573Oi.m10794a(this.f8286b, this.f8286b.getPackageName(), Integer.toString(this.f8286b.getPackageManager().getPackageInfo(this.f8286b.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo8832a() {
        return this.f8286b;
    }

    /* renamed from: a */
    public final Method mo8833a(String str, String str2) {
        C2182Aq aq = this.f8300p.get(new Pair(str, str2));
        if (aq == null) {
            return null;
        }
        return aq.mo7842a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8834a(int i, boolean z) {
        if (this.f8299o) {
            Future<?> submit = this.f8287c.submit(new C2814Wp(this, i, z));
            if (i == 0) {
                this.f8296l = submit;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8835a(String str, String str2, Class<?>... clsArr) {
        if (this.f8300p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f8300p.put(new Pair(str, str2), new C2182Aq(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2921_l mo8836b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return m11185p();
    }

    /* renamed from: b */
    public final boolean mo8837b() {
        return this.f8301q;
    }

    /* renamed from: c */
    public final ExecutorService mo8838c() {
        return this.f8287c;
    }

    /* renamed from: d */
    public final DexClassLoader mo8839d() {
        return this.f8288d;
    }

    /* renamed from: e */
    public final C2266Dp mo8840e() {
        return this.f8289e;
    }

    /* renamed from: f */
    public final byte[] mo8841f() {
        return this.f8290f;
    }

    /* renamed from: g */
    public final boolean mo8842g() {
        return this.f8298n;
    }

    /* renamed from: h */
    public final C3558vp mo8843h() {
        return this.f8297m;
    }

    /* renamed from: i */
    public final boolean mo8844i() {
        return this.f8299o;
    }

    /* renamed from: j */
    public final boolean mo8845j() {
        return this.f8302r;
    }

    /* renamed from: k */
    public final C2921_l mo8846k() {
        return this.f8295k;
    }

    /* renamed from: l */
    public final Future mo8847l() {
        return this.f8296l;
    }

    /* renamed from: m */
    public final AdvertisingIdClient mo8848m() {
        if (!this.f8292h) {
            return null;
        }
        if (this.f8291g != null) {
            return this.f8291g;
        }
        Future future = this.f8293i;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.f8293i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f8293i.cancel(true);
            }
        }
        return this.f8291g;
    }

    /* renamed from: n */
    public final int mo8849n() {
        if (this.f8297m != null) {
            return C3558vp.m14287a();
        }
        return Integer.MIN_VALUE;
    }
}
