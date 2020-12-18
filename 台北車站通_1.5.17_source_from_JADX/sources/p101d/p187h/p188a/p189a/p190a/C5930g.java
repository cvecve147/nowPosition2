package p101d.p187h.p188a.p189a.p190a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p208e.p221b.C6221b;
import p208e.p221b.C6247e;
import p208e.p221b.C6427i;
import p208e.p221b.C6433l;
import p208e.p221b.C6439r;
import p208e.p221b.C6444s;
import p263h.C6616c;
import p263h.C6650p;
import p263h.C6652r;

/* renamed from: d.h.a.a.a.g */
public final class C5930g extends C6616c.C6617a {

    /* renamed from: a */
    private final C6439r f16394a;

    private C5930g(C6439r rVar) {
        this.f16394a = rVar;
    }

    /* renamed from: a */
    public static C5930g m22438a() {
        return new C5930g((C6439r) null);
    }

    /* renamed from: a */
    public C6616c<?> mo15713a(Type type, Annotation[] annotationArr, C6652r rVar) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> a = C6616c.C6617a.m25191a(type);
        if (a == C6221b.class) {
            return new C5929f(Void.class, this.f16394a, false, true, false, false, false, true);
        }
        boolean z3 = a == C6247e.class;
        boolean z4 = a == C6444s.class;
        boolean z5 = a == C6427i.class;
        if (a != C6433l.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? z4 ? "Single" : "Observable" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type a2 = C6616c.C6617a.m25192a(0, (ParameterizedType) type);
        Class<?> a3 = C6616c.C6617a.m25191a(a2);
        if (a3 == C6650p.class) {
            if (a2 instanceof ParameterizedType) {
                type2 = C6616c.C6617a.m25192a(0, (ParameterizedType) a2);
                z2 = false;
                z = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a3 != C5926d.class) {
            type2 = a2;
            z = true;
            z2 = false;
        } else if (a2 instanceof ParameterizedType) {
            type2 = C6616c.C6617a.m25192a(0, (ParameterizedType) a2);
            z2 = true;
            z = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new C5929f(type2, this.f16394a, z2, z, z3, z4, z5, false);
    }
}
