package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p101d.p129g.p131b.p132a.p144g.C5536g;
import p101d.p129g.p131b.p132a.p144g.C5540j;
import p101d.p129g.p149d.C5574a;

public class FirebaseInstanceId {

    /* renamed from: a */
    private static final long f12042a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private static C4084o f12043b;

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f12044c;

    /* renamed from: d */
    private final C5574a f12045d;

    /* renamed from: e */
    private final C4074e f12046e;

    /* renamed from: f */
    private final C4056E f12047f;

    /* renamed from: g */
    private final C4077h f12048g;

    /* renamed from: h */
    private boolean f12049h;

    /* renamed from: i */
    private boolean f12050i;

    FirebaseInstanceId(C5574a aVar) {
        this(aVar, new C4074e(aVar.mo15063a()));
    }

    private FirebaseInstanceId(C5574a aVar, C4074e eVar) {
        this.f12048g = new C4077h();
        this.f12049h = false;
        if (C4074e.m16303a(aVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f12043b == null) {
                    f12043b = new C4084o(aVar.mo15063a());
                }
            }
            this.f12045d = aVar;
            this.f12046e = eVar;
            this.f12047f = new C4053B(aVar, this, eVar);
            this.f12050i = m16254n();
            if (mo11476k()) {
                m16253m();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: a */
    private static <T> T m16244a(C5536g<T> gVar) {
        try {
            return C5540j.m21080a(gVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw new IOException(cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    private final String m16245a(String str, String str2, Bundle bundle) {
        return ((C4053B) this.f12047f).mo11457a(str, str2, bundle);
    }

    /* renamed from: a */
    static void m16246a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f12044c == null) {
                f12044c = new ScheduledThreadPoolExecutor(1);
            }
            f12044c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    public static FirebaseInstanceId m16247b() {
        return getInstance(C5574a.m21206b());
    }

    /* renamed from: c */
    private static String m16248c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: d */
    static String m16249d() {
        return C4074e.m16304a(f12043b.mo11517b("").mo11481a());
    }

    /* renamed from: g */
    static C4084o m16250g() {
        return f12043b;
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(C5574a aVar) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) aVar.mo15064a(FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    /* renamed from: h */
    static boolean m16251h() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* renamed from: l */
    private final synchronized void m16252l() {
        if (!this.f12049h) {
            mo11466a(0);
        }
    }

    /* renamed from: m */
    private final void m16253m() {
        C4085p e = mo11472e();
        if (e == null || e.mo11520b(this.f12046e.mo11506c()) || f12043b.mo11514a() != null) {
            m16252l();
        }
    }

    /* renamed from: n */
    private final boolean m16254n() {
        ApplicationInfo applicationInfo;
        Context a = this.f12045d.mo15063a();
        SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", true);
        }
        try {
            PackageManager packageManager = a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return m16255o();
    }

    /* renamed from: o */
    private final boolean m16255o() {
        try {
            Class.forName("com.google.firebase.messaging.a");
            return true;
        } catch (ClassNotFoundException unused) {
            Context a = this.f12045d.mo15063a();
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(a.getPackageName());
            ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
            return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
        }
    }

    /* renamed from: a */
    public String mo11464a() {
        m16253m();
        return m16249d();
    }

    /* renamed from: a */
    public String mo11465a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String c = m16248c(str2);
            C4085p a = f12043b.mo11513a("", str, c);
            return (a == null || a.mo11520b(this.f12046e.mo11506c())) ? this.f12048g.mo11509a(str, c, (C4080k) new C4052A(this, str, c)) : a.f12111b;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11466a(long j) {
        m16246a((Runnable) new C4086q(this, this.f12046e, Math.min(Math.max(30, j << 1), f12042a)), j);
        this.f12049h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11467a(String str) {
        C4085p e = mo11472e();
        if (e == null || e.mo11520b(this.f12046e.mo11506c())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String str2 = e.f12111b;
        String valueOf2 = String.valueOf(str);
        m16245a(str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11468a(boolean z) {
        this.f12049h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ String mo11469b(String str, String str2) {
        String str3 = (String) m16244a(this.f12047f.mo11459b(str, str2));
        f12043b.mo11515a("", str, str2, str3, this.f12046e.mo11506c());
        return str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11470b(String str) {
        C4085p e = mo11472e();
        if (e == null || e.mo11520b(this.f12046e.mo11506c())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String str2 = e.f12111b;
        String valueOf2 = String.valueOf(str);
        m16245a(str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5574a mo11471c() {
        return this.f12045d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4085p mo11472e() {
        return f12043b.mo11513a("", C4074e.m16303a(this.f12045d), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo11473f() {
        return mo11465a(C4074e.m16303a(this.f12045d), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo11474i() {
        f12043b.mo11518b();
        if (mo11476k()) {
            m16252l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11475j() {
        f12043b.mo11519c("");
        m16252l();
    }

    /* renamed from: k */
    public final synchronized boolean mo11476k() {
        return this.f12050i;
    }
}
