package org.altbeacon.beacon.service.p296a;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.Date;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.bluetooth.C6964c;

@TargetApi(18)
/* renamed from: org.altbeacon.beacon.service.a.d */
public abstract class C6922d {

    /* renamed from: a */
    private BluetoothAdapter f19094a;

    /* renamed from: b */
    private long f19095b = 0;

    /* renamed from: c */
    private long f19096c = 0;

    /* renamed from: d */
    protected long f19097d = 0;

    /* renamed from: e */
    private long f19098e = 0;

    /* renamed from: f */
    private long f19099f = 0;

    /* renamed from: g */
    private boolean f19100g = false;

    /* renamed from: h */
    private boolean f19101h;

    /* renamed from: i */
    protected boolean f19102i;

    /* renamed from: j */
    private boolean f19103j = false;

    /* renamed from: k */
    private boolean f19104k = false;

    /* renamed from: l */
    protected final Context f19105l;

    /* renamed from: m */
    private long f19106m;

    /* renamed from: n */
    private boolean f19107n = false;

    /* renamed from: o */
    protected long f19108o;

    /* renamed from: p */
    protected final Handler f19109p = new Handler(Looper.getMainLooper());

    /* renamed from: q */
    protected final Handler f19110q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final HandlerThread f19111r;

    /* renamed from: s */
    protected final C6964c f19112s;

    /* renamed from: t */
    protected final C6919a f19113t;

    /* renamed from: u */
    protected boolean f19114u = false;

    /* renamed from: v */
    protected boolean f19115v = false;

    /* renamed from: w */
    private volatile boolean f19116w = false;

    /* renamed from: x */
    private PendingIntent f19117x = null;

    protected C6922d(Context context, long j, long j2, boolean z, C6919a aVar, C6964c cVar) {
        this.f19106m = j;
        this.f19108o = j2;
        this.f19105l = context;
        this.f19113t = aVar;
        this.f19112s = cVar;
        this.f19114u = z;
        this.f19111r = new HandlerThread("CycledLeScannerThread");
        this.f19111r.start();
        this.f19110q = new Handler(this.f19111r.getLooper());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.p296a.C6922d m26175a(android.content.Context r15, long r16, long r18, boolean r20, org.altbeacon.beacon.service.p296a.C6919a r21, org.altbeacon.bluetooth.C6964c r22) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "CycledLeScanner"
            r2 = 0
            r3 = 18
            if (r0 >= r3) goto L_0x0012
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Not supported prior to API 18."
            org.altbeacon.beacon.p293c.C6895d.m26027d(r1, r2, r0)
            r0 = 0
            return r0
        L_0x0012:
            r3 = 21
            r4 = 1
            if (r0 >= r3) goto L_0x0020
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is pre Android 5.0.  We are using old scanning APIs"
        L_0x001b:
            org.altbeacon.beacon.p293c.C6895d.m26026c(r1, r3, r0)
            r4 = r2
            goto L_0x0041
        L_0x0020:
            r3 = 26
            if (r0 >= r3) goto L_0x0037
            boolean r0 = org.altbeacon.beacon.C6906h.m26078v()
            if (r0 == 0) goto L_0x002f
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is Android 5.0, but L scanning is disabled. We are using old scanning APIs"
            goto L_0x001b
        L_0x002f:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is Android 5.0.  We are using new scanning APIs"
            org.altbeacon.beacon.p293c.C6895d.m26026c(r1, r3, r0)
            goto L_0x0041
        L_0x0037:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "Using Android O scanner"
            org.altbeacon.beacon.p293c.C6895d.m26026c(r1, r3, r0)
            r14 = r4
            r4 = r2
            r2 = r14
        L_0x0041:
            if (r2 == 0) goto L_0x0055
            org.altbeacon.beacon.service.a.e r0 = new org.altbeacon.beacon.service.a.e
            r5 = r0
            r6 = r15
            r7 = r16
            r9 = r18
            r11 = r20
            r12 = r21
            r13 = r22
            r5.<init>(r6, r7, r9, r11, r12, r13)
            return r0
        L_0x0055:
            if (r4 == 0) goto L_0x0069
            org.altbeacon.beacon.service.a.o r0 = new org.altbeacon.beacon.service.a.o
            r1 = r0
            r2 = r15
            r3 = r16
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0069:
            org.altbeacon.beacon.service.a.j r0 = new org.altbeacon.beacon.service.a.j
            r1 = r0
            r2 = r15
            r3 = r16
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.p296a.C6922d.m26175a(android.content.Context, long, long, boolean, org.altbeacon.beacon.service.a.a, org.altbeacon.bluetooth.c):org.altbeacon.beacon.service.a.d");
    }

