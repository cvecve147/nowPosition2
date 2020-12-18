package p101d.p111d.p112a;

import android.support.p007v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: d.d.a.c */
class C5238c implements View.OnTouchListener {

    /* renamed from: a */
    private boolean f14795a;

    C5238c() {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14795a || motionEvent.getActionMasked() != 0) {
            C5242d.m20249b((ViewPager) view, motionEvent);
            return true;
        }
        this.f14795a = true;
        view.dispatchTouchEvent(motionEvent);
        this.f14795a = false;
        return true;
    }
}
