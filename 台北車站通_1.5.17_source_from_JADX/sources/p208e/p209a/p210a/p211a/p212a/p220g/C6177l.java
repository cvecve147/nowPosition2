package p208e.p209a.p210a.p211a.p212a.p220g;

import org.json.JSONObject;
import p208e.p209a.p210a.p211a.p212a.p214b.C6084n;

/* renamed from: e.a.a.a.a.g.l */
class C6177l implements C6190x {
    C6177l() {
    }

    /* renamed from: a */
    private long m23350a(C6084n nVar, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.getLong("expires_at") : nVar.mo16037a() + (j * 1000);
    }

    /* renamed from: a */
    private C6167b m23351a(JSONObject jSONObject) {
        return new C6167b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", 8000), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
    }

    /* renamed from: b */
    private C6170e m23352b(JSONObject jSONObject) {
        return new C6170e(jSONObject.getString("identifier"), jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has("icon") || !jSONObject.getJSONObject("icon").has("hash")) ? null : m23355e(jSONObject.getJSONObject("icon")));
    }

    /* renamed from: c */
    private C6172g m23353c(JSONObject jSONObject) {
        return new C6172g(jSONObject.optString("update_endpoint", C6189w.f17264a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: d */
    private C6179n m23354d(JSONObject jSONObject) {
        return new C6179n(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false));
    }

    /* renamed from: e */
    private C6168c m23355e(JSONObject jSONObject) {
        return new C6168c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: f */
    private C6181p m23356f(JSONObject jSONObject) {
        return new C6181p(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
    }

    /* renamed from: g */
    private C6182q m23357g(JSONObject jSONObject) {
        return new C6182q(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
    }

    /* renamed from: a */
    public C6188v mo16249a(C6084n nVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C6188v(m23350a(nVar, (long) optInt2, jSONObject), m23352b(jSONObject.getJSONObject("app")), m23357g(jSONObject.getJSONObject("session")), m23356f(jSONObject.getJSONObject("prompt")), m23354d(jSONObject.getJSONObject("features")), m23351a(jSONObject.getJSONObject("analytics")), m23353c(jSONObject.getJSONObject("beta")), optInt, optInt2);
    }
}
