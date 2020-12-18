package com.openlife.checkme.checkme_special.splash;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.checkme_special.splash.SpSplashFragment;
import com.openlife.checkme.p100ui.LoadingView;

public class SpSplashFragment_ViewBinding<T extends SpSplashFragment> implements Unbinder {

    /* renamed from: a */
    protected T f14101a;

    public SpSplashFragment_ViewBinding(T t, View view) {
        this.f14101a = t;
        t.background = (ConstraintLayout) C1153c.m5853c(view, C4956g.background, "field 'background'", ConstraintLayout.class);
        t.loadingView = (LoadingView) C1153c.m5853c(view, C4956g.loadingView, "field 'loadingView'", LoadingView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14101a;
        if (t != null) {
            t.background = null;
            t.loadingView = null;
            this.f14101a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
