package p287me.tatarka.support.internal.receivers;

import android.content.Context;
import android.content.Intent;
import p013b.p018b.p028h.p029a.C1024f;
import p287me.tatarka.support.internal.job.JobServiceCompat;

/* renamed from: me.tatarka.support.internal.receivers.BootReceiver */
public class BootReceiver extends C1024f {
    public void onReceive(Context context, Intent intent) {
        C1024f.m5440b(context, JobServiceCompat.m25762a(context));
    }
}
