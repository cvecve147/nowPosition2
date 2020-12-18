package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011v7.app.C0625o;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.rb */
public class C0884rb extends Resources {

    /* renamed from: a */
    private final WeakReference<Context> f3633a;

    public C0884rb(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3633a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m5059a() {
        return C0625o.m3077g() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo4688a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f3633a.get();
        return context != null ? C0871p.m4995a().mo4626a(context, this, i) : super.getDrawable(i);
    }
}
