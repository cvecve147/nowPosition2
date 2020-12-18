package com.openlife.checkme.activity.home;

import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.C4187j;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.marshalchen.ultimaterecyclerview.p079b.C4166a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.home.C4667y;
import com.openlife.checkme.activity.home.GiftAdapter;
import com.openlife.checkme.net.model.GiftData;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p100ui.C5034r;
import com.openlife.checkme.p100ui.Viewholder.MissionTitleViewHolder;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p040i.p049g.C1128d;

public class MainAdapter extends C4187j {

    /* renamed from: p */
    private List<C4667y> f13447p = new ArrayList();

    /* renamed from: q */
    boolean f13448q = false;

    /* renamed from: r */
    int f13449r;

    /* renamed from: s */
    private C4639c f13450s;

    /* renamed from: t */
    private C5034r.C5038c.C5039a f13451t;

    /* renamed from: u */
    private C5034r.C5036b.C5037a f13452u;

    public class RecommendContentViewBinder extends C4166a<ViewHolder> {

        /* renamed from: b */
        private C4639c f13453b;

        /* renamed from: c */
        private List<GiftData> f13454c;

        public class ViewHolder extends C4194p {

            /* renamed from: a */
            private GiftAdapter f13456a = new GiftAdapter();
            RecyclerView recyclerView;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.m5843a((Object) this, view);
                this.f13456a.mo12909i((int) (((double) view.getContext().getResources().getDisplayMetrics().widthPixels) * 0.25d));
                this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                this.recyclerView.setAdapter(this.f13456a);
                this.recyclerView.setNestedScrollingEnabled(false);
            }

            /* renamed from: a */
            public void mo12917a(List<GiftData> list, C4639c cVar) {
                C1128d.m5740a(new GiftAdapter.C4634a(this.f13456a.mo13160n(), list), true).mo5305a((RecyclerView.C0748a) this.f13456a);
                this.f13456a.mo13158b(list);
                this.f13456a.mo12908a((GiftAdapter.C4635b) new C4644b(this, cVar));
            }
        }

        public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

            /* renamed from: a */
            protected T f13458a;

