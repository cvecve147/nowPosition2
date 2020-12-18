package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import p263h.C6631m;
import p263h.p266b.C6597a;
import p263h.p266b.C6598b;
import p263h.p266b.C6599c;
import p263h.p266b.C6600d;
import p263h.p266b.C6601e;
import p263h.p266b.C6602f;
import p263h.p266b.C6603g;
import p263h.p266b.C6604h;
import p263h.p266b.C6605i;
import p263h.p266b.C6606j;
import p263h.p266b.C6607k;
import p263h.p266b.C6608l;
import p263h.p266b.C6609m;
import p263h.p266b.C6610n;
import p263h.p266b.C6611o;
import p263h.p266b.C6612p;
import p263h.p266b.C6613q;
import p263h.p266b.C6614r;

/* renamed from: h.s */
final class C6654s<T> {

    /* renamed from: a */
    static final Pattern f18405a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f18406b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final Call.Factory f18407c;

    /* renamed from: d */
    final C6616c<?> f18408d;

    /* renamed from: e */
    private final HttpUrl f18409e;

    /* renamed from: f */
    private final C6618d<ResponseBody, T> f18410f;

    /* renamed from: g */
    private final String f18411g;

    /* renamed from: h */
    private final String f18412h;

    /* renamed from: i */
    private final Headers f18413i;

    /* renamed from: j */
    private final MediaType f18414j;

    /* renamed from: k */
    private final boolean f18415k;

    /* renamed from: l */
    private final boolean f18416l;

    /* renamed from: m */
    private final boolean f18417m;

    /* renamed from: n */
    private final C6631m<?>[] f18418n;

    /* renamed from: h.s$a */
    static final class C6655a<T> {

        /* renamed from: a */
        final C6652r f18419a;

        /* renamed from: b */
        final Method f18420b;

        /* renamed from: c */
        final Annotation[] f18421c;

        /* renamed from: d */
        final Annotation[][] f18422d;

        /* renamed from: e */
        final Type[] f18423e;

        /* renamed from: f */
        Type f18424f;

        /* renamed from: g */
        boolean f18425g;

        /* renamed from: h */
        boolean f18426h;

        /* renamed from: i */
        boolean f18427i;

        /* renamed from: j */
        boolean f18428j;

        /* renamed from: k */
        boolean f18429k;

        /* renamed from: l */
        boolean f18430l;

        /* renamed from: m */
        String f18431m;

        /* renamed from: n */
        boolean f18432n;

        /* renamed from: o */
        boolean f18433o;

        /* renamed from: p */
        boolean f18434p;

        /* renamed from: q */
        String f18435q;

        /* renamed from: r */
        Headers f18436r;

        /* renamed from: s */
        MediaType f18437s;

        /* renamed from: t */
        Set<String> f18438t;

        /* renamed from: u */
        C6631m<?>[] f18439u;

        /* renamed from: v */
        C6618d<ResponseBody, T> f18440v;

        /* renamed from: w */
        C6616c<?> f18441w;

