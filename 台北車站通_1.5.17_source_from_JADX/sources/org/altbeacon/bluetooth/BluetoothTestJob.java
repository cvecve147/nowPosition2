package org.altbeacon.bluetooth;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

public class BluetoothTestJob extends JobService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19244a = "BluetoothTestJob";

    /* renamed from: b */
    private Handler f19245b = null;

    /* renamed from: c */
    private HandlerThread f19246c = null;

    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f19246c == null) {
            this.f19246c = new HandlerThread("BluetoothTestThread");
            this.f19246c.start();
        }
        if (this.f19245b == null) {
            this.f19245b = new Handler(this.f19246c.getLooper());
        }
        this.f19245b.post(new C6971i(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
