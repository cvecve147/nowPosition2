package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.db */
class C0824db extends C0729La {

    /* renamed from: b */
    private final WeakReference<Context> f3402b;

    public C0824db(Context context, Resources resources) {
        super(resources);
        this.f3402b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f3402b.get();
        if (!(drawable == null || context == null)) {
            C0871p.m4995a();
            C0871p.m5001a(context, i, drawable);
        }
        return drawable;
    }
}
