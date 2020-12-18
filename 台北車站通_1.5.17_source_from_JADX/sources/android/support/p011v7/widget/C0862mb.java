package android.support.p011v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.mb */
public class C0862mb {
    /* renamed from: a */
    public static void m4963a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0877pb.m5030a(view, charSequence);
        }
    }
}
