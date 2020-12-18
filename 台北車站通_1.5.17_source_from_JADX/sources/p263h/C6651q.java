package p263h;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: h.q */
class C6651q implements InvocationHandler {

    /* renamed from: a */
    private final C6642n f18388a = C6642n.m25229b();

    /* renamed from: b */
    final /* synthetic */ Class f18389b;

    /* renamed from: c */
    final /* synthetic */ C6652r f18390c;

    C6651q(C6652r rVar, Class cls) {
        this.f18390c = rVar;
        this.f18389b = cls;
    }

    public Object invoke(Object obj, Method method, Object... objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (this.f18388a.mo17037a(method)) {
            return this.f18388a.mo17035a(method, this.f18389b, obj, objArr);
        }
        C6654s a = this.f18390c.mo17061a(method);
        return a.f18408d.mo15711a(new C6626j(a, objArr));
    }
}
