package com.openlife.checkme.checkme_special.mission;

import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.C4758s;
import com.openlife.checkme.net.model.PointHistoryData;
import java.util.List;
import p013b.p018b.p040i.p049g.C1128d;

public class SpMissionListAdapter extends C4758s<PointHistoryData> {

    public class ViewHolder extends C4194p {
        TextView point;
        TextView time;
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }

        /* renamed from: a */
        public void mo13458a(PointHistoryData pointHistoryData) {
            this.time.setText(pointHistoryData.getCreateTime());
            this.title.setText(pointHistoryData.getComment());
            this.point.setText(pointHistoryData.getPointStr());
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f14076a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f14076a = t;
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.time = (TextView) C1153c.m5853c(view, C4956g.time, "field 'time'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f14076a;
            if (t != null) {
                t.title = null;
                t.time = null;
                t.point = null;
                this.f14076a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.checkme_special.mission.SpMissionListAdapter$a */
    public class C4925a extends C1128d.C1129a {

        /* renamed from: a */
        private List<PointHistoryData> f14077a;

        /* renamed from: b */
        private List<PointHistoryData> f14078b;

        public C4925a(List<PointHistoryData> list, List<PointHistoryData> list2) {
            this.f14077a = list;
            this.f14078b = list2;
        }

        /* renamed from: a */
        public int mo5300a() {
            return this.f14078b.size();
        }

        /* renamed from: a */
        public boolean mo5301a(int i, int i2) {
            return this.f14077a.get(i).equals(this.f14078b.get(i2));
        }

        /* renamed from: b */
        public int mo5302b() {
            return this.f14077a.size();
        }

        /* renamed from: b */
        public boolean mo5303b(int i, int i2) {
            return this.f14077a.get(i).getCreateTime().equals(this.f14078b.get(i2).getCreateTime());
        }
    }

    /* renamed from: a */
    public void mo13157a(List<PointHistoryData> list) {
        C1128d.m5740a(new C4925a(mo13160n(), list), true).mo5305a((RecyclerView.C0748a) this);
        this.f13714p = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.C0778w mo12612b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_list_s_item_cm, viewGroup, false);
        this.f13713o = viewGroup.getContext();
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12614c(RecyclerView.C0778w wVar, int i) {
        ((ViewHolder) wVar).mo13458a(mo13457i(i));
    }

    /* renamed from: i */
    public PointHistoryData mo13457i(int i) {
        return (PointHistoryData) this.f13714p.get(i);
    }
}
