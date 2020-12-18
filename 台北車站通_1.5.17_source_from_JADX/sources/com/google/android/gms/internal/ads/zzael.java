package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
public final class zzael extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzael> CREATOR = new C3314nb();

    /* renamed from: a */
    public final boolean f10828a;

    /* renamed from: b */
    public final List<String> f10829b;

    public zzael() {
        this(false, Collections.emptyList());
    }

    public zzael(boolean z, List<String> list) {
        this.f10828a = z;
        this.f10829b = list;
    }

    /* renamed from: a */
    public static zzael m14759a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzael();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    C2227Cf.m9535c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzael(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 2, this.f10828a);
        C2049b.m9047b(parcel, 3, this.f10829b, false);
        C2049b.m9026a(parcel, a);
    }
}
