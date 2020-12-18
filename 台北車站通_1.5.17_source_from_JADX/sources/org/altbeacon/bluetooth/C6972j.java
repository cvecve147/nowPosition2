package org.altbeacon.bluetooth;

import android.annotation.TargetApi;

/* renamed from: org.altbeacon.bluetooth.j */
public class C6972j {

    /* renamed from: a */
    private byte f19285a;

    /* renamed from: b */
    private int f19286b;

    /* renamed from: c */
    private int f19287c;

    /* renamed from: d */
    private int f19288d;

    /* renamed from: e */
    private byte[] f19289e;

    @TargetApi(9)
    /* renamed from: a */
    public static C6972j m26396a(byte[] bArr, int i) {
        byte b;
        if (bArr.length - i >= 2 && (b = bArr[i]) > 0) {
            byte b2 = bArr[i + 1];
            int i2 = i + 2;
            if (i2 < bArr.length) {
                C6972j jVar = new C6972j();
                jVar.f19288d = i + b;
                if (jVar.f19288d >= bArr.length) {
                    jVar.f19288d = bArr.length - 1;
                }
                jVar.f19285a = b2;
                jVar.f19286b = b;
                jVar.f19287c = i2;
                jVar.f19289e = bArr;
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo18993a() {
        return this.f19286b;
    }

    /* renamed from: b */
    public int mo18994b() {
        return this.f19288d;
    }

    /* renamed from: c */
    public int mo18995c() {
        return this.f19287c;
    }

    /* renamed from: d */
    public byte mo18996d() {
        return this.f19285a;
    }
}
