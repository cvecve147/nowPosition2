package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p263h.C6618d;
import p263h.p266b.C6615s;

/* renamed from: h.a */
final class C6586a extends C6618d.C6619a {

    /* renamed from: h.a$a */
    static final class C6587a implements C6618d<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final C6587a f18313a = new C6587a();

        C6587a() {
        }

        /* renamed from: a */
        public ResponseBody mo16985a(ResponseBody responseBody) {
            try {
                return C6656t.m25301a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: h.a$b */
    static final class C6588b implements C6618d<RequestBody, RequestBody> {

        /* renamed from: a */
        static final C6588b f18314a = new C6588b();

        C6588b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo16985a(Object obj) {
            RequestBody requestBody = (RequestBody) obj;
            mo16987a(requestBody);
            return requestBody;
        }

        /* renamed from: a */
        public RequestBody mo16987a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: h.a$c */
    static final class C6589c implements C6618d<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final C6589c f18315a = new C6589c();

        C6589c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo16985a(Object obj) {
            ResponseBody responseBody = (ResponseBody) obj;
            mo16988a(responseBody);
            return responseBody;
        }

        /* renamed from: a */
        public ResponseBody mo16988a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: h.a$d */
    static final class C6590d implements C6618d<String, String> {

        /* renamed from: a */
        static final C6590d f18316a = new C6590d();

        C6590d() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo16985a(Object obj) {
            String str = (String) obj;
            mo16989a(str);
            return str;
        }

        /* renamed from: a */
        public String mo16989a(String str) {
            return str;
        }
    }

    /* renamed from: h.a$e */
    static final class C6591e implements C6618d<Object, String> {

        /* renamed from: a */
        static final C6591e f18317a = new C6591e();

        C6591e() {
        }

        /* renamed from: a */
        public String m25178a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: h.a$f */
    static final class C6592f implements C6618d<ResponseBody, Void> {

        /* renamed from: a */
        static final C6592f f18318a = new C6592f();

        C6592f() {
        }

        /* renamed from: a */
        public Void mo16985a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    C6586a() {
    }

    /* renamed from: a */
    public C6618d<ResponseBody, ?> mo16982a(Type type, Annotation[] annotationArr, C6652r rVar) {
        if (type == ResponseBody.class) {
            return C6656t.m25306a(annotationArr, (Class<? extends Annotation>) C6615s.class) ? C6589c.f18315a : C6587a.f18313a;
        }
        if (type == Void.class) {
            return C6592f.f18318a;
        }
        return null;
    }

    /* renamed from: a */
    public C6618d<?, RequestBody> mo16983a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6652r rVar) {
        if (RequestBody.class.isAssignableFrom(C6656t.m25309c(type))) {
            return C6588b.f18314a;
        }
        return null;
    }

    /* renamed from: b */
    public C6618d<?, String> mo16984b(Type type, Annotation[] annotationArr, C6652r rVar) {
        if (type == String.class) {
            return C6590d.f18316a;
        }
        return null;
    }
}
