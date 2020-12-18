package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.G */
public final class C3738G {

    /* renamed from: a */
    final String f11109a;

    /* renamed from: b */
    final String f11110b;

    /* renamed from: c */
    private final String f11111c;

    /* renamed from: d */
    final long f11112d;

    /* renamed from: e */
    final long f11113e;

    /* renamed from: f */
    final zzer f11114f;

    C3738G(C3715Aa aa, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzer zzer;
        C2061y.m9076b(str2);
        C2061y.m9076b(str3);
        this.f11109a = str2;
        this.f11110b = str3;
        this.f11111c = TextUtils.isEmpty(str) ? null : str;
        this.f11112d = j;
        this.f11113e = j2;
        long j3 = this.f11113e;
        if (j3 != 0 && j3 > this.f11112d) {
            aa.mo10385b().mo10576B().mo10593a("Event created with reverse previous/current timestamps. appId", C3801W.m15166a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzer = new zzer(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    aa.mo10385b().mo10585y().mo10592a("Param name can't be null");
                } else {
                    Object a = aa.mo10392h().mo10782a(str4, bundle2.get(str4));
                    if (a == null) {
                        aa.mo10385b().mo10576B().mo10593a("Param value can't be null", aa.mo10390g().mo10558b(str4));
                    } else {
                        aa.mo10392h().mo10784a(bundle2, str4, a);
                    }
                }
                it.remove();
            }
            zzer = new zzer(bundle2);
        }
        this.f11114f = zzer;
    }

    private C3738G(C3715Aa aa, String str, String str2, String str3, long j, long j2, zzer zzer) {
        C2061y.m9076b(str2);
        C2061y.m9076b(str3);
        C2061y.m9067a(zzer);
        this.f11109a = str2;
        this.f11110b = str3;
        this.f11111c = TextUtils.isEmpty(str) ? null : str;
        this.f11112d = j;
        this.f11113e = j2;
        long j3 = this.f11113e;
        if (j3 != 0 && j3 > this.f11112d) {
            aa.mo10385b().mo10576B().mo10594a("Event created with reverse previous/current timestamps. appId, name", C3801W.m15166a(str2), C3801W.m15166a(str3));
        }
        this.f11114f = zzer;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3738G mo10466a(C3715Aa aa, long j) {
        return new C3738G(aa, this.f11111c, this.f11109a, this.f11110b, this.f11112d, j, this.f11114f);
    }

    public final String toString() {
        String str = this.f11109a;
        String str2 = this.f11110b;
        String valueOf = String.valueOf(this.f11114f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
