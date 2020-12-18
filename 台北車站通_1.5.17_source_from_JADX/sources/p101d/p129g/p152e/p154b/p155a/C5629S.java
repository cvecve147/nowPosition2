package p101d.p129g.p152e.p154b.p155a;

import java.util.Locale;
import java.util.StringTokenizer;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.S */
class C5629S extends C5593I<Locale> {
    C5629S() {
    }

    /* renamed from: a */
    public Locale m21333a(C5716b bVar) {
        String str = null;
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(bVar.mo15164o(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Locale locale) {
        dVar.mo15181c(locale == null ? null : locale.toString());
    }
}
