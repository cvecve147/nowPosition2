package p263h.p264a.p265a;

import okhttp3.ResponseBody;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5731p;
import p263h.C6618d;

/* renamed from: h.a.a.c */
final class C6595c<T> implements C6618d<ResponseBody, T> {

    /* renamed from: a */
    private final C5731p f18324a;

    /* renamed from: b */
    private final C5593I<T> f18325b;

    C6595c(C5731p pVar, C5593I<T> i) {
        this.f18324a = pVar;
        this.f18325b = i;
    }

    /* renamed from: a */
    public T mo16985a(ResponseBody responseBody) {
        try {
            return this.f18325b.mo15096a(this.f18324a.mo15290a(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }
}
