package p101d.p111d.p112a.p114b;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: d.d.a.b.f */
public class C5235f {
    /* renamed from: a */
    public static float m20219a(Context context, float f) {
        return m20220a(context, 1, f);
    }

    /* renamed from: a */
    public static float m20220a(Context context, int i, float f) {
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }
}
