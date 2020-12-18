package com.marshalchen.ultimaterecyclerview.layoutmanagers;

import android.content.Context;
import android.support.p011v7.widget.GridLayoutManager;
import com.marshalchen.ultimaterecyclerview.C4195q;
import com.marshalchen.ultimaterecyclerview.p080c.C4168a;

public class ClassicSpanGridLayoutManager extends GridLayoutManager {

    /* renamed from: P */
    private final C4195q f12467P;

    /* renamed from: Q */
    private int f12468Q = -1;

    /* renamed from: R */
    private GridLayoutManager.C0718c f12469R = new C4190a(this);

    public ClassicSpanGridLayoutManager(Context context, int i, int i2, int i3, C4168a aVar) {
        super(context, i, i3, false);
        this.f12467P = aVar;
        mo3375a(this.f12469R);
        if (i2 > 0) {
            this.f12468Q = i2;
        }
    }

    public ClassicSpanGridLayoutManager(Context context, int i, int i2, C4168a aVar) {
        super(context, i);
        this.f12467P = aVar;
        mo3375a(this.f12469R);
        this.f12468Q = i2;
    }

    public ClassicSpanGridLayoutManager(Context context, int i, C4168a aVar) {
        super(context, i);
        this.f12467P = aVar;
        mo3375a(this.f12469R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo11849l(int i) {
        int b;
        int i2 = this.f12468Q;
        if (i2 == 2) {
            C4195q qVar = this.f12467P;
            if ((qVar instanceof C4168a) && ((b = qVar.mo344b(i)) == 2 || b == 1 || i == 0)) {
                return mo3367L();
            }
        } else if (i2 == -1) {
            C4195q qVar2 = this.f12467P;
            if (qVar2 instanceof C4168a) {
                C4168a aVar = (C4168a) qVar2;
                if (aVar.mo344b(i) == 2) {
                    return mo3367L();
                }
                if (aVar.mo344b(i) == 1) {
                    return mo3367L();
                }
                if (aVar.mo344b(i) == 0) {
                }
            }
        }
        return 1;
    }
}
