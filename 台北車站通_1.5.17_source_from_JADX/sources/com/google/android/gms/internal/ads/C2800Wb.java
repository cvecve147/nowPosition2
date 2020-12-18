package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.C6999SM;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Wb */
public final class C2800Wb {

    /* renamed from: A */
    private boolean f8483A = false;

    /* renamed from: B */
    private zzael f8484B;

    /* renamed from: C */
    private boolean f8485C = false;

    /* renamed from: D */
    private String f8486D;

    /* renamed from: E */
    private List<String> f8487E;

    /* renamed from: F */
    private boolean f8488F;

    /* renamed from: G */
    private String f8489G;

    /* renamed from: H */
    private zzaiq f8490H;

    /* renamed from: I */
    private boolean f8491I;

    /* renamed from: J */
    private boolean f8492J;

    /* renamed from: K */
    private boolean f8493K;

    /* renamed from: L */
    private boolean f8494L;

    /* renamed from: M */
    private String f8495M;

    /* renamed from: N */
    private final zzaef f8496N;

    /* renamed from: a */
    private String f8497a;

    /* renamed from: b */
    private String f8498b;

    /* renamed from: c */
    private String f8499c;

    /* renamed from: d */
    private List<String> f8500d;

    /* renamed from: e */
    private String f8501e;

    /* renamed from: f */
    private String f8502f;

    /* renamed from: g */
    private String f8503g;

    /* renamed from: h */
    private List<String> f8504h;

    /* renamed from: i */
    private List<String> f8505i;

    /* renamed from: j */
    private long f8506j = -1;

    /* renamed from: k */
    private boolean f8507k = false;

    /* renamed from: l */
    private final long f8508l = -1;

    /* renamed from: m */
    private List<String> f8509m;

    /* renamed from: n */
    private long f8510n = -1;

    /* renamed from: o */
    private int f8511o = -1;

    /* renamed from: p */
    private boolean f8512p = false;

    /* renamed from: q */
    private boolean f8513q = false;

    /* renamed from: r */
    private boolean f8514r = false;

    /* renamed from: s */
    private boolean f8515s = true;

    /* renamed from: t */
    private boolean f8516t = true;

    /* renamed from: u */
    private String f8517u = "";

    /* renamed from: v */
    private boolean f8518v = false;

    /* renamed from: w */
    private boolean f8519w = false;

    /* renamed from: x */
    private zzaig f8520x;

    /* renamed from: y */
    private List<String> f8521y;

    /* renamed from: z */
    private List<String> f8522z;

    public C2800Wb(zzaef zzaef, String str) {
        this.f8498b = str;
        this.f8496N = zzaef;
    }

    /* renamed from: a */
    private static String m11484a(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m11485b(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str2 = (String) list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            C2227Cf.m9536d(sb.toString());
            return -1;
        }
    }

