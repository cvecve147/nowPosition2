package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Aq */
public class C2182Aq {

    /* renamed from: a */
    private final C2701Sp f6695a;

    /* renamed from: b */
    private final String f6696b;

    /* renamed from: c */
    private final String f6697c;

    /* renamed from: d */
    private final int f6698d = 2;

    /* renamed from: e */
    private volatile Method f6699e = null;

    /* renamed from: f */
    private final Class<?>[] f6700f;

    /* renamed from: g */
    private CountDownLatch f6701g = new CountDownLatch(1);

    public C2182Aq(C2701Sp sp, String str, String str2, Class<?>... clsArr) {
        this.f6695a = sp;
        this.f6696b = str;
        this.f6697c = str2;
        this.f6700f = clsArr;
        this.f6695a.mo8838c().submit(new C2210Bq(this));
    }

    /* renamed from: a */
    private final String m9396a(byte[] bArr, String str) {
        return new String(this.f6695a.mo8840e().mo8006a(bArr, str), HTTP.UTF_8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m9398b() {
        try {
            Class loadClass = this.f6695a.mo8839d().loadClass(m9396a(this.f6695a.mo8841f(), this.f6696b));
            if (loadClass != null) {
                this.f6699e = loadClass.getMethod(m9396a(this.f6695a.mo8841f(), this.f6697c), this.f6700f);
                Method method = this.f6699e;
            }
        } catch (C2295Ep | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.f6701g.countDown();
            throw th;
        }
        this.f6701g.countDown();
    }

    /* renamed from: a */
    public final Method mo7842a() {
        if (this.f6699e != null) {
            return this.f6699e;
        }
        try {
            if (!this.f6701g.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f6699e;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
