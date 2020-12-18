package p101d.p201j.p202a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;

/* renamed from: d.j.a.g */
public class C6036g {

    /* renamed from: a */
    private C6042j f16885a;

    /* renamed from: b */
    private String f16886b;

    /* renamed from: c */
    private String f16887c;

    /* renamed from: d */
    private String f16888d;

    /* renamed from: e */
    private int f16889e;

    /* renamed from: f */
    private int f16890f;

    /* renamed from: g */
    private float f16891g;

    /* renamed from: h */
    private int f16892h;

    /* renamed from: i */
    private long f16893i;

    /* renamed from: j */
    private C6043k f16894j;

    /* renamed from: k */
    private double f16895k;

    /* renamed from: l */
    private double f16896l;

    /* renamed from: m */
    private double f16897m;

    /* renamed from: n */
    private C6030a f16898n;

    public C6036g() {
        m22909h();
    }

    public C6036g(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f16885a = C6042j.BEACON;
        this.f16898n = new C6030a(bArr);
        this.f16886b = bluetoothDevice.getName();
        this.f16887c = bluetoothDevice.getAddress().toUpperCase();
        this.f16888d = this.f16898n.mo15961c().toLowerCase();
        this.f16889e = this.f16898n.mo15959a();
        this.f16890f = this.f16898n.mo15960b();
        this.f16891g = (float) i;
        this.f16894j = C6043k.UNKNOWN;
        this.f16898n = null;
    }

    public C6036g(ScanResult scanResult) {
        this.f16885a = C6042j.BEACON;
        ScanRecord scanRecord = scanResult.getScanRecord();
        this.f16898n = new C6030a(scanRecord.getBytes());
        this.f16886b = scanRecord.getDeviceName();
        this.f16887c = scanResult.getDevice().getAddress().toUpperCase();
        this.f16888d = this.f16898n.mo15961c().toLowerCase();
        this.f16889e = this.f16898n.mo15959a();
        this.f16890f = this.f16898n.mo15960b();
        this.f16891g = (float) scanResult.getRssi();
        this.f16893i = scanResult.getTimestampNanos();
        this.f16894j = C6043k.NANOSECONDS;
        this.f16898n = null;
    }

    public C6036g(android.net.wifi.ScanResult scanResult) {
        this.f16885a = C6042j.WIFI;
        this.f16886b = scanResult.SSID.toUpperCase();
        this.f16887c = scanResult.BSSID.toUpperCase();
        this.f16891g = (float) scanResult.level;
        this.f16889e = 0;
        this.f16890f = 0;
        this.f16892h = scanResult.frequency;
        this.f16893i = scanResult.timestamp;
        this.f16894j = C6043k.MICROSECONDS;
    }

    public C6036g(C6036g gVar) {
        this.f16885a = gVar.f16885a;
        this.f16886b = gVar.f16886b;
        this.f16887c = gVar.f16887c;
        this.f16888d = gVar.f16888d;
        this.f16889e = gVar.f16889e;
        this.f16890f = gVar.f16890f;
        this.f16891g = gVar.f16891g;
        this.f16895k = gVar.f16895k;
        this.f16896l = gVar.f16896l;
        this.f16897m = gVar.f16897m;
        this.f16892h = gVar.f16892h;
        this.f16893i = gVar.f16893i;
        this.f16894j = gVar.f16894j;
    }

    /* renamed from: h */
    private void m22909h() {
        this.f16885a = C6042j.UNKNOWN;
        this.f16886b = "";
        this.f16887c = "";
        this.f16888d = "";
        this.f16889e = 0;
        this.f16890f = 0;
        this.f16891g = 0.0f;
        this.f16895k = 0.0d;
        this.f16896l = 0.0d;
        this.f16897m = 0.0d;
        this.f16892h = 0;
        this.f16893i = 0;
        this.f16894j = C6043k.UNKNOWN;
    }

    /* renamed from: a */
    public String mo15969a() {
        return this.f16887c;
    }

    /* renamed from: a */
    public void mo15970a(float f) {
        this.f16891g = f;
    }

    /* renamed from: a */
    public void mo15971a(String str) {
        this.f16887c = str;
    }

    /* renamed from: b */
    public int mo15972b() {
        return this.f16889e;
    }

    /* renamed from: c */
    public int mo15973c() {
        return this.f16890f;
    }

    /* renamed from: d */
    public float mo15974d() {
        return this.f16891g;
    }

    /* renamed from: e */
    public String mo15975e() {
        return this.f16887c.substring(0, 2) + this.f16887c.substring(3, 5) + this.f16887c.substring(6, 8) + this.f16887c.substring(9, 11) + this.f16887c.substring(12, 14) + this.f16887c.substring(15, 17);
    }

    /* renamed from: f */
    public String mo15976f() {
        return this.f16888d;
    }

    /* renamed from: g */
    public C6042j mo15977g() {
        return this.f16885a;
    }
}
