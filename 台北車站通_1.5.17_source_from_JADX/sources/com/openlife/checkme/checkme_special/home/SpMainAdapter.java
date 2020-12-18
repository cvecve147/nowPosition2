package com.openlife.checkme.checkme_special.home;

import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.marshalchen.ultimaterecyclerview.C4187j;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.marshalchen.ultimaterecyclerview.p079b.C4166a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.checkme_special.home.adapter.ADPagerAdapter;
import com.openlife.checkme.checkme_special.home.adapter.C4902b;
import com.openlife.checkme.net.model.AdBannerData;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p100ui.C5034r;
import com.openlife.checkme.p100ui.CarouselViewpager;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p040i.p049g.C1128d;

public class SpMainAdapter extends C4187j {

    /* renamed from: p */
    private List<AdBannerData> f14002p = new ArrayList();

    /* renamed from: q */
    private List<C4902b> f14003q = new ArrayList();

    /* renamed from: r */
    boolean f14004r = false;

    /* renamed from: s */
    int f14005s;

    /* renamed from: t */
    private C4897b f14006t;

    /* renamed from: u */
    private C5034r.C5036b.C5037a f14007u;

    /* renamed from: v */
    private C5034r.C5038c.C5039a f14008v;

    public class HeaderViewBinder extends C4166a<ViewHolder> {

        /* renamed from: b */
        private C4897b f14009b;

        /* renamed from: c */
        private List<AdBannerData> f14010c;

        /* renamed from: d */
        private int f14011d;

        public class ViewHolder extends C4194p {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public C4897b f14013a;
            RelativeLayout background;
            CarouselViewpager banner;
            ImageView execute;
            TextView feedback;
            ImageView headImage;
            CirclePageIndicator indicator;
            TextView missionHis;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.m5843a((Object) this, view);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo13424a(int i, List<AdBannerData> list, C4897b bVar) {
                this.f14013a = bVar;
                mo13425a(list);
                this.headImage.setImageResource(i);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo13425a(List<AdBannerData> list) {
                ADPagerAdapter aDPagerAdapter = new ADPagerAdapter(mo11857y(), list);
                aDPagerAdapter.mo13448a(new C4899a(this));
                this.banner.setAdapter(aDPagerAdapter);
                this.indicator.setViewPager(this.banner);
            }

            public void collectionClick() {
                this.f14013a.mo13432g();
            }

            public void feedBackClick() {
                this.f14013a.mo13431b();
            }

            public void hisClick() {
                this.f14013a.mo13429a();
            }
        }

        public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

            /* renamed from: a */
            protected T f14015a;

            /* renamed from: b */
            private View f14016b;

            /* renamed from: c */
            private View f14017c;

            /* renamed from: d */
            private View f14018d;

            public ViewHolder_ViewBinding(T t, View view) {
                this.f14015a = t;
                t.headImage = (ImageView) C1153c.m5853c(view, C4956g.head_image, "field 'headImage'", ImageView.class);
                t.banner = (CarouselViewpager) C1153c.m5853c(view, C4956g.view_pager, "field 'banner'", CarouselViewpager.class);
                t.indicator = (CirclePageIndicator) C1153c.m5853c(view, C4956g.indicator, "field 'indicator'", CirclePageIndicator.class);
                View a = C1153c.m5849a(view, C4956g.mission_his_tv, "field 'missionHis' and method 'hisClick'");
                t.missionHis = (TextView) C1153c.m5850a(a, C4956g.mission_his_tv, "field 'missionHis'", TextView.class);
                this.f14016b = a;
                a.setOnClickListener(new C4904b(this, t));
                View a2 = C1153c.m5849a(view, C4956g.problem_feedback_tv, "field 'feedback' and method 'feedBackClick'");
                t.feedback = (TextView) C1153c.m5850a(a2, C4956g.problem_feedback_tv, "field 'feedback'", TextView.class);
                this.f14017c = a2;
                a2.setOnClickListener(new C4905c(this, t));
                View a3 = C1153c.m5849a(view, C4956g.execute_img, "field 'execute' and method 'collectionClick'");
                t.execute = (ImageView) C1153c.m5850a(a3, C4956g.execute_img, "field 'execute'", ImageView.class);
                this.f14018d = a3;
                a3.setOnClickListener(new C4906d(this, t));
                t.background = (RelativeLayout) C1153c.m5853c(view, C4956g.background, "field 'background'", RelativeLayout.class);
            }

            /* renamed from: a */
            public void mo5375a() {
                T t = this.f14015a;
                if (t != null) {
                    t.headImage = null;
                    t.banner = null;
                    t.indicator = null;
                    t.missionHis = null;
                    t.feedback = null;
                    t.execute = null;
                    t.background = null;
                    this.f14016b.setOnClickListener((View.OnClickListener) null);
                    this.f14016b = null;
                    this.f14017c.setOnClickListener((View.OnClickListener) null);
                    this.f14017c = null;
                    this.f14018d.setOnClickListener((View.OnClickListener) null);
                    this.f14018d = null;
                    this.f14015a = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        HeaderViewBinder(C4187j jVar, int i, List<AdBannerData> list, C4897b bVar) {
            super(jVar);
            this.f14010c = list;
            this.f14009b = bVar;
            this.f14011d = i;
        }

        /* renamed from: a */
        public void mo11793a(ViewHolder viewHolder, int i) {
            viewHolder.mo13424a(this.f14011d, this.f14010c, this.f14009b);
            ((StaggeredGridLayoutManager.C0787b) viewHolder.background.getLayoutParams()).mo4165a(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13422a(List<AdBannerData> list) {
            this.f14010c = list;
        }

        /* renamed from: b */
        public ViewHolder mo11792a(ViewGroup viewGroup) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_main_s_head, viewGroup, false));
        }
    }

