package com.openlife.checkme.p097f;

import android.os.Build;
import com.openlife.checkme.p093c.C4871b;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.openlife.checkme.f.d */
class C4954d implements Interceptor {

    /* renamed from: a */
    final /* synthetic */ C4955e f14123a;

    C4954d(C4955e eVar) {
        this.f14123a = eVar;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader("X-Client-Platform", "Android");
        newBuilder.addHeader("X-Client-Version", "3.0.17");
        newBuilder.addHeader("X-Client-Build", String.valueOf(281));
        newBuilder.addHeader("Content-Type", "application/json");
        newBuilder.addHeader("device_info", "Android_" + Build.VERSION.SDK_INT);
        newBuilder.addHeader("app_ver", C4871b.m19172a());
        newBuilder.addHeader("vendor", this.f14123a.f14127d);
        if (this.f14123a.f14126c != null) {
            newBuilder.addHeader("language", this.f14123a.f14126c);
        }
        return chain.proceed(newBuilder.build());
    }
}
