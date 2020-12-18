package com.openlife.checkme.activity.account.redemption;

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
import com.openlife.checkme.activity.account.redemption.RedemptionAdapter;
import com.openlife.checkme.net.model.RedeemHistoryData;
import java.util.List;

public class RedemptionFragment extends C4672k<C4520i, C4517f> implements C4516e {

    /* renamed from: a */
    RedemptionAdapter f13198a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4520i f13199b;

    /* renamed from: c */
    private Context f13200c;

    /* renamed from: d */
    private SwipeRefreshLayout.C0531b f13201d = new C4498b(this);
    UltimateRecyclerView recyclerView;

    /* renamed from: a */
    private void m17817a(View view, int i) {
        ((TextView) view.findViewById(C4956g.empty_text)).setText(i);
    }

    /* renamed from: k */
    public static RedemptionFragment m17818k() {
        return new RedemptionFragment();
    }

    /* renamed from: a */
    public void mo12653a() {
        m17817a(this.recyclerView.getEmptyView(), C4961l.account_not_change_gift_currently);
        this.recyclerView.setRefreshing(false);
    }

    /* renamed from: a */
    public void mo12654a(List<RedeemHistoryData> list) {
        this.f13198a.mo13157a(list);
        this.f13198a.mo3798c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12655b() {
        this.f13198a.mo13161o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C4520i mo12600l() {
        return this.f13199b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_account_redemption_cm;
    }

    /* renamed from: o */
    public void mo12657o() {
        this.f13198a = new RedemptionAdapter();
        this.f13198a.mo12649a((RedemptionAdapter.C4495b) new C4497a(this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.f13200c));
        this.recyclerView.mo11743a(C4957h.view_empty_cm, UltimateRecyclerView.f12350c);
        this.recyclerView.setDefaultOnRefreshListener(this.f13201d);
        this.recyclerView.setAdapter(this.f13198a);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13200c = getActivity().getBaseContext();
        mo12657o();
        this.f13199b.mo12687c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13199b = new C4520i(this, new C4517f());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
