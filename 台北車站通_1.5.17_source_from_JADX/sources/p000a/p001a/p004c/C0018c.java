package p000a.p001a.p004c;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;

/* renamed from: a.a.c.c */
public class C0018c {

    /* renamed from: a */
    private C0019d f57a;

    /* renamed from: b */
    private String f58b;

    /* renamed from: c */
    private String f59c;

    /* renamed from: d */
    private String f60d;

    /* renamed from: e */
    private int f61e;

    /* renamed from: f */
    private int f62f;

    /* renamed from: g */
    private float f63g;

    /* renamed from: h */
    private int f64h;

    /* renamed from: i */
    private long f65i;

    /* renamed from: j */
    private C0020e f66j;

    /* renamed from: k */
    private double f67k;

    /* renamed from: l */
    private double f68l;

    /* renamed from: m */
    private double f69m;

    /* renamed from: n */
    private C0016a f70n;

    public C0018c() {
        m49c();
    }

    public C0018c(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f57a = C0019d.BEACON;
        this.f70n = new C0016a(bArr);
        this.f58b = bluetoothDevice.getName();
        this.f59c = bluetoothDevice.getAddress().toUpperCase();
        this.f60d = this.f70n.mo22c().toUpperCase();
        this.f61e = this.f70n.mo20a();
        this.f62f = this.f70n.mo21b();
        this.f63g = (float) i;
        this.f66j = C0020e.UNKNOWN;
        this.f70n = null;
    }

    public C0018c(ScanResult scanResult) {
        this.f57a = C0019d.BEACON;
        ScanRecord scanRecord = scanResult.getScanRecord();
        this.f70n = new C0016a(scanRecord.getBytes());
        this.f58b = scanRecord.getDeviceName();
        this.f59c = scanResult.getDevice().getAddress().toUpperCase();
        this.f60d = this.f70n.mo22c().toUpperCase();
        this.f61e = this.f70n.mo20a();
        this.f62f = this.f70n.mo21b();
        this.f63g = (float) scanResult.getRssi();
        this.f65i = scanResult.getTimestampNanos();
        this.f66j = C0020e.NANOSECONDS;
        this.f70n = null;
    }

    /* renamed from: c */
    private void m49c() {
        this.f57a = C0019d.UNKNOWN;
        this.f58b = "";
        this.f59c = "";
        this.f60d = "";
        this.f61e = 0;
        this.f62f = 0;
        this.f63g = 0.0f;
        this.f67k = 0.0d;
        this.f68l = 0.0d;
        this.f69m = 0.0d;
        this.f64h = 0;
        this.f65i = 0;
        this.f66j = C0020e.UNKNOWN;
    }

    /* renamed from: a */
    public String mo23a() {
        return this.f59c;
    }

    /* renamed from: b */
    public float mo24b() {
        return this.f63g;
    }
}
