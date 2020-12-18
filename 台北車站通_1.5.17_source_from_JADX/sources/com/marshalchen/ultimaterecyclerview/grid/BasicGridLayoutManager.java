package com.marshalchen.ultimaterecyclerview.grid;

import android.content.Context;
import android.support.p011v7.widget.GridLayoutManager;
import com.marshalchen.ultimaterecyclerview.C4195q;

public class BasicGridLayoutManager extends GridLayoutManager {
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C4195q f12458P;

    /* renamed from: Q */
    protected int f12459Q = 2;

    /* renamed from: R */
    protected GridLayoutManager.C0718c f12460R = new C4184a(this);

    public BasicGridLayoutManager(Context context, int i, int i2, boolean z, C4195q qVar) {
        super(context, i, i2, z);
        this.f12458P = qVar;
        mo3375a(mo11848M());
    }

    public BasicGridLayoutManager(Context context, int i, C4195q qVar) {
        super(context, i);
        this.f12458P = qVar;
        mo3375a(mo11848M());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public GridLayoutManager.C0718c mo11848M() {
        return this.f12460R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo11849l(int i) {
        return 1;
    }
}
