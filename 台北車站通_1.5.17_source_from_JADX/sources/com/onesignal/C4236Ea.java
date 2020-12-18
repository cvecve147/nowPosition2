package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.Ea */
class C4236Ea {

    /* renamed from: a */
    String f12566a;

    /* renamed from: b */
    public C4237a f12567b;

    /* renamed from: c */
    public String f12568c;

    /* renamed from: d */
    public C4238b f12569d;

    /* renamed from: e */
    public Object f12570e;

    /* renamed from: com.onesignal.Ea$a */
    public enum C4237a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");
        

        /* renamed from: f */
        private String f12576f;

        private C4237a(String str) {
            this.f12576f = str;
        }

        /* renamed from: a */
        public static C4237a m16792a(String str) {
            for (C4237a aVar : values()) {
                if (aVar.f12576f.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        public String toString() {
            return this.f12576f;
        }
    }

    /* renamed from: com.onesignal.Ea$b */
    public enum C4238b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        

        /* renamed from: k */
        private String f12587k;

        private C4238b(String str) {
            this.f12587k = str;
        }

        /* renamed from: a */
        public static C4238b m16793a(String str) {
            for (C4238b bVar : values()) {
                if (bVar.f12587k.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        /* renamed from: a */
        public boolean mo12291a() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        public String toString() {
            return this.f12587k;
        }
    }

    C4236Ea(JSONObject jSONObject) {
        this.f12566a = jSONObject.getString("id");
        this.f12567b = C4237a.m16792a(jSONObject.getString("kind"));
        this.f12568c = jSONObject.optString("property", (String) null);
        this.f12569d = C4238b.m16793a(jSONObject.getString("operator"));
        this.f12570e = jSONObject.opt("value");
    }
}
