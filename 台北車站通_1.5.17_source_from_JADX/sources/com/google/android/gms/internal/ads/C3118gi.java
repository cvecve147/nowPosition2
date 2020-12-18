package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.gi */
public final class C3118gi extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f9374a;

    /* renamed from: b */
    private Context f9375b;

    /* renamed from: c */
    private Context f9376c;

    public C3118gi(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo9471a() {
        return this.f9374a;
    }

    /* renamed from: b */
    public final Context mo9472b() {
        return this.f9376c;
    }

    public final Object getSystemService(String str) {
        return this.f9376c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f9375b = context.getApplicationContext();
        this.f9374a = context instanceof Activity ? (Activity) context : null;
        this.f9376c = context;
        super.setBaseContext(this.f9375b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f9374a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f9375b.startActivity(intent);
    }
}
