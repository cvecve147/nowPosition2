package p101d.p129g.p152e.p154b.p155a;

import java.sql.Timestamp;
import java.util.Date;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.P */
class C5627P implements C5594J {
    C5627P() {
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        if (aVar.mo15267a() != Timestamp.class) {
            return null;
        }
        return new C5626O(this, pVar.mo15289a(Date.class));
    }
}
