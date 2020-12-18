package p101d.p129g.p152e;

import java.io.IOException;
import p101d.p129g.p152e.p154b.p155a.C5657j;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.I */
public abstract class C5593I<T> {
    /* renamed from: a */
    public final C5593I<T> mo15098a() {
        return new C5592H(this);
    }

    /* renamed from: a */
    public final C5737u mo15099a(T t) {
        try {
            C5657j jVar = new C5657j();
            mo15097a(jVar, t);
            return jVar.mo15187i();
        } catch (IOException e) {
            throw new C5738v((Throwable) e);
        }
    }

    /* renamed from: a */
    public abstract T mo15096a(C5716b bVar);

    /* renamed from: a */
    public abstract void mo15097a(C5718d dVar, T t);
}
