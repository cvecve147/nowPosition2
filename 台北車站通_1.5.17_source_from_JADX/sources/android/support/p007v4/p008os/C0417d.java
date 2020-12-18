package android.support.p007v4.p008os;

import android.os.Build;
import android.os.Trace;

/* renamed from: android.support.v4.os.d */
public final class C0417d {
    /* renamed from: a */
    public static void m1971a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m1972a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
