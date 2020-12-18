package p208e.p209a.p210a.p211a.p212a.p218e;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: e.a.a.a.a.e.i */
public final class C6157i {
    /* renamed from: a */
    public static final SSLSocketFactory m23312a(C6158j jVar) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, new TrustManager[]{new C6159k(new C6160l(jVar.mo14772b(), jVar.mo14771a()), jVar)}, (SecureRandom) null);
        return instance.getSocketFactory();
    }
}
