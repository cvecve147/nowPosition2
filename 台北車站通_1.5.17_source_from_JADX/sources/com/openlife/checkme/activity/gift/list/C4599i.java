package com.openlife.checkme.activity.gift.list;

import android.app.Fragment;
import android.app.FragmentManager;
import com.openlife.checkme.net.model.AdData;
import p013b.p018b.p026g.p027a.C1005b;

/* renamed from: com.openlife.checkme.activity.gift.list.i */
public class C4599i extends C1005b {

    /* renamed from: h */
    private AdData f13393h = new AdData();

    /* renamed from: i */
    protected C4600a f13394i;

    /* renamed from: com.openlife.checkme.activity.gift.list.i$a */
    public interface C4600a {
        /* renamed from: a */
        void mo12828a(String str);
    }

    public C4599i(FragmentManager fragmentManager, AdData adData) {
        super(fragmentManager);
        this.f13393h = adData;
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f13393h.getBanner().size();
    }

    /* renamed from: a */
    public void mo12830a(C4600a aVar) {
        this.f13394i = aVar;
    }

    /* renamed from: c */
    public Fragment mo5001c(int i) {
        GiftAdFragment a = GiftAdFragment.m18106a(this.f13393h.getBanner().get(i).getImage(), this.f13393h.getBanner().get(i).getUrl());
        a.mo12799a(new C4598h(this));
        return a;
    }
}
