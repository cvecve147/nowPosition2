package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.p065a.C1629a;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C3248ku;

/* renamed from: com.google.android.gms.ads.f */
class C1646f extends ViewGroup {

    /* renamed from: a */
    protected final C3248ku f5472a;

    public C1646f(Context context, int i) {
        super(context);
        this.f5472a = new C3248ku(this, i);
    }

    /* renamed from: a */
    public void mo6595a() {
        this.f5472a.mo9644a();
    }

    /* renamed from: a */
    public void mo6596a(C1637c cVar) {
        this.f5472a.mo9651a(cVar.mo6566a());
    }

    /* renamed from: b */
    public void mo6597b() {
        this.f5472a.mo9665k();
    }

    /* renamed from: c */
    public void mo6598c() {
        this.f5472a.mo9666l();
    }

    public C1628a getAdListener() {
        return this.f5472a.mo9655b();
    }

    public C1642d getAdSize() {
        return this.f5472a.mo9657c();
    }

    public String getAdUnitId() {
        return this.f5472a.mo9659e();
    }

    public String getMediationAdapterClassName() {
        return this.f5472a.mo9661g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void setAdListener(C1628a aVar) {
        this.f5472a.mo9647a(aVar);
        if (aVar == null) {
            this.f5472a.mo9650a((C2845Xs) null);
            this.f5472a.mo9645a((C1629a) null);
            return;
        }
        if (aVar instanceof C2845Xs) {
            this.f5472a.mo9650a((C2845Xs) aVar);
        }
        if (aVar instanceof C1629a) {
            this.f5472a.mo9645a((C1629a) aVar);
        }
    }

    public void setAdSize(C1642d dVar) {
        this.f5472a.mo9654a(dVar);
    }

    public void setAdUnitId(String str) {
        this.f5472a.mo9652a(str);
    }
}
