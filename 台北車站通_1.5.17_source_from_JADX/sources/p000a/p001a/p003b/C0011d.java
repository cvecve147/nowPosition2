package p000a.p001a.p003b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.a.b.d */
public class C0011d extends C0012e {

    /* renamed from: d */
    private String f33d = "STOBeaconScanManager21";

    /* renamed from: e */
    private List<ScanFilter> f34e;

    /* renamed from: f */
    private ScanSettings f35f;

    /* renamed from: g */
    private BluetoothLeScanner f36g;

    /* renamed from: h */
    private BluetoothAdapter f37h;

    /* renamed from: i */
    ScanCallback f38i;

    public C0011d(Context context, C0015g gVar) {
        super(context, gVar);
        Log.i(this.f33d, "constructor is called");
    }

    /* renamed from: d */
    private ScanCallback m31d() {
        if (this.f38i == null) {
            this.f38i = new C0010c(this);
        }
        return this.f38i;
    }

    /* renamed from: e */
    private void m32e() {
        this.f34e = new ArrayList();
    }

    /* renamed from: f */
    private void m33f() {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setReportDelay(0);
        builder.setScanMode(2);
        this.f35f = builder.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14a() {
        this.f37h = BluetoothAdapter.getDefaultAdapter();
        this.f36g = this.f37h.getBluetoothLeScanner();
        m32e();
        m33f();
    }

    /* renamed from: b */
    public void mo15b() {
        this.f36g.startScan(this.f34e, this.f35f, m31d());
        Log.i(this.f33d, "startScan is called");
    }

    /* renamed from: c */
    public void mo16c() {
        this.f36g.stopScan(m31d());
        Log.i(this.f33d, "stopScan is called");
    }
}
