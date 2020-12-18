package com.google.android.gms.auth.api.signin.p069a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.a.a */
public class C1844a {

    /* renamed from: a */
    private static final Lock f6003a = new ReentrantLock();

    /* renamed from: b */
    private static C1844a f6004b;

    /* renamed from: c */
    private final Lock f6005c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f6006d;

    private C1844a(Context context) {
        this.f6006d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C1844a m8231a(Context context) {
        C2061y.m9067a(context);
        f6003a.lock();
        try {
            if (f6004b == null) {
                f6004b = new C1844a(context.getApplicationContext());
            }
            return f6004b;
        } finally {
            f6003a.unlock();
        }
    }

    /* renamed from: a */
    private static String m8232a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private final GoogleSignInAccount m8233b(String str) {
        String a;
        if (!TextUtils.isEmpty(str) && (a = mo7212a(m8232a("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m8216a(a);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo7211a() {
        return m8233b(mo7212a("defaultGoogleSignInAccount"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo7212a(String str) {
        this.f6005c.lock();
        try {
            return this.f6006d.getString(str, (String) null);
        } finally {
            this.f6005c.unlock();
        }
    }
}
