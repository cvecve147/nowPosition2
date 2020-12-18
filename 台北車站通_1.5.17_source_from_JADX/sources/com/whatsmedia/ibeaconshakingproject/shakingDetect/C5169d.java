package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import java.util.ArrayList;
import p101d.p206l.p207a.C6058d;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.d */
public class C5169d {

    /* renamed from: a */
    private static C5169d f14515a;

    /* renamed from: b */
    private static Context f14516b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<String> f14517c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BluetoothAdapter f14518d;

    /* renamed from: e */
    private BluetoothLeScanner f14519e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BluetoothGatt f14520f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public BluetoothGattCharacteristic f14521g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BluetoothGattCharacteristic f14522h;

    /* renamed from: i */
    private String f14523i = "";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f14524j = false;

    /* renamed from: k */
    private boolean f14525k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f14526l = false;

    /* renamed from: m */
    private ScanCallback f14527m = new C5167b(this);

    /* renamed from: n */
    private final BluetoothGattCallback f14528n = new C5168c(this);

    private C5169d(Context context) {
        f14516b = context;
        this.f14518d = BluetoothAdapter.getDefaultAdapter();
    }

    /* renamed from: a */
    public static synchronized C5169d m20002a(Context context) {
        synchronized (C5169d.class) {
            if (f14515a == null) {
                f14515a = new C5169d(context);
            }
            if (!f14515a.m20012d()) {
                return null;
            }
            C5169d dVar = f14515a;
            return dVar;
        }
    }

    /* renamed from: a */
    public static void m20004a(String str) {
        f14517c = new ArrayList<>();
        String[] split = str.replace("[", "").replace("]", "").replace("\"", "").split(",");
        for (String add : split) {
            f14517c.add(add);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m20009c() {
        this.f14523i = "";
        BluetoothGatt bluetoothGatt = this.f14520f;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            this.f14520f.close();
            this.f14520f = null;
        }
        this.f14522h = null;
        this.f14521g = null;
        this.f14524j = false;
    }

    /* renamed from: d */
    private boolean m20012d() {
        return f14516b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: b */
    public void mo14326b() {
        if (!this.f14526l) {
            C6058d.m22971e().mo16025g();
            C5176j.f14543a = new ArrayList<>();
            this.f14525k = true;
            this.f14526l = true;
            this.f14519e = this.f14518d.getBluetoothLeScanner();
            this.f14519e.startScan(new ArrayList(), new ScanSettings.Builder().setScanMode(2).build(), this.f14527m);
            new Thread(new C5166a(this)).start();
        }
    }

    /* renamed from: b */
    public void mo14327b(String str) {
        this.f14525k = false;
        this.f14526l = false;
        BluetoothLeScanner bluetoothLeScanner = this.f14519e;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.f14527m);
            this.f14519e = null;
        }
        m20009c();
        f14515a = null;
    }
}
