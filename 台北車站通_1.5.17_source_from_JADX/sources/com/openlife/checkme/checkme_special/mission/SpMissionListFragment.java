package com.openlife.checkme.checkme_special.mission;

import android.os.Bundle;
import android.support.p011v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.account.history.C4477d;
import com.openlife.checkme.activity.account.history.C4478e;
import com.openlife.checkme.activity.account.history.C4481h;
import com.openlife.checkme.net.model.PointHistoryData;
import java.util.List;

public class SpMissionListFragment extends C4672k<C4481h, C4478e> implements C4477d {

    /* renamed from: a */
    private C4481h f14080a;

    /* renamed from: b */
    private SpMissionListAdapter f14081b;
    UltimateRecyclerView mRecyclerView;

    /* renamed from: a */
    private void m19402a(View view, int i) {
        ((TextView) view.findViewById(C4956g.empty_text)).setText(i);
    }

    /* renamed from: g */
    public static SpMissionListFragment m19403g() {
        SpMissionListFragment spMissionListFragment = new SpMissionListFragment();
        spMissionListFragment.setArguments(new Bundle());
        return spMissionListFragment;
    }

    /* renamed from: a */
    public void mo12615a() {
        m19402a(this.mRecyclerView.getEmptyView(), C4961l.account_not_get_point_currently);
    }

    /* renamed from: a */
    public void mo12616a(List<PointHistoryData> list) {
        this.f14081b.mo13157a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12617b() {
        this.f14081b.mo13161o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_mission_list_s_cm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4481h mo12600l() {
        return this.f14080a;
    }

    /* renamed from: o */
    public void mo13460o() {
        this.f14081b = new SpMissionListAdapter();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        this.mRecyclerView.mo11743a(C4957h.view_empty_cm, UltimateRecyclerView.f12350c);
        this.mRecyclerView.setAdapter(this.f14081b);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo13460o();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14080a = new C4481h(this, new C4478e());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    public void onResume() {
        super.onResume();
        this.f14080a.mo12627c();
    }
}
