package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C1984b();

    /* renamed from: a */
    public static final ConnectionResult f6007a = new ConnectionResult(0);

    /* renamed from: b */
    private final int f6008b;

    /* renamed from: c */
    private final int f6009c;

    /* renamed from: d */
    private final PendingIntent f6010d;

    /* renamed from: e */
    private final String f6011e;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f6008b = i;
        this.f6009c = i2;
        this.f6010d = pendingIntent;
        this.f6011e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: c */
    static String m8236c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: b */
    public final int mo7213b() {
        return this.f6009c;
    }

    /* renamed from: c */
    public final String mo7214c() {
        return this.f6011e;
    }

    /* renamed from: d */
    public final PendingIntent mo7215d() {
        return this.f6010d;
    }

    /* renamed from: e */
    public final boolean mo7216e() {
        return (this.f6009c == 0 || this.f6010d == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f6009c == connectionResult.f6009c && C2059x.m9064a(this.f6010d, connectionResult.f6010d) && C2059x.m9064a(this.f6011e, connectionResult.f6011e);
    }

    /* renamed from: f */
    public final boolean mo7218f() {
        return this.f6009c == 0;
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f6009c), this.f6010d, this.f6011e);
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("statusCode", m8236c(this.f6009c));
        a.mo7711a("resolution", this.f6010d);
        a.mo7711a("message", this.f6011e);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6008b);
        C2049b.m9030a(parcel, 2, mo7213b());
        C2049b.m9034a(parcel, 3, (Parcelable) mo7215d(), i, false);
        C2049b.m9038a(parcel, 4, mo7214c(), false);
        C2049b.m9026a(parcel, a);
    }
}
