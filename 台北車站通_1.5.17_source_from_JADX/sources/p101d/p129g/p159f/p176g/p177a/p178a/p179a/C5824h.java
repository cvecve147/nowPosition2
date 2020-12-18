package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.h */
abstract class C5824h extends C5826j {
    C5824h(C5772a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    private static void mo15493b(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15495a(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo15496a(sb, i, length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15496a(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int a = mo15498a().mo15520a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                sb.append('0');
            }
            if (a / 10 == 0) {
                sb.append('0');
            }
            sb.append(a);
        }
        mo15493b(sb, i2);
    }
}
