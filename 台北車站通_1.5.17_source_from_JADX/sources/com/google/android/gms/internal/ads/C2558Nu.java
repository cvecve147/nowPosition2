package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.caverock.androidsvg.BuildConfig;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Nu */
public final class C2558Nu {

    /* renamed from: A */
    public static final C2271Du<Long> f7704A = C2271Du.m9662a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: Aa */
    public static final C2271Du<Long> f7705Aa = C2271Du.m9662a(0, "gads:app_index:timeout_ms", 1000);

    /* renamed from: Ab */
    public static final C2271Du<String> f7706Ab = C2271Du.m9664a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: Ac */
    public static final C2271Du<Boolean> f7707Ac = C2271Du.m9663a(0, "gass:enable_int_signal", (Boolean) true);

    /* renamed from: Ad */
    private static final C2271Du<Boolean> f7708Ad = C2271Du.m9663a(1, "gads:parental_controls:send_from_client", (Boolean) true);

    /* renamed from: Ae */
    public static final C2271Du<Boolean> f7709Ae = C2271Du.m9663a(1, "gads:nonagon:banner:check_dp_size", (Boolean) false);

    /* renamed from: B */
    public static final C2271Du<Long> f7710B = C2271Du.m9662a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: Ba */
    private static final C2271Du<String> f7711Ba = C2271Du.m9659a(0, "gads:app_index:experiment_id");

    /* renamed from: Bb */
    public static final C2271Du<Integer> f7712Bb = C2271Du.m9661a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: Bc */
    public static final C2271Du<Boolean> f7713Bc = C2271Du.m9663a(0, "gass:enable_ad_attestation_signal", (Boolean) true);

    /* renamed from: Bd */
    private static final C2271Du<Boolean> f7714Bd = C2271Du.m9663a(1, "gads:parental_controls:cache_results", (Boolean) true);

    /* renamed from: Be */
    private static final C2271Du<Boolean> f7715Be = C2271Du.m9663a(1, "gads:nonagon:service:enabled", (Boolean) false);

    /* renamed from: C */
    public static final C2271Du<Integer> f7716C = C2271Du.m9661a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: Ca */
    private static final C2271Du<String> f7717Ca = C2271Du.m9659a(0, "gads:kitkat_interstitial_workaround:experiment_id");

