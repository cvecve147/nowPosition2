package android.support.p007v4.view.p009a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
public final class C0445a {
    /* renamed from: a */
    public static int m2084a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2085a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
