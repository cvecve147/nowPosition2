package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.b */
public final class C5640b<E> extends C5593I<Object> {

    /* renamed from: a */
    public static final C5594J f15602a = new C5637a();

    /* renamed from: b */
    private final Class<E> f15603b;

    /* renamed from: c */
    private final C5593I<E> f15604c;

    public C5640b(C5731p pVar, C5593I<E> i, Class<E> cls) {
        this.f15604c = new C5676w(pVar, i, cls);
        this.f15603b = cls;
    }

    /* renamed from: a */
    public Object mo15096a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.mo15151a();
        while (bVar.mo15157g()) {
            arrayList.add(this.f15604c.mo15096a(bVar));
        }
        bVar.mo15154d();
        Object newInstance = Array.newInstance(this.f15603b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Object obj) {
        if (obj == null) {
            dVar.mo15186h();
            return;
        }
        dVar.mo15174a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f15604c.mo15097a(dVar, Array.get(obj, i));
        }
        dVar.mo15180c();
    }
}
