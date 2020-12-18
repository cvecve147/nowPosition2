package com.openlife.checkme.activity.account.history;

import android.content.Context;
import android.os.Bundle;
import android.support.p007v4.widget.SwipeRefreshLayout;
import android.support.p011v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.net.model.PointHistoryData;
import java.util.List;

public class HistoryFragment extends C4672k<C4481h, C4478e> implements C4477d {

    /* renamed from: a */
    HistoryAdapter f13165a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4481h f13166b;

    /* renamed from: c */
    private Context f13167c;

    /* renamed from: d */
    private SwipeRefreshLayout.C0531b f13168d = new C4474a(this);
    UltimateRecyclerView recyclerView;

    /* renamed from: a */
    private void m17747a(View view, int i) {
        ((TextView) view.findViewById(C4956g.empty_text)).setText(i);
    }

    /* renamed from: k */
    public static HistoryFragment m17748k() {
        return new HistoryFragment();
    }

    /* renamed from: a */
    public void mo12615a() {
        m17747a(this.recyclerView.getEmptyView(), C4961l.account_not_get_point_currently);
        this.recyclerView.setRefreshing(false);
    }

    /* renamed from: a */
    public void mo12616a(List<PointHistoryData> list) {
        this.f13165a.mo13157a(list);
        this.f13165a.mo3798c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12617b() {
        this.f13165a.mo13161o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C4481h mo12600l() {
        return this.f13166b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_account_history_cm;
    }

    /* renamed from: o */
    public void mo12619o() {
        this.f13165a = new HistoryAdapter();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.f13167c));
        this.recyclerView.mo11743a(C4957h.view_empty_cm, UltimateRecyclerView.f12350c);
        this.recyclerView.setDefaultOnRefreshListener(this.f13168d);
        this.recyclerView.setAdapter(this.f13165a);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13167c = getActivity().getBaseContext();
        mo12619o();
        this.f13166b.mo12627c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13166b = new C4481h(this, new C4478e());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
