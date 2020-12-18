package android.support.p007v4.view;

import android.os.Bundle;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p007v4.view.p009a.C0450c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.b */
class C0452b extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C0459c f1774a;

    /* renamed from: b */
    final /* synthetic */ C0459c.C0460a f1775b;

    C0452b(C0459c.C0460a aVar, C0459c cVar) {
        this.f1775b = aVar;
        this.f1774a = cVar;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1774a.mo1920a(view, accessibilityEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0450c a = this.f1774a.mo1917a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.mo1905a();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1774a.mo832b(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1774a.mo309a(view, C0446b.m2087a(accessibilityNodeInfo));
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1774a.mo833c(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1774a.mo1921a(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f1774a.mo1844a(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.f1774a.mo1919a(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1774a.mo1922d(view, accessibilityEvent);
    }
}
