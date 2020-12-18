package com.openlife.checkme.checkme_special.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.checkme_special.home.SpMainFragment;

public class SpMainFragment_ViewBinding<T extends SpMainFragment> implements Unbinder {

    /* renamed from: a */
    protected T f14033a;

    public SpMainFragment_ViewBinding(T t, View view) {
        this.f14033a = t;
        t.mRecyclerView = (UltimateRecyclerView) C1153c.m5853c(view, C4956g.Ultimate_rv, "field 'mRecyclerView'", UltimateRecyclerView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14033a;
        if (t != null) {
            t.mRecyclerView = null;
            this.f14033a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
