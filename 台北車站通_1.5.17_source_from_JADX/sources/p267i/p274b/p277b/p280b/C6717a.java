package p267i.p274b.p277b.p280b;

import android.bluetooth.BluetoothAdapter;

/* renamed from: i.b.b.b.a */
public class C6717a {

    /* renamed from: a */
    static BluetoothAdapter f18663a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: a */
    public static void m25481a() {
        BluetoothAdapter bluetoothAdapter = f18663a;
        if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
            f18663a.enable();
        }
    }

    /* renamed from: b */
    public static boolean m25482b() {
        BluetoothAdapter bluetoothAdapter = f18663a;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.isEnabled();
    }
}
