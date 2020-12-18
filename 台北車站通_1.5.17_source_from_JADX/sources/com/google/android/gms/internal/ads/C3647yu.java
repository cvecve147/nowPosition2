package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.yu */
public final class C3647yu {

    /* renamed from: a */
    private final Context f10612a;

    public C3647yu(Context context) {
        C2061y.m9068a(context, (Object) "Context can not be null");
        this.f10612a = context;
    }

    /* renamed from: a */
    private final boolean m14643a(Intent intent) {
        C2061y.m9068a(intent, (Object) "Intent can not be null");
        return !this.f10612a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: a */
    public final boolean mo10256a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m14643a(intent);
    }

    /* renamed from: b */
    public final boolean mo10257b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m14643a(intent);
    }

    /* renamed from: c */
    public final boolean mo10258c() {
        return ((Boolean) C3171if.m12583a(this.f10612a, new C3676zu())).booleanValue() && C1989c.m8748b(this.f10612a).mo7515a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean mo10259d() {
        return m14643a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
