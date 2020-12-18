package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: h.c */
public interface C6616c<T> {

    /* renamed from: h.c$a */
    public static abstract class C6617a {
        /* renamed from: a */
        protected static Class<?> m25191a(Type type) {
            return C6656t.m25309c(type);
        }

        /* renamed from: a */
        protected static Type m25192a(int i, ParameterizedType parameterizedType) {
            return C6656t.m25297a(i, parameterizedType);
        }

        /* renamed from: a */
        public abstract C6616c<?> mo15713a(Type type, Annotation[] annotationArr, C6652r rVar);
    }

    /* renamed from: a */
    <R> T mo15711a(C6596b<R> bVar);

    /* renamed from: a */
    Type mo15712a();
}
