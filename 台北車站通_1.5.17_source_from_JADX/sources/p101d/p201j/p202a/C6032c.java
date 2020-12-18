package p101d.p201j.p202a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;
import org.apache.http.HttpStatus;

/* renamed from: d.j.a.c */
public class C6032c extends C6035f {

    /* renamed from: e */
    private static boolean f16869e = false;

    /* renamed from: f */
    private String f16870f = "STOBeaconScanManager18";

    /* renamed from: g */
    BluetoothAdapter f16871g;

    /* renamed from: h */
    private BluetoothAdapter.LeScanCallback f16872h;

    public C6032c(Context context, C6041i iVar) {
        super(context, iVar);
        if (f16869e) {
            Log.i(this.f16870f, "constructor is called");
        }
    }

    /* renamed from: a */
    private void m22889a(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static boolean m22890d() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getState() == 12;
    }

    /* renamed from: e */
    private BluetoothAdapter.LeScanCallback m22891e() {
        if (this.f16884d == null) {
            return null;
        }
        if (this.f16872h == null) {
            this.f16872h = new C6031b(this);
        }
        return this.f16872h;
    }

    /* renamed from: f */
    private BluetoothAdapter m22892f() {
        if (this.f16871g == null) {
            this.f16871g = ((BluetoothManager) this.f16883c.getApplicationContext().getSystemService("bluetooth")).getAdapter();
        }
        return this.f16871g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15963a() {
        mo15964a(true);
    }

    /* renamed from: a */
    public void mo15964a(boolean z) {
        if (z) {
            this.f16871g = BluetoothAdapter.getDefaultAdapter();
            BluetoothAdapter bluetoothAdapter = this.f16871g;
            if (bluetoothAdapter == null) {
                m22889a((int) HttpStatus.SC_INTERNAL_SERVER_ERROR);
            } else if (!bluetoothAdapter.isEnabled()) {
                this.f16871g.enable();
                int i = 0;
                while (!this.f16871g.isEnabled()) {
                    m22889a(100);
                    i++;
                }
            }
        } else {
            this.f16871g = BluetoothAdapter.getDefaultAdapter();
            this.f16871g.disable();
        }
    }

    /* renamed from: b */
    public void mo15965b() {
        if (m22890d()) {
            m22892f().startLeScan(m22891e());
        }
    }

    /* renamed from: c */
    public void mo15966c() {
        if (m22890d()) {
            m22892f().stopLeScan(m22891e());
        }
    }
}
