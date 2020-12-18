package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2725Tk;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tj */
final class C3493tj implements C3004cj<C2778Vi> {
    C3493tj() {
    }

    /* renamed from: c */
    private static C2778Vi m13875c(C3498tn tnVar) {
        if (tnVar instanceof C2725Tk) {
            C2725Tk tk = (C2725Tk) tnVar;
            C2612Pl.m10917a(tk.mo8897l(), 0);
            String l = tk.mo8898n().mo8963l();
            return C3090fj.m12329a(l).mo9394b(l);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    /* renamed from: d */
    private static C2778Vi m13876d(C3150hm hmVar) {
        try {
            return m13875c((C3498tn) C2725Tk.m11279a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final C2346Gk mo8276a(C3150hm hmVar) {
        C2346Gk.C2347a o = C2346Gk.m9959o();
        o.mo8217a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        o.mo8216a(((C2725Tk) mo8278b(hmVar)).mo9039h());
        o.mo8215a(C2346Gk.C2348b.REMOTE);
        return (C2346Gk) o.mo8629k();
    }

    /* renamed from: a */
    public final C3498tn mo8277a(C3498tn tnVar) {
        if (tnVar instanceof C2781Vk) {
            C2725Tk.C2726a o = C2725Tk.m11285o();
            o.mo8900a((C2781Vk) tnVar);
            o.mo8899a(0);
            return o.mo8629k();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final C3498tn mo8278b(C3150hm hmVar) {
        try {
            return mo8277a((C3498tn) C2781Vk.m11436a(hmVar));
        } catch (C2755Um e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo8279b(C3498tn tnVar) {
        return m13875c(tnVar);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo8280c(C3150hm hmVar) {
        return m13876d(hmVar);
    }

    public final int getVersion() {
        return 0;
    }
}
