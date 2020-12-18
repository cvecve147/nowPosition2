package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3047dw;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.ads.formats.e */
public class C1654e extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f5485a;

    /* renamed from: b */
    private final C3047dw f5486b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo6627a(String str) {
        try {
            C5464b h = this.f5486b.mo8762h(str);
            if (h != null) {
                return (View) C5468d.m20962z(h);
            }
            return null;
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6628a(String str, View view) {
        try {
            this.f5486b.mo8757a(str, C5468d.m20961a(view));
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f5485a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f5485a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public C1647a getAdChoicesView() {
        View a = mo6627a("1098");
        if (a instanceof C1647a) {
            return (C1647a) a;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C3047dw dwVar = this.f5486b;
        if (dwVar != null) {
            try {
                dwVar.mo8759d(C5468d.m20961a(view), i);
            } catch (RemoteException e) {
                C2227Cf.m9533b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f5485a);
    }

    public void removeView(View view) {
        if (this.f5485a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(C1647a aVar) {
        mo6628a("1098", aVar);
    }

    public void setNativeAd(C1649c cVar) {
        try {
            this.f5486b.mo8758d((C5464b) cVar.mo6612a());
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call setNativeAd on delegate", e);
        }
    }
}
