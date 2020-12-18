package p208e.p221b.p241f;

import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p240j.C6398a;
import p208e.p221b.p228e.p240j.C6407i;

/* renamed from: e.b.f.b */
public final class C6414b<T> implements C6438q<T>, C6223b {

    /* renamed from: a */
    final C6438q<? super T> f17780a;

    /* renamed from: b */
    final boolean f17781b;

    /* renamed from: c */
    C6223b f17782c;

    /* renamed from: d */
    boolean f17783d;

    /* renamed from: e */
    C6398a<Object> f17784e;

    /* renamed from: f */
    volatile boolean f17785f;

    public C6414b(C6438q<? super T> qVar) {
        this(qVar, false);
    }

    public C6414b(C6438q<? super T> qVar, boolean z) {
        this.f17780a = qVar;
        this.f17781b = z;
    }

    /* renamed from: a */
    public void mo15709a() {
        this.f17782c.mo15709a();
    }

    /* renamed from: a */
    public void mo13383a(C6223b bVar) {
        if (C6249b.m23557a(this.f17782c, bVar)) {
            this.f17782c = bVar;
            this.f17780a.mo13383a((C6223b) this);
        }
    }

    /* renamed from: a */
    public void mo13341a(T t) {
        if (!this.f17785f) {
            if (t == null) {
                this.f17782c.mo15709a();
                mo13342a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f17785f) {
                    if (this.f17783d) {
                        C6398a<Object> aVar = this.f17784e;
                        if (aVar == null) {
                            aVar = new C6398a<>(4);
                            this.f17784e = aVar;
                        }
                        C6407i.m23952a(t);
                        aVar.mo16497a(t);
                        return;
                    }
                    this.f17783d = true;
                    this.f17780a.mo13341a(t);
                    mo16515b();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p208e.p221b.p242g.C6416a.m23988b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f17780a.mo13342a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13342a(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f17785f
            if (r0 == 0) goto L_0x0008
            p208e.p221b.p242g.C6416a.m23988b((java.lang.Throwable) r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f17785f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f17783d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f17785f = r1     // Catch:{ all -> 0x0044 }
            e.b.e.j.a<java.lang.Object> r0 = r2.f17784e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            e.b.e.j.a r0 = new e.b.e.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f17784e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p208e.p221b.p228e.p240j.C6407i.m23953a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f17781b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo16497a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo16499b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f17785f = r1     // Catch:{ all -> 0x0044 }
            r2.f17783d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p208e.p221b.p242g.C6416a.m23988b((java.lang.Throwable) r3)
            return
        L_0x003e:
            e.b.q<? super T> r0 = r2.f17780a
            r0.mo13342a((java.lang.Throwable) r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p241f.C6414b.mo13342a(java.lang.Throwable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16515b() {
        C6398a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f17784e;
                if (aVar == null) {
                    this.f17783d = false;
                    return;
                }
                this.f17784e = null;
            }
        } while (!aVar.mo16498a((C6438q<? super U>) this.f17780a));
    }

    /* renamed from: c */
    public void mo13343c() {
        if (!this.f17785f) {
            synchronized (this) {
                if (!this.f17785f) {
                    if (this.f17783d) {
                        C6398a<Object> aVar = this.f17784e;
                        if (aVar == null) {
                            aVar = new C6398a<>(4);
                            this.f17784e = aVar;
                        }
                        aVar.mo16497a(C6407i.m23951a());
                        return;
                    }
                    this.f17785f = true;
                    this.f17783d = true;
                    this.f17780a.mo13343c();
                }
            }
        }
    }
}
