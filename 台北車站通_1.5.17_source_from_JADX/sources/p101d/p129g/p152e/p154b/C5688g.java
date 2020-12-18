package p101d.p129g.p152e.p154b;

import java.lang.reflect.Type;

/* renamed from: d.g.e.b.g */
class C5688g implements C5711z<T> {

    /* renamed from: a */
    private final C5610G f15729a = C5610G.m21261a();

    /* renamed from: b */
    final /* synthetic */ Class f15730b;

    /* renamed from: c */
    final /* synthetic */ Type f15731c;

    /* renamed from: d */
    final /* synthetic */ C5698q f15732d;

    C5688g(C5698q qVar, Class cls, Type type) {
        this.f15732d = qVar;
        this.f15730b = cls;
        this.f15731c = type;
    }

    /* renamed from: a */
    public T mo15214a() {
        try {
            return this.f15729a.mo15117b(this.f15730b);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f15731c + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }
}