    /* renamed from: Cb */
    public static final C2271Du<Integer> f7718Cb = C2271Du.m9661a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: Cc */
    private static final C2271Du<Boolean> f7719Cc = C2271Du.m9663a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);

    /* renamed from: Cd */
    public static final C2271Du<Long> f7720Cd = C2271Du.m9662a(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: Ce */
    private static final C2271Du<Boolean> f7721Ce = C2271Du.m9663a(1, "gads:signals:ad_id_info:enabled", (Boolean) false);

    /* renamed from: D */
    public static final C2271Du<Boolean> f7722D = C2271Du.m9663a(0, "gads:video:metric_reporting_enabled", (Boolean) false);

    /* renamed from: Da */
    public static final C2271Du<Boolean> f7723Da = C2271Du.m9663a(0, "gads:kitkat_interstitial_workaround:enabled", (Boolean) true);

    /* renamed from: Db */
    public static final C2271Du<Integer> f7724Db = C2271Du.m9661a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* renamed from: Dc */
    private static final C2271Du<Boolean> f7725Dc = C2271Du.m9663a(0, "gads:edu_device_helper:enabled", (Boolean) true);

    /* renamed from: Dd */
    private static final C2271Du<String> f7726Dd = C2271Du.m9664a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: De */
    private static final C2271Du<Boolean> f7727De = C2271Du.m9663a(1, "gads:signals:app_index:enabled", (Boolean) false);

    /* renamed from: E */
    public static final C2271Du<String> f7728E = C2271Du.m9664a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: Ea */
    public static final C2271Du<Boolean> f7729Ea = C2271Du.m9663a(0, "gads:interstitial_follow_url", (Boolean) true);

    /* renamed from: Eb */
    public static final C2271Du<String> f7730Eb = C2271Du.m9664a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: Ec */
    public static final C2271Du<Boolean> f7731Ec = C2271Du.m9663a(0, "gads:support_screen_shot", (Boolean) true);

    /* renamed from: Ed */
    private static final C2271Du<Long> f7732Ed = C2271Du.m9662a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);

    /* renamed from: Ee */
    private static final C2271Du<Boolean> f7733Ee = C2271Du.m9663a(1, "gads:signals:cache:enabled", (Boolean) false);

    /* renamed from: F */
    public static final C2271Du<Long> f7734F = C2271Du.m9662a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: Fa */
    public static final C2271Du<Boolean> f7735Fa = C2271Du.m9663a(0, "gads:interstitial_follow_url:register_click", (Boolean) true);

    /* renamed from: Fb */
    public static final C2271Du<Integer> f7736Fb = C2271Du.m9661a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* renamed from: Fc */
    public static final C2271Du<Boolean> f7737Fc = C2271Du.m9663a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", (Boolean) true);

    /* renamed from: Fd */
    public static final C2271Du<Boolean> f7738Fd = C2271Du.m9663a(0, "gads:safe_browsing:debug", (Boolean) false);

    /* renamed from: Fe */
    private static final C2271Du<Boolean> f7739Fe = C2271Du.m9663a(1, "gads:signals:doritos:enabled", (Boolean) false);

    /* renamed from: G */
    public static final C2271Du<Boolean> f7740G = C2271Du.m9663a(1, "gads:video:force_watermark", (Boolean) false);

    /* renamed from: Ga */
    private static final C2271Du<String> f7741Ga = C2271Du.m9659a(0, "gads:interstitial_follow_url:experiment_id");

    /* renamed from: Gb */
    public static final C2271Du<Integer> f7742Gb = C2271Du.m9661a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* renamed from: Gc */
    private static final C2271Du<String> f7743Gc = C2271Du.m9659a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");

    /* renamed from: Gd */
    public static final C2271Du<Boolean> f7744Gd = C2271Du.m9663a(0, "gads:webview_cookie:enabled", (Boolean) true);

    /* renamed from: Ge */
    private static final C2271Du<Boolean> f7745Ge = C2271Du.m9663a(1, "gads:signals:location:enabled", (Boolean) false);

    /* renamed from: H */
    public static final C2271Du<Long> f7746H = C2271Du.m9662a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: Ha */
    private static final C2271Du<Boolean> f7747Ha = C2271Du.m9663a(0, "gads:analytics_enabled", (Boolean) true);

    /* renamed from: Hb */
    public static final C2271Du<Long> f7748Hb = C2271Du.m9662a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);

    /* renamed from: Hc */
    private static final C2271Du<String> f7749Hc = C2271Du.m9659a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: Hd */
    private static final C2271Du<Integer> f7750Hd = C2271Du.m9661a(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: He */
    private static final C2271Du<Boolean> f7751He = C2271Du.m9663a(1, "gads:signals:network_prediction:enabled", (Boolean) false);

    /* renamed from: I */
    public static final C2271Du<Boolean> f7752I = C2271Du.m9663a(1, "gads:video:spinner:enabled", (Boolean) false);

    /* renamed from: Ia */
    public static final C2271Du<Boolean> f7753Ia = C2271Du.m9663a(0, "gads:ad_key_enabled", (Boolean) false);

    /* renamed from: Ib */
    public static final C2271Du<Long> f7754Ib = C2271Du.m9662a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);

    /* renamed from: Ic */
    public static final C2271Du<String> f7755Ic = C2271Du.m9664a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: Id */
    private static final C2271Du<Integer> f7756Id = C2271Du.m9661a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: Ie */
    private static final C2271Du<Boolean> f7757Ie = C2271Du.m9663a(1, "gads:signals:parental_control:enabled", (Boolean) false);

    /* renamed from: J */
    public static final C2271Du<Integer> f7758J = C2271Du.m9661a(1, "gads:video:spinner:scale", 4);

    /* renamed from: Ja */
    public static final C2271Du<Boolean> f7759Ja = C2271Du.m9663a(1, "gads:sai:enabled", (Boolean) true);

    /* renamed from: Jb */
    public static final C2271Du<Float> f7760Jb = C2271Du.m9660a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* renamed from: Jc */
    public static final C2271Du<Long> f7761Jc = C2271Du.m9662a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: Jd */
    private static final C2271Du<Long> f7762Jd = C2271Du.m9662a(1, "gads:cache:javascript_timeout_millis", 5000);

    /* renamed from: Je */
    public static final C2271Du<Long> f7763Je = C2271Du.m9662a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: K */
    public static final C2271Du<Long> f7764K = C2271Du.m9662a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: Ka */
    public static final C2271Du<Boolean> f7765Ka = C2271Du.m9663a(1, "gads:sai:banner_ad_enabled", (Boolean) true);

    /* renamed from: Kb */
    public static final C2271Du<Float> f7766Kb = C2271Du.m9660a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* renamed from: Kc */
    public static final C2271Du<Boolean> f7767Kc = C2271Du.m9663a(0, "gads:js_flags:mf", (Boolean) false);

    /* renamed from: Kd */
    public static final C2271Du<Boolean> f7768Kd = C2271Du.m9663a(1, "gads:cache:bind_on_foreground", (Boolean) false);

    /* renamed from: Ke */
    public static final C2271Du<String> f7769Ke = C2271Du.m9664a(0, "gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);

    /* renamed from: L */
    public static final C2271Du<Boolean> f7770L = C2271Du.m9663a(1, "gads:video:aggressive_media_codec_release", (Boolean) false);

    /* renamed from: La */
    public static final C2271Du<Boolean> f7771La = C2271Du.m9663a(1, "gads:sai:native_ad_enabled", (Boolean) true);

    /* renamed from: Lb */
    public static final C2271Du<Boolean> f7772Lb = C2271Du.m9663a(0, "gads:debug_logging_feature:enable", (Boolean) false);

    /* renamed from: Lc */
    private static final C2271Du<Boolean> f7773Lc = C2271Du.m9663a(1, "gads:js_flags:disable_phenotype", (Boolean) false);

    /* renamed from: Ld */
    public static final C2271Du<Boolean> f7774Ld = C2271Du.m9663a(1, "gads:cache:bind_on_init", (Boolean) false);

    /* renamed from: Le */
    public static final C2271Du<Boolean> f7775Le = C2271Du.m9663a(1, "gads:real_test_request:enabled", (Boolean) true);

    /* renamed from: M */
    public static final C2271Du<Boolean> f7776M = C2271Du.m9663a(1, "gads:memory_bundle:debug_info", (Boolean) false);

    /* renamed from: Ma */
    public static final C2271Du<Boolean> f7777Ma = C2271Du.m9663a(1, "gads:sai:interstitial_ad_enabled", (Boolean) true);

    /* renamed from: Mb */
    public static final C2271Du<Boolean> f7778Mb = C2271Du.m9663a(0, "gads:debug_logging_feature:intercept_web_view", (Boolean) false);

    /* renamed from: Mc */
    public static final C2271Du<Boolean> f7779Mc = C2271Du.m9663a(0, "gads:custom_render:ping_on_ad_rendered", (Boolean) false);

    /* renamed from: Md */
    public static final C2271Du<Boolean> f7780Md = C2271Du.m9663a(1, "gads:cache:bind_on_request", (Boolean) false);

    /* renamed from: Me */
    public static final C2271Du<Boolean> f7781Me = C2271Du.m9663a(1, "gads:real_test_request:render_webview_label", (Boolean) true);

    /* renamed from: N */
    public static final C2271Du<Boolean> f7782N = C2271Du.m9663a(1, "gads:memory_bundle:runtime_info", (Boolean) true);

    /* renamed from: Na */
    public static final C2271Du<Boolean> f7783Na = C2271Du.m9663a(1, "gads:sai:rewardedvideo_ad_enabled", (Boolean) true);

    /* renamed from: Nb */
    private static final C2271Du<Integer> f7784Nb = C2271Du.m9661a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: Nc */
    public static final C2271Du<String> f7785Nc = C2271Du.m9664a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: Nd */
    public static final C2271Du<Long> f7786Nd = C2271Du.m9662a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: Ne */
    public static final C2271Du<Boolean> f7787Ne = C2271Du.m9663a(1, "gads:real_test_request:render_native_label", (Boolean) true);

    /* renamed from: O */
    public static final C2271Du<String> f7788O = C2271Du.m9664a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: Oa */
    public static final C2271Du<String> f7789Oa = C2271Du.m9664a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: Ob */
    public static final C2271Du<String> f7790Ob = C2271Du.m9664a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: Oc */
    private static final C2271Du<String> f7791Oc = C2271Du.m9664a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* renamed from: Od */
    public static final C2271Du<Boolean> f7792Od = C2271Du.m9663a(1, "gads:cache:use_cache_data_source", (Boolean) false);

    /* renamed from: Oe */
    public static final C2271Du<Integer> f7793Oe = C2271Du.m9661a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: P */
    public static final C2271Du<Integer> f7794P = C2271Du.m9661a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: Pa */
    public static final C2271Du<String> f7795Pa = C2271Du.m9664a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: Pb */
    public static final C2271Du<String> f7796Pb = C2271Du.m9664a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: Pc */
    private static final C2271Du<String> f7797Pc = C2271Du.m9664a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: Pd */
    private static final C2271Du<Boolean> f7798Pd = C2271Du.m9663a(1, "gads:cache:connection_per_read", (Boolean) false);

    /* renamed from: Pe */
    public static final C2271Du<Integer> f7799Pe = C2271Du.m9661a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);

    /* renamed from: Q */
    private static final C2271Du<Boolean> f7800Q = C2271Du.m9663a(0, "gads:ad_id_app_context:enabled", (Boolean) false);

    /* renamed from: Qa */
    public static final C2271Du<Boolean> f7801Qa = C2271Du.m9663a(1, "gads:sai:click_gmsg_enabled", (Boolean) true);

    /* renamed from: Qb */
    public static final C2271Du<Boolean> f7802Qb = C2271Du.m9663a(0, "gads:log:verbose_enabled", (Boolean) false);

    /* renamed from: Qc */
    public static final C2271Du<String> f7803Qc = C2271Du.m9664a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: Qd */
    private static final C2271Du<Long> f7804Qd = C2271Du.m9662a(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: Qe */
    public static final C2271Du<Integer> f7805Qe = C2271Du.m9661a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: R */
    private static final C2271Du<Float> f7806R = C2271Du.m9660a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* renamed from: Ra */
    public static final C2271Du<Boolean> f7807Ra = C2271Du.m9663a(1, "gads:sai:using_macro:enabled", (Boolean) false);

    /* renamed from: Rb */
    public static final C2271Du<Boolean> f7808Rb = C2271Du.m9663a(1, "gads:include_local_global_rectangles", (Boolean) false);

    /* renamed from: Rc */
    private static final C2271Du<String> f7809Rc = C2271Du.m9659a(1, "gads:singleton_webview_native:experiment_id");

    /* renamed from: Rd */
    private static final C2271Du<Long> f7810Rd = C2271Du.m9662a(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: Re */
    public static final C2271Du<Integer> f7811Re = C2271Du.m9661a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: S */
    private static final C2271Du<String> f7812S = C2271Du.m9659a(0, "gads:ad_id_app_context:experiment_id");

    /* renamed from: Sa */
    public static final C2271Du<String> f7813Sa = C2271Du.m9664a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: Sb */
    public static final C2271Du<Long> f7814Sb = C2271Du.m9662a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: Sc */
    public static final C2271Du<Boolean> f7815Sc = C2271Du.m9663a(1, "gads:enable_untrack_view_native", (Boolean) true);

    /* renamed from: Sd */
    public static final C2271Du<Boolean> f7816Sd = C2271Du.m9663a(1, "gads:http_assets_cache:enabled", (Boolean) false);

    /* renamed from: Se */
    private static byte[] f7817Se;

    /* renamed from: T */
    private static final C2271Du<String> f7818T = C2271Du.m9659a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* renamed from: Ta */
    public static final C2271Du<Long> f7819Ta = C2271Du.m9662a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: Tb */
    public static final C2271Du<Boolean> f7820Tb = C2271Du.m9663a(1, "gads:include_lock_screen_apps_for_visibility", (Boolean) true);

    /* renamed from: Tc */
    public static final C2271Du<Boolean> f7821Tc = C2271Du.m9663a(1, "gads:ignore_untrack_view_google_native", (Boolean) true);

    /* renamed from: Td */
    public static final C2271Du<String> f7822Td = C2271Du.m9664a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: U */
    private static final C2271Du<Boolean> f7823U = C2271Du.m9663a(0, "gads:ad_id_use_shared_preference:enabled", (Boolean) false);

    /* renamed from: Ua */
    public static final C2271Du<Integer> f7824Ua = C2271Du.m9661a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: Ub */
    public static final C2271Du<Boolean> f7825Ub = C2271Du.m9663a(0, "gads:device_info_caching:enabled", (Boolean) true);

    /* renamed from: Uc */
    public static final C2271Du<Boolean> f7826Uc = C2271Du.m9663a(1, "gads:reset_listeners_preparead_native", (Boolean) true);

    /* renamed from: Ud */
    public static final C2271Du<Integer> f7827Ud = C2271Du.m9661a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: V */
    private static final C2271Du<Float> f7828V = C2271Du.m9660a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* renamed from: Va */
    public static final C2271Du<Boolean> f7829Va = C2271Du.m9663a(1, "gads:x_seconds_rewarded:enable", (Boolean) false);

    /* renamed from: Vb */
    public static final C2271Du<Long> f7830Vb = C2271Du.m9662a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);

    /* renamed from: Vc */
    public static final C2271Du<Integer> f7831Vc = C2271Du.m9661a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: Vd */
    public static final C2271Du<Boolean> f7832Vd = C2271Du.m9663a(1, "gads:chrome_custom_tabs:enabled", (Boolean) true);

    /* renamed from: W */
    private static final C2271Du<Boolean> f7833W = C2271Du.m9663a(0, "gads:ad_id_use_persistent_service:enabled", (Boolean) false);

    /* renamed from: Wa */
    private static final C2271Du<Integer> f7834Wa = C2271Du.m9661a(0, "gads:webview_cache_version", 0);

    /* renamed from: Wb */
    public static final C2271Du<Boolean> f7835Wb = C2271Du.m9663a(1, "gads:gen204_signals:enabled", (Boolean) false);

    /* renamed from: Wc */
    public static final C2271Du<Integer> f7836Wc = C2271Du.m9661a(1, "gads:omid:native_webview_load_timeout", 2000);

    /* renamed from: Wd */
    public static final C2271Du<Boolean> f7837Wd = C2271Du.m9663a(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);

    /* renamed from: X */
    private static final C2271Du<Boolean> f7838X = C2271Du.m9663a(0, "gads:ad_id:use_ipc:enabled", (Boolean) false);

    /* renamed from: Xa */
    public static final C2271Du<Boolean> f7839Xa = C2271Du.m9663a(1, "gads:webview:ignore_over_scroll", (Boolean) true);

    /* renamed from: Xb */
    public static final C2271Du<Boolean> f7840Xb = C2271Du.m9663a(0, "gads:webview:error_reporting_enabled", (Boolean) false);

    /* renamed from: Xc */
    public static final C2271Du<String> f7841Xc = C2271Du.m9664a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: Xd */
    public static final C2271Du<Boolean> f7842Xd = C2271Du.m9663a(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);

    /* renamed from: Y */
    private static final C2271Du<String> f7843Y = C2271Du.m9665b(0, "gads:looper_for_gms_client:experiment_id");

    /* renamed from: Ya */
    public static final C2271Du<Boolean> f7844Ya = C2271Du.m9663a(0, "gads:corewebview:adwebview_factory:enable", (Boolean) false);

    /* renamed from: Yb */
    private static final C2271Du<Boolean> f7845Yb = C2271Du.m9663a(0, "gads:adid_reporting:enabled", (Boolean) false);

    /* renamed from: Yc */
    public static final C2271Du<Boolean> f7846Yc = C2271Du.m9663a(1, "gads:clamp_native_video_player_dimensions", (Boolean) true);

    /* renamed from: Yd */
    public static final C2271Du<Boolean> f7847Yd = C2271Du.m9663a(1, "gads:drx_in_app_preview:enabled", (Boolean) true);

    /* renamed from: Z */
    public static final C2271Du<Boolean> f7848Z = C2271Du.m9663a(0, "gads:looper_for_gms_client:enabled", (Boolean) true);

    /* renamed from: Za */
    public static final C2271Du<Boolean> f7849Za = C2271Du.m9663a(0, "gads:corewebview:javascript_engine", (Boolean) false);

    /* renamed from: Zb */
    private static final C2271Du<Boolean> f7850Zb = C2271Du.m9663a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);

    /* renamed from: Zc */
    public static final C2271Du<Boolean> f7851Zc = C2271Du.m9663a(1, "gads:enable_store_active_view_state", (Boolean) false);

    /* renamed from: Zd */
    public static final C2271Du<Boolean> f7852Zd = C2271Du.m9663a(1, "gads:drx_debug_signals:enabled", (Boolean) true);

    /* renamed from: _a */
    public static final C2271Du<Boolean> f7853_a = C2271Du.m9663a(1, "gad:webview:inject_scripts", (Boolean) false);

    /* renamed from: _b */
    private static final C2271Du<Boolean> f7854_b = C2271Du.m9663a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);

    /* renamed from: _c */
    public static final C2271Du<Boolean> f7855_c = C2271Du.m9663a(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);

    /* renamed from: _d */
    public static final C2271Du<Boolean> f7856_d = C2271Du.m9663a(1, "gads:debug_hold_gesture:enabled", (Boolean) false);

    /* renamed from: a */
    private static final C2271Du<String> f7857a = C2271Du.m9659a(0, "gads:sdk_core_experiment_id");

    /* renamed from: aa */
    public static final C2271Du<Boolean> f7858aa = C2271Du.m9663a(0, "gads:sw_ad_request_service:enabled", (Boolean) true);

    /* renamed from: ab */
    public static final C2271Du<Boolean> f7859ab = C2271Du.m9663a(0, "gads:webview:permission:disabled", (Boolean) false);

    /* renamed from: ac */
    private static final C2271Du<Boolean> f7860ac = C2271Du.m9663a(0, "gads:request_pkg:enabled", (Boolean) true);

    /* renamed from: ad */
    public static final C2271Du<Boolean> f7861ad = C2271Du.m9663a(1, "gads:native:overlay_new_fix:enabled", (Boolean) true);

    /* renamed from: ae */
    public static final C2271Du<Long> f7862ae = C2271Du.m9662a(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: b */
    public static final C2271Du<String> f7863b = C2271Du.m9664a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* renamed from: ba */
    private static final C2271Du<Boolean> f7864ba = C2271Du.m9663a(0, "gads:sw_dynamite:enabled", (Boolean) true);

    /* renamed from: bb */
    private static final C2271Du<String> f7865bb = C2271Du.m9665b(0, "gads:pan:experiment_id");

    /* renamed from: bc */
    public static final C2271Du<Boolean> f7866bc = C2271Du.m9663a(1, "gads:gmsg:disable_back_button:enabled", (Boolean) true);

    /* renamed from: bd */
    public static final C2271Du<Boolean> f7867bd = C2271Du.m9663a(1, "gads:native:count_impression_for_assets", (Boolean) false);

    /* renamed from: be */
    public static final C2271Du<String> f7868be = C2271Du.m9664a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: c */
    private static final C2271Du<String> f7869c = C2271Du.m9664a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* renamed from: ca */
    public static final C2271Du<String> f7870ca = C2271Du.m9664a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: cb */
    public static final C2271Du<Boolean> f7871cb = C2271Du.m9663a(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);

    /* renamed from: cc */
    public static final C2271Du<Boolean> f7872cc = C2271Du.m9663a(0, "gads:gmsg:video_meta:enabled", (Boolean) true);

    /* renamed from: cd */
    public static final C2271Du<Boolean> f7873cd = C2271Du.m9663a(1, "gads:native:custom_one_point_five_click:enable", (Boolean) true);

    /* renamed from: ce */
    public static final C2271Du<String> f7874ce = C2271Du.m9664a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: d */
    private static final C2271Du<Boolean> f7875d = C2271Du.m9663a(0, "gads:request_builder:singleton_webview", (Boolean) false);

    /* renamed from: da */
    public static final C2271Du<String> f7876da = C2271Du.m9664a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: db */
    public static final C2271Du<Long> f7877db = C2271Du.m9662a(1, "gads:rewarded:adapter_timeout_ms", 20000);

    /* renamed from: dc */
    private static final C2271Du<String> f7878dc = C2271Du.m9659a(0, "gads:gmsg:video_meta:experiment_id");

    /* renamed from: dd */
    public static final C2271Du<Boolean> f7879dd = C2271Du.m9663a(1, "gads:unified_native_ad:enable", (Boolean) true);

    /* renamed from: de */
    public static final C2271Du<String> f7880de = C2271Du.m9664a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: e */
    private static final C2271Du<String> f7881e = C2271Du.m9659a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: ea */
    public static final C2271Du<String> f7882ea = C2271Du.m9664a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: eb */
    public static final C2271Du<Boolean> f7883eb = C2271Du.m9663a(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);

    /* renamed from: ec */
    private static final C2271Du<Long> f7884ec = C2271Du.m9662a(1, "gads:network:cache_prediction_duration_s", 300);

    /* renamed from: ed */
    public static final C2271Du<Boolean> f7885ed = C2271Du.m9663a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);

    /* renamed from: ee */
    public static final C2271Du<String> f7886ee = C2271Du.m9664a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: f */
    private static final C2271Du<Boolean> f7887f = C2271Du.m9663a(0, "gads:sdk_use_dynamic_module", (Boolean) true);

    /* renamed from: fa */
    public static final C2271Du<String> f7888fa = C2271Du.m9664a(1, "gad:mraid:version", "2.0");

    /* renamed from: fb */
    public static final C2271Du<Boolean> f7889fb = C2271Du.m9663a(1, "gads:app_activity_tracker:enabled", (Boolean) true);

    /* renamed from: fc */
    public static final C2271Du<Long> f7890fc = C2271Du.m9662a(1, "gads:network:network_prediction_timeout_ms", 2000);

    /* renamed from: fd */
    public static final C2271Du<Boolean> f7891fd = C2271Du.m9663a(0, "gads:method_tracing:enabled", (Boolean) false);

    /* renamed from: fe */
    public static final C2271Du<Integer> f7892fe = C2271Du.m9661a(1, "gads:drx_debug:timeout_ms", (int) BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);

    /* renamed from: g */
    private static final C2271Du<String> f7893g = C2271Du.m9659a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: ga */
    public static final C2271Du<Boolean> f7894ga = C2271Du.m9663a(1, "gads:mraid:unload", (Boolean) false);

    /* renamed from: gb */
    public static final C2271Du<Long> f7895gb = C2271Du.m9662a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: gc */
    public static final C2271Du<Boolean> f7896gc = C2271Du.m9663a(0, "gads:mediation:dynamite_first:admobadapter", (Boolean) true);

    /* renamed from: gd */
    public static final C2271Du<Long> f7897gd = C2271Du.m9662a(0, "gads:method_tracing:duration_ms", 30000);

    /* renamed from: ge */
    public static final C2271Du<Integer> f7898ge = C2271Du.m9661a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: h */
    public static final C2271Du<Boolean> f7899h = C2271Du.m9663a(0, "gads:sdk_crash_report_enabled", (Boolean) false);

    /* renamed from: ha */
    public static final C2271Du<Boolean> f7900ha = C2271Du.m9663a(0, "gads:enabled_sdk_csi", (Boolean) false);

    /* renamed from: hb */
    public static final C2271Du<Long> f7901hb = C2271Du.m9662a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: hc */
    public static final C2271Du<Boolean> f7902hc = C2271Du.m9663a(0, "gads:mediation:dynamite_first:adurladapter", (Boolean) true);

    /* renamed from: hd */
    public static final C2271Du<Integer> f7903hd = C2271Du.m9661a(0, "gads:method_tracing:count", 5);

    /* renamed from: he */
    public static final C2271Du<Boolean> f7904he = C2271Du.m9663a(1, "gad:interstitial_for_multi_window", (Boolean) false);

    /* renamed from: i */
    public static final C2271Du<Boolean> f7905i = C2271Du.m9663a(0, "gads:report_dynamite_crash_in_background_thread", (Boolean) false);

    /* renamed from: ia */
    public static final C2271Du<String> f7906ia = C2271Du.m9664a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: ib */
    public static final C2271Du<Boolean> f7907ib = C2271Du.m9663a(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);

    /* renamed from: ic */
    public static final C2271Du<Boolean> f7908ic = C2271Du.m9663a(1, "gads:bypass_adrequest_service_for_inlined_mediation", (Boolean) true);

    /* renamed from: id */
    public static final C2271Du<Integer> f7909id = C2271Du.m9661a(0, "gads:method_tracing:filesize", 134217728);

    /* renamed from: ie */
    public static final C2271Du<Boolean> f7910ie = C2271Du.m9663a(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);

    /* renamed from: j */
    public static final C2271Du<Boolean> f7911j = C2271Du.m9663a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);

    /* renamed from: ja */
    public static final C2271Du<Boolean> f7912ja = C2271Du.m9663a(0, "gads:sdk_csi_write_to_file", (Boolean) false);

    /* renamed from: jb */
    public static final C2271Du<Long> f7913jb = C2271Du.m9662a(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: jc */
    private static final C2271Du<Long> f7914jc = C2271Du.m9662a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: jd */
    private static final C2271Du<Boolean> f7915jd = C2271Du.m9663a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);

    /* renamed from: je */
    public static final C2271Du<Integer> f7916je = C2271Du.m9661a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: k */
    public static final C2271Du<String> f7917k = C2271Du.m9664a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: ka */
    public static final C2271Du<Boolean> f7918ka = C2271Du.m9663a(0, "gads:enable_content_fetching", (Boolean) true);

    /* renamed from: kb */
    public static final C2271Du<Boolean> f7919kb = C2271Du.m9663a(1, "gads:disable_adid_values_in_ms", (Boolean) false);

    /* renamed from: kc */
    public static final C2271Du<Long> f7920kc = C2271Du.m9662a(0, "gads:resolve_future:default_timeout_ms", 30000);

    /* renamed from: kd */
    private static final C2271Du<String> f7921kd = C2271Du.m9665b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: ke */
    public static final C2271Du<Boolean> f7922ke = C2271Du.m9663a(1, "gads:clearcut_logging:enabled", (Boolean) false);

    /* renamed from: l */
    public static final C2271Du<Float> f7923l = C2271Du.m9660a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: la */
    public static final C2271Du<Integer> f7924la = C2271Du.m9661a(0, "gads:content_length_weight", 1);

    /* renamed from: lb */
    public static final C2271Du<Boolean> f7925lb = C2271Du.m9663a(1, "gads:enable_ad_loader_manager", (Boolean) true);

    /* renamed from: lc */
    public static final C2271Du<Long> f7926lc = C2271Du.m9662a(0, "gads:ad_loader:timeout_ms", 60000);

    /* renamed from: ld */
    public static final C2271Du<Long> f7927ld = C2271Du.m9662a(1, "gads:auto_location_timeout", 2000);

    /* renamed from: le */
    public static final C2271Du<Boolean> f7928le = C2271Du.m9663a(1, "gads:clearcut_logging:write_to_file", (Boolean) false);

    /* renamed from: m */
    public static final C2271Du<Boolean> f7929m = C2271Du.m9663a(0, "gads:block_autoclicks", (Boolean) false);

    /* renamed from: ma */
    public static final C2271Du<Integer> f7930ma = C2271Du.m9661a(0, "gads:content_age_weight", 1);

    /* renamed from: mb */
    private static final C2271Du<Boolean> f7931mb = C2271Du.m9663a(0, "gads:ad_serving:enabled", (Boolean) true);

    /* renamed from: mc */
    public static final C2271Du<Long> f7932mc = C2271Du.m9662a(0, "gads:rendering:timeout_ms", 60000);

    /* renamed from: md */
    private static final C2271Du<String> f7933md = C2271Du.m9665b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: me */
    public static final C2271Du<Boolean> f7934me = C2271Du.m9663a(0, "gad:force_local_ad_request_service:enabled", (Boolean) false);

    /* renamed from: n */
    private static final C2271Du<String> f7935n = C2271Du.m9659a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: na */
    public static final C2271Du<Integer> f7936na = C2271Du.m9661a(0, "gads:min_content_len", 11);

    /* renamed from: nb */
    public static final C2271Du<Boolean> f7937nb = C2271Du.m9663a(1, "gads:ad_manager_enforce_arp_invariant:enabled", (Boolean) true);

    /* renamed from: nc */
    public static final C2271Du<Boolean> f7938nc = C2271Du.m9663a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);

    /* renamed from: nd */
    private static final C2271Du<Long> f7939nd = C2271Du.m9662a(1, "gads:auto_location_interval", -1);

    /* renamed from: ne */
    public static final C2271Du<Boolean> f7940ne = C2271Du.m9663a(0, "gad:force_dynamite_loading_enabled", (Boolean) false);

    /* renamed from: o */
    private static final C2271Du<String> f7941o = C2271Du.m9659a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: oa */
    public static final C2271Du<Integer> f7942oa = C2271Du.m9661a(0, "gads:fingerprint_number", 10);

    /* renamed from: ob */
    public static final C2271Du<Boolean> f7943ob = C2271Du.m9663a(1, "gads:ad_manager:admob_extra:new_bundle", (Boolean) true);

    /* renamed from: oc */
    public static final C2271Du<Long> f7944oc = C2271Du.m9662a(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: od */
    private static final C2271Du<String> f7945od = C2271Du.m9665b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: oe */
    public static final C2271Du<Integer> f7946oe = C2271Du.m9661a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: p */
    private static final C2271Du<Integer> f7947p = C2271Du.m9661a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: pa */
    public static final C2271Du<Integer> f7948pa = C2271Du.m9661a(0, "gads:sleep_sec", 10);

    /* renamed from: pb */
    public static final C2271Du<Long> f7949pb = C2271Du.m9662a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: pc */
    public static final C2271Du<Boolean> f7950pc = C2271Du.m9663a(1, "gads:gestures:asig:enabled", (Boolean) false);

    /* renamed from: pd */
    public static final C2271Du<Boolean> f7951pd = C2271Du.m9663a(1, "gads:fetch_app_settings_using_cld:enabled", (Boolean) false);

    /* renamed from: pe */
    public static final C2271Du<Boolean> f7952pe = C2271Du.m9663a(1, "gads:omid:enabled", (Boolean) false);

    /* renamed from: q */
    public static final C2271Du<String> f7953q = C2271Du.m9664a(1, "gads:video_exo_player:version", "1");

    /* renamed from: qa */
    public static final C2271Du<Boolean> f7954qa = C2271Du.m9663a(1, "gads:enable_content_url_hash", (Boolean) true);

    /* renamed from: qb */
    public static final C2271Du<Boolean> f7955qb = C2271Du.m9663a(1, "gads:interstitial_ad_immersive_mode", (Boolean) true);

    /* renamed from: qc */
    public static final C2271Du<Boolean> f7956qc = C2271Du.m9663a(1, "gads:gestures:ans:enabled", (Boolean) false);

    /* renamed from: qd */
    private static final C2271Du<String> f7957qd = C2271Du.m9659a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: qe */
    private static final C2271Du<Boolean> f7958qe = C2271Du.m9663a(0, "gads:nonagon:red_button", (Boolean) false);

    /* renamed from: r */
    public static final C2271Du<Integer> f7959r = C2271Du.m9661a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: ra */
    public static final C2271Du<Integer> f7960ra = C2271Du.m9661a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: rb */
    public static final C2271Du<Boolean> f7961rb = C2271Du.m9663a(1, "gads:custom_close_blocking:enabled", (Boolean) false);

    /* renamed from: rc */
    public static final C2271Du<Boolean> f7962rc = C2271Du.m9663a(1, "gads:gestures:tos:enabled", (Boolean) false);

    /* renamed from: rd */
    public static final C2271Du<Long> f7963rd = C2271Du.m9662a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: re */
    private static final C2271Du<Boolean> f7964re = C2271Du.m9663a(1, "gads:nonagon:banner:enabled", (Boolean) false);

    /* renamed from: s */
    public static final C2271Du<Integer> f7965s = C2271Du.m9661a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: sa */
    public static final C2271Du<Boolean> f7966sa = C2271Du.m9663a(1, "gads:enable_content_vertical_hash", (Boolean) true);

    /* renamed from: sb */
    public static final C2271Du<Boolean> f7967sb = C2271Du.m9663a(1, "gads:disabling_closable_area:enabled", (Boolean) false);

    /* renamed from: sc */
    public static final C2271Du<Boolean> f7968sc = C2271Du.m9663a(1, "gads:signal:app_permissions:disabled", (Boolean) false);

    /* renamed from: sd */
    private static final C2271Du<String> f7969sd = C2271Du.m9659a(0, "gads:afs:csa:experiment_id");

    /* renamed from: se */
    private static final C2271Du<String> f7970se = C2271Du.m9664a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: t */
    public static final C2271Du<Integer> f7971t = C2271Du.m9661a(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: ta */
    public static final C2271Du<Integer> f7972ta = C2271Du.m9661a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: tb */
    private static final C2271Du<Boolean> f7973tb = C2271Du.m9663a(1, "gads:impression_optimization_enabled", (Boolean) false);

    /* renamed from: tc */
    public static final C2271Du<Boolean> f7974tc = C2271Du.m9663a(1, "gads:gestures:inthex:enabled", (Boolean) false);

    /* renamed from: td */
    public static final C2271Du<String> f7975td = C2271Du.m9664a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: te */
    private static final C2271Du<Boolean> f7976te = C2271Du.m9663a(1, "gads:nonagon:interstitial:enabled", (Boolean) false);

    /* renamed from: u */
    public static final C2271Du<Integer> f7977u = C2271Du.m9661a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: ua */
    public static final C2271Du<Integer> f7978ua = C2271Du.m9661a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: ub */
    private static final C2271Du<String> f7979ub = C2271Du.m9664a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* renamed from: uc */
    public static final C2271Du<Boolean> f7980uc = C2271Du.m9663a(1, "gads:gestures:hpk:enabled", (Boolean) true);

    /* renamed from: ud */
    public static final C2271Du<String> f7981ud = C2271Du.m9664a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: ue */
    private static final C2271Du<String> f7982ue = C2271Du.m9664a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: v */
    public static final C2271Du<Integer> f7983v = C2271Du.m9661a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: va */
    public static final C2271Du<String> f7984va = C2271Du.m9664a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: vb */
    private static final C2271Du<Integer> f7985vb = C2271Du.m9661a(1, "gads:banner_ad_pool:max_queues", 3);

    /* renamed from: vc */
    public static final C2271Du<String> f7986vc = C2271Du.m9664a(1, "gads:gestures:pk", "");

    /* renamed from: vd */
    public static final C2271Du<String> f7987vd = C2271Du.m9664a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: ve */
    private static final C2271Du<Boolean> f7988ve = C2271Du.m9663a(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);

    /* renamed from: w */
    private static final C2271Du<String> f7989w = C2271Du.m9659a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: wa */
    public static final C2271Du<String> f7990wa = C2271Du.m9664a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: wb */
    private static final C2271Du<Integer> f7991wb = C2271Du.m9661a(1, "gads:banner_ad_pool:max_pools", 3);

    /* renamed from: wc */
    public static final C2271Du<Boolean> f7992wc = C2271Du.m9663a(1, "gads:gestures:bs:enabled", (Boolean) true);

    /* renamed from: wd */
    public static final C2271Du<String> f7993wd = C2271Du.m9664a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: we */
    private static final C2271Du<Boolean> f7994we = C2271Du.m9663a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);

    /* renamed from: x */
    public static final C2271Du<Integer> f7995x = C2271Du.m9661a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: xa */
    public static final C2271Du<Boolean> f7996xa = C2271Du.m9663a(0, "gad:app_index_enabled", (Boolean) true);

    /* renamed from: xb */
    public static final C2271Du<Boolean> f7997xb = C2271Du.m9663a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);

    /* renamed from: xc */
    public static final C2271Du<Boolean> f7998xc = C2271Du.m9663a(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);

    /* renamed from: xd */
    public static final C2271Du<String> f7999xd = C2271Du.m9664a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: xe */
    private static final C2271Du<String> f8000xe = C2271Du.m9664a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: y */
    public static final C2271Du<Integer> f8001y = C2271Du.m9661a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: ya */
    public static final C2271Du<Boolean> f8002ya = C2271Du.m9663a(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);

    /* renamed from: yb */
    public static final C2271Du<Boolean> f8003yb = C2271Du.m9663a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);

    /* renamed from: yc */
    public static final C2271Du<Boolean> f8004yc = C2271Du.m9663a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);

    /* renamed from: yd */
    public static final C2271Du<Long> f8005yd = C2271Du.m9662a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);

    /* renamed from: ye */
    private static final C2271Du<Boolean> f8006ye = C2271Du.m9663a(1, "gads:nonagon:nativead:enabled", (Boolean) false);

    /* renamed from: z */
    public static final C2271Du<Integer> f8007z = C2271Du.m9661a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: za */
    public static final C2271Du<Boolean> f8008za = C2271Du.m9663a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);

    /* renamed from: zb */
    public static final C2271Du<String> f8009zb = C2271Du.m9664a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: zc */
    public static final C2271Du<Boolean> f8010zc = C2271Du.m9663a(0, "gass:enabled", (Boolean) true);

    /* renamed from: zd */
    private static final C2271Du<Boolean> f8011zd = C2271Du.m9663a(0, "gads:afs:csa_ad_manager_enabled", (Boolean) true);

    /* renamed from: ze */
    private static final C2271Du<String> f8012ze = C2271Du.m9664a(1, "gads:nonagon:nativead:app_name", "(?!)");

    /* renamed from: a */
    public static List<String> m10772a() {
        return C3390pt.m13457e().mo8381a();
    }

    /* renamed from: a */
    public static void m10773a(Context context) {
        C3171if.m12583a(context, new C2590Ou(context));
        int intValue = ((Integer) C3390pt.m13458f().mo8515a(f7784Nb)).intValue();
        if (intValue > 0 && f7817Se == null) {
            f7817Se = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static void m10774a(Context context, int i, JSONObject jSONObject) {
        C3390pt.m13456d();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        C3390pt.m13457e().mo8382a(edit, 1, jSONObject);
        C3390pt.m13456d();
        edit.commit();
    }

    /* renamed from: b */
    public static List<String> m10775b() {
        return C3390pt.m13457e().mo8384b();
    }
}
