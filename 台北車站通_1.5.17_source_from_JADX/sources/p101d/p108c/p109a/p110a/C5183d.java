package p101d.p108c.p109a.p110a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* renamed from: d.c.a.a.d */
public class C5183d {
    /* renamed from: a */
    public static void m20054a(Drawable drawable, int i) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        }
    }
}
