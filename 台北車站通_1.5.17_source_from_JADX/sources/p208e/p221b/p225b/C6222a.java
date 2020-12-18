package p208e.p221b.p225b;

import java.util.ArrayList;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6248a;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p240j.C6404g;
import p208e.p221b.p228e.p240j.C6410j;

/* renamed from: e.b.b.a */
public final class C6222a implements C6223b, C6248a {

    /* renamed from: a */
    C6410j<C6223b> f17350a;

    /* renamed from: b */
    volatile boolean f17351b;

    /* renamed from: a */
    public void mo15709a() {
        if (!this.f17351b) {
            synchronized (this) {
                if (!this.f17351b) {
                    this.f17351b = true;
                    C6410j<C6223b> jVar = this.f17350a;
                    this.f17350a = null;
                    mo16322a(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16322a(C6410j<C6223b> jVar) {
        if (jVar != null) {
            ArrayList arrayList = null;
            for (Object obj : jVar.mo16511a()) {
                if (obj instanceof C6223b) {
                    try {
                        ((C6223b) obj).mo15709a();
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C6404g.m23945a((Throwable) arrayList.get(0));
            }
            throw new C6228a((Iterable<? extends Throwable>) arrayList);
        }
    }

    /* renamed from: a */
    public boolean mo16323a(C6223b bVar) {
        if (!mo16326c(bVar)) {
            return false;
        }
        bVar.mo15709a();
        return true;
    }

    /* renamed from: b */
    public boolean mo16324b() {
        return this.f17351b;
    }

    /* renamed from: b */
    public boolean mo16325b(C6223b bVar) {
        C6268b.m23590a(bVar, "d is null");
        if (!this.f17351b) {
            synchronized (this) {
                if (!this.f17351b) {
                    C6410j<C6223b> jVar = this.f17350a;
                    if (jVar == null) {
                        jVar = new C6410j<>();
                        this.f17350a = jVar;
                    }
                    jVar.mo16510a(bVar);
                    return true;
                }
            }
        }
        bVar.mo15709a();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16326c(p208e.p221b.p225b.C6223b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p208e.p221b.p228e.p230b.C6268b.m23590a(r3, (java.lang.String) r0)
            boolean r0 = r2.f17351b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f17351b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            e.b.e.j.j<e.b.b.b> r0 = r2.f17350a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo16513b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p225b.C6222a.mo16326c(e.b.b.b):boolean");
    }
}
