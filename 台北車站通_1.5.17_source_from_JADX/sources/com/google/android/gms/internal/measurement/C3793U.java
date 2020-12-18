package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.U */
public final class C3793U extends C3802Wa {

    /* renamed from: c */
    private static final AtomicReference<String[]> f11317c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f11318d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f11319e = new AtomicReference<>();

    C3793U(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    private final String m15085a(zzer zzer) {
        if (zzer == null) {
            return null;
        }
        return !m15092y() ? zzer.toString() : mo10551a(zzer.mo11102b());
    }

    /* renamed from: a */
    private static String m15086a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C2061y.m9067a(strArr);
        C2061y.m9067a(strArr2);
        C2061y.m9067a(atomicReference);
        C2061y.m9073a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C3871mc.m15529c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    private static void m15087a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private final void m15088a(StringBuilder sb, int i, C3891rc rcVar) {
        String str;
        if (rcVar != null) {
            m15087a(sb, i);
            sb.append("filter {\n");
            m15091a(sb, i, "complement", (Object) rcVar.f11635f);
            m15091a(sb, i, "param_name", (Object) mo10558b(rcVar.f11636g));
            int i2 = i + 1;
            C3903uc ucVar = rcVar.f11633d;
            if (ucVar != null) {
                m15087a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                Integer num = ucVar.f11669c;
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str = "REGEXP";
                            break;
                        case 2:
                            str = "BEGINS_WITH";
                            break;
                        case 3:
                            str = "ENDS_WITH";
                            break;
                        case 4:
                            str = "PARTIAL";
                            break;
                        case 5:
                            str = "EXACT";
                            break;
                        case 6:
                            str = "IN_LIST";
                            break;
                        default:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                    }
                    m15091a(sb, i2, "match_type", (Object) str);
                }
                m15091a(sb, i2, "expression", (Object) ucVar.f11670d);
                m15091a(sb, i2, "case_sensitive", (Object) ucVar.f11671e);
                if (ucVar.f11672f.length > 0) {
                    m15087a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String append : ucVar.f11672f) {
                        m15087a(sb, i2 + 2);
                        sb.append(append);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m15087a(sb, i2);
                sb.append("}\n");
            }
            m15090a(sb, i2, "number_filter", rcVar.f11634e);
            m15087a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m15089a(StringBuilder sb, int i, String str, C3729Dc dc) {
        if (dc != null) {
            m15087a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            int i2 = 0;
            if (dc.f11076d != null) {
                m15087a(sb, 4);
                sb.append("results: ");
                long[] jArr = dc.f11076d;
                int length = jArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    Long valueOf = Long.valueOf(jArr[i3]);
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i3++;
                    i4 = i5;
                }
                sb.append(10);
            }
            if (dc.f11075c != null) {
                m15087a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = dc.f11075c;
                int length2 = jArr2.length;
                int i6 = 0;
                while (i2 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i2]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i2++;
                    i6 = i7;
                }
                sb.append(10);
            }
            m15087a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m15090a(StringBuilder sb, int i, String str, C3895sc scVar) {
        if (scVar != null) {
            m15087a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            Integer num = scVar.f11643c;
            if (num != null) {
                int intValue = num.intValue();
                m15091a(sb, i, "comparison_type", (Object) intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
            }
            m15091a(sb, i, "match_as_float", (Object) scVar.f11644d);
            m15091a(sb, i, "comparison_value", (Object) scVar.f11645e);
            m15091a(sb, i, "min_comparison_value", (Object) scVar.f11646f);
            m15091a(sb, i, "max_comparison_value", (Object) scVar.f11647g);
            m15087a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m15091a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m15087a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: y */
    private final boolean m15092y() {
        return this.f11325a.mo10385b().mo10584a(3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10551a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m15092y()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            sb.append(sb.length() != 0 ? ", " : "Bundle[{");
            sb.append(mo10558b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10552a(C3721Bc bc) {
        int i;
        C3725Cc[] ccArr;
        int i2;
        C3725Cc[] ccArr2;
        C3793U u = this;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        C3725Cc[] ccArr3 = bc.f11023c;
        if (ccArr3 != null) {
            int length = ccArr3.length;
            int i3 = 0;
            while (i3 < length) {
                C3725Cc cc = ccArr3[i3];
                if (cc == null || cc == null) {
                    ccArr = ccArr3;
                    i = length;
                } else {
                    m15087a(sb, 1);
                    sb.append("bundle {\n");
                    m15091a(sb, 1, "protocol_version", (Object) cc.f11044d);
                    m15091a(sb, 1, "platform", (Object) cc.f11052l);
                    m15091a(sb, 1, "gmp_version", (Object) cc.f11060t);
                    m15091a(sb, 1, "uploading_gmp_version", (Object) cc.f11061u);
                    m15091a(sb, 1, "config_version", (Object) cc.f11039J);
                    m15091a(sb, 1, "gmp_app_id", (Object) cc.f11031B);
                    m15091a(sb, 1, "app_id", (Object) cc.f11058r);
                    m15091a(sb, 1, "app_version", (Object) cc.f11059s);
                    m15091a(sb, 1, "app_version_major", (Object) cc.f11035F);
                    m15091a(sb, 1, "firebase_instance_id", (Object) cc.f11034E);
                    m15091a(sb, 1, "dev_cert_hash", (Object) cc.f11065y);
                    m15091a(sb, 1, "app_store", (Object) cc.f11057q);
                    m15091a(sb, 1, "upload_timestamp_millis", (Object) cc.f11047g);
                    m15091a(sb, 1, "start_timestamp_millis", (Object) cc.f11048h);
                    m15091a(sb, 1, "end_timestamp_millis", (Object) cc.f11049i);
                    m15091a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) cc.f11050j);
                    m15091a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) cc.f11051k);
                    m15091a(sb, 1, "app_instance_id", (Object) cc.f11064x);
                    m15091a(sb, 1, "resettable_device_id", (Object) cc.f11062v);
                    m15091a(sb, 1, "device_id", (Object) cc.f11038I);
                    m15091a(sb, 1, "limited_ad_tracking", (Object) cc.f11063w);
                    m15091a(sb, 1, "os_version", (Object) cc.f11053m);
                    m15091a(sb, 1, "device_model", (Object) cc.f11054n);
                    m15091a(sb, 1, "user_default_language", (Object) cc.f11055o);
                    m15091a(sb, 1, "time_zone_offset_minutes", (Object) cc.f11056p);
                    m15091a(sb, 1, "bundle_sequential_index", (Object) cc.f11066z);
                    m15091a(sb, 1, "service_upload", (Object) cc.f11032C);
                    m15091a(sb, 1, "health_monitor", (Object) cc.f11030A);
                    Long l = cc.f11040K;
                    if (!(l == null || l.longValue() == 0)) {
                        m15091a(sb, 1, "android_id", (Object) cc.f11040K);
                    }
                    Integer num = cc.f11043N;
                    if (num != null) {
                        m15091a(sb, 1, "retry_counter", (Object) num);
                    }
                    C3733Ec[] ecArr = cc.f11046f;
                    int i4 = 2;
                    if (ecArr != null) {
                        int length2 = ecArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            C3733Ec ec = ecArr[i5];
                            if (ec != null) {
                                m15087a(sb, i4);
                                sb.append("user_property {\n");
                                ccArr2 = ccArr3;
                                i2 = length;
                                m15091a(sb, 2, "set_timestamp_millis", (Object) ec.f11089d);
                                m15091a(sb, 2, "name", (Object) u.mo10559c(ec.f11090e));
                                m15091a(sb, 2, "string_value", (Object) ec.f11091f);
                                m15091a(sb, 2, "int_value", (Object) ec.f11092g);
                                m15091a(sb, 2, "double_value", (Object) ec.f11094i);
                                m15087a(sb, 2);
                                sb.append("}\n");
                            } else {
                                ccArr2 = ccArr3;
                                i2 = length;
                            }
                            i5++;
                            ccArr3 = ccArr2;
                            length = i2;
                            i4 = 2;
                        }
                    }
                    ccArr = ccArr3;
                    i = length;
                    C3919yc[] ycVarArr = cc.f11033D;
                    if (ycVarArr != null) {
                        for (C3919yc ycVar : ycVarArr) {
                            if (ycVar != null) {
                                m15087a(sb, 2);
                                sb.append("audience_membership {\n");
                                m15091a(sb, 2, "audience_id", (Object) ycVar.f11728d);
                                m15091a(sb, 2, "new_audience", (Object) ycVar.f11731g);
                                m15089a(sb, 2, "current_data", ycVar.f11729e);
                                m15089a(sb, 2, "previous_data", ycVar.f11730f);
                                m15087a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C3923zc[] zcVarArr = cc.f11045e;
                    if (zcVarArr != null) {
                        int length3 = zcVarArr.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            C3923zc zcVar = zcVarArr[i6];
                            if (zcVar != null) {
                                m15087a(sb, 2);
                                sb.append("event {\n");
                                m15091a(sb, 2, "name", (Object) u.mo10557a(zcVar.f11748e));
                                m15091a(sb, 2, "timestamp_millis", (Object) zcVar.f11749f);
                                m15091a(sb, 2, "previous_timestamp_millis", (Object) zcVar.f11750g);
                                m15091a(sb, 2, "count", (Object) zcVar.f11751h);
                                C3717Ac[] acArr = zcVar.f11747d;
                                if (acArr != null) {
                                    int length4 = acArr.length;
                                    int i7 = 0;
                                    while (i7 < length4) {
                                        C3717Ac ac = acArr[i7];
                                        if (ac != null) {
                                            m15087a(sb, 3);
                                            sb.append("param {\n");
                                            m15091a(sb, 3, "name", (Object) u.mo10558b(ac.f11014d));
                                            m15091a(sb, 3, "string_value", (Object) ac.f11015e);
                                            m15091a(sb, 3, "int_value", (Object) ac.f11016f);
                                            m15091a(sb, 3, "double_value", (Object) ac.f11018h);
                                            m15087a(sb, 3);
                                            sb.append("}\n");
                                        }
                                        i7++;
                                        u = this;
                                    }
                                }
                                m15087a(sb, 2);
                                sb.append("}\n");
                            }
                            i6++;
                            u = this;
                        }
                    }
                    m15087a(sb, 1);
                    sb.append("}\n");
                }
                i3++;
                u = this;
                ccArr3 = ccArr;
                length = i;
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10553a(C3738G g) {
        if (g == null) {
            return null;
        }
        if (!m15092y()) {
            return g.toString();
        }
        return "Event{appId='" + g.f11109a + "', name='" + mo10557a(g.f11110b) + "', params=" + m15085a(g.f11114f) + "}";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10554a(C3887qc qcVar) {
        if (qcVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m15091a(sb, 0, "filter_id", (Object) qcVar.f11597d);
        m15091a(sb, 0, "event_name", (Object) mo10557a(qcVar.f11598e));
        m15090a(sb, 1, "event_count_filter", qcVar.f11601h);
        sb.append("  filters {\n");
        for (C3891rc a : qcVar.f11599f) {
            m15088a(sb, 2, a);
        }
        m15087a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10555a(C3899tc tcVar) {
        if (tcVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m15091a(sb, 0, "filter_id", (Object) tcVar.f11662d);
        m15091a(sb, 0, "property_name", (Object) mo10559c(tcVar.f11663e));
        m15088a(sb, 1, tcVar.f11664f);
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10556a(zzeu zzeu) {
        if (zzeu == null) {
            return null;
        }
        if (!m15092y()) {
            return zzeu.toString();
        }
        return "origin=" + zzeu.f11783c + ",name=" + mo10557a(zzeu.f11781a) + ",params=" + m15085a(zzeu.f11782b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10557a(String str) {
        if (str == null) {
            return null;
        }
        return !m15092y() ? str : m15086a(str, AppMeasurement.C3996a.f11904b, AppMeasurement.C3996a.f11903a, f11317c);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10558b(String str) {
        if (str == null) {
            return null;
        }
        return !m15092y() ? str : m15086a(str, AppMeasurement.C3999d.f11906b, AppMeasurement.C3999d.f11905a, f11318d);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo10559c(String str) {
        if (str == null) {
            return null;
        }
        if (!m15092y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m15086a(str, AppMeasurement.C4000e.f11908b, AppMeasurement.C4000e.f11907a, f11319e);
        }
        return "experiment_id" + "(" + str + ")";
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
}
