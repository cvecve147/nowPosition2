package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.mf */
final class C3290mf implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f9786a;

    /* renamed from: b */
    private final /* synthetic */ Context f9787b;

    C3290mf(C3233kf kfVar, Context context, Context context2) {
        this.f9786a = context;
        this.f9787b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f9786a != null) {
            C2857Yd.m11615f("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f9786a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C2857Yd.m11615f("Attempting to read user agent from local cache.");
            sharedPreferences = this.f9787b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C2857Yd.m11615f("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f9787b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C2857Yd.m11615f("Persisting user agent.");
            }
        }
        return string;
    }
}
