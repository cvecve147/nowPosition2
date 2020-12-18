package com.openlife.checkme.activity.mission.detail;

import android.app.Fragment;
import android.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p026g.p027a.C1005b;

/* renamed from: com.openlife.checkme.activity.mission.detail.e */
public class C4709e extends C1005b {

    /* renamed from: h */
    private List<String> f13630h = new ArrayList();

    public C4709e(FragmentManager fragmentManager, List<String> list) {
        super(fragmentManager);
        this.f13630h = list;
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f13630h.size();
    }

    /* renamed from: c */
    public Fragment mo5001c(int i) {
        return MissionDetailAdFragment.m18539a(this.f13630h.get(i));
    }
}
