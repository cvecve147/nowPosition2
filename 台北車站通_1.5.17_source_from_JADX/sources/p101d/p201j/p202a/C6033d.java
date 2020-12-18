package p101d.p201j.p202a;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.ArrayList;

/* renamed from: d.j.a.d */
class C6033d extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ C6034e f16873a;

    C6033d(C6034e eVar) {
        this.f16873a = eVar;
    }

    public void onScanResult(int i, ScanResult scanResult) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6036g(scanResult));
        this.f16873a.f16884d.mo14178a(arrayList);
    }
}
