package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C1817m;
import com.google.android.gms.ads.mediation.C1841n;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.FA */
public final class C2307FA extends C2193BA {

    /* renamed from: a */
    private final C2344Gi f6968a;

    public C2307FA(C2344Gi gi) {
        this.f6968a = gi;
    }

    /* renamed from: q */
    private static Bundle m9754q(String str) {
        String valueOf = String.valueOf(str);
        C2227Cf.m9536d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            C2227Cf.m9533b("", e);
            throw new RemoteException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.IA, com.google.android.gms.internal.ads.Ji] */
    /* renamed from: a */
    public final void mo7794a(C5464b bVar, String str, Bundle bundle, C2221CA ca) {
        int i;
        try {
            ? ia = new C2393IA(this, ca);
            C2344Gi gi = this.f6968a;
            Context context = (Context) C5468d.m20962z(bVar);
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = C2374Hi.f7177a;
            } else if (c == 1) {
                i = C2374Hi.f7178b;
            } else if (c == 2) {
                i = C2374Hi.f7179c;
            } else if (c == 3) {
                i = C2374Hi.f7180d;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            gi.mo8208a(new C2402Ii(context, i, bundle), ia);
        } catch (Throwable th) {
            C2227Cf.m9533b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo7795a(byte[] bArr, String str, Bundle bundle, C5464b bVar, C3570wA wAVar, C2712Sz sz, zzjn zzjn) {
        try {
            C2335GA ga = new C2335GA(this, wAVar, sz);
            C2344Gi gi = this.f6968a;
            new C2316Fi((Context) C5468d.m20962z(bVar), bArr, m9754q(str), bundle);
            C1817m.m8088a(zzjn.f10897e, zzjn.f10894b, zzjn.f10893a);
            ga.mo7992a(String.valueOf(gi.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            C2227Cf.m9533b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo7796a(byte[] bArr, String str, Bundle bundle, C5464b bVar, C3626yA yAVar, C2712Sz sz) {
        try {
            C2365HA ha = new C2365HA(this, yAVar, sz);
            C2344Gi gi = this.f6968a;
            new C2316Fi((Context) C5468d.m20962z(bVar), bArr, m9754q(str), bundle);
            ha.mo7992a(String.valueOf(gi.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            C2227Cf.m9533b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final C2987bu getVideoController() {
        C2344Gi gi = this.f6968a;
        if (!(gi instanceof C1841n)) {
            return null;
        }
        try {
            return ((C1841n) gi).getVideoController();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            return null;
        }
    }

    /* renamed from: ra */
    public final zzzt mo7798ra() {
        return zzzt.m14782a(this.f6968a.mo8207a());
    }

    public final void showInterstitial() {
        C2287Ei ei = null;
        try {
            ei.mo8040a();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: wa */
    public final zzzt mo7800wa() {
        return zzzt.m14782a(this.f6968a.mo8209b());
    }
}
