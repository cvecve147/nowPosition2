package com.openlife.checkme.activity.store.list;

import android.support.p011v7.widget.GridLayoutManager;

/* renamed from: com.openlife.checkme.activity.store.list.b */
class C4824b extends GridLayoutManager.C0718c {

    /* renamed from: c */
    final /* synthetic */ StoreListFragment f13858c;

    C4824b(StoreListFragment storeListFragment) {
        this.f13858c = storeListFragment;
    }

    /* renamed from: b */
    public int mo3394b(int i) {
        switch (this.f13858c.f13851a.mo13295d()) {
            case 111:
            case 112:
                return 2;
            case 113:
                return 1;
            default:
                return -1;
        }
    }
}
