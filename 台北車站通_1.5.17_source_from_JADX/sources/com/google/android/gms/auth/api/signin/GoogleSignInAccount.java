package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2086h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1843a();

    /* renamed from: a */
    public static C2083e f5989a = C2086h.m9144d();

    /* renamed from: b */
    private final int f5990b;

    /* renamed from: c */
    private String f5991c;

    /* renamed from: d */
    private String f5992d;

    /* renamed from: e */
    private String f5993e;

    /* renamed from: f */
    private String f5994f;

    /* renamed from: g */
    private Uri f5995g;

    /* renamed from: h */
    private String f5996h;

    /* renamed from: i */
    private long f5997i;

    /* renamed from: j */
    private String f5998j;

    /* renamed from: k */
    private List<Scope> f5999k;

    /* renamed from: l */
    private String f6000l;

    /* renamed from: m */
    private String f6001m;

    /* renamed from: n */
    private Set<Scope> f6002n = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5990b = i;
        this.f5991c = str;
        this.f5992d = str2;
        this.f5993e = str3;
        this.f5994f = str4;
        this.f5995g = uri;
        this.f5996h = str5;
        this.f5997i = j;
        this.f5998j = str6;
        this.f5999k = list;
        this.f6000l = str7;
        this.f6001m = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m8216a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m8217a(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.mo7194b(jSONObject.optString("serverAuthCode", (String) null));
        return a;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m8217a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f5989a.mo7725a() / 1000) : l).longValue();
        C2061y.m9076b(str7);
        C2061y.m9067a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: b */
    public Account mo7193b() {
        String str = this.f5993e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: b */
    public GoogleSignInAccount mo7194b(String str) {
        this.f5996h = str;
        return this;
    }

    /* renamed from: c */
    public String mo7195c() {
        return this.f5994f;
    }

    /* renamed from: d */
    public String mo7196d() {
        return this.f5993e;
    }

    /* renamed from: e */
    public long mo7197e() {
        return this.f5997i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.mo7204j().equals(mo7204j()) && googleSignInAccount.mo7206p().equals(mo7206p());
    }

    /* renamed from: f */
    public String mo7199f() {
        return this.f6001m;
    }

    /* renamed from: g */
    public String mo7200g() {
        return this.f6000l;
    }

    /* renamed from: h */
    public String mo7201h() {
        return this.f5991c;
    }

    public int hashCode() {
        return ((mo7204j().hashCode() + 527) * 31) + mo7206p().hashCode();
    }

    /* renamed from: i */
    public String mo7203i() {
        return this.f5992d;
    }

    /* renamed from: j */
    public String mo7204j() {
        return this.f5998j;
    }

    /* renamed from: o */
    public Uri mo7205o() {
        return this.f5995g;
    }

    /* renamed from: p */
    public Set<Scope> mo7206p() {
        HashSet hashSet = new HashSet(this.f5999k);
        hashSet.addAll(this.f6002n);
        return hashSet;
    }

    /* renamed from: q */
    public String mo7207q() {
        return this.f5996h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f5990b);
        C2049b.m9038a(parcel, 2, mo7201h(), false);
        C2049b.m9038a(parcel, 3, mo7203i(), false);
        C2049b.m9038a(parcel, 4, mo7196d(), false);
        C2049b.m9038a(parcel, 5, mo7195c(), false);
        C2049b.m9034a(parcel, 6, (Parcelable) mo7205o(), i, false);
        C2049b.m9038a(parcel, 7, mo7207q(), false);
        C2049b.m9031a(parcel, 8, mo7197e());
        C2049b.m9038a(parcel, 9, mo7204j(), false);
        C2049b.m9049c(parcel, 10, this.f5999k, false);
        C2049b.m9038a(parcel, 11, mo7200g(), false);
        C2049b.m9038a(parcel, 12, mo7199f(), false);
        C2049b.m9026a(parcel, a);
    }
}
