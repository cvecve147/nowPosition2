package p101d.p129g.p152e;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p101d.p129g.p152e.p154b.C5603B;
import p101d.p129g.p152e.p154b.C5698q;
import p101d.p129g.p152e.p154b.C5700s;
import p101d.p129g.p152e.p154b.p155a.C5640b;
import p101d.p129g.p152e.p154b.p155a.C5642c;
import p101d.p129g.p152e.p154b.p155a.C5647e;
import p101d.p129g.p152e.p154b.p155a.C5649f;
import p101d.p129g.p152e.p154b.p155a.C5658ja;
import p101d.p129g.p152e.p154b.p155a.C5660k;
import p101d.p129g.p152e.p154b.p155a.C5664n;
import p101d.p129g.p152e.p154b.p155a.C5666p;
import p101d.p129g.p152e.p154b.p155a.C5670r;
import p101d.p129g.p152e.p154b.p155a.C5672t;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;
import p101d.p129g.p152e.p158d.C5719e;

/* renamed from: d.g.e.p */
public final class C5731p {

    /* renamed from: a */
    private static final C5713a<?> f15839a = new C5725j();

    /* renamed from: b */
    private final ThreadLocal<Map<C5713a<?>, C5732a<?>>> f15840b;

    /* renamed from: c */
    private final Map<C5713a<?>, C5593I<?>> f15841c;

    /* renamed from: d */
    private final List<C5594J> f15842d;

    /* renamed from: e */
    private final C5698q f15843e;

    /* renamed from: f */
    private final C5700s f15844f;

    /* renamed from: g */
    private final C5724i f15845g;

    /* renamed from: h */
    private final boolean f15846h;

    /* renamed from: i */
    private final boolean f15847i;

    /* renamed from: j */
    private final boolean f15848j;

    /* renamed from: k */
    private final boolean f15849k;

    /* renamed from: l */
    private final boolean f15850l;

    /* renamed from: m */
    private final C5649f f15851m;

    /* renamed from: d.g.e.p$a */
    static class C5732a<T> extends C5593I<T> {

        /* renamed from: a */
        private C5593I<T> f15852a;

        C5732a() {
        }

