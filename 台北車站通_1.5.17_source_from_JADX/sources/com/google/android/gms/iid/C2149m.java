package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.iid.m */
public final class C2149m {

    /* renamed from: a */
    private SharedPreferences f6639a;

    /* renamed from: b */
    private Context f6640b;

    /* renamed from: c */
    private final C2154r f6641c;

    /* renamed from: d */
    private final Map<String, C2155s> f6642d;

    public C2149m(Context context) {
        this(context, new C2154r());
    }

    private C2149m(Context context, C2154r rVar) {
        this.f6642d = new C1080b();
        this.f6640b = context;
        this.f6639a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6641c = rVar;
        File file = new File(C1006a.m5388a(this.f6640b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo7772a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    C2138b.m9238a(this.f6640b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    /* renamed from: a */
    static String m9260a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m9261b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized String mo7769a(String str) {
        return this.f6639a.getString(str, (String) null);
    }

    /* renamed from: a */
    public final synchronized String mo7770a(String str, String str2, String str3) {
        return this.f6639a.getString(m9261b(str, str2, str3), (String) null);
    }

    /* renamed from: a */
    public final synchronized void mo7771a(String str, String str2, String str3, String str4, String str5) {
        String b = m9261b(str, str2, str3);
        SharedPreferences.Editor edit = this.f6639a.edit();
        edit.putString(b, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* renamed from: a */
    public final boolean mo7772a() {
        return this.f6639a.getAll().isEmpty();
    }

    /* renamed from: b */
    public final synchronized C2155s mo7773b(String str) {
        C2155s sVar;
        C2155s sVar2 = this.f6642d.get(str);
        if (sVar2 != null) {
            return sVar2;
        }
        try {
            sVar = this.f6641c.mo7776a(this.f6640b, str);
        } catch (C2156t unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            C2138b.m9238a(this.f6640b, this);
            sVar = this.f6641c.mo7777b(this.f6640b, str);
        }
        this.f6642d.put(str, sVar);
        return sVar;
    }

    /* renamed from: b */
    public final synchronized void mo7774b() {
        this.f6642d.clear();
        C2154r.m9274a(this.f6640b);
        this.f6639a.edit().clear().commit();
    }
}
