package android.support.p011v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.bb */
public class C0818bb extends ContextWrapper {

    /* renamed from: a */
    private static final Object f3384a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0818bb>> f3385b;

    /* renamed from: c */
    private final Resources f3386c;

    /* renamed from: d */
    private final Resources.Theme f3387d;

    private C0818bb(Context context) {
        super(context);
        if (C0884rb.m5059a()) {
            this.f3386c = new C0884rb(this, context.getResources());
            this.f3387d = this.f3386c.newTheme();
            this.f3387d.setTo(context.getTheme());
            return;
        }
        this.f3386c = new C0824db(this, context.getResources());
        this.f3387d = null;
    }

    /* renamed from: a */
    public static Context m4769a(Context context) {
        if (!m4770b(context)) {
            return context;
        }
        synchronized (f3384a) {
            if (f3385b == null) {
                f3385b = new ArrayList<>();
            } else {
                for (int size = f3385b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f3385b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3385b.remove(size);
                    }
                }
                for (int size2 = f3385b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f3385b.get(size2);
                    C0818bb bbVar = weakReference2 != null ? (C0818bb) weakReference2.get() : null;
                    if (bbVar != null && bbVar.getBaseContext() == context) {
                        return bbVar;
                    }
                }
            }
            C0818bb bbVar2 = new C0818bb(context);
            f3385b.add(new WeakReference(bbVar2));
            return bbVar2;
        }
    }

    /* renamed from: b */
    private static boolean m4770b(Context context) {
        if ((context instanceof C0818bb) || (context.getResources() instanceof C0824db) || (context.getResources() instanceof C0884rb)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0884rb.m5059a();
    }

    public AssetManager getAssets() {
        return this.f3386c.getAssets();
    }

    public Resources getResources() {
        return this.f3386c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3387d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f3387d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
