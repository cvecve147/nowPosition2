package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.zc */
final class C3658zc extends C2828Xc {

    /* renamed from: a */
    private final C3634yh f10644a;

    C3658zc(C3634yh yhVar) {
        this.f10644a = yhVar;
    }

    /* renamed from: b */
    public final C2860Yg mo9022b(C2216Bw<?> bw, Map<String, String> map) {
        try {
            HttpResponse a = this.f10644a.mo9021a(bw, map);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C2589Ot(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new C2860Yg(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C2860Yg(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
