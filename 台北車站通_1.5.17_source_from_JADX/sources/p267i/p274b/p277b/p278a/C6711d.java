package p267i.p274b.p277b.p278a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i.b.b.a.d */
public class C6711d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ArrayList<C6707b> f18646a = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<C6707b> f18647b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f18648c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6714c f18649d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6713b f18650e = new C6713b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18651f = true;

    /* renamed from: i.b.b.a.d$a */
    public interface C6712a {
        /* renamed from: a */
        void mo17168a(C6707b bVar, boolean z);
    }

    /* renamed from: i.b.b.a.d$b */
    private class C6713b implements C6712a {
        private C6713b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17168a(p267i.p274b.p277b.p278a.C6707b r3, boolean r4) {
            /*
                r2 = this;
                i.b.b.a.d r0 = p267i.p274b.p277b.p278a.C6711d.this
                java.lang.Object r0 = r0.f18648c
                monitor-enter(r0)
                i.b.b.a.d r1 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                java.util.ArrayList r1 = r1.f18647b     // Catch:{ all -> 0x0072 }
                r1.remove(r3)     // Catch:{ all -> 0x0072 }
                if (r4 != 0) goto L_0x0021
                i.b.b.a.d r1 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                boolean r1 = r1.f18651f     // Catch:{ all -> 0x0072 }
                if (r1 == 0) goto L_0x0021
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                r3.mo17164a()     // Catch:{ all -> 0x0072 }
                monitor-exit(r0)     // Catch:{ all -> 0x0072 }
                return
            L_0x0021:
                if (r4 == 0) goto L_0x0028
                i.b.b.a.b r3 = r3.mo17162c()     // Catch:{ all -> 0x0072 }
                goto L_0x0029
            L_0x0028:
                r3 = 0
            L_0x0029:
                if (r3 == 0) goto L_0x0041
                i.b.b.a.d r4 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                i.b.b.a.d$b r4 = r4.f18650e     // Catch:{ all -> 0x0072 }
                r3.mo17158a((p267i.p274b.p277b.p278a.C6711d.C6712a) r4)     // Catch:{ all -> 0x0072 }
                i.b.b.a.d r4 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                java.util.ArrayList r4 = r4.f18647b     // Catch:{ all -> 0x0072 }
                r4.add(r3)     // Catch:{ all -> 0x0072 }
                r3.mo17157a()     // Catch:{ all -> 0x0072 }
                goto L_0x0070
            L_0x0041:
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                java.util.ArrayList r3 = r3.f18646a     // Catch:{ all -> 0x0072 }
                int r3 = r3.size()     // Catch:{ all -> 0x0072 }
                if (r3 <= 0) goto L_0x0053
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                r3.mo17167b()     // Catch:{ all -> 0x0072 }
                goto L_0x0070
            L_0x0053:
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                java.util.ArrayList r3 = r3.f18647b     // Catch:{ all -> 0x0072 }
                int r3 = r3.size()     // Catch:{ all -> 0x0072 }
                if (r3 != 0) goto L_0x0070
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                i.b.b.a.d$c r3 = r3.f18649d     // Catch:{ all -> 0x0072 }
                if (r3 == 0) goto L_0x0070
                i.b.b.a.d r3 = p267i.p274b.p277b.p278a.C6711d.this     // Catch:{ all -> 0x0072 }
                i.b.b.a.d$c r3 = r3.f18649d     // Catch:{ all -> 0x0072 }
                r3.mo17169a()     // Catch:{ all -> 0x0072 }
            L_0x0070:
                monitor-exit(r0)     // Catch:{ all -> 0x0072 }
                return
            L_0x0072:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0072 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p267i.p274b.p277b.p278a.C6711d.C6713b.mo17168a(i.b.b.a.b, boolean):void");
        }
    }

    /* renamed from: i.b.b.a.d$c */
    public interface C6714c {
        /* renamed from: a */
        void mo17169a();
    }

    /* renamed from: a */
    public void mo17164a() {
        synchronized (this.f18648c) {
            Iterator<C6707b> it = this.f18647b.iterator();
            while (it.hasNext()) {
                it.next().mo17163d();
            }
            this.f18646a.clear();
            this.f18647b.clear();
        }
    }

    /* renamed from: a */
    public void mo17165a(C6707b bVar) {
        bVar.mo17158a((C6712a) this.f18650e);
        this.f18646a.add(bVar);
    }

    /* renamed from: a */
    public void mo17166a(C6714c cVar) {
        this.f18649d = cVar;
    }

    /* renamed from: b */
    public void mo17167b() {
        synchronized (this.f18648c) {
            if (this.f18646a.size() > 0) {
                C6707b bVar = this.f18646a.get(0);
                bVar.mo17157a();
                this.f18647b.add(bVar);
                this.f18646a.remove(bVar);
            }
        }
    }
}
