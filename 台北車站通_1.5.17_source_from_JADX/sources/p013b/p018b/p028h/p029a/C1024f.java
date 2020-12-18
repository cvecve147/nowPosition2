package p013b.p018b.p028h.p029a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: b.b.h.a.f */
public abstract class C1024f extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f3928a = new SparseArray<>();

    /* renamed from: b */
    private static int f3929b = 1;

    /* renamed from: a */
    public static boolean m5439a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f3928a) {
            PowerManager.WakeLock wakeLock = f3928a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f3928a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m5440b(Context context, Intent intent) {
        synchronized (f3928a) {
            int i = f3929b;
            f3929b++;
            if (f3929b <= 0) {
                f3929b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f3928a.put(i, newWakeLock);
            return startService;
        }
    }
}
