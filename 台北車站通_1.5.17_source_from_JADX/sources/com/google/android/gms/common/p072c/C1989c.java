package com.google.android.gms.common.p072c;

import android.content.Context;

/* renamed from: com.google.android.gms.common.c.c */
public class C1989c {

    /* renamed from: a */
    private static C1989c f6363a = new C1989c();

    /* renamed from: b */
    private C1988b f6364b = null;

    /* renamed from: b */
    public static C1988b m8748b(Context context) {
        return f6363a.mo7523a(context);
    }

    /* renamed from: a */
    public synchronized C1988b mo7523a(Context context) {
        if (this.f6364b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6364b = new C1988b(context);
        }
        return this.f6364b;
    }
}
