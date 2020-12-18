package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.maps.model.C3991d;
import com.google.android.gms.maps.p075a.C3961c;
import com.google.android.gms.maps.p075a.C3963e;
import com.google.android.gms.maps.p075a.C3971m;
import com.google.android.gms.maps.p075a.C3972n;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5462a;
import p101d.p129g.p131b.p132a.p134b.C5468d;
import p101d.p129g.p131b.p132a.p134b.C5469e;

public class MapView extends FrameLayout {

    /* renamed from: a */
    private final C3957b f11854a;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C3956a implements C3963e {

        /* renamed from: a */
        private final ViewGroup f11855a;

        /* renamed from: b */
        private final C3961c f11856b;

        /* renamed from: c */
        private View f11857c;

        public C3956a(ViewGroup viewGroup, C3961c cVar) {
            C2061y.m9067a(cVar);
            this.f11856b = cVar;
            C2061y.m9067a(viewGroup);
            this.f11855a = viewGroup;
        }

        /* renamed from: a */
        public final void mo11206a(C3981e eVar) {
            try {
                this.f11856b.mo11224a(new C3985i(this, eVar));
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        /* renamed from: e */
        public final void mo11207e(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C3971m.m16059a(bundle, bundle2);
                this.f11856b.mo11225e(bundle2);
                C3971m.m16059a(bundle2, bundle);
                this.f11857c = (View) C5468d.m20962z(this.f11856b.getView());
                this.f11855a.removeAllViews();
                this.f11855a.addView(this.f11857c);
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        /* renamed from: k */
        public final void mo11208k() {
            try {
                this.f11856b.mo11227k();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f11856b.onDestroy();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f11856b.onLowMemory();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        public final void onPause() {
            try {
                this.f11856b.onPause();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        public final void onResume() {
            try {
                this.f11856b.onResume();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }

        /* renamed from: p */
        public final void mo11213p() {
            try {
                this.f11856b.mo11232p();
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C3957b extends C5462a<C3956a> {

        /* renamed from: e */
        private final ViewGroup f11858e;

        /* renamed from: f */
        private final Context f11859f;

        /* renamed from: g */
        private C5469e<C3956a> f11860g;

        /* renamed from: h */
        private final GoogleMapOptions f11861h;

        /* renamed from: i */
        private final List<C3981e> f11862i = new ArrayList();

        C3957b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f11858e = viewGroup;
            this.f11859f = context;
            this.f11861h = googleMapOptions;
        }

        /* renamed from: a */
        public final void mo11214a(C3981e eVar) {
            if (mo14919a() != null) {
                ((C3956a) mo14919a()).mo11206a(eVar);
            } else {
                this.f11862i.add(eVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11215a(C5469e<C3956a> eVar) {
            this.f11860g = eVar;
            if (this.f11860g != null && mo14919a() == null) {
                try {
                    C3980d.m16093a(this.f11859f);
                    C3961c a = C3972n.m16061a(this.f11859f).mo11239a(C5468d.m20961a(this.f11859f), this.f11861h);
                    if (a != null) {
                        this.f11860g.mo14929a(new C3956a(this.f11858e, a));
                        for (C3981e a2 : this.f11862i) {
                            ((C3956a) mo14919a()).mo11206a(a2);
                        }
                        this.f11862i.clear();
                    }
                } catch (RemoteException e) {
                    throw new C3991d(e);
                } catch (C1997i unused) {
                }
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f11854a = new C3957b(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11854a = new C3957b(this, context, GoogleMapOptions.m16000a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11854a = new C3957b(this, context, GoogleMapOptions.m16000a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f11854a = new C3957b(this, context, googleMapOptions);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo11198a() {
        this.f11854a.mo14921b();
    }

    /* renamed from: a */
    public final void mo11199a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f11854a.mo14920a(bundle);
            if (this.f11854a.mo14919a() == null) {
                C5462a.m20946a((FrameLayout) this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public void mo11200a(C3981e eVar) {
        C2061y.m9072a("getMapAsync() must be called on the main thread");
        this.f11854a.mo11214a(eVar);
    }

    /* renamed from: b */
    public final void mo11201b() {
        this.f11854a.mo14922c();
    }

    /* renamed from: c */
    public final void mo11202c() {
        this.f11854a.mo14923d();
    }

    /* renamed from: d */
    public final void mo11203d() {
        this.f11854a.mo14924e();
    }

    /* renamed from: e */
    public final void mo11204e() {
        this.f11854a.mo14925f();
    }

    /* renamed from: f */
    public final void mo11205f() {
        this.f11854a.mo14926g();
    }
}
