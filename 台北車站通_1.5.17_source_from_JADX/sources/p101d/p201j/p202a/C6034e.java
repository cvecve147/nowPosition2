package p101d.p201j.p202a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: d.j.a.e */
public class C6034e extends C6035f {

    /* renamed from: e */
    private static boolean f16874e = false;

    /* renamed from: f */
    private String f16875f = "STOBeaconScanManager21";

    /* renamed from: g */
    private List<ScanFilter> f16876g;

    /* renamed from: h */
    private ScanSettings f16877h;

    /* renamed from: i */
    private BluetoothLeScanner f16878i;

    /* renamed from: j */
    private BluetoothAdapter f16879j;

    /* renamed from: k */
    ScanCallback f16880k;

    public C6034e(Context context, C6041i iVar) {
        super(context, iVar);
        if (f16874e) {
            Log.i(this.f16875f, "constructor is called");
        }
    }

    /* renamed from: a */
    private void m22897a(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static boolean m22898d() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getState() == 12;
    }

    /* renamed from: e */
    private ScanCallback m22899e() {
        if (this.f16880k == null) {
            this.f16880k = new C6033d(this);
        }
        return this.f16880k;
    }

    /* renamed from: f */
    private void m22900f() {
        this.f16876g = new ArrayList();
    }

    /* renamed from: g */
    private void m22901g() {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setReportDelay(0);
        builder.setScanMode(0);
        this.f16877h = builder.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15963a() {
        mo15968a(true);
        this.f16878i = this.f16879j.getBluetoothLeScanner();
        m22900f();
        m22901g();
    }

    /* renamed from: a */
    public void mo15968a(boolean z) {
        if (z) {
            this.f16879j = BluetoothAdapter.getDefaultAdapter();
            BluetoothAdapter bluetoothAdapter = this.f16879j;
            if (bluetoothAdapter == null) {
                m22897a((int) HttpStatus.SC_INTERNAL_SERVER_ERROR);
            } else if (!bluetoothAdapter.isEnabled()) {
                this.f16879j.enable();
                int i = 0;
                while (!this.f16879j.isEnabled()) {
                    m22897a(100);
                    i++;
                }
            }
        } else {
            this.f16879j = BluetoothAdapter.getDefaultAdapter();
            this.f16879j.disable();
        }
    }

    /* renamed from: b */
    public void mo15965b() {
        if (m22898d()) {
            this.f16878i.startScan(this.f16876g, this.f16877h, m22899e());
            if (f16874e) {
                Log.i(this.f16875f, "startScan is called");
            }
        }
    }

    /* renamed from: c */
    public void mo15966c() {
        if (m22898d()) {
            this.f16878i.stopScan(m22899e());
            if (f16874e) {
                Log.i(this.f16875f, "stopScan is called");
            }
        }
    }
}
