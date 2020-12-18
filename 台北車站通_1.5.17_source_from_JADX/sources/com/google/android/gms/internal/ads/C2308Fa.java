package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.p072c.C1989c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Fa */
public final class C2308Fa implements C2422Ja {

    /* renamed from: a */
    private static final Object f6969a = new Object();

    /* renamed from: b */
    private static C2422Ja f6970b = null;

    /* renamed from: c */
    private static C2422Ja f6971c = null;

    /* renamed from: d */
    private final Object f6972d;

    /* renamed from: e */
    private final Context f6973e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f6974f;

    /* renamed from: g */
    private final ExecutorService f6975g;

    /* renamed from: h */
    private final zzang f6976h;

    private C2308Fa(Context context) {
        this(context, zzang.m14766b());
    }

    private C2308Fa(Context context, zzang zzang) {
        this.f6972d = new Object();
        this.f6974f = new WeakHashMap<>();
        this.f6975g = Executors.newCachedThreadPool();
        this.f6973e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6976h = zzang;
    }

    /* renamed from: a */
    private final Uri.Builder m9760a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = C1989c.m8748b(this.f6973e).mo7518a();
        } catch (Throwable th) {
            C2227Cf.m9533b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f6973e.getPackageName();
        } catch (Throwable unused) {
            C2227Cf.m9536d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f6976h.f10855a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", C2558Nu.m10772a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "193400285").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", C3390pt.m13455c()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(C3390pt.m13458f().mo8515a(C2558Nu.f7769Ke)));
    }

    /* renamed from: a */
    public static C2422Ja m9761a(Context context) {
        synchronized (f6969a) {
            if (f6970b == null) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7899h)).booleanValue()) {
                    f6970b = new C2308Fa(context);
                } else {
                    f6970b = new C2450Ka();
                }
            }
        }
        return f6970b;
    }

    /* renamed from: a */
    public static C2422Ja m9762a(Context context, zzang zzang) {
        synchronized (f6969a) {
            if (f6971c == null) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7899h)).booleanValue()) {
                    C2308Fa fa = new C2308Fa(context, zzang);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (fa.f6972d) {
                            fa.f6974f.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new C2366Ha(fa, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C2336Ga(fa, Thread.getDefaultUncaughtExceptionHandler()));
                    f6971c = fa;
                } else {
                    f6971c = new C2450Ka();
                }
            }
        }
        return f6971c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8062a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0040
            r1 = r11
            r2 = r0
            r3 = r2
        L_0x0007:
            if (r1 == 0) goto L_0x003b
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = r0
        L_0x0011:
            if (r2 >= r5) goto L_0x0034
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C3432rf.m13609b((java.lang.String) r8)
            if (r8 == 0) goto L_0x0020
            r3 = r10
        L_0x0020:
            java.lang.Class<com.google.android.gms.internal.ads.Fa> r8 = com.google.android.gms.internal.ads.C2308Fa.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0031
            r6 = r10
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0034:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = r0
        L_0x0041:
            if (r10 == 0) goto L_0x004a
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.mo8064a(r11, r0, r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2308Fa.mo8062a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo8063a(Throwable th, String str) {
        mo8064a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo8064a(Throwable th, String str, float f) {
        if (C3432rf.m13600a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            C2639Ql.m10981a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m9760a(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.f6975g.submit(new C2394Ia(this, new C2256Df(), (String) obj));
                }
            }
        }
    }
}
