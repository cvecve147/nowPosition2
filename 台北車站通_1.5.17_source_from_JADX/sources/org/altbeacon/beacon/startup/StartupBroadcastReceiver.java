package org.altbeacon.beacon.startup;

import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.List;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.service.C6956q;

public class StartupBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Object[] objArr;
        String str;
        C6895d.m26021a("StartupBroadcastReceiver", "onReceive called in startup broadcast receiver", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        if (i < 18) {
            C6895d.m26027d("StartupBroadcastReceiver", "Not starting up beacon service because we do not have API version 18 (Android 4.3).  We have: %s", Integer.valueOf(i));
            return;
        }
        C6906h a = C6906h.m26069a(context.getApplicationContext());
        if (a.mo18779w() || a.mo18778u()) {
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
            if (intExtra != -1) {
                C6895d.m26021a("StartupBroadcastReceiver", "Passive background scan callback type: " + intExtra, new Object[0]);
                C6895d.m26021a("StartupBroadcastReceiver", "got Android O background scan via intent", new Object[0]);
                int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
                if (intExtra2 != -1) {
                    C6895d.m26027d("StartupBroadcastReceiver", "Passive background scan failed.  Code; " + intExtra2, new Object[0]);
                }
                C6956q.m26322b().mo18946a(context, (List<ScanResult>) intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT"));
                return;
            } else if (intent.getBooleanExtra("wakeup", false)) {
                objArr = new Object[0];
                str = "got wake up intent";
            } else {
                C6895d.m26021a("StartupBroadcastReceiver", "Already started.  Ignoring intent: %s of type: %s", intent, intent.getStringExtra("wakeup"));
                return;
            }
        } else {
            objArr = new Object[0];
            str = "No consumers are bound.  Ignoring broadcast receiver.";
        }
        C6895d.m26021a("StartupBroadcastReceiver", str, objArr);
    }
}
