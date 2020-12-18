package com.google.android.gms.ads.p065a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C1628a;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.C1668g;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.C1815k;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3248ku;

/* renamed from: com.google.android.gms.ads.a.d */
public final class C1632d extends ViewGroup {

    /* renamed from: a */
    private final C3248ku f5443a;

    public final C1628a getAdListener() {
        return this.f5443a.mo9655b();
    }

    public final C1642d getAdSize() {
        return this.f5443a.mo9657c();
    }

    public final C1642d[] getAdSizes() {
        return this.f5443a.mo9658d();
    }

    public final String getAdUnitId() {
        return this.f5443a.mo9659e();
    }

    public final C1629a getAppEventListener() {
        return this.f5443a.mo9660f();
    }

    public final String getMediationAdapterClassName() {
        return this.f5443a.mo9661g();
    }

    public final C1631c getOnCustomRenderedAdLoadedListener() {
        return this.f5443a.mo9662h();
    }

    public final C1813j getVideoController() {
        return this.f5443a.mo9663i();
    }

    public final C1815k getVideoOptions() {
        return this.f5443a.mo9664j();
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
        this.f5443a.mo9647a(aVar);
    }

    public final void setAdSizes(C1642d... dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f5443a.mo9656b(dVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f5443a.mo9652a(str);
    }

    public final void setAppEventListener(C1629a aVar) {
        this.f5443a.mo9645a(aVar);
    }

    public final void setCorrelator(C1668g gVar) {
        this.f5443a.mo9648a(gVar);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f5443a.mo9653a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(C1631c cVar) {
        this.f5443a.mo9646a(cVar);
    }

    public final void setVideoOptions(C1815k kVar) {
        this.f5443a.mo9649a(kVar);
    }
}
