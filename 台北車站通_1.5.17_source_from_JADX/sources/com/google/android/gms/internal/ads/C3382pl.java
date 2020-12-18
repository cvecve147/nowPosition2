package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.pl */
public final class C3382pl {

    /* renamed from: a */
    private ECPublicKey f10033a;

    public C3382pl(ECPublicKey eCPublicKey) {
        this.f10033a = eCPublicKey;
    }

    /* renamed from: a */
    public final C3410ql mo9896a(String str, byte[] bArr, byte[] bArr2, int i, C3524ul ulVar) {
        byte[] bArr3;
        KeyPair a = C3439rl.m13664a(this.f10033a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = this.f10033a;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
            throw new GeneralSecurityException("invalid public key spec");
        }
        byte[] a2 = C3439rl.m13669a(eCPrivateKey, eCPublicKey2.getW());
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        C3439rl.m13668a(w, curve);
        int a3 = C3439rl.m13663a(curve);
        int i2 = C3467sl.f10208a[ulVar.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            int i4 = (a3 * 2) + 1;
            byte[] bArr4 = new byte[i4];
            byte[] byteArray = w.getAffineX().toByteArray();
            byte[] byteArray2 = w.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr4, i4 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr4, (a3 + 1) - byteArray.length, byteArray.length);
            bArr4[0] = 4;
            bArr3 = bArr4;
        } else if (i2 == 2) {
            int i5 = a3 + 1;
            bArr3 = new byte[i5];
            byte[] byteArray3 = w.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr3, i5 - byteArray3.length, byteArray3.length);
            bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
        } else {
            String valueOf = String.valueOf(ulVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("invalid format:");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] a4 = C3177il.m12631a(bArr3, a2);
        Mac a5 = C3582wl.f10444d.mo10164a(str);
        if (i <= a5.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                a5.init(new SecretKeySpec(new byte[a5.getMacLength()], str));
            } else {
                a5.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = a5.doFinal(a4);
            byte[] bArr5 = new byte[i];
            a5.init(new SecretKeySpec(doFinal, str));
            byte[] bArr6 = new byte[0];
            int i6 = 0;
            while (true) {
                a5.update(bArr6);
                a5.update(bArr2);
                a5.update((byte) i3);
                bArr6 = a5.doFinal();
                if (bArr6.length + i6 < i) {
                    System.arraycopy(bArr6, 0, bArr5, i6, bArr6.length);
                    i6 += bArr6.length;
                    i3++;
                } else {
                    System.arraycopy(bArr6, 0, bArr5, i6, i - i6);
                    return new C3410ql(bArr3, bArr5);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
