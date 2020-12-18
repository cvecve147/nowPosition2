package p250g.p255b.p256a.p260d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6549e;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6576m;
import p250g.p255b.p256a.p259c.C6507i;
import p250g.p255b.p256a.p259c.C6509k;

/* renamed from: g.b.a.d.c */
public class C6521c {

    /* renamed from: a */
    private ArrayList<Object> f18113a = new ArrayList<>();

    /* renamed from: b */
    private Object f18114b;

    /* renamed from: g.b.a.d.c$a */
    static class C6522a implements C6548m, C6546k {

        /* renamed from: a */
        private final char f18115a;

        C6522a(char c) {
            this.f18115a = c;
        }

        /* renamed from: a */
        public int mo16896a() {
            return 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            r1 = java.lang.Character.toUpperCase(r1);
            r2 = java.lang.Character.toUpperCase(r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo16897a(p250g.p255b.p256a.p260d.C6537e r1, java.lang.CharSequence r2, int r3) {
            /*
                r0 = this;
                int r1 = r2.length()
                if (r3 < r1) goto L_0x0008
                int r1 = ~r3
                return r1
            L_0x0008:
                char r1 = r2.charAt(r3)
                char r2 = r0.f18115a
                if (r1 == r2) goto L_0x0026
                char r1 = java.lang.Character.toUpperCase(r1)
                char r2 = java.lang.Character.toUpperCase(r2)
                if (r1 == r2) goto L_0x0026
                char r1 = java.lang.Character.toLowerCase(r1)
                char r2 = java.lang.Character.toLowerCase(r2)
                if (r1 == r2) goto L_0x0026
                int r1 = ~r3
                return r1
            L_0x0026:
                int r3 = r3 + 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p260d.C6521c.C6522a.mo16897a(g.b.a.d.e, java.lang.CharSequence, int):int");
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            appendable.append(this.f18115a);
        }

        /* renamed from: b */
        public int mo16899b() {
            return 1;
        }
    }

    /* renamed from: g.b.a.d.c$b */
    static class C6523b implements C6548m, C6546k {

        /* renamed from: a */
        private final C6548m[] f18116a;

        /* renamed from: b */
        private final C6546k[] f18117b;

        /* renamed from: c */
        private final int f18118c;

        /* renamed from: d */
        private final int f18119d;

        C6523b(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m24829a(list, (List<Object>) arrayList, (List<Object>) arrayList2);
            if (arrayList.contains((Object) null) || arrayList.isEmpty()) {
                this.f18116a = null;
                this.f18118c = 0;
            } else {
                int size = arrayList.size();
                this.f18116a = new C6548m[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C6548m mVar = (C6548m) arrayList.get(i2);
                    i += mVar.mo16899b();
                    this.f18116a[i2] = mVar;
                }
                this.f18118c = i;
            }
            if (arrayList2.contains((Object) null) || arrayList2.isEmpty()) {
                this.f18117b = null;
                this.f18119d = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.f18117b = new C6546k[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                C6546k kVar = (C6546k) arrayList2.get(i4);
                i3 += kVar.mo16896a();
                this.f18117b[i4] = kVar;
            }
            this.f18119d = i3;
        }

        /* renamed from: a */
        private void m24829a(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C6523b) {
                    m24830a(list2, ((C6523b) obj).f18116a);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C6523b) {
                    m24830a(list3, ((C6523b) obj2).f18117b);
                } else {
                    list3.add(obj2);
                }
            }
        }

        /* renamed from: a */
        private void m24830a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18119d;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            C6546k[] kVarArr = this.f18117b;
            if (kVarArr != null) {
                int length = kVarArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = kVarArr[i2].mo16897a(eVar, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            C6548m[] mVarArr = this.f18116a;
            if (mVarArr != null) {
                Locale locale2 = locale == null ? Locale.getDefault() : locale;
                for (C6548m a : mVarArr) {
                    a.mo16898a(appendable, j, aVar, i, gVar, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18118c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo16900c() {
            return this.f18117b != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo16901d() {
            return this.f18116a != null;
        }
    }

    /* renamed from: g.b.a.d.c$c */
    static class C6524c extends C6528g {
        protected C6524c(C6517d dVar, int i, boolean z) {
            super(dVar, i, z, i);
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            int i2;
            char charAt;
            int a = super.mo16897a(eVar, charSequence, i);
            if (a < 0 || a == (i2 = this.f18126b + i)) {
                return a;
            }
            if (this.f18127c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            return a > i2 ? ~(i2 + 1) : a < i2 ? ~a : a;
        }
    }

    /* renamed from: g.b.a.d.c$d */
    static class C6525d implements C6548m, C6546k {

        /* renamed from: a */
        private final C6517d f18120a;

        /* renamed from: b */
        protected int f18121b;

        /* renamed from: c */
        protected int f18122c;

        protected C6525d(C6517d dVar, int i, int i2) {
            this.f18120a = dVar;
            int i3 = i2 <= 18 ? i2 : 18;
            this.f18121b = i;
            this.f18122c = i3;
        }

        /* renamed from: a */
        private long[] m24838a(long j, C6497c cVar) {
            long j2;
            long b = cVar.mo16757a().mo16787b();
            int i = this.f18122c;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((b * j2) / j2 == b) {
                    return new long[]{(j * j2) / b, (long) i};
                }
                i--;
            }
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18122c;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            C6497c a = this.f18120a.mo16836a(eVar.mo16908a());
            int min = Math.min(this.f18122c, charSequence.length() - i);
            long b = a.mo16757a().mo16787b() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                b /= 10;
                j += ((long) (charAt - '0')) * b;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return ~i;
            }
            if (j2 > 2147483647L) {
                return ~i;
            }
            eVar.mo16909a((C6497c) new C6509k(C6517d.m24707K(), C6507i.f18058a, a.mo16757a()), (int) j2);
            return i + i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16902a(Appendable appendable, long j, C6467a aVar) {
            C6497c a = this.f18120a.mo16836a(aVar);
            int i = this.f18121b;
            try {
                long c = a.mo16751c(j);
                if (c == 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            appendable.append('0');
                        } else {
                            return;
                        }
                    }
                } else {
                    long[] a2 = m24838a(c, a);
                    long j2 = a2[0];
                    int i2 = (int) a2[1];
                    String num = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                    int length = num.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && num.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < num.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(num.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(num);
                }
            } catch (RuntimeException unused) {
                C6521c.m24773a(appendable, i);
            }
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            mo16902a(appendable, j, aVar);
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18122c;
        }
    }

    /* renamed from: g.b.a.d.c$e */
    static class C6526e implements C6546k {

        /* renamed from: a */
        private final C6546k[] f18123a;

        /* renamed from: b */
        private final int f18124b;

        C6526e(C6546k[] kVarArr) {
            int a;
            this.f18123a = kVarArr;
            int length = kVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    C6546k kVar = kVarArr[length];
                    if (kVar != null && (a = kVar.mo16896a()) > i) {
                        i = a;
                    }
                } else {
                    this.f18124b = i;
                    return;
                }
            }
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18124b;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            C6546k[] kVarArr = this.f18123a;
            int length = kVarArr.length;
            Object f = eVar.mo16919f();
            boolean z = false;
            int i4 = i;
            int i5 = i4;
            Object obj = null;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C6546k kVar = kVarArr[i6];
                if (kVar != null) {
                    int a = kVar.mo16897a(eVar, charSequence, i);
                    if (a >= i) {
                        if (a <= i4) {
                            continue;
                        } else if (a >= charSequence.length() || (i3 = i6 + 1) >= length || kVarArr[i3] == null) {
                            return a;
                        } else {
                            obj = eVar.mo16919f();
                            i4 = a;
                        }
                    } else if (a < 0 && (i2 = ~a) > i5) {
                        i5 = i2;
                    }
                    eVar.mo16914a(f);
                    i6++;
                } else if (i4 <= i) {
                    return i;
                } else {
                    z = true;
                }
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (obj != null) {
                eVar.mo16914a(obj);
            }
            return i4;
        }
    }

    /* renamed from: g.b.a.d.c$f */
    static abstract class C6527f implements C6548m, C6546k {

        /* renamed from: a */
        protected final C6517d f18125a;

        /* renamed from: b */
        protected final int f18126b;

        /* renamed from: c */
        protected final boolean f18127c;

        C6527f(C6517d dVar, int i, boolean z) {
            this.f18125a = dVar;
            this.f18126b = i;
            this.f18127c = z;
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18126b;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            char charAt;
            CharSequence charSequence2 = charSequence;
            int i4 = i;
            int min = Math.min(this.f18126b, charSequence.length() - i4);
            int i5 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i5 >= min) {
                    break;
                }
                int i6 = i4 + i5;
                char charAt2 = charSequence2.charAt(i6);
                if (i5 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.f18127c)) {
                    if (charAt2 < '0' || charAt2 > '9') {
                        break;
                    }
                    i5++;
                } else {
                    z = true;
                    z2 = charAt2 == '-';
                    if (charAt2 != '+') {
                        z = false;
                    }
                    int i7 = i5 + 1;
                    if (i7 >= min || (charAt = charSequence2.charAt(i6 + 1)) < '0' || charAt > '9') {
                        boolean z5 = z2;
                        z4 = z;
                        z3 = z5;
                    } else {
                        min = Math.min(min + 1, charSequence.length() - i4);
                        i5 = i7;
                        boolean z6 = z2;
                        z4 = z;
                        z3 = z6;
                    }
                }
            }
            boolean z52 = z2;
            z4 = z;
            z3 = z52;
            if (i5 == 0) {
                return ~i4;
            }
            if (i5 < 9) {
                int i8 = (z3 || z4) ? i4 + 1 : i4;
                int i9 = i8 + 1;
                try {
                    int charAt3 = charSequence2.charAt(i8) - '0';
                    i2 = i4 + i5;
                    while (i9 < i2) {
                        i9++;
                        charAt3 = (((charAt3 << 3) + (charAt3 << 1)) + charSequence2.charAt(i9)) - 48;
                    }
                    i3 = z3 ? -charAt3 : charAt3;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i4;
                }
            } else if (z4) {
                int i10 = i4 + 1;
                i2 = i4 + i5;
                i3 = Integer.parseInt(charSequence2.subSequence(i10, i2).toString());
            } else {
                int i11 = i5 + i4;
                i3 = Integer.parseInt(charSequence2.subSequence(i4, i11).toString());
                i2 = i11;
            }
            eVar.mo16910a(this.f18125a, i3);
            return i2;
        }
    }

    /* renamed from: g.b.a.d.c$g */
    static class C6528g extends C6527f {

        /* renamed from: d */
        protected final int f18128d;

        protected C6528g(C6517d dVar, int i, boolean z, int i2) {
            super(dVar, i, z);
            this.f18128d = i2;
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            try {
                C6543i.m24927a(appendable, this.f18125a.mo16836a(aVar).mo16740a(j), this.f18128d);
            } catch (RuntimeException unused) {
                C6521c.m24773a(appendable, this.f18128d);
            }
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18126b;
        }
    }

    /* renamed from: g.b.a.d.c$h */
    static class C6529h implements C6548m, C6546k {

        /* renamed from: a */
        private final String f18129a;

        C6529h(String str) {
            this.f18129a = str;
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18129a.length();
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            return C6521c.m24775b(charSequence, i, this.f18129a) ? i + this.f18129a.length() : ~i;
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            appendable.append(this.f18129a);
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18129a.length();
        }
    }

    /* renamed from: g.b.a.d.c$i */
    static class C6530i implements C6548m, C6546k {

        /* renamed from: a */
        private static Map<Locale, Map<C6517d, Object[]>> f18130a = new ConcurrentHashMap();

        /* renamed from: b */
        private final C6517d f18131b;

        /* renamed from: c */
        private final boolean f18132c;

        C6530i(C6517d dVar, boolean z) {
            this.f18131b = dVar;
            this.f18132c = z;
        }

        /* renamed from: a */
        private String m24854a(long j, C6467a aVar, Locale locale) {
            C6497c a = this.f18131b.mo16836a(aVar);
            return this.f18132c ? a.mo16781a(j, locale) : a.mo16782b(j, locale);
        }

        /* renamed from: a */
        public int mo16896a() {
            return mo16899b();
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            int i2;
            Map map;
            Locale b = eVar.mo16915b();
            Map map2 = f18130a.get(b);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                f18130a.put(b, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.f18131b);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(32);
                C6576m.C6577a a = new C6576m(0, C6567g.f18277a).mo16979a(this.f18131b);
                int g = a.mo16804g();
                int e = a.mo16801e();
                if (e - g > 32) {
                    return ~i;
                }
                i2 = a.mo16798c(b);
                while (g <= e) {
                    a.mo16981a(g);
                    concurrentHashMap.put(a.mo16795a(b), Boolean.TRUE);
                    concurrentHashMap.put(a.mo16795a(b).toLowerCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.mo16795a(b).toUpperCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.mo16797b(b), Boolean.TRUE);
                    concurrentHashMap.put(a.mo16797b(b).toLowerCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.mo16797b(b).toUpperCase(b), Boolean.TRUE);
                    g++;
                }
                if ("en".equals(b.getLanguage()) && this.f18131b == C6517d.m24702D()) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    i2 = 3;
                }
                map2.put(this.f18131b, new Object[]{concurrentHashMap, Integer.valueOf(i2)});
                map = concurrentHashMap;
            } else {
                map = (Map) objArr[0];
                i2 = ((Integer) objArr[1]).intValue();
            }
            for (int min = Math.min(charSequence.length(), i2 + i); min > i; min--) {
                String obj = charSequence.subSequence(i, min).toString();
                if (map.containsKey(obj)) {
                    eVar.mo16911a(this.f18131b, obj, b);
                    return min;
                }
            }
            return ~i;
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            try {
                appendable.append(m24854a(j, aVar, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18132c ? 6 : 20;
        }
    }

    /* renamed from: g.b.a.d.c$j */
    enum C6531j implements C6548m, C6546k {
        INSTANCE;
        

        /* renamed from: b */
        private static final List<String> f18134b = null;

        /* renamed from: c */
        private static final Map<String, List<String>> f18135c = null;

        /* renamed from: d */
        private static final List<String> f18136d = null;

        /* renamed from: e */
        static final int f18137e = 0;

        /* renamed from: f */
        static final int f18138f = 0;

        static {
            f18136d = new ArrayList();
            f18134b = new ArrayList(C6567g.m25095a());
            Collections.sort(f18134b);
            f18135c = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String next : f18134b) {
                int indexOf = next.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf < next.length()) {
                        indexOf++;
                    }
                    i2 = Math.max(i2, indexOf);
                    String substring = next.substring(0, indexOf + 1);
                    String substring2 = next.substring(indexOf);
                    if (!f18135c.containsKey(substring)) {
                        f18135c.put(substring, new ArrayList());
                    }
                    f18135c.get(substring).add(substring2);
                } else {
                    f18136d.add(next);
                }
                i = Math.max(i, next.length());
            }
            f18137e = i;
            f18138f = i2;
        }

