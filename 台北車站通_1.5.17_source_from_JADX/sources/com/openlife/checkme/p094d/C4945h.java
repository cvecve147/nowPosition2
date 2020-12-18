package com.openlife.checkme.p094d;

import android.content.Context;
import android.content.SharedPreferences;
import com.openlife.checkme.net.model.BeaconNotificationData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p101d.p129g.p152e.C5731p;

/* renamed from: com.openlife.checkme.d.h */
public class C4945h {

    /* renamed from: a */
    private final DateFormat f14114a = new SimpleDateFormat("yyyy/MM/dd");

    /* renamed from: b */
    private Context f14115b;

    public C4945h(Context context) {
        this.f14115b = context;
    }

    /* renamed from: a */
    public void mo13507a() {
        Date date = new Date();
        SharedPreferences.Editor edit = this.f14115b.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("TODAY", this.f14114a.format(date));
        edit.apply();
    }

    /* renamed from: a */
    public void mo13508a(Long l) {
        SharedPreferences.Editor edit = this.f14115b.getSharedPreferences("config_prefs", 0).edit();
        edit.putLong("BEACON_LIST_TIME", l.longValue());
        edit.apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13509a(java.util.List<com.openlife.checkme.net.model.BeaconNotificationData> r8) {
        /*
            r7 = this;
            d.g.e.p r0 = new d.g.e.p
            r0.<init>()
            android.content.Context r1 = r7.f14115b
            r2 = 0
            java.lang.String r3 = "config_prefs"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            java.lang.String r4 = "BEACON_AD_TODAY"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x0031
            com.openlife.checkme.d.c r5 = new com.openlife.checkme.d.c
            r5.<init>(r7)
            java.lang.reflect.Type r5 = r5.mo15268b()
            java.lang.Object r1 = r0.mo15294a((java.lang.String) r1, (java.lang.reflect.Type) r5)
            r5 = r1
            java.util.List r5 = (java.util.List) r5
        L_0x0031:
            r5.addAll(r8)
            android.content.Context r8 = r7.f14115b
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r0 = r0.mo15296a((java.lang.Object) r5)
            r8.putString(r4, r0)
            r8.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.p094d.C4945h.mo13509a(java.util.List):void");
    }

    /* renamed from: a */
    public boolean mo13510a(String str) {
        return str.equals(this.f14115b.getSharedPreferences("config_prefs", 0).getString("TODAY", ""));
    }

    /* renamed from: b */
    public String mo13511b() {
        return this.f14114a.format(new Date());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13512b(java.util.List<com.openlife.checkme.net.model.BeaconNotificationData> r8) {
        /*
            r7 = this;
            d.g.e.p r0 = new d.g.e.p
            r0.<init>()
            android.content.Context r1 = r7.f14115b
            r2 = 0
            java.lang.String r3 = "config_prefs"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            java.lang.String r4 = "NEVER_SHOW_BEACON_AD"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x0031
            com.openlife.checkme.d.e r5 = new com.openlife.checkme.d.e
            r5.<init>(r7)
            java.lang.reflect.Type r5 = r5.mo15268b()
            java.lang.Object r1 = r0.mo15294a((java.lang.String) r1, (java.lang.reflect.Type) r5)
            r5 = r1
            java.util.List r5 = (java.util.List) r5
        L_0x0031:
            r5.addAll(r8)
            android.content.Context r8 = r7.f14115b
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r0 = r0.mo15296a((java.lang.Object) r5)
            r8.putString(r4, r0)
            r8.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.p094d.C4945h.mo13512b(java.util.List):void");
    }

    /* renamed from: c */
    public void mo13513c() {
        this.f14115b.getSharedPreferences("config_prefs", 0).edit().remove("BEACONS_TODAY").commit();
    }

    /* renamed from: c */
    public void mo13514c(List<String> list) {
        C5731p pVar = new C5731p();
        SharedPreferences.Editor edit = this.f14115b.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("BEACON_LIST", pVar.mo15296a((Object) list));
        edit.apply();
    }

    /* renamed from: d */
    public List<BeaconNotificationData> mo13515d() {
        C5731p pVar = new C5731p();
        String string = this.f14115b.getSharedPreferences("config_prefs", 0).getString("BEACON_AD_TODAY", "");
        return string.isEmpty() ? new ArrayList() : (List) pVar.mo15294a(string, new C4941d(this).mo15268b());
    }

    /* renamed from: e */
    public void mo13516e() {
        this.f14115b.getSharedPreferences("config_prefs", 0).edit().remove("BEACON_AD_TODAY").commit();
    }

    /* renamed from: f */
    public List<BeaconNotificationData> mo13517f() {
        C5731p pVar = new C5731p();
        String string = this.f14115b.getSharedPreferences("config_prefs", 0).getString("NEVER_SHOW_BEACON_AD", "");
        return string.isEmpty() ? new ArrayList() : (List) pVar.mo15294a(string, new C4943f(this).mo15268b());
    }

    /* renamed from: g */
    public void mo13518g() {
        this.f14115b.getSharedPreferences("config_prefs", 0).edit().remove("NEVER_SHOW_BEACON_AD").commit();
    }

    /* renamed from: h */
    public List<String> mo13519h() {
        C5731p pVar = new C5731p();
        String string = this.f14115b.getSharedPreferences("config_prefs", 0).getString("BEACON_LIST", "");
        return string.isEmpty() ? new ArrayList() : (List) pVar.mo15294a(string, new C4944g(this).mo15268b());
    }

    /* renamed from: i */
    public Long mo13520i() {
        return Long.valueOf(this.f14115b.getSharedPreferences("config_prefs", 0).getLong("BEACON_LIST_TIME", 0));
    }
}
