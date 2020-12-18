package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C2066m;

/* renamed from: com.google.android.gms.common.internal.C */
public class C2000C {

    /* renamed from: a */
    private final Resources f6379a;

    /* renamed from: b */
    private final String f6380b = this.f6379a.getResourcePackageName(C2066m.common_google_play_services_unknown_issue);

    public C2000C(Context context) {
        C2061y.m9067a(context);
        this.f6379a = context.getResources();
    }

    /* renamed from: a */
    public String mo7561a(String str) {
        int identifier = this.f6379a.getIdentifier(str, "string", this.f6380b);
        if (identifier == 0) {
            return null;
        }
        return this.f6379a.getString(identifier);
    }
}
