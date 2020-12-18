package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.List;

@C2478La
public final class zzhl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhl> CREATOR = new C3100fs();

    /* renamed from: a */
    public final String f10867a;

    /* renamed from: b */
    private final long f10868b;

    /* renamed from: c */
    private final String f10869c;

    /* renamed from: d */
    private final String f10870d;

    /* renamed from: e */
    private final String f10871e;

    /* renamed from: f */
    private final Bundle f10872f;

    /* renamed from: g */
    private final boolean f10873g;

    /* renamed from: h */
    private long f10874h;

    zzhl(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f10867a = str;
        this.f10868b = j;
        String str5 = "";
        this.f10869c = str2 == null ? str5 : str2;
        this.f10870d = str3 == null ? str5 : str3;
        this.f10871e = str4 != null ? str4 : str5;
        this.f10872f = bundle == null ? new Bundle() : bundle;
        this.f10873g = z;
        this.f10874h = j2;
    }

    /* renamed from: a */
    public static zzhl m14772a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C2227Cf.m9536d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String next : C1697X.m7700g().mo9718a(uri)) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzhl(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            C2227Cf.m9535c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static zzhl m14773a(String str) {
        return m14772a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10867a, false);
        C2049b.m9031a(parcel, 3, this.f10868b);
        C2049b.m9038a(parcel, 4, this.f10869c, false);
        C2049b.m9038a(parcel, 5, this.f10870d, false);
        C2049b.m9038a(parcel, 6, this.f10871e, false);
        C2049b.m9032a(parcel, 7, this.f10872f, false);
        C2049b.m9040a(parcel, 8, this.f10873g);
        C2049b.m9031a(parcel, 9, this.f10874h);
        C2049b.m9026a(parcel, a);
    }
}
