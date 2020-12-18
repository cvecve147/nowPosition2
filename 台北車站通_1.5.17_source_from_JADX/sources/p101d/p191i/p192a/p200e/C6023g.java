package p101d.p191i.p192a.p200e;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;

/* renamed from: d.i.a.e.g */
public class C6023g {
    /* renamed from: a */
    public static Point m22857a(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* renamed from: a */
    public static void m22858a(Context context, String str) {
        if (str != null) {
            m22859a(context, str, 1);
        }
    }

    /* renamed from: a */
    public static void m22859a(Context context, String str, int i) {
        new Handler(Looper.getMainLooper()).post(new C6022f(context, str, i));
    }
}
