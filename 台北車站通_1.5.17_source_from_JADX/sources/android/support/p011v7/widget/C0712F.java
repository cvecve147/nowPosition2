package android.support.p011v7.widget;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p013b.p018b.p028h.p029a.p030a.C1014d;

/* renamed from: android.support.v7.widget.F */
class C0712F extends C1014d.C1015a {

    /* renamed from: a */
    final /* synthetic */ WeakReference f2773a;

    /* renamed from: b */
    final /* synthetic */ C0714G f2774b;

    C0712F(C0714G g, WeakReference weakReference) {
        this.f2774b = g;
        this.f2773a = weakReference;
    }

    /* renamed from: a */
    public void mo3324a(int i) {
    }

    /* renamed from: a */
    public void mo3325a(Typeface typeface) {
        this.f2774b.m3581a((WeakReference<TextView>) this.f2773a, typeface);
    }
}
