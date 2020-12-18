package com.openlife.checkme.activity.home;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.support.p011v7.widget.Toolbar;
import android.support.percent.PercentRelativeLayout;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.account.AccountActivity;
import com.openlife.checkme.activity.exploration.ExplorationActivity;
import com.openlife.checkme.activity.gift.list.GiftListActivity;
import com.openlife.checkme.activity.other.OtherActivity;
import com.openlife.checkme.activity.store.StoreActivity;
import com.openlife.checkme.beaconservice.BeaconJobService;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.AdBannerData;
import com.openlife.checkme.net.model.GiftData;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p087a.C4454b;
import com.openlife.checkme.p100ui.C5041s;
import com.openlife.checkme.p100ui.PointCircleView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p108c.p109a.C5197l;

public class MainFragment extends C4672k<C4633G, C4629C> implements C4628B {

    /* renamed from: a */
    MainAdapter f13475a;
    AppBarLayout appBarLayout;

    /* renamed from: b */
    int f13476b;

    /* renamed from: c */
    boolean f13477c;
    CollapsingToolbarLayout collapsingToolbarLayout;

    /* renamed from: d */
    boolean f13478d = false;

    /* renamed from: e */
    private Context f13479e;

    /* renamed from: f */
    private List<C5197l> f13480f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4454b f13481g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4642a f13482h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4633G f13483i;

    /* renamed from: j */
    private boolean f13484j = false;

    /* renamed from: k */
    private int f13485k;

    /* renamed from: l */
    private C4454b.C4456b f13486l = new C4651i(this);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Animator.AnimatorListener f13487m = new C4648f(this);
    RecyclerView mRecyclerView;

    /* renamed from: n */
    private Runnable f13488n = new C4649g(this);
    TextView point;
    PointCircleView pointCircle;
    PercentRelativeLayout pointStatusLayout;
    TextView slogan;
    TextView titlePoint;
    Toolbar toolbar;

    /* renamed from: com.openlife.checkme.activity.home.MainFragment$a */
    private class C4642a implements AppBarLayout.C0096b {

        /* renamed from: a */
        private float f13489a = 0.0f;

        public C4642a(float f) {
            this.f13489a = f;
        }

        /* renamed from: a */
        public void mo431a(AppBarLayout appBarLayout, int i) {
            Animator.AnimatorListener animatorListener;
            ViewPropertyAnimator viewPropertyAnimator;
            if (i == 0 || ((double) (((float) (-i)) / this.f13489a)) < 0.5d) {
                MainFragment mainFragment = MainFragment.this;
                mainFragment.f13476b = 11;
                viewPropertyAnimator = mainFragment.toolbar.animate().alpha(0.0f).setDuration(600);
                animatorListener = MainFragment.this.f13487m;
            } else {
                MainFragment mainFragment2 = MainFragment.this;
                mainFragment2.f13478d = true;
                mainFragment2.f13476b = 12;
                mainFragment2.toolbar.setVisibility(0);
                viewPropertyAnimator = MainFragment.this.toolbar.animate().alpha(1.0f).setDuration(600);
                animatorListener = null;
            }
            viewPropertyAnimator.setListener(animatorListener).start();
        }
    }

    /* renamed from: g */
    public static MainFragment m18325g() {
        return new MainFragment();
    }

    /* renamed from: a */
    public void mo12876a() {
        AccountActivity.m17702a(getActivity());
    }

    /* renamed from: a */
    public void mo12877a(int i) {
        C5041s sVar = new C5041s(this.pointCircle, 360);
        sVar.setDuration(1500);
        sVar.setInterpolator(new AccelerateDecelerateInterpolator());
        this.point.setText(String.valueOf(i));
        this.pointCircle.startAnimation(sVar);
    }

    /* renamed from: a */
    public void mo12878a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo12879a(String str) {
        this.slogan.setText(getString(C4961l.home_slogan, new Object[]{str}));
    }

    /* renamed from: a */
    public void mo12880a(List<GiftData> list) {
        this.f13475a.mo12912a(list);
    }

