package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1522v;
import com.facebook.internal.C1525y;
import java.net.HttpURLConnection;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C1577s();

    /* renamed from: a */
    static final C1342b f4763a = new C1342b(HttpStatus.SC_OK, 299, (C1577s) null);

    /* renamed from: b */
    private final C1341a f4764b;

    /* renamed from: c */
    private final int f4765c;

    /* renamed from: d */
    private final int f4766d;

    /* renamed from: e */
    private final int f4767e;

    /* renamed from: f */
    private final String f4768f;

    /* renamed from: g */
    private final String f4769g;

    /* renamed from: h */
    private final String f4770h;

    /* renamed from: i */
    private final String f4771i;

    /* renamed from: j */
    private final String f4772j;

    /* renamed from: k */
    private final JSONObject f4773k;

    /* renamed from: l */
    private final JSONObject f4774l;

    /* renamed from: m */
    private final Object f4775m;

    /* renamed from: n */
    private final HttpURLConnection f4776n;

    /* renamed from: o */
    private final C1574p f4777o;

    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum C1341a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    private static class C1342b {

        /* renamed from: a */
        private final int f4782a;

        /* renamed from: b */
        private final int f4783b;

        private C1342b(int i, int i2) {
            this.f4782a = i;
            this.f4783b = i2;
        }

        /* synthetic */ C1342b(int i, int i2, C1577s sVar) {
            this(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5925a(int i) {
            return this.f4782a <= i && i <= this.f4783b;
        }
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C1574p pVar) {
        boolean z2;
        this.f4765c = i;
        this.f4766d = i2;
        this.f4767e = i3;
        this.f4768f = str;
        this.f4769g = str2;
        this.f4774l = jSONObject;
        this.f4773k = jSONObject2;
        this.f4775m = obj;
        this.f4776n = httpURLConnection;
        this.f4770h = str3;
        this.f4771i = str4;
        if (pVar != null) {
            this.f4777o = pVar;
            z2 = true;
        } else {
            this.f4777o = new C1604z(this, str2);
            z2 = false;
        }
        C1522v a = m6483a();
        this.f4764b = z2 ? C1341a.OTHER : a.mo6243a(i2, i3, z);
        this.f4772j = a.mo6244a(this.f4764b);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C1574p) null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C1574p) null);
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, C1577s sVar) {
        this(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.C1574p
            if (r1 == 0) goto L_0x000a
            com.facebook.p r0 = (com.facebook.C1574p) r0
            r15 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.p r1 = new com.facebook.p
            r1.<init>((java.lang.Throwable) r0)
            r15 = r1
        L_0x0010:
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r16
            r14 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    /* renamed from: a */
    static FacebookRequestError m6482a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("code")) {
                int i3 = jSONObject2.getInt("code");
                Object a = C1480ba.m6922a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    boolean z2 = true;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C1480ba.m6922a(jSONObject3, "error", (String) null);
                        String optString = jSONObject4.optString(SVGParser.XML_STYLESHEET_ATTR_TYPE, (String) null);
                        String optString2 = jSONObject4.optString("message", (String) null);
                        i2 = jSONObject4.optInt("code", -1);
                        int optInt = jSONObject4.optInt("error_subcode", -1);
                        str2 = jSONObject4.optString("error_user_msg", (String) null);
                        str = jSONObject4.optString("error_user_title", (String) null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str3 = optString2;
                        i = optInt;
                        str4 = optString;
                    } else {
                        if (!jSONObject3.has("error_code")) {
                            if (!jSONObject3.has("error_msg")) {
                                if (!jSONObject3.has("error_reason")) {
                                    z2 = false;
                                    z = false;
                                    i2 = -1;
                                    i = -1;
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                }
                            }
                        }
                        String optString3 = jSONObject3.optString("error_reason", (String) null);
                        String optString4 = jSONObject3.optString("error_msg", (String) null);
                        int optInt2 = jSONObject3.optInt("error_code", -1);
                        i = jSONObject3.optInt("error_subcode", -1);
                        str4 = optString3;
                        z = false;
                        str2 = null;
                        str = null;
                        str3 = optString4;
                        i2 = optInt2;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, i, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, (C1574p) null);
                    }
                }
                if (!f4763a.mo5925a(i3)) {
                    return new FacebookRequestError(i3, -1, -1, (String) null, (String) null, (String) null, (String) null, false, jSONObject2.has("body") ? (JSONObject) C1480ba.m6922a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, (C1574p) null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: a */
    static synchronized C1522v m6483a() {
        synchronized (FacebookRequestError.class) {
            C1525y b = C1430A.m6778b(C1601x.m7389c());
            if (b == null) {
                C1522v a = C1522v.m7078a();
                return a;
            }
            C1522v c = b.mo6248c();
            return c;
        }
    }

    /* renamed from: b */
    public int mo5916b() {
        return this.f4766d;
    }

    /* renamed from: c */
    public String mo5917c() {
        String str = this.f4769g;
        return str != null ? str : this.f4777o.getLocalizedMessage();
    }

    /* renamed from: d */
    public String mo5918d() {
        return this.f4768f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C1574p mo5920e() {
        return this.f4777o;
    }

    /* renamed from: f */
    public int mo5921f() {
        return this.f4765c;
    }

    /* renamed from: g */
    public int mo5922g() {
        return this.f4767e;
    }

    public String toString() {
        return "{HttpStatus: " + this.f4765c + ", errorCode: " + this.f4766d + ", errorType: " + this.f4768f + ", errorMessage: " + mo5917c() + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4765c);
        parcel.writeInt(this.f4766d);
        parcel.writeInt(this.f4767e);
        parcel.writeString(this.f4768f);
        parcel.writeString(this.f4769g);
        parcel.writeString(this.f4770h);
        parcel.writeString(this.f4771i);
    }
}
