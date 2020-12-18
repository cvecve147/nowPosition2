package p000a.p001a.p003b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;

/* renamed from: a.a.b.b */
public class C0009b extends C0012e {

    /* renamed from: d */
    private String f29d = "STOBeaconScanManager18";

    /* renamed from: e */
    BluetoothAdapter f30e;

    /* renamed from: f */
    private BluetoothAdapter.LeScanCallback f31f;

    public C0009b(Context context, C0015g gVar) {
        super(context, gVar);
        Log.i(this.f29d, "constructor is called");
    }

    /* renamed from: d */
    private BluetoothAdapter.LeScanCallback m26d() {
        if (this.f41c == null) {
            return null;
        }
        if (this.f31f == null) {
            this.f31f = new C0008a(this);
        }
        return this.f31f;
    }

    /* renamed from: e */
    private BluetoothAdapter m27e() {
        if (this.f30e == null) {
            this.f30e = ((BluetoothManager) this.f40b.getApplicationContext().getSystemService("bluetooth")).getAdapter();
        }
        return this.f30e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14a() {
    }

    /* renamed from: b */
    public void mo15b() {
        m27e().startLeScan(m26d());
    }

    /* renamed from: c */
    public void mo16c() {
        m27e().stopLeScan(m26d());
    }
}
