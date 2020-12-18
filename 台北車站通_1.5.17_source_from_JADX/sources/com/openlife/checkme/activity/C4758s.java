package com.openlife.checkme.activity;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.marshalchen.ultimaterecyclerview.C4195q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.openlife.checkme.activity.s */
public abstract class C4758s<T> extends C4195q {

    /* renamed from: o */
    protected Context f13713o;

    /* renamed from: p */
    protected List<T> f13714p = new ArrayList();

    /* renamed from: a */
    public RecyclerView.C0778w mo11794a(ViewGroup viewGroup) {
        return mo12612b(viewGroup);
    }

    /* renamed from: a */
    public void mo13157a(List<T> list) {
        this.f13714p.addAll(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract RecyclerView.C0778w mo12612b(ViewGroup viewGroup);

    /* renamed from: b */
    public void mo346b(RecyclerView.C0778w wVar, int i) {
        mo12614c(wVar, i);
    }

    /* renamed from: b */
    public void mo13158b(List<T> list) {
        this.f13714p = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo12614c(RecyclerView.C0778w wVar, int i);

    /* renamed from: d */
    public RecyclerView.C0778w mo11797d(View view) {
        return new C4194p(view);
    }

    /* renamed from: e */
    public int mo11799e() {
        return mo13159m();
    }

    /* renamed from: e */
    public RecyclerView.C0778w mo11800e(View view) {
        return new C4194p(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo13159m() {
        return this.f13714p.size();
    }

    /* renamed from: n */
    public List<T> mo13160n() {
        return this.f13714p;
    }

    /* renamed from: o */
    public void mo13161o() {
        this.f13714p.clear();
    }
}
