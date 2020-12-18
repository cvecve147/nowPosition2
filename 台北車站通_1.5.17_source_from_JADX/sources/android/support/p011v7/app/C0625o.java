package android.support.p011v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.p011v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.app.o */
public abstract class C0625o {

    /* renamed from: a */
    private static int f2347a = -1;

    /* renamed from: b */
    private static boolean f2348b = false;

    C0625o() {
    }

    /* renamed from: a */
    public static C0625o m3072a(Activity activity, C0624n nVar) {
        return m3074a(activity, activity.getWindow(), nVar);
    }

    /* renamed from: a */
    public static C0625o m3073a(Dialog dialog, C0624n nVar) {
        return m3074a(dialog.getContext(), dialog.getWindow(), nVar);
    }

    /* renamed from: a */
    private static C0625o m3074a(Context context, Window window, C0624n nVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? new C0629r(context, window, nVar) : i >= 23 ? new C0635u(context, window, nVar) : new C0631s(context, window, nVar);
    }

    /* renamed from: a */
    public static void m3075a(boolean z) {
        f2348b = z;
    }

    /* renamed from: b */
    public static int m3076b() {
        return f2347a;
    }

    /* renamed from: g */
    public static boolean m3077g() {
        return f2348b;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo2444a(int i);

    /* renamed from: a */
    public abstract void mo2448a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo2449a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo2451a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo2452a(View view);

    /* renamed from: a */
    public abstract void mo2453a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo2637a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo2638a();

    /* renamed from: b */
    public abstract void mo2461b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo2463b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo2465b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo2639c();

    /* renamed from: c */
    public abstract void mo2467c(int i);

    /* renamed from: c */
    public abstract void mo2640c(Bundle bundle);

    /* renamed from: d */
    public abstract C0607a mo2641d();

    /* renamed from: e */
    public abstract void mo2470e();

    /* renamed from: f */
    public abstract void mo2473f();

    /* renamed from: h */
    public abstract void mo2474h();

    /* renamed from: i */
    public abstract void mo2475i();

    /* renamed from: j */
    public abstract void mo2642j();

    /* renamed from: k */
    public abstract void mo2476k();
}
