package org.altbeacon.beacon.service;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.r */
public class C6957r implements Serializable {

    /* renamed from: a */
    private static final String f19210a = "r";

    /* renamed from: b */
    public static int f19211b = 300000;

    /* renamed from: c */
    private Map<Region, C6942f> f19212c = new HashMap();

    /* renamed from: d */
    private transient C6941e f19213d;

    /* renamed from: e */
    private Set<C6910i> f19214e = new HashSet();

    /* renamed from: f */
    private C6939c f19215f = new C6939c();

    /* renamed from: g */
    private long f19216g;

    /* renamed from: h */
    private long f19217h;

    /* renamed from: i */
    private long f19218i;

    /* renamed from: j */
    private long f19219j;

    /* renamed from: k */
    private boolean f19220k;

    /* renamed from: l */
    private long f19221l = 0;

    /* renamed from: m */
    private transient Context f19222m;

    public C6957r(Context context) {
        this.f19222m = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:65|(0)|(0)|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(5:3|4|5|6|(5:7|8|9|10|(2:12|13)))|14|15|(2:57|58)|59|(1:61)|62|63) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r9 = r5;
        r5 = null;
        r1 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005b, code lost:
        org.altbeacon.beacon.p293c.C6895d.m26021a(f19210a, "Serialized ScanState has wrong class. Just ignoring saved state...", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
        org.altbeacon.beacon.p293c.C6895d.m26024b(f19210a, "Deserialization exception", new java.lang.Object[0]);
        android.util.Log.e(f19210a, "error: ", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005b A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0065 A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC, Splitter:B:42:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a A[SYNTHETIC, Splitter:B:51:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5 A[SYNTHETIC, Splitter:B:67:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ed A[SYNTHETIC, Splitter:B:72:0x00ed] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0057=Splitter:B:36:0x0057, B:48:0x007f=Splitter:B:48:0x007f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.C6957r m26329a(android.content.Context r10) {
        /*
            java.lang.Class<org.altbeacon.beacon.service.r> r0 = org.altbeacon.beacon.service.C6957r.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android-beacon-library-scan-state"
            java.io.FileInputStream r3 = r10.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x007d, IOException -> 0x0054, ClassNotFoundException -> 0x0052, ClassCastException -> 0x0050, all -> 0x004c }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0042, ClassNotFoundException -> 0x0040, ClassCastException -> 0x003e, all -> 0x0039 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0042, ClassNotFoundException -> 0x0040, ClassCastException -> 0x003e, all -> 0x0039 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0031, ClassNotFoundException -> 0x002f, ClassCastException -> 0x002d, all -> 0x002b }
            org.altbeacon.beacon.service.r r5 = (org.altbeacon.beacon.service.C6957r) r5     // Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0031, ClassNotFoundException -> 0x002f, ClassCastException -> 0x002d, all -> 0x002b }
            r5.f19222m = r10     // Catch:{ FileNotFoundException -> 0x004a, IOException -> 0x0026, ClassNotFoundException -> 0x0024, ClassCastException -> 0x0022, all -> 0x002b }
            if (r3 == 0) goto L_0x001d
            r3.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0090
        L_0x0022:
            r1 = move-exception
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            goto L_0x0027
        L_0x0026:
            r1 = move-exception
        L_0x0027:
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0057
        L_0x002b:
            r10 = move-exception
            goto L_0x003b
        L_0x002d:
            r5 = move-exception
            goto L_0x0032
        L_0x002f:
            r5 = move-exception
            goto L_0x0032
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            r9 = r5
            r5 = r1
            r1 = r3
            r3 = r9
            goto L_0x0057
        L_0x0037:
            r5 = r1
            goto L_0x004a
        L_0x0039:
            r10 = move-exception
            r4 = r1
        L_0x003b:
            r1 = r3
            goto L_0x00e3
        L_0x003e:
            r4 = move-exception
            goto L_0x0043
        L_0x0040:
            r4 = move-exception
            goto L_0x0043
        L_0x0042:
            r4 = move-exception
        L_0x0043:
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L_0x0057
        L_0x0048:
            r4 = r1
            r5 = r4
        L_0x004a:
            r1 = r3
            goto L_0x007f
        L_0x004c:
            r10 = move-exception
            r4 = r1
            goto L_0x00e3
        L_0x0050:
            r3 = move-exception
            goto L_0x0055
        L_0x0052:
            r3 = move-exception
            goto L_0x0055
        L_0x0054:
            r3 = move-exception
        L_0x0055:
            r4 = r1
            r5 = r4
        L_0x0057:
            boolean r6 = r3 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x0065
            java.lang.String r3 = f19210a     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = "Serialized ScanState has wrong class. Just ignoring saved state..."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r3, r6, r7)     // Catch:{ all -> 0x00e2 }
            goto L_0x0075
        L_0x0065:
            java.lang.String r6 = f19210a     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = "Deserialization exception"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r6, r7, r8)     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = f19210a     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = "error: "
            android.util.Log.e(r6, r7, r3)     // Catch:{ all -> 0x00e2 }
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            if (r4 == 0) goto L_0x0090
            goto L_0x001d
        L_0x007d:
            r4 = r1
            r5 = r4
        L_0x007f:
            java.lang.String r3 = f19210a     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = "Serialized ScanState does not exist.  This may be normal on first run."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            org.altbeacon.beacon.p293c.C6895d.m26027d(r3, r6, r7)     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x008d
            r1.close()     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            if (r4 == 0) goto L_0x0090
            goto L_0x001d
        L_0x0090:
            if (r5 != 0) goto L_0x0097
            org.altbeacon.beacon.service.r r5 = new org.altbeacon.beacon.service.r     // Catch:{ all -> 0x00e9 }
            r5.<init>(r10)     // Catch:{ all -> 0x00e9 }
        L_0x0097:
            org.altbeacon.beacon.service.c r1 = r5.f19215f     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x00a2
            org.altbeacon.beacon.service.c r1 = new org.altbeacon.beacon.service.c     // Catch:{ all -> 0x00e9 }
            r1.<init>()     // Catch:{ all -> 0x00e9 }
            r5.f19215f = r1     // Catch:{ all -> 0x00e9 }
        L_0x00a2:
            org.altbeacon.beacon.service.e r10 = org.altbeacon.beacon.service.C6941e.m26233a((android.content.Context) r10)     // Catch:{ all -> 0x00e9 }
            r5.f19213d = r10     // Catch:{ all -> 0x00e9 }
            java.lang.String r10 = f19210a     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r1.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "Scan state restore regions: monitored="
            r1.append(r3)     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.service.e r3 = r5.mo18958h()     // Catch:{ all -> 0x00e9 }
            java.util.Set r3 = r3.mo18884c()     // Catch:{ all -> 0x00e9 }
            int r3 = r3.size()     // Catch:{ all -> 0x00e9 }
            r1.append(r3)     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = " ranged="
            r1.append(r3)     // Catch:{ all -> 0x00e9 }
            java.util.Map r3 = r5.mo18959i()     // Catch:{ all -> 0x00e9 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x00e9 }
            int r3 = r3.size()     // Catch:{ all -> 0x00e9 }
            r1.append(r3)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e9 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r10, r1, r2)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            return r5
        L_0x00e2:
            r10 = move-exception
        L_0x00e3:
            if (r1 == 0) goto L_0x00eb
            r1.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00eb
        L_0x00e9:
            r10 = move-exception
            goto L_0x00f1
        L_0x00eb:
            if (r4 == 0) goto L_0x00f0
            r4.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            throw r10     // Catch:{ all -> 0x00e9 }
        L_0x00f1:
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C6957r.m26329a(android.content.Context):org.altbeacon.beacon.service.r");
    }

    /* renamed from: a */
    public Long mo18949a() {
        return Long.valueOf(this.f19217h);
    }

    /* renamed from: a */
    public void mo18950a(long j) {
        this.f19221l = j;
    }

    /* renamed from: a */
    public void mo18951a(C6906h hVar) {
        this.f19214e = new HashSet(hVar.mo18767f());
        this.f19218i = hVar.mo18770k();
        this.f19216g = hVar.mo18769j();
        this.f19219j = hVar.mo18766e();
        this.f19217h = hVar.mo18764c();
        this.f19220k = hVar.mo18765d();
        ArrayList arrayList = new ArrayList(this.f19213d.mo18884c());
        ArrayList arrayList2 = new ArrayList(this.f19212c.keySet());
        ArrayList arrayList3 = new ArrayList(hVar.mo18773n());
        ArrayList arrayList4 = new ArrayList(hVar.mo18776q());
        String str = f19210a;
        C6895d.m26021a(str, "ranged regions: old=" + arrayList2.size() + " new=" + arrayList4.size(), new Object[0]);
        String str2 = f19210a;
        C6895d.m26021a(str2, "monitored regions: old=" + arrayList.size() + " new=" + arrayList3.size(), new Object[0]);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (!arrayList2.contains(region)) {
                String str3 = f19210a;
                C6895d.m26021a(str3, "Starting ranging region: " + region, new Object[0]);
                this.f19212c.put(region, new C6942f(new C6918a(this.f19222m.getPackageName())));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region2 = (Region) it2.next();
            if (!arrayList4.contains(region2)) {
                String str4 = f19210a;
                C6895d.m26021a(str4, "Stopping ranging region: " + region2, new Object[0]);
                this.f19212c.remove(region2);
            }
        }
        String str5 = f19210a;
        C6895d.m26021a(str5, "Updated state with " + arrayList4.size() + " ranging regions and " + arrayList3.size() + " monitoring regions.", new Object[0]);
        mo18962l();
    }

    /* renamed from: b */
    public Boolean mo18952b() {
        return Boolean.valueOf(this.f19220k);
    }

    /* renamed from: c */
    public Long mo18953c() {
        return Long.valueOf(this.f19219j);
    }

    /* renamed from: d */
    public Set<C6910i> mo18954d() {
        return this.f19214e;
    }

    /* renamed from: e */
    public C6939c mo18955e() {
        return this.f19215f;
    }

    /* renamed from: f */
    public Long mo18956f() {
        return Long.valueOf(this.f19216g);
    }

    /* renamed from: g */
    public Long mo18957g() {
        return Long.valueOf(this.f19218i);
    }

    /* renamed from: h */
    public C6941e mo18958h() {
        return this.f19213d;
    }

    /* renamed from: i */
    public Map<Region, C6942f> mo18959i() {
        return this.f19212c;
    }

    /* renamed from: j */
    public int mo18960j() {
        Long l;
        long j;
        if (mo18952b().booleanValue()) {
            j = mo18953c().longValue();
            l = mo18949a();
        } else {
            j = mo18957g().longValue();
            l = mo18956f();
        }
        long longValue = j + l.longValue();
        int i = f19211b;
        return longValue > ((long) i) ? (int) longValue : i;
    }

    /* renamed from: k */
    public int mo18961k() {
        String str = f19210a;
        C6895d.m26021a(str, "ScanState says background mode for ScanJob is " + mo18952b(), new Object[0]);
        long longValue = (mo18952b().booleanValue() ? mo18953c() : mo18957g()).longValue();
        if (!mo18952b().booleanValue()) {
            int i = f19211b;
            if (longValue < ((long) i)) {
                return i;
            }
        }
        return (int) longValue;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:40|(2:42|43)|(2:47|48)|49|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|(5:3|4|5|6|(6:7|8|(1:10)|11|(1:13)|(2:15|16)))|17|18|36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (r4 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ce */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[SYNTHETIC, Splitter:B:32:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3 A[SYNTHETIC, Splitter:B:42:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb A[SYNTHETIC, Splitter:B:47:0x00cb] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x00b9=Splitter:B:36:0x00b9, B:49:0x00ce=Splitter:B:49:0x00ce} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18962l() {
        /*
            r10 = this;
            java.lang.Class<org.altbeacon.beacon.service.r> r0 = org.altbeacon.beacon.service.C6957r.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            android.content.Context r3 = r10.f19222m     // Catch:{ IOException -> 0x009d, all -> 0x0098 }
            java.lang.String r4 = "android-beacon-library-scan-state-temp"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r2)     // Catch:{ IOException -> 0x009d, all -> 0x0098 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0093, all -> 0x0090 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0093, all -> 0x0090 }
            r4.writeObject(r10)     // Catch:{ IOException -> 0x008e }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x008e }
            android.content.Context r5 = r10.f19222m     // Catch:{ IOException -> 0x008e }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x008e }
            java.lang.String r6 = "android-beacon-library-scan-state"
            r1.<init>(r5, r6)     // Catch:{ IOException -> 0x008e }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008e }
            android.content.Context r6 = r10.f19222m     // Catch:{ IOException -> 0x008e }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ IOException -> 0x008e }
            java.lang.String r7 = "android-beacon-library-scan-state-temp"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x008e }
            java.lang.String r6 = f19210a     // Catch:{ IOException -> 0x008e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            r7.<init>()     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = "Temp file is "
            r7.append(r8)     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x008e }
            r7.append(r8)     // Catch:{ IOException -> 0x008e }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x008e }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008e }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r6, r7, r8)     // Catch:{ IOException -> 0x008e }
            java.lang.String r6 = f19210a     // Catch:{ IOException -> 0x008e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            r7.<init>()     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = "Perm file is "
            r7.append(r8)     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x008e }
            r7.append(r8)     // Catch:{ IOException -> 0x008e }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x008e }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008e }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r6, r7, r8)     // Catch:{ IOException -> 0x008e }
            boolean r6 = r1.delete()     // Catch:{ IOException -> 0x008e }
            if (r6 != 0) goto L_0x0076
            java.lang.String r6 = f19210a     // Catch:{ IOException -> 0x008e }
            java.lang.String r7 = "Error while saving scan status to file: Cannot delete existing file."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008e }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r6, r7, r8)     // Catch:{ IOException -> 0x008e }
        L_0x0076:
            boolean r1 = r5.renameTo(r1)     // Catch:{ IOException -> 0x008e }
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = f19210a     // Catch:{ IOException -> 0x008e }
            java.lang.String r5 = "Error while saving scan status to file: Cannot rename temp file."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008e }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r1, r5, r6)     // Catch:{ IOException -> 0x008e }
        L_0x0085:
            if (r3 == 0) goto L_0x008a
            r3.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            r4.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00b9
        L_0x008e:
            r1 = move-exception
            goto L_0x00a1
        L_0x0090:
            r2 = move-exception
            r4 = r1
            goto L_0x009b
        L_0x0093:
            r4 = move-exception
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x00a1
        L_0x0098:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x009b:
            r1 = r2
            goto L_0x00c1
        L_0x009d:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
        L_0x00a1:
            java.lang.String r5 = f19210a     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = "Error while saving scan status to file: "
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00c0 }
            r7[r2] = r1     // Catch:{ all -> 0x00c0 }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r5, r6, r7)     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00b6
            r3.close()     // Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            if (r4 == 0) goto L_0x00b9
            goto L_0x008a
        L_0x00b9:
            org.altbeacon.beacon.service.e r1 = r10.f19213d     // Catch:{ all -> 0x00c7 }
            r1.mo18889f()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x00c0:
            r1 = move-exception
        L_0x00c1:
            if (r3 == 0) goto L_0x00c9
            r3.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c9
        L_0x00c7:
            r1 = move-exception
            goto L_0x00cf
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            r4.close()     // Catch:{ IOException -> 0x00ce }
        L_0x00ce:
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00cf:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C6957r.mo18962l():void");
    }
}
