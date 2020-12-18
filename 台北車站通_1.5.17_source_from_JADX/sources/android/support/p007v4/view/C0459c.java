package android.support.p007v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p007v4.view.p009a.C0450c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.c */
public class C0459c {

    /* renamed from: a */
    private static final C0461b f1783a = (Build.VERSION.SDK_INT >= 16 ? new C0460a() : new C0461b());

    /* renamed from: b */
    private static final View.AccessibilityDelegate f1784b = new View.AccessibilityDelegate();

    /* renamed from: c */
    final View.AccessibilityDelegate f1785c = f1783a.mo1924a(this);

    /* renamed from: android.support.v4.view.c$a */
    static class C0460a extends C0461b {
        C0460a() {
        }

        /* renamed from: a */
        public C0450c mo1923a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0450c(accessibilityNodeProvider);
            }
            return null;
        }

        /* renamed from: a */
        public View.AccessibilityDelegate mo1924a(C0459c cVar) {
            return new C0452b(this, cVar);
        }

        /* renamed from: a */
        public boolean mo1925a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: android.support.v4.view.c$b */
    static class C0461b {
        C0461b() {
        }

        /* renamed from: a */
        public C0450c mo1923a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public View.AccessibilityDelegate mo1924a(C0459c cVar) {
            return new C0462d(this, cVar);
        }

        /* renamed from: a */
        public boolean mo1925a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: a */
    public C0450c mo1917a(View view) {
        return f1783a.mo1923a(f1784b, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo1918a() {
        return this.f1785c;
    }

    /* renamed from: a */
    public void mo1919a(View view, int i) {
        f1784b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo309a(View view, C0446b bVar) {
        f1784b.onInitializeAccessibilityNodeInfo(view, bVar.mo1903t());
    }

    /* renamed from: a */
    public boolean mo1844a(View view, int i, Bundle bundle) {
        return f1783a.mo1925a(f1784b, view, i, bundle);
    }

    /* renamed from: a */
    public boolean mo1920a(View view, AccessibilityEvent accessibilityEvent) {
        return f1784b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1921a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1784b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
        f1784b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo833c(View view, AccessibilityEvent accessibilityEvent) {
        f1784b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1922d(View view, AccessibilityEvent accessibilityEvent) {
        f1784b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
