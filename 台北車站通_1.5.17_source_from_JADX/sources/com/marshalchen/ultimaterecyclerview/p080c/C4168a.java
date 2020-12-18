package com.marshalchen.ultimaterecyclerview.p080c;

import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.marshalchen.ultimaterecyclerview.C4195q;
import java.util.List;

/* renamed from: com.marshalchen.ultimaterecyclerview.c.a */
public abstract class C4168a<T, BINDHOLDER extends C4194p> extends C4195q {

    /* renamed from: o */
    protected List<T> f12421o;

    /* renamed from: a */
    public C4194p m16627a(ViewGroup viewGroup) {
        return mo11803g(LayoutInflater.from(viewGroup.getContext()).inflate(mo11805m(), viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11795a(BINDHOLDER bindholder, T t, int i);

    /* renamed from: b */
    public void mo346b(RecyclerView.C0778w wVar, int i) {
        T t;
        if (mo344b(i) == 4) {
            mo11796c(wVar, i);
        } else if (mo344b(i) == 5) {
            mo11798d(wVar, i);
        } else if (mo344b(i) == 1) {
            mo11802f(wVar, i);
        } else if (mo344b(i) == 2) {
            mo11801e(wVar, i);
        } else if (mo344b(i) == 0) {
            synchronized (this.f12493l) {
                t = this.f12421o.get(mo11804i(i));
            }
            mo11795a((C4194p) wVar, t, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11796c(RecyclerView.C0778w wVar, int i) {
    }

    /* renamed from: d */
    public BINDHOLDER m16632d(View view) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11798d(RecyclerView.C0778w wVar, int i) {
    }

    /* renamed from: e */
    public int mo11799e() {
        return this.f12421o.size();
    }

    /* renamed from: e */
    public BINDHOLDER m16636e(View view) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11801e(RecyclerView.C0778w wVar, int i) {
    }

    /* renamed from: f */
    public void mo11802f(RecyclerView.C0778w wVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract BINDHOLDER mo11803g(View view);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo11804i(int i) {
        int i2 = i + (mo11873h() ? -1 : 0);
        if (i2 < mo11799e() && i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo11805m();
}
