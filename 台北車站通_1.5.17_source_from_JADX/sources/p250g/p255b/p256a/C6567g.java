package p250g.p255b.p256a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p250g.p255b.p256a.p260d.C6520b;
import p250g.p255b.p256a.p260d.C6521c;
import p250g.p255b.p256a.p260d.C6543i;
import p250g.p255b.p256a.p261e.C6559c;
import p250g.p255b.p256a.p261e.C6560d;
import p250g.p255b.p256a.p261e.C6561e;
import p250g.p255b.p256a.p261e.C6562f;

/* renamed from: g.b.a.g */
public abstract class C6567g implements Serializable {

    /* renamed from: a */
    public static final C6567g f18277a = C6582r.f18312f;

    /* renamed from: b */
    private static final AtomicReference<C6562f> f18278b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<C6561e> f18279c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<C6567g> f18280d = new AtomicReference<>();

    /* renamed from: e */
    private final String f18281e;

    /* renamed from: g.b.a.g$a */
    static final class C6568a {

        /* renamed from: a */
        static final Map<String, String> f18282a = m25120b();

        /* renamed from: b */
        static final C6520b f18283b = m25119a();

        /* renamed from: a */
        private static C6520b m25119a() {
            C6566f fVar = new C6566f();
            C6521c cVar = new C6521c();
            cVar.mo16864a((String) null, true, 2, 4);
            return cVar.mo16891i().mo16841a((C6467a) fVar);
        }

