package android.support.p007v4.view.p009a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.d */
public class C0451d {
    /* renamed from: a */
    public static void m2141a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2142b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