    /* renamed from: c */
    private static List<String> m11486c(Map<String, List<String>> map, String str) {
        String str2;
        List list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* renamed from: d */
    private static boolean m11487d(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    /* renamed from: a */
    public final zzaej mo8988a(long j, boolean z) {
        zzaef zzaef = this.f8496N;
        String str = this.f8498b;
        String str2 = this.f8499c;
        List<String> list = this.f8500d;
        List<String> list2 = this.f8504h;
        long j2 = this.f8506j;
        boolean z2 = this.f8507k;
        List<String> list3 = this.f8509m;
        long j3 = this.f8510n;
        int i = this.f8511o;
        String str3 = this.f8497a;
        String str4 = this.f8502f;
        String str5 = this.f8503g;
        String str6 = str4;
        boolean z3 = this.f8512p;
        boolean z4 = this.f8513q;
        boolean z5 = this.f8514r;
        boolean z6 = this.f8515s;
        String str7 = this.f8517u;
        boolean z7 = this.f8518v;
        boolean z8 = this.f8519w;
        zzaig zzaig = this.f8520x;
        List<String> list4 = this.f8521y;
        List<String> list5 = this.f8522z;
        boolean z9 = this.f8483A;
        zzael zzael = this.f8484B;
        boolean z10 = this.f8485C;
        String str8 = this.f8486D;
        List<String> list6 = this.f8487E;
        boolean z11 = this.f8488F;
        String str9 = this.f8489G;
        zzaiq zzaiq = this.f8490H;
        String str10 = this.f8501e;
        boolean z12 = this.f8516t;
        boolean z13 = this.f8491I;
        String str11 = str9;
        zzaiq zzaiq2 = zzaiq;
        String str12 = str10;
        boolean z14 = z12;
        boolean z15 = z13;
        zzael zzael2 = zzael;
        boolean z16 = z10;
        List<String> list7 = list6;
        boolean z17 = z11;
        boolean z18 = z8;
        zzaig zzaig2 = zzaig;
        List<String> list8 = list5;
        boolean z19 = z9;
        boolean z20 = z5;
        String str13 = str7;
        return new zzaej(zzaef, str, str2, list, list2, j2, z2, -1, list3, j3, i, str3, j, str6, str5, z3, z4, z20, z6, false, str13, z7, z18, zzaig2, list4, list8, z19, zzael2, z16, str8, list7, z17, str11, zzaiq2, str12, z14, z15, this.f8492J, z ? 2 : 1, this.f8493K, this.f8505i, this.f8494L, this.f8495M);
    }

    /* renamed from: a */
    public final void mo8989a(String str, Map<String, List<String>> map, String str2) {
        this.f8499c = str2;
        mo8990a(map);
    }

    /* renamed from: a */
    public final void mo8990a(Map<String, List<String>> map) {
        int a;
        this.f8497a = m11484a(map, "X-Afma-Ad-Size");
        this.f8489G = m11484a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m11486c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f8500d = c;
        }
        this.f8501e = m11484a(map, "X-Afma-Debug-Signals");
        List list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f8502f = (String) list.get(0);
        }
        List<String> c2 = m11486c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f8504h = c2;
        }
        List<String> c3 = m11486c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f8505i = c3;
        }
        long b = m11485b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f8506j = b;
        }
        this.f8507k |= m11487d(map, "X-Afma-Mediation");
        List<String> c4 = m11486c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f8509m = c4;
        }
        long b2 = m11485b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f8510n = b2;
        }
        List list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                a = C1697X.m7700g().mo9725b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                a = C1697X.m7700g().mo9712a();
            }
            this.f8511o = a;
        }
        this.f8503g = m11484a(map, "X-Afma-ActiveView");
        List list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f8514r = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.f8512p |= m11487d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f8513q = "native".equals(m11484a(map, "X-Afma-Ad-Format"));
        List list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f8515s = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f8516t = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f8517u = (String) list6.get(0);
        }
        String a2 = m11484a(map, "X-Afma-Fluid");
        if (a2 != null && a2.equals("height")) {
            this.f8518v = true;
        }
        this.f8519w = "native_express".equals(m11484a(map, "X-Afma-Ad-Format"));
        this.f8520x = zzaig.m14763a(m11484a(map, "X-Afma-Rewards"));
        if (this.f8521y == null) {
            this.f8521y = m11486c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f8522z == null) {
            this.f8522z = m11486c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f8483A |= m11487d(map, "X-Afma-Use-Displayed-Impression");
        this.f8485C |= m11487d(map, "X-Afma-Auto-Collect-Location");
        this.f8486D = m11484a(map, C6999SM.SET_COOKIE);
        String a3 = m11484a(map, "X-Afma-Auto-Protection-Configuration");
        if (a3 == null || TextUtils.isEmpty(a3)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f8502f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f8502f);
            }
            boolean booleanValue = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7929m)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f8484B = new zzael(booleanValue, Arrays.asList(new String[]{sb.toString()}));
        } else {
            try {
                this.f8484B = zzael.m14759a(new JSONObject(a3));
            } catch (JSONException e) {
                C2227Cf.m9535c("Error parsing configuration JSON", e);
                this.f8484B = new zzael();
            }
        }
        List<String> c5 = m11486c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f8487E = c5;
        }
        String a4 = m11484a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f8490H = zzaiq.m14765a(new JSONObject(a4));
            } catch (JSONException e2) {
                C2227Cf.m9535c("Error parsing safe browsing header", e2);
            }
        }
        this.f8488F |= m11487d(map, "X-Afma-Render-In-Browser");
        String a5 = m11484a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f8491I = new JSONObject(a5).getBoolean("never_pool");
            } catch (JSONException e3) {
                C2227Cf.m9535c("Error parsing interstitial pool header", e3);
            }
        }
        this.f8492J = m11487d(map, "X-Afma-Custom-Close-Blocked");
        this.f8493K = m11487d(map, "X-Afma-Enable-Omid");
        this.f8494L = m11487d(map, "X-Afma-Disable-Closable-Area");
        this.f8495M = m11484a(map, "X-Afma-Omid-Settings");
    }
}
