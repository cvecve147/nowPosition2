package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2175Ak;
import com.google.android.gms.internal.ads.C2487Lj;
import com.google.android.gms.internal.ads.C2606Pj;
import com.google.android.gms.internal.ads.C2976bk;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Gj */
final class C2345Gj implements C3268ll {

    /* renamed from: a */
    private final String f7066a;

    /* renamed from: b */
    private final int f7067b;

    /* renamed from: c */
    private C2976bk f7068c;

    /* renamed from: d */
    private C2487Lj f7069d;

    /* renamed from: e */
    private int f7070e;

    C2345Gj(C2489Lk lk) {
        this.f7066a = lk.mo8493l();
        if (this.f7066a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C3033dk a = C3033dk.m12158a(lk.mo8494m());
                this.f7068c = (C2976bk) C3237kj.m12890b(lk);
                this.f7067b = a.mo9315l();
            } catch (C2755Um e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f7066a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C2545Nj a2 = C2545Nj.m10651a(lk.mo8494m());
                this.f7069d = (C2487Lj) C3237kj.m12890b(lk);
                this.f7070e = a2.mo8567l().mo8784l();
                this.f7067b = this.f7070e + a2.mo8568m().mo7932l();
            } catch (C2755Um e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.f7066a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    /* renamed from: a */
    public final int mo8210a() {
        return this.f7067b;
    }

    /* renamed from: a */
    public final C2778Vi mo8211a(byte[] bArr) {
        C3498tn tnVar;
        if (bArr.length == this.f7067b) {
            if (this.f7066a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                C2976bk.C2977a n = C2976bk.m12009n();
                n.mo8623a(this.f7068c);
                C2976bk.C2977a aVar = n;
                aVar.mo9246a(C3150hm.m12538a(bArr, 0, this.f7067b));
                tnVar = (C2976bk) aVar.mo8629k();
            } else if (this.f7066a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f7070e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f7070e, this.f7067b);
                C2606Pj.C2607a o = C2606Pj.m10893o();
                o.mo8623a(this.f7069d.mo8488m());
                C2606Pj.C2607a aVar2 = o;
                aVar2.mo8678a(C3150hm.m12537a(copyOfRange));
                C2175Ak.C2176a o2 = C2175Ak.m9351o();
                o2.mo8623a(this.f7069d.mo8489n());
                C2175Ak.C2176a aVar3 = o2;
                aVar3.mo7827a(C3150hm.m12537a(copyOfRange2));
                C2487Lj.C2488a o3 = C2487Lj.m10524o();
                o3.mo8490a(this.f7069d.mo8487l());
                o3.mo8492a((C2606Pj) aVar2.mo8629k());
                o3.mo8491a((C2175Ak) aVar3.mo8629k());
                tnVar = (C2487Lj) o3.mo8629k();
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (C2778Vi) C3237kj.m12891b(this.f7066a, tnVar);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
