package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2092n;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import p101d.p129g.p149d.C5574a;

/* renamed from: com.google.firebase.iid.e */
public final class C4074e {

    /* renamed from: a */
    private final Context f12079a;

    /* renamed from: b */
    private String f12080b;

    /* renamed from: c */
    private String f12081c;

    /* renamed from: d */
    private int f12082d;

    /* renamed from: e */
    private int f12083e = 0;

    public C4074e(Context context) {
        this.f12079a = context;
    }

    /* renamed from: a */
    private final PackageInfo m16302a(String str) {
        try {
            return this.f12079a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m16303a(C5574a aVar) {
        String b = aVar.mo15066d().mo15074b();
        if (b != null) {
            return b;
        }
        String a = aVar.mo15066d().mo15073a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m16304a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: e */
    private final synchronized void m16305e() {
        PackageInfo a = m16302a(this.f12079a.getPackageName());
        if (a != null) {
            this.f12080b = Integer.toString(a.versionCode);
            this.f12081c = a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo11504a() {
        PackageInfo a;
        if (this.f12082d == 0 && (a = m16302a("com.google.android.gms")) != null) {
            this.f12082d = a.versionCode;
        }
        return this.f12082d;
    }

    /* renamed from: b */
    public final synchronized int mo11505b() {
        if (this.f12083e != 0) {
            return this.f12083e;
        }
        PackageManager packageManager = this.f12079a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C2092n.m9171l()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f12083e = 1;
                return this.f12083e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C2092n.m9171l()) {
                this.f12083e = 2;
            } else {
                this.f12083e = 1;
            }
            return this.f12083e;
        }
        this.f12083e = 2;
        return this.f12083e;
    }

    /* renamed from: c */
    public final synchronized String mo11506c() {
        if (this.f12080b == null) {
            m16305e();
        }
        return this.f12080b;
    }

    /* renamed from: d */
    public final synchronized String mo11507d() {
        if (this.f12081c == null) {
            m16305e();
        }
        return this.f12081c;
    }
}
