package org.altbeacon.beacon.p295e;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.List;

/* renamed from: org.altbeacon.beacon.e.a */
public class C6903a {

    /* renamed from: a */
    Context f18998a;

    public C6903a(Context context) {
        this.f18998a = context;
    }

    /* renamed from: a */
    public String mo18749a() {
        return this.f18998a.getApplicationContext().getPackageName();
    }

    /* renamed from: b */
    public int mo18750b() {
        return Process.myPid();
    }

    /* renamed from: c */
    public String mo18751c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f18998a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == mo18750b()) {
                return next.processName;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo18752d() {
        return mo18749a().equals(mo18751c());
    }
}
