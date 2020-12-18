package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.internal.measurement.W */
public final class C3801W extends C3802Wa {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f11330c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f11331d = -1;

    /* renamed from: e */
    private String f11332e;

    /* renamed from: f */
    private final C3809Y f11333f = new C3809Y(this, 6, false, false);

    /* renamed from: g */
    private final C3809Y f11334g = new C3809Y(this, 6, true, false);

    /* renamed from: h */
    private final C3809Y f11335h = new C3809Y(this, 6, false, true);

    /* renamed from: i */
    private final C3809Y f11336i = new C3809Y(this, 5, false, false);

    /* renamed from: j */
    private final C3809Y f11337j = new C3809Y(this, 5, true, false);

    /* renamed from: k */
    private final C3809Y f11338k = new C3809Y(this, 5, false, true);

    /* renamed from: l */
    private final C3809Y f11339l = new C3809Y(this, 4, false, false);

    /* renamed from: m */
    private final C3809Y f11340m = new C3809Y(this, 3, false, false);

    /* renamed from: n */
    private final C3809Y f11341n = new C3809Y(this, 2, false, false);

    C3801W(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: H */
    private final String m15162H() {
        String str;
        synchronized (this) {
            if (this.f11332e == null) {
                this.f11332e = C3758L.f11200g.mo10498a();
            }
            str = this.f11332e;
        }
        return str;
    }

    /* renamed from: a */
    protected static Object m15166a(String str) {
        if (str == null) {
            return null;
        }
        return new C3813Z(str);
    }

    /* renamed from: a */
    private static String m15167a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C3813Z ? ((C3813Z) obj).f11358a : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b = m15170b(AppMeasurement.class.getCanonicalName());
            String b2 = m15170b(C3715Aa.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    String b3 = m15170b(className);
                    if (b3.equals(b) || b3.equals(b2)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                    }
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: a */
    static String m15168a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m15167a(z, obj);
        String a2 = m15167a(z, obj2);
        String a3 = m15167a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m15170b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C3809Y mo10575A() {
        return this.f11335h;
    }

    /* renamed from: B */
    public final C3809Y mo10576B() {
        return this.f11336i;
    }

    /* renamed from: C */
    public final C3809Y mo10577C() {
        return this.f11338k;
    }

    /* renamed from: D */
    public final C3809Y mo10578D() {
        return this.f11339l;
    }

    /* renamed from: E */
    public final C3809Y mo10579E() {
        return this.f11340m;
    }

    /* renamed from: F */
    public final C3809Y mo10580F() {
        return this.f11341n;
    }

    /* renamed from: G */
    public final String mo10581G() {
        Pair<String, Long> a = mo10455q().f11471e.mo10770a();
        if (a == null || a == C3849ha.f11469c) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10582a(int i, String str) {
        Log.println(i, m15162H(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10583a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && mo10584a(i)) {
            mo10582a(i, m15168a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C2061y.m9067a(str);
            C3909wa D = this.f11325a.mo10376D();
            if (D == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!D.mo10587s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i = 8;
                }
                D.mo11020a((Runnable) new C3805X(this, i, str, obj, obj2, obj3));
                return;
            }
            mo10582a(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10584a(int i) {
        return Log.isLoggable(m15162H(), i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return false;
    }

    /* renamed from: y */
    public final C3809Y mo10585y() {
        return this.f11333f;
    }

    /* renamed from: z */
    public final C3809Y mo10586z() {
        return this.f11334g;
    }
}
