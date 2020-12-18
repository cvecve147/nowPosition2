package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C1652d;
import com.google.android.gms.ads.formats.C1656g;
import com.google.android.gms.ads.formats.C1658h;
import com.google.android.gms.ads.formats.C1660i;
import com.google.android.gms.ads.formats.C1663j;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2188Aw;
import com.google.android.gms.internal.ads.C2213Bt;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2505Lz;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2560Nw;
import com.google.android.gms.internal.ads.C2877Yw;
import com.google.android.gms.internal.ads.C2900Zs;
import com.google.android.gms.internal.ads.C2904Zw;
import com.google.android.gms.internal.ads.C2932_w;
import com.google.android.gms.internal.ads.C2990bx;
import com.google.android.gms.internal.ads.C3018cx;
import com.google.android.gms.internal.ads.C3072et;
import com.google.android.gms.internal.ads.C3187iu;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3621xw;
import com.google.android.gms.internal.ads.C3646yt;
import com.google.android.gms.internal.ads.zzpl;

/* renamed from: com.google.android.gms.ads.b */
public class C1634b {

    /* renamed from: a */
    private final C3072et f5444a;

    /* renamed from: b */
    private final Context f5445b;

    /* renamed from: c */
    private final C3646yt f5446c;

    /* renamed from: com.google.android.gms.ads.b$a */
    public static class C1635a {

        /* renamed from: a */
        private final Context f5447a;

        /* renamed from: b */
        private final C2213Bt f5448b;

        private C1635a(Context context, C2213Bt bt) {
            this.f5447a = context;
            this.f5448b = bt;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1635a(Context context, String str) {
            this(context, C3390pt.m13454b().mo9566a(context, str, (C2533Mz) new C2505Lz()));
            C2061y.m9068a(context, (Object) "context cannot be null");
        }

        /* renamed from: a */
        public C1635a mo6559a(C1628a aVar) {
            try {
                this.f5448b.mo6965a((C3562vt) new C2900Zs(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to set AdListener.", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1635a mo6560a(C1652d dVar) {
            try {
                this.f5448b.mo6967a(new zzpl(dVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1635a mo6561a(C1656g.C1657a aVar) {
            try {
                this.f5448b.mo6966a((C3621xw) new C2877Yw(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1635a mo6562a(C1658h.C1659a aVar) {
            try {
                this.f5448b.mo6961a((C2188Aw) new C2904Zw(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to add content ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1635a mo6563a(C1663j.C1664a aVar) {
            try {
                this.f5448b.mo6963a((C2560Nw) new C3018cx(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to add google native ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1635a mo6564a(String str, C1660i.C1662b bVar, C1660i.C1661a aVar) {
            try {
                this.f5448b.mo6968a(str, new C2990bx(bVar), aVar == null ? null : new C2932_w(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C1634b mo6565a() {
            try {
                return new C1634b(this.f5447a, this.f5448b.mo6969da());
            } catch (RemoteException e) {
                C2227Cf.m9533b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C1634b(Context context, C3646yt ytVar) {
        this(context, ytVar, C3072et.f9119a);
    }

    private C1634b(Context context, C3646yt ytVar, C3072et etVar) {
        this.f5445b = context;
        this.f5446c = ytVar;
        this.f5444a = etVar;
    }

    /* renamed from: a */
    private final void m7457a(C3187iu iuVar) {
        try {
            this.f5446c.mo6952a(C3072et.m12305a(this.f5445b, iuVar));
        } catch (RemoteException e) {
            C2227Cf.m9533b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo6558a(C1637c cVar) {
        m7457a(cVar.mo6566a());
    }
}
