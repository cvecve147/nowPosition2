package com.askey.taipeinavi.p053a;

import android.os.Bundle;
import okhttp3.Callback;
import p267i.p274b.p275a.C6697b;

/* renamed from: com.askey.taipeinavi.a.c */
public class C1182c extends C6697b {
    private C1182c(String str, Bundle bundle, C6697b.C6698a aVar, Callback callback) {
        super(str, bundle, aVar, callback, 15);
    }

    /* renamed from: a */
    public static C1182c m5937a(Callback callback, String str, Bundle bundle) {
        C1182c cVar = new C1182c("https://app-ol.tpestn.askeycloudapi.com/api/v1/uupon_bind", bundle, C6697b.C6698a.POST, callback);
        cVar.mo17149a("token", str);
        return cVar;
    }

    /* renamed from: a */
    public static C1182c m5938a(Callback callback, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("app_id", str);
        bundle.putString("api_key", str2);
        bundle.putString("app_name", str3);
        return new C1182c("https://app-ol.tpestn.askeycloudapi.com/api/v1/api_token", bundle, C6697b.C6698a.POST, callback);
    }

    /* renamed from: b */
    public static C1182c m5939b(Callback callback, String str, Bundle bundle) {
        C1182c cVar = new C1182c("https://app-ol.tpestn.askeycloudapi.com/api/v1/uupon_point", bundle, C6697b.C6698a.POST, callback);
        cVar.mo17149a("token", str);
        return cVar;
    }
}
