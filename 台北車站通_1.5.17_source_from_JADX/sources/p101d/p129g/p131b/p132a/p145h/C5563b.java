package p101d.p129g.p131b.p132a.p145h;

import android.util.SparseArray;
import p101d.p129g.p131b.p132a.p145h.C5566c;

/* renamed from: d.g.b.a.h.b */
public abstract class C5563b<T> {

    /* renamed from: a */
    private final Object f15518a = new Object();

    /* renamed from: b */
    private C5565b<T> f15519b;

    /* renamed from: d.g.b.a.h.b$a */
    public static class C5564a<T> {

        /* renamed from: a */
        private final SparseArray<T> f15520a;

        /* renamed from: b */
        private final C5566c.C5568b f15521b;

        /* renamed from: c */
        private final boolean f15522c;

        public C5564a(SparseArray<T> sparseArray, C5566c.C5568b bVar, boolean z) {
            this.f15520a = sparseArray;
            this.f15521b = bVar;
            this.f15522c = z;
        }

        /* renamed from: a */
        public SparseArray<T> mo15035a() {
            return this.f15520a;
        }
    }

    /* renamed from: d.g.b.a.h.b$b */
    public interface C5565b<T> {
        /* renamed from: a */
        void mo13193a();

        /* renamed from: a */
        void mo13194a(C5564a<T> aVar);
    }

    /* renamed from: a */
    public abstract SparseArray<T> mo11384a(C5566c cVar);

    /* renamed from: a */
    public void mo15033a(C5565b<T> bVar) {
        synchronized (this.f15518a) {
            if (this.f15519b != null) {
                this.f15519b.mo13193a();
            }
            this.f15519b = bVar;
        }
    }

    /* renamed from: a */
    public abstract boolean mo11385a();

    /* renamed from: b */
    public void mo11386b() {
        synchronized (this.f15518a) {
            if (this.f15519b != null) {
                this.f15519b.mo13193a();
                this.f15519b = null;
            }
        }
    }

    /* renamed from: b */
    public void mo15034b(C5566c cVar) {
        C5566c.C5568b bVar = new C5566c.C5568b(cVar.mo15038c());
        bVar.mo15049f();
        C5564a aVar = new C5564a(mo11384a(cVar), bVar, mo11385a());
        synchronized (this.f15518a) {
            if (this.f15519b != null) {
                this.f15519b.mo13194a(aVar);
            } else {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
        }
    }
}
