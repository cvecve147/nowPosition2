package com.marshalchen.ultimaterecyclerview.grid;

import android.support.p011v7.widget.GridLayoutManager;

/* renamed from: com.marshalchen.ultimaterecyclerview.grid.a */
class C4184a extends GridLayoutManager.C0718c {

    /* renamed from: c */
    final /* synthetic */ BasicGridLayoutManager f12461c;

    C4184a(BasicGridLayoutManager basicGridLayoutManager) {
        this.f12461c = basicGridLayoutManager;
    }

    /* renamed from: b */
    public int mo3394b(int i) {
        return this.f12461c.f12458P.mo344b(i) == 2 ? this.f12461c.mo3367L() : this.f12461c.f12458P.mo344b(i) == 1 ? this.f12461c.mo3367L() : this.f12461c.mo11849l(i);
    }
}
