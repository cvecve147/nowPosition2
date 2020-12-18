package com.openlife.checkme.p094d;

import android.content.Context;
import android.content.SharedPreferences;
import com.openlife.checkme.p093c.C4871b;
import java.util.Calendar;

/* renamed from: com.openlife.checkme.d.b */
public class C4939b {

    /* renamed from: a */
    private Context f14108a;

    public C4939b(Context context) {
        this.f14108a = context;
    }

    /* renamed from: a */
    public static void m19477a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("app_prefs", 0).edit();
        edit.clear();
        edit.apply();
    }

    /* renamed from: b */
    public static void m19478b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("app_prefs", 0).edit();
        edit.putLong("SHOULD_SHOW_AD_TODAY", Calendar.getInstance().getTime().getTime());
        edit.apply();
    }

    /* renamed from: c */
    public static boolean m19479c(Context context) {
        return context.getSharedPreferences("system_prefs", 0).getBoolean("APP_GUIDE", true);
    }

    /* renamed from: a */
    public void mo13500a(int i) {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("app_prefs", 0).edit();
        edit.putInt(C4871b.m19172a() + "NEED_UPDATE", i);
        edit.apply();
    }

    /* renamed from: a */
    public void mo13501a(String str) {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("app_prefs", 0).edit();
        edit.putString("UPDATE_MESSAGE", str);
        edit.apply();
    }

    /* renamed from: a */
    public void mo13502a(boolean z) {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("app_prefs", 0).edit();
        edit.putBoolean("RECEIVE_NOTIFICATION", z);
        edit.apply();
    }

    /* renamed from: a */
    public boolean mo13503a() {
        return this.f14108a.getSharedPreferences("app_prefs", 0).getBoolean("RECEIVE_NOTIFICATION", true);
    }

    /* renamed from: b */
    public void mo13504b() {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("system_prefs", 0).edit();
        edit.putBoolean("APP_GUIDE", true);
        edit.apply();
    }

    /* renamed from: b */
    public void mo13505b(String str) {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("app_prefs", 0).edit();
        edit.putString("UPDATE_URL", str);
        edit.apply();
    }

    /* renamed from: c */
    public void mo13506c() {
        SharedPreferences.Editor edit = this.f14108a.getSharedPreferences("system_prefs", 0).edit();
        edit.putBoolean("APP_GUIDE", false);
        edit.apply();
    }
}
