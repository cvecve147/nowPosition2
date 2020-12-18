package p250g.p255b.p256a.p258b;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6549e;
import p250g.p255b.p256a.C6573j;

/* renamed from: g.b.a.b.m */
class C6487m {

    /* renamed from: a */
    private static ConcurrentMap<Locale, C6487m> f18014a = new ConcurrentHashMap();

    /* renamed from: b */
    private final String[] f18015b;

    /* renamed from: c */
    private final String[] f18016c;

    /* renamed from: d */
    private final String[] f18017d;

    /* renamed from: e */
    private final String[] f18018e;

    /* renamed from: f */
    private final String[] f18019f;

    /* renamed from: g */
    private final String[] f18020g;

    /* renamed from: h */
    private final TreeMap<String, Integer> f18021h;

    /* renamed from: i */
    private final TreeMap<String, Integer> f18022i;

    /* renamed from: j */
    private final TreeMap<String, Integer> f18023j;

    /* renamed from: k */
    private final int f18024k;

    /* renamed from: l */
    private final int f18025l;

    /* renamed from: m */
    private final int f18026m;

    /* renamed from: n */
    private final int f18027n;

    /* renamed from: o */
    private final int f18028o;

    /* renamed from: p */
    private final int f18029p;

    private C6487m(Locale locale) {
        DateFormatSymbols a = C6549e.m25010a(locale);
        this.f18015b = a.getEras();
        this.f18016c = m24418b(a.getWeekdays());
        this.f18017d = m24418b(a.getShortWeekdays());
        this.f18018e = m24419c(a.getMonths());
        this.f18019f = m24419c(a.getShortMonths());
        this.f18020g = a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        this.f18021h = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        m24417a(this.f18021h, this.f18015b, numArr);
        if ("en".equals(locale.getLanguage())) {
            this.f18021h.put("BCE", numArr[0]);
            this.f18021h.put("CE", numArr[1]);
        }
        this.f18022i = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        m24417a(this.f18022i, this.f18016c, numArr);
        m24417a(this.f18022i, this.f18017d, numArr);
        m24416a(this.f18022i, 1, 7, numArr);
        this.f18023j = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        m24417a(this.f18023j, this.f18018e, numArr);
        m24417a(this.f18023j, this.f18019f, numArr);
        m24416a(this.f18023j, 1, 12, numArr);
        this.f18024k = m24414a(this.f18015b);
        this.f18025l = m24414a(this.f18016c);
        this.f18026m = m24414a(this.f18017d);
        this.f18027n = m24414a(this.f18018e);
        this.f18028o = m24414a(this.f18019f);
        this.f18029p = m24414a(this.f18020g);
    }

    /* renamed from: a */
    private static int m24414a(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    /* renamed from: a */
    static C6487m m24415a(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C6487m mVar = (C6487m) f18014a.get(locale);
        if (mVar != null) {
            return mVar;
        }
        C6487m mVar2 = new C6487m(locale);
        C6487m putIfAbsent = f18014a.putIfAbsent(locale, mVar2);
        return putIfAbsent != null ? putIfAbsent : mVar2;
    }

    /* renamed from: a */
    private static void m24416a(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: a */
    private static void m24417a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private static String[] m24418b(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    /* renamed from: c */
    private static String[] m24419c(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: a */
    public int mo16761a() {
        return this.f18025l;
    }

    /* renamed from: a */
    public int mo16762a(String str) {
        Integer num = this.f18022i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C6573j(C6517d.m24700B(), str);
    }

    /* renamed from: a */
    public String mo16763a(int i) {
        return this.f18017d[i];
    }

    /* renamed from: b */
    public int mo16764b() {
        return this.f18024k;
    }

    /* renamed from: b */
    public int mo16765b(String str) {
        Integer num = this.f18021h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C6573j(C6517d.m24702D(), str);
    }

    /* renamed from: b */
    public String mo16766b(int i) {
        return this.f18016c[i];
    }

    /* renamed from: c */
    public int mo16767c() {
        return this.f18029p;
    }

    /* renamed from: c */
    public int mo16768c(String str) {
        String[] strArr = this.f18020g;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new C6573j(C6517d.m24703G(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* renamed from: c */
    public String mo16769c(int i) {
        return this.f18015b[i];
    }

    /* renamed from: d */
    public int mo16770d() {
        return this.f18027n;
    }

    /* renamed from: d */
    public int mo16771d(String str) {
        Integer num = this.f18023j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C6573j(C6517d.m24710N(), str);
    }

    /* renamed from: d */
    public String mo16772d(int i) {
        return this.f18020g[i];
    }

    /* renamed from: e */
    public String mo16773e(int i) {
        return this.f18019f[i];
    }

    /* renamed from: f */
    public String mo16774f(int i) {
        return this.f18018e[i];
    }
}
