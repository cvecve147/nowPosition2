package org.altbeacon.beacon.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: org.altbeacon.beacon.service.a */
public class C6918a implements Serializable {
    public C6918a(String str) {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    /* renamed from: a */
    public boolean mo18832a(Context context, String str, Bundle bundle) {
        if (C6906h.m26069a(context).mo18780x()) {
            String str2 = str == "rangingData" ? "org.altbeacon.beacon.range_notification" : "org.altbeacon.beacon.monitor_notification";
            Intent intent = new Intent(str2);
            intent.putExtra(str, bundle);
            C6895d.m26021a("Callback", "attempting callback via local broadcast intent: %s", str2);
            return C1020d.m5430a(context).mo5020a(intent);
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context.getPackageName(), "org.altbeacon.beacon.BeaconIntentProcessor"));
        intent2.putExtra(str, bundle);
        C6895d.m26021a("Callback", "attempting callback via global broadcast intent: %s", intent2.getComponent());
        try {
            context.startService(intent2);
            return true;
        } catch (Exception e) {
            C6895d.m26024b("Callback", "Failed attempting to start service: " + intent2.getComponent().flattenToString(), e);
            return false;
        }
    }
}
