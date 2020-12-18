package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Pg */
final class C2603Pg implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f8100a;

    /* renamed from: b */
    private final Object f8101b = new Object();

    /* renamed from: c */
    private final Display f8102c;

    /* renamed from: d */
    private final float[] f8103d = new float[9];

    /* renamed from: e */
    private final float[] f8104e = new float[9];

    /* renamed from: f */
    private float[] f8105f;

    /* renamed from: g */
    private Handler f8106g;

    /* renamed from: h */
    private C2661Rg f8107h;

    C2603Pg(Context context) {
        this.f8100a = (SensorManager) context.getSystemService("sensor");
        this.f8102c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private final void m10874a(int i, int i2) {
        float[] fArr = this.f8104e;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8666a() {
        if (this.f8106g == null) {
            Sensor defaultSensor = this.f8100a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C2227Cf.m9529a("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f8106g = new Handler(handlerThread.getLooper());
            if (!this.f8100a.registerListener(this, defaultSensor, 0, this.f8106g)) {
                C2227Cf.m9529a("SensorManager.registerListener failed.");
                mo8669b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8667a(C2661Rg rg) {
        this.f8107h = rg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8668a(float[] fArr) {
        synchronized (this.f8101b) {
            if (this.f8105f == null) {
                return false;
            }
            System.arraycopy(this.f8105f, 0, fArr, 0, this.f8105f.length);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8669b() {
        if (this.f8106g != null) {
            this.f8100a.unregisterListener(this);
            this.f8106g.post(new C2634Qg(this));
            this.f8106g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f8101b) {
                if (this.f8105f == null) {
                    this.f8105f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f8103d, fArr);
            int rotation = this.f8102c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f8103d, 2, 129, this.f8104e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f8103d, 129, 130, this.f8104e);
            } else if (rotation != 3) {
                System.arraycopy(this.f8103d, 0, this.f8104e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f8103d, 130, 1, this.f8104e);
            }
            m10874a(1, 3);
            m10874a(2, 6);
            m10874a(5, 7);
            synchronized (this.f8101b) {
                System.arraycopy(this.f8104e, 0, this.f8105f, 0, 9);
            }
            C2661Rg rg = this.f8107h;
            if (rg != null) {
                rg.mo8781a();
            }
        }
    }
}
