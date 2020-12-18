package p101d.p122f.p123a.p126c;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p101d.p122f.p123a.p124a.C5307a;
import p101d.p122f.p123a.p126c.C5369V;
import p101d.p122f.p123a.p126c.C5413ha;
import p101d.p122f.p123a.p126c.p127a.p128a.C5381d;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6082m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6085o;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p219f.C6161a;
import p208e.p209a.p210a.p211a.p212a.p220g.C6181p;
import p208e.p209a.p210a.p211a.p212a.p220g.C6182q;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

/* renamed from: d.f.a.c.y */
class C5446y {

    /* renamed from: a */
    static final FilenameFilter f15322a = new C5440s();

    /* renamed from: b */
    static final Comparator<File> f15323b = new C5441t();

    /* renamed from: c */
    static final Comparator<File> f15324c = new C5442u();

    /* renamed from: d */
    static final FilenameFilter f15325d = new C5443v();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Pattern f15326e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: f */
    private static final Map<String, String> f15327f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: g */
    private static final String[] f15328g = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: h */
    private final AtomicInteger f15329h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C5351F f15330i;

    /* renamed from: j */
    private final C5429m f15331j;

    /* renamed from: k */
    private final C6156h f15332k;

    /* renamed from: l */
    private final C6091u f15333l;

    /* renamed from: m */
    private final C5402ca f15334m;

    /* renamed from: n */
    private final C6161a f15335n;

    /* renamed from: o */
    private final C5376a f15336o;

    /* renamed from: p */
    private final C5450d f15337p;

    /* renamed from: q */
    private final C5369V f15338q;

    /* renamed from: r */
    private final C5413ha.C5416c f15339r;

    /* renamed from: s */
    private final C5413ha.C5415b f15340s;

    /* renamed from: t */
    private final C5364P f15341t;

    /* renamed from: u */
    private final C5426ka f15342u;

    /* renamed from: v */
    private final String f15343v;

    /* renamed from: w */
    private C5357J f15344w;

    /* renamed from: d.f.a.c.y$a */
    private static class C5447a implements FilenameFilter {
        private C5447a() {
        }

        /* synthetic */ C5447a(C5440s sVar) {
            this();
        }

        public boolean accept(File file, String str) {
            return !C5446y.f15322a.accept(file, str) && C5446y.f15326e.matcher(str).matches();
        }
    }

    /* renamed from: d.f.a.c.y$b */
    static class C5448b implements FilenameFilter {

        /* renamed from: a */
        private final String f15345a;

