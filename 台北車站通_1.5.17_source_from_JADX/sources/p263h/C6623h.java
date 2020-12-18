package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p263h.C6616c;

/* renamed from: h.h */
final class C6623h extends C6616c.C6617a {

    /* renamed from: a */
    final Executor f18331a;

    /* renamed from: h.h$a */
    static final class C6624a<T> implements C6596b<T> {

        /* renamed from: a */
        final Executor f18332a;

        /* renamed from: b */
        final C6596b<T> f18333b;

        C6624a(Executor executor, C6596b<T> bVar) {
            this.f18332a = executor;
            this.f18333b = bVar;
        }

        public void cancel() {
            this.f18333b.cancel();
        }

        public C6596b<T> clone() {
            return new C6624a(this.f18332a, this.f18333b.clone());
        }

        public C6650p<T> execute() {
            return this.f18333b.execute();
        }

        public boolean isCanceled() {
            return this.f18333b.isCanceled();
        }
    }

    C6623h(Executor executor) {
        this.f18331a = executor;
    }

    /* renamed from: a */
    public C6616c<C6596b<?>> mo15713a(Type type, Annotation[] annotationArr, C6652r rVar) {
        if (C6616c.C6617a.m25191a(type) != C6596b.class) {
            return null;
        }
        return new C6622g(this, C6656t.m25307b(type));
    }
}
