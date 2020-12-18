package p000a.p001a.p003b;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.ArrayList;
import p000a.p001a.p004c.C0018c;

/* renamed from: a.a.b.c */
class C0010c extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ C0011d f32a;

    C0010c(C0011d dVar) {
        this.f32a = dVar;
    }

    public void onScanResult(int i, ScanResult scanResult) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0018c(scanResult));
        this.f32a.f41c.mo9a(arrayList);
    }
}
