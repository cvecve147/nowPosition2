package p250g.p255b.p256a.p259c;

import java.io.Serializable;
import java.util.Locale;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;

/* renamed from: g.b.a.c.a */
public abstract class C6498a implements Serializable {
    /* renamed from: a */
    public int mo16794a() {
        return mo16799c().mo16740a(mo16803f());
    }

    /* renamed from: a */
    public String mo16795a(Locale locale) {
        return mo16799c().mo16781a(mo16803f(), locale);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6467a mo16796b() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    /* renamed from: b */
    public String mo16797b(Locale locale) {
        return mo16799c().mo16782b(mo16803f(), locale);
    }

    /* renamed from: c */
    public int mo16798c(Locale locale) {
        return mo16799c().mo16737a(locale);
    }

    /* renamed from: c */
    public abstract C6497c mo16799c();

    /* renamed from: d */
    public C6517d mo16800d() {
        return mo16799c().mo16792g();
    }

    /* renamed from: e */
    public int mo16801e() {
        return mo16799c().mo16742c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6498a)) {
            return false;
        }
        C6498a aVar = (C6498a) obj;
        return mo16794a() == aVar.mo16794a() && mo16800d().equals(aVar.mo16800d()) && C6504g.m24590a((Object) mo16796b(), (Object) aVar.mo16796b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo16803f();

    /* renamed from: g */
    public int mo16804g() {
        return mo16799c().mo16743d();
    }

    /* renamed from: h */
    public String mo16805h() {
        return mo16799c().mo16791e();
    }

    public int hashCode() {
        return (mo16794a() * 17) + mo16800d().hashCode() + mo16796b().hashCode();
    }

    public String toString() {
        return "Property[" + mo16805h() + "]";
    }
}
