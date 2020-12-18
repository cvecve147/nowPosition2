package org.altbeacon.beacon;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.p294d.C6901a;
import org.altbeacon.beacon.p295e.C6903a;
import org.altbeacon.beacon.service.BeaconService;
import org.altbeacon.beacon.service.C6941e;
import org.altbeacon.beacon.service.C6948l;
import org.altbeacon.beacon.service.C6956q;
import org.altbeacon.beacon.service.C6958s;
import org.altbeacon.beacon.service.StartRMData;
import org.altbeacon.beacon.service.p296a.C6935q;

/* renamed from: org.altbeacon.beacon.h */
public class C6906h {

    /* renamed from: a */
    protected static volatile C6906h f19003a = null;

    /* renamed from: b */
    private static boolean f19004b = false;

    /* renamed from: c */
    private static boolean f19005c = false;

    /* renamed from: d */
    private static final Object f19006d = new Object();

    /* renamed from: e */
    private static long f19007e = 10000;

    /* renamed from: f */
    protected static C6901a f19008f;

    /* renamed from: g */
    protected static String f19009g = "https://s3.amazonaws.com/android-beacon-library/android-distance.json";

    /* renamed from: h */
    protected static Class f19010h = C6948l.class;

    /* renamed from: A */
    private long f19011A = 0;

    /* renamed from: B */
    private long f19012B = 10000;

    /* renamed from: C */
    private long f19013C = 300000;

    /* renamed from: i */
    private final Context f19014i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ConcurrentMap<C6900d, C6908b> f19015j = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Messenger f19016k = null;

    /* renamed from: l */
    protected final Set<C6915m> f19017l = new CopyOnWriteArraySet();

    /* renamed from: m */
    protected C6915m f19018m = null;

    /* renamed from: n */
    protected final Set<C6914l> f19019n = new CopyOnWriteArraySet();

    /* renamed from: o */
    private final ArrayList<Region> f19020o = new ArrayList<>();

    /* renamed from: p */
    private final List<C6910i> f19021p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private C6935q f19022q;

    /* renamed from: r */
    private boolean f19023r = true;

    /* renamed from: s */
    private boolean f19024s = false;

    /* renamed from: t */
    private boolean f19025t = true;

    /* renamed from: u */
    private boolean f19026u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Boolean f19027v = null;

    /* renamed from: w */
    private boolean f19028w = false;

    /* renamed from: x */
    private Notification f19029x = null;

    /* renamed from: y */
    private int f19030y = -1;

    /* renamed from: z */
    private long f19031z = 1100;

