package p263h;

import java.io.IOException;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: h.m */
abstract class C6631m<T> {

    /* renamed from: h.m$a */
    static final class C6632a<T> extends C6631m<T> {

        /* renamed from: a */
        private final C6618d<T, RequestBody> f18347a;

        C6632a(C6618d<T, RequestBody> dVar) {
            this.f18347a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                try {
                    oVar.mo17045a(this.f18347a.mo16985a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: h.m$b */
    static final class C6633b<T> extends C6631m<T> {

        /* renamed from: a */
        private final String f18348a;

        /* renamed from: b */
        private final C6618d<T, String> f18349b;

        /* renamed from: c */
        private final boolean f18350c;

        C6633b(String str, C6618d<T, String> dVar, boolean z) {
            C6656t.m25296a(str, "name == null");
            this.f18348a = str;
            this.f18349b = dVar;
            this.f18350c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                oVar.mo17042a(this.f18348a, this.f18349b.mo16985a(t), this.f18350c);
            }
        }
    }

    /* renamed from: h.m$c */
    static final class C6634c<T> extends C6631m<Map<String, T>> {

        /* renamed from: a */
        private final C6618d<T, String> f18351a;

        /* renamed from: b */
        private final boolean f18352b;

        C6634c(C6618d<T, String> dVar, boolean z) {
            this.f18351a = dVar;
            this.f18352b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            oVar.mo17042a(str, this.f18351a.mo16985a(value), this.f18352b);
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: h.m$d */
    static final class C6635d<T> extends C6631m<T> {

        /* renamed from: a */
        private final String f18353a;

        /* renamed from: b */
        private final C6618d<T, String> f18354b;

        C6635d(String str, C6618d<T, String> dVar) {
            C6656t.m25296a(str, "name == null");
            this.f18353a = str;
            this.f18354b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                oVar.mo17041a(this.f18353a, this.f18354b.mo16985a(t));
            }
        }
    }

    /* renamed from: h.m$e */
    static final class C6636e<T> extends C6631m<T> {

        /* renamed from: a */
        private final Headers f18355a;

        /* renamed from: b */
        private final C6618d<T, RequestBody> f18356b;

        C6636e(Headers headers, C6618d<T, RequestBody> dVar) {
            this.f18355a = headers;
            this.f18356b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                try {
                    oVar.mo17043a(this.f18355a, this.f18356b.mo16985a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: h.m$f */
    static final class C6637f<T> extends C6631m<Map<String, T>> {

        /* renamed from: a */
        private final C6618d<T, RequestBody> f18357a;

        /* renamed from: b */
        private final String f18358b;

        C6637f(C6618d<T, RequestBody> dVar, String str) {
            this.f18357a = dVar;
            this.f18358b = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            oVar.mo17043a(Headers.m25936of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f18358b), this.f18357a.mo16985a(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: h.m$g */
    static final class C6638g<T> extends C6631m<T> {

        /* renamed from: a */
        private final String f18359a;

        /* renamed from: b */
        private final C6618d<T, String> f18360b;

        /* renamed from: c */
        private final boolean f18361c;

        C6638g(String str, C6618d<T, String> dVar, boolean z) {
            C6656t.m25296a(str, "name == null");
            this.f18359a = str;
            this.f18360b = dVar;
            this.f18361c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                oVar.mo17046b(this.f18359a, this.f18360b.mo16985a(t), this.f18361c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f18359a + "\" value must not be null.");
        }
    }

    /* renamed from: h.m$h */
    static final class C6639h<T> extends C6631m<T> {

        /* renamed from: a */
        private final String f18362a;

        /* renamed from: b */
        private final C6618d<T, String> f18363b;

        /* renamed from: c */
        private final boolean f18364c;

        C6639h(String str, C6618d<T, String> dVar, boolean z) {
            C6656t.m25296a(str, "name == null");
            this.f18362a = str;
            this.f18363b = dVar;
            this.f18364c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, T t) {
            if (t != null) {
                oVar.mo17047c(this.f18362a, this.f18363b.mo16985a(t), this.f18364c);
            }
        }
    }

    /* renamed from: h.m$i */
    static final class C6640i<T> extends C6631m<Map<String, T>> {

        /* renamed from: a */
        private final C6618d<T, String> f18365a;

        /* renamed from: b */
        private final boolean f18366b;

        C6640i(C6618d<T, String> dVar, boolean z) {
            this.f18365a = dVar;
            this.f18366b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            oVar.mo17047c(str, this.f18365a.mo16985a(value), this.f18366b);
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: h.m$j */
    static final class C6641j extends C6631m<MultipartBody.Part> {

        /* renamed from: a */
        static final C6641j f18367a = new C6641j();

        private C6641j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17027a(C6648o oVar, MultipartBody.Part part) {
            if (part != null) {
                oVar.mo17044a(part);
            }
        }
    }

    C6631m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6631m<Object> mo17028a() {
        return new C6630l(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo17027a(C6648o oVar, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6631m<Iterable<T>> mo17029b() {
        return new C6629k(this);
    }
}