    /* renamed from: a */
    public void mo12881a(List<MissionData> list, List<MissionData> list2) {
        this.f13475a.mo12913a(list, list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        this.f13484j = z;
        this.f13485k = i;
        if (z) {
            this.pointStatusLayout.setBackgroundResource(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void account() {
        this.f13483i.mo12907f();
    }

    /* renamed from: b */
    public void mo12882b() {
        this.f13483i.mo13152a(getActivity());
    }

    /* renamed from: b */
    public void mo12883b(List<AdBannerData> list) {
    }

    /* renamed from: c */
    public void mo12884c(int i) {
        this.titlePoint.setVisibility(0);
        this.titlePoint.setText(String.valueOf(i));
    }

    /* renamed from: c */
    public void mo12926c(List<String> list) {
        mo12927d(list);
    }

    /* renamed from: d */
    public void mo12885d(int i) {
        mo12879a(getString(i));
    }

    /* renamed from: d */
    public void mo12927d(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            BeaconJobService.m19042a(this.f13479e, (ArrayList<String>) (ArrayList) list);
            return;
        }
        Intent intent = new Intent(this.f13479e, BeaconService.class);
        intent.putStringArrayListExtra("EXTRA_BEACON_LIST", (ArrayList) list);
        this.f13479e.stopService(intent);
        this.f13479e.startService(intent);
    }

    /* renamed from: e */
    public void mo12928e(int i) {
        List<C5197l> list = this.f13480f;
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_setting);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4652j(this));
        aVar.mo14382a((C5197l.C5207j) new C4650h(this));
        list.add(aVar.mo14395c());
    }

    /* renamed from: f */
    public void mo12756f() {
        super.mo12756f();
        getActivity().runOnUiThread(new C4657o(this));
    }

    /* renamed from: h */
    public void mo12929h(int i) {
        List<C5197l> list = this.f13480f;
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_retry);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4654l(this));
        aVar.mo14382a((C5197l.C5207j) new C4653k(this));
        aVar.mo14385a(false);
        list.add(aVar.mo14395c());
    }

    /* renamed from: i */
    public void mo12930i(int i) {
        List<C5197l> list = this.f13480f;
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4656n(this));
        aVar.mo14382a((C5197l.C5207j) new C4655m(this));
        aVar.mo14385a(false);
        list.add(aVar.mo14395c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_main_cm;
    }

    /* renamed from: k */
    public C4633G mo12600l() {
        return this.f13483i;
    }

    /* access modifiers changed from: package-private */
    public void location() {
        ExplorationActivity.m17961a(getActivity());
    }

    /* renamed from: o */
    public void mo12933o() {
        this.toolbar.setVisibility(4);
        this.mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        this.f13475a = new MainAdapter(new C4658p(this), new C4659q(this), new C4646d(this), new C4647e(this));
        this.mRecyclerView.setAdapter(this.f13475a);
        this.collapsingToolbarLayout.setContentScrimColor(C1006a.m5386a(this.f13479e, this.f13484j ? this.f13485k : C4948e.cyan));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13479e = getActivity().getBaseContext();
        mo12933o();
        this.f13483i.mo12904c();
        this.f13483i.mo12902a(Long.valueOf(new Date().getTime()));
        this.f13481g = new C4454b(getActivity().getBaseContext());
        this.f13481g.mo12564a(this.f13486l);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13483i = new C4633G(this, new C4629C());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13483i.mo12903b(getActivity().getApplication());
        this.f13481g.mo12567d();
        for (C5197l next : this.f13480f) {
            if (next != null) {
                next.dismiss();
            }
        }
        this.f13480f.clear();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.toolbar.animate().alpha(0.0f).setDuration(600).setListener((Animator.AnimatorListener) null);
        mo12970m().mo5375a();
    }

    public void onPause() {
        super.onPause();
        this.f13481g.mo12565b();
        this.appBarLayout.mo370b((AppBarLayout.C0096b) this.f13482h);
        this.collapsingToolbarLayout.removeCallbacks(this.f13488n);
    }

    public void onResume() {
        super.onResume();
        this.f13483i.mo12905d();
        this.f13481g.mo12562a();
        this.collapsingToolbarLayout.post(this.f13488n);
    }

    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: package-private */
    public void others() {
        OtherActivity.m18687a(getActivity());
    }

    /* access modifiers changed from: package-private */
    public void playMission() {
        StoreActivity.m18921a(getActivity());
    }

    /* access modifiers changed from: package-private */
    public void redeemGift() {
        GiftListActivity.m18113a(getActivity());
    }
}
