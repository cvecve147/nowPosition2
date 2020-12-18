package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.p074a.C2126a;

/* renamed from: com.google.android.gms.flags.impl.b */
public class C2127b {

    /* renamed from: a */
    private static SharedPreferences f6589a;

    /* renamed from: a */
    public static SharedPreferences m9224a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f6589a == null) {
                f6589a = (SharedPreferences) C2126a.m9223a(new C2132g(context));
            }
            sharedPreferences = f6589a;
        }
        return sharedPreferences;
    }
}
