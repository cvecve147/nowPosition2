package com.marshalchen.ultimaterecyclerview.layoutmanagers;

import android.content.Context;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;

public class ScrollSmoothLineaerLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    private final int f12471H;

    public ScrollSmoothLineaerLayoutManager(Context context, int i, boolean z, int i2) {
        super(context, i, z);
        this.f12471H = i2;
    }

    /* renamed from: D */
    public boolean mo3366D() {
        return false;
    }

    /* renamed from: e */
    public void mo3390e(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        try {
            super.mo3390e(pVar, tVar);
        } catch (Exception unused) {
        }
    }
}
