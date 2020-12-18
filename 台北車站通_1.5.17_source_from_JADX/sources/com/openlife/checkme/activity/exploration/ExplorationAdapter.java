package com.openlife.checkme.activity.exploration;

import android.support.p011v7.widget.CardView;
import android.support.p011v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
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
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4758s;
import com.openlife.checkme.net.model.MapData;
import com.openlife.checkme.p093c.C4883m;

public class ExplorationAdapter extends C4758s<MapData> {

    /* renamed from: q */
    double f13276q;

    /* renamed from: r */
    double f13277r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4547a f13278s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4549c f13279t;

    public class ViewHolder extends C4194p {
        TextView address;
        TextView distance;
        ImageView icon;
        CardView infoLayout;
        TextView phone;
        TextView point;
        TextView pointTitle;
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13281a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f13281a = t;
            t.infoLayout = (CardView) C1153c.m5853c(view, C4956g.info_layout, "field 'infoLayout'", CardView.class);
            t.icon = (ImageView) C1153c.m5853c(view, C4956g.icon, "field 'icon'", ImageView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.phone = (TextView) C1153c.m5853c(view, C4956g.phone, "field 'phone'", TextView.class);
            t.address = (TextView) C1153c.m5853c(view, C4956g.address, "field 'address'", TextView.class);
            t.distance = (TextView) C1153c.m5853c(view, C4956g.distance, "field 'distance'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
            t.pointTitle = (TextView) C1153c.m5853c(view, C4956g.point_title, "field 'pointTitle'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13281a;
            if (t != null) {
                t.infoLayout = null;
                t.icon = null;
                t.title = null;
                t.phone = null;
                t.address = null;
                t.distance = null;
                t.point = null;
                t.pointTitle = null;
                this.f13281a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.exploration.ExplorationAdapter$a */
    public interface C4547a {
        /* renamed from: a */
        void mo12737a(MapData mapData);
    }

    /* renamed from: com.openlife.checkme.activity.exploration.ExplorationAdapter$b */
    class C4548b implements View.OnClickListener {

        /* renamed from: a */
        MapData f13282a;

        public C4548b(MapData mapData) {
            this.f13282a = mapData;
        }

        public void onClick(View view) {
            if (ExplorationAdapter.this.f13278s != null) {
                ExplorationAdapter.this.f13278s.mo12737a(this.f13282a);
            }
        }
    }

    /* renamed from: com.openlife.checkme.activity.exploration.ExplorationAdapter$c */
    public interface C4549c {
        /* renamed from: a */
        void mo12739a(String str);
    }

    /* renamed from: com.openlife.checkme.activity.exploration.ExplorationAdapter$d */
    class C4550d implements View.OnClickListener {

        /* renamed from: a */
        String f13284a;

        public C4550d(String str) {
            this.f13284a = str;
        }

        public void onClick(View view) {
            if (ExplorationAdapter.this.f13279t != null) {
                ExplorationAdapter.this.f13279t.mo12739a(this.f13284a);
            }
        }
    }

    /* renamed from: a */
    public void mo12734a(double d, double d2) {
        this.f13276q = d;
        this.f13277r = d2;
    }

    /* renamed from: a */
    public void mo12735a(C4547a aVar) {
        this.f13278s = aVar;
    }

    /* renamed from: a */
    public void mo12736a(C4549c cVar) {
        this.f13279t = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.C0778w mo12612b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_exploration_item_cm, viewGroup, false);
        this.f13713o = viewGroup.getContext();
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12614c(RecyclerView.C0778w wVar, int i) {
        if (mo344b(i) == 0) {
            ViewHolder viewHolder = (ViewHolder) wVar;
            MapData mapData = (MapData) this.f13714p.get(i);
            ImageLoader.getInstance().displayImage(mapData.getCorpImage(), viewHolder.icon, C4452a.f13122b);
            viewHolder.title.setText(this.f13713o.getString(C4961l.exploration_storetitle, new Object[]{mapData.getCorpName(), mapData.getSiteName()}));
            viewHolder.address.setText(mapData.getAddress());
            SpannableString spannableString = new SpannableString(mapData.getTelephone());
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            viewHolder.phone.setText(spannableString);
            viewHolder.distance.setText(C4883m.m19220a(this.f13713o, mapData.getDistance()));
            viewHolder.pointTitle.setVisibility(0);
            viewHolder.point.setVisibility(0);
            viewHolder.point.setText(mapData.getPointStr());
            viewHolder.infoLayout.setOnClickListener(new C4548b(mapData));
            viewHolder.phone.setOnClickListener(new C4550d(mapData.getTelephone()));
        }
    }
}
