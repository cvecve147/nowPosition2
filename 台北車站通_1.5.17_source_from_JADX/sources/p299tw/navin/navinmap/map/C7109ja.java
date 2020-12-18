package p299tw.navin.navinmap.map;

import p299tw.navin.navinmap.map.C7112l;

/* renamed from: tw.navin.navinmap.map.ja */
class C7109ja {

    /* renamed from: a */
    private static C7109ja f19576a = new C7109ja();

    /* renamed from: b */
    private C7112l.C7120h f19577b;

    /* renamed from: c */
    private C7112l.C7120h f19578c;

    /* renamed from: d */
    private boolean f19579d;

    private C7109ja() {
    }

    /* renamed from: a */
    static C7109ja m26767a() {
        return f19576a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21171a(C7112l.C7120h hVar) {
        this.f19577b = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21172a(boolean z) {
        synchronized (this) {
            this.f19579d = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21173b(C7112l.C7120h hVar) {
        this.f19578c = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo21174b() {
        boolean z;
        synchronized (this) {
            z = this.f19579d;
        }
        return z;
    }

    /* renamed from: c */
    public C7112l.C7120h mo21175c() {
        return this.f19577b;
    }

    /* renamed from: d */
    public C7112l.C7120h mo21176d() {
        return this.f19578c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo21177e() {
        C7112l.C7120h hVar;
        C7112l.C7120h hVar2 = this.f19577b;
        if (hVar2 == null || (hVar = this.f19578c) == null) {
            return false;
        }
        return hVar2.f19619a.equals(hVar.f19619a);
    }
}
