package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C1370a();

    /* renamed from: a */
    private static final Date f4731a = new Date(Long.MAX_VALUE);

    /* renamed from: b */
    private static final Date f4732b = f4731a;

    /* renamed from: c */
    private static final Date f4733c = new Date();

    /* renamed from: d */
    private static final C1427h f4734d = C1427h.FACEBOOK_APPLICATION_WEB;

    /* renamed from: e */
    private final Date f4735e;

    /* renamed from: f */
    private final Set<String> f4736f;

    /* renamed from: g */
    private final Set<String> f4737g;

    /* renamed from: h */
    private final String f4738h;

    /* renamed from: i */
    private final C1427h f4739i;

    /* renamed from: j */
    private final Date f4740j;

    /* renamed from: k */
    private final String f4741k;

    /* renamed from: l */
    private final String f4742l;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C1335a {
        /* renamed from: a */
        void mo5900a(AccessToken accessToken);

        /* renamed from: a */
        void mo5901a(C1574p pVar);
    }

    AccessToken(Parcel parcel) {
        this.f4735e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f4736f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4737g = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f4738h = parcel.readString();
        this.f4739i = C1427h.valueOf(parcel.readString());
        this.f4740j = new Date(parcel.readLong());
        this.f4741k = parcel.readString();
        this.f4742l = parcel.readString();
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, C1427h hVar, Date date, Date date2) {
        C1484ca.m6977a(str, "accessToken");
        C1484ca.m6977a(str2, "applicationId");
        C1484ca.m6977a(str3, "userId");
        this.f4735e = date == null ? f4732b : date;
        this.f4736f = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f4737g = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f4738h = str;
        this.f4739i = hVar == null ? f4734d : hVar;
        this.f4740j = date2 == null ? f4733c : date2;
        this.f4741k = str2;
        this.f4742l = str3;
    }

    /* renamed from: a */
    static AccessToken m6455a(Bundle bundle) {
        List<String> a = m6457a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> a2 = m6457a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String a3 = C1354J.m6593a(bundle);
        if (C1480ba.m6958b(a3)) {
            a3 = C1601x.m7389c();
        }
        String str = a3;
        String c = C1354J.m6597c(bundle);
        try {
            return new AccessToken(c, str, C1480ba.m6934a(c).getString("id"), a, a2, C1354J.m6596b(bundle), C1354J.m6594a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C1354J.m6594a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static AccessToken m6456a(JSONObject jSONObject) {
        if (jSONObject.getInt(ClientCookie.VERSION_ATTR) <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            return new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), C1480ba.m6931a(jSONArray), C1480ba.m6931a(jSONArray2), C1427h.valueOf(jSONObject.getString("source")), date, date2);
        }
        throw new C1574p("Unknown AccessToken serialization format.");
    }

    /* renamed from: a */
    static List<String> m6457a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        return stringArrayList == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: a */
    public static void m6458a(AccessToken accessToken) {
        C1425g.m6764c().mo6094a(accessToken);
    }

    /* renamed from: a */
    private void m6459a(StringBuilder sb) {
        String str;
        sb.append(" permissions:");
        if (this.f4736f == null) {
            str = "null";
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f4736f));
            str = "]";
        }
        sb.append(str);
    }

    /* renamed from: b */
    public static AccessToken m6460b() {
        return C1425g.m6764c().mo6095b();
    }

    /* renamed from: k */
    private String m6461k() {
        return this.f4738h == null ? "null" : C1601x.m7385a(C1355K.INCLUDE_ACCESS_TOKENS) ? this.f4738h : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: a */
    public String mo5886a() {
        return this.f4741k;
    }

    /* renamed from: c */
    public Set<String> mo5887c() {
        return this.f4737g;
    }

    /* renamed from: d */
    public Date mo5888d() {
        return this.f4735e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Date mo5890e() {
        return this.f4740j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r1 = r4.f4741k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.AccessToken
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.AccessToken r5 = (com.facebook.AccessToken) r5
            java.util.Date r1 = r4.f4735e
            java.util.Date r3 = r5.f4735e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
            java.util.Set<java.lang.String> r1 = r4.f4736f
            java.util.Set<java.lang.String> r3 = r5.f4736f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
            java.util.Set<java.lang.String> r1 = r4.f4737g
            java.util.Set<java.lang.String> r3 = r5.f4737g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r4.f4738h
            java.lang.String r3 = r5.f4738h
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
            com.facebook.h r1 = r4.f4739i
            com.facebook.h r3 = r5.f4739i
            if (r1 != r3) goto L_0x0060
            java.util.Date r1 = r4.f4740j
            java.util.Date r3 = r5.f4740j
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r4.f4741k
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r5.f4741k
            if (r1 != 0) goto L_0x0060
            goto L_0x0055
        L_0x004d:
            java.lang.String r3 = r5.f4741k
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0060
        L_0x0055:
            java.lang.String r1 = r4.f4742l
            java.lang.String r5 = r5.f4742l
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r0 = r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessToken.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public Set<String> mo5892f() {
        return this.f4736f;
    }

    /* renamed from: g */
    public C1427h mo5893g() {
        return this.f4739i;
    }

    /* renamed from: h */
    public String mo5894h() {
        return this.f4738h;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f4735e.hashCode()) * 31) + this.f4736f.hashCode()) * 31) + this.f4737g.hashCode()) * 31) + this.f4738h.hashCode()) * 31) + this.f4739i.hashCode()) * 31) + this.f4740j.hashCode()) * 31;
        String str = this.f4741k;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f4742l.hashCode();
    }

    /* renamed from: i */
    public String mo5896i() {
        return this.f4742l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public JSONObject mo5897j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ClientCookie.VERSION_ATTR, 1);
        jSONObject.put("token", this.f4738h);
        jSONObject.put("expires_at", this.f4735e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f4736f));
        jSONObject.put("declined_permissions", new JSONArray(this.f4737g));
        jSONObject.put("last_refresh", this.f4740j.getTime());
        jSONObject.put("source", this.f4739i.name());
        jSONObject.put("application_id", this.f4741k);
        jSONObject.put("user_id", this.f4742l);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m6461k());
        m6459a(sb);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4735e.getTime());
        parcel.writeStringList(new ArrayList(this.f4736f));
        parcel.writeStringList(new ArrayList(this.f4737g));
        parcel.writeString(this.f4738h);
        parcel.writeString(this.f4739i.name());
        parcel.writeLong(this.f4740j.getTime());
        parcel.writeString(this.f4741k);
        parcel.writeString(this.f4742l);
    }
}
