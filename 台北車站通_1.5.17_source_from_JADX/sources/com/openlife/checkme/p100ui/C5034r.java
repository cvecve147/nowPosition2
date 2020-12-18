package com.openlife.checkme.p100ui;

import android.content.Context;
import android.support.p007v4.view.C0483r;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.marshalchen.ultimaterecyclerview.C4187j;
import com.marshalchen.ultimaterecyclerview.p079b.C4166a;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.net.model.ActivityDetailData;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p100ui.Viewholder.MissionTitleViewHolder;
import com.openlife.checkme.p100ui.Viewholder.MissionViewHolder;
import com.openlife.checkme.p100ui.Viewholder.NearlyMissionViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.openlife.checkme.ui.r */
class C5034r extends C0483r {

    /* renamed from: c */
    Context f14302c;

    /* renamed from: d */
    List<ActivityDetailData> f14303d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5035a f14304e;

    /* renamed from: com.openlife.checkme.ui.r$a */
    public interface C5035a {
        /* renamed from: a */
        void mo14085a(String str);
    }

    /* renamed from: com.openlife.checkme.ui.r$b */
    public class C5036b extends C4166a<MissionViewHolder> {

        /* renamed from: b */
        private List<MissionData> f14305b;

        /* renamed from: c */
        private C5037a f14306c;

        /* renamed from: d */
        private int f14307d;

        /* renamed from: e */
        private boolean f14308e;

        /* renamed from: f */
        private int f14309f;

        /* renamed from: com.openlife.checkme.ui.r$b$a */
        public interface C5037a {
            /* renamed from: a */
            void mo12944a(int i);
        }

        public C5036b(C4187j jVar, int i, List<MissionData> list, C5037a aVar, boolean z, int i2) {
            super(jVar);
            this.f14305b = list;
            this.f14306c = aVar;
            this.f14307d = i;
            this.f14308e = z;
            this.f14309f = i2;
        }

        /* renamed from: a */
        public void mo14106a(Context context, StaggeredGridLayoutManager.C0787b bVar, int i) {
            int i2;
            int i3;
            float b = C4883m.m19231b(context, 4.5f);
            float b2 = C4883m.m19231b(context, 13.0f);
            float b3 = C4883m.m19231b(context, 8.0f);
            if (i % 2 == 0) {
                i2 = (int) b2;
                i3 = (int) b;
            } else {
                i2 = (int) b;
                i3 = (int) b2;
            }
            bVar.setMargins(i2, 0, i3, (int) b3);
        }

        /* renamed from: a */
        public void mo11793a(MissionViewHolder missionViewHolder, int i) {
            missionViewHolder.mo14081a(this.f14305b.get(i - this.f14307d), this.f14306c, this.f14308e, this.f14309f);
            mo14106a(missionViewHolder.mo11857y(), (StaggeredGridLayoutManager.C0787b) missionViewHolder.cardView.getLayoutParams(), i - this.f14307d);
        }

        /* renamed from: b */
        public MissionViewHolder mo11792a(ViewGroup viewGroup) {
            return new MissionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_home_mission_item_cm, viewGroup, false));
        }
    }

    /* renamed from: com.openlife.checkme.ui.r$c */
    public class C5038c extends C4166a<NearlyMissionViewHolder> {

        /* renamed from: b */
        private List<MissionData> f14310b;

        /* renamed from: c */
        private C5039a f14311c;

        /* renamed from: d */
        private int f14312d = 0;

        /* renamed from: e */
        private boolean f14313e;

        /* renamed from: f */
        private int f14314f;

        /* renamed from: com.openlife.checkme.ui.r$c$a */
        public interface C5039a {
            /* renamed from: a */
            void mo12945a(int i);
        }

        public C5038c(C4187j jVar, int i, List<MissionData> list, C5039a aVar, boolean z, int i2) {
            super(jVar);
            this.f14310b = list;
            this.f14311c = aVar;
            this.f14313e = z;
            this.f14314f = i2;
            this.f14312d = i;
        }

        /* renamed from: a */
        public void mo14109a(Context context, StaggeredGridLayoutManager.C0787b bVar, int i) {
            int i2;
            int i3;
            float b = C4883m.m19231b(context, 4.5f);
            float b2 = C4883m.m19231b(context, 13.0f);
            float b3 = C4883m.m19231b(context, 8.0f);
            if (i % 2 == 0) {
                i2 = (int) b2;
                i3 = (int) b;
            } else {
                i2 = (int) b;
                i3 = (int) b2;
            }
            bVar.setMargins(i2, 0, i3, (int) b3);
        }

        /* renamed from: a */
        public void mo11793a(NearlyMissionViewHolder nearlyMissionViewHolder, int i) {
            nearlyMissionViewHolder.mo14082a(this.f14310b.get(i - this.f14312d), this.f14311c, this.f14313e, this.f14314f);
            mo14109a(nearlyMissionViewHolder.mo11857y(), (StaggeredGridLayoutManager.C0787b) nearlyMissionViewHolder.cardView.getLayoutParams(), i - this.f14312d);
        }

        /* renamed from: b */
        public NearlyMissionViewHolder mo11792a(ViewGroup viewGroup) {
            return new NearlyMissionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_home_nearby_mission_item_cm, viewGroup, false));
        }
    }

    /* renamed from: com.openlife.checkme.ui.r$d */
    public class C5040d extends C4166a<MissionTitleViewHolder> {

        /* renamed from: b */
        private int f14315b;

        public C5040d(C4187j jVar, int i) {
            super(jVar);
            this.f14315b = i;
        }

        /* renamed from: a */
        public void mo11793a(MissionTitleViewHolder missionTitleViewHolder, int i) {
            missionTitleViewHolder.mo14080c(this.f14315b);
            StaggeredGridLayoutManager.C0787b bVar = (StaggeredGridLayoutManager.C0787b) missionTitleViewHolder.mTitleText.getLayoutParams();
            bVar.mo4165a(true);
            int b = (int) C4883m.m19231b(missionTitleViewHolder.mo11857y(), 13.0f);
            int b2 = (int) C4883m.m19231b(missionTitleViewHolder.mo11857y(), 4.0f);
            if (this.f14315b == C4961l.home_t_recommend_mission) {
                bVar.setMargins(b, b2, 0, b);
            } else {
                bVar.setMargins(b, 0, 0, b);
            }
            missionTitleViewHolder.mTitleText.setLayoutParams(bVar);
        }

        /* renamed from: b */
        public MissionTitleViewHolder mo11792a(ViewGroup viewGroup) {
            return new MissionTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C4957h.view_main_s_mission_title, viewGroup, false));
        }
    }

    public C5034r(Context context, List<ActivityDetailData> list) {
        this.f14302c = context;
        this.f14303d = list;
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f14303d.size();
    }

    /* renamed from: a */
    public Object mo1975a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f14302c).inflate(C4957h.view_activity_item_cm, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C4956g.cover);
        View findViewById = inflate.findViewById(C4956g.mask);
        ImageLoader.getInstance().displayImage(this.f14303d.get(i).getImage(), imageView, C4452a.m17659a(C4959j.default_activity));
        if (this.f14303d.get(i).getStatus() == 1) {
            imageView.setOnClickListener(new C5033q(this, i));
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void mo1981a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public void mo14105a(C5035a aVar) {
        this.f14304e = aVar;
    }

    /* renamed from: a */
    public boolean mo1982a(View view, Object obj) {
        return view.equals(obj);
    }
}
