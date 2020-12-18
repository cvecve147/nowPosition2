package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2346Gk;
import com.google.android.gms.internal.ads.C2608Pk;
import com.google.android.gms.internal.ads.C2666Rk;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.lj */
final class C3265lj {

    /* renamed from: a */
    private static final Charset f9748a = Charset.forName(HTTP.UTF_8);

    /* renamed from: a */
    public static C2666Rk m12977a(C2608Pk pk) {
        C2666Rk.C2667a l = C2666Rk.m11062l();
        l.mo8786a(pk.mo8679l());
        for (C2608Pk.C2610b next : pk.mo8680m()) {
            C2666Rk.C2668b.C2669a l2 = C2666Rk.C2668b.m11075l();
            l2.mo8791a(next.mo8683m().mo8212l());
            l2.mo8789a(next.mo8684n());
            l2.mo8790a(next.mo8686p());
            l2.mo8788a(next.mo8685o());
            l.mo8787a((C2666Rk.C2668b) l2.mo8629k());
        }
        return (C2666Rk) l.mo8629k();
    }

    /* renamed from: b */
    public static void m12978b(C2608Pk pk) {
        if (pk.mo8681n() != 0) {
            int l = pk.mo8679l();
            boolean z = true;
            boolean z2 = false;
            for (C2608Pk.C2610b next : pk.mo8680m()) {
                if (!next.mo8682l()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo8685o())}));
                } else if (next.mo8686p() == C2978bl.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo8685o())}));
                } else if (next.mo8684n() != C2432Jk.UNKNOWN_STATUS) {
                    if (next.mo8684n() == C2432Jk.ENABLED && next.mo8685o() == l) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.mo8683m().mo8214n() != C2346Gk.C2348b.ASYMMETRIC_PUBLIC) {
                        z = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo8685o())}));
                }
            }
            if (!z2 && !z) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
