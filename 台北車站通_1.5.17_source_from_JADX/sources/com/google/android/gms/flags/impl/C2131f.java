package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.f */
final class C2131f implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6599a;

    /* renamed from: b */
    private final /* synthetic */ String f6600b;

    /* renamed from: c */
    private final /* synthetic */ String f6601c;

    C2131f(SharedPreferences sharedPreferences, String str, String str2) {
        this.f6599a = sharedPreferences;
        this.f6600b = str;
        this.f6601c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f6599a.getString(this.f6600b, this.f6601c);
    }
}
