package p263h.p264a.p265a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;
import p263h.C6618d;
import p263h.C6652r;

/* renamed from: h.a.a.a */
public final class C6593a extends C6618d.C6619a {

    /* renamed from: a */
    private final C5731p f18319a;

    private C6593a(C5731p pVar) {
        if (pVar != null) {
            this.f18319a = pVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public static C6593a m25181a() {
        return m25182a(new C5731p());
    }

    /* renamed from: a */
    public static C6593a m25182a(C5731p pVar) {
        return new C6593a(pVar);
    }

    /* renamed from: a */
    public C6618d<ResponseBody, ?> mo16982a(Type type, Annotation[] annotationArr, C6652r rVar) {
        return new C6595c(this.f18319a, this.f18319a.mo15288a(C5713a.m21562a(type)));
    }

    /* renamed from: a */
    public C6618d<?, RequestBody> mo16983a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6652r rVar) {
        return new C6594b(this.f18319a, this.f18319a.mo15288a(C5713a.m21562a(type)));
    }
}
