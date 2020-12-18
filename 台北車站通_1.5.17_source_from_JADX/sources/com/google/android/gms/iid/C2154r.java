package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import org.apache.http.protocol.HTTP;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p129g.p131b.p132a.p137e.p140c.C5503c;

/* renamed from: com.google.android.gms.iid.r */
final class C2154r {
    C2154r() {
    }

    /* renamed from: a */
    private static C2155s m9271a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2149m.m9260a(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(C2149m.m9260a(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C2155s(m9273a(string, string2), m9278b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        m9276a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.iid.C2155s m9272a(java.io.File r5) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            r5 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Throwable -> 0x0043 }
            r1.<init>()     // Catch:{ Throwable -> 0x0043 }
            r1.load(r0)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r2 = "pub"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r3 = "pri"
            java.lang.String r3 = r1.getProperty(r3)     // Catch:{ Throwable -> 0x0043 }
            if (r2 == 0) goto L_0x003d
            if (r3 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r2 = m9273a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r3 = "cre"
            java.lang.String r1 = r1.getProperty(r3)     // Catch:{ NumberFormatException -> 0x0036 }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.android.gms.iid.s r1 = new com.google.android.gms.iid.s     // Catch:{ Throwable -> 0x0043 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0043 }
            m9276a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            return r1
        L_0x0036:
            r1 = move-exception
            com.google.android.gms.iid.t r2 = new com.google.android.gms.iid.t     // Catch:{ Throwable -> 0x0043 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0043 }
            throw r2     // Catch:{ Throwable -> 0x0043 }
        L_0x003d:
            m9276a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            return r5
        L_0x0041:
            r1 = move-exception
            goto L_0x0045
        L_0x0043:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0041 }
        L_0x0045:
            m9276a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C2154r.m9272a(java.io.File):com.google.android.gms.iid.s");
    }

    /* renamed from: a */
    private static KeyPair m9273a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
                throw new C2156t(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C2156t(e2);
        }
    }

    /* renamed from: a */
    static void m9274a(Context context) {
        for (File file : m9279b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static void m9275a(Context context, String str, C2155s sVar) {
        FileOutputStream fileOutputStream;
        try {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Writing key to properties file");
            }
            File e = m9283e(context, str);
            e.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", sVar.m9287b());
            properties.setProperty("pri", sVar.m9290c());
            properties.setProperty("cre", String.valueOf(sVar.f6644b));
            fileOutputStream = new FileOutputStream(e);
            properties.store(fileOutputStream, (String) null);
            m9277a((Throwable) null, fileOutputStream);
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write key: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
        } catch (Throwable th) {
            m9277a(r4, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m9276a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C5503c.m21008a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m9277a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5503c.m21008a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: b */
    private static long m9278b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2149m.m9260a(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static File m9279b(Context context) {
        File a = C1006a.m5388a(context);
        if (a != null && a.isDirectory()) {
            return a;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: b */
    private final void m9280b(Context context, String str, C2155s sVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (sVar.equals(m9271a(sharedPreferences, str))) {
                return;
            }
        } catch (C2156t unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C2149m.m9260a(str, "|P|"), sVar.m9287b());
        edit.putString(C2149m.m9260a(str, "|K|"), sVar.m9290c());
        edit.putString(C2149m.m9260a(str, "cre"), String.valueOf(sVar.f6644b));
        edit.commit();
    }

    /* renamed from: c */
    private final C2155s m9281c(Context context, String str) {
        try {
            C2155s d = m9282d(context, str);
            if (d != null) {
                m9280b(context, str, d);
                return d;
            }
            e = null;
            try {
                C2155s a = m9271a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m9275a(context, str, a);
                    return a;
                }
            } catch (C2156t e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C2156t e2) {
            e = e2;
        }
    }

    /* renamed from: d */
    private final C2155s m9282d(Context context, String str) {
        File e = m9283e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m9272a(e);
        } catch (IOException e2) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            try {
                return m9272a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("InstanceID", sb2.toString());
                throw new C2156t(e3);
            }
        }
    }

    /* renamed from: e */
    private static File m9283e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes(HTTP.UTF_8), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m9279b(context), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2155s mo7776a(Context context, String str) {
        C2155s c = m9281c(context, str);
        return c != null ? c : mo7777b(context, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2155s mo7777b(Context context, String str) {
        C2155s sVar = new C2155s(C2150n.m9268a(), System.currentTimeMillis());
        try {
            C2155s c = m9281c(context, str);
            if (c != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return c;
            }
        } catch (C2156t unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        m9275a(context, str, sVar);
        m9280b(context, str, sVar);
        return sVar;
    }
}
