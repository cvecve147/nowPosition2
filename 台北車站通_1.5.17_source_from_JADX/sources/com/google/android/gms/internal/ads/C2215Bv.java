package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C2061y;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Bv */
public final class C2215Bv extends C2387Hv {

    /* renamed from: o */
    private C2880Yz f6765o;

    /* renamed from: p */
    private C2965bA f6766p;

    /* renamed from: q */
    private C3052eA f6767q;

    /* renamed from: r */
    private final C2301Ev f6768r;

    /* renamed from: s */
    private C2244Cv f6769s;

    /* renamed from: t */
    private boolean f6770t;

    /* renamed from: u */
    private Object f6771u;

    private C2215Bv(Context context, C2301Ev ev, C2209Bp bp, C2329Fv fv) {
        super(context, ev, (C3370pa) null, bp, (JSONObject) null, fv, (zzang) null, (String) null);
        this.f6770t = false;
        this.f6771u = new Object();
        this.f6768r = ev;
    }

    public C2215Bv(Context context, C2301Ev ev, C2209Bp bp, C2880Yz yz, C2329Fv fv) {
        this(context, ev, bp, fv);
        this.f6765o = yz;
    }

    public C2215Bv(Context context, C2301Ev ev, C2209Bp bp, C2965bA bAVar, C2329Fv fv) {
        this(context, ev, bp, fv);
        this.f6766p = bAVar;
    }

    public C2215Bv(Context context, C2301Ev ev, C2209Bp bp, C3052eA eAVar, C2329Fv fv) {
        this(context, ev, bp, fv);
        this.f6767q = eAVar;
    }

