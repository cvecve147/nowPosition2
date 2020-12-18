package com.openlife.checkme.p094d;

import android.content.Context;
import android.content.SharedPreferences;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;

/* renamed from: com.openlife.checkme.d.i */
public class C4946i {

    /* renamed from: a */
    private Context f14116a;

    public C4946i(Context context) {
        this.f14116a = context;
    }

    /* renamed from: a */
    public static String m19501a(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getString("FREQUENTLY_ASKED_QUESTIONS", "");
    }

    /* renamed from: b */
    public static String m19502b(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getString("CUSTOMER_SERVICE_EMAIL", "");
    }

    /* renamed from: c */
    public static String m19503c(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getString("ABOUT_US", "");
    }

    /* renamed from: d */
    public static String m19504d(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getString("TERMS_OF_SERVICE", "");
    }

    /* renamed from: e */
    public static String m19505e(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getString("PRIVACY_POLICY", "");
    }

    /* renamed from: f */
    public static int m19506f(Context context) {
        return context.getSharedPreferences("config_prefs", 0).getInt("APP_LOGIN_TYPE", -1);
    }

    /* renamed from: a */
    public int mo13521a() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("MIGRATE_TIME", 2);
    }

    /* renamed from: a */
    public void mo13522a(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("MIGRATE_TIME", i);
        edit.apply();
    }

    /* renamed from: a */
    public void mo13523a(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("FREQUENTLY_ASKED_QUESTIONS", str);
        edit.apply();
    }

    /* renamed from: b */
    public int mo13524b() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("CHANGE_ACCOUNT_TIME", 2);
    }

    /* renamed from: b */
    public void mo13525b(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("CHANGE_ACCOUNT_TIME", i);
        edit.apply();
    }

    /* renamed from: b */
    public void mo13526b(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("CUSTOMER_SERVICE_EMAIL", str);
        edit.apply();
    }

    /* renamed from: c */
    public int mo13527c() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("APP_LOGIN_TYPE", -1);
    }

    /* renamed from: c */
    public void mo13528c(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("APP_LOGIN_TYPE", i);
        edit.apply();
    }

    /* renamed from: c */
    public void mo13529c(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("ABOUT_US", str);
        edit.apply();
    }

    /* renamed from: d */
    public String mo13530d() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getString("APP_SRC", "1");
    }

    /* renamed from: d */
    public void mo13531d(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("APP_MAIN_COLOR", i);
        edit.apply();
    }

    /* renamed from: d */
    public void mo13532d(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("TERMS_OF_SERVICE", str);
        edit.apply();
    }

    /* renamed from: e */
    public String mo13533e() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getString("APP_LANGUAGE", "zh");
    }

    /* renamed from: e */
    public void mo13534e(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("APP_NOTIFICATION_LARGE_ICON", i);
        edit.apply();
    }

    /* renamed from: e */
    public void mo13535e(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("PRIVACY_POLICY", str);
        edit.apply();
    }

    /* renamed from: f */
    public int mo13536f() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("APP_MAIN_COLOR", C4948e.cyan);
    }

    /* renamed from: f */
    public void mo13537f(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("APP_NOTIFICATION_SMALL_ICON", i);
        edit.apply();
    }

    /* renamed from: f */
    public void mo13538f(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("APP_SRC", str);
        edit.apply();
    }

    /* renamed from: g */
    public String mo13539g() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getString("APP_AD_NOTIFICATION_CLASS", (String) null);
    }

    /* renamed from: g */
    public void mo13540g(int i) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putInt("APP_NOTIFICATION_TITLE", i);
        edit.apply();
    }

    /* renamed from: g */
    public void mo13541g(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("APP_LANGUAGE", str);
        edit.apply();
    }

    /* renamed from: h */
    public String mo13542h() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getString("APP_VENDOR", "OPENLIFE");
    }

    /* renamed from: h */
    public void mo13543h(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("APP_AD_NOTIFICATION_CLASS", str);
        edit.apply();
    }

    /* renamed from: i */
    public String mo13544i() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getString("APP_KEY", "Open0620Liiife$");
    }

    /* renamed from: i */
    public void mo13545i(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("APP_VENDOR", str);
        edit.apply();
    }

    /* renamed from: j */
    public int mo13546j() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("APP_NOTIFICATION_LARGE_ICON", C4959j.app_icon);
    }

    /* renamed from: j */
    public void mo13547j(String str) {
        SharedPreferences.Editor edit = this.f14116a.getSharedPreferences("config_prefs", 0).edit();
        edit.putString("APP_KEY", str);
        edit.apply();
    }

    /* renamed from: k */
    public int mo13548k() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("APP_NOTIFICATION_SMALL_ICON", C4959j.android_notification_icon_small);
    }

    /* renamed from: l */
    public int mo13549l() {
        return this.f14116a.getSharedPreferences("config_prefs", 0).getInt("APP_NOTIFICATION_TITLE", C4961l.notification_title);
    }
}
