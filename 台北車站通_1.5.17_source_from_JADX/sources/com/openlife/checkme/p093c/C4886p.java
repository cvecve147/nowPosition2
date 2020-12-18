package com.openlife.checkme.p093c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.os.Build;
import android.util.Log;
import p101d.p105b.p106a.p107a.C5178a;

/* renamed from: com.openlife.checkme.c.p */
public class C4886p {

    /* renamed from: a */
    static final char[] f13972a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private BluetoothAdapter f13973b;

    /* renamed from: c */
    private BluetoothAdapter.LeScanCallback f13974c;

    /* renamed from: d */
    private BluetoothLeScanner f13975d;

    /* renamed from: e */
    private ScanCallback f13976e;

    /* renamed from: f */
    private boolean f13977f = false;

    /* renamed from: g */
    private C4887a f13978g;

    /* renamed from: h */
    private boolean f13979h = false;

    /* renamed from: com.openlife.checkme.c.p$a */
    public interface C4887a {
        /* renamed from: a */
        void mo13337a();

        /* renamed from: a */
        void mo13338a(String str, int i, int i2, double d);

        /* renamed from: b */
        void mo13339b();
    }

    /* renamed from: a */
    private String m19245a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f13972a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private void m19246a(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        bluetoothAdapter.stopLeScan(leScanCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19247a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        boolean z;
        C4887a aVar;
        int i2 = 2;
        while (true) {
            if (i2 <= 5) {
                if ((bArr[i2 + 2] & 255) == 2 && (bArr[i2 + 3] & 255) == 21) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, i2 + 4, bArr2, 0, 16);
            String a = m19245a(bArr2);
            a.substring(0, 8) + "-" + a.substring(8, 12) + "-" + a.substring(12, 16) + "-" + a.substring(16, 20) + "-" + a.substring(20, 32);
            int i3 = ((bArr[i2 + 20] & 255) * 256) + (bArr[i2 + 21] & 255);
            byte b = bArr[i2 + 22];
            byte b2 = bArr[i2 + 23];
            double a2 = mo13404a((int) bArr[i2 + 24], (double) i);
            C5178a a3 = C5178a.m20030a(bArr, bluetoothDevice, i);
            String name = bluetoothDevice.getName();
            if (a3 != null && name != null && name.startsWith("USBeacon") && a3.f14553c.toUpperCase().equals("F9C6A431-2D19-4CE5-96C8-DF04F02F5BFE") && (aVar = this.f13978g) != null) {
                aVar.mo13338a("F9C6A431-2D19-4CE5-96C8-DF04F02F5BFE", i3, a3.f14554d, a2);
            }
        }
    }

    /* renamed from: b */
    private void m19249b(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        bluetoothAdapter.startLeScan(leScanCallback);
    }

    /* renamed from: d */
    private void m19250d() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f13976e = new C4884n(this);
        } else {
            this.f13974c = new C4885o(this);
        }
    }

    /* renamed from: a */
    public double mo13404a(int i, double d) {
        if (d == 0.0d) {
            return -1.0d;
        }
        double d2 = (d * 1.0d) / ((double) i);
        return d2 < 1.0d ? Math.pow(d2, 10.0d) : (Math.pow(d2, 7.7095d) * 0.89976d) + 0.111d;
    }

    /* renamed from: a */
    public void mo13405a(C4887a aVar) {
        this.f13978g = aVar;
    }

    /* renamed from: a */
    public boolean mo13406a() {
        return this.f13977f;
    }

    /* renamed from: a */
    public boolean mo13407a(BluetoothAdapter bluetoothAdapter) {
        this.f13973b = bluetoothAdapter;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f13975d = bluetoothAdapter.getBluetoothLeScanner();
            m19250d();
        }
        this.f13979h = true;
        return true;
    }

    /* renamed from: b */
    public void mo13408b() {
        C4887a aVar;
        if (!this.f13979h || this.f13977f) {
            Log.w("iBeaconScanner", "fail initBLE");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (this.f13976e == null) {
                m19250d();
            }
            if (this.f13973b.getState() == 12) {
                this.f13975d.startScan(this.f13976e);
            }
            this.f13977f = true;
            aVar = this.f13978g;
            if (aVar == null) {
                return;
            }
        } else if (i >= 18) {
            if (this.f13974c == null) {
                m19250d();
            }
            if (this.f13973b.getState() == 12) {
                m19249b(this.f13973b, this.f13974c);
            }
            this.f13977f = true;
            aVar = this.f13978g;
            if (aVar == null) {
                return;
            }
        } else {
            return;
        }
        aVar.mo13337a();
    }

    /* renamed from: c */
    public void mo13409c() {
        if (this.f13979h && this.f13977f) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (this.f13976e != null) {
                    if (this.f13973b.getState() == 12) {
                        this.f13975d.stopScan(this.f13976e);
                    }
                    C4887a aVar = this.f13978g;
                    if (aVar != null) {
                        aVar.mo13339b();
                    }
                    this.f13977f = false;
                    this.f13976e = null;
                }
            } else if (this.f13974c != null) {
                if (i >= 18 && this.f13973b.getState() == 12) {
                    m19246a(this.f13973b, this.f13974c);
                }
                C4887a aVar2 = this.f13978g;
                if (aVar2 != null) {
                    aVar2.mo13339b();
                }
                this.f13977f = false;
                this.f13974c = null;
            }
        }
    }
}