        /* renamed from: a */
        public int mo16896a() {
            return f18137e;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            String str;
            int i2;
            String str2;
            List<String> list = f18136d;
            int length = charSequence.length();
            int min = Math.min(length, f18138f + i);
            int i3 = i;
            while (true) {
                if (i3 >= min) {
                    str = "";
                    i2 = i;
                    break;
                } else if (charSequence.charAt(i3) == '/') {
                    int i4 = i3 + 1;
                    str = charSequence.subSequence(i, i4).toString();
                    i2 = str.length() + i;
                    if (i3 < length) {
                        str2 = str + charSequence.charAt(i4);
                    } else {
                        str2 = str;
                    }
                    list = f18135c.get(str2);
                    if (list == null) {
                        return ~i;
                    }
                } else {
                    i3++;
                }
            }
            String str3 = null;
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str4 = list.get(i5);
                if (C6521c.m24774a(charSequence, i2, str4) && (str3 == null || str4.length() > str3.length())) {
                    str3 = str4;
                }
            }
            if (str3 == null) {
                return ~i;
            }
            eVar.mo16912a(C6567g.m25092a(str + str3));
            return i2 + str3.length();
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            appendable.append(gVar != null ? gVar.mo16968c() : "");
        }

        /* renamed from: b */
        public int mo16899b() {
            return f18137e;
        }
    }

    /* renamed from: g.b.a.d.c$k */
    static class C6532k implements C6548m, C6546k {

        /* renamed from: a */
        private final Map<String, C6567g> f18140a;

        /* renamed from: b */
        private final int f18141b;

        C6532k(int i, Map<String, C6567g> map) {
            this.f18141b = i;
            this.f18140a = map;
        }

        /* renamed from: a */
        private String m24863a(long j, C6567g gVar, Locale locale) {
            if (gVar == null) {
                return "";
            }
            int i = this.f18141b;
            return i != 0 ? i != 1 ? "" : gVar.mo16967b(j, locale) : gVar.mo16966a(j, locale);
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18141b == 1 ? 4 : 20;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            Map<String, C6567g> map = this.f18140a;
            if (map == null) {
                map = C6549e.m25013b();
            }
            String str = null;
            for (String next : map.keySet()) {
                if (C6521c.m24774a(charSequence, i, next) && (str == null || next.length() > str.length())) {
                    str = next;
                }
            }
            if (str == null) {
                return ~i;
            }
            eVar.mo16912a(map.get(str));
            return i + str.length();
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            appendable.append(m24863a(j - ((long) i), gVar, locale));
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18141b == 1 ? 4 : 20;
        }
    }

    /* renamed from: g.b.a.d.c$l */
    static class C6533l implements C6548m, C6546k {

        /* renamed from: a */
        private final String f18142a;

        /* renamed from: b */
        private final String f18143b;

        /* renamed from: c */
        private final boolean f18144c;

        /* renamed from: d */
        private final int f18145d;

        /* renamed from: e */
        private final int f18146e;

        C6533l(String str, String str2, boolean z, int i, int i2) {
            this.f18142a = str;
            this.f18143b = str2;
            this.f18144c = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            int i3 = 4;
            if (i > 4) {
                i2 = 4;
            } else {
                i3 = i;
            }
            this.f18145d = i3;
            this.f18146e = i2;
        }

        /* renamed from: a */
        private int m24868a(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: a */
        public int mo16896a() {
            return mo16899b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
            if (r6 <= '9') goto L_0x0081;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo16897a(p250g.p255b.p256a.p260d.C6537e r12, java.lang.CharSequence r13, int r14) {
            /*
                r11 = this;
                int r0 = r13.length()
                int r0 = r0 - r14
                java.lang.String r1 = r11.f18143b
                r2 = 43
                r3 = 45
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r1 == 0) goto L_0x003a
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0027
                if (r0 <= 0) goto L_0x0023
                char r1 = r13.charAt(r14)
                if (r1 == r3) goto L_0x003a
                if (r1 != r2) goto L_0x0023
                goto L_0x003a
            L_0x0023:
                r12.mo16913a((java.lang.Integer) r5)
                return r14
            L_0x0027:
                java.lang.String r1 = r11.f18143b
                boolean r1 = p250g.p255b.p256a.p260d.C6521c.m24775b((java.lang.CharSequence) r13, (int) r14, (java.lang.String) r1)
                if (r1 == 0) goto L_0x003a
                r12.mo16913a((java.lang.Integer) r5)
                java.lang.String r12 = r11.f18143b
                int r12 = r12.length()
                int r14 = r14 + r12
                return r14
            L_0x003a:
                r1 = 1
                if (r0 > r1) goto L_0x003f
                int r12 = ~r14
                return r12
            L_0x003f:
                char r5 = r13.charAt(r14)
                if (r5 != r3) goto L_0x0047
                r2 = r1
                goto L_0x004a
            L_0x0047:
                if (r5 != r2) goto L_0x0124
                r2 = r4
            L_0x004a:
                int r0 = r0 + -1
                int r14 = r14 + r1
                r3 = 2
                int r5 = r11.m24868a((java.lang.CharSequence) r13, (int) r14, (int) r3)
                if (r5 >= r3) goto L_0x0056
                int r12 = ~r14
                return r12
            L_0x0056:
                int r5 = p250g.p255b.p256a.p260d.C6543i.m24924a((java.lang.CharSequence) r13, (int) r14)
                r6 = 23
                if (r5 <= r6) goto L_0x0060
                int r12 = ~r14
                return r12
            L_0x0060:
                r6 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r5 * r6
                int r0 = r0 + -2
                int r14 = r14 + r3
                if (r0 > 0) goto L_0x006b
                goto L_0x0119
            L_0x006b:
                char r6 = r13.charAt(r14)
                r7 = 58
                r8 = 48
                if (r6 != r7) goto L_0x007b
                int r0 = r0 + -1
                int r14 = r14 + 1
                r4 = r1
                goto L_0x0081
            L_0x007b:
                if (r6 < r8) goto L_0x0119
                r9 = 57
                if (r6 > r9) goto L_0x0119
            L_0x0081:
                int r6 = r11.m24868a((java.lang.CharSequence) r13, (int) r14, (int) r3)
                if (r6 != 0) goto L_0x008b
                if (r4 != 0) goto L_0x008b
                goto L_0x0119
            L_0x008b:
                if (r6 >= r3) goto L_0x008f
                int r12 = ~r14
                return r12
            L_0x008f:
                int r6 = p250g.p255b.p256a.p260d.C6543i.m24924a((java.lang.CharSequence) r13, (int) r14)
                r9 = 59
                if (r6 <= r9) goto L_0x0099
                int r12 = ~r14
                return r12
            L_0x0099:
                r10 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r10
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00a6
                goto L_0x0119
            L_0x00a6:
                if (r4 == 0) goto L_0x00b4
                char r6 = r13.charAt(r14)
                if (r6 == r7) goto L_0x00b0
                goto L_0x0119
            L_0x00b0:
                int r0 = r0 + -1
                int r14 = r14 + 1
            L_0x00b4:
                int r6 = r11.m24868a((java.lang.CharSequence) r13, (int) r14, (int) r3)
                if (r6 != 0) goto L_0x00bd
                if (r4 != 0) goto L_0x00bd
                goto L_0x0119
            L_0x00bd:
                if (r6 >= r3) goto L_0x00c1
                int r12 = ~r14
                return r12
            L_0x00c1:
                int r6 = p250g.p255b.p256a.p260d.C6543i.m24924a((java.lang.CharSequence) r13, (int) r14)
                if (r6 <= r9) goto L_0x00c9
                int r12 = ~r14
                return r12
            L_0x00c9:
                int r6 = r6 * 1000
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00d3
                goto L_0x0119
            L_0x00d3:
                if (r4 == 0) goto L_0x00e8
                char r0 = r13.charAt(r14)
                r6 = 46
                if (r0 == r6) goto L_0x00e6
                char r0 = r13.charAt(r14)
                r6 = 44
                if (r0 == r6) goto L_0x00e6
                goto L_0x0119
            L_0x00e6:
                int r14 = r14 + 1
            L_0x00e8:
                r0 = 3
                int r0 = r11.m24868a((java.lang.CharSequence) r13, (int) r14, (int) r0)
                if (r0 != 0) goto L_0x00f2
                if (r4 != 0) goto L_0x00f2
                goto L_0x0119
            L_0x00f2:
                if (r0 >= r1) goto L_0x00f6
                int r12 = ~r14
                return r12
            L_0x00f6:
                int r4 = r14 + 1
                char r14 = r13.charAt(r14)
                int r14 = r14 - r8
                int r14 = r14 * 100
                int r5 = r5 + r14
                if (r0 <= r1) goto L_0x0118
                int r14 = r4 + 1
                char r1 = r13.charAt(r4)
                int r1 = r1 - r8
                int r1 = r1 * 10
                int r5 = r5 + r1
                if (r0 <= r3) goto L_0x0119
                int r0 = r14 + 1
                char r13 = r13.charAt(r14)
                int r13 = r13 - r8
                int r5 = r5 + r13
                r14 = r0
                goto L_0x0119
            L_0x0118:
                r14 = r4
            L_0x0119:
                if (r2 == 0) goto L_0x011c
                int r5 = -r5
            L_0x011c:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r12.mo16913a((java.lang.Integer) r13)
                return r14
            L_0x0124:
                int r12 = ~r14
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p260d.C6521c.C6533l.mo16897a(g.b.a.d.e, java.lang.CharSequence, int):int");
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            String str;
            if (gVar != null) {
                if (i != 0 || (str = this.f18142a) == null) {
                    if (i >= 0) {
                        appendable.append('+');
                    } else {
                        appendable.append('-');
                        i = -i;
                    }
                    int i2 = i / 3600000;
                    C6543i.m24927a(appendable, i2, 2);
                    if (this.f18146e != 1) {
                        int i3 = i - (i2 * 3600000);
                        if (i3 != 0 || this.f18145d > 1) {
                            int i4 = i3 / 60000;
                            if (this.f18144c) {
                                appendable.append(':');
                            }
                            C6543i.m24927a(appendable, i4, 2);
                            if (this.f18146e != 2) {
                                int i5 = i3 - (i4 * 60000);
                                if (i5 != 0 || this.f18145d > 2) {
                                    int i6 = i5 / 1000;
                                    if (this.f18144c) {
                                        appendable.append(':');
                                    }
                                    C6543i.m24927a(appendable, i6, 2);
                                    if (this.f18146e != 3) {
                                        int i7 = i5 - (i6 * 1000);
                                        if (i7 != 0 || this.f18145d > 3) {
                                            if (this.f18144c) {
                                                appendable.append('.');
                                            }
                                            C6543i.m24927a(appendable, i7, 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                appendable.append(str);
            }
        }

        /* renamed from: b */
        public int mo16899b() {
            int i = this.f18145d;
            int i2 = (i + 1) << 1;
            if (this.f18144c) {
                i2 += i - 1;
            }
            String str = this.f18142a;
            return (str == null || str.length() <= i2) ? i2 : this.f18142a.length();
        }
    }

    /* renamed from: g.b.a.d.c$m */
    static class C6534m implements C6548m, C6546k {

        /* renamed from: a */
        private final C6517d f18147a;

        /* renamed from: b */
        private final int f18148b;

        /* renamed from: c */
        private final boolean f18149c;

        C6534m(C6517d dVar, int i, boolean z) {
            this.f18147a = dVar;
            this.f18148b = i;
            this.f18149c = z;
        }

        /* renamed from: a */
        private int m24873a(long j, C6467a aVar) {
            try {
                int a = this.f18147a.mo16836a(aVar).mo16740a(j);
                if (a < 0) {
                    a = -a;
                }
                return a % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        /* renamed from: a */
        public int mo16896a() {
            return this.f18149c ? 4 : 2;
        }

        /* renamed from: a */
        public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int length = charSequence.length() - i;
            if (this.f18149c) {
                int i4 = i;
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i5 < length) {
                    char charAt = charSequence.charAt(i4 + i5);
                    if (i5 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i5++;
                    } else {
                        z2 = charAt == '-';
                        if (z2) {
                            i5++;
                        } else {
                            i4++;
                            length--;
                        }
                        z = true;
                    }
                }
                if (i5 == 0) {
                    return ~i4;
                }
                if (z || i5 != 2) {
                    if (i5 >= 9) {
                        i2 = i5 + i4;
                        i3 = Integer.parseInt(charSequence.subSequence(i4, i2).toString());
                    } else {
                        int i6 = z2 ? i4 + 1 : i4;
                        int i7 = i6 + 1;
                        try {
                            int charAt2 = charSequence.charAt(i6) - '0';
                            i2 = i5 + i4;
                            while (i7 < i2) {
                                i7++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + charSequence.charAt(i7)) - 48;
                            }
                            i3 = z2 ? -charAt2 : charAt2;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i4;
                        }
                    }
                    eVar.mo16910a(this.f18147a, i3);
                    return i2;
                }
                i = i4;
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i;
            }
            int i8 = charAt3 - '0';
            char charAt4 = charSequence.charAt(i + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i;
            }
            int i9 = (((i8 << 3) + (i8 << 1)) + charAt4) - 48;
            int i10 = this.f18148b;
            if (eVar.mo16917d() != null) {
                i10 = eVar.mo16917d().intValue();
            }
            int i11 = i10 - 50;
            int i12 = 100;
            int i13 = i11 >= 0 ? i11 % 100 : ((i11 + 1) % 100) + 99;
            if (i9 >= i13) {
                i12 = 0;
            }
            eVar.mo16910a(this.f18147a, i9 + ((i11 + i12) - i13));
            return i + 2;
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            int a = m24873a(j, aVar);
            if (a < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            C6543i.m24927a(appendable, a, 2);
        }

        /* renamed from: b */
        public int mo16899b() {
            return 2;
        }
    }

    /* renamed from: g.b.a.d.c$n */
    static class C6535n extends C6527f {
        protected C6535n(C6517d dVar, int i, boolean z) {
            super(dVar, i, z);
        }

        /* renamed from: a */
        public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
            try {
                C6543i.m24926a(appendable, this.f18125a.mo16836a(aVar).mo16740a(j));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        /* renamed from: b */
        public int mo16899b() {
            return this.f18126b;
        }
    }

    /* renamed from: a */
    private C6521c m24770a(C6548m mVar, C6546k kVar) {
        this.f18114b = null;
        this.f18113a.add(mVar);
        this.f18113a.add(kVar);
        return this;
    }

    /* renamed from: a */
    private C6521c m24771a(Object obj) {
        this.f18114b = null;
        this.f18113a.add(obj);
        this.f18113a.add(obj);
        return this;
    }

    /* renamed from: a */
    private void m24772a(C6541g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    /* renamed from: a */
    static void m24773a(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append(65533);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static boolean m24774a(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static boolean m24775b(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private boolean m24776b(Object obj) {
        if (!(obj instanceof C6546k)) {
            return false;
        }
        if (obj instanceof C6523b) {
            return ((C6523b) obj).mo16900c();
        }
        return true;
    }

    /* renamed from: c */
    private void m24777c(C6536d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    /* renamed from: c */
    private boolean m24778c(Object obj) {
        if (!(obj instanceof C6548m)) {
            return false;
        }
        if (obj instanceof C6523b) {
            return ((C6523b) obj).mo16901d();
        }
        return true;
    }

    /* renamed from: k */
    private Object m24779k() {
        Object obj = this.f18114b;
        if (obj == null) {
            if (this.f18113a.size() == 2) {
                Object obj2 = this.f18113a.get(0);
                Object obj3 = this.f18113a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new C6523b(this.f18113a);
            }
            this.f18114b = obj;
        }
        return obj;
    }

    /* renamed from: a */
    public C6521c mo16851a() {
        mo16859a(C6517d.m24700B());
        return this;
    }

    /* renamed from: a */
    public C6521c mo16852a(char c) {
        m24771a((Object) new C6522a(c));
        return this;
    }

    /* renamed from: a */
    public C6521c mo16853a(int i) {
        mo16861a(C6517d.m24743y(), i, 2);
        return this;
    }

    /* renamed from: a */
    public C6521c mo16854a(int i, int i2) {
        mo16876c(C6517d.m24742x(), i, i2);
        return this;
    }

    /* renamed from: a */
    public C6521c mo16855a(int i, boolean z) {
        m24771a((Object) new C6534m(C6517d.m24714R(), i, z));
        return this;
    }

    /* renamed from: a */
    public C6521c mo16856a(C6520b bVar) {
        if (bVar != null) {
            m24770a(bVar.mo16848c(), bVar.mo16847b());
            return this;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: a */
    public C6521c mo16857a(C6536d dVar) {
        m24777c(dVar);
        m24770a((C6548m) null, C6540f.m24914a(dVar));
        return this;
    }

    /* renamed from: a */
    public C6521c mo16858a(C6541g gVar, C6536d[] dVarArr) {
        C6548m a;
        C6546k eVar;
        if (gVar != null) {
            m24772a(gVar);
        }
        if (dVarArr != null) {
            int length = dVarArr.length;
            int i = 0;
            if (length != 1) {
                C6546k[] kVarArr = new C6546k[length];
                while (i < length - 1) {
                    C6546k a2 = C6540f.m24914a(dVarArr[i]);
                    kVarArr[i] = a2;
                    if (a2 != null) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                }
                kVarArr[i] = C6540f.m24914a(dVarArr[i]);
                a = C6542h.m24921a(gVar);
                eVar = new C6526e(kVarArr);
            } else if (dVarArr[0] != null) {
                a = C6542h.m24921a(gVar);
                eVar = C6540f.m24914a(dVarArr[0]);
            } else {
                throw new IllegalArgumentException("No parser supplied");
            }
            m24770a(a, eVar);
            return this;
        }
        throw new IllegalArgumentException("No parsers supplied");
    }

    /* renamed from: a */
    public C6521c mo16859a(C6517d dVar) {
        if (dVar != null) {
            m24771a((Object) new C6530i(dVar, true));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: a */
    public C6521c mo16860a(C6517d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            m24771a((Object) new C6524c(dVar, i, false));
            return this;
        } else {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
    }

    /* renamed from: a */
    public C6521c mo16861a(C6517d dVar, int i, int i2) {
        if (dVar != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                m24771a((Object) new C6535n(dVar, i2, false));
                return this;
            } else {
                m24771a((Object) new C6528g(dVar, i2, false, i));
                return this;
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    /* renamed from: a */
    public C6521c mo16862a(String str) {
        if (str != null) {
            int length = str.length();
            if (length == 0) {
                return this;
            }
            m24771a(length != 1 ? new C6529h(str) : new C6522a(str.charAt(0)));
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    /* renamed from: a */
    public C6521c mo16863a(String str, String str2, boolean z, int i, int i2) {
        m24771a((Object) new C6533l(str, str2, z, i, i2));
        return this;
    }

    /* renamed from: a */
    public C6521c mo16864a(String str, boolean z, int i, int i2) {
        m24771a((Object) new C6533l(str, str, z, i, i2));
        return this;
    }

    /* renamed from: a */
    public C6521c mo16865a(Map<String, C6567g> map) {
        C6532k kVar = new C6532k(1, map);
        m24770a((C6548m) kVar, (C6546k) kVar);
        return this;
    }

    /* renamed from: b */
    public C6521c mo16866b() {
        mo16871b(C6517d.m24700B());
        return this;
    }

    /* renamed from: b */
    public C6521c mo16867b(int i) {
        mo16861a(C6517d.m24744z(), i, 2);
        return this;
    }

    /* renamed from: b */
    public C6521c mo16868b(int i, int i2) {
        mo16872b(C6517d.m24704H(), i, i2);
        return this;
    }

    /* renamed from: b */
    public C6521c mo16869b(int i, boolean z) {
        m24771a((Object) new C6534m(C6517d.m24716T(), i, z));
        return this;
    }

    /* renamed from: b */
    public C6521c mo16870b(C6536d dVar) {
        m24777c(dVar);
        m24770a((C6548m) null, (C6546k) new C6526e(new C6546k[]{C6540f.m24914a(dVar), null}));
        return this;
    }

    /* renamed from: b */
    public C6521c mo16871b(C6517d dVar) {
        if (dVar != null) {
            m24771a((Object) new C6530i(dVar, false));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: b */
    public C6521c mo16872b(C6517d dVar, int i, int i2) {
        if (dVar != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            }
            m24771a((Object) new C6525d(dVar, i, i2));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: c */
    public C6521c mo16873c() {
        mo16871b(C6517d.m24702D());
        return this;
    }

    /* renamed from: c */
    public C6521c mo16874c(int i) {
        mo16861a(C6517d.m24699A(), i, 2);
        return this;
    }

    /* renamed from: c */
    public C6521c mo16875c(int i, int i2) {
        mo16872b(C6517d.m24708L(), i, i2);
        return this;
    }

    /* renamed from: c */
    public C6521c mo16876c(C6517d dVar, int i, int i2) {
        if (dVar != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                m24771a((Object) new C6535n(dVar, i2, true));
                return this;
            } else {
                m24771a((Object) new C6528g(dVar, i2, true, i));
                return this;
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    /* renamed from: d */
    public C6521c mo16877d() {
        mo16871b(C6517d.m24703G());
        return this;
    }

    /* renamed from: d */
    public C6521c mo16878d(int i) {
        mo16861a(C6517d.m24700B(), i, 1);
        return this;
    }

    /* renamed from: d */
    public C6521c mo16879d(int i, int i2) {
        mo16872b(C6517d.m24711O(), i, i2);
        return this;
    }

    /* renamed from: e */
    public C6521c mo16880e() {
        mo16859a(C6517d.m24710N());
        return this;
    }

    /* renamed from: e */
    public C6521c mo16881e(int i) {
        mo16861a(C6517d.m24701C(), i, 3);
        return this;
    }

    /* renamed from: e */
    public C6521c mo16882e(int i, int i2) {
        mo16876c(C6517d.m24714R(), i, i2);
        return this;
    }

    /* renamed from: f */
    public C6521c mo16883f() {
        mo16871b(C6517d.m24710N());
        return this;
    }

    /* renamed from: f */
    public C6521c mo16884f(int i) {
        mo16861a(C6517d.m24704H(), i, 2);
        return this;
    }

    /* renamed from: f */
    public C6521c mo16885f(int i, int i2) {
        mo16876c(C6517d.m24716T(), i, i2);
        return this;
    }

    /* renamed from: g */
    public C6521c mo16886g() {
        C6531j jVar = C6531j.INSTANCE;
        m24770a((C6548m) jVar, (C6546k) jVar);
        return this;
    }

    /* renamed from: g */
    public C6521c mo16887g(int i) {
        mo16861a(C6517d.m24705I(), i, 2);
        return this;
    }

    /* renamed from: g */
    public C6521c mo16888g(int i, int i2) {
        mo16861a(C6517d.m24718V(), i, i2);
        return this;
    }

    /* renamed from: h */
    public C6521c mo16889h() {
        m24770a((C6548m) new C6532k(0, (Map<String, C6567g>) null), (C6546k) null);
        return this;
    }

    /* renamed from: h */
    public C6521c mo16890h(int i) {
        mo16861a(C6517d.m24709M(), i, 2);
        return this;
    }

    /* renamed from: i */
    public C6520b mo16891i() {
        Object k = m24779k();
        C6546k kVar = null;
        C6548m mVar = m24778c(k) ? (C6548m) k : null;
        if (m24776b(k)) {
            kVar = (C6546k) k;
        }
        if (mVar != null || kVar != null) {
            return new C6520b(mVar, kVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    /* renamed from: i */
    public C6521c mo16892i(int i) {
        mo16861a(C6517d.m24710N(), i, 2);
        return this;
    }

    /* renamed from: j */
    public C6521c mo16893j(int i) {
        mo16861a(C6517d.m24712P(), i, 2);
        return this;
    }

    /* renamed from: j */
    public C6536d mo16894j() {
        Object k = m24779k();
        if (m24776b(k)) {
            return C6547l.m25001a((C6546k) k);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* renamed from: k */
    public C6521c mo16895k(int i) {
        mo16861a(C6517d.m24713Q(), i, 2);
        return this;
    }
}
