package p101d.p129g.p149d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2000C;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2096r;

/* renamed from: d.g.d.b */
public final class C5579b {

    /* renamed from: a */
    private final String f15555a;

    /* renamed from: b */
    private final String f15556b;

    /* renamed from: c */
    private final String f15557c;

    /* renamed from: d */
    private final String f15558d;

    /* renamed from: e */
    private final String f15559e;

    /* renamed from: f */
    private final String f15560f;

    /* renamed from: g */
    private final String f15561g;

    /* renamed from: d.g.d.b$a */
    public static final class C5580a {

        /* renamed from: a */
        private String f15562a;

        /* renamed from: b */
        private String f15563b;

        /* renamed from: c */
        private String f15564c;

        /* renamed from: d */
        private String f15565d;

        /* renamed from: e */
        private String f15566e;

        /* renamed from: f */
        private String f15567f;

        /* renamed from: g */
        private String f15568g;

        /* renamed from: a */
        public final C5580a mo15078a(String str) {
            C2061y.m9069a(str, (Object) "ApiKey must be set.");
            this.f15562a = str;
            return this;
        }

        /* renamed from: a */
        public final C5579b mo15079a() {
            return new C5579b(this.f15563b, this.f15562a, this.f15564c, this.f15565d, this.f15566e, this.f15567f, this.f15568g);
        }

        /* renamed from: b */
        public final C5580a mo15080b(String str) {
            C2061y.m9069a(str, (Object) "ApplicationId must be set.");
            this.f15563b = str;
            return this;
        }

        /* renamed from: c */
        public final C5580a mo15081c(String str) {
            this.f15566e = str;
            return this;
        }
    }

    private C5579b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2061y.m9078b(!C2096r.m9177a(str), "ApplicationId must be set.");
        this.f15556b = str;
        this.f15555a = str2;
        this.f15557c = str3;
        this.f15558d = str4;
        this.f15559e = str5;
        this.f15560f = str6;
        this.f15561g = str7;
    }

    /* renamed from: a */
    public static C5579b m21219a(Context context) {
        C2000C c = new C2000C(context);
        String a = c.mo7561a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C5579b(a, c.mo7561a("google_api_key"), c.mo7561a("firebase_database_url"), c.mo7561a("ga_trackingId"), c.mo7561a("gcm_defaultSenderId"), c.mo7561a("google_storage_bucket"), c.mo7561a("project_id"));
    }

    /* renamed from: a */
    public final String mo15073a() {
        return this.f15556b;
    }

    /* renamed from: b */
    public final String mo15074b() {
        return this.f15559e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5579b)) {
            return false;
        }
        C5579b bVar = (C5579b) obj;
        return C2059x.m9064a(this.f15556b, bVar.f15556b) && C2059x.m9064a(this.f15555a, bVar.f15555a) && C2059x.m9064a(this.f15557c, bVar.f15557c) && C2059x.m9064a(this.f15558d, bVar.f15558d) && C2059x.m9064a(this.f15559e, bVar.f15559e) && C2059x.m9064a(this.f15560f, bVar.f15560f) && C2059x.m9064a(this.f15561g, bVar.f15561g);
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f15556b, this.f15555a, this.f15557c, this.f15558d, this.f15559e, this.f15560f, this.f15561g);
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("applicationId", this.f15556b);
        a.mo7711a("apiKey", this.f15555a);
        a.mo7711a("databaseUrl", this.f15557c);
        a.mo7711a("gcmSenderId", this.f15559e);
        a.mo7711a("storageBucket", this.f15560f);
        a.mo7711a("projectId", this.f15561g);
        return a.toString();
    }
}
