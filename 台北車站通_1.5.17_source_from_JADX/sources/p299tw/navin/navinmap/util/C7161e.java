package p299tw.navin.navinmap.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: tw.navin.navinmap.util.e */
public class C7161e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7162a f19842a;

    /* renamed from: b */
    private SensorManager f19843b;

    /* renamed from: c */
    private SensorEventListener f19844c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Sensor f19845d;

    /* renamed from: e */
    private Sensor f19846e;

    /* renamed from: f */
    private final int f19847f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float[] f19848g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f19849h;

    /* renamed from: i */
    private int f19850i;

    /* renamed from: tw.navin.navinmap.util.e$a */
    public interface C7162a {
        /* renamed from: a */
        void mo21066a(float f);

        /* renamed from: a */
        void mo21067a(float f, float f2);
    }

    /* renamed from: tw.navin.navinmap.util.e$b */
    private class C7163b implements SensorEventListener {

        /* renamed from: a */
        private float[] f19851a;

        /* renamed from: b */
        private float[] f19852b;

        /* renamed from: c */
        private float[] f19853c;

        /* renamed from: d */
        private float[] f19854d;

        /* renamed from: e */
        private float f19855e;

        /* renamed from: f */
        private int f19856f;

        private C7163b() {
            this.f19851a = new float[3];
            this.f19852b = new float[3];
            this.f19853c = new float[3];
            this.f19854d = new float[9];
            this.f19856f = 0;
        }

        /* renamed from: a */
        private void m26982a(float f, float f2) {
            float f3 = f - f2;
            if (f3 < 0.0f) {
                f3 += 360.0f;
            }
            C7161e.this.f19848g[this.f19856f] = ((float) (((double) f3) * 3.141592653589793d)) / 180.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i = 0; i < 30; i++) {
                f4 += (float) Math.cos((double) C7161e.this.f19848g[i]);
                f5 += (float) Math.sin((double) C7161e.this.f19848g[i]);
            }
            this.f19856f++;
            if (this.f19856f >= 30) {
                this.f19856f = 0;
            }
            double degrees = Math.toDegrees(Math.atan2((double) f5, (double) f4));
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            float f6 = (float) degrees;
            float f7 = 90.0f - f6;
            if (f7 < 0.0f) {
                f7 += 360.0f;
            }
            if (C7161e.this.f19842a != null) {
                C7161e.this.f19842a.mo21067a(f6, f7);
            }
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                System.arraycopy(sensorEvent.values, 0, this.f19851a, 0, 3);
                float[] fArr = sensorEvent.values;
                this.f19855e = (this.f19855e * 0.8f) + (0.19999999f * fArr[2]);
                float maximumRange = (fArr[2] - this.f19855e) / (C7161e.this.f19845d.getMaximumRange() / 2.0f);
                if (C7161e.this.f19842a != null) {
                    C7161e.this.f19842a.mo21066a(maximumRange);
                }
                if (SensorManager.getRotationMatrix(this.f19854d, (float[]) null, this.f19851a, this.f19852b)) {
                    SensorManager.getOrientation(this.f19854d, this.f19853c);
                    m26982a(((((float) Math.round(Math.toDegrees((double) this.f19853c[0]) * 2.0d)) / 2.0f) + 360.0f) % 360.0f, C7161e.this.f19849h);
                }
            } else if (type == 2) {
                System.arraycopy(sensorEvent.values, 0, this.f19852b, 0, 3);
            }
        }
    }

    public C7161e(Context context) {
        this.f19844c = null;
        this.f19847f = 30;
        this.f19848g = new float[30];
        this.f19849h = 0.0f;
        this.f19850i = 1;
        this.f19844c = new C7163b();
        this.f19843b = (SensorManager) context.getSystemService("sensor");
        this.f19845d = this.f19843b.getDefaultSensor(1);
        this.f19846e = this.f19843b.getDefaultSensor(2);
    }

    /* renamed from: a */
    public void mo21272a() {
        this.f19843b.registerListener(this.f19844c, this.f19846e, 0);
        this.f19843b.registerListener(this.f19844c, this.f19845d, 1);
    }

    /* renamed from: a */
    public void mo21273a(float f) {
        this.f19849h = f;
    }

    /* renamed from: a */
    public void mo21274a(C7162a aVar) {
        this.f19842a = aVar;
    }

    /* renamed from: b */
    public void mo21275b() {
        this.f19843b.unregisterListener(this.f19844c);
    }

    /* renamed from: c */
    public void mo21276c() {
        this.f19842a = null;
        this.f19844c = null;
    }
}
