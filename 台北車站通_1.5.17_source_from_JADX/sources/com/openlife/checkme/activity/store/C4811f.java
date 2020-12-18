package com.openlife.checkme.activity.store;

import android.app.Fragment;
import android.app.FragmentManager;
import com.openlife.checkme.net.model.AdData;
import p013b.p018b.p026g.p027a.C1005b;

/* renamed from: com.openlife.checkme.activity.store.f */
public class C4811f extends C1005b {

    /* renamed from: h */
    private AdData f13832h = new AdData();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4812a f13833i;

    /* renamed from: com.openlife.checkme.activity.store.f$a */
    public interface C4812a {
        /* renamed from: a */
        void mo13286a(String str);
    }

    public C4811f(FragmentManager fragmentManager, AdData adData) {
        super(fragmentManager);
        this.f13832h = adData;
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f13832h.getBanner().size();
    }

    /* renamed from: a */
    public void mo13287a(C4812a aVar) {
        this.f13833i = aVar;
    }

    /* renamed from: c */
    public Fragment mo5001c(int i) {
        StoreAdFragment a = StoreAdFragment.m18924a(this.f13832h.getBanner().get(i).getImage(), this.f13832h.getBanner().get(i).getUrl());
        a.mo13264a(new C4810e(this));
        return a;
    }
}
