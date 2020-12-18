package com.google.firebase.iid;

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
import p101d.p129g.p131b.p132a.p137e.p139b.C5494g;

/* renamed from: com.google.firebase.iid.F */
final class C4057F {
    C4057F() {
    }

    /* renamed from: a */
    private static C4058G m16229a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C4084o.m16332a(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(C4084o.m16332a(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C4058G(m16231a(string, string2), m16236b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        m16234a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.C4058G m16230a(java.io.File r5) {
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
            java.security.KeyPair r2 = m16231a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r3 = "cre"
            java.lang.String r1 = r1.getProperty(r3)     // Catch:{ NumberFormatException -> 0x0036 }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.firebase.iid.G r1 = new com.google.firebase.iid.G     // Catch:{ Throwable -> 0x0043 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0043 }
            m16234a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            return r1
        L_0x0036:
            r1 = move-exception
            com.google.firebase.iid.H r2 = new com.google.firebase.iid.H     // Catch:{ Throwable -> 0x0043 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0043 }
            throw r2     // Catch:{ Throwable -> 0x0043 }
        L_0x003d:
            m16234a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            return r5
        L_0x0041:
            r1 = move-exception
            goto L_0x0045
        L_0x0043:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0041 }
        L_0x0045:
            m16234a((java.lang.Throwable) r5, (java.io.FileInputStream) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4057F.m16230a(java.io.File):com.google.firebase.iid.G");
    }

    /* renamed from: a */
    private static KeyPair m16231a(String str, String str2) {
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
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C4059H(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C4059H(e2);
        }
    }

    /* renamed from: a */
    static void m16232a(Context context) {
        for (File file : m16237b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static void m16233a(Context context, String str, C4058G g) {
        FileOutputStream fileOutputStream;
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Writing key to properties file");
            }
            File e = m16241e(context, str);
            e.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", g.m16275b());
            properties.setProperty("pri", g.m16278c());
            properties.setProperty("cre", String.valueOf(g.f12054b));
            fileOutputStream = new FileOutputStream(e);
            properties.store(fileOutputStream, (String) null);
            m16235a((Throwable) null, fileOutputStream);
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write key: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
        } catch (Throwable th) {
            m16235a(r4, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m16234a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C5494g.m20998a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m16235a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5494g.m20998a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: b */
    private static long m16236b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C4084o.m16332a(str, "cre"), (String) null);
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
    private static File m16237b(Context context) {
        File a = C1006a.m5388a(context);
        if (a != null && a.isDirectory()) {
            return a;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: b */
    private final void m16238b(Context context, String str, C4058G g) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (g.equals(m16229a(sharedPreferences, str))) {
                return;
            }
        } catch (C4059H unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C4084o.m16332a(str, "|P|"), g.m16275b());
        edit.putString(C4084o.m16332a(str, "|K|"), g.m16278c());
        edit.putString(C4084o.m16332a(str, "cre"), String.valueOf(g.f12054b));
        edit.commit();
    }

    /* renamed from: c */
    private final C4058G m16239c(Context context, String str) {
        try {
            C4058G d = m16240d(context, str);
            if (d != null) {
                m16238b(context, str, d);
                return d;
            }
            e = null;
            try {
                C4058G a = m16229a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m16233a(context, str, a);
                    return a;
                }
            } catch (C4059H e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C4059H e2) {
            e = e2;
        }
    }

    /* renamed from: d */
    private final C4058G m16240d(Context context, String str) {
        File e = m16241e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m16230a(e);
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return m16230a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new C4059H(e3);
            }
        }
    }

    /* renamed from: e */
    private static File m16241e(Context context, String str) {
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
        return new File(m16237b(context), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4058G mo11462a(Context context, String str) {
        C4058G c = m16239c(context, str);
        return c != null ? c : mo11463b(context, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4058G mo11463b(Context context, String str) {
        C4058G g = new C4058G(C4069a.m16294a(), System.currentTimeMillis());
        try {
            C4058G c = m16239c(context, str);
            if (c != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
                }
                return c;
            }
        } catch (C4059H unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        m16233a(context, str, g);
        m16238b(context, str, g);
        return g;
    }
}
