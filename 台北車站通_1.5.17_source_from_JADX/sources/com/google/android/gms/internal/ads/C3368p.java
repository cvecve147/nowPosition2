package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.p */
public final class C3368p {

    /* renamed from: a */
    private static final Object f9984a = new Object();

    /* renamed from: b */
    private static boolean f9985b = false;

    /* renamed from: c */
    private static boolean f9986c = false;

    /* renamed from: d */
    private C2486Li f9987d;

    /* renamed from: c */
    private final void m13295c(Context context) {
        synchronized (f9984a) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue() && !f9986c) {
                try {
                    f9986c = true;
                    this.f9987d = C2516Mi.m10595a(DynamiteModule.m9187a(context, DynamiteModule.f6574g, ModuleDescriptor.MODULE_ID).mo7730a("com.google.android.gms.ads.omid.DynamiteOmid"));
                } catch (DynamiteModule.C2101a e) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final C5464b mo9846a(String str, WebView webView, String str2, String str3, String str4) {
        synchronized (f9984a) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
                if (f9985b) {
                    try {
                        return this.f9987d.mo8481a(str, C5468d.m20961a(webView), str2, str3, str4);
                    } catch (RemoteException | NullPointerException e) {
                        C2227Cf.m9537d("#007 Could not call remote method.", e);
                        return null;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final String mo9847a(Context context) {
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
            return null;
        }
        try {
            m13295c(context);
            String valueOf = String.valueOf(this.f9987d.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9848a(C5464b bVar) {
        synchronized (f9984a) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
                if (f9985b) {
                    try {
                        this.f9987d.mo8486x(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        C2227Cf.m9537d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9849a(C5464b bVar, View view) {
        synchronized (f9984a) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
                if (f9985b) {
                    try {
                        this.f9987d.mo8482a(bVar, C5468d.m20961a(view));
                    } catch (RemoteException | NullPointerException e) {
                        C2227Cf.m9537d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo9850b(C5464b bVar) {
        synchronized (f9984a) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
                if (f9985b) {
                    try {
                        this.f9987d.mo8484k(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        C2227Cf.m9537d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo9851b(Context context) {
        synchronized (f9984a) {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7952pe)).booleanValue()) {
                return false;
            }
            if (f9985b) {
                return true;
            }
            try {
                m13295c(context);
                boolean n = this.f9987d.mo8485n(C5468d.m20961a(context));
                f9985b = n;
                return n;
            } catch (RemoteException e) {
                e = e;
                C2227Cf.m9537d("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                C2227Cf.m9537d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
