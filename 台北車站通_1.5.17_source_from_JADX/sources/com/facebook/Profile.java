package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C1357M();

    /* renamed from: a */
    private final String f4848a;

    /* renamed from: b */
    private final String f4849b;

    /* renamed from: c */
    private final String f4850c;

    /* renamed from: d */
    private final String f4851d;

    /* renamed from: e */
    private final String f4852e;

    /* renamed from: f */
    private final Uri f4853f;

    private Profile(Parcel parcel) {
        this.f4848a = parcel.readString();
        this.f4849b = parcel.readString();
        this.f4850c = parcel.readString();
        this.f4851d = parcel.readString();
        this.f4852e = parcel.readString();
        String readString = parcel.readString();
        this.f4853f = readString == null ? null : Uri.parse(readString);
    }

    /* synthetic */ Profile(Parcel parcel, C1356L l) {
        this(parcel);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C1484ca.m6977a(str, "id");
        this.f4848a = str;
        this.f4849b = str2;
        this.f4850c = str3;
        this.f4851d = str4;
        this.f4852e = str5;
        this.f4853f = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f4848a = jSONObject.optString("id", (String) null);
        this.f4849b = jSONObject.optString("first_name", (String) null);
        this.f4850c = jSONObject.optString("middle_name", (String) null);
        this.f4851d = jSONObject.optString("last_name", (String) null);
        this.f4852e = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f4853f = optString != null ? Uri.parse(optString) : uri;
    }

    /* renamed from: a */
    public static void m6616a() {
        AccessToken b = AccessToken.m6460b();
        if (b == null) {
            m6617a((Profile) null);
        } else {
            C1480ba.m6941a(b.mo5894h(), (C1480ba.C1481a) new C1356L());
        }
    }

    /* renamed from: a */
    public static void m6617a(Profile profile) {
        C1359O.m6608b().mo6000a(profile);
    }

    /* renamed from: b */
    public static Profile m6618b() {
        return C1359O.m6608b().mo5999a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo6009c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4848a);
            jSONObject.put("first_name", this.f4849b);
            jSONObject.put("middle_name", this.f4850c);
            jSONObject.put("last_name", this.f4851d);
            jSONObject.put("name", this.f4852e);
            if (this.f4853f == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f4853f.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.f4848a.equals(profile.f4848a) || this.f4849b != null) {
            if (!this.f4849b.equals(profile.f4849b) || this.f4850c != null) {
                if (!this.f4850c.equals(profile.f4850c) || this.f4851d != null) {
                    if (!this.f4851d.equals(profile.f4851d) || this.f4852e != null) {
                        if (!this.f4852e.equals(profile.f4852e) || this.f4853f != null) {
                            return this.f4853f.equals(profile.f4853f);
                        }
                        if (profile.f4853f == null) {
                            return true;
                        }
                    } else if (profile.f4852e == null) {
                        return true;
                    }
                } else if (profile.f4851d == null) {
                    return true;
                }
            } else if (profile.f4850c == null) {
                return true;
            }
        } else if (profile.f4849b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = 527 + this.f4848a.hashCode();
        String str = this.f4849b;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f4850c;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f4851d;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f4852e;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f4853f;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4848a);
        parcel.writeString(this.f4849b);
        parcel.writeString(this.f4850c);
        parcel.writeString(this.f4851d);
        parcel.writeString(this.f4852e);
        Uri uri = this.f4853f;
        parcel.writeString(uri == null ? null : uri.toString());
    }
}
