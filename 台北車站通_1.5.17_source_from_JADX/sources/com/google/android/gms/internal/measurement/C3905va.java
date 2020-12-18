package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.internal.measurement.va */
public final class C3905va extends C3835dc implements C3916y {

    /* renamed from: d */
    private static int f11673d = 65535;

    /* renamed from: e */
    private static int f11674e = 2;

    /* renamed from: f */
    private final Map<String, Map<String, String>> f11675f = new C1080b();

    /* renamed from: g */
    private final Map<String, Map<String, Boolean>> f11676g = new C1080b();

    /* renamed from: h */
    private final Map<String, Map<String, Boolean>> f11677h = new C1080b();

    /* renamed from: i */
    private final Map<String, C3911wc> f11678i = new C1080b();

    /* renamed from: j */
    private final Map<String, Map<String, Integer>> f11679j = new C1080b();

    /* renamed from: k */
    private final Map<String, String> f11680k = new C1080b();

    C3905va(C3839ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    private final C3911wc m15728a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C3911wc();
        }
        C3820a a = C3820a.m15286a(bArr, 0, bArr.length);
        C3911wc wcVar = new C3911wc();
        try {
            wcVar.mo10404a(a);
            mo10385b().mo10580F().mo10594a("Parsed config. version, gmp_app_id", wcVar.f11708c, wcVar.f11709d);
            return wcVar;
        } catch (IOException e) {
            mo10385b().mo10576B().mo10594a("Unable to merge remote config. appId", C3801W.m15166a(str), e);
            return new C3911wc();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m15729a(C3911wc wcVar) {
        C3915xc[] xcVarArr;
        C1080b bVar = new C1080b();
        if (!(wcVar == null || (xcVarArr = wcVar.f11711f) == null)) {
            for (C3915xc xcVar : xcVarArr) {
                if (xcVar != null) {
                    bVar.put(xcVar.f11719d, xcVar.f11720e);
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private final void m15730a(String str, C3911wc wcVar) {
        C3907vc[] vcVarArr;
        C1080b bVar = new C1080b();
        C1080b bVar2 = new C1080b();
        C1080b bVar3 = new C1080b();
        if (!(wcVar == null || (vcVarArr = wcVar.f11712g) == null)) {
            for (C3907vc vcVar : vcVarArr) {
                if (TextUtils.isEmpty(vcVar.f11684d)) {
                    mo10385b().mo10576B().mo10592a("EventConfig contained null event name");
                } else {
                    String a = AppMeasurement.C3996a.m16124a(vcVar.f11684d);
                    if (!TextUtils.isEmpty(a)) {
                        vcVar.f11684d = a;
                    }
                    bVar.put(vcVar.f11684d, vcVar.f11685e);
                    bVar2.put(vcVar.f11684d, vcVar.f11686f);
                    Integer num = vcVar.f11687g;
                    if (num != null) {
                        if (num.intValue() < f11674e || vcVar.f11687g.intValue() > f11673d) {
                            mo10385b().mo10576B().mo10594a("Invalid sampling rate. Event name, sample rate", vcVar.f11684d, vcVar.f11687g);
                        } else {
                            bVar3.put(vcVar.f11684d, vcVar.f11687g);
                        }
                    }
                }
            }
        }
        this.f11676g.put(str, bVar);
        this.f11677h.put(str, bVar2);
        this.f11679j.put(str, bVar3);
    }

    /* renamed from: g */
    private final void m15731g(String str) {
        mo10685v();
        mo10451d();
        C2061y.m9076b(str);
        if (this.f11678i.get(str) == null) {
            byte[] d = mo10656t().mo11084d(str);
            if (d == null) {
                this.f11675f.put(str, (Object) null);
                this.f11676g.put(str, (Object) null);
                this.f11677h.put(str, (Object) null);
                this.f11678i.put(str, (Object) null);
                this.f11680k.put(str, (Object) null);
                this.f11679j.put(str, (Object) null);
                return;
            }
            C3911wc a = m15728a(str, d);
            this.f11675f.put(str, m15729a(a));
            m15730a(str, a);
            this.f11678i.put(str, a);
            this.f11680k.put(str, (Object) null);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3911wc mo10983a(String str) {
        mo10685v();
        mo10451d();
        C2061y.m9076b(str);
        m15731g(str);
        return this.f11678i.get(str);
    }

    /* renamed from: a */
    public final String mo10984a(String str, String str2) {
        mo10451d();
        m15731g(str);
        Map map = this.f11675f.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10985a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        String str3 = str;
        mo10685v();
        mo10451d();
        C2061y.m9076b(str);
        C3911wc a = m15728a(str, bArr);
        int i = 0;
        if (a == null) {
            return false;
        }
        m15730a(str3, a);
        this.f11678i.put(str3, a);
        this.f11680k.put(str3, str2);
        this.f11675f.put(str3, m15729a(a));
        C3896t s = mo10678s();
        C3883pc[] pcVarArr = a.f11713h;
        C2061y.m9067a(pcVarArr);
        int length = pcVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C3883pc pcVar = pcVarArr[i2];
            C3887qc[] qcVarArr = pcVar.f11583f;
            int length2 = qcVarArr.length;
            int i3 = i;
            while (i3 < length2) {
                C3887qc qcVar = qcVarArr[i3];
                String a2 = AppMeasurement.C3996a.m16124a(qcVar.f11598e);
                if (a2 != null) {
                    qcVar.f11598e = a2;
                }
                C3891rc[] rcVarArr = qcVar.f11599f;
                int length3 = rcVarArr.length;
                for (int i4 = i; i4 < length3; i4++) {
                    C3891rc rcVar = rcVarArr[i4];
                    String a3 = AppMeasurement.C3999d.m16127a(rcVar.f11636g);
                    if (a3 != null) {
                        rcVar.f11636g = a3;
                    }
                }
                i3++;
                i = 0;
            }
            for (C3899tc tcVar : pcVar.f11582e) {
                String a4 = AppMeasurement.C4000e.m16128a(tcVar.f11663e);
                if (a4 != null) {
                    tcVar.f11663e = a4;
                }
            }
            i2++;
            i = 0;
        }
        s.mo10656t().mo11071a(str3, pcVarArr);
        try {
            a.f11713h = null;
            bArr2 = new byte[a.mo10758d()];
            a.mo10405a(C3824b.m15344a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo10385b().mo10576B().mo10594a("Unable to serialize reduced-size config. Storing full config instead. appId", C3801W.m15166a(str), e);
            bArr2 = bArr;
        }
        C3920z t = mo10656t();
        C2061y.m9076b(str);
        t.mo10451d();
        t.mo10685v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) t.mo11051A().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                t.mo10385b().mo10585y().mo10593a("Failed to update remote config (got 0). appId", C3801W.m15166a(str));
            }
        } catch (SQLiteException e2) {
            t.mo10385b().mo10585y().mo10594a("Error storing remote config. appId", C3801W.m15166a(str), e2);
        }
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10986b(String str) {
        mo10451d();
        return this.f11680k.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10987b(String str, String str2) {
        Boolean bool;
        mo10451d();
        m15731g(str);
        if (mo10992e(str) && C3871mc.m15531g(str2)) {
            return true;
        }
        if (mo10993f(str) && C3871mc.m15526b(str2)) {
            return true;
        }
        Map map = this.f11676g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10988c(String str) {
        mo10451d();
        this.f11680k.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo10989c(String str, String str2) {
        Boolean bool;
        mo10451d();
        m15731g(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = this.f11677h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo10990d(String str, String str2) {
        Integer num;
        mo10451d();
        m15731g(str);
        Map map = this.f11679j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10991d(String str) {
        mo10451d();
        this.f11678i.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo10992e(String str) {
        return "1".equals(mo10984a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10993f(String str) {
        return "1".equals(mo10984a(str, "measurement.upload.blacklist_public"));
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

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C3896t mo10678s() {
        return super.mo10678s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C3920z mo10656t() {
        return super.mo10656t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo10657w() {
        return false;
    }
}
