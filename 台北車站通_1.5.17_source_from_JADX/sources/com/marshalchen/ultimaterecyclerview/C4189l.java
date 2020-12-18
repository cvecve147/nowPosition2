package com.marshalchen.ultimaterecyclerview;

import android.support.p011v7.widget.RecyclerView;

/* renamed from: com.marshalchen.ultimaterecyclerview.l */
class C4189l extends RecyclerView.C0766n {

    /* renamed from: a */
    final /* synthetic */ UltimateRecyclerView f12466a;

    C4189l(UltimateRecyclerView ultimateRecyclerView) {
        this.f12466a = ultimateRecyclerView;
    }

    /* renamed from: a */
    public void mo3951a(RecyclerView recyclerView, int i, int i2) {
        super.mo3951a(recyclerView, i, i2);
        if (this.f12466a.f12378aa != null) {
            UltimateRecyclerView ultimateRecyclerView = this.f12466a;
            int unused = ultimateRecyclerView.f12379ba = ultimateRecyclerView.f12379ba + i2;
            if (UltimateRecyclerView.f12354g) {
                UltimateRecyclerView ultimateRecyclerView2 = this.f12466a;
                ultimateRecyclerView2.mo11742a((float) ultimateRecyclerView2.f12379ba);
            }
        }
        this.f12466a.m16605b(recyclerView);
        this.f12466a.mo11744a(recyclerView);
    }
}
