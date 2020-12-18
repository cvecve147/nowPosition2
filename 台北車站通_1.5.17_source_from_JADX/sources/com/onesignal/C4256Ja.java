package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.onesignal.Ja */
class C4256Ja {

    /* renamed from: a */
    private static final int f12632a = m16901a(24);

    /* renamed from: a */
    static int m16901a(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: a */
    static int m16902a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? m16907d(activity) : i >= 21 ? m16908e(activity) : m16906c(activity);
    }

    /* renamed from: a */
    static void m16903a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(runnable);
    }

    /* renamed from: a */
    static boolean m16904a(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        return view != null && displayMetrics.heightPixels - rect.bottom > f12632a;
    }

    /* renamed from: b */
    static int m16905b(Activity activity) {
        return m16909f(activity).width();
    }

    /* renamed from: c */
    private static int m16906c(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    @TargetApi(23)
    /* renamed from: d */
    private static int m16907d(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        return (decorView.getHeight() - decorView.getRootWindowInsets().getStableInsetBottom()) - decorView.getRootWindowInsets().getStableInsetTop();
    }

    /* renamed from: e */
    private static int m16908e(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? m16909f(activity).height() : m16906c(activity);
    }

    /* renamed from: f */
    private static Rect m16909f(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }
}
