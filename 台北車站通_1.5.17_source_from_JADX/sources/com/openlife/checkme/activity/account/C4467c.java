package com.openlife.checkme.activity.account;

import android.app.Fragment;
import android.app.FragmentManager;
import com.openlife.checkme.activity.account.history.HistoryFragment;
import com.openlife.checkme.activity.account.overview.OverviewFragment;
import com.openlife.checkme.activity.account.redemption.RedemptionFragment;
import p013b.p018b.p026g.p027a.C1005b;

/* renamed from: com.openlife.checkme.activity.account.c */
public class C4467c extends C1005b {

    /* renamed from: h */
    OverviewFragment f13158h = OverviewFragment.m17777b();

    /* renamed from: i */
    HistoryFragment f13159i = HistoryFragment.m17748k();

    /* renamed from: j */
    RedemptionFragment f13160j = RedemptionFragment.m17818k();

    public C4467c(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /* renamed from: a */
    public int mo1972a() {
        return 3;
    }

    /* renamed from: c */
    public Fragment mo5001c(int i) {
        if (i == 0) {
            return this.f13158h;
        }
        if (i == 1) {
            return this.f13159i;
        }
        if (i == 2) {
            return this.f13160j;
        }
        throw new NullPointerException("NOT SUPPORT THIS POSITION");
    }
}
