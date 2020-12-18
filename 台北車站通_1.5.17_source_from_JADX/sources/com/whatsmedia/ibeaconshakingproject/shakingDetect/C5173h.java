package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.content.Context;
import android.hardware.SensorListener;
import android.hardware.SensorManager;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.h */
public class C5173h implements SensorListener {

    /* renamed from: a */
    private SensorManager f14533a;

    /* renamed from: b */
    private float f14534b = -1.0f;

    /* renamed from: c */
    private float f14535c = -1.0f;

    /* renamed from: d */
    private float f14536d = -1.0f;

    /* renamed from: e */
    private long f14537e;

    /* renamed from: f */
    private C5174a f14538f;

    /* renamed from: g */
    private Context f14539g;

    /* renamed from: h */
    private int f14540h = 0;

    /* renamed from: i */
    private long f14541i;

    /* renamed from: j */
    private long f14542j;

    /* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.h$a */
    public interface C5174a {
        /* renamed from: a */
        void mo14332a();
    }

    public C5173h(Context context) {
        this.f14539g = context;
        mo14333a();
    }

    /* renamed from: a */
    public void mo14333a() {
        this.f14533a = (SensorManager) this.f14539g.getSystemService("sensor");
        SensorManager sensorManager = this.f14533a;
        if (sensorManager == null) {
            throw new UnsupportedOperationException("Sensors not supported");
        } else if (!sensorManager.registerListener(this, 2, 1)) {
            this.f14533a.unregisterListener(this, 2);
            throw new UnsupportedOperationException("Accelerometer not supported");
        }
    }

    /* renamed from: a */
    public void mo14334a(C5174a aVar) {
        this.f14538f = aVar;
    }

    public void onAccuracyChanged(int i, int i2) {
    }

    public void onSensorChanged(int i, float[] fArr) {
        if (i == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f14542j > 500) {
                this.f14540h = 0;
            }
            long j = this.f14537e;
            if (currentTimeMillis - j > 200) {
                if ((Math.abs(((((fArr[0] + fArr[1]) + fArr[2]) - this.f14534b) - this.f14535c) - this.f14536d) / ((float) (currentTimeMillis - j))) * 10000.0f > 350.0f) {
                    int i2 = this.f14540h + 1;
                    this.f14540h = i2;
                    if (i2 >= 3 && currentTimeMillis - this.f14541i > 1000) {
                        this.f14541i = currentTimeMillis;
                        this.f14540h = 0;
                        C5174a aVar = this.f14538f;
                        if (aVar != null) {
                            aVar.mo14332a();
                        }
                    }
                    this.f14542j = currentTimeMillis;
                }
                this.f14537e = currentTimeMillis;
                this.f14534b = fArr[0];
                this.f14535c = fArr[1];
                this.f14536d = fArr[2];
            }
        }
    }
}
