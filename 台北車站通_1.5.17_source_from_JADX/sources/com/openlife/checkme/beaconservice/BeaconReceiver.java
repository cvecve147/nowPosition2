package com.openlife.checkme.beaconservice;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4955e;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeaconReceiver extends BroadcastReceiver implements C4864t {

    /* renamed from: a */
    private C4868x f13880a = new C4868x(this, new C4865u(C4955e.m19580a(), C4947j.m19536a()));

    /* renamed from: b */
    private Context f13881b;

    /* renamed from: a */
    private boolean m19059a(Class<?> cls) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) this.f13881b.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo12926c(List<String> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            BeaconJobService.m19042a(this.f13881b, (ArrayList<String>) (ArrayList) list);
            return;
        }
        Intent intent = new Intent(this.f13881b, BeaconService.class);
        intent.putStringArrayListExtra("EXTRA_BEACON_LIST", (ArrayList) list);
        this.f13881b.stopService(intent);
        this.f13881b.startService(intent);
    }

    public void onReceive(Context context, Intent intent) {
        this.f13881b = context;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            if (!m19059a(Build.VERSION.SDK_INT >= 21 ? BeaconJobService.class : BeaconService.class)) {
                this.f13880a.mo13379a(Long.valueOf(new Date().getTime()));
            }
        }
    }
}
