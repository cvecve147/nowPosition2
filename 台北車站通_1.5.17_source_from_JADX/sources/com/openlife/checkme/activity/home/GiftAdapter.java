package com.openlife.checkme.activity.home;

import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import com.openlife.checkme.activity.C4758s;
import com.openlife.checkme.net.model.GiftData;
import java.util.List;
import p013b.p018b.p040i.p049g.C1128d;

public class GiftAdapter extends C4758s<GiftData> {

    /* renamed from: q */
    private int f13438q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C4635b f13439r;

    public class ViewHolder extends C4194p {
        ImageView cover;
        View layout;
        TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13441a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f13441a = t;
            t.layout = C1153c.m5849a(view, C4956g.layout, "field 'layout'");
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13441a;
            if (t != null) {
                t.layout = null;
                t.title = null;
                t.cover = null;
                this.f13441a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.activity.home.GiftAdapter$a */
    public static class C4634a extends C1128d.C1129a {

        /* renamed from: a */
        private List<GiftData> f13442a;

        /* renamed from: b */
        private List<GiftData> f13443b;

        public C4634a(List<GiftData> list, List<GiftData> list2) {
            this.f13442a = list;
            this.f13443b = list2;
        }

        /* renamed from: a */
        public int mo5300a() {
            List<GiftData> list = this.f13443b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: a */
        public boolean mo5301a(int i, int i2) {
            return this.f13442a.get(i).equals(this.f13443b.get(i2));
        }

        /* renamed from: b */
        public int mo5302b() {
            List<GiftData> list = this.f13442a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* renamed from: b */
        public boolean mo5303b(int i, int i2) {
            return this.f13442a.get(i).getId() == this.f13443b.get(i2).getId();
        }
    }

    /* renamed from: com.openlife.checkme.activity.home.GiftAdapter$b */
    public interface C4635b {
        /* renamed from: a */
        void mo12910a(int i);
    }

    /* renamed from: com.openlife.checkme.activity.home.GiftAdapter$c */
    class C4636c implements View.OnClickListener {

        /* renamed from: a */
        int f13444a;

        public C4636c(int i) {
            this.f13444a = i;
        }

        public void onClick(View view) {
            if (GiftAdapter.this.f13439r != null) {
                GiftAdapter.this.f13439r.mo12910a(this.f13444a);
            }
        }
    }

    /* renamed from: a */
    public void mo12908a(C4635b bVar) {
        this.f13439r = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.C0778w mo12612b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_home_gift_item_cm, viewGroup, false);
        this.f13713o = viewGroup.getContext();
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12614c(RecyclerView.C0778w wVar, int i) {
        if (mo344b(i) == 0) {
            ViewHolder viewHolder = (ViewHolder) wVar;
            GiftData giftData = (GiftData) this.f13714p.get(i);
            int i2 = this.f13438q;
            if (i2 != 0) {
                viewHolder.layout.setLayoutParams(new RelativeLayout.LayoutParams(i2, -1));
            }
            viewHolder.title.setText(giftData.getName());
            ImageLoader.getInstance().displayImage(giftData.getListImage(), viewHolder.cover, C4452a.m17659a(C4959j.default_gift));
            viewHolder.mo11858z().setOnClickListener(new C4636c(giftData.getId()));
        }
    }

    /* renamed from: i */
    public void mo12909i(int i) {
        this.f13438q = i;
    }
}
