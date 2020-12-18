package com.sto.stopositioning;

import android.util.Log;
import p000a.p001a.p004c.C0018c;

public class STOPositioningManager {

    /* renamed from: a */
    private final String f14454a = "STOPositioningManager";

    /* renamed from: b */
    private boolean f14455b = false;

    /* renamed from: c */
    private int[] f14456c = null;

    /* renamed from: d */
    private int f14457d = 0;

    /* renamed from: e */
    private int f14458e = 1;

    static {
        System.loadLibrary("STOPositioningManager");
    }

    public STOPositioningManager(String str) {
        m19972a(str);
    }

    /* renamed from: a */
    private synchronized void m19972a(String str) {
        int[] iArr;
        if (this.f14455b) {
            iArr = new int[]{1000, 1000, -1, 0};
        } else {
            Log.i("STOPositioningManager", "STOPositioningManager init PATH:" + str);
            if (!init_native(str)) {
                this.f14455b = true;
                iArr = new int[]{1000, 1000, -1, 0};
            }
        }
        this.f14456c = iArr;
    }

    private native synchronized boolean init_native(String str);

    private native synchronized void push_native(String str, int i);

    private native synchronized int[] run_native();

    /* renamed from: a */
    public synchronized void mo14175a(C0018c cVar) {
        if (!this.f14455b) {
            Log.i("STOPositioningManager", cVar.mo23a() + "rssi = " + ((int) cVar.mo24b()));
            push_native(cVar.mo23a(), (int) cVar.mo24b());
        }
    }

    /* renamed from: a */
    public synchronized int[] mo14176a() {
        int[] iArr;
        if (this.f14455b) {
            iArr = new int[4];
            int i = this.f14457d;
            if (i == 10) {
                this.f14457d = 0;
                int i2 = -1;
                this.f14458e *= -1;
                int[] iArr2 = this.f14456c;
                int i3 = iArr2[0];
                int i4 = this.f14458e * 50;
                iArr2[0] = i3 + i4;
                iArr2[1] = iArr2[1] + i4;
                if (iArr2[2] - 1 >= -4) {
                    i2 = iArr2[2] - 1;
                }
                iArr2[2] = i2;
                int[] iArr3 = this.f14456c;
                iArr3[3] = iArr3[3] + 1 > 3 ? 0 : iArr3[3] + 1;
                int[] iArr4 = this.f14456c;
                iArr[0] = iArr4[0];
                iArr[1] = iArr4[1];
                iArr[2] = iArr4[2];
                iArr[3] = iArr4[3];
            } else {
                this.f14457d = i + 1;
                int[] iArr5 = this.f14456c;
                int i5 = iArr5[0];
                int i6 = this.f14458e * 50;
                iArr5[0] = i5 + i6;
                iArr5[1] = iArr5[1] + i6;
                iArr[0] = iArr5[0];
                iArr[1] = iArr5[1];
                iArr[2] = iArr5[2];
                iArr[3] = iArr5[3];
            }
        } else {
            iArr = run_native();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            Log.i("STOPositioningManager", "run_native:" + iArr[i7]);
        }
        return iArr;
    }
}
