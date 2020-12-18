package p101d.p129g.p152e.p154b.p155a;

import java.sql.Timestamp;
import java.util.Date;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.O */
class C5626O extends C5593I<Timestamp> {

    /* renamed from: a */
    final /* synthetic */ C5593I f15587a;

    /* renamed from: b */
    final /* synthetic */ C5627P f15588b;

    C5626O(C5627P p, C5593I i) {
        this.f15588b = p;
        this.f15587a = i;
    }

    /* renamed from: a */
    public Timestamp m21324a(C5716b bVar) {
        Date date = (Date) this.f15587a.mo15096a(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Timestamp timestamp) {
        this.f15587a.mo15097a(dVar, timestamp);
    }
}