        /* renamed from: a */
        public T mo15096a(C5716b bVar) {
            C5593I<T> i = this.f15852a;
            if (i != null) {
                return i.mo15096a(bVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo15303a(C5593I<T> i) {
            if (this.f15852a == null) {
                this.f15852a = i;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo15097a(C5718d dVar, T t) {
            C5593I<T> i = this.f15852a;
            if (i != null) {
                i.mo15097a(dVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C5731p() {
        this(C5700s.f15755a, C5723h.f15829a, Collections.emptyMap(), false, false, false, true, false, false, false, C5591G.f15572a, Collections.emptyList());
    }

    C5731p(C5700s sVar, C5724i iVar, Map<Type, C5733q<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C5591G g, List<C5594J> list) {
        this.f15840b = new ThreadLocal<>();
        this.f15841c = new ConcurrentHashMap();
        this.f15843e = new C5698q(map);
        this.f15844f = sVar;
        this.f15845g = iVar;
        this.f15846h = z;
        this.f15848j = z3;
        this.f15847i = z4;
        this.f15849k = z5;
        this.f15850l = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5658ja.f15648Y);
        arrayList.add(C5664n.f15685a);
        arrayList.add(sVar);
        arrayList.addAll(list);
        arrayList.add(C5658ja.f15627D);
        arrayList.add(C5658ja.f15662m);
        arrayList.add(C5658ja.f15656g);
        arrayList.add(C5658ja.f15658i);
        arrayList.add(C5658ja.f15660k);
        C5593I<Number> a = m21659a(g);
        arrayList.add(C5658ja.m21435a(Long.TYPE, Long.class, a));
        arrayList.add(C5658ja.m21435a(Double.TYPE, Double.class, m21661a(z7)));
        arrayList.add(C5658ja.m21435a(Float.TYPE, Float.class, m21665b(z7)));
        arrayList.add(C5658ja.f15673x);
        arrayList.add(C5658ja.f15664o);
        arrayList.add(C5658ja.f15666q);
        arrayList.add(C5658ja.m21434a(AtomicLong.class, m21660a(a)));
        arrayList.add(C5658ja.m21434a(AtomicLongArray.class, m21664b(a)));
        arrayList.add(C5658ja.f15668s);
        arrayList.add(C5658ja.f15675z);
        arrayList.add(C5658ja.f15629F);
        arrayList.add(C5658ja.f15631H);
        arrayList.add(C5658ja.m21434a(BigDecimal.class, C5658ja.f15625B));
        arrayList.add(C5658ja.m21434a(BigInteger.class, C5658ja.f15626C));
        arrayList.add(C5658ja.f15633J);
        arrayList.add(C5658ja.f15635L);
        arrayList.add(C5658ja.f15639P);
        arrayList.add(C5658ja.f15641R);
        arrayList.add(C5658ja.f15646W);
        arrayList.add(C5658ja.f15637N);
        arrayList.add(C5658ja.f15653d);
        arrayList.add(C5647e.f15609a);
        arrayList.add(C5658ja.f15644U);
        arrayList.add(C5672t.f15705a);
        arrayList.add(C5670r.f15703a);
        arrayList.add(C5658ja.f15642S);
        arrayList.add(C5640b.f15602a);
        arrayList.add(C5658ja.f15651b);
        arrayList.add(new C5642c(this.f15843e));
        arrayList.add(new C5660k(this.f15843e, z2));
        this.f15851m = new C5649f(this.f15843e);
        arrayList.add(this.f15851m);
        arrayList.add(C5658ja.f15649Z);
        arrayList.add(new C5666p(this.f15843e, iVar, sVar, this.f15851m));
        this.f15842d = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C5593I<Number> m21659a(C5591G g) {
        return g == C5591G.f15572a ? C5658ja.f15669t : new C5728m();
    }

    /* renamed from: a */
    private static C5593I<AtomicLong> m21660a(C5593I<Number> i) {
        return new C5729n(i).mo15098a();
    }

    /* renamed from: a */
    private C5593I<Number> m21661a(boolean z) {
        return z ? C5658ja.f15671v : new C5726k(this);
    }

    /* renamed from: a */
    static void m21662a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: a */
    private static void m21663a(Object obj, C5716b bVar) {
        if (obj != null) {
            try {
                if (bVar.mo15165p() != C5717c.END_DOCUMENT) {
                    throw new C5738v("JSON document was not fully consumed.");
                }
            } catch (C5719e e) {
                throw new C5588D((Throwable) e);
            } catch (IOException e2) {
                throw new C5738v((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C5593I<AtomicLongArray> m21664b(C5593I<Number> i) {
        return new C5730o(i).mo15098a();
    }

    /* renamed from: b */
    private C5593I<Number> m21665b(boolean z) {
        return z ? C5658ja.f15670u : new C5727l(this);
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15287a(C5594J j, C5713a<T> aVar) {
        if (!this.f15842d.contains(j)) {
            j = this.f15851m;
        }
        boolean z = false;
        for (C5594J next : this.f15842d) {
            if (z) {
                C5593I<T> a = next.mo15100a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == j) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15288a(C5713a<T> aVar) {
        C5593I<T> i = this.f15841c.get(aVar == null ? f15839a : aVar);
        if (i != null) {
            return i;
        }
        Map map = this.f15840b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f15840b.set(map);
            z = true;
        }
        C5732a aVar2 = (C5732a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            C5732a aVar3 = new C5732a();
            map.put(aVar, aVar3);
            for (C5594J a : this.f15842d) {
                C5593I<T> a2 = a.mo15100a(this, aVar);
                if (a2 != null) {
                    aVar3.mo15303a(a2);
                    this.f15841c.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f15840b.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15289a(Class<T> cls) {
        return mo15288a(C5713a.m21561a(cls));
    }

    /* renamed from: a */
    public C5716b mo15290a(Reader reader) {
        C5716b bVar = new C5716b(reader);
        bVar.mo15272a(this.f15850l);
        return bVar;
    }

    /* renamed from: a */
    public C5718d mo15291a(Writer writer) {
        if (this.f15848j) {
            writer.write(")]}'\n");
        }
        C5718d dVar = new C5718d(writer);
        if (this.f15849k) {
            dVar.mo15276b("  ");
        }
        dVar.mo15278c(this.f15846h);
        return dVar;
    }

    /* renamed from: a */
    public <T> T mo15292a(C5716b bVar, Type type) {
        boolean h = bVar.mo15274h();
        bVar.mo15272a(true);
        try {
            bVar.mo15165p();
            T a = mo15288a(C5713a.m21562a(type)).mo15096a(bVar);
            bVar.mo15272a(h);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                bVar.mo15272a(h);
                return null;
            }
            throw new C5588D((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C5588D((Throwable) e2);
        } catch (IOException e3) {
            throw new C5588D((Throwable) e3);
        } catch (Throwable th) {
            bVar.mo15272a(h);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo15293a(Reader reader, Type type) {
        C5716b a = mo15290a(reader);
        T a2 = mo15292a(a, type);
        m21663a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    public <T> T mo15294a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo15293a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public String mo15295a(C5737u uVar) {
        StringWriter stringWriter = new StringWriter();
        mo15299a(uVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public String mo15296a(Object obj) {
        return obj == null ? mo15295a((C5737u) C5739w.f15854a) : mo15297a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo15297a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo15301a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo15298a(C5737u uVar, C5718d dVar) {
        boolean g = dVar.mo15281g();
        dVar.mo15277b(true);
        boolean f = dVar.mo15280f();
        dVar.mo15275a(this.f15847i);
        boolean e = dVar.mo15279e();
        dVar.mo15278c(this.f15846h);
        try {
            C5603B.m21256a(uVar, dVar);
            dVar.mo15277b(g);
            dVar.mo15275a(f);
            dVar.mo15278c(e);
        } catch (IOException e2) {
            throw new C5738v((Throwable) e2);
        } catch (Throwable th) {
            dVar.mo15277b(g);
            dVar.mo15275a(f);
            dVar.mo15278c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo15299a(C5737u uVar, Appendable appendable) {
        try {
            mo15298a(uVar, mo15291a(C5603B.m21255a(appendable)));
        } catch (IOException e) {
            throw new C5738v((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15300a(Object obj, Type type, C5718d dVar) {
        C5593I<?> a = mo15288a(C5713a.m21562a(type));
        boolean g = dVar.mo15281g();
        dVar.mo15277b(true);
        boolean f = dVar.mo15280f();
        dVar.mo15275a(this.f15847i);
        boolean e = dVar.mo15279e();
        dVar.mo15278c(this.f15846h);
        try {
            a.mo15097a(dVar, obj);
            dVar.mo15277b(g);
            dVar.mo15275a(f);
            dVar.mo15278c(e);
        } catch (IOException e2) {
            throw new C5738v((Throwable) e2);
        } catch (Throwable th) {
            dVar.mo15277b(g);
            dVar.mo15275a(f);
            dVar.mo15278c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo15301a(Object obj, Type type, Appendable appendable) {
        try {
            mo15300a(obj, type, mo15291a(C5603B.m21255a(appendable)));
        } catch (IOException e) {
            throw new C5738v((Throwable) e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f15846h + "factories:" + this.f15842d + ",instanceCreators:" + this.f15843e + "}";
    }
}
