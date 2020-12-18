package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5724i;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p153a.C5597b;
import p101d.p129g.p152e.p153a.C5598c;
import p101d.p129g.p152e.p154b.C5602A;
import p101d.p129g.p152e.p154b.C5680b;
import p101d.p129g.p152e.p154b.C5698q;
import p101d.p129g.p152e.p154b.C5700s;
import p101d.p129g.p152e.p154b.C5711z;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.p */
public final class C5666p implements C5594J {

    /* renamed from: a */
    private final C5698q f15694a;

    /* renamed from: b */
    private final C5724i f15695b;

    /* renamed from: c */
    private final C5700s f15696c;

    /* renamed from: d */
    private final C5649f f15697d;

    /* renamed from: d.g.e.b.a.p$a */
    public static final class C5667a<T> extends C5593I<T> {

        /* renamed from: a */
        private final C5711z<T> f15698a;

        /* renamed from: b */
        private final Map<String, C5668b> f15699b;

        C5667a(C5711z<T> zVar, Map<String, C5668b> map) {
            this.f15698a = zVar;
            this.f15699b = map;
        }

        /* renamed from: a */
        public T mo15096a(C5716b bVar) {
            if (bVar.mo15165p() == C5717c.NULL) {
                bVar.mo15163n();
                return null;
            }
            T a = this.f15698a.mo15214a();
            try {
                bVar.mo15152b();
                while (bVar.mo15157g()) {
                    C5668b bVar2 = this.f15699b.get(bVar.mo15162m());
                    if (bVar2 != null) {
                        if (bVar2.f15702c) {
                            bVar2.mo15190a(bVar, (Object) a);
                        }
                    }
                    bVar.mo15166q();
                }
                bVar.mo15155e();
                return a;
            } catch (IllegalStateException e) {
                throw new C5588D((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo15097a(C5718d dVar, T t) {
            if (t == null) {
                dVar.mo15186h();
                return;
            }
            dVar.mo15179b();
            try {
                for (C5668b next : this.f15699b.values()) {
                    if (next.mo15192a(t)) {
                        dVar.mo15178a(next.f15700a);
                        next.mo15191a(dVar, (Object) t);
                    }
                }
                dVar.mo15183d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: d.g.e.b.a.p$b */
    static abstract class C5668b {

        /* renamed from: a */
        final String f15700a;

        /* renamed from: b */
        final boolean f15701b;

        /* renamed from: c */
        final boolean f15702c;

        protected C5668b(String str, boolean z, boolean z2) {
            this.f15700a = str;
            this.f15701b = z;
            this.f15702c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo15190a(C5716b bVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo15191a(C5718d dVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo15192a(Object obj);
    }

    public C5666p(C5698q qVar, C5724i iVar, C5700s sVar, C5649f fVar) {
        this.f15694a = qVar;
        this.f15695b = iVar;
        this.f15696c = sVar;
        this.f15697d = fVar;
    }

    /* renamed from: a */
    private C5668b m21455a(C5731p pVar, Field field, String str, C5713a<?> aVar, boolean z, boolean z2) {
        C5731p pVar2 = pVar;
        C5713a<?> aVar2 = aVar;
        boolean a = C5602A.m21253a(aVar.mo15267a());
        Field field2 = field;
        C5597b bVar = (C5597b) field.getAnnotation(C5597b.class);
        C5593I<?> a2 = bVar != null ? this.f15697d.mo15146a(this.f15694a, pVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = pVar.mo15288a(aVar2);
        }
        return new C5665o(this, str, z, z2, field, z3, a2, pVar, aVar, a);
    }

    /* renamed from: a */
    private List<String> m21456a(Field field) {
        C5598c cVar = (C5598c) field.getAnnotation(C5598c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f15695b.mo15266a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, C5668b> m21457a(C5731p pVar, C5713a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo15268b();
        C5713a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo15193a(field, true);
                boolean a2 = mo15193a(field, z);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = C5680b.m21501a(aVar2.mo15268b(), (Class<?>) cls2, field.getGenericType());
                    List<String> a4 = m21456a(field);
                    C5668b bVar = null;
                    int i2 = z;
                    while (i2 < a4.size()) {
                        String str = a4.get(i2);
                        boolean z2 = i2 != 0 ? z : a;
                        String str2 = str;
                        C5668b bVar2 = bVar;
                        int i3 = i2;
                        List<String> list = a4;
                        Field field2 = field;
                        bVar = bVar2 == null ? (C5668b) linkedHashMap.put(str2, m21455a(pVar, field, str2, C5713a.m21562a(a3), z2, a2)) : bVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        field = field2;
                        z = false;
                    }
                    C5668b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(b + " declares multiple JSON fields named " + bVar3.f15700a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C5713a.m21562a(C5680b.m21501a(aVar2.mo15268b(), (Class<?>) cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo15267a();
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static boolean m21458a(Field field, boolean z, C5700s sVar) {
        return !sVar.mo15217a(field.getType(), z) && !sVar.mo15218a(field, z);
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Class<? super T> a = aVar.mo15267a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C5667a(this.f15694a.mo15215a(aVar), m21457a(pVar, (C5713a<?>) aVar, (Class<?>) a));
    }

    /* renamed from: a */
    public boolean mo15193a(Field field, boolean z) {
        return m21458a(field, z, this.f15696c);
    }
}
