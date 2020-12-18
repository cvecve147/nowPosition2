package butterknife.p051a;

import android.view.View;

/* renamed from: butterknife.a.b */
public abstract class C1152b implements View.OnClickListener {

    /* renamed from: a */
    static boolean f4215a = true;

    /* renamed from: b */
    private static final Runnable f4216b = new C1151a();

    /* renamed from: a */
    public abstract void mo5377a(View view);

    public final void onClick(View view) {
        if (f4215a) {
            f4215a = false;
            view.post(f4216b);
            mo5377a(view);
        }
    }
}
