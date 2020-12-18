package android.support.p007v4.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: android.support.v4.widget.k */
class C0552k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f2066a;

    C0552k(DrawerLayout drawerLayout) {
        this.f2066a = drawerLayout;
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((DrawerLayout) view).mo2065a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
