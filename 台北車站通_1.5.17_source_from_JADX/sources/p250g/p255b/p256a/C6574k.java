package p250g.p255b.p256a;

import p250g.p255b.p256a.p260d.C6519a;

/* renamed from: g.b.a.k */
public class C6574k extends IllegalArgumentException {
    public C6574k(long j, String str) {
        super(m25145a(j, str));
    }

    public C6574k(String str) {
        super(str);
    }

    /* renamed from: a */
    private static String m25145a(long j, String str) {
        String str2;
        String a = C6519a.m24750a("yyyy-MM-dd'T'HH:mm:ss.SSS").mo16844a((C6581q) new C6575l(j));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = "";
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + a + str2;
    }
}
