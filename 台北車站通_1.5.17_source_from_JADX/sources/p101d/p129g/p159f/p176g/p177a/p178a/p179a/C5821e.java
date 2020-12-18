package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.e */
final class C5821e extends C5825i {

    /* renamed from: c */
    private final String f16107c;

    /* renamed from: d */
    private final String f16108d;

    C5821e(C5772a aVar, String str, String str2) {
        super(aVar);
        this.f16107c = str2;
        this.f16108d = str;
    }

    /* renamed from: c */
    private void m21980c(StringBuilder sb, int i) {
        int a = mo15498a().mo15520a(i, 16);
        if (a != 38400) {
            sb.append('(');
            sb.append(this.f16107c);
            sb.append(')');
            int i2 = a % 32;
            int i3 = a / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15492a(int i) {
        return i % 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15493b(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f16108d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* renamed from: c */
    public String mo15494c() {
        if (mo15499b().mo15378f() == 84) {
            StringBuilder sb = new StringBuilder();
            mo15495a(sb, 8);
            mo15497b(sb, 48, 20);
            m21980c(sb, 68);
            return sb.toString();
        }
        throw C5882i.m22303a();
    }
}
