package p101d.p122f.p123a.p125b;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6077i;
import p208e.p209a.p210a.p211a.p212a.p214b.C6084n;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p219f.C6163c;
import p208e.p209a.p210a.p211a.p212a.p220g.C6172g;

/* renamed from: d.f.a.b.a */
abstract class C5334a implements C5345l {

    /* renamed from: a */
    private final AtomicBoolean f15088a;

    /* renamed from: b */
    private final AtomicBoolean f15089b;

    /* renamed from: c */
    private Context f15090c;

    /* renamed from: d */
    private C5338e f15091d;

    /* renamed from: e */
    private C6091u f15092e;

    /* renamed from: f */
    private C6172g f15093f;

    /* renamed from: g */
    private C5339f f15094g;

    /* renamed from: h */
    private C6163c f15095h;

    /* renamed from: i */
    private C6084n f15096i;

    /* renamed from: j */
    private C6156h f15097j;

    /* renamed from: k */
    private long f15098k;

    public C5334a() {
        this(false);
    }

    public C5334a(boolean z) {
        this.f15088a = new AtomicBoolean();
        this.f15098k = 0;
        this.f15089b = new AtomicBoolean(z);
    }

    /* renamed from: e */
    private void m20577e() {
        C6199f.m23420f().mo16269d("Beta", "Performing update check");
        C5338e eVar = this.f15091d;
        new C5340g(eVar, eVar.mo14744u(), this.f15093f.f17214a, this.f15097j, new C5342i()).mo14745a(new C6077i().mo16060c(this.f15090c), this.f15092e.mo16076g().get(C6091u.C6092a.FONT_TOKEN), this.f15094g);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public void mo14734a() {
        synchronized (this.f15095h) {
            if (this.f15095h.get().contains("last_update_check")) {
                this.f15095h.mo16235a(this.f15095h.edit().remove("last_update_check"));
            }
        }
        long a = this.f15096i.mo16037a();
        long j = ((long) this.f15093f.f17215b) * 1000;
        C6211p f = C6199f.m23420f();
        f.mo16269d("Beta", "Check for updates delay: " + j);
        C6211p f2 = C6199f.m23420f();
        f2.mo16269d("Beta", "Check for updates last check time: " + mo14737b());
        long b = mo14737b() + j;
        C6211p f3 = C6199f.m23420f();
        f3.mo16269d("Beta", "Check for updates current time: " + a + ", next check time: " + b);
        if (a >= b) {
            try {
                m20577e();
            } finally {
                mo14735a(a);
            }
        } else {
            C6199f.m23420f().mo16269d("Beta", "Check for updates next check time was not passed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14735a(long j) {
        this.f15098k = j;
    }

    /* renamed from: a */
    public void mo14736a(Context context, C5338e eVar, C6091u uVar, C6172g gVar, C5339f fVar, C6163c cVar, C6084n nVar, C6156h hVar) {
        this.f15090c = context;
        this.f15091d = eVar;
        this.f15092e = uVar;
        this.f15093f = gVar;
        this.f15094g = fVar;
        this.f15095h = cVar;
        this.f15096i = nVar;
        this.f15097j = hVar;
        if (mo14739d()) {
            mo14734a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo14737b() {
        return this.f15098k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo14738c() {
        this.f15089b.set(true);
        return this.f15088a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo14739d() {
        this.f15088a.set(true);
        return this.f15089b.get();
    }
}
