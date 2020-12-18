package com.marshalchen.ultimaterecyclerview;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.marshalchen.ultimaterecyclerview.p078a.C4164b;
import com.marshalchen.ultimaterecyclerview.p082e.C4174c;

/* renamed from: com.marshalchen.ultimaterecyclerview.p */
public class C4194p<T> extends RecyclerView.C0778w implements C4164b {

    /* renamed from: a */
    private SparseArray<SparseArray<View>> f12478a = new SparseArray<>();

    /* renamed from: b */
    private View f12479b;

    /* renamed from: c */
    public C4174c f12480c = null;

    /* renamed from: d */
    public C4174c.C4177c f12481d = null;

    /* renamed from: e */
    public C4174c.C4181g f12482e = null;

    /* renamed from: f */
    public int f12483f = -1;

    public C4194p(View view) {
        super(view);
        this.f12480c = (C4174c) view.findViewById(C4171e.recyclerview_swipe);
        this.f12479b = view;
    }

    /* renamed from: y */
    public Context mo11857y() {
        return this.f12479b.getContext();
    }

    /* renamed from: z */
    public View mo11858z() {
        return this.f12479b;
    }
}
