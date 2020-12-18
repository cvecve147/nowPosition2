package org.altbeacon.beacon.service;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.e */
public class C6941e {

    /* renamed from: a */
    private static volatile C6941e f19155a = null;

    /* renamed from: b */
    private static final String f19156b = "e";

    /* renamed from: c */
    private static final Object f19157c = new Object();

    /* renamed from: d */
    private Map<Region, C6945i> f19158d;

    /* renamed from: e */
    private Context f19159e;

    /* renamed from: f */
    private boolean f19160f = true;

    public C6941e(Context context) {
        this.f19159e = context;
    }

    /* renamed from: a */
    public static C6941e m26233a(Context context) {
        C6941e eVar = f19155a;
        if (eVar == null) {
            synchronized (f19157c) {
                eVar = f19155a;
                if (eVar == null) {
                    eVar = new C6941e(context.getApplicationContext());
                    f19155a = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: b */
    private List<Region> m26234b(Beacon beacon) {
        ArrayList arrayList = new ArrayList();
        for (Region next : mo18884c()) {
            if (next.mo18711a(beacon)) {
                arrayList.add(next);
            } else {
                C6895d.m26021a(f19156b, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private C6945i m26235b(Region region, C6918a aVar) {
        if (m26236j().containsKey(region)) {
            Iterator<Region> it = m26236j().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Region next = it.next();
                if (next.equals(region)) {
                    if (next.mo18712a(region)) {
                        return m26236j().get(next);
                    }
                    String str = f19156b;
                    C6895d.m26021a(str, "Replacing region with unique identifier " + region.mo18709a(), new Object[0]);
                    String str2 = f19156b;
                    C6895d.m26021a(str2, "Old definition: " + next, new Object[0]);
                    String str3 = f19156b;
                    C6895d.m26021a(str3, "New definition: " + region, new Object[0]);
                    C6895d.m26021a(f19156b, "clearing state", new Object[0]);
                    m26236j().remove(region);
                }
            }
        }
        C6945i iVar = new C6945i(aVar);
        m26236j().put(region, iVar);
        return iVar;
    }

    /* renamed from: j */
    private Map<Region, C6945i> m26236j() {
        if (this.f19158d == null) {
            m26237k();
        }
        return this.f19158d;
    }

    /* renamed from: k */
    private void m26237k() {
        String str;
        Object[] objArr;
        String str2;
        long currentTimeMillis = System.currentTimeMillis() - mo18876a();
        this.f19158d = new ConcurrentHashMap();
        if (!this.f19160f) {
            str = f19156b;
            objArr = new Object[0];
            str2 = "Not restoring monitoring state because persistence is disabled";
        } else if (currentTimeMillis > 900000) {
            String str3 = f19156b;
            C6895d.m26021a(str3, "Not restoring monitoring state because it was recorded too many milliseconds ago: " + currentTimeMillis, new Object[0]);
            return;
        } else {
            mo18888e();
            str = f19156b;
            objArr = new Object[0];
            str2 = "Done restoring monitoring status";
        }
        C6895d.m26021a(str, str2, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo18876a() {
        return this.f19159e.getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").lastModified();
    }

    /* renamed from: a */
    public C6945i mo18877a(Region region) {
        return m26235b(region, new C6918a((String) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18878a(long j) {
        this.f19159e.getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").setLastModified(j);
    }

    /* renamed from: a */
    public synchronized void mo18879a(Beacon beacon) {
        boolean z = false;
        for (Region next : m26234b(beacon)) {
            C6945i iVar = m26236j().get(next);
            if (iVar != null && iVar.mo18910c()) {
                z = true;
                iVar.mo18908a().mo18832a(this.f19159e, "monitoringData", new C6940d(iVar.mo18909b(), next).mo18875c());
            }
        }
        if (z) {
            mo18889f();
        } else {
            mo18878a(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public void mo18880a(Region region, Integer num) {
        C6945i iVar = m26236j().get(region);
        if (iVar == null) {
            iVar = mo18877a(region);
        }
        if (num != null) {
            if (num.intValue() == 0) {
                iVar.mo18911d();
            }
            if (num.intValue() == 1) {
                iVar.mo18910c();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo18881a(Region region, C6918a aVar) {
        m26235b(region, aVar);
        mo18889f();
    }

    /* renamed from: b */
    public void mo18882b(Region region) {
        m26236j().remove(region);
    }

    /* renamed from: b */
    public boolean mo18883b() {
        return this.f19160f;
    }

    /* renamed from: c */
    public synchronized Set<Region> mo18884c() {
        return m26236j().keySet();
    }

    /* renamed from: c */
    public synchronized void mo18885c(Region region) {
        mo18882b(region);
        mo18889f();
    }

    /* renamed from: d */
    public synchronized int mo18886d() {
        return mo18884c().size();
    }

    /* renamed from: d */
    public synchronized C6945i mo18887d(Region region) {
        return m26236j().get(region);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(13:1|2|3|4|5|6|(2:9|7)|53|10|(4:13|(2:15|57)(1:56)|54|11)|55|16|(2:18|19))|20|21|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4 A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[SYNTHETIC, Splitter:B:38:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0 A[SYNTHETIC, Splitter:B:45:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5 A[SYNTHETIC, Splitter:B:49:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18888e() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.f19159e     // Catch:{ IOException -> 0x00c2, ClassNotFoundException -> 0x00c0, ClassCastException -> 0x00be, all -> 0x00b9 }
            java.lang.String r3 = "org.altbeacon.beacon.service.monitoring_status_state"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ IOException -> 0x00c2, ClassNotFoundException -> 0x00c0, ClassCastException -> 0x00be, all -> 0x00b9 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00b4, ClassNotFoundException -> 0x00b2, ClassCastException -> 0x00b0, all -> 0x00ad }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00b4, ClassNotFoundException -> 0x00b2, ClassCastException -> 0x00b0, all -> 0x00ad }
            java.lang.Object r0 = r3.readObject()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r4 = f19156b     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r5.<init>()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = "Restored region monitoring state for "
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            int r6 = r0.size()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = " regions."
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r4, r5, r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Set r4 = r0.keySet()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
        L_0x003e:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.Region r5 = (org.altbeacon.beacon.Region) r5     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = f19156b     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.<init>()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = "Region  "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = " uniqueId: "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = r5.mo18709a()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = " state: "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r6, r5, r7)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            goto L_0x003e
        L_0x007b:
            java.util.Collection r4 = r0.values()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
        L_0x0083:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.service.i r5 = (org.altbeacon.beacon.service.C6945i) r5     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            boolean r6 = r5.mo18909b()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r6 == 0) goto L_0x0083
            r5.mo18910c()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            goto L_0x0083
        L_0x0099:
            java.util.Map<org.altbeacon.beacon.Region, org.altbeacon.beacon.service.i> r4 = r10.f19158d     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r4.putAll(r0)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            r3.close()     // Catch:{ IOException -> 0x00ec }
            goto L_0x00ec
        L_0x00a7:
            r0 = move-exception
            goto L_0x00c6
        L_0x00a9:
            r0 = move-exception
            goto L_0x00c6
        L_0x00ab:
            r0 = move-exception
            goto L_0x00c6
        L_0x00ad:
            r1 = move-exception
            r3 = r0
            goto L_0x00bc
        L_0x00b0:
            r3 = move-exception
            goto L_0x00b5
        L_0x00b2:
            r3 = move-exception
            goto L_0x00b5
        L_0x00b4:
            r3 = move-exception
        L_0x00b5:
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x00c6
        L_0x00b9:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x00bc:
            r0 = r1
            goto L_0x00ee
        L_0x00be:
            r2 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r2 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r2 = move-exception
        L_0x00c3:
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x00c6:
            boolean r4 = r0 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x00ed }
            if (r4 == 0) goto L_0x00d4
            java.lang.String r0 = f19156b     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "Serialized Monitoring State has wrong class. Just ignoring saved state..."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ed }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r0, r4, r1)     // Catch:{ all -> 0x00ed }
            goto L_0x00e4
        L_0x00d4:
            java.lang.String r4 = f19156b     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "Deserialization exception, message: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ed }
            r6[r1] = r0     // Catch:{ all -> 0x00ed }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r4, r5, r6)     // Catch:{ all -> 0x00ed }
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            if (r3 == 0) goto L_0x00ec
            goto L_0x00a3
        L_0x00ec:
            return
        L_0x00ed:
            r0 = move-exception
        L_0x00ee:
            if (r2 == 0) goto L_0x00f3
            r2.close()     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            if (r3 == 0) goto L_0x00f8
            r3.close()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C6941e.mo18888e():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[SYNTHETIC, Splitter:B:35:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC, Splitter:B:42:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f A[SYNTHETIC, Splitter:B:46:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18889f() {
        /*
            r9 = this;
            boolean r0 = r9.f19160f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = f19156b
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "saveMonitoringStatusIfOn()"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r0, r3, r2)
            java.util.Map r0 = r9.m26236j()
            int r0 = r0.size()
            r2 = 50
            java.lang.String r3 = "org.altbeacon.beacon.service.monitoring_status_state"
            if (r0 <= r2) goto L_0x002d
            java.lang.String r0 = f19156b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Too many regions being monitored.  Will not persist region state"
            org.altbeacon.beacon.p293c.C6895d.m26027d(r0, r2, r1)
            android.content.Context r0 = r9.f19159e
            r0.deleteFile(r3)
            goto L_0x0096
        L_0x002d:
            r0 = 0
            android.content.Context r2 = r9.f19159e     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r1)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r3.<init>(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            java.util.Map r0 = r9.m26236j()     // Catch:{ IOException -> 0x006a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x006a }
            r4.<init>()     // Catch:{ IOException -> 0x006a }
            java.util.Set r5 = r0.keySet()     // Catch:{ IOException -> 0x006a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x006a }
        L_0x004a:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x006a }
            if (r6 == 0) goto L_0x005e
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x006a }
            org.altbeacon.beacon.Region r6 = (org.altbeacon.beacon.Region) r6     // Catch:{ IOException -> 0x006a }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ IOException -> 0x006a }
            r4.put(r6, r7)     // Catch:{ IOException -> 0x006a }
            goto L_0x004a
        L_0x005e:
            r3.writeObject(r4)     // Catch:{ IOException -> 0x006a }
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r3.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x0096
        L_0x006a:
            r0 = move-exception
            goto L_0x007d
        L_0x006c:
            r1 = move-exception
            r3 = r0
            goto L_0x0077
        L_0x006f:
            r3 = move-exception
            r8 = r3
            r3 = r0
            r0 = r8
            goto L_0x007d
        L_0x0074:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x0077:
            r0 = r1
            goto L_0x0098
        L_0x0079:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x007d:
            java.lang.String r4 = f19156b     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "Error while saving monitored region states to file "
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0097 }
            r6[r1] = r0     // Catch:{ all -> 0x0097 }
            org.altbeacon.beacon.p293c.C6895d.m26024b(r4, r5, r6)     // Catch:{ all -> 0x0097 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0097 }
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0093
            r2.close()     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            if (r3 == 0) goto L_0x0096
            goto L_0x0066
        L_0x0096:
            return
        L_0x0097:
            r0 = move-exception
        L_0x0098:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x009d }
        L_0x009d:
            if (r3 == 0) goto L_0x00a2
            r3.close()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C6941e.mo18889f():void");
    }

    /* renamed from: g */
    public synchronized void mo18890g() {
        if (!this.f19160f) {
            this.f19160f = true;
            mo18889f();
        }
    }

    /* renamed from: h */
    public synchronized void mo18891h() {
        this.f19159e.deleteFile("org.altbeacon.beacon.service.monitoring_status_state");
        this.f19160f = false;
    }

    /* renamed from: i */
    public synchronized void mo18892i() {
        boolean z = false;
        for (Region next : mo18884c()) {
            C6945i d = mo18887d(next);
            if (d.mo18912e()) {
                C6895d.m26021a(f19156b, "found a monitor that expired: %s", next);
                d.mo18908a().mo18832a(this.f19159e, "monitoringData", new C6940d(d.mo18909b(), next).mo18875c());
                z = true;
            }
        }
        if (z) {
            mo18889f();
        } else {
            mo18878a(System.currentTimeMillis());
        }
    }
}
