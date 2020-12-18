package com.google.android.gms.internal.measurement;

import android.net.Uri;
import org.apache.http.HttpStatus;

/* renamed from: com.google.android.gms.internal.measurement.L */
public final class C3758L {

    /* renamed from: A */
    public static C3762M<Long> f11167A = C3762M.m14970a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: B */
    public static C3762M<Long> f11168B = C3762M.m14970a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: C */
    public static C3762M<Long> f11169C = C3762M.m14970a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: D */
    public static C3762M<Long> f11170D = C3762M.m14970a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    /* renamed from: E */
    public static C3762M<Long> f11171E = C3762M.m14970a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);

    /* renamed from: F */
    public static C3762M<Long> f11172F = C3762M.m14970a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: G */
    public static C3762M<Long> f11173G = C3762M.m14970a("measurement.upload.initial_upload_delay_time", 15000, 15000);

    /* renamed from: H */
    public static C3762M<Long> f11174H = C3762M.m14970a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: I */
    public static C3762M<Integer> f11175I = C3762M.m14969a("measurement.upload.retry_count", 6, 6);

    /* renamed from: J */
    public static C3762M<Long> f11176J = C3762M.m14970a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: K */
    public static C3762M<Integer> f11177K = C3762M.m14969a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: L */
    public static C3762M<Integer> f11178L = C3762M.m14969a("measurement.audience.filter_result_max_count", (int) HttpStatus.SC_OK, (int) HttpStatus.SC_OK);

    /* renamed from: M */
    public static C3762M<Long> f11179M = C3762M.m14970a("measurement.service_client.idle_disconnect_millis", 5000, 5000);

    /* renamed from: N */
    public static C3762M<Boolean> f11180N = C3762M.m14972a("measurement.test.boolean_flag", false, false);

    /* renamed from: O */
    public static C3762M<String> f11181O = C3762M.m14971a("measurement.test.string_flag", "---", "---");

    /* renamed from: P */
    public static C3762M<Long> f11182P = C3762M.m14970a("measurement.test.long_flag", -1, -1);

    /* renamed from: Q */
    public static C3762M<Integer> f11183Q = C3762M.m14969a("measurement.test.int_flag", -2, -2);

    /* renamed from: R */
    public static C3762M<Double> f11184R = C3762M.m14968a("measurement.test.double_flag", -3.0d, -3.0d);

    /* renamed from: S */
    public static C3762M<Boolean> f11185S = C3762M.m14972a("measurement.lifetimevalue.user_engagement_tracking_enabled", false, false);

    /* renamed from: T */
    public static C3762M<Boolean> f11186T = C3762M.m14972a("measurement.audience.complex_param_evaluation", false, false);

    /* renamed from: U */
    public static C3762M<Boolean> f11187U = C3762M.m14972a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: V */
    public static C3762M<Boolean> f11188V = C3762M.m14972a("measurement.quality.unsuccessful_update_retry_counter", false, false);

    /* renamed from: W */
    public static C3762M<Boolean> f11189W = C3762M.m14972a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: X */
    public static C3762M<Boolean> f11190X = C3762M.m14972a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: Y */
    public static C3762M<Boolean> f11191Y = C3762M.m14972a("measurement.run_on_worker_inline", true, false);

    /* renamed from: Z */
    private static C3762M<Boolean> f11192Z = C3762M.m14972a("measurement.audience.dynamic_filters", false, false);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C3819_c f11193a;

    /* renamed from: aa */
    public static C3762M<Boolean> f11194aa = C3762M.m14972a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: b */
    private static C3762M<Boolean> f11195b = C3762M.m14972a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: c */
    private static C3762M<Boolean> f11196c = C3762M.m14972a("measurement.log_installs_enabled", false, false);

    /* renamed from: d */
    private static C3762M<Boolean> f11197d = C3762M.m14972a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: e */
    private static C3762M<Boolean> f11198e = C3762M.m14972a("measurement.log_androidId_enabled", false, false);

    /* renamed from: f */
    public static C3762M<Boolean> f11199f = C3762M.m14972a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: g */
    public static C3762M<String> f11200g = C3762M.m14971a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: h */
    public static C3762M<Long> f11201h = C3762M.m14970a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: i */
    public static C3762M<Long> f11202i = C3762M.m14970a("measurement.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: j */
    public static C3762M<Long> f11203j = C3762M.m14970a("measurement.config.cache_time", 86400000, 3600000);

    /* renamed from: k */
    public static C3762M<String> f11204k = C3762M.m14971a("measurement.config.url_scheme", "https", "https");

    /* renamed from: l */
    public static C3762M<String> f11205l = C3762M.m14971a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");

    /* renamed from: m */
    public static C3762M<Integer> f11206m = C3762M.m14969a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: n */
    public static C3762M<Integer> f11207n = C3762M.m14969a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: o */
    public static C3762M<Integer> f11208o = C3762M.m14969a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: p */
    public static C3762M<Integer> f11209p = C3762M.m14969a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: q */
    public static C3762M<Integer> f11210q = C3762M.m14969a("measurement.upload.max_events_per_day", 100000, 100000);

    /* renamed from: r */
    public static C3762M<Integer> f11211r = C3762M.m14969a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* renamed from: s */
    public static C3762M<Integer> f11212s = C3762M.m14969a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* renamed from: t */
    public static C3762M<Integer> f11213t = C3762M.m14969a("measurement.upload.max_conversions_per_day", (int) HttpStatus.SC_INTERNAL_SERVER_ERROR, (int) HttpStatus.SC_INTERNAL_SERVER_ERROR);

    /* renamed from: u */
    public static C3762M<Integer> f11214u = C3762M.m14969a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: v */
    public static C3762M<Integer> f11215v = C3762M.m14969a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* renamed from: w */
    public static C3762M<String> f11216w = C3762M.m14971a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");

    /* renamed from: x */
    public static C3762M<Long> f11217x = C3762M.m14970a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: y */
    public static C3762M<Long> f11218y = C3762M.m14970a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: z */
    public static C3762M<Long> f11219z = C3762M.m14970a("measurement.upload.interval", 3600000, 3600000);

    static {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
        f11193a = new C3819_c(Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/")));
    }
}