    /* renamed from: b */
    private static HashMap<String, View> m9476b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: A */
    public final void mo7878A() {
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                this.f6769s.mo7878A();
            }
        }
    }

    /* renamed from: Ab */
    public final void mo7879Ab() {
        C2244Cv cv = this.f6769s;
        if (cv != null) {
            cv.mo7879Ab();
        }
    }

    /* renamed from: Bb */
    public final boolean mo7880Bb() {
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                boolean Bb = this.f6769s.mo7880Bb();
                return Bb;
            }
            boolean Kb = this.f6768r.mo6737Kb();
            return Kb;
        }
    }

    /* renamed from: Cb */
    public final void mo7881Cb() {
        C2061y.m9072a("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f6771u) {
            this.f7216k = true;
            if (this.f6769s != null) {
                this.f6769s.mo7881Cb();
            }
        }
    }

    /* renamed from: Db */
    public final void mo7882Db() {
    }

    /* renamed from: Eb */
    public final boolean mo7883Eb() {
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                boolean Eb = this.f6769s.mo7883Eb();
                return Eb;
            }
            boolean Rb = this.f6768r.mo6740Rb();
            return Rb;
        }
    }

    /* renamed from: Gb */
    public final void mo7884Gb() {
    }

    /* renamed from: a */
    public final View mo7885a(View.OnClickListener onClickListener, boolean z) {
        C5464b bVar;
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                View a = this.f6769s.mo7885a(onClickListener, z);
                return a;
            }
            try {
                if (this.f6767q != null) {
                    bVar = this.f6767q.mo9349J();
                } else if (this.f6765o != null) {
                    bVar = this.f6765o.mo9095J();
                } else {
                    if (this.f6766p != null) {
                        bVar = this.f6766p.mo9209J();
                    }
                    bVar = null;
                }
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to call getAdChoicesContent", e);
            }
            if (bVar == null) {
                return null;
            }
            View view = (View) C5468d.m20962z(bVar);
            return view;
        }
    }

    /* renamed from: a */
    public final C3520uh mo7886a() {
        return null;
    }

    /* renamed from: a */
    public final void mo7887a(View view) {
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                this.f6769s.mo7887a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo7888a(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f6771u) {
            try {
                if (this.f6767q != null) {
                    this.f6767q.mo9354b(C5468d.m20961a(view));
                } else if (this.f6765o != null) {
                    this.f6765o.mo9100b(C5468d.m20961a(view));
                } else if (this.f6766p != null) {
                    this.f6766p.mo9215b(C5468d.m20961a(view));
                }
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo7889a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C2301Ev ev;
        C2061y.m9072a("performClick must be called on the main UI thread.");
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                this.f6769s.mo7889a(view, map, bundle, view2);
                this.f6768r.mo8059f();
            } else {
                try {
                    if (this.f6767q != null && !this.f6767q.mo9348H()) {
                        this.f6767q.mo9351a(C5468d.m20961a(view));
                        ev = this.f6768r;
                    } else if (this.f6765o != null && !this.f6765o.mo9094H()) {
                        this.f6765o.mo9097a(C5468d.m20961a(view));
                        ev = this.f6768r;
                    } else if (this.f6766p != null && !this.f6766p.mo9208H()) {
                        this.f6766p.mo9212a(C5468d.m20961a(view));
                        ev = this.f6768r;
                    }
                    ev.mo8059f();
                } catch (RemoteException e) {
                    C2227Cf.m9535c("Failed to call performClick", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7890a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.f6771u) {
            this.f6770t = true;
            HashMap<String, View> b = m9476b(map);
            HashMap<String, View> b2 = m9476b(map2);
            try {
                if (this.f6767q != null) {
                    this.f6767q.mo9352a(C5468d.m20961a(view), C5468d.m20961a(b), C5468d.m20961a(b2));
                } else if (this.f6765o != null) {
                    this.f6765o.mo9098a(C5468d.m20961a(view), C5468d.m20961a(b), C5468d.m20961a(b2));
                    this.f6765o.mo9102c(C5468d.m20961a(view));
                } else if (this.f6766p != null) {
                    this.f6766p.mo9213a(C5468d.m20961a(view), C5468d.m20961a(b), C5468d.m20961a(b2));
                    this.f6766p.mo9217c(C5468d.m20961a(view));
                }
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to call prepareAd", e);
            }
            this.f6770t = false;
        }
    }

    /* renamed from: a */
    public final void mo7891a(C2244Cv cv) {
        synchronized (this.f6771u) {
            this.f6769s = cv;
        }
    }

    /* renamed from: a */
    public final void mo7892a(C2651Qw qw) {
        synchronized (this.f6771u) {
            if (this.f6769s != null) {
                this.f6769s.mo7892a(qw);
            }
        }
    }

    /* renamed from: b */
    public final void mo7893b(View view, Map<String, WeakReference<View>> map) {
        C2301Ev ev;
        C2061y.m9072a("recordImpression must be called on the main UI thread.");
        synchronized (this.f6771u) {
            this.f7215j = true;
            if (this.f6769s != null) {
                this.f6769s.mo7893b(view, map);
                this.f6768r.mo8058e();
            } else {
                try {
                    if (this.f6767q != null && !this.f6767q.mo9346C()) {
                        this.f6767q.mo9357e();
                        ev = this.f6768r;
                    } else if (this.f6765o != null && !this.f6765o.mo9092C()) {
                        this.f6765o.mo9104e();
                        ev = this.f6768r;
                    } else if (this.f6766p != null && !this.f6766p.mo9206C()) {
                        this.f6766p.mo9219e();
                        ev = this.f6768r;
                    }
                    ev.mo8058e();
                } catch (RemoteException e) {
                    C2227Cf.m9535c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo7894c() {
        boolean z;
        synchronized (this.f6771u) {
            z = this.f6770t;
        }
        return z;
    }

    /* renamed from: d */
    public final C2244Cv mo7895d() {
        C2244Cv cv;
        synchronized (this.f6771u) {
            cv = this.f6769s;
        }
        return cv;
    }

    /* renamed from: zb */
    public final void mo7896zb() {
        C2244Cv cv = this.f6769s;
        if (cv != null) {
            cv.mo7896zb();
        }
    }
}
