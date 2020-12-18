package org.altbeacon.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.util.HashSet;
import java.util.Set;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.c */
public class C6964c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f19250a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f19251b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f19252c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f19253d = 0;

    /* renamed from: e */
    private long f19254e = 0;

    /* renamed from: f */
    private int f19255f = 0;

    /* renamed from: g */
    private int f19256g = 0;

    /* renamed from: h */
    private boolean f19257h = false;

    /* renamed from: i */
    private long f19258i = 0;

    /* renamed from: j */
    private Context f19259j = null;

    /* renamed from: k */
    private C6965a f19260k;

    /* renamed from: l */
    private final Set<String> f19261l = new HashSet();

    /* renamed from: m */
    private final BroadcastReceiver f19262m = new C6963b(this);

    /* renamed from: org.altbeacon.bluetooth.c$a */
    public interface C6965a {
        /* renamed from: a */
        void mo18982a();
    }

    public C6964c(Context context) {
        this.f19259j = context.getApplicationContext();
        C6895d.m26021a("BluetoothCrashResolver", "constructed", new Object[0]);
        m26370h();
    }

    /* renamed from: e */
    private void m26367e() {
        try {
            Thread.sleep(5000);
            if (!this.f19251b) {
                C6895d.m26027d("BluetoothCrashResolver", "BluetoothAdapter.ACTION_DISCOVERY_STARTED never received.  Recovery may fail.", new Object[0]);
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isDiscovering()) {
                C6895d.m26021a("BluetoothCrashResolver", "Cancelling discovery", new Object[0]);
                defaultAdapter.cancelDiscovery();
                return;
            }
            C6895d.m26021a("BluetoothCrashResolver", "Discovery not running.  Won't cancel it", new Object[0]);
        } catch (InterruptedException unused) {
            C6895d.m26021a("BluetoothCrashResolver", "DiscoveryCanceller sleep interrupted.", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m26368f() {
        C6895d.m26027d("BluetoothCrashResolver", "Recovery attempt finished", new Object[0]);
        synchronized (this.f19261l) {
            this.f19261l.clear();
        }
        this.f19250a = false;
    }

    /* renamed from: g */
    private int m26369g() {
        return 1590;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (r4 != null) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A[SYNTHETIC, Splitter:B:46:0x0097] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26370h() {
        /*
            r8 = this;
            java.lang.String r0 = "BluetoothCrashResolver"
            java.lang.String r1 = "BluetoothCrashResolverState.txt"
            r2 = 0
            r3 = 1
            r4 = 0
            android.content.Context r5 = r8.f19259j     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            java.io.FileInputStream r5 = r5.openFileInput(r1)     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0075, NumberFormatException -> 0x0066 }
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x0023
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            r8.f19254e = r4     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
        L_0x0023:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x002f
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            r8.f19255f = r4     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
        L_0x002f:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x003b
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            r8.f19256g = r4     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
        L_0x003b:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x004d
            r8.f19257h = r2     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            java.lang.String r5 = "1"
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x004d
            r8.f19257h = r3     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
        L_0x004d:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            if (r4 == 0) goto L_0x0059
            java.util.Set<java.lang.String> r5 = r8.f19261l     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            r5.add(r4)     // Catch:{ IOException -> 0x0061, NumberFormatException -> 0x005f, all -> 0x005d }
            goto L_0x004d
        L_0x0059:
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0081
        L_0x005d:
            r0 = move-exception
            goto L_0x0095
        L_0x005f:
            r4 = r6
            goto L_0x0066
        L_0x0061:
            r4 = r6
            goto L_0x0075
        L_0x0063:
            r0 = move-exception
            r6 = r4
            goto L_0x0095
        L_0x0066:
            java.lang.String r5 = "Can't parse file %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0063 }
            r6[r2] = r1     // Catch:{ all -> 0x0063 }
            org.altbeacon.beacon.p293c.C6895d.m26027d(r0, r5, r6)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0081
        L_0x0071:
            r4.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0081
        L_0x0075:
            java.lang.String r5 = "Can't read macs from %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0063 }
            r6[r2] = r1     // Catch:{ all -> 0x0063 }
            org.altbeacon.beacon.p293c.C6895d.m26027d(r0, r5, r6)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0081
            goto L_0x0071
        L_0x0081:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.util.Set<java.lang.String> r3 = r8.f19261l
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Read %s Bluetooth addresses"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r0, r2, r1)
            return
        L_0x0095:
            if (r6 == 0) goto L_0x009a
            r6.close()     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.C6964c.m26370h():void");
    }

    /* renamed from: i */
    private void m26371i() {
        C6965a aVar = this.f19260k;
        if (aVar != null) {
            aVar.mo18982a();
        }
        if (SystemClock.elapsedRealtime() - this.f19258i > 60000) {
            m26372j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[SYNTHETIC, Splitter:B:39:0x00bb] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26372j() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f19258i = r0
            r0 = 1
            r1 = 0
            r2 = 0
            android.content.Context r3 = r7.f19259j     // Catch:{ IOException -> 0x0091 }
            java.lang.String r4 = "BluetoothCrashResolverState.txt"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r1)     // Catch:{ IOException -> 0x0091 }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0091 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0091 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.<init>()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            long r5 = r7.f19254e     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.append(r5)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r4.write(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.<init>()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            int r3 = r7.f19255f     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r4.write(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.<init>()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            int r3 = r7.f19256g     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r2.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            r4.write(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r2 = r7.f19257h     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "1\n"
            goto L_0x0061
        L_0x005f:
            java.lang.String r2 = "0\n"
        L_0x0061:
            r4.write(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.util.Set<java.lang.String> r2 = r7.f19261l     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            monitor-enter(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.util.Set<java.lang.String> r3 = r7.f19261l     // Catch:{ all -> 0x0087 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0087 }
        L_0x006d:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0087 }
            r4.write(r5)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "\n"
            r4.write(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x006d
        L_0x0082:
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            r4.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a3
        L_0x0087:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            throw r3     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            goto L_0x00b9
        L_0x008c:
            r2 = r4
            goto L_0x0091
        L_0x008e:
            r0 = move-exception
            r4 = r2
            goto L_0x00b9
        L_0x0091:
            java.lang.String r3 = "BluetoothCrashResolver"
            java.lang.String r4 = "Can't write macs to %s"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "BluetoothCrashResolverState.txt"
            r5[r1] = r6     // Catch:{ all -> 0x008e }
            org.altbeacon.beacon.p293c.C6895d.m26027d(r3, r4, r5)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Set<java.lang.String> r2 = r7.f19261l
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "BluetoothCrashResolver"
            java.lang.String r2 = "Wrote %s Bluetooth addresses"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r1, r2, r0)
            return
        L_0x00b9:
            if (r4 == 0) goto L_0x00be
            r4.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.C6964c.m26372j():void");
    }

    @TargetApi(17)
    /* renamed from: k */
    private void m26373k() {
        this.f19256g++;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C6895d.m26021a("BluetoothCrashResolver", "about to check if discovery is active", new Object[0]);
        if (!defaultAdapter.isDiscovering()) {
            C6895d.m26027d("BluetoothCrashResolver", "Recovery attempt started", new Object[0]);
            this.f19250a = true;
            this.f19251b = false;
            C6895d.m26021a("BluetoothCrashResolver", "about to command discovery", new Object[0]);
            if (!defaultAdapter.startDiscovery()) {
                C6895d.m26027d("BluetoothCrashResolver", "Can't start discovery.  Is Bluetooth turned on?", new Object[0]);
            }
            C6895d.m26021a("BluetoothCrashResolver", "startDiscovery commanded.  isDiscovering()=%s", Boolean.valueOf(defaultAdapter.isDiscovering()));
            C6895d.m26021a("BluetoothCrashResolver", "We will be cancelling this discovery in %s milliseconds.", Integer.valueOf(BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT));
            m26367e();
            return;
        }
        C6895d.m26027d("BluetoothCrashResolver", "Already discovering.  Recovery attempt abandoned.", new Object[0]);
    }

    /* renamed from: a */
    public void mo18977a() {
        if (Build.VERSION.SDK_INT < 18) {
            C6895d.m26021a("BluetoothCrashResolver", "Ignoring crashes before API 18, because BLE is unsupported.", new Object[0]);
            return;
        }
        C6895d.m26027d("BluetoothCrashResolver", "BluetoothService crash detected", new Object[0]);
        if (this.f19261l.size() > 0) {
            C6895d.m26021a("BluetoothCrashResolver", "Distinct Bluetooth devices seen at crash: %s", Integer.valueOf(this.f19261l.size()));
        }
        this.f19254e = SystemClock.elapsedRealtime();
        this.f19255f++;
        if (this.f19250a) {
            C6895d.m26021a("BluetoothCrashResolver", "Ignoring Bluetooth crash because recovery is already in progress.", new Object[0]);
        } else {
            m26373k();
        }
        m26371i();
    }

    @TargetApi(18)
    /* renamed from: a */
    public void mo18978a(BluetoothDevice bluetoothDevice, BluetoothAdapter.LeScanCallback leScanCallback) {
        int size = this.f19261l.size();
        synchronized (this.f19261l) {
            this.f19261l.add(bluetoothDevice.getAddress());
        }
        int size2 = this.f19261l.size();
        if (size != size2 && size2 % 100 == 0) {
            C6895d.m26021a("BluetoothCrashResolver", "Distinct Bluetooth devices seen: %s", Integer.valueOf(this.f19261l.size()));
        }
        if (this.f19261l.size() > m26369g() && !this.f19250a) {
            C6895d.m26027d("BluetoothCrashResolver", "Large number of Bluetooth devices detected: %s Proactively attempting to clear out address list to prevent a crash", Integer.valueOf(this.f19261l.size()));
            C6895d.m26027d("BluetoothCrashResolver", "Stopping LE Scan", new Object[0]);
            BluetoothAdapter.getDefaultAdapter().stopLeScan(leScanCallback);
            m26373k();
            m26371i();
        }
    }

    /* renamed from: b */
    public boolean mo18979b() {
        return this.f19250a;
    }

    /* renamed from: c */
    public void mo18980c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        this.f19259j.registerReceiver(this.f19262m, intentFilter);
        C6895d.m26021a("BluetoothCrashResolver", "started listening for BluetoothAdapter events", new Object[0]);
    }

    /* renamed from: d */
    public void mo18981d() {
        this.f19259j.unregisterReceiver(this.f19262m);
        C6895d.m26021a("BluetoothCrashResolver", "stopped listening for BluetoothAdapter events", new Object[0]);
        m26372j();
    }
}
