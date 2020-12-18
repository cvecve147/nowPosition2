package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.firebase.iid.o */
final class C4084o {

    /* renamed from: a */
    private final SharedPreferences f12106a;

    /* renamed from: b */
    private final Context f12107b;

    /* renamed from: c */
    private final C4057F f12108c;

    /* renamed from: d */
    private final Map<String, C4058G> f12109d;

    public C4084o(Context context) {
        this(context, new C4057F());
    }

    private C4084o(Context context, C4057F f) {
        this.f12109d = new C1080b();
        this.f12107b = context;
        this.f12106a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12108c = f;
        File file = new File(C1006a.m5388a(this.f12107b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m16334c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo11518b();
                    FirebaseInstanceId.m16247b().mo11474i();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    /* renamed from: a */
    static String m16332a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m16333b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    private final synchronized boolean m16334c() {
        return this.f12106a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized C4085p mo11513a(String str, String str2, String str3) {
        return C4085p.m16342a(this.f12106a.getString(m16333b(str, str2, str3), (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo11514a() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.f12106a     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "topic_operaion_queue"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x0024 }
            int r1 = r0.length     // Catch:{ all -> 0x0024 }
            r3 = 1
            if (r1 <= r3) goto L_0x0022
            r1 = r0[r3]     // Catch:{ all -> 0x0024 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            r0 = r0[r3]     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)
            return r0
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4084o.mo11514a():java.lang.String");
    }

    /* renamed from: a */
    public final synchronized void mo11515a(String str, String str2, String str3, String str4, String str5) {
        String a = C4085p.m16343a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f12106a.edit();
            edit.putString(m16333b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo11516a(String str) {
        boolean z;
        String string = this.f12106a.getString("topic_operaion_queue", "");
        String valueOf = String.valueOf(str);
        if (string.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
            String valueOf2 = String.valueOf(str);
            this.f12106a.edit().putString("topic_operaion_queue", string.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length())).apply();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized C4058G mo11517b(String str) {
        C4058G g;
        C4058G g2 = this.f12109d.get(str);
        if (g2 != null) {
            return g2;
        }
        try {
            g = this.f12108c.mo11462a(this.f12107b, str);
        } catch (C4059H unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m16247b().mo11474i();
            g = this.f12108c.mo11463b(this.f12107b, str);
        }
        this.f12109d.put(str, g);
        return g;
    }

    /* renamed from: b */
    public final synchronized void mo11518b() {
        this.f12109d.clear();
        C4057F.m16232a(this.f12107b);
        this.f12106a.edit().clear().commit();
    }

    /* renamed from: c */
    public final synchronized void mo11519c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f12106a.edit();
        for (String next : this.f12106a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
