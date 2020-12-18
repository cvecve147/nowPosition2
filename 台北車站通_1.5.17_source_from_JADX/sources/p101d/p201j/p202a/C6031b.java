package p101d.p201j.p202a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* renamed from: d.j.a.b */
class C6031b implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ C6032c f16868a;

    C6031b(C6032c cVar) {
        this.f16868a = cVar;
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6036g(bluetoothDevice, i, bArr));
        this.f16868a.f16884d.mo14178a(arrayList);
    }
}