        /* renamed from: b */
        private static Map<String, String> m25120b() {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            hashMap.put("WET", "WET");
            hashMap.put("CET", "CET");
            hashMap.put("MET", "CET");
            hashMap.put("ECT", "CET");
            hashMap.put("EET", "EET");
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: g.b.a.g$b */
    private static final class C6569b implements Serializable {

        /* renamed from: a */
        private transient String f18284a;

        C6569b(String str) {
            this.f18284a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.f18284a = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return C6567g.m25092a(this.f18284a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeUTF(this.f18284a);
        }
    }

    protected C6567g(String str) {
        if (str != null) {
            this.f18281e = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    /* renamed from: a */
    private static C6562f m25090a(C6562f fVar) {
        Set<String> a = fVar.mo16959a();
        if (a == null || a.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        } else if (!a.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (f18277a.equals(fVar.mo16958a("UTC"))) {
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    /* renamed from: a */
    public static C6567g m25091a(int i) {
        if (i >= -86399999 && i <= 86399999) {
            return m25093a(m25097b(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: " + i);
    }

    /* renamed from: a */
    public static C6567g m25092a(String str) {
        if (str == null) {
            return m25096b();
        }
        if (str.equals("UTC")) {
            return f18277a;
        }
        C6567g a = m25102e().mo16958a(str);
        if (a != null) {
            return a;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int d = m25100d(str);
            return ((long) d) == 0 ? f18277a : m25093a(m25097b(d), d);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    /* renamed from: a */
    private static C6567g m25093a(String str, int i) {
        return i == 0 ? f18277a : new C6560d(str, (String) null, i, i);
    }

    /* renamed from: a */
    public static C6567g m25094a(TimeZone timeZone) {
        char charAt;
        if (timeZone == null) {
            return m25096b();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return f18277a;
        } else {
            C6567g gVar = null;
            String c = m25099c(id);
            C6562f e = m25102e();
            if (c != null) {
                gVar = e.mo16958a(c);
            }
            if (gVar == null) {
                gVar = e.mo16958a(id);
            }
            if (gVar != null) {
                return gVar;
            }
            if (c != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
            }
            String substring = id.substring(3);
            if (substring.length() > 2 && (charAt = substring.charAt(1)) > '9' && Character.isDigit(charAt)) {
                substring = m25098b(substring);
            }
            int d = m25100d(substring);
            return ((long) d) == 0 ? f18277a : m25093a(m25097b(d), d);
        }
    }

    /* renamed from: a */
    public static Set<String> m25095a() {
        return m25102e().mo16959a();
    }

    /* renamed from: b */
    public static C6567g m25096b() {
        C6567g gVar = f18280d.get();
        if (gVar != null) {
            return gVar;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                gVar = m25092a(property);
            }
        } catch (RuntimeException unused) {
        }
        if (gVar == null) {
            try {
                gVar = m25094a(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (gVar == null) {
            gVar = f18277a;
        }
        return !f18280d.compareAndSet((Object) null, gVar) ? f18280d.get() : gVar;
    }

    /* renamed from: b */
    private static String m25097b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        C6543i.m24928a(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(':');
        C6543i.m24928a(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        C6543i.m24928a(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        C6543i.m24928a(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m25098b(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char) (digit + 48));
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static String m25099c(String str) {
        return C6568a.f18282a.get(str);
    }

    /* renamed from: d */
    private static int m25100d(String str) {
        return -((int) C6568a.f18283b.mo16846b(str));
    }

    /* renamed from: d */
    public static C6561e m25101d() {
        C6561e eVar = f18279c.get();
        if (eVar != null) {
            return eVar;
        }
        C6561e g = m25103g();
        return !f18279c.compareAndSet((Object) null, g) ? f18279c.get() : g;
    }

    /* renamed from: e */
    public static C6562f m25102e() {
        C6562f fVar = f18278b.get();
        if (fVar != null) {
            return fVar;
        }
        C6562f h = m25104h();
        return !f18278b.compareAndSet((Object) null, h) ? f18278b.get() : h;
    }

    /* renamed from: g */
    private static C6561e m25103g() {
        C6561e eVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                eVar = (C6561e) Class.forName(property).newInstance();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
        }
        return eVar == null ? new C6559c() : eVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003a */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p250g.p255b.p256a.p261e.C6562f m25104h() {
        /*
            java.lang.String r0 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x001d }
            if (r0 == 0) goto L_0x001d
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0016 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0016 }
            g.b.a.e.f r0 = (p250g.p255b.p256a.p261e.C6562f) r0     // Catch:{ Exception -> 0x0016 }
            m25090a((p250g.p255b.p256a.p261e.C6562f) r0)     // Catch:{ Exception -> 0x0016 }
            return r0
        L_0x0016:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x001d }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x001d }
            throw r1     // Catch:{ SecurityException -> 0x001d }
        L_0x001d:
            java.lang.String r0 = "org.joda.time.DateTimeZone.Folder"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x003a }
            if (r0 == 0) goto L_0x003a
            g.b.a.e.i r1 = new g.b.a.e.i     // Catch:{ Exception -> 0x0033 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0033 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0033 }
            r1.<init>((java.io.File) r2)     // Catch:{ Exception -> 0x0033 }
            m25090a((p250g.p255b.p256a.p261e.C6562f) r1)     // Catch:{ Exception -> 0x0033 }
            return r1
        L_0x0033:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x003a }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x003a }
            throw r1     // Catch:{ SecurityException -> 0x003a }
        L_0x003a:
            g.b.a.e.i r0 = new g.b.a.e.i     // Catch:{ Exception -> 0x0045 }
            java.lang.String r1 = "org/joda/time/tz/data"
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0045 }
            m25090a((p250g.p255b.p256a.p261e.C6562f) r0)     // Catch:{ Exception -> 0x0045 }
            return r0
        L_0x0045:
            r0 = move-exception
            r0.printStackTrace()
            g.b.a.e.g r0 = new g.b.a.e.g
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.C6567g.m25104h():g.b.a.e.f");
    }

    /* renamed from: a */
    public long mo16963a(long j) {
        long c = (long) mo16933c(j);
        long j2 = j + c;
        if ((j ^ j2) >= 0 || (j ^ c) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo16964a(long r11, boolean r13) {
        /*
            r10 = this;
            int r0 = r10.mo16933c((long) r11)
            long r1 = (long) r0
            long r1 = r11 - r1
            int r3 = r10.mo16933c((long) r1)
            if (r0 == r3) goto L_0x003d
            if (r13 != 0) goto L_0x0011
            if (r0 >= 0) goto L_0x003d
        L_0x0011:
            long r4 = r10.mo16937g(r1)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            long r1 = (long) r3
            long r1 = r11 - r1
            long r8 = r10.mo16937g(r1)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = r8
        L_0x002c:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            if (r13 != 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            g.b.a.k r13 = new g.b.a.k
            java.lang.String r0 = r10.mo16968c()
            r13.<init>(r11, r0)
            throw r13
        L_0x003d:
            r0 = r3
        L_0x003e:
            long r0 = (long) r0
            long r2 = r11 - r0
            long r4 = r11 ^ r2
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0057
            long r11 = r11 ^ r0
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Subtracting time zone offset caused overflow"
            r11.<init>(r12)
            throw r11
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.C6567g.mo16964a(long, boolean):long");
    }

    /* renamed from: a */
    public long mo16965a(long j, boolean z, long j2) {
        int c = mo16933c(j2);
        long j3 = j - ((long) c);
        return mo16933c(j3) == c ? j3 : mo16964a(j, z);
    }

    /* renamed from: a */
    public String mo16966a(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String b = mo16932b(j);
        if (b == null) {
            return this.f18281e;
        }
        C6561e d = m25101d();
        String a = d instanceof C6559c ? ((C6559c) d).mo16954a(locale, this.f18281e, b, mo16969f(j)) : d.mo16953a(locale, this.f18281e, b);
        return a != null ? a : m25097b(mo16933c(j));
    }

    /* renamed from: b */
    public abstract String mo16932b(long j);

    /* renamed from: b */
    public String mo16967b(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String b = mo16932b(j);
        if (b == null) {
            return this.f18281e;
        }
        C6561e d = m25101d();
        String b2 = d instanceof C6559c ? ((C6559c) d).mo16956b(locale, this.f18281e, b, mo16969f(j)) : d.mo16955b(locale, this.f18281e, b);
        return b2 != null ? b2 : m25097b(mo16933c(j));
    }

    /* renamed from: c */
    public abstract int mo16933c(long j);

    /* renamed from: c */
    public final String mo16968c() {
        return this.f18281e;
    }

    /* renamed from: d */
    public int mo16957d(long j) {
        int c = mo16933c(j);
        long j2 = j - ((long) c);
        int c2 = mo16933c(j2);
        if (c != c2) {
            if (c - c2 < 0) {
                long g = mo16937g(j2);
                if (g == j2) {
                    g = Long.MAX_VALUE;
                }
                long j3 = j - ((long) c2);
                long g2 = mo16937g(j3);
                if (g2 == j3) {
                    g2 = Long.MAX_VALUE;
                }
                if (g != g2) {
                    return c;
                }
            }
        } else if (c >= 0) {
            long h = mo16938h(j2);
            if (h < j2) {
                int c3 = mo16933c(h);
                if (j2 - h <= ((long) (c3 - c))) {
                    return c3;
                }
            }
        }
        return c2;
    }

    /* renamed from: e */
    public abstract int mo16934e(long j);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract boolean mo16936f();

    /* renamed from: f */
    public boolean mo16969f(long j) {
        return mo16933c(j) == mo16934e(j);
    }

    /* renamed from: g */
    public abstract long mo16937g(long j);

    /* renamed from: h */
    public abstract long mo16938h(long j);

    public int hashCode() {
        return mo16968c().hashCode() + 57;
    }

    public String toString() {
        return mo16968c();
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new C6569b(this.f18281e);
    }
}
