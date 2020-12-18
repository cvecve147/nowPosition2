package org.altbeacon.bluetooth;

import android.app.job.JobParameters;
import android.content.Context;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.i */
class C6971i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobParameters f19283a;

    /* renamed from: b */
    final /* synthetic */ BluetoothTestJob f19284b;

    C6971i(BluetoothTestJob bluetoothTestJob, JobParameters jobParameters) {
        this.f19284b = bluetoothTestJob;
        this.f19283a = jobParameters;
    }

    public void run() {
        boolean z;
        C6895d.m26026c(BluetoothTestJob.f19244a, "Bluetooth Test Job running", new Object[0]);
        int i = this.f19283a.getExtras().getInt("test_type");
        boolean z2 = true;
        if (i == 0) {
            C6895d.m26021a(BluetoothTestJob.f19244a, "No test specified.  Done with job.", new Object[0]);
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) == 1) {
            C6895d.m26021a(BluetoothTestJob.f19244a, "Scan test specified.", new Object[0]);
            if (!C6970h.m26388b().mo18990a((Context) this.f19284b)) {
                C6895d.m26021a(BluetoothTestJob.f19244a, "scan test failed", new Object[0]);
            }
            z = true;
        }
        if ((i & 2) == 2) {
            if (z) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException unused) {
                }
            }
            C6895d.m26021a(BluetoothTestJob.f19244a, "Transmit test specified.", new Object[0]);
            if (!C6970h.m26388b().mo18991b((Context) this.f19284b)) {
                C6895d.m26021a(BluetoothTestJob.f19244a, "transmit test failed", new Object[0]);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            C6895d.m26027d(BluetoothTestJob.f19244a, "Unknown test type:" + i + "  Exiting.", new Object[0]);
        }
        this.f19284b.jobFinished(this.f19283a, false);
    }
}
