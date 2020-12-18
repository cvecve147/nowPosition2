package p287me.tatarka.support.internal.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: me.tatarka.support.internal.receivers.d */
public final class C6804d {
    /* renamed from: a */
    public static <T extends BroadcastReceiver> void m25861a(Context context, Class<T> cls) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 2, 1);
    }

    /* renamed from: b */
    public static <T extends BroadcastReceiver> void m25862b(Context context, Class<T> cls) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 1, 1);
    }
}
