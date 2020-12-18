package p208e.p209a.p210a.p211a;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p215c.C6120j;
import p208e.p209a.p210a.p211a.p212a.p215c.C6131s;

/* renamed from: e.a.a.a.m */
public abstract class C6208m<Result> implements Comparable<C6208m> {

    /* renamed from: a */
    C6199f f17314a;

    /* renamed from: b */
    C6207l<Result> f17315b = new C6207l<>(this);

    /* renamed from: c */
    Context f17316c;

    /* renamed from: d */
    C6204j<Result> f17317d;

    /* renamed from: e */
    C6091u f17318e;

    /* renamed from: f */
    final C6120j f17319f = ((C6120j) getClass().getAnnotation(C6120j.class));

    /* renamed from: a */
    public int compareTo(C6208m mVar) {
        if (mo16303b(mVar)) {
            return 1;
        }
        if (mVar.mo16303b(this)) {
            return -1;
        }
        if (!mo16310r() || mVar.mo16310r()) {
            return (mo16310r() || !mVar.mo16310r()) ? 0 : -1;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16300a(Context context, C6199f fVar, C6204j<Result> jVar, C6091u uVar) {
        this.f17314a = fVar;
        this.f17316c = new C6201g(context, mo14663o(), mo16309p());
        this.f17317d = jVar;
        this.f17318e = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16301a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16302b(Result result) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo16303b(C6208m mVar) {
        if (mo16310r()) {
            for (Class isAssignableFrom : this.f17319f.value()) {
                if (isAssignableFrom.isAssignableFrom(mVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Result mo14662c();

    /* renamed from: k */
    public Context mo16305k() {
        return this.f17316c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Collection<C6131s> mo16306l() {
        return this.f17315b.mo16117c();
    }

    /* renamed from: m */
    public C6199f mo16307m() {
        return this.f17314a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6091u mo16308n() {
        return this.f17318e;
    }

    /* renamed from: o */
    public abstract String mo14663o();

    /* renamed from: p */
    public String mo16309p() {
        return ".Fabric" + File.separator + mo14663o();
    }

    /* renamed from: q */
    public abstract String mo14664q();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo16310r() {
        return this.f17319f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo16311s() {
        this.f17315b.mo16141a(this.f17314a.mo16281c(), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo14675t() {
        return true;
    }
}
