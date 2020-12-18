package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sc */
public final class C2688Sc extends C2941ad {

    /* renamed from: a */
    private volatile C2630Qc f8239a;

    /* renamed from: b */
    private volatile C2716Tc f8240b;

    /* renamed from: c */
    private volatile C2657Rc f8241c;

    /* renamed from: d */
    private volatile C2856Yc f8242d;

    public C2688Sc(C2657Rc rc) {
        this.f8241c = rc;
    }

    /* renamed from: a */
    public final void mo8805a(C2630Qc qc) {
        this.f8239a = qc;
    }

    /* renamed from: a */
    public final void mo8806a(C2716Tc tc) {
        this.f8240b = tc;
    }

    /* renamed from: a */
    public final void mo8807a(C2856Yc yc) {
        this.f8242d = yc;
    }

    /* renamed from: a */
    public final void mo8808a(C5464b bVar, int i) {
        if (this.f8239a != null) {
            this.f8239a.mo8389a(i);
        }
    }

    /* renamed from: a */
    public final void mo8809a(C5464b bVar, zzaig zzaig) {
        if (this.f8241c != null) {
            this.f8241c.mo6976a(zzaig);
        }
    }

    /* renamed from: b */
    public final void mo8810b(Bundle bundle) {
        if (this.f8242d != null) {
            this.f8242d.mo8394b(bundle);
        }
    }

    /* renamed from: b */
    public final void mo8811b(C5464b bVar, int i) {
        if (this.f8240b != null) {
            this.f8240b.mo8392a(C5468d.m20962z(bVar).getClass().getName(), i);
        }
    }

    /* renamed from: g */
    public final void mo8812g(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6979o();
        }
    }

    /* renamed from: j */
    public final void mo8813j(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6975Gb();
        }
    }

    /* renamed from: o */
    public final void mo8814o(C5464b bVar) {
        if (this.f8239a != null) {
            this.f8239a.mo8393b();
        }
    }

    /* renamed from: p */
    public final void mo8815p(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6978n();
        }
    }

    /* renamed from: s */
    public final void mo8816s(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6981r();
        }
    }

    /* renamed from: t */
    public final void mo8817t(C5464b bVar) {
        if (this.f8240b != null) {
            this.f8240b.mo8391a(C5468d.m20962z(bVar).getClass().getName());
        }
    }

    /* renamed from: w */
    public final void mo8818w(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6980q();
        }
    }

    /* renamed from: y */
    public final void mo8819y(C5464b bVar) {
        if (this.f8241c != null) {
            this.f8241c.mo6977m();
        }
    }
}
