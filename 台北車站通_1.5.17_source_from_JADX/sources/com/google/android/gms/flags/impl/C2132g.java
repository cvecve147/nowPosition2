package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.g */
final class C2132g implements Callable<SharedPreferences> {

    /* renamed from: a */
    private final /* synthetic */ Context f6602a;

    C2132g(Context context) {
        this.f6602a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f6602a.getSharedPreferences("google_sdk_flags", 0);
    }
}
