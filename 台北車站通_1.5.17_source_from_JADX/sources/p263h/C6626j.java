package p263h;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* renamed from: h.j */
final class C6626j<T> implements C6596b<T> {

    /* renamed from: a */
    private final C6654s<T> f18335a;

    /* renamed from: b */
    private final Object[] f18336b;

    /* renamed from: c */
    private volatile boolean f18337c;

    /* renamed from: d */
    private Call f18338d;

    /* renamed from: e */
    private Throwable f18339e;

    /* renamed from: f */
    private boolean f18340f;

    /* renamed from: h.j$a */
    static final class C6627a extends ResponseBody {

        /* renamed from: a */
        private final ResponseBody f18341a;

        /* renamed from: b */
        IOException f18342b;

        C6627a(ResponseBody responseBody) {
            this.f18341a = responseBody;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17021a() {
            IOException iOException = this.f18342b;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f18341a.close();
        }

        public long contentLength() {
            return this.f18341a.contentLength();
        }

        public MediaType contentType() {
            return this.f18341a.contentType();
        }

        public BufferedSource source() {
            return Okio.buffer((Source) new C6625i(this, this.f18341a.source()));
        }
    }

    /* renamed from: h.j$b */
    static final class C6628b extends ResponseBody {

        /* renamed from: a */
        private final MediaType f18343a;

        /* renamed from: b */
        private final long f18344b;

        C6628b(MediaType mediaType, long j) {
            this.f18343a = mediaType;
            this.f18344b = j;
        }

        public long contentLength() {
            return this.f18344b;
        }

        public MediaType contentType() {
            return this.f18343a;
        }

        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C6626j(C6654s<T> sVar, Object[] objArr) {
        this.f18335a = sVar;
        this.f18336b = objArr;
    }

    /* renamed from: a */
    private Call m25206a() {
        Call newCall = this.f18335a.f18407c.newCall(this.f18335a.mo17075a(this.f18336b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6650p<T> mo17020a(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C6628b(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return C6650p.m25252a(C6656t.m25301a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            return C6650p.m25251a(null, build);
        } else {
            C6627a aVar = new C6627a(body);
            try {
                return C6650p.m25251a(this.f18335a.mo17074a((ResponseBody) aVar), build);
            } catch (RuntimeException e) {
                aVar.mo17021a();
                throw e;
            }
        }
    }

    public void cancel() {
        Call call;
        this.f18337c = true;
        synchronized (this) {
            call = this.f18338d;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public C6626j<T> clone() {
        return new C6626j<>(this.f18335a, this.f18336b);
    }

    public C6650p<T> execute() {
        Call call;
        synchronized (this) {
            if (!this.f18340f) {
                this.f18340f = true;
                if (this.f18339e == null) {
                    call = this.f18338d;
                    if (call == null) {
                        try {
                            call = m25206a();
                            this.f18338d = call;
                        } catch (IOException | RuntimeException e) {
                            this.f18339e = e;
                            throw e;
                        }
                    }
                } else if (this.f18339e instanceof IOException) {
                    throw ((IOException) this.f18339e);
                } else {
                    throw ((RuntimeException) this.f18339e);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f18337c) {
            call.cancel();
        }
        return mo17020a(call.execute());
    }

    public boolean isCanceled() {
        return this.f18337c;
    }
}
