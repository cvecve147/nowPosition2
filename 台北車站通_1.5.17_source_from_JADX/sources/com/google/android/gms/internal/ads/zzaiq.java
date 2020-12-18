package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@C2478La
public final class zzaiq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiq> CREATOR = new C3288md();

    /* renamed from: a */
    public final String f10847a;

    /* renamed from: b */
    public final String f10848b;

    /* renamed from: c */
    public final boolean f10849c;

    /* renamed from: d */
    public final boolean f10850d;

    /* renamed from: e */
    public final List<String> f10851e;

    /* renamed from: f */
    public final boolean f10852f;

    /* renamed from: g */
    public final boolean f10853g;

    /* renamed from: h */
    public final List<String> f10854h;

    public zzaiq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f10847a = str;
        this.f10848b = str2;
        this.f10849c = z;
        this.f10850d = z2;
        this.f10851e = list;
        this.f10852f = z3;
        this.f10853g = z4;
        this.f10854h = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: a */
    public static zzaiq m14765a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new zzaiq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C2943af.m11928a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C2943af.m11928a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10847a, false);
        C2049b.m9038a(parcel, 3, this.f10848b, false);
        C2049b.m9040a(parcel, 4, this.f10849c);
        C2049b.m9040a(parcel, 5, this.f10850d);
        C2049b.m9047b(parcel, 6, this.f10851e, false);
        C2049b.m9040a(parcel, 7, this.f10852f);
        C2049b.m9040a(parcel, 8, this.f10853g);
        C2049b.m9047b(parcel, 9, this.f10854h, false);
        C2049b.m9026a(parcel, a);
    }
}
