package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.s */
final class C5836s {

    /* renamed from: a */
    private final C5772a f16131a;

    /* renamed from: b */
    private final C5829m f16132b = new C5829m();

    /* renamed from: c */
    private final StringBuilder f16133c = new StringBuilder();

    C5836s(C5772a aVar) {
        this.f16131a = aVar;
    }

    /* renamed from: a */
    static int m22020a(C5772a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo15369a(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    private C5828l m22021a() {
        while (m22031g(this.f16132b.mo15502a())) {
            C5831n a = m22022a(this.f16132b.mo15502a());
            this.f16132b.mo15504b(a.mo15519a());
            if (a.mo15511c()) {
                return new C5828l(new C5832o(this.f16132b.mo15502a(), this.f16133c.toString()), true);
            }
            this.f16133c.append(a.mo15510b());
        }
        if (m22028d(this.f16132b.mo15502a())) {
            this.f16132b.mo15503a(3);
            this.f16132b.mo15509f();
        } else if (m22029e(this.f16132b.mo15502a())) {
            if (this.f16132b.mo15502a() + 5 < this.f16131a.mo15378f()) {
                this.f16132b.mo15503a(5);
            } else {
                this.f16132b.mo15504b(this.f16131a.mo15378f());
            }
            this.f16132b.mo15508e();
        }
        return new C5828l(false);
    }

    /* renamed from: a */
    private C5831n m22022a(int i) {
        char c;
        int a = mo15520a(i, 5);
        if (a == 15) {
            return new C5831n(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new C5831n(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = mo15520a(i, 6);
        if (a2 >= 32 && a2 < 58) {
            return new C5831n(i + 6, (char) (a2 + 33));
        }
        switch (a2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + a2);
        }
        return new C5831n(i + 6, c);
    }

    /* renamed from: b */
    private C5831n m22023b(int i) {
        char c;
        int a = mo15520a(i, 5);
        if (a == 15) {
            return new C5831n(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new C5831n(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = mo15520a(i, 7);
        if (a2 >= 64 && a2 < 90) {
            return new C5831n(i + 7, (char) (a2 + 1));
        }
        if (a2 >= 90 && a2 < 116) {
            return new C5831n(i + 7, (char) (a2 + 7));
        }
        switch (mo15520a(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = TokenParser.DQUOTE;
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = TokenParser.f19315SP;
                break;
            default:
                throw C5811f.m21947a();
        }
        return new C5831n(i + 8, c);
    }

    /* renamed from: b */
    private C5832o m22024b() {
        C5828l a;
        boolean b;
        do {
            int a2 = this.f16132b.mo15502a();
            a = this.f16132b.mo15505b() ? m22021a() : this.f16132b.mo15506c() ? m22025c() : m22027d();
            b = a.mo15501b();
            if (!(a2 != this.f16132b.mo15502a()) && !b) {
                break;
            }
        } while (!b);
        return a.mo15500a();
    }

    /* renamed from: c */
    private C5828l m22025c() {
        while (m22032h(this.f16132b.mo15502a())) {
            C5831n b = m22023b(this.f16132b.mo15502a());
            this.f16132b.mo15504b(b.mo15519a());
            if (b.mo15511c()) {
                return new C5828l(new C5832o(this.f16132b.mo15502a(), this.f16133c.toString()), true);
            }
            this.f16133c.append(b.mo15510b());
        }
        if (m22028d(this.f16132b.mo15502a())) {
            this.f16132b.mo15503a(3);
            this.f16132b.mo15509f();
        } else if (m22029e(this.f16132b.mo15502a())) {
            if (this.f16132b.mo15502a() + 5 < this.f16131a.mo15378f()) {
                this.f16132b.mo15503a(5);
            } else {
                this.f16132b.mo15504b(this.f16131a.mo15378f());
            }
            this.f16132b.mo15507d();
        }
        return new C5828l(false);
    }

    /* renamed from: c */
    private C5833p m22026c(int i) {
        int i2 = i + 7;
        if (i2 > this.f16131a.mo15378f()) {
            int a = mo15520a(i, 4);
            return a == 0 ? new C5833p(this.f16131a.mo15378f(), 10, 10) : new C5833p(this.f16131a.mo15378f(), a - 1, 10);
        }
        int a2 = mo15520a(i, 7) - 8;
        return new C5833p(i2, a2 / 11, a2 % 11);
    }

    /* renamed from: d */
    private C5828l m22027d() {
        while (m22033i(this.f16132b.mo15502a())) {
            C5833p c = m22026c(this.f16132b.mo15502a());
            this.f16132b.mo15504b(c.mo15519a());
            if (c.mo15517d()) {
                return new C5828l(c.mo15518e() ? new C5832o(this.f16132b.mo15502a(), this.f16133c.toString()) : new C5832o(this.f16132b.mo15502a(), this.f16133c.toString(), c.mo15516c()), true);
            }
            this.f16133c.append(c.mo15515b());
            if (c.mo15518e()) {
                return new C5828l(new C5832o(this.f16132b.mo15502a(), this.f16133c.toString()), true);
            }
            this.f16133c.append(c.mo15516c());
        }
        if (m22030f(this.f16132b.mo15502a())) {
            this.f16132b.mo15507d();
            this.f16132b.mo15503a(4);
        }
        return new C5828l(false);
    }

    /* renamed from: d */
    private boolean m22028d(int i) {
        int i2 = i + 3;
        if (i2 > this.f16131a.mo15378f()) {
            return false;
        }
        while (i < i2) {
            if (this.f16131a.mo15369a(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m22029e(int i) {
        int i2;
        if (i + 1 > this.f16131a.mo15378f()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f16131a.mo15378f()) {
            if (i3 == 2) {
                if (!this.f16131a.mo15369a(i + 2)) {
                    return false;
                }
            } else if (this.f16131a.mo15369a(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m22030f(int i) {
        int i2;
        if (i + 1 > this.f16131a.mo15378f()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f16131a.mo15378f()) {
            if (this.f16131a.mo15369a(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo15520a(r6, 6);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22031g(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            d.g.f.c.a r1 = r5.f16131a
            int r1 = r1.mo15378f()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo15520a((int) r6, (int) r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            d.g.f.c.a r1 = r5.f16131a
            int r1 = r1.mo15378f()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo15520a((int) r6, (int) r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            r2 = r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p176g.p177a.p178a.p179a.C5836s.m22031g(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo15520a(r5, 8);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22032h(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            d.g.f.c.a r1 = r4.f16131a
            int r1 = r1.mo15378f()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo15520a((int) r5, (int) r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            d.g.f.c.a r1 = r4.f16131a
            int r1 = r1.mo15378f()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo15520a((int) r5, (int) r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            d.g.f.c.a r1 = r4.f16131a
            int r1 = r1.mo15378f()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo15520a((int) r5, (int) r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            r2 = r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p176g.p177a.p178a.p179a.C5836s.m22032h(int):boolean");
    }

    /* renamed from: i */
    private boolean m22033i(int i) {
        if (i + 7 > this.f16131a.mo15378f()) {
            return i + 4 <= this.f16131a.mo15378f();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f16131a.mo15369a(i3);
            }
            if (this.f16131a.mo15369a(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15520a(int i, int i2) {
        return m22020a(this.f16131a, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5832o mo15521a(int i, String str) {
        this.f16133c.setLength(0);
        if (str != null) {
            this.f16133c.append(str);
        }
        this.f16132b.mo15504b(i);
        C5832o b = m22024b();
        return (b == null || !b.mo15514d()) ? new C5832o(this.f16132b.mo15502a(), this.f16133c.toString()) : new C5832o(this.f16132b.mo15502a(), this.f16133c.toString(), b.mo15513c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo15522a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C5832o a = mo15521a(i, str);
            String a2 = C5835r.m22018a(a.mo15512b());
            if (a2 != null) {
                sb.append(a2);
            }
            String valueOf = a.mo15514d() ? String.valueOf(a.mo15513c()) : null;
            if (i == a.mo15519a()) {
                return sb.toString();
            }
            i = a.mo15519a();
            str = valueOf;
        }
    }
}
