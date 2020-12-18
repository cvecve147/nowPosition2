package com.openlife.checkme.activity.store.list;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.net.model.StoreData;
import com.openlife.checkme.p100ui.MissionListTagView;
import java.util.ArrayList;
import java.util.List;

public class StoreListAdapter extends RecyclerView.C0748a<RecyclerView.C0778w> {

    /* renamed from: c */
    int f13839c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4820a f13840d;

    /* renamed from: e */
    private Context f13841e;

    /* renamed from: f */
    private List<StoreData> f13842f = new ArrayList();

    public class GridViewHolder extends C4194p {
        ImageView cover;
        TextView point;
        LinearLayout tagLayout;
        TextView title;

        public GridViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class GridViewHolder_ViewBinding<T extends GridViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13844a;

        public GridViewHolder_ViewBinding(T t, View view) {
            this.f13844a = t;
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
            t.tagLayout = (LinearLayout) C1153c.m5853c(view, C4956g.tag_layout, "field 'tagLayout'", LinearLayout.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13844a;
            if (t != null) {
                t.title = null;
                t.cover = null;
                t.point = null;
                t.tagLayout = null;
                this.f13844a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class LargeListViewHolder extends C4194p {
        ImageView cover;
        TextView point;
        TextView title;

        public LargeListViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class LargeListViewHolder_ViewBinding<T extends LargeListViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13846a;

        public LargeListViewHolder_ViewBinding(T t, View view) {
            this.f13846a = t;
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13846a;
            if (t != null) {
                t.cover = null;
                t.title = null;
                t.point = null;
                this.f13846a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ListViewHolder extends C4194p {
        ImageView cover;
        TextView point;
        TextView title;

        public ListViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ListViewHolder_ViewBinding<T extends ListViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13848a;

        public ListViewHolder_ViewBinding(T t, View view) {
            this.f13848a = t;
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13848a;
            if (t != null) {
                t.cover = null;
                t.title = null;
                t.point = null;
                this.f13848a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.store.list.StoreListAdapter$a */
    public interface C4820a {
        /* renamed from: a */
        void mo13296a(int i);
    }

    /* renamed from: com.openlife.checkme.activity.store.list.StoreListAdapter$b */
    private class C4821b implements View.OnClickListener {

        /* renamed from: a */
        int f13849a;

        public C4821b(int i) {
            this.f13849a = i;
        }

        public void onClick(View view) {
            if (StoreListAdapter.this.f13840d != null) {
                StoreListAdapter.this.f13840d.mo13296a(this.f13849a);
            }
        }
    }

    public StoreListAdapter(Context context, int i) {
        this.f13841e = context;
        this.f13839c = i;
    }

    /* renamed from: a */
    private void m18970a(LinearLayout linearLayout, StoreData storeData) {
        linearLayout.removeAllViews();
        MissionListTagView[] missionListTagViewArr = new MissionListTagView[2];
        for (int i = 0; i < 2; i++) {
            if (storeData.getTag().size() > i) {
                missionListTagViewArr[i] = new MissionListTagView(this.f13841e, storeData.getTag().get(i).getTitle(), storeData.getTag().get(i).getColor());
            } else {
                missionListTagViewArr[i] = new MissionListTagView(this.f13841e);
            }
        }
        linearLayout.addView(missionListTagViewArr[1]);
        linearLayout.addView(missionListTagViewArr[0]);
    }

    /* renamed from: a */
    private void m18971a(GridViewHolder gridViewHolder, StoreData storeData) {
        ImageLoader.getInstance().displayImage(storeData.getGridImage(), gridViewHolder.cover, C4452a.m17659a(C4959j.default_activity));
        gridViewHolder.title.setText(storeData.getName());
        gridViewHolder.point.setText(storeData.getPointStr());
        gridViewHolder.mo11858z().setOnClickListener(new C4821b(storeData.getId()));
        m18970a(gridViewHolder.tagLayout, storeData);
    }

    /* renamed from: a */
    private void m18972a(LargeListViewHolder largeListViewHolder, StoreData storeData) {
        ImageLoader.getInstance().displayImage(storeData.getListLargeImage(), largeListViewHolder.cover, C4452a.m17659a(C4959j.default_activity));
        largeListViewHolder.title.setText(storeData.getName());
        largeListViewHolder.point.setText(storeData.getPointStr());
        largeListViewHolder.mo11858z().setOnClickListener(new C4821b(storeData.getId()));
    }

    /* renamed from: a */
    private void m18973a(ListViewHolder listViewHolder, StoreData storeData) {
        ImageLoader.getInstance().displayImage(storeData.getListImage(), listViewHolder.cover, C4452a.m17659a(C4959j.default_activity));
        listViewHolder.title.setText(storeData.getName());
        listViewHolder.point.setText(storeData.getPointStr());
        listViewHolder.mo11858z().setOnClickListener(new C4821b(storeData.getId()));
    }

    /* renamed from: a */
    public int mo337a() {
        return this.f13842f.size();
    }

    /* renamed from: a */
    public void mo13293a(C4820a aVar) {
        this.f13840d = aVar;
    }

    /* renamed from: a */
    public void mo13294a(List<StoreData> list) {
        this.f13842f = list;
    }

    /* renamed from: b */
    public int mo344b(int i) {
        return this.f13839c;
    }

    /* renamed from: b */
    public RecyclerView.C0778w mo345b(ViewGroup viewGroup, int i) {
        switch (i) {
            case 111:
                return new LargeListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_large_list_item_cm, viewGroup, false));
            case 112:
                return new ListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_store_list_item_cm, viewGroup, false));
            case 113:
                return new GridViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_grid_item_cm, viewGroup, false));
            default:
                return null;
        }
    }

    /* renamed from: b */
    public void mo346b(RecyclerView.C0778w wVar, int i) {
        switch (this.f13839c) {
            case 111:
                m18972a((LargeListViewHolder) wVar, this.f13842f.get(i));
                return;
            case 112:
                m18973a((ListViewHolder) wVar, this.f13842f.get(i));
                return;
            case 113:
                m18971a((GridViewHolder) wVar, this.f13842f.get(i));
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public int mo13295d() {
        return this.f13839c;
    }
}
