package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._u */
public final class C2930_u {

    /* renamed from: a */
    private boolean f8867a;

    /* renamed from: b */
    private final List<C2875Yu> f8868b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f8869c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f8870d = new Object();

    /* renamed from: e */
    private String f8871e;

    /* renamed from: f */
    private C2930_u f8872f;

    public C2930_u(boolean z, String str, String str2) {
        this.f8867a = z;
        this.f8869c.put("action", str);
        this.f8869c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final C2875Yu mo9174a() {
        return mo9175a(C1697X.m7705l().mo7726b());
    }

    /* renamed from: a */
    public final C2875Yu mo9175a(long j) {
        if (!this.f8867a) {
            return null;
        }
        return new C2875Yu(j, (String) null, (C2875Yu) null);
    }

    /* renamed from: a */
    public final void mo9176a(C2930_u _uVar) {
        synchronized (this.f8870d) {
            this.f8872f = _uVar;
        }
    }

    /* renamed from: a */
    public final void mo9177a(String str) {
        if (this.f8867a) {
            synchronized (this.f8870d) {
                this.f8871e = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo9178a(String str, String str2) {
        C2649Qu d;
        if (this.f8867a && !TextUtils.isEmpty(str2) && (d = C1697X.m7702i().mo8324d()) != null) {
            synchronized (this.f8870d) {
                C2763Uu a = d.mo8752a(str);
                Map<String, String> map = this.f8869c;
                map.put(str, a.mo8937a(map.get(str), str2));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9179a(C2875Yu yu, long j, String... strArr) {
        synchronized (this.f8870d) {
            for (String yu2 : strArr) {
                this.f8868b.add(new C2875Yu(j, yu2, yu));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo9180a(C2875Yu yu, String... strArr) {
        if (!this.f8867a || yu == null) {
            return false;
        }
        return mo9179a(yu, C1697X.m7705l().mo7726b(), strArr);
    }

    /* renamed from: b */
    public final String mo9181b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f8870d) {
            for (C2875Yu next : this.f8868b) {
                long a = next.mo9077a();
                String b = next.mo9078b();
                C2875Yu c = next.mo9079c();
                if (c != null && a > 0) {
                    sb2.append(b);
                    sb2.append('.');
                    sb2.append(a - c.mo9077a());
                    sb2.append(',');
                }
            }
            this.f8868b.clear();
            if (!TextUtils.isEmpty(this.f8871e)) {
                sb2.append(this.f8871e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, String> mo9182c() {
        synchronized (this.f8870d) {
            C2649Qu d = C1697X.m7702i().mo8324d();
            if (d != null) {
                if (this.f8872f != null) {
                    Map<String, String> a = d.mo8753a(this.f8869c, this.f8872f.mo9182c());
                    return a;
                }
            }
            Map<String, String> map = this.f8869c;
            return map;
        }
    }

    /* renamed from: d */
    public final C2875Yu mo9183d() {
        synchronized (this.f8870d) {
        }
        return null;
    }
}