        public C5448b(String str) {
            this.f15345a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f15345a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: d.f.a.c.y$c */
    static class C5449c implements FilenameFilter {
        C5449c() {
        }

        public boolean accept(File file, String str) {
            return C5405e.f15254a.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: d.f.a.c.y$d */
    private static final class C5450d implements C5369V.C5370a {

        /* renamed from: a */
        private final C6161a f15346a;

        public C5450d(C6161a aVar) {
            this.f15346a = aVar;
        }

        /* renamed from: a */
        public File mo14802a() {
            File file = new File(this.f15346a.mo16233a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: d.f.a.c.y$e */
    private static final class C5451e implements C5413ha.C5417d {

        /* renamed from: a */
        private final C6208m f15347a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C5402ca f15348b;

        /* renamed from: c */
        private final C6181p f15349c;

        public C5451e(C6208m mVar, C5402ca caVar, C6181p pVar) {
            this.f15347a = mVar;
            this.f15348b = caVar;
            this.f15349c = pVar;
        }

        /* renamed from: a */
        public boolean mo14859a() {
            Activity b = this.f15347a.mo16307m().mo16279b();
            if (b == null || b.isFinishing()) {
                return true;
            }
            C5421j a = C5421j.m20844a(b, this.f15349c, new C5456z(this));
            b.runOnUiThread(new C5346A(this, a));
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Waiting for user opt-in.");
            a.mo14865a();
            return a.mo14866b();
        }
    }

    /* renamed from: d.f.a.c.y$f */
    private final class C5452f implements C5413ha.C5416c {
        private C5452f() {
        }

        /* synthetic */ C5452f(C5446y yVar, C5440s sVar) {
            this();
        }

        /* renamed from: a */
        public File[] mo14861a() {
            return C5446y.this.mo14902e().listFiles();
        }

        /* renamed from: b */
        public File[] mo14862b() {
            return C5446y.this.mo14905h();
        }
    }

    /* renamed from: d.f.a.c.y$g */
    private final class C5453g implements C5413ha.C5415b {
        private C5453g() {
        }

        /* synthetic */ C5453g(C5446y yVar, C5440s sVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo14860a() {
            return C5446y.this.mo14904g();
        }
    }

    /* renamed from: d.f.a.c.y$h */
    private static final class C5454h implements Runnable {

        /* renamed from: a */
        private final Context f15352a;

        /* renamed from: b */
        private final C5411ga f15353b;

        /* renamed from: c */
        private final C5413ha f15354c;

        public C5454h(Context context, C5411ga gaVar, C5413ha haVar) {
            this.f15352a = context;
            this.f15353b = gaVar;
            this.f15354c = haVar;
        }

        public void run() {
            if (C6080l.m23050b(this.f15352a)) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.f15354c.mo14857a(this.f15353b);
            }
        }
    }

    /* renamed from: d.f.a.c.y$i */
    static class C5455i implements FilenameFilter {

        /* renamed from: a */
        private final String f15355a;

        public C5455i(String str) {
            this.f15355a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15355a);
            sb.append(".cls");
            return !str.equals(sb.toString()) && str.contains(this.f15355a) && !str.endsWith(".cls_temp");
        }
    }

    C5446y(C5351F f, C5429m mVar, C6156h hVar, C6091u uVar, C5402ca caVar, C6161a aVar, C5376a aVar2, C5430ma maVar) {
        this.f15330i = f;
        this.f15331j = mVar;
        this.f15332k = hVar;
        this.f15333l = uVar;
        this.f15334m = caVar;
        this.f15335n = aVar;
        this.f15336o = aVar2;
        this.f15343v = maVar.mo14803a();
        Context k = f.mo16305k();
        this.f15337p = new C5450d(aVar);
        this.f15338q = new C5369V(k, this.f15337p);
        this.f15339r = new C5452f(this, (C5440s) null);
        this.f15340s = new C5453g(this, (C5440s) null);
        this.f15341t = new C5364P(k);
        this.f15342u = new C5374Y(1024, new C5409fa(10));
    }

    /* renamed from: a */
    static String m20869a(File file) {
        return file.getName().substring(0, 35);
    }

    /* renamed from: a */
    private void m20871a(C5405e eVar) {
        if (eVar != null) {
            try {
                eVar.mo14826a();
            } catch (IOException e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* renamed from: a */
    private static void m20872a(C5407f fVar, File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Tried to include a file that doesn't exist: " + file.getName(), (Throwable) null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                m20883a((InputStream) fileInputStream, fVar, (int) file.length());
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    /* renamed from: a */
    private void m20873a(C5407f fVar, String str) {
        for (String str2 : f15328g) {
            File[] a = m20894a((FilenameFilter) new C5448b(str + str2));
            if (a.length == 0) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Can't find " + str2 + " data for session ID " + str, (Throwable) null);
            } else {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Collecting " + str2 + " data for session ID " + str);
                m20872a(fVar, a[0]);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20874a(p101d.p122f.p123a.p126c.C5407f r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            d.f.a.c.la r5 = new d.f.a.c.la
            d.f.a.c.ka r1 = r0.f15342u
            r2 = r28
            r5.<init>(r2, r1)
            d.f.a.c.F r1 = r0.f15330i
            android.content.Context r1 = r1.mo16305k()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23057e(r1)
            d.f.a.c.P r4 = r0.f15341t
            boolean r4 = r4.mo14782b()
            int r17 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23027a((android.content.Context) r1, (boolean) r4)
            boolean r18 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23059g(r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23047b()
            long r8 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23028a((android.content.Context) r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23029a((java.lang.String) r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23031a((java.lang.String) r4, (android.content.Context) r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.f15297c
            d.f.a.c.a r4 = r0.f15336o
            java.lang.String r15 = r4.f15175b
            e.a.a.a.a.b.u r4 = r0.f15333l
            java.lang.String r14 = r4.mo16074e()
            r4 = 0
            if (r30 == 0) goto L_0x00a1
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0078:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            d.f.a.c.ka r6 = r0.f15342u
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.mo14806a(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0078
        L_0x009e:
            r6 = 1
            r8 = r10
            goto L_0x00a5
        L_0x00a1:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a5:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = p208e.p209a.p210a.p211a.p212a.p214b.C6080l.m23046a((android.content.Context) r1, (java.lang.String) r4, (boolean) r6)
            if (r1 != 0) goto L_0x00b3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c8
        L_0x00b3:
            d.f.a.c.F r1 = r0.f15330i
            java.util.Map r1 = r1.mo14762w()
            if (r1 == 0) goto L_0x00c8
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c8
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c9
        L_0x00c8:
            r10 = r1
        L_0x00c9:
            d.f.a.c.V r11 = r0.f15338q
            r1 = r25
            r4 = r29
            r6 = r27
            p101d.p122f.p123a.p126c.C5420ia.m20828a((p101d.p122f.p123a.p126c.C5407f) r1, (long) r2, (java.lang.String) r4, (p101d.p122f.p123a.p126c.C5428la) r5, (java.lang.Thread) r6, (java.lang.StackTraceElement[]) r7, (java.lang.Thread[]) r8, (java.util.List<java.lang.StackTraceElement[]>) r9, (java.util.Map<java.lang.String, java.lang.String>) r10, (p101d.p122f.p123a.p126c.C5369V) r11, (android.app.ActivityManager.RunningAppProcessInfo) r12, (int) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.Float) r16, (int) r17, (boolean) r18, (long) r19, (long) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p122f.p123a.p126c.C5446y.m20874a(d.f.a.c.f, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private static void m20875a(C5407f fVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, C6080l.f17000d);
        for (File file : fileArr) {
            try {
                C6199f.m23420f().mo16269d("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                m20872a(fVar, file);
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Error writting non-fatal to session.", e);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20879a(p208e.p209a.p210a.p211a.p212a.p220g.C6182q r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r5 + 8
            r3.m20897b((int) r0)
            java.io.File[] r0 = r3.m20913n()
            int r1 = r0.length
            java.lang.String r2 = "CrashlyticsCore"
            if (r1 > r5) goto L_0x0018
            e.a.a.a.p r4 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo16269d(r2, r5)
            return
        L_0x0018:
            r1 = r0[r5]
            java.lang.String r1 = m20869a((java.io.File) r1)
            r3.m20909h(r1)
            if (r4 != 0) goto L_0x002d
            e.a.a.a.p r4 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.String r5 = "Unable to close session. Settings are not loaded."
            r4.mo16269d(r2, r5)
            return
        L_0x002d:
            int r4 = r4.f17241c
            r3.m20889a((java.io.File[]) r0, (int) r5, (int) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p122f.p123a.p126c.C5446y.m20879a(e.a.a.a.a.g.q, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20880a(C6188v vVar) {
        if (vVar == null) {
            C6199f.m23420f().mo16262a("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context k = this.f15330i.mo16305k();
        C5413ha haVar = new C5413ha(this.f15336o.f15174a, m20896b(vVar.f17255a.f17211d), this.f15339r, this.f15340s);
        for (File jaVar : mo14905h()) {
            this.f15331j.mo14874a((Runnable) new C5454h(k, new C5424ja(jaVar, f15327f), haVar));
        }
    }

    /* renamed from: a */
    private void m20881a(File file, String str, int i) {
        C6211p f = C6199f.m23420f();
        f.mo16269d("CrashlyticsCore", "Collecting session parts for ID " + str);
        File[] a = m20894a((FilenameFilter) new C5448b(str + "SessionCrash"));
        boolean z = a != null && a.length > 0;
        C6199f.m23420f().mo16269d("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        File[] a2 = m20894a((FilenameFilter) new C5448b(str + "SessionEvent"));
        boolean z2 = a2 != null && a2.length > 0;
        C6199f.m23420f().mo16269d("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            m20882a(file, str, m20895a(str, a2, i), z ? a[0] : null);
        } else {
            C6211p f2 = C6199f.m23420f();
            f2.mo16269d("CrashlyticsCore", "No events present for session ID " + str);
        }
        C6211p f3 = C6199f.m23420f();
        f3.mo16269d("CrashlyticsCore", "Removing session part files for ID " + str);
        m20884a(str);
    }

    /* renamed from: a */
    private void m20882a(File file, String str, File[] fileArr, File file2) {
        C5405e eVar;
        String str2 = str;
        File file3 = file2;
        boolean z = file3 != null;
        File c = z ? mo14900c() : mo14903f();
        if (!c.exists()) {
            c.mkdirs();
        }
        try {
            eVar = new C5405e(c, str2);
            try {
                C5407f a = C5407f.m20754a((OutputStream) eVar);
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Collecting SessionStart data for session ID " + str2);
                m20872a(a, file);
                a.mo14834b(4, new Date().getTime() / 1000);
                a.mo14836b(5, z);
                a.mo14846g(11, 1);
                a.mo14841d(12, 3);
                m20873a(a, str2);
                m20875a(a, fileArr, str2);
                if (z) {
                    m20872a(a, file3);
                }
                C6080l.m23043a((Flushable) a, "Error flushing session file stream");
                C6080l.m23042a((Closeable) eVar, "Failed to close CLS file");
            } catch (Exception e) {
                e = e;
                try {
                    C6199f.m23420f().mo16266b("CrashlyticsCore", "Failed to write session file for session ID: " + str2, e);
                    C6080l.m23043a((Flushable) null, "Error flushing session file stream");
                    m20871a(eVar);
                } catch (Throwable th) {
                    th = th;
                    C6080l.m23043a((Flushable) null, "Error flushing session file stream");
                    C6080l.m23042a((Closeable) eVar, "Failed to close CLS file");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            eVar = null;
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Failed to write session file for session ID: " + str2, e);
            C6080l.m23043a((Flushable) null, "Error flushing session file stream");
            m20871a(eVar);
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) null, "Error flushing session file stream");
            C6080l.m23042a((Closeable) eVar, "Failed to close CLS file");
            throw th;
        }
    }

    /* renamed from: a */
    private static void m20883a(InputStream inputStream, C5407f fVar, int i) {
        int read;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length && (read = inputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            i2 += read;
        }
        fVar.mo14830a(bArr);
    }

    /* renamed from: a */
    private void m20884a(String str) {
        for (File delete : m20905d(str)) {
            delete.delete();
        }
    }

    /* renamed from: a */
    private void m20885a(String str, int i) {
        File d = mo14901d();
        C5436pa.m20863a(d, new C5448b(str + "SessionEvent"), i, f15324c);
    }

    /* renamed from: a */
    private static void m20886a(String str, String str2) {
        C5307a aVar = (C5307a) C6199f.m23412a(C5307a.class);
        if (aVar == null) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Answers is not available");
        } else {
            aVar.mo14674a(new C6082m.C6083a(str, str2));
        }
    }

    /* renamed from: a */
    private void m20887a(String str, Date date) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            eVar = new C5405e(mo14901d(), str + "BeginSession");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                C5420ia.m20835a(fVar, str, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.f15330i.mo14664q()}), date.getTime() / 1000);
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close begin session file.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close begin session file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close begin session file.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20888a(Date date, Thread thread, Throwable th) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            String l = m20911l();
            if (l == null) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", (Throwable) null);
                C6080l.m23043a((Flushable) null, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            m20886a(l, th.getClass().getName());
            eVar = new C5405e(mo14901d(), l + "SessionCrash");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                m20874a(fVar, date, thread, th, AppMeasurement.CRASH_ORIGIN, true);
            } catch (Exception e) {
                e = e;
            }
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e2) {
            e = e2;
            eVar = null;
            try {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "An error occurred in the fatal exception logger", e);
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* renamed from: a */
    private void m20889a(File[] fileArr, int i, int i2) {
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = m20869a(file);
            C6211p f = C6199f.m23420f();
            f.mo16269d("CrashlyticsCore", "Closing session: " + a);
            m20881a(file, a, i2);
            i++;
        }
    }

    /* renamed from: a */
    private void m20890a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f15326e.matcher(name);
            if (!matcher.matches()) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Deleting unknown file: " + name);
                file.delete();
                return;
            }
            if (!set.contains(matcher.group(1))) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Trimming session file: " + name);
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private File[] m20893a(File file, FilenameFilter filenameFilter) {
        return m20903b(file.listFiles(filenameFilter));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File[] m20894a(FilenameFilter filenameFilter) {
        return m20893a(mo14901d(), filenameFilter);
    }

    /* renamed from: a */
    private File[] m20895a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C6199f.m23420f().mo16269d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m20885a(str, i);
        return m20894a((FilenameFilter) new C5448b(str + "SessionEvent"));
    }

    /* renamed from: b */
    private C5360L m20896b(String str) {
        return new C5361M(this.f15330i, C6080l.m23048b(this.f15330i.mo16305k(), "com.crashlytics.ApiEndpoint"), str, this.f15332k);
    }

    /* renamed from: b */
    private void m20897b(int i) {
        HashSet hashSet = new HashSet();
        File[] n = m20913n();
        int min = Math.min(i, n.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(m20869a(n[i2]));
        }
        this.f15338q.mo14800a((Set<String>) hashSet);
        m20890a(m20894a((FilenameFilter) new C5447a((C5440s) null)), (Set<String>) hashSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m20898b(C5381d dVar) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            String m = m20912m();
            if (m == null) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Tried to write a native crash while no session was open.", (Throwable) null);
                C6080l.m23043a((Flushable) null, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            boolean z = false;
            m20886a(m, String.format(Locale.US, "<native-crash [%s (%s)]>", new Object[]{dVar.f15195b.f15201b, dVar.f15195b.f15200a}));
            if (dVar.f15197d != null && dVar.f15197d.length > 0) {
                z = true;
            }
            String str = z ? "SessionCrash" : "SessionMissingBinaryImages";
            eVar = new C5405e(mo14901d(), m + str);
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                C5385aa.m20693a(dVar, new C5369V(this.f15330i.mo16305k(), this.f15337p, m), new C5373X(mo14901d()).mo14804a(m), fVar);
            } catch (Exception e) {
                e = e;
            }
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e2) {
            e = e2;
            eVar = null;
            try {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "An error occurred in the native crash logger", e);
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session begin file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m20901b(C6188v vVar) {
        return vVar != null && vVar.f17258d.f17224a && !this.f15334m.mo14823a();
    }

    /* renamed from: b */
    private File[] m20902b(File file) {
        return m20903b(file.listFiles());
    }

    /* renamed from: b */
    private File[] m20903b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: c */
    private C5432na m20904c(String str) {
        return mo14904g() ? new C5432na(this.f15330i.mo14765z(), this.f15330i.mo14756A(), this.f15330i.mo14764y()) : new C5373X(mo14901d()).mo14805b(str);
    }

    /* renamed from: d */
    private File[] m20905d(String str) {
        return m20894a((FilenameFilter) new C5455i(str));
    }

    /* renamed from: e */
    private void m20906e(String str) {
        C5407f fVar;
        C5405e eVar;
        Throwable th;
        try {
            eVar = new C5405e(mo14901d(), str + "SessionApp");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
            } catch (Throwable th2) {
                th = th2;
                fVar = null;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session app file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session app file.");
                throw th;
            }
            try {
                C5420ia.m20837a(fVar, this.f15333l.mo16074e(), this.f15336o.f15174a, this.f15336o.f15178e, this.f15336o.f15179f, this.f15333l.mo16075f(), C6085o.m23071a(this.f15336o.f15176c).getId(), this.f15343v);
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session app file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session app file.");
            } catch (Throwable th3) {
                th = th3;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session app file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session app file.");
                throw th;
            }
        } catch (Throwable th4) {
            eVar = null;
            th = th4;
            fVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session app file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close session app file.");
            throw th;
        }
    }

    /* renamed from: f */
    private void m20907f(String str) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            eVar = new C5405e(mo14901d(), str + "SessionDevice");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                Context k = this.f15330i.mo16305k();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                C5420ia.m20834a(fVar, this.f15333l.mo16077h(), C6080l.m23025a(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C6080l.m23047b(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C6080l.m23064l(k), this.f15333l.mo16076g(), C6080l.m23058f(k), Build.MANUFACTURER, Build.PRODUCT);
                C6080l.m23043a((Flushable) fVar, "Failed to flush session device info.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session device file.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23043a((Flushable) fVar, "Failed to flush session device info.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session device file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush session device info.");
            C6080l.m23042a((Closeable) eVar, "Failed to close session device file.");
            throw th;
        }
    }

    /* renamed from: g */
    private void m20908g(String str) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            eVar = new C5405e(mo14901d(), str + "SessionOS");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                C5420ia.m20840a(fVar, C6080l.m23065m(this.f15330i.mo16305k()));
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session OS file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session OS file.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23043a((Flushable) fVar, "Failed to flush to session OS file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session OS file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush to session OS file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close session OS file.");
            throw th;
        }
    }

    /* renamed from: h */
    private void m20909h(String str) {
        C5405e eVar;
        C5407f fVar = null;
        try {
            eVar = new C5405e(mo14901d(), str + "SessionUser");
            try {
                fVar = C5407f.m20754a((OutputStream) eVar);
                C5432na c = m20904c(str);
                if (c.mo14878a()) {
                    C6080l.m23043a((Flushable) fVar, "Failed to flush session user file.");
                    C6080l.m23042a((Closeable) eVar, "Failed to close session user file.");
                    return;
                }
                C5420ia.m20836a(fVar, c.f15302b, c.f15303c, c.f15304d);
                C6080l.m23043a((Flushable) fVar, "Failed to flush session user file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session user file.");
            } catch (Throwable th) {
                th = th;
                C6080l.m23043a((Flushable) fVar, "Failed to flush session user file.");
                C6080l.m23042a((Closeable) eVar, "Failed to close session user file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C6080l.m23043a((Flushable) fVar, "Failed to flush session user file.");
            C6080l.m23042a((Closeable) eVar, "Failed to close session user file.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m20910k() {
        Date date = new Date();
        String cVar = new C5401c(this.f15333l).toString();
        C6211p f = C6199f.m23420f();
        f.mo16269d("CrashlyticsCore", "Opening a new session with ID " + cVar);
        m20887a(cVar, date);
        m20906e(cVar);
        m20908g(cVar);
        m20907f(cVar);
        this.f15338q.mo14799a(cVar);
    }

    /* renamed from: l */
    private String m20911l() {
        File[] n = m20913n();
        if (n.length > 0) {
            return m20869a(n[0]);
        }
        return null;
    }

    /* renamed from: m */
    private String m20912m() {
        File[] n = m20913n();
        if (n.length > 1) {
            return m20869a(n[1]);
        }
        return null;
    }

    /* renamed from: n */
    private File[] m20913n() {
        File[] i = mo14906i();
        Arrays.sort(i, f15323b);
        return i;
    }

    /* renamed from: o */
    private void m20914o() {
        File e = mo14902e();
        if (e.exists()) {
            File[] a = m20893a(e, (FilenameFilter) new C5449c());
            Arrays.sort(a, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(m20869a(a[i]));
            }
            m20890a(m20902b(e), (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14891a(float f, C6188v vVar) {
        if (vVar == null) {
            C6199f.m23420f().mo16262a("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        new C5413ha(this.f15336o.f15174a, m20896b(vVar.f17255a.f17211d), this.f15339r, this.f15340s).mo14856a(f, m20901b(vVar) ? new C5451e(this.f15330i, this.f15334m, vVar.f17257c) : new C5413ha.C5414a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14892a(int i) {
        int a = i - C5436pa.m20862a(mo14900c(), i, f15324c);
        C5436pa.m20863a(mo14901d(), f15322a, a - C5436pa.m20862a(mo14903f(), a, f15324c), f15324c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14893a(C5381d dVar) {
        this.f15331j.mo14875a(new C5439r(this, dVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14894a(C6182q qVar) {
        m20879a(qVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14895a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        mo14907j();
        this.f15344w = new C5357J(new C5444w(this), uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.f15344w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo14896a(Thread thread, Throwable th) {
        C6211p f = C6199f.m23420f();
        f.mo16269d("CrashlyticsCore", "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.f15341t.mo14781a();
        this.f15331j.mo14876b(new C5445x(this, new Date(), thread, th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14897a(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Found invalid session part file: " + file);
            hashSet.add(m20869a(file));
        }
        if (!hashSet.isEmpty()) {
            File e = mo14902e();
            if (!e.exists()) {
                e.mkdir();
            }
            for (File file2 : m20894a((FilenameFilter) new C5437q(this, hashSet))) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Moving session file: " + file2);
                if (!file2.renameTo(new File(e, file2.getName()))) {
                    C6199f.m23420f().mo16269d("CrashlyticsCore", "Could not move session file. Deleting " + file2);
                    file2.delete();
                }
            }
            m20914o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14898b() {
        this.f15331j.mo14874a((Runnable) new C5435p(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14899b(C6182q qVar) {
        return ((Boolean) this.f15331j.mo14876b(new C5433o(this, qVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public File mo14900c() {
        return new File(mo14901d(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public File mo14901d() {
        return this.f15335n.mo16233a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public File mo14902e() {
        return new File(mo14901d(), "invalidClsFiles");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo14903f() {
        return new File(mo14901d(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo14904g() {
        C5357J j = this.f15344w;
        return j != null && j.mo14775a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public File[] mo14905h() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, m20893a(mo14900c(), f15322a));
        Collections.addAll(linkedList, m20893a(mo14903f(), f15322a));
        Collections.addAll(linkedList, m20893a(mo14901d(), f15322a));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public File[] mo14906i() {
        return m20894a((FilenameFilter) new C5448b("BeginSession"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo14907j() {
        this.f15331j.mo14875a(new C5431n(this));
    }
}
