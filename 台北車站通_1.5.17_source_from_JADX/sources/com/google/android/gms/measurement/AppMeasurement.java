package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.api.internal.C1933g;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.measurement.C3715Aa;
import com.google.android.gms.internal.measurement.C3871mc;
import com.google.android.gms.internal.measurement.C3894sb;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;

@Keep
@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final C3715Aa zzacw;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C2061y.m9067a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = C3871mc.m15525b(obj);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C3996a extends FirebaseAnalytics.C4027a {

        /* renamed from: a */
        public static final String[] f11903a = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};

        /* renamed from: b */
        public static final String[] f11904b = {"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep"};

        /* renamed from: a */
        public static String m16124a(String str) {
            return C3871mc.m15511a(str, f11903a, f11904b);
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    public interface C3997b {
        /* renamed from: a */
        void mo11330a(String str, String str2, Bundle bundle, long j);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$c */
    public interface C3998c {
        /* renamed from: a */
        void mo11331a(String str, String str2, Bundle bundle, long j);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$d */
    public static final class C3999d extends FirebaseAnalytics.C4028b {

        /* renamed from: a */
        public static final String[] f11905a = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};

        /* renamed from: b */
        public static final String[] f11906b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};

        /* renamed from: a */
        public static String m16127a(String str) {
            return C3871mc.m15511a(str, f11905a, f11906b);
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$e */
    public static final class C4000e extends FirebaseAnalytics.C4029c {

        /* renamed from: a */
        public static final String[] f11907a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};

        /* renamed from: b */
        public static final String[] f11908b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};

        /* renamed from: a */
        public static String m16128a(String str) {
            return C3871mc.m15511a(str, f11907a, f11908b);
        }
    }

    public AppMeasurement(C3715Aa aa) {
        C2061y.m9067a(aa);
        this.zzacw = aa;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return C3715Aa.m14845a(context).mo10377E();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zzacw.mo10396u().mo10807a(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzacw.mo10397v().mo10612a(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zzacw.mo10397v().mo10616a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zzacw.mo10396u().mo10808b(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzacw.mo10392h().mo10804y();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zzacw.mo10397v().mo10598B();
    }

    public Boolean getBoolean() {
        return this.zzacw.mo10397v().mo10599C();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zzacw.mo10397v().mo10618b(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        this.zzacw.mo10397v().mo10604a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        C3894sb z = this.zzacw.mo10400y().mo10973z();
        if (z != null) {
            return z.f11640b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        C3894sb z = this.zzacw.mo10400y().mo10973z();
        if (z != null) {
            return z.f11639a;
        }
        return null;
    }

    public Double getDouble() {
        return this.zzacw.mo10397v().mo10602F();
    }

    @Keep
    public String getGmpAppId() {
        try {
            return C1933g.m8592a();
        } catch (IllegalStateException e) {
            this.zzacw.mo10385b().mo10585y().mo10593a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public Integer getInteger() {
        return this.zzacw.mo10397v().mo10601E();
    }

    public Long getLong() {
        return this.zzacw.mo10397v().mo10600D();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.zzacw.mo10397v();
        C2061y.m9076b(str);
        return 25;
    }

    public String getString() {
        return this.zzacw.mo10397v().mo10597A();
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzacw.mo10397v().mo10606a(str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<zzjx> b = this.zzacw.mo10397v().mo10619b(z);
        C1080b bVar = new C1080b(b.size());
        for (zzjx next : b) {
            bVar.put(next.f11786b, next.mo11112b());
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        this.zzacw.mo10397v().mo10605a(str, str2, str3, z);
        throw null;
    }

    public final void logEvent(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.mo10397v().mo10614a("app", str, bundle, true);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.mo10397v().mo10623b(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.mo10397v().mo10613a(str, str2, bundle, j);
    }

    public void registerOnMeasurementEventListener(C3998c cVar) {
        this.zzacw.mo10397v().mo10610a(cVar);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.mo10397v().mo10608a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.mo10397v().mo10621b(conditionalUserProperty);
        throw null;
    }

    public void setEventInterceptor(C3997b bVar) {
        this.zzacw.mo10397v().mo10609a(bVar);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzacw.mo10397v().mo10617a(z);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zzacw.mo10397v().mo10607a(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzacw.mo10397v().mo10620b(j);
    }

    public final void setUserProperty(String str, String str2) {
        int d = this.zzacw.mo10392h().mo10799d(str);
        if (d != 0) {
            this.zzacw.mo10392h();
            this.zzacw.mo10392h().mo10783a(d, "_ev", C3871mc.m15510a(str, 24, true), str != null ? str.length() : 0);
            return;
        }
        setUserPropertyInternal("app", str, str2);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zzacw.mo10397v().mo10615a(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(C3998c cVar) {
        this.zzacw.mo10397v().mo10622b(cVar);
    }
}
