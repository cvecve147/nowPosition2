package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.C2095q;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lf */
final class C3261lf implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f9741a;

    C3261lf(C3233kf kfVar, Context context) {
        this.f9741a = context;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f9741a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C2857Yd.m11615f("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f9741a);
            C2095q.m9176a(this.f9741a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C2857Yd.m11615f("User agent is already initialized on Google Play Services.");
        return string;
    }
}
