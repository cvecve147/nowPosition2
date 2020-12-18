package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.IBinder;

public class ServiceDetectShaking extends Service {

    /* renamed from: a */
    private C5173h f14508a;

    /* renamed from: b */
    private SensorManager f14509b;

    /* renamed from: c */
    private Sensor f14510c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f14511d = new Object();

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f14509b = (SensorManager) getSystemService("sensor");
        this.f14510c = this.f14509b.getDefaultSensor(1);
        this.f14508a = new C5173h(this);
        this.f14508a.mo14334a(new C5172g(this));
        return 2;
    }
}
