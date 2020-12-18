package org.altbeacon.beacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import org.altbeacon.beacon.p293c.C6895d;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: org.altbeacon.beacon.f */
public class C6904f {

    /* renamed from: a */
    static int f18999a;

    /* renamed from: b */
    private Context f19000b;

    /* renamed from: c */
    int f19001c = 0;

    /* renamed from: d */
    private BroadcastReceiver f19002d = new C6902e(this);

    public C6904f(Context context) {
        this.f19000b = context;
    }

    /* renamed from: a */
    public void mo18753a() {
        f18999a++;
        this.f19001c++;
        C6895d.m26021a("BeaconLocalBroadcastProcessor", "Register calls: global=" + f18999a + " instance=" + this.f19001c, new Object[0]);
        mo18754b();
        C1020d.m5430a(this.f19000b).mo5019a(this.f19002d, new IntentFilter("org.altbeacon.beacon.range_notification"));
        C1020d.m5430a(this.f19000b).mo5019a(this.f19002d, new IntentFilter("org.altbeacon.beacon.monitor_notification"));
    }

    /* renamed from: b */
    public void mo18754b() {
        C1020d.m5430a(this.f19000b).mo5018a(this.f19002d);
    }
}
