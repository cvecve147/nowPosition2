package com.journeyapps.barcodescanner.p077a;

import android.content.Context;
import android.os.Handler;
import com.journeyapps.barcodescanner.C4101C;
import com.journeyapps.barcodescanner.C4105E;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.a.k */
public class C4118k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12212a = "k";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4124o f12213b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4123n f12214c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4119l f12215d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f12216e;

    /* renamed from: f */
    private C4126q f12217f;

    /* renamed from: g */
    private boolean f12218g = false;

    /* renamed from: h */
    private C4121m f12219h = new C4121m();

    /* renamed from: i */
    private Runnable f12220i = new C4114g(this);

    /* renamed from: j */
    private Runnable f12221j = new C4115h(this);

    /* renamed from: k */
    private Runnable f12222k = new C4116i(this);

    /* renamed from: l */
    private Runnable f12223l = new C4117j(this);

    public C4118k(Context context) {
        C4105E.m16407a();
        this.f12213b = C4124o.m16481b();
        this.f12215d = new C4119l(context);
        this.f12215d.mo11629a(this.f12219h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16429a(Exception exc) {
        Handler handler = this.f12216e;
        if (handler != null) {
            handler.obtainMessage(C5766l.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C4101C m16434h() {
        return this.f12215d.mo11637e();
    }

    /* renamed from: i */
    private void m16435i() {
        if (!this.f12218g) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: a */
    public void mo11617a(Handler handler) {
        this.f12216e = handler;
    }

    /* renamed from: a */
    public void mo11618a(C4121m mVar) {
        if (!this.f12218g) {
            this.f12219h = mVar;
            this.f12215d.mo11629a(mVar);
        }
    }

    /* renamed from: a */
    public void mo11619a(C4123n nVar) {
        this.f12214c = nVar;
    }

    /* renamed from: a */
    public void mo11620a(C4126q qVar) {
        this.f12217f = qVar;
        this.f12215d.mo11631a(qVar);
    }

    /* renamed from: a */
    public void mo11621a(C4129t tVar) {
        m16435i();
        this.f12213b.mo11657a(new C4113f(this, tVar));
    }

    /* renamed from: a */
    public void mo11622a(boolean z) {
        C4105E.m16407a();
        if (this.f12218g) {
            this.f12213b.mo11657a(new C4112e(this, z));
        }
    }

    /* renamed from: b */
    public void mo11623b() {
        C4105E.m16407a();
        if (this.f12218g) {
            this.f12213b.mo11657a(this.f12223l);
        }
        this.f12218g = false;
    }

    /* renamed from: c */
    public void mo11624c() {
        C4105E.m16407a();
        m16435i();
        this.f12213b.mo11657a(this.f12221j);
    }

    /* renamed from: d */
    public C4126q mo11625d() {
        return this.f12217f;
    }

    /* renamed from: e */
    public boolean mo11626e() {
        return this.f12218g;
    }

    /* renamed from: f */
    public void mo11627f() {
        C4105E.m16407a();
        this.f12218g = true;
        this.f12213b.mo11658b(this.f12220i);
    }

    /* renamed from: g */
    public void mo11628g() {
        C4105E.m16407a();
        m16435i();
        this.f12213b.mo11657a(this.f12222k);
    }
}
