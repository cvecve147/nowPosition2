package p000a.p001a.p003b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import p000a.p001a.p004c.C0018c;

/* renamed from: a.a.b.a */
class C0008a implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ C0009b f28a;

    C0008a(C0009b bVar) {
        this.f28a = bVar;
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0018c(bluetoothDevice, i, bArr));
        this.f28a.f41c.mo9a(arrayList);
    }
}
