package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.gms.internal.ads.Xc */
public abstract class C2828Xc implements C3634yh {
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo9021a(C2216Bw<?> bw, Map<String, String> map) {
        C2860Yg b = mo9022b(bw, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion(HttpVersion.HTTP, 1, 1), b.mo9070c(), ""));
        ArrayList arrayList = new ArrayList();
        for (C2589Ot next : b.mo9071d()) {
            arrayList.add(new BasicHeader(next.mo8649a(), next.mo8650b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a = b.mo9068a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength((long) b.mo9069b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract C2860Yg mo9022b(C2216Bw<?> bw, Map<String, String> map);
}
