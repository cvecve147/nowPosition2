package p101d.p191i.p192a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p101d.p191i.p192a.p194b.p195a.C5986d;

/* renamed from: d.i.a.g */
public class C6025g {

    /* renamed from: a */
    private C5986d f16852a;

    /* renamed from: b */
    private final Lock f16853b = new ReentrantLock();

    public C6025g(C6027i iVar) {
        this.f16852a = (C5986d) iVar.getChildAt(0);
    }

    /* renamed from: a */
    public void mo15932a(float f) {
        mo15933a(f, (float) (this.f16852a.getWidth() / 2), (float) (this.f16852a.getHeight() / 2));
    }

    /* renamed from: a */
    public void mo15933a(float f, float f2, float f3) {
        this.f16852a.mo15816a(f, f2, f3);
    }
}
