package com.openlife.checkme.activity.store;

import android.app.Fragment;
import android.app.FragmentManager;
import com.openlife.checkme.activity.store.list.StoreListFragment;
import p013b.p018b.p026g.p027a.C1005b;

/* renamed from: com.openlife.checkme.activity.store.i */
public class C4815i extends C1005b {

    /* renamed from: h */
    StoreListFragment f13836h = StoreListFragment.m18986a(0, 113);

    /* renamed from: i */
    StoreListFragment f13837i = StoreListFragment.m18986a(1, 113);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4816a f13838j;

    /* renamed from: com.openlife.checkme.activity.store.i$a */
    public interface C4816a {
        /* renamed from: a */
        void mo13290a();
    }

    public C4815i(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f13836h.mo13300a((StoreListFragment.C4822a) new C4813g(this));
        this.f13837i.mo13300a((StoreListFragment.C4822a) new C4814h(this));
    }

    /* renamed from: a */
    public int mo1972a() {
        return 2;
    }

    /* renamed from: c */
    public Fragment mo5001c(int i) {
        return i != 0 ? i != 1 ? new Fragment() : this.f13837i : this.f13836h;
    }

    /* renamed from: d */
    public void mo13289d(int i) {
        this.f13836h.mo13299a(i);
        this.f13837i.mo13299a(i);
    }
}
