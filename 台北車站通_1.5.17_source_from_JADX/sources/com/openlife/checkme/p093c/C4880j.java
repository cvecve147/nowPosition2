package com.openlife.checkme.p093c;

import android.content.res.Resources;
import android.os.Build;
import com.openlife.checkme.p094d.C4947j;

/* renamed from: com.openlife.checkme.c.j */
public class C4880j extends Resources {

    /* renamed from: a */
    private C4947j f13968a;

    public C4880j(Resources resources, C4947j jVar) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f13968a = jVar;
    }

    public int getColor(int i) {
        return getColor(i, (Resources.Theme) null);
    }

    public int getColor(int i, Resources.Theme theme) {
        int f = this.f13968a.mo13554e().mo13536f();
        return "cyan" == getResourceEntryName(i) ? Build.VERSION.SDK_INT >= 23 ? super.getColor(f, theme) : super.getColor(f) : Build.VERSION.SDK_INT >= 23 ? super.getColor(i, theme) : super.getColor(i);
    }
}
