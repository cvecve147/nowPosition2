package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p263h.C6586a;
import p263h.C6616c;
import p263h.C6618d;
import p263h.C6654s;

/* renamed from: h.r */
public final class C6652r {

    /* renamed from: a */
    private final Map<Method, C6654s> f18391a = new LinkedHashMap();

    /* renamed from: b */
    private final Call.Factory f18392b;

    /* renamed from: c */
    private final HttpUrl f18393c;

    /* renamed from: d */
    private final List<C6618d.C6619a> f18394d;

    /* renamed from: e */
    private final List<C6616c.C6617a> f18395e;

    /* renamed from: f */
    private final Executor f18396f;

    /* renamed from: g */
    private final boolean f18397g;

    /* renamed from: h.r$a */
    public static final class C6653a {

        /* renamed from: a */
        private C6642n f18398a;

        /* renamed from: b */
        private Call.Factory f18399b;

        /* renamed from: c */
        private HttpUrl f18400c;

        /* renamed from: d */
        private List<C6618d.C6619a> f18401d;

        /* renamed from: e */
        private List<C6616c.C6617a> f18402e;

        /* renamed from: f */
        private Executor f18403f;

        /* renamed from: g */
        private boolean f18404g;

        public C6653a() {
            this(C6642n.m25229b());
        }

        C6653a(C6642n nVar) {
            this.f18401d = new ArrayList();
            this.f18402e = new ArrayList();
            this.f18398a = nVar;
            this.f18401d.add(new C6586a());
        }

        /* renamed from: a */
        public C6653a mo17067a(C6616c.C6617a aVar) {
            List<C6616c.C6617a> list = this.f18402e;
            C6656t.m25296a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C6653a mo17068a(C6618d.C6619a aVar) {
            List<C6618d.C6619a> list = this.f18401d;
            C6656t.m25296a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C6653a mo17069a(String str) {
            C6656t.m25296a(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                mo17071a(parse);
                return this;
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        /* renamed from: a */
        public C6653a mo17070a(Call.Factory factory) {
            C6656t.m25296a(factory, "factory == null");
            this.f18399b = factory;
            return this;
        }

        /* renamed from: a */
        public C6653a mo17071a(HttpUrl httpUrl) {
            C6656t.m25296a(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f18400c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: a */
        public C6653a mo17072a(OkHttpClient okHttpClient) {
            C6656t.m25296a(okHttpClient, "client == null");
            mo17070a((Call.Factory) okHttpClient);
            return this;
        }

        /* renamed from: a */
        public C6652r mo17073a() {
            if (this.f18400c != null) {
                Call.Factory factory = this.f18399b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f18403f;
                if (executor == null) {
                    executor = this.f18398a.mo17036a();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f18402e);
                arrayList.add(this.f18398a.mo17034a(executor2));
                return new C6652r(factory2, this.f18400c, new ArrayList(this.f18401d), arrayList, executor2, this.f18404g);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    C6652r(Call.Factory factory, HttpUrl httpUrl, List<C6618d.C6619a> list, List<C6616c.C6617a> list2, Executor executor, boolean z) {
        this.f18392b = factory;
        this.f18393c = httpUrl;
        this.f18394d = Collections.unmodifiableList(list);
        this.f18395e = Collections.unmodifiableList(list2);
        this.f18396f = executor;
        this.f18397g = z;
    }

    /* renamed from: b */
    private void m25257b(Class<?> cls) {
        C6642n b = C6642n.m25229b();
        for (Method method : cls.getDeclaredMethods()) {
            if (!b.mo17037a(method)) {
                mo17061a(method);
            }
        }
    }

    /* renamed from: a */
    public C6616c<?> mo17056a(C6616c.C6617a aVar, Type type, Annotation[] annotationArr) {
        C6656t.m25296a(type, "returnType == null");
        C6656t.m25296a(annotationArr, "annotations == null");
        int indexOf = this.f18395e.indexOf(aVar) + 1;
        int size = this.f18395e.size();
        for (int i = indexOf; i < size; i++) {
            C6616c<?> a = this.f18395e.get(i).mo15713a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f18395e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f18395e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f18395e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C6616c<?> mo17057a(Type type, Annotation[] annotationArr) {
        return mo17056a((C6616c.C6617a) null, type, annotationArr);
    }

    /* renamed from: a */
    public <T> C6618d<ResponseBody, T> mo17058a(C6618d.C6619a aVar, Type type, Annotation[] annotationArr) {
        C6656t.m25296a(type, "type == null");
        C6656t.m25296a(annotationArr, "annotations == null");
        int indexOf = this.f18394d.indexOf(aVar) + 1;
        int size = this.f18394d.size();
        for (int i = indexOf; i < size; i++) {
            C6618d<ResponseBody, ?> a = this.f18394d.get(i).mo16982a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f18394d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f18394d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f18394d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C6618d<T, RequestBody> mo17059a(C6618d.C6619a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C6656t.m25296a(type, "type == null");
        C6656t.m25296a(annotationArr, "parameterAnnotations == null");
        C6656t.m25296a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f18394d.indexOf(aVar) + 1;
        int size = this.f18394d.size();
        for (int i = indexOf; i < size; i++) {
            C6618d<?, RequestBody> a = this.f18394d.get(i).mo16983a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f18394d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f18394d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f18394d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C6618d<T, RequestBody> mo17060a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo17059a((C6618d.C6619a) null, type, annotationArr, annotationArr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6654s mo17061a(Method method) {
        C6654s sVar;
        synchronized (this.f18391a) {
            sVar = this.f18391a.get(method);
            if (sVar == null) {
                sVar = new C6654s.C6655a(this, method).mo17076a();
                this.f18391a.put(method, sVar);
            }
        }
        return sVar;
    }

    /* renamed from: a */
    public <T> T mo17062a(Class<T> cls) {
        C6656t.m25302a(cls);
        if (this.f18397g) {
            m25257b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6651q(this, cls));
    }

    /* renamed from: a */
    public HttpUrl mo17063a() {
        return this.f18393c;
    }

    /* renamed from: b */
    public <T> C6618d<ResponseBody, T> mo17064b(Type type, Annotation[] annotationArr) {
        return mo17058a((C6618d.C6619a) null, type, annotationArr);
    }

    /* renamed from: b */
    public Call.Factory mo17065b() {
        return this.f18392b;
    }

    /* renamed from: c */
    public <T> C6618d<T, String> mo17066c(Type type, Annotation[] annotationArr) {
        C6656t.m25296a(type, "type == null");
        C6656t.m25296a(annotationArr, "annotations == null");
        int size = this.f18394d.size();
        for (int i = 0; i < size; i++) {
            C6618d<?, String> b = this.f18394d.get(i).mo16984b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        return C6586a.C6591e.f18317a;
    }
}
