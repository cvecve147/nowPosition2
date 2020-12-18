package com.openlife.checkme.checkme_special.home;

import android.content.Context;
import android.os.Bundle;
import android.support.p011v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.checkme_special.other.SpOtherActivity;
import com.openlife.checkme.net.model.AdBannerData;
import com.openlife.checkme.net.model.GiftData;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p087a.C4454b;
import java.util.List;
import p101d.p108c.p109a.C5197l;

public class SpMainFragment extends C4672k<C4924v, C4923u> implements C4922t {

    /* renamed from: a */
    private Context f14028a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4924v f14029b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4454b f14030c;

    /* renamed from: d */
    private SpMainAdapter f14031d;

    /* renamed from: e */
    private C4454b.C4456b f14032e = new C4916n(this);
    UltimateRecyclerView mRecyclerView;

    /* renamed from: g */
    public static SpMainFragment m19312g() {
        return new SpMainFragment();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m19313o() {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(C4961l.checkme_taipei_service_phone);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14391b((C5197l.C5207j) new C4914l(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: a */
    public void mo12876a() {
    }

    /* renamed from: a */
    public void mo12877a(int i) {
    }

    /* renamed from: a */
    public void mo12878a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo12879a(String str) {
    }

    /* renamed from: a */
    public void mo12880a(List<GiftData> list) {
    }

    /* renamed from: a */
    public void mo12881a(List<MissionData> list, List<MissionData> list2) {
        this.f14031d.mo13419a(list, list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12882b() {
    }

    /* renamed from: b */
    public void mo12883b(List<AdBannerData> list) {
        this.f14031d.mo13418a(list);
    }

    /* renamed from: c */
    public void mo12884c(int i) {
    }

    /* renamed from: c */
    public void mo12926c(List<String> list) {
        mo13433d(list);
    }

    /* renamed from: d */
    public void mo12885d(int i) {
    }

    /* renamed from: d */
    public void mo12962d(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C4915m(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: d */
    public void mo13433d(List<String> list) {
    }

    /* renamed from: e */
    public void mo13434e(int i) {
        setHasOptionsMenu(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.f14031d = new SpMainAdapter(i, new C4917o(this), new C4918p(this), new C4919q(this));
        this.mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        this.mRecyclerView.mo11743a(C4957h.view_empty_cm, UltimateRecyclerView.f12350c);
        this.mRecyclerView.setAdapter(this.f14031d);
    }

    /* renamed from: f */
    public void mo12756f() {
        super.mo12756f();
        getActivity().runOnUiThread(new C4911i(this));
    }

    /* renamed from: h */
    public void mo13435h(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4908f(this));
        aVar.mo14382a((C5197l.C5207j) new C4907e(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: i */
    public void mo13436i(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_setting);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4910h(this));
        aVar.mo14382a((C5197l.C5207j) new C4909g(this));
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_main_cm_s;
    }

    /* renamed from: j */
    public void mo13437j(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_retry);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4913k(this));
        aVar.mo14382a((C5197l.C5207j) new C4912j(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4924v mo12600l() {
        return this.f14029b;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f14028a = getActivity().getBaseContext();
        this.f14030c = new C4454b(getActivity().getBaseContext());
        this.f14030c.mo12564a(this.f14032e);
        this.f14029b.mo13456g();
        this.f14029b.mo12906e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14029b = new C4924v(this, new C4923u());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14030c.mo12567d();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C4956g.other) {
            return super.onOptionsItemSelected(menuItem);
        }
        SpOtherActivity.m19414a(getActivity());
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f14030c.mo12565b();
    }

    public void onResume() {
        super.onResume();
        this.f14030c.mo12562a();
    }

    public void onStart() {
        super.onStart();
    }
}
