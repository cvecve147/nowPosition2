package p208e.p209a.p210a.p211a.p212a.p218e;

import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p208e.p209a.p210a.p211a.C6196c;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.e.c */
public class C6146c implements C6156h {

    /* renamed from: a */
    private final C6211p f17143a;

    /* renamed from: b */
    private C6158j f17144b;

    /* renamed from: c */
    private SSLSocketFactory f17145c;

    /* renamed from: d */
    private boolean f17146d;

    public C6146c() {
        this(new C6196c());
    }

    public C6146c(C6211p pVar) {
        this.f17143a = pVar;
    }

    /* renamed from: a */
    private synchronized SSLSocketFactory m23240a() {
        if (this.f17145c == null && !this.f17146d) {
            this.f17145c = m23242b();
        }
        return this.f17145c;
    }

    /* renamed from: a */
    private boolean m23241a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m23242b() {
        SSLSocketFactory a;
        this.f17146d = true;
        try {
            a = C6157i.m23312a(this.f17144b);
            this.f17143a.mo16269d("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f17143a.mo16266b("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }

    /* renamed from: c */
    private synchronized void m23243c() {
        this.f17146d = false;
        this.f17145c = null;
    }

    /* renamed from: a */
    public C6149f mo16179a(C6147d dVar, String str, Map<String, String> map) {
        C6149f fVar;
        SSLSocketFactory a;
        int i = C6145b.f17142a[dVar.ordinal()];
        if (i == 1) {
            fVar = C6149f.m23250a((CharSequence) str, (Map<?, ?>) map, true);
        } else if (i == 2) {
            fVar = C6149f.m23254b((CharSequence) str, (Map<?, ?>) map, true);
        } else if (i == 3) {
            fVar = C6149f.m23259e((CharSequence) str);
        } else if (i == 4) {
            fVar = C6149f.m23249a((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (!(!m23241a(str) || this.f17144b == null || (a = m23240a()) == null)) {
            ((HttpsURLConnection) fVar.mo16214j()).setSSLSocketFactory(a);
        }
        return fVar;
    }

    /* renamed from: a */
    public void mo16180a(C6158j jVar) {
        if (this.f17144b != jVar) {
            this.f17144b = jVar;
            m23243c();
        }
    }
}
