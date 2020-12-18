package p013b.p018b.p040i.p050h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p013b.p018b.p040i.p041a.C1111i;

/* renamed from: b.b.i.h.d */
public class C1139d extends ContextWrapper {

    /* renamed from: a */
    private int f4132a;

    /* renamed from: b */
    private Resources.Theme f4133b;

    /* renamed from: c */
    private LayoutInflater f4134c;

    /* renamed from: d */
    private Configuration f4135d;

    /* renamed from: e */
    private Resources f4136e;

    public C1139d() {
        super((Context) null);
    }

    public C1139d(Context context, int i) {
        super(context);
        this.f4132a = i;
    }

    public C1139d(Context context, Resources.Theme theme) {
        super(context);
        this.f4133b = theme;
    }

    /* renamed from: b */
    private Resources m5790b() {
        Resources resources;
        if (this.f4136e == null) {
            Configuration configuration = this.f4135d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f4136e = resources;
        }
        return this.f4136e;
    }

    /* renamed from: c */
    private void m5791c() {
        boolean z = this.f4133b == null;
        if (z) {
            this.f4133b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4133b.setTo(theme);
            }
        }
        mo5318a(this.f4133b, this.f4132a, z);
    }

    /* renamed from: a */
    public int mo5317a() {
        return this.f4132a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5318a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m5790b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4134c == null) {
            this.f4134c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4134c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f4133b;
        if (theme != null) {
            return theme;
        }
        if (this.f4132a == 0) {
            this.f4132a = C1111i.Theme_AppCompat_Light;
        }
        m5791c();
        return this.f4133b;
    }

    public void setTheme(int i) {
        if (this.f4132a != i) {
            this.f4132a = i;
            m5791c();
        }
    }
}
