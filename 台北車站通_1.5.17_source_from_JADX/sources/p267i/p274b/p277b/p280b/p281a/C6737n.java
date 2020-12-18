package p267i.p274b.p277b.p280b.p281a;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6910i;
import p101d.p102a.p103a.p104a.C5177a;

/* renamed from: i.b.b.b.a.n */
public class C6737n extends C6910i {

    /* renamed from: E */
    private String f18730E = "";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Beacon mo17220a(byte[] bArr, int i, BluetoothDevice bluetoothDevice, Beacon beacon) {
        Beacon a = super.mo17220a(bArr, i, bluetoothDevice, beacon);
        C5177a a2 = C5177a.m20027a(bArr, bluetoothDevice, i);
        String name = bluetoothDevice.getName();
        if (a2 == null || name == null || !name.startsWith("USBeacon") || !a2.f14546c.toUpperCase().equals(this.f18730E)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(0, Long.valueOf((long) a2.f14547d));
        arrayList.add(1, Long.valueOf((long) a2.f14550g));
        a.mo18689a((List<Long>) arrayList);
        return a;
    }

    /* renamed from: b */
    public void mo17221b(String str) {
        this.f18730E = str;
    }
}
