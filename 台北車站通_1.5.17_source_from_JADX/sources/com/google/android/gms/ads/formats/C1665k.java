package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3047dw;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.ads.formats.k */
public final class C1665k extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f5490a;

    /* renamed from: b */
    private final C3047dw f5491b;

    /* renamed from: a */
    private final View m7562a(String str) {
        try {
            C5464b h = this.f5491b.mo8762h(str);
            if (h != null) {
                return (View) C5468d.m20962z(h);
            }
            return null;
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    /* renamed from: a */
    private final void m7563a(String str, View view) {
        try {
            this.f5491b.mo8757a(str, C5468d.m20961a(view));
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f5490a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f5490a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final C1647a getAdChoicesView() {
        View a = m7562a("3011");
        if (a instanceof C1647a) {
            return (C1647a) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return m7562a("3005");
    }

    public final View getBodyView() {
        return m7562a("3004");
    }

    public final View getCallToActionView() {
        return m7562a("3002");
    }

    public final View getHeadlineView() {
        return m7562a("3001");
    }

    public final View getIconView() {
        return m7562a("3003");
    }

    public final View getImageView() {
        return m7562a("3008");
    }

    public final C1648b getMediaView() {
        View a = m7562a("3010");
        if (a instanceof C1648b) {
            return (C1648b) a;
        }
        if (a == null) {
            return null;
        }
        C2227Cf.m9532b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return m7562a("3007");
    }

    public final View getStarRatingView() {
        return m7562a("3009");
    }

    public final View getStoreView() {
        return m7562a("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C3047dw dwVar = this.f5491b;
        if (dwVar != null) {
            try {
                dwVar.mo8759d(C5468d.m20961a(view), i);
            } catch (RemoteException e) {
                C2227Cf.m9533b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f5490a);
    }

    public final void removeView(View view) {
        if (this.f5490a != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(C1647a aVar) {
        m7563a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        m7563a("3005", view);
    }

    public final void setBodyView(View view) {
        m7563a("3004", view);
    }

    public final void setCallToActionView(View view) {
        m7563a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f5491b.mo8761e(C5468d.m20961a(view));
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m7563a("3001", view);
    }

    public final void setIconView(View view) {
        m7563a("3003", view);
    }

    public final void setImageView(View view) {
        m7563a("3008", view);
    }

    public final void setMediaView(C1648b bVar) {
        m7563a("3010", bVar);
    }

    public final void setNativeAd(C1663j jVar) {
        try {
            this.f5491b.mo8758d((C5464b) jVar.mo6666k());
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m7563a("3007", view);
    }

    public final void setStarRatingView(View view) {
        m7563a("3009", view);
    }

    public final void setStoreView(View view) {
        m7563a("3006", view);
    }
}
