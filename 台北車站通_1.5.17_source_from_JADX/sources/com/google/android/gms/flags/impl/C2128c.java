package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.c */
final class C2128c implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6590a;

    /* renamed from: b */
    private final /* synthetic */ String f6591b;

    /* renamed from: c */
    private final /* synthetic */ Boolean f6592c;

    C2128c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f6590a = sharedPreferences;
        this.f6591b = str;
        this.f6592c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f6590a.getBoolean(this.f6591b, this.f6592c.booleanValue()));
    }
}