            public ViewHolder_ViewBinding(T t, View view) {
                this.f13458a = t;
                t.recyclerView = (RecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'recyclerView'", RecyclerView.class);
            }

            /* renamed from: a */
            public void mo5375a() {
                T t = this.f13458a;
                if (t != null) {
                    t.recyclerView = null;
                    this.f13458a = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        public RecommendContentViewBinder(C4187j jVar, List<GiftData> list, C4639c cVar) {
            super(jVar);
            this.f13453b = cVar;
            this.f13454c = list;
        }

        /* renamed from: a */
        public void mo11793a(ViewHolder viewHolder, int i) {
            viewHolder.mo12917a(this.f13454c, this.f13453b);
            ((StaggeredGridLayoutManager.C0787b) viewHolder.recyclerView.getLayoutParams()).mo4165a(true);
        }

        /* renamed from: a */
        public void mo12915a(List<GiftData> list) {
            this.f13454c = list;
        }

        /* renamed from: b */
        public ViewHolder mo11792a(ViewGroup viewGroup) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_recyclerview, viewGroup, false));
        }
    }

    public class RecommendViewBinder extends C4166a<ViewHolder> {

        /* renamed from: b */
        private C4640d f13459b;

        public class ViewHolder extends C4194p {
            RelativeLayout background;
            Button showAllBtn;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.m5843a((Object) this, view);
            }

            /* renamed from: a */
            public void mo12920a(C4640d dVar) {
                this.showAllBtn.setOnClickListener(new C4645c(this, dVar));
            }
        }

        public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

            /* renamed from: a */
            protected T f13462a;

            public ViewHolder_ViewBinding(T t, View view) {
                this.f13462a = t;
                t.showAllBtn = (Button) C1153c.m5853c(view, C4956g.recommend_gift_show_all, "field 'showAllBtn'", Button.class);
                t.background = (RelativeLayout) C1153c.m5853c(view, C4956g.background, "field 'background'", RelativeLayout.class);
            }

            /* renamed from: a */
            public void mo5375a() {
                T t = this.f13462a;
                if (t != null) {
                    t.showAllBtn = null;
                    t.background = null;
                    this.f13462a = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        RecommendViewBinder(C4187j jVar, C4640d dVar) {
            super(jVar);
            this.f13459b = dVar;
        }

        /* renamed from: a */
        public void mo11793a(ViewHolder viewHolder, int i) {
            viewHolder.mo12920a(this.f13459b);
            ((StaggeredGridLayoutManager.C0787b) viewHolder.background.getLayoutParams()).mo4165a(true);
        }

        /* renamed from: b */
        public ViewHolder mo11792a(ViewGroup viewGroup) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_home_recommend_gift_controller, viewGroup, false));
        }
    }

    /* renamed from: com.openlife.checkme.activity.home.MainAdapter$a */
    public class C4637a extends C1128d.C1129a {

        /* renamed from: a */
        private List<C4667y> f13463a;

        /* renamed from: b */
        private List<C4667y> f13464b;

        C4637a(List<C4667y> list, List<C4667y> list2) {
            this.f13463a = list;
            this.f13464b = list2;
        }

        /* renamed from: a */
        public int mo5300a() {
            return this.f13464b.size();
        }

        /* renamed from: a */
        public boolean mo5301a(int i, int i2) {
            return this.f13463a.get(i).equals(this.f13464b.get(i2));
        }

        /* renamed from: b */
        public int mo5302b() {
            return this.f13463a.size();
        }

        /* renamed from: b */
        public boolean mo5303b(int i, int i2) {
            return this.f13463a.get(i).mo12952a() == this.f13464b.get(i2).mo12952a();
        }
    }

    /* renamed from: com.openlife.checkme.activity.home.MainAdapter$b */
    public class C4638b extends C5034r.C5040d {

        /* renamed from: c */
        private int f13466c;

        public C4638b(C4187j jVar, int i) {
            super(jVar, i);
            this.f13466c = i;
        }

        /* renamed from: a */
        public void mo11793a(MissionTitleViewHolder missionTitleViewHolder, int i) {
            missionTitleViewHolder.mo14080c(this.f13466c);
            RelativeLayout relativeLayout = (RelativeLayout) missionTitleViewHolder.mo11858z().findViewById(C4956g.layout);
            StaggeredGridLayoutManager.C0787b bVar = (StaggeredGridLayoutManager.C0787b) missionTitleViewHolder.mo11858z().getLayoutParams();
            bVar.mo4165a(true);
            int b = (int) C4883m.m19231b(missionTitleViewHolder.mo11857y(), 13.0f);
            int b2 = (int) C4883m.m19231b(missionTitleViewHolder.mo11857y(), 4.0f);
            if (this.f13466c == C4961l.home_t_recommend_mission) {
                bVar.setMargins(b, b2, 0, b);
            } else {
                bVar.setMargins(b, 0, 0, b);
            }
            relativeLayout.setLayoutParams(bVar);
        }

        /* renamed from: b */
        public MissionTitleViewHolder mo11792a(ViewGroup viewGroup) {
            return new MissionTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_home_mission_title_cm, viewGroup, false));
        }
    }

    /* renamed from: com.openlife.checkme.activity.home.MainAdapter$c */
    public interface C4639c {
        /* renamed from: a */
        void mo12923a(int i);
    }

    /* renamed from: com.openlife.checkme.activity.home.MainAdapter$d */
    public interface C4640d {
        /* renamed from: a */
        void mo12924a();
    }

    /* renamed from: com.openlife.checkme.activity.home.MainAdapter$e */
    enum C4641e {
        RECOMMEND_GIFT_TITLE,
        RECOMMEND_GIFT,
        MISSION_TITLE,
        MISSION_CONTENT,
        NEAR_MISSION_TITLE,
        NEAR_MISSION_CONTENT
    }

    public MainAdapter(C4640d dVar, C4639c cVar, C5034r.C5036b.C5037a aVar, C5034r.C5038c.C5039a aVar2) {
        this.f13450s = cVar;
        this.f13452u = aVar;
        this.f13451t = aVar2;
        mo11852a(C4641e.RECOMMEND_GIFT_TITLE, (C4166a) new RecommendViewBinder(this, dVar));
        this.f13447p.add(new C4667y(C4961l.home_t_recommend_gift, C4667y.C4668a.RECOMMEND_GIFT_TITLE));
        mo11852a(C4641e.MISSION_TITLE, (C4166a) new C4638b(this, C4961l.home_t_recommend_mission));
        this.f13447p.add(new C4667y(C4961l.home_t_recommend_mission, C4667y.C4668a.MISSION_TITLE));
        mo11852a(C4641e.NEAR_MISSION_TITLE, (C4166a) new C4638b(this, C4961l.home_t_recommend_nearlymission));
        this.f13447p.add(new C4667y(C4961l.home_t_recommend_nearlymission, C4667y.C4668a.NEAR_MISSION_TITLE));
    }

    /* renamed from: m */
    private List<C4667y> m18287m() {
        return this.f13447p;
    }

    /* renamed from: a */
    public int mo337a() {
        return mo11799e();
    }

    /* renamed from: a */
    public RecyclerView.C0778w mo11794a(ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: a */
    public void mo12912a(List<GiftData> list) {
        RecommendContentViewBinder recommendContentViewBinder = (RecommendContentViewBinder) mo11850a(C4641e.RECOMMEND_GIFT);
        if (recommendContentViewBinder != null) {
            this.f13447p.set(1, new C4667y(list));
            recommendContentViewBinder.mo12915a(list);
        } else {
            this.f13447p.add(1, new C4667y(list));
            mo11852a(C4641e.RECOMMEND_GIFT, (C4166a) new RecommendContentViewBinder(this, list, this.f13450s));
        }
        mo3799c(1);
    }

    /* renamed from: a */
    public void mo12913a(List<MissionData> list, List<MissionData> list2) {
        ArrayList arrayList = new ArrayList();
        for (C4667y next : this.f13447p) {
            int i = C4643a.f13499a[next.mo12952a().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        for (MissionData yVar : list) {
            arrayList.add(new C4667y(yVar, C4667y.C4668a.MISSION_CONTENT));
        }
        int size2 = arrayList.size() + 1;
        for (C4667y next2 : this.f13447p) {
            if (next2.mo12952a() == C4667y.C4668a.NEAR_MISSION_TITLE) {
                arrayList.add(next2);
            }
        }
        for (MissionData yVar2 : list2) {
            arrayList.add(new C4667y(yVar2, C4667y.C4668a.NEAR_MISSION_CONTENT));
        }
        C1128d.m5740a(new C4637a(m18287m(), arrayList), true).mo5305a((RecyclerView.C0748a) this);
        this.f13447p = arrayList;
        mo11852a(C4641e.MISSION_CONTENT, (C4166a) new C5034r.C5036b(this, size, list, this.f13452u, this.f13448q, this.f13449r));
        mo11852a(C4641e.NEAR_MISSION_CONTENT, (C4166a) new C5034r.C5038c(this, size2, list2, this.f13451t, this.f13448q, this.f13449r));
    }

    /* renamed from: d */
    public RecyclerView.C0778w mo11797d(View view) {
        return new C4194p(view);
    }

    /* renamed from: e */
    public int mo11799e() {
        return this.f13447p.size();
    }

    /* renamed from: e */
    public RecyclerView.C0778w mo11800e(View view) {
        return new C4194p(view);
    }

    /* renamed from: j */
    public Enum mo11854j(int i) {
        return C4641e.values()[i];
    }

    /* renamed from: k */
    public Enum mo11855k(int i) {
        C4667y.C4668a a = this.f13447p.get(i).mo12952a();
        return a == C4667y.C4668a.RECOMMEND_GIFT_TITLE ? C4641e.RECOMMEND_GIFT_TITLE : a == C4667y.C4668a.RECOMMEND_GIFT ? C4641e.RECOMMEND_GIFT : a == C4667y.C4668a.MISSION_TITLE ? C4641e.MISSION_TITLE : a == C4667y.C4668a.MISSION_CONTENT ? C4641e.MISSION_CONTENT : a == C4667y.C4668a.NEAR_MISSION_TITLE ? C4641e.NEAR_MISSION_TITLE : C4641e.NEAR_MISSION_CONTENT;
    }
}
