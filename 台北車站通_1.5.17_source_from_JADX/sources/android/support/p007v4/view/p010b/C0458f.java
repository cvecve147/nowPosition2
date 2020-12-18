package android.support.p007v4.view.p010b;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.b.f */
public final class C0458f {
    /* renamed from: a */
    public static Interpolator m2143a(Path path) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(path) : new C0457e(path);
    }
}
