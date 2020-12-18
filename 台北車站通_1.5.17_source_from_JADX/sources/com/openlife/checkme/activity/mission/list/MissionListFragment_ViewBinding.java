package com.openlife.checkme.activity.mission.list;

import android.support.p007v4.widget.SwipeRefreshLayout;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.mission.list.MissionListFragment;

public class MissionListFragment_ViewBinding<T extends MissionListFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13665a;

    public MissionListFragment_ViewBinding(T t, View view) {
        this.f13665a = t;
        t.mSwipeRefreshLayout = (SwipeRefreshLayout) C1153c.m5853c(view, C4956g.swipe_refresh_layout, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
        t.mRecyclerView = (RecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13665a;
        if (t != null) {
            t.mSwipeRefreshLayout = null;
            t.mRecyclerView = null;
            this.f13665a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
