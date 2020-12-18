package com.openlife.checkme.activity.store.list;

import android.content.Context;
import android.os.Bundle;
import android.support.p011v7.widget.GridLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.store.list.StoreListAdapter;
import com.openlife.checkme.net.model.StoreData;
import java.util.List;

public class StoreListFragment extends C4672k<C4831i, C4828f> implements C4827e {

    /* renamed from: a */
    StoreListAdapter f13851a;

    /* renamed from: b */
    private C4831i f13852b;

    /* renamed from: c */
    private C4822a f13853c;

    /* renamed from: d */
    private Context f13854d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f13855e;
    View emptyView;
    RecyclerView mRecyclerView;

    /* renamed from: com.openlife.checkme.activity.store.list.StoreListFragment$a */
    public interface C4822a {
        /* renamed from: a */
        void mo13288a();
    }

    /* renamed from: a */
    public static StoreListFragment m18986a(int i, int i2) {
        StoreListFragment storeListFragment = new StoreListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("LAUNCH_TYPE", i);
        bundle.putInt("LIST_MODE", i2);
        storeListFragment.setArguments(bundle);
        return storeListFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4831i mo12600l() {
        return this.f13852b;
    }

    /* renamed from: a */
    public void mo13299a(int i) {
        this.f13855e = i;
        StoreListAdapter storeListAdapter = this.f13851a;
        storeListAdapter.f13839c = this.f13855e;
        storeListAdapter.mo3798c();
        C4822a aVar = this.f13853c;
        if (aVar != null) {
            aVar.mo13288a();
        }
    }

    /* renamed from: a */
    public void mo13300a(C4822a aVar) {
        this.f13853c = aVar;
    }

    /* renamed from: a */
    public void mo13301a(List<StoreData> list) {
        this.f13851a.mo13294a(list);
        this.f13851a.mo3798c();
        if (list.isEmpty()) {
            this.emptyView.setVisibility(0);
            this.mRecyclerView.setVisibility(8);
            return;
        }
        this.emptyView.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo13302b() {
        this.f13851a = new StoreListAdapter(getActivity().getBaseContext(), 113);
        this.f13851a.mo13293a((StoreListAdapter.C4820a) new C4823a(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f13854d, 2);
        gridLayoutManager.mo3375a((GridLayoutManager.C0718c) new C4824b(this));
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.f13851a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_store_list_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13854d = getActivity().getBaseContext();
        int i = getArguments().getInt("LAUNCH_TYPE");
        this.f13855e = getArguments().getInt("LIST_MODE");
        mo13302b();
        mo13299a(this.f13855e);
        this.f13852b.mo12683b(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13852b = new C4831i(this, new C4828f());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
