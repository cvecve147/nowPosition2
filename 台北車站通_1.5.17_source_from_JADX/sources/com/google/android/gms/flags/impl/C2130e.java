package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.e */
final class C2130e implements Callable<Long> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6596a;

    /* renamed from: b */
    private final /* synthetic */ String f6597b;

    /* renamed from: c */
    private final /* synthetic */ Long f6598c;

    C2130e(SharedPreferences sharedPreferences, String str, Long l) {
        this.f6596a = sharedPreferences;
        this.f6597b = str;
        this.f6598c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f6596a.getLong(this.f6597b, this.f6598c.longValue()));
    }
}
