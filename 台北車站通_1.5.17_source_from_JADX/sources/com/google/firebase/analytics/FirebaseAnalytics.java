package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.measurement.C3715Aa;
import p101d.p129g.p131b.p132a.p144g.C5536g;

@Keep
public final class FirebaseAnalytics {
    private final C3715Aa zzacw;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public static class C4027a {
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public static class C4028b {
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$c */
    public static class C4029c {
    }

    public FirebaseAnalytics(C3715Aa aa) {
        C2061y.m9067a(aa);
        this.zzacw = aa;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        return C3715Aa.m14845a(context).mo10378F();
    }

    public final C5536g<String> getAppInstanceId() {
        return this.zzacw.mo10397v().mo10626y();
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzacw.mo10377E().logEvent(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzacw.mo10397v().mo10627z();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzacw.mo10377E().setMeasurementEnabled(z);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzacw.mo10400y().mo10967a(activity, str, str2);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zzacw.mo10377E().setMinimumSessionDuration(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzacw.mo10377E().setSessionTimeoutDuration(j);
    }

    public final void setUserId(String str) {
        this.zzacw.mo10377E().setUserPropertyInternal("app", "_id", str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzacw.mo10377E().setUserProperty(str, str2);
    }
}
