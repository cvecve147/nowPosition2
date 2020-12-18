package com.openlife.checkme.checkme_special.mission;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.checkme_special.mission.SpMissionListFragment;

public class SpMissionListFragment_ViewBinding<T extends SpMissionListFragment> implements Unbinder {

    /* renamed from: a */
    protected T f14082a;

    public SpMissionListFragment_ViewBinding(T t, View view) {
        this.f14082a = t;
        t.mRecyclerView = (UltimateRecyclerView) C1153c.m5853c(view, C4956g.ultimate_rv, "field 'mRecyclerView'", UltimateRecyclerView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14082a;
        if (t != null) {
            t.mRecyclerView = null;
            this.f14082a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
