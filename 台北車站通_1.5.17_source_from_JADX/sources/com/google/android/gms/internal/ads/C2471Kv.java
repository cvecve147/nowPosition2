package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Kv */
final class C2471Kv implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3370pa f7479a;

    /* renamed from: b */
    final /* synthetic */ C2443Jv f7480b;

    C2471Kv(C2443Jv jv, C3370pa paVar) {
        this.f7480b = jv;
        this.f7479a = paVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3520uh uhVar = (C3520uh) this.f7480b.f7389a.get();
        if (uhVar == null) {
            this.f7479a.mo9854a("/loadHtml", this);
            return;
        }
        uhVar.mo8182mb().mo9230a((C3003ci) new C2501Lv(this, map, this.f7479a));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            uhVar.loadData(str, "text/html", HTTP.UTF_8);
        } else {
            uhVar.loadDataWithBaseURL(str2, str, "text/html", HTTP.UTF_8, (String) null);
        }
    }
}
