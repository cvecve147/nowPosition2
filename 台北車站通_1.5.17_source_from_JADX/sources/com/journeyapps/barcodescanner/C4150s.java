package com.journeyapps.barcodescanner;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5813g;
import p101d.p129g.p159f.C5861h;
import p101d.p129g.p159f.C5915k;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5787j;

/* renamed from: com.journeyapps.barcodescanner.s */
public class C4150s implements C5920p {

    /* renamed from: a */
    private C5915k f12329a;

    /* renamed from: b */
    private List<C5919o> f12330b = new ArrayList();

    public C4150s(C5915k kVar) {
        this.f12329a = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5917m mo11729a(C5771c cVar) {
        C5917m mVar;
        this.f12330b.clear();
        try {
            mVar = this.f12329a instanceof C5861h ? ((C5861h) this.f12329a).mo15566b(cVar) : this.f12329a.mo15333a(cVar);
        } catch (Exception unused) {
            mVar = null;
        } catch (Throwable th) {
            this.f12329a.reset();
            throw th;
        }
        this.f12329a.reset();
        return mVar;
    }

    /* renamed from: a */
    public C5917m mo11730a(C5813g gVar) {
        return mo11729a(mo11733b(gVar));
    }

    /* renamed from: a */
    public List<C5919o> mo11731a() {
        return new ArrayList(this.f12330b);
    }

    /* renamed from: a */
    public void mo11732a(C5919o oVar) {
        this.f12330b.add(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5771c mo11733b(C5813g gVar) {
        return new C5771c(new C5787j(gVar));
    }
}
