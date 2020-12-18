package p101d.p111d.p112a.p114b.p115a;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: d.d.a.b.a.b */
public class C5230b extends ScaleGestureDetector {

    /* renamed from: a */
    private float f14759a;

    /* renamed from: b */
    private float f14760b;

    public C5230b(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener) {
        super(context, onScaleGestureListener);
        m20193b();
    }

    @TargetApi(19)
    /* renamed from: a */
    private boolean m20192a() {
        return Build.VERSION.SDK_INT >= 19 && isQuickScaleEnabled() && getCurrentSpan() == getCurrentSpanY();
    }

    /* renamed from: b */
    private void m20193b() {
        long currentTimeMillis = System.currentTimeMillis();
        MotionEvent obtain = MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, 0.0f, 0.0f, 0);
        onTouchEvent(obtain);
        obtain.recycle();
    }

    public float getScaleFactor() {
        float scaleFactor = super.getScaleFactor();
        if (!m20192a()) {
            return scaleFactor;
        }
        if ((this.f14759a <= this.f14760b || scaleFactor <= 1.0f) && (this.f14759a >= this.f14760b || scaleFactor >= 1.0f)) {
            return 1.0f;
        }
        return Math.max(0.8f, Math.min(scaleFactor, 1.25f));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f14760b = this.f14759a;
        this.f14759a = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.f14760b = motionEvent.getY();
        }
        return onTouchEvent;
    }
}
