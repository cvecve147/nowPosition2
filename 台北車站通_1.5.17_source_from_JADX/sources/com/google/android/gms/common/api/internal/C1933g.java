package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C2066m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2000C;
import com.google.android.gms.common.internal.C2058w;
import com.google.android.gms.common.internal.C2061y;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C1933g {

    /* renamed from: a */
    private static final Object f6256a = new Object();

    /* renamed from: b */
    private static C1933g f6257b;

    /* renamed from: c */
    private final String f6258c;

    /* renamed from: d */
    private final Status f6259d;

    /* renamed from: e */
    private final boolean f6260e;

    /* renamed from: f */
    private final boolean f6261f;

    C1933g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C2066m.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            z = resources.getInteger(identifier) == 0 ? false : z;
            this.f6261f = !z;
        } else {
            this.f6261f = false;
        }
        this.f6260e = z;
        String a = C2058w.m9059a(context);
        a = a == null ? new C2000C(context).mo7561a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.f6259d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f6258c = null;
            return;
        }
        this.f6258c = a;
        this.f6259d = Status.f6044a;
    }

    /* renamed from: a */
    public static Status m8590a(Context context) {
        Status status;
        C2061y.m9068a(context, (Object) "Context must not be null.");
        synchronized (f6256a) {
            if (f6257b == null) {
                f6257b = new C1933g(context);
            }
            status = f6257b.f6259d;
        }
        return status;
    }

    /* renamed from: a */
    private static C1933g m8591a(String str) {
        C1933g gVar;
        synchronized (f6256a) {
            if (f6257b != null) {
                gVar = f6257b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public static String m8592a() {
        return m8591a("getGoogleAppId").f6258c;
    }

    /* renamed from: b */
    public static boolean m8593b() {
        return m8591a("isMeasurementExplicitlyDisabled").f6261f;
    }
}
