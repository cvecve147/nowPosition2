package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import java.util.HashMap;
import p101d.p129g.p159f.C5806e;

public class BarcodeView extends C4140j {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C4100a f12151B = C4100a.NONE;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C4107a f12152C = null;

    /* renamed from: D */
    private C4155x f12153D;

    /* renamed from: E */
    private C4151t f12154E;

    /* renamed from: F */
    private Handler f12155F;

    /* renamed from: G */
    private final Handler.Callback f12156G = new C4133c(this);

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    private enum C4100a {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        m16370a(context, (AttributeSet) null);
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16370a(context, attributeSet);
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16370a(context, attributeSet);
    }

    /* renamed from: a */
    private void m16370a(Context context, AttributeSet attributeSet) {
        this.f12154E = new C4156y();
        this.f12155F = new Handler(this.f12156G);
    }

    /* renamed from: j */
    private C4150s m16372j() {
        if (this.f12154E == null) {
            this.f12154E = mo11559h();
        }
        C4152u uVar = new C4152u();
        HashMap hashMap = new HashMap();
        hashMap.put(C5806e.NEED_RESULT_POINT_CALLBACK, uVar);
        C4150s a = this.f12154E.mo11734a(hashMap);
        uVar.mo11735a(a);
        return a;
    }

    /* renamed from: k */
    private void m16373k() {
        m16374l();
        if (this.f12151B != C4100a.NONE && mo11694d()) {
            this.f12153D = new C4155x(getCameraInstance(), m16372j(), this.f12155F);
            this.f12153D.mo11739a(getPreviewFramingRect());
            this.f12153D.mo11738a();
        }
    }

    /* renamed from: l */
    private void m16374l() {
        C4155x xVar = this.f12153D;
        if (xVar != null) {
            xVar.mo11741b();
            this.f12153D = null;
        }
    }

    /* renamed from: a */
    public void mo11555a(C4107a aVar) {
        this.f12151B = C4100a.SINGLE;
        this.f12152C = aVar;
        m16373k();
    }

    /* renamed from: e */
    public void mo11556e() {
        m16374l();
        super.mo11556e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11557f() {
        super.mo11557f();
        m16373k();
    }

    public C4151t getDecoderFactory() {
        return this.f12154E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C4151t mo11559h() {
        return new C4156y();
    }

    /* renamed from: i */
    public void mo11560i() {
        this.f12151B = C4100a.NONE;
        this.f12152C = null;
        m16374l();
    }

    public void setDecoderFactory(C4151t tVar) {
        C4105E.m16407a();
        this.f12154E = tVar;
        C4155x xVar = this.f12153D;
        if (xVar != null) {
            xVar.mo11740a(m16372j());
        }
    }
}
