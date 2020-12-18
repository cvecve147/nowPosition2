package android.support.design.widget;

import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.p009a.C0446b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.design.widget.k */
class C0155k extends C0459c {

    /* renamed from: d */
    final /* synthetic */ CheckableImageButton f828d;

    C0155k(CheckableImageButton checkableImageButton) {
        this.f828d = checkableImageButton;
    }

    /* renamed from: a */
    public void mo309a(View view, C0446b bVar) {
        super.mo309a(view, bVar);
        bVar.mo1866b(true);
        bVar.mo1871c(this.f828d.isChecked());
    }

    /* renamed from: b */
    public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo832b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f828d.isChecked());
    }
}
