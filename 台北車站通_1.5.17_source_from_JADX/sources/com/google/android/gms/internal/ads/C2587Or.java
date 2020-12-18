package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Or */
final class C2587Or {

    /* renamed from: a */
    private ByteArrayOutputStream f8072a = new ByteArrayOutputStream(SVGParser.ENTITY_WATCH_BUFFER_SIZE);

    /* renamed from: b */
    private Base64OutputStream f8073b = new Base64OutputStream(this.f8072a, 10);

    /* renamed from: a */
    public final void mo8647a(byte[] bArr) {
        this.f8073b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f8073b.close();
        } catch (IOException e) {
            C2227Cf.m9533b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f8072a.close();
            str = this.f8072a.toString();
        } catch (IOException e2) {
            C2227Cf.m9533b("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } catch (Throwable th) {
            this.f8072a = null;
            this.f8073b = null;
            throw th;
        }
        this.f8072a = null;
        this.f8073b = null;
        return str;
    }
}
