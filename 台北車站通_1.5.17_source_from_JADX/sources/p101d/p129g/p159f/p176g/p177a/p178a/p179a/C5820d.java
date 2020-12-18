package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.d */
final class C5820d extends C5824h {
    C5820d(C5772a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public String mo15494c() {
        if (mo15499b().mo15378f() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo15495a(sb, 8);
            int a = mo15498a().mo15520a(48, 2);
            sb.append("(393");
            sb.append(a);
            sb.append(')');
            int a2 = mo15498a().mo15520a(50, 10);
            if (a2 / 100 == 0) {
                sb.append('0');
            }
            if (a2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(a2);
            sb.append(mo15498a().mo15521a(60, (String) null).mo15512b());
            return sb.toString();
        }
        throw C5882i.m22303a();
    }
}
