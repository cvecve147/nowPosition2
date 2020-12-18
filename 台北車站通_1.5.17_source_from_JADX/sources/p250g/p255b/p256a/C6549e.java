package p250g.p255b.p256a;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p250g.p255b.p256a.p258b.C6491q;

/* renamed from: g.b.a.e */
public class C6549e {

    /* renamed from: a */
    public static final C6550a f18235a = new C6551b();

    /* renamed from: b */
    private static volatile C6550a f18236b = f18235a;

    /* renamed from: c */
    private static final AtomicReference<Map<String, C6567g>> f18237c = new AtomicReference<>();

    /* renamed from: g.b.a.e$a */
    public interface C6550a {
        /* renamed from: e */
        long mo16931e();
    }

    /* renamed from: g.b.a.e$b */
    static class C6551b implements C6550a {
        C6551b() {
        }

        /* renamed from: e */
        public long mo16931e() {
            return System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static final long m25007a() {
        return f18236b.mo16931e();
    }

    /* renamed from: a */
    public static final C6467a m25008a(C6467a aVar) {
        return aVar == null ? C6491q.m24461N() : aVar;
    }

    /* renamed from: a */
    public static final C6467a m25009a(C6581q qVar) {
        if (qVar == null) {
            return C6491q.m24461N();
        }
        C6467a chronology = qVar.getChronology();
        return chronology == null ? C6491q.m24461N() : chronology;
    }

    /* renamed from: a */
    public static final DateFormatSymbols m25010a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke((Object) null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* renamed from: a */
    private static void m25011a(Map<String, C6567g> map, String str, String str2) {
        try {
            map.put(str, C6567g.m25092a(str2));
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: b */
    public static final long m25012b(C6581q qVar) {
        return qVar == null ? m25007a() : qVar.mo16689e();
    }

    /* renamed from: b */
    public static final Map<String, C6567g> m25013b() {
        Map<String, C6567g> map = f18237c.get();
        if (map != null) {
            return map;
        }
        Map<String, C6567g> c = m25014c();
        return !f18237c.compareAndSet((Object) null, c) ? f18237c.get() : c;
    }

    /* renamed from: c */
    private static Map<String, C6567g> m25014c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", C6567g.f18277a);
        linkedHashMap.put("UTC", C6567g.f18277a);
        linkedHashMap.put("GMT", C6567g.f18277a);
        m25011a(linkedHashMap, "EST", "America/New_York");
        m25011a(linkedHashMap, "EDT", "America/New_York");
        m25011a(linkedHashMap, "CST", "America/Chicago");
        m25011a(linkedHashMap, "CDT", "America/Chicago");
        m25011a(linkedHashMap, "MST", "America/Denver");
        m25011a(linkedHashMap, "MDT", "America/Denver");
        m25011a(linkedHashMap, "PST", "America/Los_Angeles");
        m25011a(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
