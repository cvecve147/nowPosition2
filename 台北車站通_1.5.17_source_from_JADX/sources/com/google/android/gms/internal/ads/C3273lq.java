package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lq */
public final class C3273lq extends C2239Cq {
    public C3273lq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 24);
    }

    /* renamed from: c */
    private final void m13001c() {
        AdvertisingIdClient m = this.f6814b.mo8848m();
        if (m != null) {
            try {
                AdvertisingIdClient.Info info = m.getInfo();
                String a = C2925_p.m11869a(info.getId());
                if (a != null) {
                    synchronized (this.f6817e) {
                        this.f6817e.f8832na = a;
                        this.f6817e.f8836pa = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.f6817e.f8834oa = 5;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (this.f6814b.mo8842g()) {
            m13001c();
            return;
        }
        synchronized (this.f6817e) {
            this.f6817e.f8832na = (String) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()});
        }
    }

    /* renamed from: b */
    public final Void call() {
        if (this.f6814b.mo8837b()) {
            return super.call();
        }
        if (!this.f6814b.mo8842g()) {
            return null;
        }
        m13001c();
        return null;
    }
}
