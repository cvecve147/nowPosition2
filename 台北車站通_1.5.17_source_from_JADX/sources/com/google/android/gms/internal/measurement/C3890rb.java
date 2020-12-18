package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.measurement.rb */
final class C3890rb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C3814Za f11631a;

    private C3890rb(C3814Za za) {
        this.f11631a = za;
    }

    /* synthetic */ C3890rb(C3814Za za, C3817_a _aVar) {
        this(za);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            this.f11631a.mo10385b().mo10580F().mo10592a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (!(intent == null || (data = intent.getData()) == null || !data.isHierarchical())) {
                if (bundle == null) {
                    Bundle a = this.f11631a.mo10454o().mo10777a(data);
                    this.f11631a.mo10454o();
                    String str = C3871mc.m15515a(intent) ? "gs" : "auto";
                    if (a != null) {
                        this.f11631a.mo10623b(str, "_cmp", a);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                        this.f11631a.mo10385b().mo10579E().mo10592a("Activity created with data 'referrer' param without gclid and at least one utm field");
                        return;
                    }
                    this.f11631a.mo10385b().mo10579E().mo10593a("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.f11631a.mo10615a("auto", "_ldl", (Object) queryParameter);
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            this.f11631a.mo10385b().mo10585y().mo10593a("Throwable caught in onActivityCreated", e);
        }
        this.f11631a.mo10570l().mo10966a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f11631a.mo10570l().mo10965a(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f11631a.mo10570l().mo10969b(activity);
        C3799Vb p = this.f11631a.mo10572p();
        p.mo10386c().mo11020a((Runnable) new C3815Zb(p, p.mo10382a().mo7726b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f11631a.mo10570l().mo10971c(activity);
        C3799Vb p = this.f11631a.mo10572p();
        p.mo10386c().mo11020a((Runnable) new C3811Yb(p, p.mo10382a().mo7726b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f11631a.mo10570l().mo10970b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
