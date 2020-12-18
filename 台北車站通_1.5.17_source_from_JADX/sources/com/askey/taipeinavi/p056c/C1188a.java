package com.askey.taipeinavi.p056c;

import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.askey.taipeinavi.c.a */
class C1188a implements C1189b {

    /* renamed from: a */
    private FirebaseAnalytics f4362a;

    /* renamed from: b */
    private String f4363b = "push_token";

    C1188a() {
    }

    /* renamed from: a */
    public void mo5482a(Application application) {
        if (this.f4362a == null) {
            this.f4362a = FirebaseAnalytics.getInstance(application);
        }
    }

    /* renamed from: a */
    public void mo5483a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(this.f4363b, str);
        this.f4362a.logEvent(str2, bundle);
    }
}
