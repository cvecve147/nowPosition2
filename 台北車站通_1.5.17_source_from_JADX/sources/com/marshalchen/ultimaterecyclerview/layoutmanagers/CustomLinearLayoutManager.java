package com.marshalchen.ultimaterecyclerview.layoutmanagers;

import android.content.Context;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CustomLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    private int[] f12470H = new int[2];

    public CustomLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    private void m16686a(RecyclerView.C0769p pVar, int i, int i2, int i3, int[] iArr) {
        View d = pVar.mo3988d(i);
        if (d != null) {
            RecyclerView.C0762j jVar = (RecyclerView.C0762j) d.getLayoutParams();
            d.measure(ViewGroup.getChildMeasureSpec(i2, mo3928o() + mo3930p(), jVar.width), ViewGroup.getChildMeasureSpec(i3, mo3931q() + mo3926n(), jVar.height));
            iArr[0] = d.getMeasuredWidth() + jVar.leftMargin + jVar.rightMargin;
            iArr[1] = d.getMeasuredHeight() + jVar.bottomMargin + jVar.topMargin;
            pVar.mo3981b(d);
        }
    }

    /* renamed from: a */
    public void mo3856a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < mo3918j(); i5++) {
            m16686a(pVar, i5, View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(i5, 0), this.f12470H);
            if (mo3497I() == 0) {
                int[] iArr = this.f12470H;
                i4 += iArr[0];
                if (i5 == 0) {
                    i3 = iArr[1];
                }
            } else {
                int[] iArr2 = this.f12470H;
                i3 += iArr2[1];
                if (i5 == 0) {
                    i4 = iArr2[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i4;
        }
        if (mode2 != 1073741824) {
            size2 = i3;
        }
        mo3892c(size, size2);
    }
}