    /* renamed from: org.altbeacon.beacon.h$a */
    private class C6907a implements ServiceConnection {
        private C6907a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6895d.m26021a("BeaconManager", "we have a connection to the service now", new Object[0]);
            if (C6906h.this.f19027v == null) {
                Boolean unused = C6906h.this.f19027v = false;
            }
            Messenger unused2 = C6906h.this.f19016k = new Messenger(iBinder);
            C6906h.this.mo18756a();
            synchronized (C6906h.this.f19015j) {
                for (Map.Entry entry : C6906h.this.f19015j.entrySet()) {
                    if (!((C6908b) entry.getValue()).f19033a) {
                        ((C6900d) entry.getKey()).mo17179a();
                        ((C6908b) entry.getValue()).f19033a = true;
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6895d.m26024b("BeaconManager", "onServiceDisconnected", new Object[0]);
            Messenger unused = C6906h.this.f19016k = null;
        }
    }

    /* renamed from: org.altbeacon.beacon.h$b */
    private class C6908b {

        /* renamed from: a */
        public boolean f19033a;

        /* renamed from: b */
        public C6907a f19034b;

        public C6908b() {
            this.f19033a = false;
            this.f19033a = false;
            this.f19034b = new C6907a();
        }
    }

    /* renamed from: org.altbeacon.beacon.h$c */
    public class C6909c extends RuntimeException {
        public C6909c() {
            super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
        }
    }

    protected C6906h(Context context) {
        this.f19014i = context.getApplicationContext();
        mo18760b();
        if (!f19005c) {
            m26065I();
        }
        this.f19021p.add(new C6882b());
        m26064H();
    }

    /* renamed from: B */
    private String m26058B() {
        String packageName = this.f19014i.getPackageName();
        C6895d.m26021a("BeaconManager", "callback packageName: %s", packageName);
        return packageName;
    }

    /* renamed from: C */
    private boolean m26059C() {
        if (!mo18782z() || mo18780x()) {
            return false;
        }
        C6895d.m26027d("BeaconManager", "Ranging/Monitoring may not be controlled from a separate BeaconScanner process.  To remove this warning, please wrap this call in: if (beaconManager.isMainProcess())", new Object[0]);
        return true;
    }

    /* renamed from: D */
    private long m26060D() {
        return this.f19024s ? this.f19013C : this.f19011A;
    }

    /* renamed from: E */
    private long m26061E() {
        return this.f19024s ? this.f19012B : this.f19031z;
    }

    /* renamed from: F */
    private boolean m26062F() {
        Object[] objArr;
        String str;
        if (Build.VERSION.SDK_INT < 18) {
            objArr = new Object[0];
            str = "Bluetooth LE not supported prior to API 18.";
        } else if (this.f19014i.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        } else {
            objArr = new Object[0];
            str = "This device does not support bluetooth LE.";
        }
        C6895d.m26027d("BeaconManager", str, objArr);
        return false;
    }

    /* renamed from: G */
    private boolean m26063G() {
        if (m26074g() != null) {
            return true;
        }
        return m26062F();
    }

    /* renamed from: H */
    private void m26064H() {
        this.f19028w = Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: I */
    private void m26065I() {
        List<ResolveInfo> queryIntentServices = this.f19014i.getPackageManager().queryIntentServices(new Intent(this.f19014i, BeaconService.class), 65536);
        if (queryIntentServices != null && queryIntentServices.isEmpty()) {
            throw new C6909c();
        }
    }

    /* renamed from: a */
    public static C6906h m26069a(Context context) {
        C6906h hVar = f19003a;
        if (hVar == null) {
            synchronized (f19006d) {
                hVar = f19003a;
                if (hVar == null) {
                    hVar = new C6906h(context);
                    f19003a = hVar;
                }
            }
        }
        return hVar;
    }

    @TargetApi(18)
    /* renamed from: a */
    private void m26070a(int i, Region region) {
        StartRMData startRMData;
        Bundle a;
        if (this.f19028w) {
            if (Build.VERSION.SDK_INT >= 21) {
                C6956q.m26322b().mo18947a(this.f19014i, this);
            }
        } else if (this.f19016k != null) {
            Message obtain = Message.obtain((Handler) null, i, 0, 0);
            if (i == 6) {
                startRMData = new StartRMData(m26061E(), m26060D(), this.f19024s);
            } else if (i == 7) {
                C6958s sVar = new C6958s();
                sVar.mo18964a(this.f19014i);
                a = sVar.mo18963a();
                obtain.setData(a);
                this.f19016k.send(obtain);
            } else {
                startRMData = new StartRMData(region, m26058B(), m26061E(), m26060D(), this.f19024s);
            }
            a = startRMData.mo18830f();
            obtain.setData(a);
            this.f19016k.send(obtain);
        } else {
            throw new RemoteException("The BeaconManager is not bound to the service.  Call beaconManager.bind(BeaconConsumer consumer) and wait for a callback to onBeaconServiceConnect()");
        }
    }

    /* renamed from: a */
    public static void m26071a(long j) {
        f19007e = j;
        C6906h hVar = f19003a;
        if (hVar != null) {
            hVar.mo18756a();
        }
    }

    /* renamed from: a */
    public static void m26072a(boolean z) {
        f19004b = z;
        C6906h hVar = f19003a;
        if (hVar != null) {
            hVar.mo18756a();
        }
    }

    /* renamed from: g */
    public static C6901a m26074g() {
        return f19008f;
    }

    /* renamed from: i */
    public static String m26075i() {
        return f19009g;
    }

    /* renamed from: s */
    public static long m26076s() {
        return f19007e;
    }

    /* renamed from: t */
    public static Class m26077t() {
        return f19010h;
    }

    /* renamed from: v */
    public static boolean m26078v() {
        return f19004b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo18755A() {
        if (!this.f19028w) {
            try {
                m26070a(7, (Region) null);
            } catch (RemoteException e) {
                C6895d.m26024b("BeaconManager", "Failed to sync settings to service", e);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            C6956q.m26322b().mo18947a(this.f19014i, this);
        }
    }

    /* renamed from: a */
    public void mo18756a() {
        Object[] objArr;
        String str;
        if (!m26059C()) {
            if (!mo18779w()) {
                objArr = new Object[0];
                str = "Not synchronizing settings to service, as it has not started up yet";
            } else if (mo18782z()) {
                C6895d.m26021a("BeaconManager", "Synchronizing settings to service", new Object[0]);
                mo18755A();
                return;
            } else {
                objArr = new Object[0];
                str = "Not synchronizing settings to service, as it is in the same process";
            }
            C6895d.m26021a("BeaconManager", str, objArr);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public void mo18757a(Region region) {
        if (!m26063G()) {
            C6895d.m26027d("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m26059C()) {
            synchronized (this.f19020o) {
                this.f19020o.add(region);
            }
            m26070a(2, region);
        }
    }

    /* renamed from: a */
    public void mo18758a(C6900d dVar) {
        if (!m26063G()) {
            C6895d.m26027d("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.f19015j) {
            C6908b bVar = new C6908b();
            if (this.f19015j.putIfAbsent(dVar, bVar) != null) {
                C6895d.m26021a("BeaconManager", "This consumer is already bound", new Object[0]);
            } else {
                C6895d.m26021a("BeaconManager", "This consumer is not bound.  Binding now: %s", dVar);
                if (this.f19028w) {
                    C6895d.m26021a("BeaconManager", "Not starting beacon scanning service. Using scheduled jobs", new Object[0]);
                    dVar.mo17179a();
                } else {
                    C6895d.m26021a("BeaconManager", "Binding to service", new Object[0]);
                    Intent intent = new Intent(dVar.mo17182b(), BeaconService.class);
                    if (Build.VERSION.SDK_INT >= 26 && mo18771l() != null) {
                        if (mo18779w()) {
                            C6895d.m26026c("BeaconManager", "Not starting foreground beacon scanning service.  A consumer is already bound, so it should be started", new Object[0]);
                        } else {
                            C6895d.m26026c("BeaconManager", "Starting foreground beacon scanning service.", new Object[0]);
                            this.f19014i.startForegroundService(intent);
                        }
                    }
                    dVar.mo17181a(intent, bVar.f19034b, 1);
                }
                C6895d.m26021a("BeaconManager", "consumer count is now: %s", Integer.valueOf(this.f19015j.size()));
            }
        }
    }

    /* renamed from: a */
    public void mo18759a(C6915m mVar) {
        if (mVar != null) {
            this.f19017l.add(mVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18760b() {
        C6903a aVar = new C6903a(this.f19014i);
        String c = aVar.mo18751c();
        String a = aVar.mo18749a();
        int b = aVar.mo18750b();
        this.f19026u = aVar.mo18752d();
        C6895d.m26026c("BeaconManager", "BeaconManager started up on pid " + b + " named '" + c + "' for application package '" + a + "'.  isMainProcess=" + this.f19026u, new Object[0]);
    }

    @TargetApi(18)
    /* renamed from: b */
    public void mo18761b(Region region) {
        if (!m26063G()) {
            C6895d.m26027d("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!m26059C()) {
            synchronized (this.f19020o) {
                Region region2 = null;
                Iterator<Region> it = this.f19020o.iterator();
                while (it.hasNext()) {
                    Region next = it.next();
                    if (region.mo18709a().equals(next.mo18709a())) {
                        region2 = next;
                    }
                }
                this.f19020o.remove(region2);
            }
            m26070a(3, region);
        }
    }

    /* renamed from: b */
    public void mo18762b(C6900d dVar) {
        if (!m26063G()) {
            C6895d.m26027d("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.f19015j) {
            if (this.f19015j.containsKey(dVar)) {
                C6895d.m26021a("BeaconManager", "Unbinding", new Object[0]);
                if (this.f19028w) {
                    C6895d.m26021a("BeaconManager", "Not unbinding from scanning service as we are using scan jobs.", new Object[0]);
                } else {
                    dVar.mo17180a(((C6908b) this.f19015j.get(dVar)).f19034b);
                }
                C6895d.m26021a("BeaconManager", "Before unbind, consumer count is " + this.f19015j.size(), new Object[0]);
                this.f19015j.remove(dVar);
                C6895d.m26021a("BeaconManager", "After unbind, consumer count is " + this.f19015j.size(), new Object[0]);
                if (this.f19015j.size() == 0) {
                    this.f19016k = null;
                    this.f19024s = false;
                    if (this.f19028w && Build.VERSION.SDK_INT >= 21) {
                        C6895d.m26026c("BeaconManager", "Cancelling scheduled jobs after unbind of last consumer.", new Object[0]);
                        C6956q.m26322b().mo18945a(this.f19014i);
                    }
                }
            } else {
                C6895d.m26021a("BeaconManager", "This consumer is not bound to: %s", dVar);
                C6895d.m26021a("BeaconManager", "Bound consumers: ", new Object[0]);
                for (Map.Entry value : this.f19015j.entrySet()) {
                    C6895d.m26021a("BeaconManager", String.valueOf(value.getValue()), new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo18763b(boolean z) {
        this.f19027v = Boolean.valueOf(z);
    }

    /* renamed from: c */
    public long mo18764c() {
        return this.f19013C;
    }

    /* renamed from: d */
    public boolean mo18765d() {
        return this.f19024s;
    }

    /* renamed from: e */
    public long mo18766e() {
        return this.f19012B;
    }

    /* renamed from: f */
    public List<C6910i> mo18767f() {
        return this.f19021p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C6915m mo18768h() {
        return this.f19018m;
    }

    /* renamed from: j */
    public long mo18769j() {
        return this.f19011A;
    }

    /* renamed from: k */
    public long mo18770k() {
        return this.f19031z;
    }

    /* renamed from: l */
    public Notification mo18771l() {
        return this.f19029x;
    }

    /* renamed from: m */
    public int mo18772m() {
        return this.f19030y;
    }

    /* renamed from: n */
    public Collection<Region> mo18773n() {
        return C6941e.m26233a(this.f19014i).mo18884c();
    }

    /* renamed from: o */
    public Set<C6914l> mo18774o() {
        return Collections.unmodifiableSet(this.f19019n);
    }

    /* renamed from: p */
    public C6935q mo18775p() {
        return this.f19022q;
    }

    /* renamed from: q */
    public Collection<Region> mo18776q() {
        ArrayList arrayList;
        synchronized (this.f19020o) {
            arrayList = new ArrayList(this.f19020o);
        }
        return arrayList;
    }

    /* renamed from: r */
    public Set<C6915m> mo18777r() {
        return Collections.unmodifiableSet(this.f19017l);
    }

    /* renamed from: u */
    public boolean mo18778u() {
        return this.f19028w;
    }

    /* renamed from: w */
    public boolean mo18779w() {
        boolean z;
        synchronized (this.f19015j) {
            z = !this.f19015j.isEmpty() && (this.f19028w || this.f19016k != null);
        }
        return z;
    }

    /* renamed from: x */
    public boolean mo18780x() {
        return this.f19026u;
    }

    /* renamed from: y */
    public boolean mo18781y() {
        return this.f19023r;
    }

    /* renamed from: z */
    public boolean mo18782z() {
        Boolean bool = this.f19027v;
        return bool != null && !bool.booleanValue();
    }
}
