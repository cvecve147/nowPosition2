package p101d.p129g.p152e.p154b.p155a;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.Q */
class C5628Q extends C5593I<Calendar> {
    C5628Q() {
    }

    /* renamed from: a */
    public Calendar m21329a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        bVar.mo15152b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (bVar.mo15165p() != C5717c.END_OBJECT) {
            String m = bVar.mo15162m();
            int k = bVar.mo15160k();
            if ("year".equals(m)) {
                i = k;
            } else if ("month".equals(m)) {
                i2 = k;
            } else if ("dayOfMonth".equals(m)) {
                i3 = k;
            } else if ("hourOfDay".equals(m)) {
                i4 = k;
            } else if ("minute".equals(m)) {
                i5 = k;
            } else if ("second".equals(m)) {
                i6 = k;
            }
        }
        bVar.mo15155e();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Calendar calendar) {
        if (calendar == null) {
            dVar.mo15186h();
            return;
        }
        dVar.mo15179b();
        dVar.mo15178a("year");
        dVar.mo15175a((long) calendar.get(1));
        dVar.mo15178a("month");
        dVar.mo15175a((long) calendar.get(2));
        dVar.mo15178a("dayOfMonth");
        dVar.mo15175a((long) calendar.get(5));
        dVar.mo15178a("hourOfDay");
        dVar.mo15175a((long) calendar.get(11));
        dVar.mo15178a("minute");
        dVar.mo15175a((long) calendar.get(12));
        dVar.mo15178a("second");
        dVar.mo15175a((long) calendar.get(13));
        dVar.mo15183d();
    }
}
