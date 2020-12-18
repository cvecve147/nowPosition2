package p013b.p018b.p040i.p050h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1104b;
import p013b.p018b.p040i.p041a.C1106d;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: b.b.i.h.a */
public class C1135a {

    /* renamed from: a */
    private Context f4129a;

    private C1135a(Context context) {
        this.f4129a = context;
    }

    /* renamed from: a */
    public static C1135a m5761a(Context context) {
        return new C1135a(context);
    }

    /* renamed from: a */
    public boolean mo5307a() {
        return this.f4129a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int mo5308b() {
        return this.f4129a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo5309c() {
        Configuration configuration = this.f4129a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int mo5310d() {
        return this.f4129a.getResources().getDimensionPixelSize(C1106d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo5311e() {
        TypedArray obtainStyledAttributes = this.f4129a.obtainStyledAttributes((AttributeSet) null, C1112j.ActionBar, C1103a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1112j.ActionBar_height, 0);
        Resources resources = this.f4129a.getResources();
        if (!mo5312f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1106d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo5312f() {
        return this.f4129a.getResources().getBoolean(C1104b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo5313g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f4129a).hasPermanentMenuKey();
    }
}
