package org.altbeacon.beacon.service;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.service.p296a.C6919a;
import org.altbeacon.beacon.service.p296a.C6922d;
import org.altbeacon.beacon.service.p296a.C6934p;
import org.altbeacon.beacon.service.p296a.C6935q;
import org.altbeacon.beacon.service.p296a.C6936r;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.bluetooth.C6964c;

/* renamed from: org.altbeacon.beacon.service.n */
class C6951n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19182a = "n";

    /* renamed from: b */
    private ExecutorService f19183b;

    /* renamed from: c */
    private C6906h f19184c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6922d f19185d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6941e f19186e;

    /* renamed from: f */
    private final Map<Region, C6942f> f19187f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6934p f19188g = new C6934p();

    /* renamed from: h */
    private C6939c f19189h = new C6939c();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Set<C6910i> f19190i = new HashSet();

    /* renamed from: j */
    private List<Beacon> f19191j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Context f19192k;

    /* renamed from: l */
    private final C6919a f19193l = new C6950m(this);

    /* renamed from: org.altbeacon.beacon.service.n$a */
    private class C6952a {

        /* renamed from: a */
        final int f19194a;

        /* renamed from: b */
        BluetoothDevice f19195b;

        /* renamed from: c */
        byte[] f19196c;

        C6952a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            this.f19195b = bluetoothDevice;
            this.f19194a = i;
            this.f19196c = bArr;
        }
    }

    /* renamed from: org.altbeacon.beacon.service.n$b */
    private class C6953b extends AsyncTask<C6952a, Void, Void> {

        /* renamed from: a */
        final C6938b f19198a = C6938b.m26222a();

        /* renamed from: b */
        private final C6935q f19199b;

        C6953b(C6935q qVar) {
            this.f19199b = qVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x0025, LOOP_START, PHI: r3 
          PHI: (r3v1 org.altbeacon.beacon.Beacon) = (r3v0 org.altbeacon.beacon.Beacon), (r3v6 org.altbeacon.beacon.Beacon) binds: [B:0:0x0000, B:4:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(org.altbeacon.beacon.service.C6951n.C6952a... r8) {
            /*
                r7 = this;
                r0 = 0
                r8 = r8[r0]
                org.altbeacon.beacon.service.n r1 = org.altbeacon.beacon.service.C6951n.this
                java.util.Set r1 = r1.f19190i
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
                r3 = r2
            L_0x000f:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0027
                java.lang.Object r3 = r1.next()
                org.altbeacon.beacon.i r3 = (org.altbeacon.beacon.C6910i) r3
                byte[] r4 = r8.f19196c
                int r5 = r8.f19194a
                android.bluetooth.BluetoothDevice r6 = r8.f19195b
                org.altbeacon.beacon.Beacon r3 = r3.mo18721a((byte[]) r4, (int) r5, (android.bluetooth.BluetoothDevice) r6)
                if (r3 == 0) goto L_0x000f
            L_0x0027:
                if (r3 == 0) goto L_0x009d
                boolean r1 = org.altbeacon.beacon.p293c.C6895d.m26023a()
                if (r1 == 0) goto L_0x0055
                java.lang.String r1 = org.altbeacon.beacon.service.C6951n.f19182a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Beacon packet detected for: "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r5 = " with rssi "
                r4.append(r5)
                int r5 = r3.mo18702k()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r5 = new java.lang.Object[r0]
                org.altbeacon.beacon.p293c.C6895d.m26021a(r1, r4, r5)
            L_0x0055:
                org.altbeacon.beacon.service.b r1 = r7.f19198a
                r1.mo18871c()
                org.altbeacon.beacon.service.n r1 = org.altbeacon.beacon.service.C6951n.this
                org.altbeacon.beacon.service.a.d r1 = r1.f19185d
                if (r1 == 0) goto L_0x0097
                org.altbeacon.beacon.service.n r1 = org.altbeacon.beacon.service.C6951n.this
                org.altbeacon.beacon.service.a.d r1 = r1.f19185d
                boolean r1 = r1.mo18846f()
                if (r1 != 0) goto L_0x0097
                org.altbeacon.beacon.service.n r1 = org.altbeacon.beacon.service.C6951n.this
                org.altbeacon.beacon.service.a.p r1 = r1.f19188g
                android.bluetooth.BluetoothDevice r4 = r8.f19195b
                java.lang.String r4 = r4.getAddress()
                byte[] r8 = r8.f19196c
                boolean r8 = r1.mo18865a(r4, r8)
                if (r8 != 0) goto L_0x0097
                java.lang.String r8 = org.altbeacon.beacon.service.C6951n.f19182a
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Non-distinct packets detected in a single scan.  Restarting scans unecessary."
                org.altbeacon.beacon.p293c.C6895d.m26026c(r8, r1, r0)
                org.altbeacon.beacon.service.n r8 = org.altbeacon.beacon.service.C6951n.this
                org.altbeacon.beacon.service.a.d r8 = r8.f19185d
                r0 = 1
                r8.mo18840a((boolean) r0)
            L_0x0097:
                org.altbeacon.beacon.service.n r8 = org.altbeacon.beacon.service.C6951n.this
                r8.m26293a((org.altbeacon.beacon.Beacon) r3)
                goto L_0x00aa
            L_0x009d:
                org.altbeacon.beacon.service.a.q r0 = r7.f19199b
                if (r0 == 0) goto L_0x00aa
                android.bluetooth.BluetoothDevice r1 = r8.f19195b
                int r3 = r8.f19194a
                byte[] r8 = r8.f19196c
                r0.mo18866a(r1, r3, r8)
            L_0x00aa:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C6951n.C6953b.doInBackground(org.altbeacon.beacon.service.n$a[]):java.lang.Void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    C6951n(Context context) {
        this.f19192k = context;
        this.f19184c = C6906h.m26069a(context);
    }

    /* renamed from: a */
    private List<Region> m26292a(Beacon beacon, Collection<Region> collection) {
        ArrayList arrayList = new ArrayList();
        for (Region next : collection) {
            if (next.mo18711a(beacon)) {
                arrayList.add(next);
            } else {
                C6895d.m26021a(f19182a, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26293a(Beacon beacon) {
        if (C6960u.m26350b().mo18970c()) {
            C6960u.m26350b().mo18969a(beacon);
        }
        if (C6895d.m26023a()) {
            C6895d.m26021a(f19182a, "beacon detected : %s", beacon.toString());
        }
        Beacon a = this.f19189h.mo18872a(beacon);
        if (a != null) {
            this.f19186e.mo18879a(a);
            C6895d.m26021a(f19182a, "looking for ranging region matches for this beacon", new Object[0]);
            synchronized (this.f19187f) {
                for (Region next : m26292a(a, (Collection<Region>) this.f19187f.keySet())) {
                    C6895d.m26021a(f19182a, "matches ranging region: %s", next);
                    C6942f fVar = this.f19187f.get(next);
                    if (fVar != null) {
                        fVar.mo18894a(a);
                    }
                }
            }
        } else if (C6895d.m26023a()) {
            C6895d.m26021a(f19182a, "not processing detections for GATT extra data beacon", new Object[0]);
        }
    }

    /* renamed from: i */
    private ExecutorService m26300i() {
        if (this.f19183b == null) {
            this.f19183b = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        }
        return this.f19183b;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m26301j() {
        synchronized (this.f19187f) {
            for (Region next : this.f19187f.keySet()) {
                C6942f fVar = this.f19187f.get(next);
                C6895d.m26021a(f19182a, "Calling ranging callback", new Object[0]);
                fVar.mo18895b().mo18832a(this.f19192k, "rangingData", new C6944h(fVar.mo18893a(), next).mo18907c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(11)
    /* renamed from: a */
    public void mo18919a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        Object[] objArr;
        String str2;
        try {
            new C6953b(this.f19184c.mo18775p()).executeOnExecutor(m26300i(), new C6952a[]{new C6952a(bluetoothDevice, i, bArr)});
            return;
        } catch (RejectedExecutionException unused) {
            str2 = f19182a;
            objArr = new Object[0];
            str = "Ignoring scan result because we cannot keep up.";
        } catch (OutOfMemoryError unused2) {
            str2 = f19182a;
            objArr = new Object[0];
            str = "Ignoring scan result because we cannot start a thread to keep up.";
        }
        C6895d.m26027d(str2, str, objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18920a(List<Beacon> list) {
        this.f19191j = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18921a(Map<Region, C6942f> map) {
        synchronized (this.f19187f) {
            this.f19187f.clear();
            this.f19187f.putAll(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18922a(Set<C6910i> set) {
        this.f19190i = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18923a(C6939c cVar) {
        this.f19189h = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18924a(C6941e eVar) {
        this.f19186e = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18925a(boolean z, C6964c cVar) {
        this.f19185d = C6922d.m26175a(this.f19192k, 1100, 0, z, this.f19193l, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6922d mo18926b() {
        return this.f19185d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18927b(Set<C6910i> set) {
        String str;
        Object[] objArr;
        String str2;
        String str3;
        String str4;
        Object[] objArr2;
        ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
        List<ScanFilter> a = new C6936r().mo18868a((List<C6910i>) new ArrayList(set));
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.f19192k.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                str3 = f19182a;
                str4 = "Failed to construct a BluetoothAdapter";
                objArr2 = new Object[0];
            } else if (!adapter.isEnabled()) {
                str3 = f19182a;
                str4 = "Failed to start background scan on Android O: BluetoothAdapter is not enabled";
                objArr2 = new Object[0];
            } else {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    int startScan = bluetoothLeScanner.startScan(a, build, mo18930e());
                    if (startScan != 0) {
                        String str5 = f19182a;
                        C6895d.m26024b(str5, "Failed to start background scan on Android O.  Code: " + startScan, new Object[0]);
                        return;
                    }
                    C6895d.m26021a(f19182a, "Started passive beacon scan", new Object[0]);
                    return;
                }
                C6895d.m26024b(f19182a, "Failed to start background scan on Android O: scanner is null", new Object[0]);
                return;
            }
            C6895d.m26027d(str3, str4, objArr2);
        } catch (SecurityException unused) {
            C6895d.m26024b(f19182a, "SecurityException making Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            str2 = f19182a;
            objArr = new Object[]{e};
            str = "NullPointerException starting Android O background scanner";
            C6895d.m26024b(str2, str, objArr);
        } catch (RuntimeException e2) {
            str2 = f19182a;
            objArr = new Object[]{e2};
            str = "Unexpected runtime exception starting Android O background scanner";
            C6895d.m26024b(str2, str, objArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6941e mo18928c() {
        return this.f19186e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<Region, C6942f> mo18929d() {
        return this.f19187f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PendingIntent mo18930e() {
        Intent intent = new Intent(this.f19192k, StartupBroadcastReceiver.class);
        intent.putExtra("o-scan", true);
        return PendingIntent.getBroadcast(this.f19192k, 0, intent, 134217728);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo18931f() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f19184c.mo18767f());
        boolean z = true;
        for (C6910i next : this.f19184c.mo18767f()) {
            if (next.mo18785a().size() > 0) {
                z = false;
                hashSet.addAll(next.mo18785a());
            }
        }
        this.f19190i = hashSet;
        this.f19189h = new C6939c(z);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        mo18934h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18933g() {
        String str;
        String str2;
        Object[] objArr;
        String str3;
        String str4;
        Object[] objArr2;
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.f19192k.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                str3 = f19182a;
                str4 = "Failed to construct a BluetoothAdapter";
                objArr2 = new Object[0];
            } else if (!adapter.isEnabled()) {
                str3 = f19182a;
                str4 = "BluetoothAdapter is not enabled";
                objArr2 = new Object[0];
            } else {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(mo18930e());
                    return;
                }
                return;
            }
            C6895d.m26027d(str3, str4, objArr2);
        } catch (SecurityException unused) {
            C6895d.m26024b(f19182a, "SecurityException stopping Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            str = f19182a;
            objArr = new Object[]{e};
            str2 = "NullPointerException stopping Android O background scanner";
            C6895d.m26024b(str, str2, objArr);
        } catch (RuntimeException e2) {
            str = f19182a;
            objArr = new Object[]{e2};
            str2 = "Unexpected runtime exception stopping Android O background scanner";
            C6895d.m26024b(str, str2, objArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18934h() {
        ExecutorService executorService = this.f19183b;
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (!this.f19183b.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                    C6895d.m26024b(f19182a, "Can't stop beacon parsing thread.", new Object[0]);
                }
            } catch (InterruptedException unused) {
                C6895d.m26024b(f19182a, "Interrupted waiting to stop beacon parsing thread.", new Object[0]);
            }
            this.f19183b = null;
        }
    }
}
