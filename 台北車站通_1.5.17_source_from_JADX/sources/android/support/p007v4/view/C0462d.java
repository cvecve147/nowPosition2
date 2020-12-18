package android.support.p007v4.view;

import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.p009a.C0446b;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.d */
class C0462d extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C0459c f1786a;

    /* renamed from: b */
    final /* synthetic */ C0459c.C0461b f1787b;

    C0462d(C0459c.C0461b bVar, C0459c cVar) {
        this.f1787b = bVar;
        this.f1786a = cVar;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1786a.mo1920a(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1786a.mo832b(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1786a.mo309a(view, C0446b.m2087a(accessibilityNodeInfo));
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1786a.mo833c(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1786a.mo1921a(viewGroup, view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.f1786a.mo1919a(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1786a.mo1922d(view, accessibilityEvent);
    }
}
