package p250g.p255b.p256a.p260d;

import java.util.Arrays;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6549e;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;
import p250g.p255b.p256a.C6573j;
import p250g.p255b.p256a.C6574k;

/* renamed from: g.b.a.d.e */
public class C6537e {

    /* renamed from: a */
    private final C6467a f18150a;

    /* renamed from: b */
    private final long f18151b;

    /* renamed from: c */
    private final Locale f18152c;

    /* renamed from: d */
    private final int f18153d;

    /* renamed from: e */
    private final C6567g f18154e;

    /* renamed from: f */
    private final Integer f18155f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6567g f18156g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Integer f18157h;

    /* renamed from: i */
    private Integer f18158i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6538a[] f18159j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f18160k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18161l;

    /* renamed from: m */
    private Object f18162m;

    /* renamed from: g.b.a.d.e$a */
    static class C6538a implements Comparable<C6538a> {

        /* renamed from: a */
        C6497c f18163a;

        /* renamed from: b */
        int f18164b;

        /* renamed from: c */
        String f18165c;

        /* renamed from: d */
        Locale f18166d;

        C6538a() {
        }

        /* renamed from: a */
        public int compareTo(C6538a aVar) {
            C6497c cVar = aVar.f18163a;
            int a = C6537e.m24883a(this.f18163a.mo16745f(), cVar.mo16745f());
            return a != 0 ? a : C6537e.m24883a(this.f18163a.mo16757a(), cVar.mo16757a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo16921a(long j, boolean z) {
            String str = this.f18165c;
            long c = str == null ? this.f18163a.mo16754c(j, this.f18164b) : this.f18163a.mo16738a(j, str, this.f18166d);
            return z ? this.f18163a.mo16752e(c) : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16922a(C6497c cVar, int i) {
            this.f18163a = cVar;
            this.f18164b = i;
            this.f18165c = null;
            this.f18166d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16923a(C6497c cVar, String str, Locale locale) {
            this.f18163a = cVar;
            this.f18164b = 0;
            this.f18165c = str;
            this.f18166d = locale;
        }
    }

    /* renamed from: g.b.a.d.e$b */
    class C6539b {

        /* renamed from: a */
        final C6567g f18167a;

        /* renamed from: b */
        final Integer f18168b;

        /* renamed from: c */
        final C6538a[] f18169c;

        /* renamed from: d */
        final int f18170d;

        C6539b() {
            this.f18167a = C6537e.this.f18156g;
            this.f18168b = C6537e.this.f18157h;
            this.f18169c = C6537e.this.f18159j;
            this.f18170d = C6537e.this.f18160k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16925a(C6537e eVar) {
            if (eVar != C6537e.this) {
                return false;
            }
            C6567g unused = eVar.f18156g = this.f18167a;
            Integer unused2 = eVar.f18157h = this.f18168b;
            C6538a[] unused3 = eVar.f18159j = this.f18169c;
            if (this.f18170d < eVar.f18160k) {
                boolean unused4 = eVar.f18161l = true;
            }
            int unused5 = eVar.f18160k = this.f18170d;
            return true;
        }
    }

    public C6537e(long j, C6467a aVar, Locale locale, Integer num, int i) {
        C6467a a = C6549e.m25008a(aVar);
        this.f18151b = j;
        this.f18154e = a.mo16662k();
        this.f18150a = a.mo16646G();
        this.f18152c = locale == null ? Locale.getDefault() : locale;
        this.f18153d = i;
        this.f18155f = num;
        this.f18156g = this.f18154e;
        this.f18158i = this.f18155f;
        this.f18159j = new C6538a[8];
    }

    /* renamed from: a */
    static int m24883a(C6570h hVar, C6570h hVar2) {
        if (hVar == null || !hVar.mo16812k()) {
            return (hVar2 == null || !hVar2.mo16812k()) ? 0 : -1;
        }
        if (hVar2 == null || !hVar2.mo16812k()) {
            return 1;
        }
        return -hVar.compareTo(hVar2);
    }

    /* renamed from: a */
    private static void m24887a(C6538a[] aVarArr, int i) {
        if (i > 10) {
            Arrays.sort(aVarArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (aVarArr[i4].compareTo(aVarArr[i3]) <= 0) {
                    break;
                }
                C6538a aVar = aVarArr[i3];
                aVarArr[i3] = aVarArr[i4];
                aVarArr[i4] = aVar;
            }
        }
    }

    /* renamed from: g */
    private C6538a m24893g() {
        C6538a[] aVarArr = this.f18159j;
        int i = this.f18160k;
        if (i == aVarArr.length || this.f18161l) {
            C6538a[] aVarArr2 = new C6538a[(i == aVarArr.length ? i * 2 : aVarArr.length)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
            this.f18159j = aVarArr2;
            this.f18161l = false;
            aVarArr = aVarArr2;
        }
        this.f18162m = null;
        C6538a aVar = aVarArr[i];
        if (aVar == null) {
            aVar = new C6538a();
            aVarArr[i] = aVar;
        }
        this.f18160k = i + 1;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo16905a(C6546k kVar, CharSequence charSequence) {
        int a = kVar.mo16897a(this, charSequence, 0);
        if (a < 0) {
            a = ~a;
        } else if (a >= charSequence.length()) {
            return mo16906a(true, charSequence);
        }
        throw new IllegalArgumentException(C6543i.m24925a(charSequence.toString(), a));
    }

    /* renamed from: a */
    public long mo16906a(boolean z, CharSequence charSequence) {
        C6538a[] aVarArr = this.f18159j;
        int i = this.f18160k;
        if (this.f18161l) {
            aVarArr = (C6538a[]) aVarArr.clone();
            this.f18159j = aVarArr;
            this.f18161l = false;
        }
        m24887a(aVarArr, i);
        if (i > 0) {
            C6570h a = C6571i.m25134i().mo16972a(this.f18150a);
            C6570h a2 = C6571i.m25128b().mo16972a(this.f18150a);
            C6570h a3 = aVarArr[0].f18163a.mo16757a();
            if (m24883a(a3, a) >= 0 && m24883a(a3, a2) <= 0) {
                mo16910a(C6517d.m24716T(), this.f18153d);
                return mo16906a(z, charSequence);
            }
        }
        long j = this.f18151b;
        int i2 = 0;
        while (i2 < i) {
            try {
                j = aVarArr[i2].mo16921a(j, z);
                i2++;
            } catch (C6573j e) {
                if (charSequence != null) {
                    e.mo16977a("Cannot parse \"" + charSequence + TokenParser.DQUOTE);
                }
                throw e;
            }
        }
        if (z) {
            int i3 = 0;
            while (i3 < i) {
                j = aVarArr[i3].mo16921a(j, i3 == i + -1);
                i3++;
            }
        }
        Integer num = this.f18157h;
        if (num != null) {
            return j - ((long) num.intValue());
        }
        C6567g gVar = this.f18156g;
        if (gVar == null) {
            return j;
        }
        int d = gVar.mo16957d(j);
        long j2 = j - ((long) d);
        if (d == this.f18156g.mo16933c(j2)) {
            return j2;
        }
        String str = "Illegal instant due to time zone offset transition (" + this.f18156g + ')';
        if (charSequence != null) {
            str = "Cannot parse \"" + charSequence + "\": " + str;
        }
        throw new C6574k(str);
    }

    /* renamed from: a */
    public long mo16907a(boolean z, String str) {
        return mo16906a(z, (CharSequence) str);
    }

    /* renamed from: a */
    public C6467a mo16908a() {
        return this.f18150a;
    }

    /* renamed from: a */
    public void mo16909a(C6497c cVar, int i) {
        m24893g().mo16922a(cVar, i);
    }

    /* renamed from: a */
    public void mo16910a(C6517d dVar, int i) {
        m24893g().mo16922a(dVar.mo16836a(this.f18150a), i);
    }

    /* renamed from: a */
    public void mo16911a(C6517d dVar, String str, Locale locale) {
        m24893g().mo16923a(dVar.mo16836a(this.f18150a), str, locale);
    }

    /* renamed from: a */
    public void mo16912a(C6567g gVar) {
        this.f18162m = null;
        this.f18156g = gVar;
    }

    /* renamed from: a */
    public void mo16913a(Integer num) {
        this.f18162m = null;
        this.f18157h = num;
    }

    /* renamed from: a */
    public boolean mo16914a(Object obj) {
        if (!(obj instanceof C6539b) || !((C6539b) obj).mo16925a(this)) {
            return false;
        }
        this.f18162m = obj;
        return true;
    }

    /* renamed from: b */
    public Locale mo16915b() {
        return this.f18152c;
    }

    /* renamed from: c */
    public Integer mo16916c() {
        return this.f18157h;
    }

    /* renamed from: d */
    public Integer mo16917d() {
        return this.f18158i;
    }

    /* renamed from: e */
    public C6567g mo16918e() {
        return this.f18156g;
    }

    /* renamed from: f */
    public Object mo16919f() {
        if (this.f18162m == null) {
            this.f18162m = new C6539b();
        }
        return this.f18162m;
    }
}
