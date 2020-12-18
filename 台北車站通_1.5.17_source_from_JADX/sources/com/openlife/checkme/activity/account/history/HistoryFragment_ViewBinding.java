package com.openlife.checkme.activity.account.history;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.account.history.HistoryFragment;

public class HistoryFragment_ViewBinding<T extends HistoryFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13169a;

    public HistoryFragment_ViewBinding(T t, View view) {
        this.f13169a = t;
        t.recyclerView = (UltimateRecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'recyclerView'", UltimateRecyclerView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13169a;
        if (t != null) {
            t.recyclerView = null;
            this.f13169a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
