package p101d.p111d.p112a.p116c;

import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: d.d.a.c.a */
public class C5239a {

    /* renamed from: a */
    private final Interpolator f14796a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    private boolean f14797b = true;

    /* renamed from: c */
    private float f14798c;

    /* renamed from: d */
    private float f14799d;

    /* renamed from: e */
    private float f14800e;

    /* renamed from: f */
    private long f14801f;

    /* renamed from: g */
    private long f14802g = 250;

    /* renamed from: a */
    private static float m20227a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void mo14503a(float f, float f2) {
        this.f14797b = false;
        this.f14801f = SystemClock.elapsedRealtime();
        this.f14798c = f;
        this.f14799d = f2;
        this.f14800e = f;
    }

    /* renamed from: a */
    public void mo14504a(long j) {
        this.f14802g = j;
    }

    /* renamed from: a */
    public boolean mo14505a() {
        if (this.f14797b) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f14801f;
        long j = this.f14802g;
        if (elapsedRealtime >= j) {
            this.f14797b = true;
            this.f14800e = this.f14799d;
            return false;
        }
        this.f14800e = m20227a(this.f14798c, this.f14799d, this.f14796a.getInterpolation(((float) elapsedRealtime) / ((float) j)));
        return true;
    }

    /* renamed from: b */
    public void mo14506b() {
        this.f14797b = true;
    }

    /* renamed from: c */
    public float mo14507c() {
        return this.f14800e;
    }

    /* renamed from: d */
    public boolean mo14508d() {
        return this.f14797b;
    }
}