    /* renamed from: a */
    private boolean m26176a(String str) {
        return this.f19105l.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* renamed from: n */
    private boolean m26177n() {
        return m26176a("android.permission.ACCESS_COARSE_LOCATION") || m26176a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: o */
    private void m26178o() {
        String str;
        Object[] objArr;
        C6895d.m26021a("CycledLeScanner", "Done with scan cycle", new Object[0]);
        try {
            this.f19113t.mo18833a();
            if (this.f19101h) {
                if (mo18845e() != null) {
                    if (mo18845e().isEnabled()) {
                        if (this.f19116w && this.f19108o == 0) {
                            if (!m26180q()) {
                                str = "Not stopping scanning.  Device capable of multiple indistinct detections per scan.";
                                objArr = new Object[0];
                                C6895d.m26021a("CycledLeScanner", str, objArr);
                                this.f19107n = true;
                                this.f19096c = SystemClock.elapsedRealtime();
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Build.VERSION.SDK_INT < 24 || this.f19108o + this.f19106m >= 6000 || elapsedRealtime - this.f19095b >= 6000) {
                            try {
                                C6895d.m26021a("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                                mo18844d();
                                this.f19107n = false;
                            } catch (Exception e) {
                                C6895d.m26025b(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                            }
                            this.f19096c = SystemClock.elapsedRealtime();
                        } else {
                            str = "Not stopping scan because this is Android N and we keep scanning for a minimum of 6 seconds at a time. We will stop in " + (6000 - (elapsedRealtime - this.f19095b)) + " millisconds.";
                            objArr = new Object[0];
                            C6895d.m26021a("CycledLeScanner", str, objArr);
                            this.f19107n = true;
                            this.f19096c = SystemClock.elapsedRealtime();
                        }
                    } else {
                        C6895d.m26021a("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        this.f19115v = true;
                    }
                }
                this.f19097d = m26179p();
                if (this.f19104k) {
                    mo18839a((Boolean) true);
                }
            }
            if (!this.f19104k) {
                C6895d.m26021a("CycledLeScanner", "Scanning disabled. ", new Object[0]);
                this.f19103j = false;
                mo18837a();
            }
        } catch (SecurityException unused) {
            C6895d.m26027d("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* renamed from: p */
    private long m26179p() {
        long j = this.f19108o;
        if (j == 0) {
            return SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = j - (SystemClock.elapsedRealtime() % (this.f19106m + j));
        C6895d.m26021a("CycledLeScanner", "Normalizing between scan period from %s to %s", Long.valueOf(this.f19108o), Long.valueOf(elapsedRealtime));
        return SystemClock.elapsedRealtime() + elapsedRealtime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m26180q() {
        /*
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9.f19108o
            long r0 = r0 + r2
            long r2 = r9.f19106m
            long r0 = r0 + r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 0
            r5 = 24
            if (r2 < r5) goto L_0x0024
            long r5 = r9.f19099f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            long r0 = r0 - r5
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r0 = r3
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "CycledLeScanner"
            java.lang.String r2 = "The next scan cycle would go over the Android N max duration."
            org.altbeacon.beacon.p293c.C6895d.m26021a(r1, r2, r0)
            boolean r0 = r9.f19100g
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Stopping scan to prevent Android N scan timeout."
            org.altbeacon.beacon.p293c.C6895d.m26021a(r1, r2, r0)
            return r3
        L_0x003c:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Allowing a long running scan to be stopped by the OS.  To prevent this, set longScanForcingEnabled in the AndroidBeaconLibrary."
            org.altbeacon.beacon.p293c.C6895d.m26027d(r1, r2, r0)
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.p296a.C6922d.m26180q():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18837a() {
        C6895d.m26021a("CycledLeScanner", "cancel wakeup alarm: %s", this.f19117x);
        ((AlarmManager) this.f19105l.getSystemService("alarm")).set(2, Long.MAX_VALUE, mo18847g());
        C6895d.m26021a("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(Long.MAX_VALUE - SystemClock.elapsedRealtime()), mo18847g());
    }

    /* renamed from: a */
    public void mo18838a(long j, long j2, boolean z) {
        C6895d.m26021a("CycledLeScanner", "Set scan periods called with %s, %s Background mode must have changed.", Long.valueOf(j), Long.valueOf(j2));
        if (this.f19114u != z) {
            this.f19115v = true;
        }
        this.f19114u = z;
        this.f19106m = j;
        this.f19108o = j2;
        if (this.f19114u) {
            C6895d.m26021a("CycledLeScanner", "We are in the background.  Setting wakeup alarm", new Object[0]);
            mo18849i();
        } else {
            C6895d.m26021a("CycledLeScanner", "We are not in the background.  Cancelling wakeup alarm", new Object[0]);
            mo18837a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f19097d;
        if (j3 > elapsedRealtime) {
            long j4 = this.f19096c + j2;
            if (j4 < j3) {
                this.f19097d = j4;
                C6895d.m26026c("CycledLeScanner", "Adjusted nextScanStartTime to be %s", new Date((this.f19097d - SystemClock.elapsedRealtime()) + System.currentTimeMillis()));
            }
        }
        long j5 = this.f19098e;
        if (j5 > elapsedRealtime) {
            long j6 = this.f19095b + j;
            if (j6 < j5) {
                this.f19098e = j6;
                C6895d.m26026c("CycledLeScanner", "Adjusted scanStopTime to be %s", Long.valueOf(this.f19098e));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18839a(Boolean bool) {
        String str;
        Object[] objArr;
        try {
            this.f19103j = true;
            if (mo18845e() == null) {
                C6895d.m26024b("CycledLeScanner", "No Bluetooth adapter.  beaconService cannot scan.", new Object[0]);
            }
            if (!this.f19104k || !bool.booleanValue()) {
                C6895d.m26021a("CycledLeScanner", "disabling scan", new Object[0]);
                this.f19101h = false;
                this.f19103j = false;
                mo18853m();
                this.f19099f = 0;
                this.f19096c = SystemClock.elapsedRealtime();
                this.f19109p.removeCallbacksAndMessages((Object) null);
                m26178o();
            } else if (!mo18842b()) {
                C6895d.m26021a("CycledLeScanner", "starting a new scan cycle", new Object[0]);
                if (this.f19101h && !this.f19102i) {
                    if (!this.f19115v) {
                        C6895d.m26021a("CycledLeScanner", "We are already scanning and have been for " + (SystemClock.elapsedRealtime() - this.f19099f) + " millis", new Object[0]);
                        this.f19098e = SystemClock.elapsedRealtime() + this.f19106m;
                        mo18848h();
                        C6895d.m26021a("CycledLeScanner", "Scan started", new Object[0]);
                    }
                }
                this.f19101h = true;
                this.f19102i = false;
                try {
                    if (mo18845e() != null) {
                        if (mo18845e().isEnabled()) {
                            if (this.f19112s != null && this.f19112s.mo18979b()) {
                                C6895d.m26027d("CycledLeScanner", "Skipping scan because crash recovery is in progress.", new Object[0]);
                            } else if (this.f19104k) {
                                if (this.f19115v) {
                                    this.f19115v = false;
                                    str = "restarting a bluetooth le scan";
                                    objArr = new Object[0];
                                } else {
                                    str = "starting a new bluetooth le scan";
                                    objArr = new Object[0];
                                }
                                C6895d.m26021a("CycledLeScanner", str, objArr);
                                try {
                                    if (Build.VERSION.SDK_INT < 23 || m26177n()) {
                                        this.f19099f = SystemClock.elapsedRealtime();
                                        mo18851k();
                                    }
                                } catch (Exception e) {
                                    C6895d.m26022a(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                                }
                            } else {
                                C6895d.m26021a("CycledLeScanner", "Scanning unnecessary - no monitoring or ranging active.", new Object[0]);
                            }
                            this.f19095b = SystemClock.elapsedRealtime();
                        } else {
                            C6895d.m26021a("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        }
                    }
                } catch (Exception e2) {
                    C6895d.m26022a(e2, "CycledLeScanner", "Exception starting Bluetooth scan.  Perhaps Bluetooth is disabled or unavailable?", new Object[0]);
                }
                this.f19098e = SystemClock.elapsedRealtime() + this.f19106m;
                mo18848h();
                C6895d.m26021a("CycledLeScanner", "Scan started", new Object[0]);
            }
        } catch (SecurityException unused) {
            C6895d.m26027d("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo18840a(boolean z) {
        this.f19116w = z;
    }

    /* renamed from: b */
    public void mo18841b(boolean z) {
        this.f19100g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo18842b();

    /* renamed from: c */
    public void mo18843c() {
        C6895d.m26021a("CycledLeScanner", "Destroying", new Object[0]);
        this.f19109p.removeCallbacksAndMessages((Object) null);
        this.f19110q.post(new C6920b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo18844d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public BluetoothAdapter mo18845e() {
        try {
            if (this.f19094a == null) {
                this.f19094a = ((BluetoothManager) this.f19105l.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                if (this.f19094a == null) {
                    C6895d.m26027d("CycledLeScanner", "Failed to construct a BluetoothAdapter", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            C6895d.m26024b("CycledLeScanner", "Cannot consruct bluetooth adapter.  Security Exception", new Object[0]);
        }
        return this.f19094a;
    }

    /* renamed from: f */
    public boolean mo18846f() {
        return this.f19116w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public PendingIntent mo18847g() {
        if (this.f19117x == null) {
            Intent intent = new Intent(this.f19105l, StartupBroadcastReceiver.class);
            intent.putExtra("wakeup", true);
            this.f19117x = PendingIntent.getBroadcast(this.f19105l, 0, intent, 134217728);
        }
        return this.f19117x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18848h() {
        long elapsedRealtime = this.f19098e - SystemClock.elapsedRealtime();
        if (!this.f19104k || elapsedRealtime <= 0) {
            m26178o();
            return;
        }
        C6895d.m26021a("CycledLeScanner", "Waiting to stop scan cycle for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.f19114u) {
            mo18849i();
        }
        Handler handler = this.f19109p;
        C6921c cVar = new C6921c(this);
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(cVar, elapsedRealtime);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18849i() {
        long j = this.f19108o;
        if (300000 >= j) {
            j = 300000;
        }
        long j2 = this.f19106m;
        if (j < j2) {
            j = j2;
        }
        ((AlarmManager) this.f19105l.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + j, mo18847g());
        C6895d.m26021a("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(j), mo18847g());
    }

    /* renamed from: j */
    public void mo18850j() {
        C6895d.m26021a("CycledLeScanner", "start called", new Object[0]);
        this.f19104k = true;
        if (!this.f19103j) {
            mo18839a((Boolean) true);
        } else {
            C6895d.m26021a("CycledLeScanner", "scanning already started", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo18851k();

    /* renamed from: l */
    public void mo18852l() {
        C6895d.m26021a("CycledLeScanner", "stop called", new Object[0]);
        this.f19104k = false;
        if (this.f19103j) {
            mo18839a((Boolean) false);
            if (this.f19107n) {
                C6895d.m26021a("CycledLeScanner", "Stopping scanning previously left on.", new Object[0]);
                this.f19107n = false;
                try {
                    C6895d.m26021a("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                    mo18844d();
                } catch (Exception e) {
                    C6895d.m26025b(e, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                }
            }
        } else {
            C6895d.m26021a("CycledLeScanner", "scanning already stopped", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo18853m();
}
