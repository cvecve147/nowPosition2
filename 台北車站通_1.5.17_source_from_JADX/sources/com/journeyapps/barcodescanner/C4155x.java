package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.journeyapps.barcodescanner.p077a.C4118k;
import com.journeyapps.barcodescanner.p077a.C4129t;
import p101d.p129g.p159f.C5813g;

/* renamed from: com.journeyapps.barcodescanner.x */
public class C4155x {

    /* renamed from: a */
    private static final String f12334a = "x";

    /* renamed from: b */
    private C4118k f12335b;

    /* renamed from: c */
    private HandlerThread f12336c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f12337d;

    /* renamed from: e */
    private C4150s f12338e;

    /* renamed from: f */
    private Handler f12339f;

    /* renamed from: g */
    private Rect f12340g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12341h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f12342i = new Object();

    /* renamed from: j */
    private final Handler.Callback f12343j = new C4153v(this);

    /* renamed from: k */
    private final C4129t f12344k = new C4154w(this);

    public C4155x(C4118k kVar, C4150s sVar, Handler handler) {
        C4105E.m16407a();
        this.f12335b = kVar;
        this.f12338e = sVar;
        this.f12339f = handler;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16586b(com.journeyapps.barcodescanner.C4102D r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r2 = r8.f12340g
            r9.mo11580a((android.graphics.Rect) r2)
            d.g.f.g r2 = r8.mo11737a((com.journeyapps.barcodescanner.C4102D) r9)
            if (r2 == 0) goto L_0x0016
            com.journeyapps.barcodescanner.s r3 = r8.f12338e
            d.g.f.m r2 = r3.mo11730a((p101d.p129g.p159f.C5813g) r2)
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = f12334a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Found barcode in "
            r6.append(r7)
            long r3 = r3 - r0
            r6.append(r3)
            java.lang.String r0 = " ms"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.d(r5, r0)
            android.os.Handler r0 = r8.f12339f
            if (r0 == 0) goto L_0x0060
            com.journeyapps.barcodescanner.b r0 = new com.journeyapps.barcodescanner.b
            r0.<init>(r2, r9)
            android.os.Handler r9 = r8.f12339f
            int r1 = p101d.p129g.p159f.p163b.p164a.C5766l.zxing_decode_succeeded
            android.os.Message r9 = android.os.Message.obtain(r9, r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r9.setData(r0)
            goto L_0x005d
        L_0x0053:
            android.os.Handler r9 = r8.f12339f
            if (r9 == 0) goto L_0x0060
            int r0 = p101d.p129g.p159f.p163b.p164a.C5766l.zxing_decode_failed
            android.os.Message r9 = android.os.Message.obtain(r9, r0)
        L_0x005d:
            r9.sendToTarget()
        L_0x0060:
            android.os.Handler r9 = r8.f12339f
            if (r9 == 0) goto L_0x0075
            com.journeyapps.barcodescanner.s r9 = r8.f12338e
            java.util.List r9 = r9.mo11731a()
            android.os.Handler r0 = r8.f12339f
            int r1 = p101d.p129g.p159f.p163b.p164a.C5766l.zxing_possible_result_points
            android.os.Message r9 = android.os.Message.obtain(r0, r1, r9)
            r9.sendToTarget()
        L_0x0075:
            r8.m16587c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.C4155x.m16586b(com.journeyapps.barcodescanner.D):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16587c() {
        if (this.f12335b.mo11626e()) {
            this.f12335b.mo11621a(this.f12344k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5813g mo11737a(C4102D d) {
        if (this.f12340g == null) {
            return null;
        }
        return d.mo11579a();
    }

    /* renamed from: a */
    public void mo11738a() {
        C4105E.m16407a();
        this.f12336c = new HandlerThread(f12334a);
        this.f12336c.start();
        this.f12337d = new Handler(this.f12336c.getLooper(), this.f12343j);
        this.f12341h = true;
        m16587c();
    }

    /* renamed from: a */
    public void mo11739a(Rect rect) {
        this.f12340g = rect;
    }

    /* renamed from: a */
    public void mo11740a(C4150s sVar) {
        this.f12338e = sVar;
    }

    /* renamed from: b */
    public void mo11741b() {
        C4105E.m16407a();
        synchronized (this.f12342i) {
            this.f12341h = false;
            this.f12337d.removeCallbacksAndMessages((Object) null);
            this.f12336c.quit();
        }
    }
}
