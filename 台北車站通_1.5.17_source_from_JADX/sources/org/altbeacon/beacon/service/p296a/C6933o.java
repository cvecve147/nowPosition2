package org.altbeacon.beacon.service.p296a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.service.C6938b;
import org.altbeacon.bluetooth.C6964c;

@TargetApi(21)
/* renamed from: org.altbeacon.beacon.service.a.o */
public class C6933o extends C6922d {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f19137A = 0;

    /* renamed from: B */
    private long f19138B = 0;

    /* renamed from: C */
    private boolean f19139C = false;

    /* renamed from: D */
    private final C6906h f19140D = C6906h.m26069a(this.f19105l);

    /* renamed from: y */
    private BluetoothLeScanner f19141y;

    /* renamed from: z */
    private ScanCallback f19142z;

    public C6933o(Context context, long j, long j2, boolean z, C6919a aVar, C6964c cVar) {
        super(context, j, j2, z, aVar, cVar);
    }

    /* renamed from: a */
    private void m26207a(List<ScanFilter> list, ScanSettings scanSettings) {
        BluetoothLeScanner o = m26209o();
        if (o != null) {
            ScanCallback n = m26208n();
            this.f19110q.removeCallbacksAndMessages((Object) null);
            this.f19110q.post(new C6930l(this, o, list, scanSettings, n));
        }
    }

    /* renamed from: n */
    private ScanCallback m26208n() {
        if (this.f19142z == null) {
            this.f19142z = new C6932n(this);
        }
        return this.f19142z;
    }

    /* renamed from: o */
    private BluetoothLeScanner m26209o() {
        try {
            if (this.f19141y == null) {
                C6895d.m26021a("CycledLeScannerForLollipop", "Making new Android L scanner", new Object[0]);
                if (mo18845e() != null) {
                    this.f19141y = mo18845e().getBluetoothLeScanner();
                }
                if (this.f19141y == null) {
                    C6895d.m26027d("CycledLeScannerForLollipop", "Failed to make new Android L scanner", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            C6895d.m26027d("CycledLeScannerForLollipop", "SecurityException making new Android L scanner", new Object[0]);
        }
        return this.f19141y;
    }

    /* renamed from: p */
    private boolean m26210p() {
        try {
            BluetoothAdapter e = mo18845e();
            if (e != null) {
                return e.getState() == 12;
            }
            C6895d.m26027d("CycledLeScannerForLollipop", "Cannot get bluetooth adapter", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            C6895d.m26027d("CycledLeScannerForLollipop", "SecurityException checking if bluetooth is on", new Object[0]);
        }
    }

    /* renamed from: q */
    private void m26211q() {
        if (!m26210p()) {
            C6895d.m26021a("CycledLeScannerForLollipop", "Not stopping scan because bluetooth is off", new Object[0]);
            return;
        }
        BluetoothLeScanner o = m26209o();
        if (o != null) {
            ScanCallback n = m26208n();
            this.f19110q.removeCallbacksAndMessages((Object) null);
            this.f19110q.post(new C6931m(this, o, n));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18842b() {
        long elapsedRealtime = this.f19097d - SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime > 0;
        boolean z2 = this.f19139C;
        this.f19139C = !z;
        if (z) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - C6938b.m26222a().mo18870b();
            if (z2) {
                if (elapsedRealtime2 > 10000) {
                    this.f19137A = SystemClock.elapsedRealtime();
                    this.f19138B = 0;
                    C6895d.m26021a("CycledLeScannerForLollipop", "This is Android L. Preparing to do a filtered scan for the background.", new Object[0]);
                    if (this.f19108o > 6000) {
                        mo18851k();
                    } else {
                        C6895d.m26021a("CycledLeScannerForLollipop", "Suppressing scan between cycles because the between scan cycle is too short.", new Object[0]);
                    }
                } else {
                    C6895d.m26021a("CycledLeScannerForLollipop", "This is Android L, but we last saw a beacon only %s ago, so we will not keep scanning in background.", Long.valueOf(elapsedRealtime2));
                }
            }
            if (this.f19137A > 0 && C6938b.m26222a().mo18870b() > this.f19137A) {
                if (this.f19138B == 0) {
                    this.f19138B = C6938b.m26222a().mo18870b();
                }
                if (SystemClock.elapsedRealtime() - this.f19138B >= 10000) {
                    C6895d.m26021a("CycledLeScannerForLollipop", "We've been detecting for a bit.  Stopping Android L background scanning", new Object[0]);
                    mo18853m();
                    this.f19137A = 0;
                } else {
                    C6895d.m26021a("CycledLeScannerForLollipop", "Delivering Android L background scanning results", new Object[0]);
                    this.f19113t.mo18833a();
                }
            }
            C6895d.m26021a("CycledLeScannerForLollipop", "Waiting to start full Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
            if (z2 && this.f19114u) {
                mo18849i();
            }
            Handler handler = this.f19109p;
            C6929k kVar = new C6929k(this);
            if (elapsedRealtime > 1000) {
                elapsedRealtime = 1000;
            }
            handler.postDelayed(kVar, elapsedRealtime);
        } else if (this.f19137A > 0) {
            mo18853m();
            this.f19137A = 0;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18844d() {
        C6895d.m26021a("CycledLeScannerForLollipop", "Stopping scan", new Object[0]);
        mo18853m();
        this.f19102i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo18851k() {
        ScanSettings scanSettings;
        if (!m26210p()) {
            C6895d.m26021a("CycledLeScannerForLollipop", "Not starting scan because bluetooth is off", new Object[0]);
            return;
        }
        List<ScanFilter> arrayList = new ArrayList<>();
        if (!this.f19139C) {
            C6895d.m26021a("CycledLeScannerForLollipop", "starting filtered scan in SCAN_MODE_LOW_POWER", new Object[0]);
            scanSettings = new ScanSettings.Builder().setScanMode(0).build();
            arrayList = new C6936r().mo18868a(this.f19140D.mo18767f());
        } else {
            C6895d.m26021a("CycledLeScannerForLollipop", "starting a scan in SCAN_MODE_LOW_LATENCY", new Object[0]);
            scanSettings = new ScanSettings.Builder().setScanMode(2).build();
            if (Build.VERSION.SDK_INT < 27) {
                C6895d.m26021a("CycledLeScannerForLollipop", "Using no scan filter since this is pre-8.1", new Object[0]);
            } else if (Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                C6895d.m26021a("CycledLeScannerForLollipop", "Using a non-empty scan filter since this is Samsung 8.1+", new Object[0]);
                arrayList = new C6936r().mo18868a(this.f19140D.mo18767f());
            } else {
                C6895d.m26021a("CycledLeScannerForLollipop", "Using an empty scan filter since this is 8.1+ on Non-Samsung", new Object[0]);
                arrayList = new C6936r().mo18867a();
            }
        }
        if (scanSettings != null) {
            m26207a(arrayList, scanSettings);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo18853m() {
        m26211q();
    }
}
