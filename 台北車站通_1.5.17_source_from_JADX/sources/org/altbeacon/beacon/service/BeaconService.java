package org.altbeacon.beacon.service;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6904f;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p292b.C6885c;
import org.altbeacon.beacon.p292b.C6888f;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.p295e.C6903a;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.bluetooth.C6964c;

public class BeaconService extends Service {

    /* renamed from: a */
    private final Handler f19074a = new Handler();

    /* renamed from: b */
    private C6964c f19075b;

    /* renamed from: c */
    private C6951n f19076c;

    /* renamed from: d */
    private C6904f f19077d;

    /* renamed from: e */
    final Messenger f19078e = new Messenger(new C6917a(this));

    /* renamed from: org.altbeacon.beacon.service.BeaconService$a */
    static class C6917a extends Handler {

        /* renamed from: a */
        private final WeakReference<BeaconService> f19079a;

        C6917a(BeaconService beaconService) {
            super(Looper.getMainLooper());
            this.f19079a = new WeakReference<>(beaconService);
        }

        public void handleMessage(Message message) {
            BeaconService beaconService = (BeaconService) this.f19079a.get();
            if (beaconService != null) {
                StartRMData a = StartRMData.m26165a(message.getData());
                if (a != null) {
                    int i = message.what;
                    if (i == 2) {
                        C6895d.m26026c("BeaconService", "start ranging received", new Object[0]);
                        beaconService.mo18814b(a.mo18827d(), new C6918a(a.mo18826c()));
                    } else if (i == 3) {
                        C6895d.m26026c("BeaconService", "stop ranging received", new Object[0]);
                        beaconService.mo18813b(a.mo18827d());
                    } else if (i == 4) {
                        C6895d.m26026c("BeaconService", "start monitoring received", new Object[0]);
                        beaconService.mo18812a(a.mo18827d(), new C6918a(a.mo18826c()));
                    } else if (i == 5) {
                        C6895d.m26026c("BeaconService", "stop monitoring received", new Object[0]);
                        beaconService.mo18811a(a.mo18827d());
                    } else if (i != 6) {
                        super.handleMessage(message);
                        return;
                    } else {
                        C6895d.m26026c("BeaconService", "set scan intervals received", new Object[0]);
                    }
                    beaconService.mo18810a(a.mo18829e(), a.mo18825b(), a.mo18824a());
                } else if (message.what == 7) {
                    C6895d.m26026c("BeaconService", "Received settings update from other process", new Object[0]);
                    C6958s a2 = C6958s.m26344a(message.getData());
                    if (a2 != null) {
                        a2.mo18965a(beaconService);
                    } else {
                        C6895d.m26027d("BeaconService", "Settings data missing", new Object[0]);
                    }
                } else {
                    C6895d.m26026c("BeaconService", "Received unknown message from other process : " + message.what, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    private String m26141a(String str) {
        try {
            ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new ComponentName(this, BeaconService.class), 128);
            if (serviceInfo == null || serviceInfo.metaData == null) {
                return null;
            }
            return serviceInfo.metaData.get(str).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m26142b() {
        if (this.f19077d == null) {
            this.f19077d = new C6904f(this);
            this.f19077d.mo18753a();
        }
    }

    /* renamed from: c */
    private PendingIntent m26143c() {
        return PendingIntent.getBroadcast(getApplicationContext(), 1, new Intent(getApplicationContext(), StartupBroadcastReceiver.class), 1073741824);
    }

    /* renamed from: d */
    private void m26144d() {
        C6906h a = C6906h.m26069a(getApplicationContext());
        Notification l = a.mo18771l();
        int m = a.mo18772m();
        if (l != null && Build.VERSION.SDK_INT >= 16) {
            startForeground(m, l);
        }
    }

    /* renamed from: a */
    public void mo18809a() {
        this.f19076c.mo18931f();
    }

    /* renamed from: a */
    public void mo18810a(long j, long j2, boolean z) {
        if (this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18838a(j, j2, z);
        }
    }

    /* renamed from: a */
    public void mo18811a(Region region) {
        C6895d.m26021a("BeaconService", "stopMonitoring called", new Object[0]);
        this.f19076c.mo18928c().mo18885c(region);
        C6895d.m26021a("BeaconService", "Currently monitoring %s regions.", Integer.valueOf(this.f19076c.mo18928c().mo18886d()));
        if (this.f19076c.mo18928c().mo18886d() == 0 && this.f19076c.mo18929d().size() == 0 && this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18852l();
        }
    }

    /* renamed from: a */
    public void mo18812a(Region region, C6918a aVar) {
        C6895d.m26021a("BeaconService", "startMonitoring called", new Object[0]);
        this.f19076c.mo18928c().mo18881a(region, aVar);
        C6895d.m26021a("BeaconService", "Currently monitoring %s regions.", Integer.valueOf(this.f19076c.mo18928c().mo18886d()));
        if (this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18850j();
        }
    }

    /* renamed from: b */
    public void mo18813b(Region region) {
        int size;
        synchronized (this.f19076c.mo18929d()) {
            this.f19076c.mo18929d().remove(region);
            size = this.f19076c.mo18929d().size();
            C6895d.m26021a("BeaconService", "Currently ranging %s regions.", Integer.valueOf(this.f19076c.mo18929d().size()));
        }
        if (size == 0 && this.f19076c.mo18928c().mo18886d() == 0 && this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18852l();
        }
    }

    /* renamed from: b */
    public void mo18814b(Region region, C6918a aVar) {
        synchronized (this.f19076c.mo18929d()) {
            if (this.f19076c.mo18929d().containsKey(region)) {
                C6895d.m26026c("BeaconService", "Already ranging that region -- will replace existing region.", new Object[0]);
                this.f19076c.mo18929d().remove(region);
            }
            this.f19076c.mo18929d().put(region, new C6942f(aVar));
            C6895d.m26021a("BeaconService", "Currently ranging %s regions.", Integer.valueOf(this.f19076c.mo18929d().size()));
        }
        if (this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18850j();
        }
    }

    public IBinder onBind(Intent intent) {
        C6895d.m26026c("BeaconService", "binding", new Object[0]);
        return this.f19078e.getBinder();
    }

    public void onCreate() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f19075b = new C6964c(this);
            this.f19075b.mo18980c();
        }
        this.f19076c = new C6951n(this);
        if (this.f19076c.mo18926b() == null) {
            this.f19076c.mo18925a(false, this.f19075b);
        }
        this.f19076c.mo18924a(C6941e.m26233a((Context) this));
        this.f19076c.mo18921a((Map<Region, C6942f>) new HashMap());
        this.f19076c.mo18922a((Set<C6910i>) new HashSet());
        this.f19076c.mo18923a(new C6939c());
        C6906h a = C6906h.m26069a(getApplicationContext());
        a.mo18763b(true);
        if (a.mo18780x()) {
            C6895d.m26026c("BeaconService", "beaconService version %s is starting up on the main process", "2.16.1");
            m26142b();
        } else {
            C6895d.m26026c("BeaconService", "beaconService version %s is starting up on a separate process", "2.16.1");
            C6903a aVar = new C6903a(this);
            C6895d.m26026c("BeaconService", "beaconService PID is " + aVar.mo18750b() + " with process name " + aVar.mo18751c(), new Object[0]);
        }
        String a2 = m26141a("longScanForcingEnabled");
        if (a2 != null && a2.equals("true")) {
            C6895d.m26026c("BeaconService", "longScanForcingEnabled to keep scans going on Android N for > 30 minutes", new Object[0]);
            if (this.f19076c.mo18926b() != null) {
                this.f19076c.mo18926b().mo18841b(true);
            }
        }
        this.f19076c.mo18931f();
        Beacon.m25942a((C6885c) new C6888f(this, C6906h.m26075i()));
        try {
            this.f19076c.mo18920a((List<Beacon>) (List) Class.forName("org.altbeacon.beacon.SimulatedScanData").getField("beacons").get((Object) null));
        } catch (ClassNotFoundException unused) {
            C6895d.m26021a("BeaconService", "No org.altbeacon.beacon.SimulatedScanData class exists.", new Object[0]);
        } catch (Exception e) {
            C6895d.m26022a(e, "BeaconService", "Cannot get simulated Scan data.  Make sure your org.altbeacon.beacon.SimulatedScanData class defines a field with the signature 'public static List<Beacon> beacons'", new Object[0]);
        }
        m26144d();
    }

    public void onDestroy() {
        C6895d.m26024b("BeaconService", "onDestroy()", new Object[0]);
        if (Build.VERSION.SDK_INT < 18) {
            C6895d.m26027d("BeaconService", "Not supported prior to API 18.", new Object[0]);
            return;
        }
        C6904f fVar = this.f19077d;
        if (fVar != null) {
            fVar.mo18754b();
        }
        C6964c cVar = this.f19075b;
        if (cVar != null) {
            cVar.mo18981d();
        }
        C6895d.m26026c("BeaconService", "onDestroy called.  stopping scanning", new Object[0]);
        this.f19074a.removeCallbacksAndMessages((Object) null);
        if (this.f19076c.mo18926b() != null) {
            this.f19076c.mo18926b().mo18852l();
            this.f19076c.mo18926b().mo18843c();
        }
        this.f19076c.mo18928c().mo18891h();
        this.f19076c.mo18934h();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent == null) {
            str = "starting with null intent";
        } else {
            str = "starting with intent " + intent.toString();
        }
        C6895d.m26026c("BeaconService", str, new Object[0]);
        return super.onStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        C6895d.m26021a("BeaconService", "task removed", new Object[0]);
        if (Build.VERSION.RELEASE.contains("4.4.1") || Build.VERSION.RELEASE.contains("4.4.2") || Build.VERSION.RELEASE.contains("4.4.3")) {
            ((AlarmManager) getApplicationContext().getSystemService("alarm")).set(0, System.currentTimeMillis() + 1000, m26143c());
            C6895d.m26021a("BeaconService", "Setting a wakeup alarm to go off due to Android 4.4.2 service restarting bug.", new Object[0]);
        }
    }

    public boolean onUnbind(Intent intent) {
        C6895d.m26026c("BeaconService", "unbinding so destroying self", new Object[0]);
        stopForeground(true);
        stopSelf();
        return false;
    }
}
