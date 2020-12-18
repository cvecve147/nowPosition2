package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.pa */
class C0876pa {

    /* renamed from: a */
    boolean f3588a = true;

    /* renamed from: b */
    int f3589b;

    /* renamed from: c */
    int f3590c;

    /* renamed from: d */
    int f3591d;

    /* renamed from: e */
    int f3592e;

    /* renamed from: f */
    int f3593f = 0;

    /* renamed from: g */
    int f3594g = 0;

    /* renamed from: h */
    boolean f3595h;

    /* renamed from: i */
    boolean f3596i;

    C0876pa() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4632a(RecyclerView.C0769p pVar) {
        View d = pVar.mo3988d(this.f3590c);
        this.f3590c += this.f3591d;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4633a(RecyclerView.C0775t tVar) {
        int i = this.f3590c;
        return i >= 0 && i < tVar.mo4011a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3589b + ", mCurrentPosition=" + this.f3590c + ", mItemDirection=" + this.f3591d + ", mLayoutDirection=" + this.f3592e + ", mStartLine=" + this.f3593f + ", mEndLine=" + this.f3594g + '}';
    }
}
