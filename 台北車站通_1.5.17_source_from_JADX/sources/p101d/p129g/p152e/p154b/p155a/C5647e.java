package p101d.p129g.p152e.p154b.p155a;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.e */
public final class C5647e extends C5593I<Date> {

    /* renamed from: a */
    public static final C5594J f15609a = new C5645d();

    /* renamed from: b */
    private final DateFormat f15610b = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: c */
    private final DateFormat f15611c = DateFormat.getDateTimeInstance(2, 2);

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return p101d.p129g.p152e.p154b.p155a.p156a.C5638a.m21353a(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw new p101d.p129g.p152e.C5588D(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r2.f15610b.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.Date m21372a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f15611c     // Catch:{ ParseException -> 0x000b }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x0026
        L_0x000b:
            java.text.DateFormat r0 = r2.f15610b     // Catch:{ ParseException -> 0x0013 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x0013:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x001f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x001f }
            java.util.Date r3 = p101d.p129g.p152e.p154b.p155a.p156a.C5638a.m21353a((java.lang.String) r3, (java.text.ParsePosition) r0)     // Catch:{ ParseException -> 0x001f }
            monitor-exit(r2)
            return r3
        L_0x001f:
            r0 = move-exception
            d.g.e.D r1 = new d.g.e.D     // Catch:{ all -> 0x0009 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.p155a.C5647e.m21372a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public Date m21374a(C5716b bVar) {
        if (bVar.mo15165p() != C5717c.NULL) {
            return m21372a(bVar.mo15164o());
        }
        bVar.mo15163n();
        return null;
    }

    /* renamed from: a */
    public synchronized void mo15097a(C5718d dVar, Date date) {
        if (date == null) {
            dVar.mo15186h();
        } else {
            dVar.mo15181c(this.f15610b.format(date));
        }
    }
}
