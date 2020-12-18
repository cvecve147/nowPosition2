package com.openlife.checkme.activity.account.history;

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

public class HistoryAdapter extends C4758s<PointHistoryData> {

    public class ViewHolder extends C4194p {
        TextView date;
        TextView point;
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13163a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f13163a = t;
            t.date = (TextView) C1153c.m5853c(view, C4956g.date, "field 'date'", TextView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13163a;
            if (t != null) {
                t.date = null;
                t.title = null;
                t.point = null;
                this.f13163a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.account.history.HistoryAdapter$a */
    public class C4473a extends C4194p {
        public C4473a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public int mo337a() {
        return mo11799e() + mo11877l() + 1;
    }

    /* renamed from: b */
    public int mo344b(int i) {
        if (mo11799e() != 0) {
            if (mo11799e() > 0) {
                if (i == mo337a() - 1 && mo11864d()) {
                    return 2;
                }
                if (i == 0 && mo11873h()) {
                    return 1;
                }
                if (mo11869f(i) || mo11866e(i)) {
                    return 4;
                }
                if (i == this.f13714p.size()) {
                    return 100;
                }
            }
            return 0;
        } else if (i != 0) {
            if (i == 1) {
                if (mo11864d() && mo11873h()) {
                    return 2;
                }
                if ((mo11864d() || !mo11873h()) && mo11864d() && !mo11873h()) {
                }
            }
            return 3;
        } else if (mo11864d() && mo11873h()) {
            return 2;
        } else {
            if (mo11864d() || !mo11873h()) {
                return (!mo11864d() || mo11873h()) ? 3 : 2;
            }
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.C0778w mo12612b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_history_item_cm, viewGroup, false);
        this.f13713o = viewGroup.getContext();
        return new ViewHolder(inflate);
    }

    /* renamed from: b */
    public RecyclerView.C0778w mo345b(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return i == 1 ? mo11800e(this.f12485d) : i == 4 ? mo11859a((View) this.f12485d) : i == 5 ? mo11863c(this.f12485d) : mo12613c(viewGroup, i);
        }
        RecyclerView.C0778w d = mo11797d(this.f12486e);
        this.f12487f = d.f3093b;
        if (mo11799e() == 0) {
            mo11875j();
        }
        if (this.f12490i && mo11799e() > 0) {
            mo11876k();
        }
        return d;
    }

    /* renamed from: c */
    public RecyclerView.C0778w mo12613c(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_history_item_cm, viewGroup, false);
            this.f13713o = viewGroup.getContext();
            return new ViewHolder(inflate);
        } else if (i == 3 || i == 100) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_account_bottom_text, viewGroup, false);
            this.f13713o = viewGroup.getContext();
            return new C4473a(inflate2);
        } else {
            throw new NullPointerException("NOT SUPPORT VIEW TYPE");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12614c(RecyclerView.C0778w wVar, int i) {
        if (mo344b(i) == 0) {
            ViewHolder viewHolder = (ViewHolder) wVar;
            PointHistoryData pointHistoryData = (PointHistoryData) this.f13714p.get(i);
            viewHolder.date.setText(pointHistoryData.getCreateTime());
            viewHolder.title.setText(pointHistoryData.getComment());
            viewHolder.point.setText(pointHistoryData.getPointStr());
        }
    }
}
