package p208e.p209a.p210a.p211a.p212a.p218e;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;

/* renamed from: e.a.a.a.a.e.g */
class C6155g implements C6149f.C6151b {
    C6155g() {
    }

    /* renamed from: a */
    public HttpURLConnection mo16223a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    public HttpURLConnection mo16224a(URL url, Proxy proxy) {
        return (HttpURLConnection) url.openConnection(proxy);
    }
}
