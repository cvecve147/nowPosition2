package p263h;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: h.p */
public final class C6650p<T> {

    /* renamed from: a */
    private final Response f18385a;

    /* renamed from: b */
    private final T f18386b;

    /* renamed from: c */
    private final ResponseBody f18387c;

    private C6650p(Response response, T t, ResponseBody responseBody) {
        this.f18385a = response;
        this.f18386b = t;
        this.f18387c = responseBody;
    }

    /* renamed from: a */
    public static <T> C6650p<T> m25251a(T t, Response response) {
        if (response == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (response.isSuccessful()) {
            return new C6650p<>(response, t, (ResponseBody) null);
        } else {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
    }

    /* renamed from: a */
    public static <T> C6650p<T> m25252a(ResponseBody responseBody, Response response) {
        if (responseBody == null) {
            throw new NullPointerException("body == null");
        } else if (response == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (!response.isSuccessful()) {
            return new C6650p<>(response, (Object) null, responseBody);
        } else {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
    }

    /* renamed from: a */
    public T mo17051a() {
        return this.f18386b;
    }

    /* renamed from: b */
    public int mo17052b() {
        return this.f18385a.code();
    }

    /* renamed from: c */
    public boolean mo17053c() {
        return this.f18385a.isSuccessful();
    }

    /* renamed from: d */
    public String mo17054d() {
        return this.f18385a.message();
    }
}
