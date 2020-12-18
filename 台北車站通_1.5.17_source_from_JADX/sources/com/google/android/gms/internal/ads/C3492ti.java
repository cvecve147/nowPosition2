package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ti */
public final class C3492ti {

    /* renamed from: a */
    public final String f10257a;

    /* renamed from: b */
    public final Uri f10258b;

    /* renamed from: c */
    private final String f10259c;

    /* renamed from: d */
    public final Map<String, String> f10260d;

    @TargetApi(21)
    public C3492ti(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public C3492ti(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private C3492ti(String str, Uri uri, String str2, Map<String, String> map) {
        this.f10257a = str;
        this.f10258b = uri;
        this.f10259c = str2 == null ? HttpGet.METHOD_NAME : str2;
        this.f10260d = map == null ? Collections.emptyMap() : map;
    }
}
