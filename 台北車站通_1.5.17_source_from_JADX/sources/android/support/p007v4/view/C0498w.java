package android.support.p007v4.view;

import android.support.p007v4.view.C0487v;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.w */
class C0498w implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C0482q f1816a;

    /* renamed from: b */
    final /* synthetic */ C0487v.C0493f f1817b;

    C0498w(C0487v.C0493f fVar, C0482q qVar) {
        this.f1817b = fVar;
        this.f1816a = qVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) C0434L.m2017a(this.f1816a.mo357a(view, C0434L.m2016a((Object) windowInsets)));
    }
}
