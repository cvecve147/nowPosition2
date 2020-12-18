package com.openlife.checkme.activity.mission.list;

import android.content.Context;
import android.content.res.Resources;
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
import com.openlife.checkme.C4950f;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p100ui.MissionListTagView;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p023e.p024a.C0977k;

public class MissionListAdapter extends RecyclerView.C0748a<RecyclerView.C0778w> {

    /* renamed from: c */
    int f13644c;

    /* renamed from: d */
    private List<MissionData> f13645d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4722b f13646e;

    /* renamed from: f */
    private boolean f13647f;

    /* renamed from: g */
    private boolean f13648g;

    /* renamed from: h */
    private Context f13649h;

    public class BaseViewHolder extends C4194p {
        ImageView cover;
        View mask;
        ImageView maskIcon;
        TextView maskTxt;
        TextView point;
        TextView pointTitle;
        TextView title;

        public BaseViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class BaseViewHolder_ViewBinding<T extends BaseViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f13651a;

        public BaseViewHolder_ViewBinding(T t, View view) {
            this.f13651a = t;
            t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
            t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
            t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
            t.mask = C1153c.m5849a(view, C4956g.mask, "field 'mask'");
            t.maskIcon = (ImageView) C1153c.m5853c(view, C4956g.mask_icon, "field 'maskIcon'", ImageView.class);
            t.pointTitle = (TextView) C1153c.m5853c(view, C4956g.point_title, "field 'pointTitle'", TextView.class);
            t.maskTxt = (TextView) C1153c.m5853c(view, C4956g.mask_txt, "field 'maskTxt'", TextView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f13651a;
            if (t != null) {
                t.cover = null;
                t.title = null;
                t.point = null;
                t.mask = null;
                t.maskIcon = null;
                t.pointTitle = null;
                t.maskTxt = null;
                this.f13651a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class GridViewHolder extends BaseViewHolder {
        LinearLayout tagLayout;

        public GridViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class GridViewHolder_ViewBinding<T extends GridViewHolder> extends BaseViewHolder_ViewBinding<T> {
        public GridViewHolder_ViewBinding(T t, View view) {
            super(t, view);
            t.tagLayout = (LinearLayout) C1153c.m5853c(view, C4956g.tag_layout, "field 'tagLayout'", LinearLayout.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            super.mo5375a();
            ((GridViewHolder) this.f13651a).tagLayout = null;
        }
    }

    public class ListViewHolder extends BaseViewHolder {
        LinearLayout tagLayout;

        public ListViewHolder(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    public class ListViewHolder_ViewBinding<T extends ListViewHolder> extends BaseViewHolder_ViewBinding<T> {
        public ListViewHolder_ViewBinding(T t, View view) {
            super(t, view);
            t.tagLayout = (LinearLayout) C1153c.m5853c(view, C4956g.tag_layout, "field 'tagLayout'", LinearLayout.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            super.mo5375a();
            ((ListViewHolder) this.f13651a).tagLayout = null;
        }
    }

    /* renamed from: com.openlife.checkme.activity.mission.list.MissionListAdapter$a */
    public class C4721a extends BaseViewHolder {
        public C4721a(View view) {
            super(view);
            ButterKnife.m5843a((Object) this, view);
        }
    }

    /* renamed from: com.openlife.checkme.activity.mission.list.MissionListAdapter$b */
    public interface C4722b {
        /* renamed from: a */
        void mo13096a(int i);
    }

    /* renamed from: com.openlife.checkme.activity.mission.list.MissionListAdapter$c */
    private class C4723c implements View.OnClickListener {

        /* renamed from: a */
        int f13655a;

        public C4723c(int i) {
            this.f13655a = i;
        }

        public void onClick(View view) {
            if (MissionListAdapter.this.f13646e != null) {
                MissionListAdapter.this.f13646e.mo13096a(this.f13655a);
            }
        }
    }

    public MissionListAdapter(Context context, boolean z, int i) {
        this.f13647f = z;
        this.f13648g = z;
        this.f13644c = i;
        this.f13649h = context;
    }

    /* renamed from: a */
    private void m18621a(LinearLayout linearLayout, MissionData missionData, boolean z, boolean z2) {
        MissionListTagView missionListTagView;
        linearLayout.removeAllViews();
        MissionListTagView[] missionListTagViewArr = new MissionListTagView[2];
        for (int i = 0; i < 2; i++) {
            if (missionData.getTag().size() > i) {
                missionListTagViewArr[i] = new MissionListTagView(this.f13649h, missionData.getTag().get(i).getTitle(), missionData.getTag().get(i).getColor());
            } else {
                missionListTagViewArr[i] = new MissionListTagView(this.f13649h);
            }
        }
        if (z) {
            linearLayout.addView(missionListTagViewArr[1]);
            missionListTagView = missionListTagViewArr[0];
        } else {
            linearLayout.addView(missionListTagViewArr[0]);
            missionListTagView = missionListTagViewArr[1];
        }
        linearLayout.addView(missionListTagView);
        if (!z2) {
            linearLayout.setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m18622a(GridViewHolder gridViewHolder, MissionData missionData) {
        int i;
        ImageLoader.getInstance().displayImage(missionData.getGridImage(), gridViewHolder.cover, C4452a.m17659a(C4959j.default_activity));
        gridViewHolder.title.setText(missionData.getName());
        gridViewHolder.point.setText(missionData.getPointStr());
        m18625a(this.f13647f, gridViewHolder.point, gridViewHolder.pointTitle);
        gridViewHolder.mo11858z().setOnClickListener(new C4723c(missionData.getId()));
        m18621a(gridViewHolder.tagLayout, missionData, true, this.f13648g);
        int status = missionData.getStatus();
        int i2 = -1;
        int i3 = 0;
        if (status == -3) {
            i2 = C4950f.ic_task_img_closed;
            i = C4961l.missiondetail_close;
        } else if (status == -2) {
            i2 = C4950f.ic_task_img_locked;
            i = C4961l.missinodetail_locked;
        } else if (status == -1) {
            i2 = C4950f.ic_task_img_full;
            i = C4961l.missinodetail_full;
        } else if (status != 0) {
            i3 = 4;
            i = -1;
        } else {
            i2 = C4950f.ic_task_img_done;
            i = C4961l.missinodetail_completed;
        }
        gridViewHolder.mask.setVisibility(i3);
        if (i3 == 0) {
            gridViewHolder.maskIcon.setImageDrawable(C0977k.m5295a(this.f13649h.getResources(), i2, (Resources.Theme) null));
            gridViewHolder.maskTxt.setText(i);
        }
    }

    /* renamed from: a */
    private void m18623a(ListViewHolder listViewHolder, MissionData missionData) {
        int i;
        ImageLoader.getInstance().displayImage(missionData.getListImage(), listViewHolder.cover, C4452a.m17659a(C4959j.default_activity));
        listViewHolder.title.setText(missionData.getName());
        listViewHolder.point.setText(missionData.getPointStr());
        m18625a(this.f13647f, listViewHolder.point, listViewHolder.pointTitle);
        listViewHolder.mo11858z().setOnClickListener(new C4723c(missionData.getId()));
        int i2 = 0;
        m18621a(listViewHolder.tagLayout, missionData, false, this.f13648g);
        int status = missionData.getStatus();
        int i3 = -1;
        if (status == -3) {
            i3 = C4950f.ic_task_img_closed;
            i = C4961l.missiondetail_close;
        } else if (status == -2) {
            i3 = C4950f.ic_task_img_locked;
            i = C4961l.missinodetail_locked;
        } else if (status == -1) {
            i3 = C4950f.ic_task_img_full;
            i = C4961l.missinodetail_full;
        } else if (status != 0) {
            i2 = 4;
            i = -1;
        } else {
            i3 = C4950f.ic_task_img_done;
            i = C4961l.missinodetail_completed;
        }
        listViewHolder.mask.setVisibility(i2);
        if (i2 == 0) {
            listViewHolder.maskIcon.setImageResource(i3);
            listViewHolder.maskTxt.setText(i);
        }
    }

    /* renamed from: a */
    private void m18624a(C4721a aVar, MissionData missionData) {
        int i;
        ImageLoader.getInstance().displayImage(missionData.getListLargeImage(), aVar.cover, C4452a.m17659a(C4959j.default_activity));
        aVar.title.setText(missionData.getName());
        aVar.point.setText(missionData.getPointStr());
        m18625a(this.f13647f, aVar.point, aVar.pointTitle);
        aVar.mo11858z().setOnClickListener(new C4723c(missionData.getId()));
        int status = missionData.getStatus();
        int i2 = -1;
        int i3 = 0;
        if (status == -3) {
            i2 = C4950f.ic_task_img_closed;
            i = C4961l.missiondetail_close;
        } else if (status == -2) {
            i2 = C4950f.ic_task_img_locked;
            i = C4961l.missinodetail_locked;
        } else if (status == -1) {
            i2 = C4950f.ic_task_img_full;
            i = C4961l.missinodetail_full;
        } else if (status != 0) {
            i3 = 4;
            i = -1;
        } else {
            i2 = C4950f.ic_task_img_done;
            i = C4961l.missinodetail_completed;
        }
        aVar.mask.setVisibility(i3);
        if (i3 == 0) {
            aVar.maskIcon.setImageResource(i2);
            aVar.maskTxt.setText(i);
        }
    }

    /* renamed from: a */
    private void m18625a(boolean z, TextView textView, TextView textView2) {
        int i = 0;
        textView.setVisibility(z ? 0 : 4);
        if (!z) {
            i = 4;
        }
        textView2.setVisibility(i);
    }

    /* renamed from: a */
    public int mo337a() {
        return this.f13645d.size();
    }

    /* renamed from: a */
    public void mo13090a(C4722b bVar) {
        this.f13646e = bVar;
    }

    /* renamed from: a */
    public void mo13091a(List<MissionData> list) {
        this.f13645d = list;
    }

    /* renamed from: b */
    public int mo344b(int i) {
        return this.f13644c;
    }

    /* renamed from: b */
    public RecyclerView.C0778w mo345b(ViewGroup viewGroup, int i) {
        switch (i) {
            case 111:
                return new C4721a(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_large_list_item_cm, viewGroup, false));
            case 112:
                return new ListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_list_item_cm, viewGroup, false));
            case 113:
                return new GridViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_mission_grid_item_cm, viewGroup, false));
            default:
                return null;
        }
    }

    /* renamed from: b */
    public void mo346b(RecyclerView.C0778w wVar, int i) {
        switch (this.f13644c) {
            case 111:
                m18624a((C4721a) wVar, mo13094e(i));
                return;
            case 112:
                m18623a((ListViewHolder) wVar, mo13094e(i));
                return;
            case 113:
                m18622a((GridViewHolder) wVar, mo13094e(i));
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public int mo13092d() {
        return this.f13644c;
    }

    /* renamed from: d */
    public void mo13093d(int i, int i2) {
        for (int i3 = 0; i3 < this.f13645d.size(); i3++) {
            MissionData missionData = this.f13645d.get(i3);
            if (missionData.getId() == i) {
                missionData.setStatus(i2);
                mo3799c(i3);
                return;
            }
        }
    }

    /* renamed from: e */
    public MissionData mo13094e(int i) {
        return this.f13645d.get(i);
    }

    /* renamed from: e */
    public void mo13095e() {
        this.f13645d.clear();
    }
}
