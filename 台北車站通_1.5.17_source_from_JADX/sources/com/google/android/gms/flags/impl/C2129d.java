package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.d */
final class C2129d implements Callable<Integer> {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6593a;

    /* renamed from: b */
    private final /* synthetic */ String f6594b;

    /* renamed from: c */
    private final /* synthetic */ Integer f6595c;

    C2129d(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f6593a = sharedPreferences;
        this.f6594b = str;
        this.f6595c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f6593a.getInt(this.f6594b, this.f6595c.intValue()));
    }
}
