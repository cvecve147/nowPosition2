package com.openlife.checkme.activity.gift.list;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.openlife.checkme.C4961l;
import com.openlife.checkme.net.model.GiftData;
import java.util.ArrayList;
import java.util.List;

public class GiftListAdapter extends RecyclerView.C0748a<RecyclerView.C0778w> {

    /* renamed from: c */
    int f13359c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4588a f13360d;

    /* renamed from: e */
    private List<GiftData> f13361e = new ArrayList();

    /* renamed from: f */
    private Context f13362f;

    public class GridViewHolder extends C4194p {
        ImageView cover;
        TextView last;
        View mask;
        ImageView maskiCon;
        TextView point;
        TextView title;

        public GridViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class GridViewHolder_ViewBinding<T extends GridViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13364a;

        public GridViewHolder_ViewBinding(T t, View view) {
            this.f13364a = t;
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
            t.last = (TextView) C1153c.m5853c(view, C4956g.last, "field 'last'", TextView.class);
            t.mask = C1153c.m5849a(view, C4956g.mask, "field 'mask'");
            t.maskiCon = (ImageView) C1153c.m5853c(view, C4956g.mask_icon, "field 'maskiCon'", ImageView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13364a;
            if (t != null) {
                t.title = null;
                t.cover = null;
                t.point = null;
                t.last = null;
                t.mask = null;
                t.maskiCon = null;
                this.f13364a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ListViewHolder extends C4194p {
        ImageView cover;
        TextView last;
        View mask;
        ImageView maskiCon;
        TextView point;
        TextView title;

        public ListViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ListViewHolder_ViewBinding<T extends ListViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13366a;

        public ListViewHolder_ViewBinding(T t, View view) {
            this.f13366a = t;
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.last = (TextView) C1153c.m5853c(view, C4956g.last, "field 'last'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
            t.mask = C1153c.m5849a(view, C4956g.mask, "field 'mask'");
            t.maskiCon = (ImageView) C1153c.m5853c(view, C4956g.mask_icon, "field 'maskiCon'", ImageView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13366a;
            if (t != null) {
                t.cover = null;
                t.title = null;
                t.last = null;
                t.point = null;
                t.mask = null;
                t.maskiCon = null;
                this.f13366a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.gift.list.GiftListAdapter$a */
    public interface C4588a {
        /* renamed from: a */
        void mo12807a(int i);
    }

    /* renamed from: com.openlife.checkme.activity.gift.list.GiftListAdapter$b */
    private class C4589b implements View.OnClickListener {

        /* renamed from: a */
        int f13367a;

        public C4589b(int i) {
            this.f13367a = i;
        }

        public void onClick(View view) {
            if (GiftListAdapter.this.f13360d != null) {
                GiftListAdapter.this.f13360d.mo12807a(this.f13367a);
            }
        }
    }

    public GiftListAdapter(Context context, int i) {
        this.f13359c = i;
        this.f13362f = context;
    }

    /* renamed from: a */
    private void m18116a(GridViewHolder gridViewHolder, GiftData giftData) {
        ImageLoader.getInstance().displayImage(giftData.getGridImage(), gridViewHolder.cover, C4452a.m17659a(C4959j.default_gift));
        gridViewHolder.title.setText(giftData.getName());
        gridViewHolder.point.setText(giftData.getPointStr());
        gridViewHolder.last.setText(this.f13362f.getString(C4961l.gift_last, new Object[]{giftData.getStockStr()}));
        if (giftData.getStatus() == 1) {
            gridViewHolder.mask.setVisibility(8);
        } else {
            gridViewHolder.mask.setVisibility(0);
        }
        gridViewHolder.mo11858z().setOnClickListener(new C4589b(giftData.getId()));
    }

    /* renamed from: a */
    private void m18117a(ListViewHolder listViewHolder, GiftData giftData) {
        ImageLoader.getInstance().displayImage(giftData.getListImage(), listViewHolder.cover, C4452a.m17659a(C4959j.default_gift));
        listViewHolder.title.setText(giftData.getName());
        listViewHolder.point.setText(giftData.getPointStr());
        listViewHolder.last.setText(this.f13362f.getString(C4961l.gift_last, new Object[]{giftData.getStockStr()}));
        if (giftData.getStatus() == 1) {
            listViewHolder.mask.setVisibility(8);
            listViewHolder.mo11858z().setOnClickListener(new C4589b(giftData.getId()));
            return;
        }
        listViewHolder.mask.setVisibility(0);
    }

    /* renamed from: a */
    public int mo337a() {
        return this.f13361e.size();
    }

    /* renamed from: a */
    public void mo12804a(C4588a aVar) {
        this.f13360d = aVar;
    }

    /* renamed from: a */
    public void mo12805a(List<GiftData> list) {
        this.f13361e = list;
    }

    /* renamed from: b */
    public int mo344b(int i) {
        return this.f13359c;
    }

    /* renamed from: b */
    public RecyclerView.C0778w mo345b(ViewGroup viewGroup, int i) {
        if (i == 22) {
            return new ListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_gift_list_item_cm, viewGroup, false));
        }
        if (i != 23) {
            return null;
        }
        return new GridViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_gift_grid_item_cm, viewGroup, false));
    }

    /* renamed from: b */
    public void mo346b(RecyclerView.C0778w wVar, int i) {
        int i2 = this.f13359c;
        if (i2 == 22) {
            m18117a((ListViewHolder) wVar, this.f13361e.get(i));
        } else if (i2 == 23) {
            m18116a((GridViewHolder) wVar, this.f13361e.get(i));
        }
    }

    /* renamed from: d */
    public int mo12806d() {
        return this.f13359c;
    }
}
