package com.openlife.checkme.p094d;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.openlife.checkme.d.a */
public class C4938a {

    /* renamed from: a */
    Context f14107a;

    public C4938a(Context context) {
        this.f14107a = context;
    }

    /* renamed from: a */
    public static String m19448a(Context context) {
        return context.getSharedPreferences("member_prefs", 0).getString("MEMBER_ACCOUNT", "");
    }

    /* renamed from: a */
    public static void m19449a(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_VENDOR_ID", str);
        edit.apply();
    }

    /* renamed from: b */
    public static String m19450b(Context context) {
        return context.getSharedPreferences("member_prefs", 0).getString("MEMBER_INVITECODE", "");
    }

    /* renamed from: c */
    public static String m19451c(Context context) {
        return context.getSharedPreferences("member_prefs", 0).getString("MEMBER_POINT", "0");
    }

    /* renamed from: d */
    public static boolean m19452d(Context context) {
        return context.getSharedPreferences("member_prefs", 0).getBoolean("IS_LOGIN", false);
    }

    /* renamed from: a */
    public String mo13476a() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_ACCOUNT", "");
    }

    /* renamed from: a */
    public void mo13477a(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_ACCOUNT", str);
        edit.apply();
    }

    /* renamed from: b */
    public String mo13478b() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_EMAIL", "");
    }

    /* renamed from: b */
    public void mo13479b(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_EMAIL", str);
        edit.apply();
    }

    /* renamed from: c */
    public String mo13480c() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_FB_TOKEN", "");
    }

    /* renamed from: c */
    public void mo13481c(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_FB_TOKEN", str);
        edit.apply();
    }

    /* renamed from: d */
    public String mo13482d() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_FB_UID", "");
    }

    /* renamed from: d */
    public void mo13483d(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_FB_UID", str);
        edit.apply();
    }

    /* renamed from: e */
    public String mo13484e() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_GENDER", "");
    }

    /* renamed from: e */
    public void mo13485e(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_GENDER", str);
        edit.apply();
    }

    /* renamed from: f */
    public String mo13486f() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_INVITECODE", "");
    }

    /* renamed from: f */
    public void mo13487f(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_INVITECODE", str);
        edit.apply();
    }

    /* renamed from: g */
    public String mo13488g() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_NAME", "");
    }

    /* renamed from: g */
    public void mo13489g(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_NAME", str);
        edit.apply();
    }

    /* renamed from: h */
    public String mo13490h() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_POINT", "0");
    }

    /* renamed from: h */
    public void mo13491h(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_POINT", str);
        edit.apply();
    }

    /* renamed from: i */
    public String mo13492i() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_USER_TOKEN", "");
    }

    /* renamed from: i */
    public void mo13493i(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_USER_TOKEN", str);
        edit.apply();
    }

    /* renamed from: j */
    public String mo13494j() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getString("MEMBER_VENDOR_ID", "");
    }

    /* renamed from: j */
    public void mo13495j(String str) {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putString("MEMBER_VENDOR_ID", str);
        edit.apply();
    }

    /* renamed from: k */
    public boolean mo13496k() {
        return this.f14107a.getSharedPreferences("member_prefs", 0).getBoolean("IS_LOGIN", false);
    }

    /* renamed from: l */
    public void mo13497l() {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putBoolean("IS_LOGIN", true);
        edit.apply();
    }

    /* renamed from: m */
    public void mo13498m() {
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putBoolean("IS_LOGIN", false);
        edit.clear();
        edit.apply();
        C4939b.m19477a(this.f14107a);
    }

    /* renamed from: n */
    public boolean mo13499n() {
        if (!this.f14107a.getSharedPreferences("member_prefs", 0).getBoolean("ACCOUNT_WARNNING", true)) {
            return false;
        }
        SharedPreferences.Editor edit = this.f14107a.getSharedPreferences("member_prefs", 0).edit();
        edit.putBoolean("ACCOUNT_WARNNING", false);
        edit.apply();
        return true;
    }
}
