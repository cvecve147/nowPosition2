package p101d.p129g.p159f.p163b.p164a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.p077a.C4119l;
import com.journeyapps.barcodescanner.p077a.C4121m;

/* renamed from: d.g.f.b.a.b */
public final class C5755b implements SensorEventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4119l f15905a;

    /* renamed from: b */
    private C4121m f15906b;

    /* renamed from: c */
    private Sensor f15907c;

    /* renamed from: d */
    private Context f15908d;

    /* renamed from: e */
    private Handler f15909e = new Handler();

    public C5755b(Context context, C4119l lVar, C4121m mVar) {
        this.f15908d = context;
        this.f15905a = lVar;
        this.f15906b = mVar;
    }

    /* renamed from: a */
    private void m21758a(boolean z) {
        this.f15909e.post(new C5752a(this, z));
    }

    /* renamed from: a */
    public void mo15347a() {
        if (this.f15906b.mo11650d()) {
            SensorManager sensorManager = (SensorManager) this.f15908d.getSystemService("sensor");
            this.f15907c = sensorManager.getDefaultSensor(5);
            Sensor sensor = this.f15907c;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 3);
            }
        }
    }

    /* renamed from: b */
    public void mo15348b() {
        if (this.f15907c != null) {
            ((SensorManager) this.f15908d.getSystemService("sensor")).unregisterListener(this);
            this.f15907c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f15905a == null) {
            return;
        }
        if (f <= 45.0f) {
            m21758a(true);
        } else if (f >= 450.0f) {
            m21758a(false);
        }
    }
}
