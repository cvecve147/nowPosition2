package com.openlife.checkme.activity.account.redemption;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4758s;
import com.openlife.checkme.net.model.RedeemHistoryData;
import com.openlife.checkme.p093c.C4883m;
import p013b.p018b.p028h.p029a.C1006a;

public class RedemptionAdapter extends C4758s<RedeemHistoryData> {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C4495b f13191q;

    public class ViewHolder extends C4194p {
        TextView code;
        TextView date;
        View layout;
        Button status;
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13193a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f13193a = t;
            t.layout = C1153c.m5849a(view, C4956g.layout, "field 'layout'");
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.date = (TextView) C1153c.m5853c(view, C4956g.date, "field 'date'", TextView.class);
            t.code = (TextView) C1153c.m5853c(view, C4956g.code, "field 'code'", TextView.class);
            t.status = (Button) C1153c.m5853c(view, C4956g.status, "field 'status'", Button.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13193a;
            if (t != null) {
                t.layout = null;
                t.title = null;
                t.date = null;
                t.code = null;
                t.status = null;
                this.f13193a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.account.redemption.RedemptionAdapter$a */
    public class C4494a extends C4194p {
        public C4494a(View view) {
            super(view);
        }
    }

    /* renamed from: com.openlife.checkme.activity.account.redemption.RedemptionAdapter$b */
    public interface C4495b {
        /* renamed from: a */
        void mo12651a(int i, boolean z);
    }

    /* renamed from: com.openlife.checkme.activity.account.redemption.RedemptionAdapter$c */
    class C4496c implements View.OnClickListener {

        /* renamed from: a */
        int f13195a;

        /* renamed from: b */
        boolean f13196b;

        public C4496c(int i, boolean z) {
            this.f13195a = i;
            this.f13196b = z;
        }

        public void onClick(View view) {
            if (RedemptionAdapter.this.f13191q != null) {
                RedemptionAdapter.this.f13191q.mo12651a(this.f13195a, this.f13196b);
            }
        }
    }

    /* renamed from: a */
    public int mo337a() {
        return mo11799e() + mo11877l() + 1;
    }

    /* renamed from: a */
    public void mo12649a(C4495b bVar) {
        this.f13191q = bVar;
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
        return null;
    }

    /* renamed from: b */
    public RecyclerView.C0778w mo345b(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return i == 1 ? mo11800e(this.f12485d) : i == 4 ? mo11859a((View) this.f12485d) : i == 5 ? mo11863c(this.f12485d) : mo12650c(viewGroup, i);
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
    public RecyclerView.C0778w mo12650c(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_redemption_item_cm, viewGroup, false);
            this.f13713o = viewGroup.getContext();
            return new ViewHolder(inflate);
        } else if (i == 3 || i == 100) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_account_bottom_text, viewGroup, false);
            this.f13713o = viewGroup.getContext();
            return new C4494a(inflate2);
        } else {
            throw new NullPointerException("NOT SUPPORT VIEW TYPE");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12614c(RecyclerView.C0778w wVar, int i) {
        Button button;
        int i2;
        Context context;
        if (mo344b(i) == 0) {
            ViewHolder viewHolder = (ViewHolder) wVar;
            RedeemHistoryData redeemHistoryData = (RedeemHistoryData) this.f13714p.get(i);
            viewHolder.date.setText(this.f13713o.getString(C4961l.accountredemption_date, new Object[]{C4883m.m19223a(C4883m.m19225a(), C4883m.m19239c(), redeemHistoryData.getExpireDate())}));
            viewHolder.title.setText(redeemHistoryData.getName());
            viewHolder.code.setText(redeemHistoryData.getSerial());
            viewHolder.status.setText((CharSequence) null);
            viewHolder.layout.setOnClickListener(new C4496c(redeemHistoryData.getId(), redeemHistoryData.getStatus() == 1));
            viewHolder.status.setOnClickListener(new C4496c(redeemHistoryData.getId(), redeemHistoryData.getStatus() == 1));
            int status = redeemHistoryData.getStatus();
            if (status == -1) {
                viewHolder.status.setText(this.f13713o.getString(C4961l.accountredemption_b_expired));
                button = viewHolder.status;
                context = this.f13713o;
                i2 = C4948e.sunset;
            } else if (status == 1) {
                viewHolder.status.setText(this.f13713o.getString(C4961l.accountredemption_b_unuse));
                viewHolder.status.setBackgroundColor(C1006a.m5386a(this.f13713o, C4948e.cyan));
                viewHolder.status.setEnabled(true);
                return;
            } else if (status == 2) {
                viewHolder.status.setText(this.f13713o.getString(C4961l.accountredemption_b_used));
                button = viewHolder.status;
                context = this.f13713o;
                i2 = C4948e.dark_gray;
            } else {
                return;
            }
            button.setBackgroundColor(C1006a.m5386a(context, i2));
            viewHolder.status.setEnabled(false);
        }
    }
}
