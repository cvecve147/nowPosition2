package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.onesignal.Ib */
class C4254Ib {

    /* renamed from: a */
    private static Class<?> f12626a;

    /* renamed from: b */
    private static AtomicLong f12627b;

    /* renamed from: c */
    private static AtomicLong f12628c;

    /* renamed from: d */
    private static C4435va f12629d;

    /* renamed from: e */
    private Object f12630e;

    /* renamed from: f */
    private Context f12631f;

    C4254Ib(Context context) {
        this.f12631f = context;
    }

    /* renamed from: a */
    private Object m16889a(Context context) {
        if (this.f12630e == null) {
            try {
                this.f12630e = m16891a((Class) f12626a).invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f12630e;
    }

    /* renamed from: a */
    private String m16890a(C4435va vaVar) {
        if (vaVar.f13067b.isEmpty() || vaVar.f13068c.isEmpty()) {
            String str = vaVar.f13069d;
            return str != null ? str.substring(0, Math.min(10, str.length())) : "";
        }
        return vaVar.f13067b + " - " + vaVar.f13068c;
    }

    /* renamed from: a */
    private static Method m16891a(Class cls) {
        try {
            return cls.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    static boolean m16892a() {
        try {
            f12626a = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static Method m16893b(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12318a(C4432ua uaVar) {
        if (f12628c == null) {
            f12628c = new AtomicLong();
        }
        f12628c.set(System.currentTimeMillis());
        try {
            Object a = m16889a(this.f12631f);
            Method b = m16893b((Class) f12626a);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", uaVar.f13061a.f13020d.f13066a);
            bundle.putString("campaign", m16890a(uaVar.f13061a.f13020d));
            b.invoke(a, new Object[]{"os_notification_opened", bundle});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12319b() {
        if (f12627b != null && f12629d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f12627b.get() <= 120000) {
                AtomicLong atomicLong = f12628c;
                if (atomicLong == null || currentTimeMillis - atomicLong.get() >= 30000) {
                    try {
                        Object a = m16889a(this.f12631f);
                        Method b = m16893b((Class) f12626a);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "OneSignal");
                        bundle.putString("medium", "notification");
                        bundle.putString("notification_id", f12629d.f13066a);
                        bundle.putString("campaign", m16890a(f12629d));
                        b.invoke(a, new Object[]{"os_notification_influence_open", bundle});
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12320b(C4432ua uaVar) {
        try {
            Object a = m16889a(this.f12631f);
            Method b = m16893b((Class) f12626a);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", uaVar.f13061a.f13020d.f13066a);
            bundle.putString("campaign", m16890a(uaVar.f13061a.f13020d));
            b.invoke(a, new Object[]{"os_notification_received", bundle});
            if (f12627b == null) {
                f12627b = new AtomicLong();
            }
            f12627b.set(System.currentTimeMillis());
            f12629d = uaVar.f13061a.f13020d;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
