package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.Il */
public final class C2405Il implements C3119gj {

    /* renamed from: a */
    private Mac f7259a;

    /* renamed from: b */
    private final int f7260b;

    /* renamed from: c */
    private final String f7261c;

    /* renamed from: d */
    private final Key f7262d;

    public C2405Il(String str, Key key, int i) {
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f7261c = str;
            this.f7260b = i;
            this.f7262d = key;
            this.f7259a = C3582wl.f10444d.mo10164a(str);
            this.f7259a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo8339a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f7259a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = C3582wl.f10444d.mo10164a(this.f7261c);
            mac.init(this.f7262d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f7260b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f7260b);
        return bArr2;
    }
}
