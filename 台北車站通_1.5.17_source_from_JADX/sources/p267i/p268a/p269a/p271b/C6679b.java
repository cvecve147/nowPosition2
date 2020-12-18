package p267i.p268a.p269a.p271b;

import android.os.Bundle;
import okhttp3.Callback;
import p267i.p274b.p277b.p278a.C6707b;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: i.a.a.b.b */
public class C6679b extends C6707b {
    private C6679b(String str, Bundle bundle, C6707b.C6708a aVar, Callback callback) {
        super(str, bundle, aVar, callback, 15);
    }

    /* renamed from: a */
    private static Bundle m25386a(String str) {
        if (str == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("last_updated_at", str);
        bundle.putString("mode", "app");
        return bundle;
    }

    /* renamed from: a */
    public static C6679b m25387a(Callback callback, String str, Bundle bundle) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/user_trace", bundle, C6707b.C6708a.POST, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: a */
    public static C6679b m25388a(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/maps?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: a */
    public static C6679b m25389a(Callback callback, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("app_id", str);
        bundle.putString("api_key", str2);
        bundle.putString("app_name", str3);
        return new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/api_token", bundle, C6707b.C6708a.POST, callback);
    }

    /* renamed from: a */
    public static C6679b m25390a(Callback callback, String str, String str2, C7112l.C7119g gVar) {
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str2);
        bundle.putString("map_id", gVar.f19617n);
        bundle.putFloat("ori_x", gVar.f19616m.x);
        bundle.putFloat("ori_y", gVar.f19616m.y);
        bundle.putString("beacon_id", gVar.f19613j);
        bundle.putInt("beacon_power", gVar.f18684i);
        return m25387a(callback, str, bundle);
    }

    /* renamed from: b */
    public static C6679b m25391b(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/beacons?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: c */
    public static C6679b m25392c(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/nodes?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: d */
    public static C6679b m25393d(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/node_links?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: e */
    public static C6679b m25394e(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/stores?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }

    /* renamed from: f */
    public static C6679b m25395f(Callback callback, String str, String str2) {
        C6679b bVar = new C6679b("https://app-ol.tpestn.askeycloudapi.com/api/v1/facilities?limit=-1", m25386a(str2), C6707b.C6708a.GET, callback);
        bVar.mo17159a("token", str);
        return bVar;
    }
}
