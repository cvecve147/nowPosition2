package p208e.p221b.p228e.p229a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p240j.C6404g;

/* renamed from: e.b.e.a.d */
public final class C6251d implements C6223b, C6248a {

    /* renamed from: a */
    List<C6223b> f17363a;

    /* renamed from: b */
    volatile boolean f17364b;

    /* renamed from: a */
    public void mo15709a() {
        if (!this.f17364b) {
            synchronized (this) {
                if (!this.f17364b) {
                    this.f17364b = true;
                    List<C6223b> list = this.f17363a;
                    this.f17363a = null;
                    mo16362a(list);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16362a(List<C6223b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C6223b a : list) {
                try {
                    a.mo15709a();
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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
    public boolean mo16325b(C6223b bVar) {
        C6268b.m23590a(bVar, "d is null");
        if (!this.f17364b) {
            synchronized (this) {
                if (!this.f17364b) {
                    List list = this.f17363a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f17363a = list;
                    }
                    list.add(bVar);
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
            boolean r0 = r2.f17364b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f17364b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<e.b.b.b> r0 = r2.f17363a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p229a.C6251d.mo16326c(e.b.b.b):boolean");
    }
}
