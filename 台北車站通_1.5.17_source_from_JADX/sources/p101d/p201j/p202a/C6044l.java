package p101d.p201j.p202a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.util.Log;

/* renamed from: d.j.a.l */
public class C6044l {

    /* renamed from: a */
    private static boolean f16926a = false;

    /* renamed from: b */
    private String f16927b = "STOWifiScanManager";

    /* renamed from: c */
    private boolean f16928c = false;

    /* renamed from: d */
    private Context f16929d;

    /* renamed from: e */
    private WifiManager f16930e;

    public C6044l(Context context) {
        this.f16929d = context;
        m22928b();
        if (f16926a) {
            Log.i(this.f16927b, "constructor is called");
        }
    }

    /* renamed from: b */
    private void m22928b() {
        this.f16930e = (WifiManager) this.f16929d.getSystemService("wifi");
        if (!this.f16930e.isWifiEnabled()) {
            this.f16930e.setWifiEnabled(true);
        }
    }

    /* renamed from: a */
    public WifiManager mo15981a() {
        return this.f16930e;
    }

    /* renamed from: a */
    public void mo15982a(BroadcastReceiver broadcastReceiver) {
        this.f16929d.registerReceiver(broadcastReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        this.f16928c = true;
        this.f16930e.startScan();
        if (f16926a) {
            Log.i(this.f16927b, "startScan is called");
        }
    }

    /* renamed from: b */
    public void mo15983b(BroadcastReceiver broadcastReceiver) {
        if (this.f16928c) {
            this.f16928c = false;
            this.f16929d.unregisterReceiver(broadcastReceiver);
            if (f16926a) {
                Log.i(this.f16927b, "stopScan is called");
            }
        }
    }
}
