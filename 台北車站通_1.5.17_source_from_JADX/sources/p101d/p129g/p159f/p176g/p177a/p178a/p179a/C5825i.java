package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.i */
abstract class C5825i extends C5824h {
    C5825i(C5772a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15492a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15493b(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15497b(StringBuilder sb, int i, int i2) {
        int a = mo15498a().mo15520a(i, i2);
        mo15493b(sb, a);
        int a2 = mo15492a(a);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (a2 / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(a2);
    }
}
