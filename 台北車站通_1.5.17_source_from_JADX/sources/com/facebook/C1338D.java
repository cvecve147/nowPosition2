package com.facebook;

import com.facebook.GraphRequest;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

/* renamed from: com.facebook.D */
class C1338D implements GraphRequest.C1349d {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4753a;

    /* renamed from: b */
    final /* synthetic */ GraphRequest f4754b;

    C1338D(GraphRequest graphRequest, ArrayList arrayList) {
        this.f4754b = graphRequest;
        this.f4753a = arrayList;
    }

    /* renamed from: a */
    public void mo5906a(String str, String str2) {
        this.f4753a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, HTTP.UTF_8)}));
    }
}