        public C6655a(C6652r rVar, Method method) {
            this.f18419a = rVar;
            this.f18420b = method;
            this.f18421c = method.getAnnotations();
            this.f18423e = method.getGenericParameterTypes();
            this.f18422d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private C6631m<?> m25280a(int i, Type type, Annotation[] annotationArr) {
            C6631m<?> mVar = null;
            for (Annotation a : annotationArr) {
                C6631m<?> a2 = m25281a(i, type, annotationArr, a);
                if (a2 != null) {
                    if (mVar == null) {
                        mVar = a2;
                    } else {
                        throw m25282a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (mVar != null) {
                return mVar;
            }
            throw m25282a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private C6631m<?> m25281a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C6612p) {
                if (this.f18429k) {
                    throw m25282a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f18430l) {
                    throw m25282a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f18435q != null) {
                    this.f18428j = true;
                    C6612p pVar = (C6612p) annotation;
                    String value = pVar.value();
                    m25287a(i, value);
                    return new C6631m.C6638g(value, this.f18419a.mo17066c(type, annotationArr), pVar.encoded());
                } else {
                    throw m25282a(i, "@Path can only be used with relative url on @%s", this.f18431m);
                }
            } else if (annotation instanceof C6613q) {
                C6613q qVar = (C6613q) annotation;
                String value2 = qVar.value();
                boolean encoded = qVar.encoded();
                Class<?> c = C6656t.m25309c(type);
                this.f18429k = true;
                if (Iterable.class.isAssignableFrom(c)) {
                    if (type instanceof ParameterizedType) {
                        return new C6631m.C6639h(value2, this.f18419a.mo17066c(C6656t.m25297a(0, (ParameterizedType) type), annotationArr), encoded).mo17029b();
                    }
                    throw m25282a(i, c.getSimpleName() + " must include generic type (e.g., " + c.getSimpleName() + "<String>)", new Object[0]);
                } else if (!c.isArray()) {
                    return new C6631m.C6639h(value2, this.f18419a.mo17066c(type, annotationArr), encoded);
                } else {
                    return new C6631m.C6639h(value2, this.f18419a.mo17066c(C6654s.m25276a(c.getComponentType()), annotationArr), encoded).mo17028a();
                }
            } else if (annotation instanceof C6614r) {
                Class<?> c2 = C6656t.m25309c(type);
                if (Map.class.isAssignableFrom(c2)) {
                    Type b = C6656t.m25308b(type, c2, Map.class);
                    if (b instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) b;
                        Type a = C6656t.m25297a(0, parameterizedType);
                        if (String.class == a) {
                            return new C6631m.C6640i(this.f18419a.mo17066c(C6656t.m25297a(1, parameterizedType), annotationArr), ((C6614r) annotation).encoded());
                        }
                        throw m25282a(i, "@QueryMap keys must be of type String: " + a, new Object[0]);
                    }
                    throw m25282a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m25282a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C6604h) {
                String value3 = ((C6604h) annotation).value();
                Class<?> c3 = C6656t.m25309c(type);
                if (Iterable.class.isAssignableFrom(c3)) {
                    if (type instanceof ParameterizedType) {
                        return new C6631m.C6635d(value3, this.f18419a.mo17066c(C6656t.m25297a(0, (ParameterizedType) type), annotationArr)).mo17029b();
                    }
                    throw m25282a(i, c3.getSimpleName() + " must include generic type (e.g., " + c3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!c3.isArray()) {
                    return new C6631m.C6635d(value3, this.f18419a.mo17066c(type, annotationArr));
                } else {
                    return new C6631m.C6635d(value3, this.f18419a.mo17066c(C6654s.m25276a(c3.getComponentType()), annotationArr)).mo17028a();
                }
            } else if (annotation instanceof C6599c) {
                if (this.f18433o) {
                    C6599c cVar = (C6599c) annotation;
                    String value4 = cVar.value();
                    boolean encoded2 = cVar.encoded();
                    this.f18425g = true;
                    Class<?> c4 = C6656t.m25309c(type);
                    if (Iterable.class.isAssignableFrom(c4)) {
                        if (type instanceof ParameterizedType) {
                            return new C6631m.C6633b(value4, this.f18419a.mo17066c(C6656t.m25297a(0, (ParameterizedType) type), annotationArr), encoded2).mo17029b();
                        }
                        throw m25282a(i, c4.getSimpleName() + " must include generic type (e.g., " + c4.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!c4.isArray()) {
                        return new C6631m.C6633b(value4, this.f18419a.mo17066c(type, annotationArr), encoded2);
                    } else {
                        return new C6631m.C6633b(value4, this.f18419a.mo17066c(C6654s.m25276a(c4.getComponentType()), annotationArr), encoded2).mo17028a();
                    }
                } else {
                    throw m25282a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C6600d) {
                if (this.f18433o) {
                    Class<?> c5 = C6656t.m25309c(type);
                    if (Map.class.isAssignableFrom(c5)) {
                        Type b2 = C6656t.m25308b(type, c5, Map.class);
                        if (b2 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) b2;
                            Type a2 = C6656t.m25297a(0, parameterizedType2);
                            if (String.class == a2) {
                                C6618d c6 = this.f18419a.mo17066c(C6656t.m25297a(1, parameterizedType2), annotationArr);
                                this.f18425g = true;
                                return new C6631m.C6634c(c6, ((C6600d) annotation).encoded());
                            }
                            throw m25282a(i, "@FieldMap keys must be of type String: " + a2, new Object[0]);
                        }
                        throw m25282a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m25282a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m25282a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C6610n) {
                if (this.f18434p) {
                    C6610n nVar = (C6610n) annotation;
                    this.f18426h = true;
                    String value5 = nVar.value();
                    Class<?> c7 = C6656t.m25309c(type);
                    if (!value5.isEmpty()) {
                        Headers of = Headers.m25936of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", nVar.encoding());
                        if (Iterable.class.isAssignableFrom(c7)) {
                            if (type instanceof ParameterizedType) {
                                Type a3 = C6656t.m25297a(0, (ParameterizedType) type);
                                if (!MultipartBody.Part.class.isAssignableFrom(C6656t.m25309c(a3))) {
                                    return new C6631m.C6636e(of, this.f18419a.mo17060a(a3, annotationArr, this.f18421c)).mo17029b();
                                }
                                throw m25282a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw m25282a(i, c7.getSimpleName() + " must include generic type (e.g., " + c7.getSimpleName() + "<String>)", new Object[0]);
                        } else if (c7.isArray()) {
                            Class<?> a4 = C6654s.m25276a(c7.getComponentType());
                            if (!MultipartBody.Part.class.isAssignableFrom(a4)) {
                                return new C6631m.C6636e(of, this.f18419a.mo17060a((Type) a4, annotationArr, this.f18421c)).mo17028a();
                            }
                            throw m25282a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!MultipartBody.Part.class.isAssignableFrom(c7)) {
                            return new C6631m.C6636e(of, this.f18419a.mo17060a(type, annotationArr, this.f18421c));
                        } else {
                            throw m25282a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(c7)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw m25282a(i, c7.getSimpleName() + " must include generic type (e.g., " + c7.getSimpleName() + "<String>)", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(C6656t.m25309c(C6656t.m25297a(0, (ParameterizedType) type)))) {
                            return C6631m.C6641j.f18367a.mo17029b();
                        } else {
                            throw m25282a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (c7.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(c7.getComponentType())) {
                            return C6631m.C6641j.f18367a.mo17028a();
                        }
                        throw m25282a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (MultipartBody.Part.class.isAssignableFrom(c7)) {
                        return C6631m.C6641j.f18367a;
                    } else {
                        throw m25282a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw m25282a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C6611o) {
                if (this.f18434p) {
                    this.f18426h = true;
                    Class<?> c8 = C6656t.m25309c(type);
                    if (Map.class.isAssignableFrom(c8)) {
                        Type b3 = C6656t.m25308b(type, c8, Map.class);
                        if (b3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) b3;
                            Type a5 = C6656t.m25297a(0, parameterizedType3);
                            if (String.class == a5) {
                                Type a6 = C6656t.m25297a(1, parameterizedType3);
                                if (!MultipartBody.Part.class.isAssignableFrom(C6656t.m25309c(a6))) {
                                    return new C6631m.C6637f(this.f18419a.mo17060a(a6, annotationArr, this.f18421c), ((C6611o) annotation).encoding());
                                }
                                throw m25282a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw m25282a(i, "@PartMap keys must be of type String: " + a5, new Object[0]);
                        }
                        throw m25282a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m25282a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m25282a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C6597a)) {
                return null;
            } else {
                if (this.f18433o || this.f18434p) {
                    throw m25282a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f18427i) {
                    try {
                        C6618d a7 = this.f18419a.mo17060a(type, annotationArr, this.f18421c);
                        this.f18427i = true;
                        return new C6631m.C6632a(a7);
                    } catch (RuntimeException e) {
                        throw m25284a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m25282a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private RuntimeException m25282a(int i, String str, Object... objArr) {
            return m25283a(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private RuntimeException m25283a(String str, Object... objArr) {
            return m25285a((Throwable) null, str, objArr);
        }

        /* renamed from: a */
        private RuntimeException m25284a(Throwable th, int i, String str, Object... objArr) {
            return m25285a(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private RuntimeException m25285a(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f18420b.getDeclaringClass().getSimpleName() + "." + this.f18420b.getName(), th);
        }

        /* renamed from: a */
        private Headers m25286a(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m25283a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse != null) {
                        this.f18437s = parse;
                    } else {
                        throw m25283a("Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: a */
        private void m25287a(int i, String str) {
            if (!C6654s.f18406b.matcher(str).matches()) {
                throw m25282a(i, "@Path parameter name must match %s. Found: %s", C6654s.f18405a.pattern(), str);
            } else if (!this.f18438t.contains(str)) {
                throw m25282a(i, "URL \"%s\" does not contain \"{%s}\".", this.f18435q, str);
            }
        }

        /* renamed from: a */
        private void m25288a(String str, String str2, boolean z) {
            String str3 = this.f18431m;
            if (str3 == null) {
                this.f18431m = str;
                this.f18432n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C6654s.f18405a.matcher(substring).find()) {
                            throw m25283a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f18435q = str2;
                    this.f18438t = C6654s.m25277a(str2);
                    return;
                }
                return;
            }
            throw m25283a("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private void m25289a(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof C6598b) {
                value = ((C6598b) annotation).value();
                str = HttpDelete.METHOD_NAME;
            } else if (annotation instanceof C6601e) {
                value = ((C6601e) annotation).value();
                str = HttpGet.METHOD_NAME;
            } else if (annotation instanceof C6602f) {
                m25288a(HttpHead.METHOD_NAME, ((C6602f) annotation).value(), false);
                if (!Void.class.equals(this.f18424f)) {
                    throw m25283a("HEAD method must use Void as response type.", new Object[0]);
                }
                return;
            } else {
                if (annotation instanceof C6607k) {
                    value2 = ((C6607k) annotation).value();
                    str2 = HttpPatch.METHOD_NAME;
                } else if (annotation instanceof C6608l) {
                    value2 = ((C6608l) annotation).value();
                    str2 = HttpPost.METHOD_NAME;
                } else if (annotation instanceof C6609m) {
                    value2 = ((C6609m) annotation).value();
                    str2 = HttpPut.METHOD_NAME;
                } else if (annotation instanceof C6606j) {
                    value = ((C6606j) annotation).value();
                    str = HttpOptions.METHOD_NAME;
                } else if (annotation instanceof C6603g) {
                    C6603g gVar = (C6603g) annotation;
                    m25288a(gVar.method(), gVar.path(), gVar.hasBody());
                    return;
                } else if (annotation instanceof C6605i) {
                    String[] value3 = ((C6605i) annotation).value();
                    if (value3.length != 0) {
                        this.f18436r = m25286a(value3);
                        return;
                    }
                    throw m25283a("@Headers annotation is empty.", new Object[0]);
                } else {
                    return;
                }
                m25288a(str2, value2, true);
                return;
            }
            m25288a(str, value, false);
        }

        /* renamed from: b */
        private C6616c<?> m25290b() {
            Type genericReturnType = this.f18420b.getGenericReturnType();
            if (C6656t.m25310d(genericReturnType)) {
                throw m25283a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f18419a.mo17057a(genericReturnType, this.f18420b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m25285a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m25283a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: c */
        private C6618d<ResponseBody, T> m25291c() {
            try {
                return this.f18419a.mo17064b(this.f18424f, this.f18420b.getAnnotations());
            } catch (RuntimeException e) {
                throw m25285a((Throwable) e, "Unable to create converter for %s", this.f18424f);
            }
        }

        /* renamed from: a */
        public C6654s mo17076a() {
            this.f18441w = m25290b();
            this.f18424f = this.f18441w.mo15712a();
            Type type = this.f18424f;
            if (type == C6650p.class || type == Response.class) {
                throw m25283a("'" + C6656t.m25309c(this.f18424f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.f18440v = m25291c();
            for (Annotation a : this.f18421c) {
                m25289a(a);
            }
            if (this.f18431m != null) {
                if (!this.f18432n) {
                    if (this.f18434p) {
                        throw m25283a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f18433o) {
                        throw m25283a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f18422d.length;
                this.f18439u = new C6631m[length];
                int i = 0;
                while (i < length) {
                    Type type2 = this.f18423e[i];
                    if (!C6656t.m25310d(type2)) {
                        Annotation[] annotationArr = this.f18422d[i];
                        if (annotationArr != null) {
                            this.f18439u[i] = m25280a(i, type2, annotationArr);
                            i++;
                        } else {
                            throw m25282a(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m25282a(i, "Parameter type must not include a type variable or wildcard: %s", type2);
                    }
                }
                if (this.f18435q == null && !this.f18430l) {
                    throw m25283a("Missing either @%s URL or @Url parameter.", this.f18431m);
                } else if (!this.f18433o && !this.f18434p && !this.f18432n && this.f18427i) {
                    throw m25283a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f18433o && !this.f18425g) {
                    throw m25283a("Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f18434p || this.f18426h) {
                    return new C6654s(this);
                } else {
                    throw m25283a("Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw m25283a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C6654s(C6655a<T> aVar) {
        this.f18407c = aVar.f18419a.mo17065b();
        this.f18408d = aVar.f18441w;
        this.f18409e = aVar.f18419a.mo17063a();
        this.f18410f = aVar.f18440v;
        this.f18411g = aVar.f18431m;
        this.f18412h = aVar.f18435q;
        this.f18413i = aVar.f18436r;
        this.f18414j = aVar.f18437s;
        this.f18415k = aVar.f18432n;
        this.f18416l = aVar.f18433o;
        this.f18417m = aVar.f18434p;
        this.f18418n = aVar.f18439u;
    }

    /* renamed from: a */
    static Class<?> m25276a(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: a */
    static Set<String> m25277a(String str) {
        Matcher matcher = f18405a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo17074a(ResponseBody responseBody) {
        return this.f18410f.mo16985a(responseBody);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Request mo17075a(Object... objArr) {
        C6648o oVar = new C6648o(this.f18411g, this.f18409e, this.f18412h, this.f18413i, this.f18414j, this.f18415k, this.f18416l, this.f18417m);
        C6631m<?>[] mVarArr = this.f18418n;
        int length = objArr != null ? objArr.length : 0;
        if (length == mVarArr.length) {
            for (int i = 0; i < length; i++) {
                mVarArr[i].mo17027a(oVar, objArr[i]);
            }
            return oVar.mo17040a();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + mVarArr.length + ")");
    }
}
