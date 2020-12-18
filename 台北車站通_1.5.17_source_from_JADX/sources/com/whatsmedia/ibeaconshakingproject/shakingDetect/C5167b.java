package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import p101d.p206l.p207a.C6058d;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.b */
class C5167b extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ C5169d f14513a;

    C5167b(C5169d dVar) {
        this.f14513a = dVar;
    }

    /* renamed from: d */
    private String m19997d(byte[] bArr) {
        boolean z;
        int i = 2;
        while (true) {
            if (i <= 5) {
                if ((bArr[i + 2] & 255) == 2 && (bArr[i + 3] & 255) == 21) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return "";
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, i + 4, bArr2, 0, 16);
        String a = mo14312a(bArr2);
        return a.substring(0, 8) + "-" + a.substring(8, 12) + "-" + a.substring(12, 16) + "-" + a.substring(16, 20) + "-" + a.substring(20, 32);
    }

    /* renamed from: a */
    public String mo14312a(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = charArray[b >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public String mo14313b(byte[] bArr) {
        return String.valueOf(((bArr[25] & 255) * 256) + (bArr[26] & 255));
    }

    /* renamed from: c */
    public String mo14314c(byte[] bArr) {
        return String.valueOf(((bArr[27] & 255) * 256) + (bArr[28] & 255));
    }

    public void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        BluetoothDevice device = scanResult.getDevice();
        String name = (device.getName() == null || device.getName().length() == 0) ? "tmp" : device.getName();
        C5170e eVar = new C5170e();
        eVar.f14529a = name;
        eVar.f14531c = System.currentTimeMillis();
        eVar.f14530b = Integer.toString(scanResult.getRssi() * -1);
        C5176j.m20026a(eVar);
        ScanRecord scanRecord = scanResult.getScanRecord();
        String d = m19997d(scanRecord.getBytes());
        scanResult.getRssi();
        mo14313b(scanRecord.getBytes());
        mo14314c(scanRecord.getBytes());
        Iterator it = C5169d.f14517c.iterator();
        while (it.hasNext()) {
            if (d.equals((String) it.next())) {
                this.f14513a.mo14327b(d);
                C6058d.m22971e().mo16021b(d);
            }
        }
    }
}
