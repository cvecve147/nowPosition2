package p250g.p255b.p256a.p258b;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpStatus;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.p258b.C6472a;

/* renamed from: g.b.a.b.p */
public final class C6490p extends C6480f {

    /* renamed from: ka */
    private static final C6490p f18031ka = m24449b(C6567g.f18277a);

    /* renamed from: la */
    private static final ConcurrentHashMap<C6567g, C6490p[]> f18032la = new ConcurrentHashMap<>();

    private C6490p(C6467a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* renamed from: Z */
    public static C6490p m24447Z() {
        return f18031ka;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = new p250g.p255b.p256a.p258b.C6490p[7];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p250g.p255b.p256a.p258b.C6490p m24448a(p250g.p255b.p256a.C6567g r5, int r6) {
        /*
            if (r5 != 0) goto L_0x0006
            g.b.a.g r5 = p250g.p255b.p256a.C6567g.m25096b()
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap<g.b.a.g, g.b.a.b.p[]> r0 = f18032la
            java.lang.Object r0 = r0.get(r5)
            g.b.a.b.p[] r0 = (p250g.p255b.p256a.p258b.C6490p[]) r0
            if (r0 != 0) goto L_0x001e
            r0 = 7
            g.b.a.b.p[] r0 = new p250g.p255b.p256a.p258b.C6490p[r0]
            java.util.concurrent.ConcurrentHashMap<g.b.a.g, g.b.a.b.p[]> r1 = f18032la
            java.lang.Object r1 = r1.putIfAbsent(r5, r0)
            g.b.a.b.p[] r1 = (p250g.p255b.p256a.p258b.C6490p[]) r1
            if (r1 == 0) goto L_0x001e
            r0 = r1
        L_0x001e:
            int r1 = r6 + -1
            r2 = r0[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r2 != 0) goto L_0x004c
            monitor-enter(r0)
            r2 = r0[r1]     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0047
            g.b.a.g r2 = p250g.p255b.p256a.C6567g.f18277a     // Catch:{ all -> 0x0049 }
            r3 = 0
            if (r5 != r2) goto L_0x0034
            g.b.a.b.p r5 = new g.b.a.b.p     // Catch:{ all -> 0x0049 }
            r5.<init>(r3, r3, r6)     // Catch:{ all -> 0x0049 }
            goto L_0x0044
        L_0x0034:
            g.b.a.g r2 = p250g.p255b.p256a.C6567g.f18277a     // Catch:{ all -> 0x0049 }
            g.b.a.b.p r2 = m24448a(r2, r6)     // Catch:{ all -> 0x0049 }
            g.b.a.b.p r4 = new g.b.a.b.p     // Catch:{ all -> 0x0049 }
            g.b.a.b.s r5 = p250g.p255b.p256a.p258b.C6494s.m24476a((p250g.p255b.p256a.C6467a) r2, (p250g.p255b.p256a.C6567g) r5)     // Catch:{ all -> 0x0049 }
            r4.<init>(r5, r3, r6)     // Catch:{ all -> 0x0049 }
            r5 = r4
        L_0x0044:
            r0[r1] = r5     // Catch:{ all -> 0x0049 }
            r2 = r5
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004c
        L_0x0049:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5
        L_0x004c:
            return r2
        L_0x004d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid min days in first week: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p258b.C6490p.m24448a(g.b.a.g, int):g.b.a.b.p");
    }

    /* renamed from: b */
    public static C6490p m24449b(C6567g gVar) {
        return m24448a(gVar, 4);
    }

    private Object readResolve() {
        C6467a L = mo16693L();
        int Y = mo16706Y();
        if (Y == 0) {
            Y = 4;
        }
        return m24448a(L == null ? C6567g.f18277a : L.mo16662k(), Y);
    }

    /* renamed from: G */
    public C6467a mo16646G() {
        return f18031ka;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public long mo16697P() {
        return 31083597720000L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public long mo16698Q() {
        return 2629746000L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public long mo16699R() {
        return 31556952000L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public long mo16700S() {
        return 15778476000L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public int mo16704W() {
        return 292278993;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo16705X() {
        return -292275054;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo16711a(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (mo16730f(i)) {
                i2--;
            }
        }
        return ((((long) i) * 365) + ((long) (i2 - 719527))) * 86400000;
    }

    /* renamed from: a */
    public C6467a mo16651a(C6567g gVar) {
        if (gVar == null) {
            gVar = C6567g.m25096b();
        }
        return gVar == mo16662k() ? this : m24449b(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16695a(C6472a.C6473a aVar) {
        if (mo16693L() == null) {
            super.mo16695a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo16730f(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % HttpStatus.SC_BAD_REQUEST == 0);
    }
}
