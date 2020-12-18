package com.google.android.gms.ads.p068d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C1628a;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3248ku;

@C2478La
/* renamed from: com.google.android.gms.ads.d.b */
public final class C1644b extends ViewGroup {

    /* renamed from: a */
    private final C3248ku f5471a;

    public final C1628a getAdListener() {
        return this.f5471a.mo9655b();
    }

    public final C1642d getAdSize() {
        return this.f5471a.mo9657c();
    }

    public final String getAdUnitId() {
        return this.f5471a.mo9659e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C1642d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e) {
                C2227Cf.m9533b("Unable to retrieve ad size.", e);
            }
            if (dVar != null) {
                Context context = getContext();
                int b = dVar.mo6581b(context);
                i3 = dVar.mo6579a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(C1628a aVar) {
        this.f5471a.mo9647a(aVar);
    }

    public final void setAdSize(C1642d dVar) {
        this.f5471a.mo9654a(dVar);
    }

    public final void setAdUnitId(String str) {
        this.f5471a.mo9652a(str);
    }
}
