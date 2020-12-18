package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3160hw;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.ads.formats.f */
public final class C1655f {

    /* renamed from: a */
    public static WeakHashMap<View, C1655f> f5487a = new WeakHashMap<>();

    /* renamed from: b */
    private C3160hw f5488b;

    /* renamed from: c */
    private WeakReference<View> f5489c;

    /* renamed from: a */
    private final void m7525a(C5464b bVar) {
        WeakReference<View> weakReference = this.f5489c;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            C2227Cf.m9536d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f5487a.containsKey(view)) {
            f5487a.put(view, this);
        }
        C3160hw hwVar = this.f5488b;
        if (hwVar != null) {
            try {
                hwVar.mo8852d(bVar);
            } catch (RemoteException e) {
                C2227Cf.m9533b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo6637a(C1649c cVar) {
        m7525a((C5464b) cVar.mo6612a());
    }

    /* renamed from: a */
    public final void mo6638a(C1663j jVar) {
        m7525a((C5464b) jVar.mo6666k());
    }
}
