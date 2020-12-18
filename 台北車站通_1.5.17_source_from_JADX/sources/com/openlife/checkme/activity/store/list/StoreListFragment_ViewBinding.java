package com.openlife.checkme.activity.store.list;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.store.list.StoreListFragment;

public class StoreListFragment_ViewBinding<T extends StoreListFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13856a;

    public StoreListFragment_ViewBinding(T t, View view) {
        this.f13856a = t;
        t.mRecyclerView = (RecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        t.emptyView = C1153c.m5849a(view, C4956g.empty_view, "field 'emptyView'");
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13856a;
        if (t != null) {
            t.mRecyclerView = null;
            t.emptyView = null;
            this.f13856a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
