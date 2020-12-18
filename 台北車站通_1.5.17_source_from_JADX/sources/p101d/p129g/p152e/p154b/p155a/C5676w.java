package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p154b.p155a.C5666p;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.w */
final class C5676w<T> extends C5593I<T> {

    /* renamed from: a */
    private final C5731p f15715a;

    /* renamed from: b */
    private final C5593I<T> f15716b;

    /* renamed from: c */
    private final Type f15717c;

    C5676w(C5731p pVar, C5593I<T> i, Type type) {
        this.f15715a = pVar;
        this.f15716b = i;
        this.f15717c = type;
    }

    /* renamed from: a */
    private Type m21479a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: a */
    public T mo15096a(C5716b bVar) {
        return this.f15716b.mo15096a(bVar);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, T t) {
        C5593I<T> i = this.f15716b;
        Type a = m21479a(this.f15717c, (Object) t);
        if (a != this.f15717c) {
            i = this.f15715a.mo15288a(C5713a.m21562a(a));
            if (i instanceof C5666p.C5667a) {
                C5593I<T> i2 = this.f15716b;
                if (!(i2 instanceof C5666p.C5667a)) {
                    i = i2;
                }
            }
        }
        i.mo15097a(dVar, t);
    }
}
