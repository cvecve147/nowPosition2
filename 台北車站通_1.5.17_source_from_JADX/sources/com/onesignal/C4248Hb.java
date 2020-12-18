package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.C4306Xa;
import java.lang.reflect.Field;

/* renamed from: com.onesignal.Hb */
class C4248Hb {

    /* renamed from: a */
    private Context f12598a;

    /* renamed from: b */
    private boolean f12599b = false;

    /* renamed from: c */
    private C4249a f12600c;

    /* renamed from: d */
    private Object f12601d;

    /* renamed from: e */
    private Field f12602e;

    /* renamed from: com.onesignal.Hb$a */
    private class C4249a implements PurchasingListener {

        /* renamed from: a */
        PurchasingListener f12603a;

        private C4249a() {
        }

        /* synthetic */ C4249a(C4248Hb hb, C4245Gb gb) {
            this();
        }
    }

    C4248Hb(Context context) {
        this.f12598a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            this.f12601d = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            this.f12602e = cls.getDeclaredField("f");
            this.f12602e.setAccessible(true);
            this.f12600c = new C4249a(this, (C4245Gb) null);
            this.f12600c.f12603a = (PurchasingListener) this.f12602e.get(this.f12601d);
            this.f12599b = true;
            m16812b();
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error adding Amazon IAP listener.", th);
        }
    }

    /* renamed from: b */
    private void m16812b() {
        PurchasingService.registerListener(this.f12598a, this.f12600c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12301a() {
        if (this.f12599b) {
            try {
                C4249a aVar = (PurchasingListener) this.f12602e.get(this.f12601d);
                if (aVar != this.f12600c) {
                    this.f12600c.f12603a = aVar;
                    m16812b();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
