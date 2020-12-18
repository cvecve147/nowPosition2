package p250g.p255b.p256a.p261e;

import java.io.InputStream;
import java.security.PrivilegedAction;

/* renamed from: g.b.a.e.h */
class C6564h implements PrivilegedAction<InputStream> {

    /* renamed from: a */
    final /* synthetic */ String f18270a;

    /* renamed from: b */
    final /* synthetic */ C6565i f18271b;

    C6564h(C6565i iVar, String str) {
        this.f18271b = iVar;
        this.f18270a = str;
    }

    public InputStream run() {
        return this.f18271b.f18274c != null ? this.f18271b.f18274c.getResourceAsStream(this.f18270a) : ClassLoader.getSystemResourceAsStream(this.f18270a);
    }
}
