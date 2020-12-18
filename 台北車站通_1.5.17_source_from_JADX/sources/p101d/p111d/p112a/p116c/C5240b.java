package p101d.p111d.p112a.p116c;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Gravity;
import p101d.p111d.p112a.C5244e;
import p101d.p111d.p112a.C5246f;

/* renamed from: d.d.a.c.b */
public class C5240b {

    /* renamed from: a */
    private static final Matrix f14803a = new Matrix();

    /* renamed from: b */
    private static final RectF f14804b = new RectF();

    /* renamed from: c */
    private static final Rect f14805c = new Rect();

    /* renamed from: d */
    private static final Rect f14806d = new Rect();

    /* renamed from: a */
    public static void m20234a(Matrix matrix, C5244e eVar, Rect rect) {
        f14804b.set(0.0f, 0.0f, (float) eVar.mo14527h(), (float) eVar.mo14526g());
        matrix.mapRect(f14804b);
        int round = Math.round(f14804b.width());
        int round2 = Math.round(f14804b.height());
        f14805c.set(0, 0, eVar.mo14535p(), eVar.mo14534o());
        Gravity.apply(eVar.mo14525f(), round, round2, f14805c, rect);
    }

    /* renamed from: a */
    public static void m20235a(C5244e eVar, Point point) {
        m20236a(eVar, f14806d);
        Gravity.apply(eVar.mo14525f(), 0, 0, f14806d, f14805c);
        Rect rect = f14805c;
        point.set(rect.left, rect.top);
    }

    /* renamed from: a */
    public static void m20236a(C5244e eVar, Rect rect) {
        f14805c.set(0, 0, eVar.mo14535p(), eVar.mo14534o());
        Gravity.apply(eVar.mo14525f(), eVar.mo14530k(), eVar.mo14529j(), f14805c, rect);
    }

    /* renamed from: a */
    public static void m20237a(C5246f fVar, C5244e eVar, Rect rect) {
        fVar.mo14549a(f14803a);
        m20234a(f14803a, eVar, rect);
    }
}
