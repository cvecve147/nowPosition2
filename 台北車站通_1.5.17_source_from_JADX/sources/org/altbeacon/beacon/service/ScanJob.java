package org.altbeacon.beacon.service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p292b.C6885c;
import org.altbeacon.beacon.p292b.C6888f;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.p295e.C6903a;
import org.altbeacon.bluetooth.C6964c;

@TargetApi(21)
public class ScanJob extends JobService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19080a = "ScanJob";

    /* renamed from: b */
    private static int f19081b = -1;

    /* renamed from: c */
    private static int f19082c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6957r f19083d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f19084e = new Handler();

    /* renamed from: f */
    private C6951n f19085f;

    /* renamed from: g */
    private boolean f19086g = false;

    /* renamed from: a */
    public static int m26151a(Context context) {
        if (f19081b < 0) {
            return m26152a(context, "immediateScanJobId");
        }
        String str = f19080a;
        C6895d.m26026c(str, "Using ImmediateScanJobId from static override: " + f19081b, new Object[0]);
        return f19081b;
    }

    /* renamed from: a */
    private static int m26152a(Context context, String str) {
        ServiceInfo serviceInfo;
        Bundle bundle;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, ScanJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo == null || (bundle = serviceInfo.metaData) == null || bundle.get(str) == null) {
            throw new RuntimeException("Cannot get job id from manifest.  Make sure that the " + str + " is configured in the manifest for the ScanJob.");
        }
        int i = serviceInfo.metaData.getInt(str);
        String str2 = f19080a;
        C6895d.m26026c(str2, "Using " + str + " from manifest: " + i, new Object[0]);
        return i;
    }

    /* renamed from: b */
    public static int m26155b(Context context) {
        if (f19081b < 0) {
            return m26152a(context, "periodicScanJobId");
        }
        String str = f19080a;
        C6895d.m26026c(str, "Using PeriodicScanJobId from static override: " + f19082c, new Object[0]);
        return f19082c;
    }

    /* renamed from: b */
    private boolean m26157b() {
        this.f19085f = new C6951n(this);
        this.f19083d = C6957r.m26329a((Context) this);
        this.f19083d.mo18950a(System.currentTimeMillis());
        this.f19085f.mo18924a(this.f19083d.mo18958h());
        this.f19085f.mo18921a(this.f19083d.mo18959i());
        this.f19085f.mo18922a(this.f19083d.mo18954d());
        this.f19085f.mo18923a(this.f19083d.mo18955e());
        if (this.f19085f.mo18926b() != null) {
            return true;
        }
        try {
            this.f19085f.mo18925a(this.f19083d.mo18952b().booleanValue(), (C6964c) null);
            return true;
        } catch (OutOfMemoryError unused) {
            C6895d.m26027d(f19080a, "Failed to create CycledLeScanner thread.", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    private boolean m26159c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19085f.mo18933g();
        }
        long longValue = (this.f19083d.mo18952b().booleanValue() ? this.f19083d.mo18953c() : this.f19083d.mo18957g()).longValue();
        long longValue2 = (this.f19083d.mo18952b().booleanValue() ? this.f19083d.mo18949a() : this.f19083d.mo18956f()).longValue();
        if (this.f19085f.mo18926b() != null) {
            this.f19085f.mo18926b().mo18838a(longValue, longValue2, this.f19083d.mo18952b().booleanValue());
        }
        this.f19086g = true;
        if (longValue <= 0) {
            C6895d.m26027d(f19080a, "Starting scan with scan period of zero.  Exiting ScanJob.", new Object[0]);
            if (this.f19085f.mo18926b() != null) {
                this.f19085f.mo18926b().mo18852l();
            }
            return false;
        } else if (this.f19085f.mo18929d().size() > 0 || this.f19085f.mo18928c().mo18884c().size() > 0) {
            if (this.f19085f.mo18926b() != null) {
                this.f19085f.mo18926b().mo18850j();
            }
            return true;
        } else {
            if (this.f19085f.mo18926b() != null) {
                this.f19085f.mo18926b().mo18852l();
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26161d() {
        if (!this.f19083d.mo18952b().booleanValue()) {
            C6895d.m26021a(f19080a, "In foreground mode, schedule next scan", new Object[0]);
            C6956q.m26322b().mo18948b(this);
            return;
        }
        m26162e();
    }

    /* renamed from: e */
    private void m26162e() {
        C6895d.m26021a(f19080a, "Checking to see if we need to start a passive scan", new Object[0]);
        boolean z = false;
        for (Region d : new ArrayList(this.f19083d.mo18958h().mo18884c())) {
            C6945i d2 = this.f19083d.mo18958h().mo18887d(d);
            if (d2 != null && d2.mo18909b()) {
                z = true;
            }
        }
        if (z) {
            C6895d.m26026c(f19080a, "We are inside a beacon region.  We will not scan between cycles.", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f19085f.mo18927b(this.f19083d.mo18954d());
        } else {
            C6895d.m26021a(f19080a, "This is not Android O.  No scanning between cycles when using ScanJob", new Object[0]);
        }
    }

    /* renamed from: f */
    private boolean m26163f() {
        C6906h a = C6906h.m26069a(getApplicationContext());
        a.mo18763b(true);
        if (a.mo18780x()) {
            C6895d.m26026c(f19080a, "scanJob version %s is starting up on the main process", "2.16.1");
        } else {
            C6895d.m26026c(f19080a, "beaconScanJob library version %s is starting up on a separate process", "2.16.1");
            C6903a aVar = new C6903a(this);
            String str = f19080a;
            C6895d.m26026c(str, "beaconScanJob PID is " + aVar.mo18750b() + " with process name " + aVar.mo18751c(), new Object[0]);
        }
        Beacon.m25942a((C6885c) new C6888f(this, C6906h.m26075i()));
        return m26159c();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m26164g() {
        this.f19086g = false;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19085f.mo18933g();
        }
        if (this.f19085f.mo18926b() != null) {
            this.f19085f.mo18926b().mo18852l();
            this.f19085f.mo18926b().mo18843c();
        }
        C6895d.m26021a(f19080a, "Scanning stopped", new Object[0]);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String str;
        StringBuilder sb;
        String str2;
        boolean z;
        if (!m26157b()) {
            C6895d.m26024b(f19080a, "Cannot allocate a scanner to look for beacons.  System resources are low.", new Object[0]);
            return false;
        }
        if (jobParameters.getJobId() == m26151a((Context) this)) {
            str2 = f19080a;
            sb = new StringBuilder();
            str = "Running immediate scan job: instance is ";
        } else {
            str2 = f19080a;
            sb = new StringBuilder();
            str = "Running periodic scan job: instance is ";
        }
        sb.append(str);
        sb.append(this);
        C6895d.m26026c(str2, sb.toString(), new Object[0]);
        List<ScanResult> a = C6956q.m26322b().mo18944a();
        C6895d.m26021a(f19080a, "Processing %d queued scan resuilts", Integer.valueOf(a.size()));
        for (ScanResult next : a) {
            ScanRecord scanRecord = next.getScanRecord();
            if (scanRecord != null) {
                this.f19085f.mo18919a(next.getDevice(), next.getRssi(), scanRecord.getBytes());
            }
        }
        C6895d.m26021a(f19080a, "Done processing queued scan resuilts", new Object[0]);
        if (this.f19086g) {
            C6895d.m26021a(f19080a, "Scanning already started.  Resetting for current parameters", new Object[0]);
            z = m26159c();
        } else {
            z = m26163f();
        }
        this.f19084e.removeCallbacksAndMessages((Object) null);
        if (z) {
            String str3 = f19080a;
            C6895d.m26026c(str3, "Scan job running for " + this.f19083d.mo18961k() + " millis", new Object[0]);
            this.f19084e.postDelayed(new C6955p(this, jobParameters), (long) this.f19083d.mo18961k());
        } else {
            C6895d.m26026c(f19080a, "Scanning not started so Scan job is complete.", new Object[0]);
            jobFinished(jobParameters, false);
        }
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        String str;
        String str2;
        StringBuilder sb;
        if (jobParameters.getJobId() == m26155b((Context) this)) {
            str = f19080a;
            sb = new StringBuilder();
            str2 = "onStopJob called for periodic scan ";
        } else {
            str = f19080a;
            sb = new StringBuilder();
            str2 = "onStopJob called for immediate scan ";
        }
        sb.append(str2);
        sb.append(this);
        C6895d.m26026c(str, sb.toString(), new Object[0]);
        this.f19084e.removeCallbacksAndMessages((Object) null);
        m26164g();
        m26162e();
        this.f19085f.mo18934h();
        return false;
    }
}
