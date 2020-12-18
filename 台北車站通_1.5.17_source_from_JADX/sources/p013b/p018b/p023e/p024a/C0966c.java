package p013b.p018b.p023e.p024a;

import android.graphics.drawable.Drawable;

/* renamed from: b.b.e.a.c */
class C0966c implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ C0967d f3791a;

    C0966c(C0967d dVar) {
        this.f3791a = dVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f3791a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f3791a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3791a.unscheduleSelf(runnable);
    }
}
