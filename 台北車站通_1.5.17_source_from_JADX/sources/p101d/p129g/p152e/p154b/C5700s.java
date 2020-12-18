package p101d.p129g.p152e.p154b;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5595a;
import p101d.p129g.p152e.C5601b;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p153a.C5596a;
import p101d.p129g.p152e.p153a.C5599d;
import p101d.p129g.p152e.p153a.C5600e;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.s */
public final class C5700s implements C5594J, Cloneable {

    /* renamed from: a */
    public static final C5700s f15755a = new C5700s();

    /* renamed from: b */
    private double f15756b = -1.0d;

    /* renamed from: c */
    private int f15757c = 136;

    /* renamed from: d */
    private boolean f15758d = true;

    /* renamed from: e */
    private boolean f15759e;

    /* renamed from: f */
    private List<C5595a> f15760f = Collections.emptyList();

    /* renamed from: g */
    private List<C5595a> f15761g = Collections.emptyList();

    /* renamed from: a */
    private boolean m21535a(C5599d dVar) {
        return dVar == null || dVar.value() <= this.f15756b;
    }

    /* renamed from: a */
    private boolean m21536a(C5599d dVar, C5600e eVar) {
        return m21535a(dVar) && m21537a(eVar);
    }

    /* renamed from: a */
    private boolean m21537a(C5600e eVar) {
        return eVar == null || eVar.value() > this.f15756b;
    }

    /* renamed from: a */
    private boolean m21538a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m21539b(Class<?> cls) {
        return cls.isMemberClass() && !m21540c(cls);
    }

    /* renamed from: c */
    private boolean m21540c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Class<? super T> a = aVar.mo15267a();
        boolean a2 = mo15217a((Class<?>) a, true);
        boolean a3 = mo15217a((Class<?>) a, false);
        if (a2 || a3) {
            return new C5699r(this, a3, a2, pVar, aVar);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo15217a(Class<?> cls, boolean z) {
        if (this.f15756b != -1.0d && !m21536a((C5599d) cls.getAnnotation(C5599d.class), (C5600e) cls.getAnnotation(C5600e.class))) {
            return true;
        }
        if ((!this.f15758d && m21539b(cls)) || m21538a(cls)) {
            return true;
        }
        for (C5595a a : z ? this.f15760f : this.f15761g) {
            if (a.mo15102a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo15218a(Field field, boolean z) {
        C5596a aVar;
        if ((this.f15757c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f15756b != -1.0d && !m21536a((C5599d) field.getAnnotation(C5599d.class), (C5600e) field.getAnnotation(C5600e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f15759e && ((aVar = (C5596a) field.getAnnotation(C5596a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f15758d && m21539b(field.getType())) || m21538a(field.getType())) {
            return true;
        }
        List<C5595a> list = z ? this.f15760f : this.f15761g;
        if (list.isEmpty()) {
            return false;
        }
        C5601b bVar = new C5601b(field);
        for (C5595a a : list) {
            if (a.mo15101a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public C5700s clone() {
        try {
            return (C5700s) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