    /* renamed from: com.openlife.checkme.checkme_special.home.SpMainAdapter$a */
    public class C4896a extends C1128d.C1129a {

        /* renamed from: a */
        private List<C4902b> f14019a;

        /* renamed from: b */
        private List<C4902b> f14020b;

        C4896a(List<C4902b> list, List<C4902b> list2) {
            this.f14019a = list;
            this.f14020b = list2;
        }

        /* renamed from: a */
        public int mo5300a() {
            return this.f14020b.size();
        }

        /* renamed from: a */
        public boolean mo5301a(int i, int i2) {
            return this.f14019a.get(i).equals(this.f14020b.get(i2));
        }

        /* renamed from: b */
        public int mo5302b() {
            return this.f14019a.size();
        }

        /* renamed from: b */
        public boolean mo5303b(int i, int i2) {
            return this.f14019a.get(i).mo13451a() == this.f14020b.get(i2).mo13451a();
        }
    }

    /* renamed from: com.openlife.checkme.checkme_special.home.SpMainAdapter$b */
    public interface C4897b {
        /* renamed from: a */
        void mo13429a();

        /* renamed from: a */
        void mo13430a(AdBannerData adBannerData);

        /* renamed from: b */
        void mo13431b();

        /* renamed from: g */
        void mo13432g();
    }

    /* renamed from: com.openlife.checkme.checkme_special.home.SpMainAdapter$c */
    enum C4898c {
        HEAD,
        NEAR_MISSION_TITLE,
        NEAR_MISSION_CONTENT,
        MISSION_TITLE,
        MISSION_CONTENT
    }

    public SpMainAdapter(int i, C4897b bVar, C5034r.C5038c.C5039a aVar, C5034r.C5036b.C5037a aVar2) {
        this.f14006t = bVar;
        this.f14007u = aVar2;
        this.f14008v = aVar;
        mo11852a(C4898c.HEAD, (C4166a) new HeaderViewBinder(this, i, this.f14002p, this.f14006t));
        this.f14003q.add(new C4902b(this.f14002p));
    }

    /* renamed from: m */
    private List<C4902b> m19281m() {
        return this.f14003q;
    }

    /* renamed from: a */
    public int mo337a() {
        return mo11799e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13418a(List<AdBannerData> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new C4902b(list));
        C1128d.m5740a(new C4896a(this.f14003q.subList(0, 1), arrayList), true).mo5305a((RecyclerView.C0748a) this);
        this.f14002p = list;
        this.f14003q = arrayList;
        ((HeaderViewBinder) mo11850a(C4898c.HEAD)).mo13422a(list);
    }

    /* renamed from: a */
    public void mo13419a(List<MissionData> list, List<MissionData> list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f14003q.get(0));
        arrayList.add(new C4902b(C4961l.home_t_recommend_nearlymission, C4902b.C4903a.NEAR_TITLE));
        for (MissionData bVar : list2) {
            arrayList.add(new C4902b(bVar, C4902b.C4903a.NEAR_MISSION));
        }
        arrayList.add(new C4902b(C4961l.home_t_recommend_mission, C4902b.C4903a.TITLE));
        for (MissionData bVar2 : list) {
            arrayList.add(new C4902b(bVar2, C4902b.C4903a.MISSION));
        }
        C1128d.m5740a(new C4896a(m19281m(), arrayList), true).mo5305a((RecyclerView.C0748a) this);
        this.f14003q = arrayList;
        C5034r.C5040d dVar = new C5034r.C5040d(this, C4961l.home_t_recommend_nearlymission);
        C5034r.C5038c cVar = new C5034r.C5038c(this, 2, list2, this.f14008v, this.f14004r, this.f14005s);
        mo11852a(C4898c.NEAR_MISSION_TITLE, (C4166a) dVar);
        mo11852a(C4898c.NEAR_MISSION_CONTENT, (C4166a) cVar);
        C5034r.C5040d dVar2 = new C5034r.C5040d(this, C4961l.home_t_recommend_mission);
        C5034r.C5036b bVar3 = new C5034r.C5036b(this, list2.size() + 2 + 1, list, this.f14007u, this.f14004r, this.f14005s);
        mo11852a(C4898c.MISSION_TITLE, (C4166a) dVar2);
        mo11852a(C4898c.MISSION_CONTENT, (C4166a) bVar3);
    }

    /* renamed from: b */
    public C4194p mo11794a(ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: d */
    public RecyclerView.C0778w mo11797d(View view) {
        return new C4194p(view);
    }

    /* renamed from: e */
    public int mo11799e() {
        return this.f14003q.size();
    }

    /* renamed from: e */
    public RecyclerView.C0778w mo11800e(View view) {
        return new C4194p(view);
    }

    /* renamed from: j */
    public Enum mo11854j(int i) {
        return C4898c.values()[i];
    }

    /* renamed from: k */
    public Enum mo11855k(int i) {
        C4902b.C4903a a = this.f14003q.get(i).mo13451a();
        return a == C4902b.C4903a.BANNER ? C4898c.HEAD : a == C4902b.C4903a.NEAR_TITLE ? C4898c.NEAR_MISSION_TITLE : a == C4902b.C4903a.NEAR_MISSION ? C4898c.NEAR_MISSION_CONTENT : a == C4902b.C4903a.TITLE ? C4898c.MISSION_TITLE : C4898c.MISSION_CONTENT;
    }
}
