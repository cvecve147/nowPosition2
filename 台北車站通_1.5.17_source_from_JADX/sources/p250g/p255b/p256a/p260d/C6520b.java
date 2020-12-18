package p250g.p255b.p256a.p260d;

import java.io.IOException;
import java.util.Locale;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6549e;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6581q;

/* renamed from: g.b.a.d.b */
public class C6520b {

    /* renamed from: a */
    private final C6548m f18105a;

    /* renamed from: b */
    private final C6546k f18106b;

    /* renamed from: c */
    private final Locale f18107c;

    /* renamed from: d */
    private final boolean f18108d;

    /* renamed from: e */
    private final C6467a f18109e;

    /* renamed from: f */
    private final C6567g f18110f;

    /* renamed from: g */
    private final Integer f18111g;

    /* renamed from: h */
    private final int f18112h;

    C6520b(C6548m mVar, C6546k kVar) {
        this.f18105a = mVar;
        this.f18106b = kVar;
        this.f18107c = null;
        this.f18108d = false;
        this.f18109e = null;
        this.f18110f = null;
        this.f18111g = null;
        this.f18112h = 2000;
    }

    private C6520b(C6548m mVar, C6546k kVar, Locale locale, boolean z, C6467a aVar, C6567g gVar, Integer num, int i) {
        this.f18105a = mVar;
        this.f18106b = kVar;
        this.f18107c = locale;
        this.f18108d = z;
        this.f18109e = aVar;
        this.f18110f = gVar;
        this.f18111g = num;
        this.f18112h = i;
    }

    /* renamed from: a */
    private void m24755a(Appendable appendable, long j, C6467a aVar) {
        long j2 = j;
        C6548m g = m24758g();
        C6467a b = m24756b(aVar);
        C6567g k = b.mo16662k();
        int c = k.mo16933c(j2);
        long j3 = (long) c;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j3 ^ j2) >= 0) {
            k = C6567g.f18277a;
            c = 0;
            j4 = j2;
        }
        C6548m mVar = g;
        Appendable appendable2 = appendable;
        long j5 = j4;
        mVar.mo16898a(appendable2, j5, b.mo16646G(), c, k, this.f18107c);
    }

    /* renamed from: b */
    private C6467a m24756b(C6467a aVar) {
        C6467a a = C6549e.m25008a(aVar);
        C6467a aVar2 = this.f18109e;
        if (aVar2 != null) {
            a = aVar2;
        }
        C6567g gVar = this.f18110f;
        return gVar != null ? a.mo16651a(gVar) : a;
    }

    /* renamed from: f */
    private C6546k m24757f() {
        C6546k kVar = this.f18106b;
        if (kVar != null) {
            return kVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: g */
    private C6548m m24758g() {
        C6548m mVar = this.f18105a;
        if (mVar != null) {
            return mVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p250g.p255b.p256a.C6471b mo16840a(java.lang.String r11) {
        /*
            r10 = this;
            g.b.a.d.k r0 = r10.m24757f()
            r1 = 0
            g.b.a.a r1 = r10.m24756b((p250g.p255b.p256a.C6467a) r1)
            g.b.a.d.e r9 = new g.b.a.d.e
            java.util.Locale r6 = r10.f18107c
            java.lang.Integer r7 = r10.f18111g
            int r8 = r10.f18112h
            r3 = 0
            r2 = r9
            r5 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r2 = 0
            int r0 = r0.mo16897a(r9, r11, r2)
            if (r0 < 0) goto L_0x005d
            int r2 = r11.length()
            if (r0 < r2) goto L_0x005e
            r0 = 1
            long r2 = r9.mo16907a((boolean) r0, (java.lang.String) r11)
            boolean r11 = r10.f18108d
            if (r11 == 0) goto L_0x0041
            java.lang.Integer r11 = r9.mo16916c()
            if (r11 == 0) goto L_0x0041
            java.lang.Integer r11 = r9.mo16916c()
            int r11 = r11.intValue()
            g.b.a.g r11 = p250g.p255b.p256a.C6567g.m25091a((int) r11)
            goto L_0x004b
        L_0x0041:
            g.b.a.g r11 = r9.mo16918e()
            if (r11 == 0) goto L_0x004f
            g.b.a.g r11 = r9.mo16918e()
        L_0x004b:
            g.b.a.a r1 = r1.mo16651a(r11)
        L_0x004f:
            g.b.a.b r11 = new g.b.a.b
            r11.<init>(r2, r1)
            g.b.a.g r0 = r10.f18110f
            if (r0 == 0) goto L_0x005c
            g.b.a.b r11 = r11.mo16691a((p250g.p255b.p256a.C6567g) r0)
        L_0x005c:
            return r11
        L_0x005d:
            int r0 = ~r0
        L_0x005e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r11 = p250g.p255b.p256a.p260d.C6543i.m24925a((java.lang.String) r11, (int) r0)
            r1.<init>(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p260d.C6520b.mo16840a(java.lang.String):g.b.a.b");
    }

    /* renamed from: a */
    public C6520b mo16841a(C6467a aVar) {
        if (this.f18109e == aVar) {
            return this;
        }
        return new C6520b(this.f18105a, this.f18106b, this.f18107c, this.f18108d, aVar, this.f18110f, this.f18111g, this.f18112h);
    }

    /* renamed from: a */
    public C6520b mo16842a(C6567g gVar) {
        if (this.f18110f == gVar) {
            return this;
        }
        return new C6520b(this.f18105a, this.f18106b, this.f18107c, false, this.f18109e, gVar, this.f18111g, this.f18112h);
    }

    /* renamed from: a */
    public C6536d mo16843a() {
        return C6547l.m25001a(this.f18106b);
    }

    /* renamed from: a */
    public String mo16844a(C6581q qVar) {
        StringBuilder sb = new StringBuilder(m24758g().mo16899b());
        try {
            mo16845a(sb, qVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo16845a(Appendable appendable, C6581q qVar) {
        m24755a(appendable, C6549e.m25012b(qVar), C6549e.m25009a(qVar));
    }

    /* renamed from: b */
    public long mo16846b(String str) {
        return new C6537e(0, m24756b(this.f18109e), this.f18107c, this.f18111g, this.f18112h).mo16905a(m24757f(), (CharSequence) str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6546k mo16847b() {
        return this.f18106b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6548m mo16848c() {
        return this.f18105a;
    }

    /* renamed from: d */
    public C6520b mo16849d() {
        return this.f18108d ? this : new C6520b(this.f18105a, this.f18106b, this.f18107c, true, this.f18109e, (C6567g) null, this.f18111g, this.f18112h);
    }

    /* renamed from: e */
    public C6520b mo16850e() {
        return mo16842a(C6567g.f18277a);
    }
}
