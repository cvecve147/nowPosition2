package com.openlife.checkme.activity.mission.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p007v4.widget.SwipeRefreshLayout;
import android.support.p011v7.widget.GridLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.exploration.ExplorationActivity;
import com.openlife.checkme.activity.mission.list.MissionListAdapter;
import com.openlife.checkme.net.model.MissionData;
import java.util.ArrayList;
import java.util.List;
import p101d.p108c.p109a.C5197l;

public class MissionListFragment extends C4672k<C4735l, C4731h> implements C4730g {

    /* renamed from: a */
    MissionListAdapter f13657a;

    /* renamed from: b */
    private boolean f13658b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f13659c;

    /* renamed from: d */
    private List<C5197l> f13660d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4735l f13661e;

    /* renamed from: f */
    private Context f13662f;

    /* renamed from: g */
    private int f13663g;

    /* renamed from: h */
    private SwipeRefreshLayout.C0531b f13664h = new C4727d(this);
    RecyclerView mRecyclerView;
    SwipeRefreshLayout mSwipeRefreshLayout;

    /* renamed from: a */
    public static MissionListFragment m18641a(int i, boolean z, int i2) {
        MissionListFragment missionListFragment = new MissionListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ID", i);
        bundle.putBoolean("SHOW_TITLE_BAR", z);
        bundle.putInt("LIST_MODEL", i2);
        missionListFragment.setArguments(bundle);
        return missionListFragment;
    }

    /* renamed from: a */
    public void mo13098a() {
        this.f13657a.mo13095e();
    }

    /* renamed from: a */
    public void mo13099a(int i) {
        MissionListAdapter missionListAdapter = this.f13657a;
        missionListAdapter.f13644c = i;
        missionListAdapter.mo3798c();
    }

    /* renamed from: a */
    public void mo13100a(int i, int i2) {
        this.f13657a.mo13093d(i, i2);
    }

    /* renamed from: a */
    public void mo13101a(String str) {
        ((MissionListActivity) getActivity()).mo13088a(str);
    }

    /* renamed from: a */
    public void mo13102a(List<MissionData> list) {
        this.mSwipeRefreshLayout.setRefreshing(false);
        this.f13657a.mo13091a(list);
        this.f13657a.mo3798c();
    }

    /* renamed from: a */
    public void mo13103a(boolean z) {
        setHasOptionsMenu(true);
        this.f13657a = new MissionListAdapter(this.f13662f, z, 113);
        this.f13657a.mo13090a((MissionListAdapter.C4722b) new C4725b(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f13662f, 2);
        gridLayoutManager.mo3375a((GridLayoutManager.C0718c) new C4726c(this));
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.f13657a);
        this.mSwipeRefreshLayout.setOnRefreshListener(this.f13664h);
        mo13099a(this.f13663g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo13104b() {
        List<C5197l> list = this.f13660d;
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(C4961l.missiondetail_finish);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14385a(false);
        list.add(aVar.mo14395c());
    }

    /* renamed from: g */
    public void mo13105g() {
        this.f13661e.mo13124d(this.f13659c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_mission_list_cm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4735l mo12600l() {
        return this.f13661e;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13662f = getActivity().getBaseContext();
        this.f13659c = getArguments().getInt("ID");
        this.f13658b = getArguments().getBoolean("SHOW_TITLE_BAR", true);
        this.f13663g = getArguments().getInt("LIST_MODEL");
        this.f13661e.mo13121c();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        if (i2 == -1 && i == 103 && (intExtra = intent.getIntExtra("id", -1)) != -1) {
            mo13100a(intExtra, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13661e = new C4735l(this, new C4731h());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        for (C5197l next : this.f13660d) {
            if (next != null) {
                next.dismiss();
            }
        }
        this.f13660d.clear();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C4956g.location) {
            return super.onOptionsItemSelected(menuItem);
        }
        ExplorationActivity.m17962a(getActivity(), "COMPANY", this.f13659c);
        return false;
    }

    public void onResume() {
        super.onResume();
        this.f13661e.mo12683b(this.f13659c);
        this.f13661e.mo13123d();
    }
}
