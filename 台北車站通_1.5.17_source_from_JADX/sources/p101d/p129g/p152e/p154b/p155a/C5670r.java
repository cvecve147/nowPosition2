package p101d.p129g.p152e.p154b.p155a;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.r */
public final class C5670r extends C5593I<Date> {

    /* renamed from: a */
    public static final C5594J f15703a = new C5669q();

    /* renamed from: b */
    private final DateFormat f15704b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public synchronized Date m21468a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        try {
            return new Date(this.f15704b.parse(bVar.mo15164o()).getTime());
        } catch (ParseException e) {
            throw new C5588D((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo15097a(C5718d dVar, Date date) {
        dVar.mo15181c(date == null ? null : this.f15704b.format(date));
    }
}
