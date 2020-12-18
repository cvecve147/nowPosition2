package com.openlife.checkme.activity.account.redemption;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.account.redemption.RedemptionFragment;

public class RedemptionFragment_ViewBinding<T extends RedemptionFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13202a;

    public RedemptionFragment_ViewBinding(T t, View view) {
        this.f13202a = t;
        t.recyclerView = (UltimateRecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'recyclerView'", UltimateRecyclerView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13202a;
        if (t != null) {
            t.recyclerView = null;
            this.f13202a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
