package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.p067c.C1639a;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import org.json.JSONArray;
import org.json.JSONException;

@C2478La
public final class zzaig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaig> CREATOR = new C3026dd();

    /* renamed from: a */
    public final String f10845a;

    /* renamed from: b */
    public final int f10846b;

    public zzaig(C1639a aVar) {
        this(aVar.getType(), aVar.mo6576D());
    }

    public zzaig(String str, int i) {
        this.f10845a = str;
        this.f10846b = i;
    }

    /* renamed from: a */
    public static zzaig m14763a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m14764a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static zzaig m14764a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaig(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaig)) {
            zzaig zzaig = (zzaig) obj;
            return C2059x.m9064a(this.f10845a, zzaig.f10845a) && C2059x.m9064a(Integer.valueOf(this.f10846b), Integer.valueOf(zzaig.f10846b));
        }
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f10845a, Integer.valueOf(this.f10846b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10845a, false);
        C2049b.m9030a(parcel, 3, this.f10846b);
        C2049b.m9026a(parcel, a);
    }
}
