package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Fz */
public final class C2333Fz {
    /* renamed from: a */
    private static String m9840a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public static List<String> m9841a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m9842a(Context context, String str, C2254Dd dd, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m9840a(m9840a(m9840a(m9840a(m9840a(m9840a(m9840a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", dd.f6880s.f10487i), "@gw_sdkver@", str), "@gw_sessid@", C3390pt.m13455c()), "@gw_seqnum@", dd.f6871j), "@gw_adnetstatus@", dd.f6883v);
                C3568vz vzVar = dd.f6877p;
                if (vzVar != null) {
                    a2 = m9840a(m9840a(a2, "@gw_adnetid@", vzVar.f10406b), "@gw_allocid@", dd.f6877p.f10408d);
                }
                String a3 = C3602xd.m14409a(a2, context);
                C1697X.m7698e();
                C3114ge.m12409a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static void m9843a(Context context, String str, List<String> list, String str2, zzaig zzaig) {
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(str2) && C3548vf.m14223a()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long a = C1697X.m7705l().mo7725a();
            for (String a2 : list) {
                String a3 = m9840a(m9840a(a2, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a));
                if (zzaig != null) {
                    a3 = m9840a(m9840a(a3, "@gw_rwd_itm@", Uri.encode(zzaig.f10845a)), "@gw_rwd_amt@", Integer.toString(zzaig.f10846b));
                }
                C1697X.m7698e();
                C3114ge.m12409a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static boolean m9844a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
