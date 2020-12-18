package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.td */
public final class C3487td {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f10245a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f10246b = new Object();

    /* renamed from: c */
    private String f10247c = null;

    /* renamed from: d */
    private final AtomicBoolean f10248d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicInteger f10249e = new AtomicInteger(-1);

    /* renamed from: f */
    private final AtomicReference<Object> f10250f = new AtomicReference<>((Object) null);

    /* renamed from: g */
    private final AtomicReference<Object> f10251g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private ConcurrentMap<String, Method> f10252h = new ConcurrentHashMap(9);

    /* renamed from: a */
    private static Bundle m13844a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            C2227Cf.m9533b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private final Object m13845a(String str, Context context) {
        if (!m13848a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10250f, true)) {
            return null;
        }
        try {
            return m13851h(context, str).invoke(this.f10250f.get(), new Object[0]);
        } catch (Exception e) {
            m13847a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m13846a(Context context, String str, Bundle bundle) {
        if (mo10040d(context) && m13848a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10250f, true)) {
            Method l = m13853l(context);
            try {
                l.invoke(this.f10250f.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m13847a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private final void m13847a(Exception exc, String str, boolean z) {
        if (!this.f10248d.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C2227Cf.m9536d(sb.toString());
            if (z) {
                C2227Cf.m9536d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f10248d.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m13848a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                m13847a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m13849b(Context context, String str, String str2) {
        if (m13848a(context, "com.google.android.gms.measurement.AppMeasurement", this.f10250f, true)) {
            Method g = m13850g(context, str2);
            try {
                g.invoke(this.f10250f.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C2857Yd.m11615f(sb.toString());
            } catch (Exception e) {
                m13847a(e, str2, false);
            }
        }
    }

    /* renamed from: g */
    private final Method m13850g(Context context, String str) {
        Method method = (Method) this.f10252h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f10252h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m13847a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m13851h(Context context, String str) {
        Method method = (Method) this.f10252h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f10252h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m13847a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m13852i(Context context, String str) {
        Method method = (Method) this.f10252h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f10252h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m13847a(e, str, false);
            return null;
        }
    }

    /* renamed from: l */
    private final Method m13853l(Context context) {
        Method method = (Method) this.f10252h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f10252h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m13847a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo10031a(Context context) {
        if (!mo10040d(context)) {
            return null;
        }
        long longValue = ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7819Ta)).longValue();
        if (longValue < 0) {
            return (String) m13845a("getAppInstanceId", context);
        }
        if (this.f10245a.get() == null) {
            this.f10245a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7824Ua)).intValue(), ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7824Ua)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C3574wd(this)));
        }
        Future submit = this.f10245a.get().submit(new C3516ud(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo10032a(Context context, String str) {
        if (mo10040d(context)) {
            m13849b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: a */
    public final void mo10033a(Context context, String str, String str2) {
        if (mo10040d(context)) {
            m13846a(context, str, m13844a(context, str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    public final void mo10034a(Context context, String str, String str2, String str3, int i) {
        if (mo10040d(context)) {
            Bundle a = m13844a(context, str, false);
            a.putString("_ai", str2);
            a.putString(SVGParser.XML_STYLESHEET_ATTR_TYPE, str3);
            a.putInt("value", i);
            m13846a(context, "_ar", a);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C2857Yd.m11615f(sb.toString());
        }
    }

    /* renamed from: b */
    public final String mo10035b(Context context) {
        Object a;
        if (mo10040d(context) && (a = m13845a("generateEventId", context)) != null) {
            return a.toString();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo10036b(Context context, String str) {
        if (mo10040d(context)) {
            m13849b(context, str, "endAdUnitExposure");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo10037c(Context context) {
        return (String) m13845a("getAppInstanceId", context);
    }

    /* renamed from: c */
    public final void mo10038c(Context context, String str) {
        if (mo10040d(context) && (context instanceof Activity) && m13848a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f10251g, false)) {
            Method i = m13852i(context, "setCurrentScreen");
            try {
                i.invoke(this.f10251g.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                m13847a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: d */
    public final void mo10039d(Context context, String str) {
        mo10033a(context, "_ac", str);
    }

    /* renamed from: d */
    public final boolean mo10040d(Context context) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7759Ja)).booleanValue() && !this.f10248d.get()) {
            if (this.f10249e.get() == -1) {
                C3390pt.m13453a();
                if (!C3432rf.m13611c(context)) {
                    C3390pt.m13453a();
                    if (C3432rf.m13614f(context)) {
                        C2227Cf.m9536d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f10249e.set(0);
                    }
                }
                this.f10249e.set(1);
            }
            if (this.f10249e.get() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo10041e(Context context, String str) {
        mo10033a(context, "_ai", str);
    }

    /* renamed from: e */
    public final boolean mo10042e(Context context) {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7765Ka)).booleanValue() && mo10040d(context);
    }

    /* renamed from: f */
    public final void mo10043f(Context context, String str) {
        mo10033a(context, "_aq", str);
    }

    /* renamed from: f */
    public final boolean mo10044f(Context context) {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7771La)).booleanValue() && mo10040d(context);
    }

    /* renamed from: g */
    public final boolean mo10045g(Context context) {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7777Ma)).booleanValue() && mo10040d(context);
    }

    /* renamed from: h */
    public final boolean mo10046h(Context context) {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7783Na)).booleanValue() && mo10040d(context);
    }

    /* renamed from: i */
    public final boolean mo10047i(Context context) {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7801Qa)).booleanValue() && mo10040d(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10048j(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo10040d(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f10250f
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m13848a(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m13851h(r7, r0)     // Catch:{ Exception -> 0x0045 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f10250f     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0045 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0045 }
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m13851h(r7, r3)     // Catch:{ Exception -> 0x0045 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f10250f     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0045 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0045 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            if (r3 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r2
        L_0x0045:
            r7 = move-exception
            r6.m13847a((java.lang.Exception) r7, (java.lang.String) r0, (boolean) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3487td.mo10048j(android.content.Context):java.lang.String");
    }

    /* renamed from: k */
    public final String mo10049k(Context context) {
        if (!mo10040d(context)) {
            return null;
        }
        synchronized (this.f10246b) {
            if (this.f10247c != null) {
                String str = this.f10247c;
                return str;
            }
            this.f10247c = (String) m13845a("getGmpAppId", context);
            String str2 = this.f10247c;
            return str2;
        }
    }
}
