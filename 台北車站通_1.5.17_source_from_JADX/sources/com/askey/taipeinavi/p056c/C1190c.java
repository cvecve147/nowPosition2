package com.askey.taipeinavi.p056c;

import android.app.Application;

/* renamed from: com.askey.taipeinavi.c.c */
public class C1190c implements C1189b {

    /* renamed from: a */
    private static C1190c f4364a = null;

    /* renamed from: b */
    public static String f4365b = "click_timetable_information";

    /* renamed from: c */
    public static String f4366c = "click_my_location";

    /* renamed from: d */
    public static String f4367d = "click_store_guide";

    /* renamed from: e */
    public static String f4368e = "click_smart_parking";

    /* renamed from: f */
    public static String f4369f = "click_quick_navigation";

    /* renamed from: g */
    public static String f4370g = "click_interactive_signage";

    /* renamed from: h */
    private C1189b f4371h = new C1188a();

    private C1190c() {
    }

    /* renamed from: a */
    public static C1190c m5957a() {
        if (f4364a == null) {
            f4364a = new C1190c();
        }
        return f4364a;
    }

    /* renamed from: a */
    public void mo5482a(Application application) {
        this.f4371h.mo5482a(application);
    }

    /* renamed from: a */
    public void mo5483a(String str, String str2) {
        this.f4371h.mo5483a(str, str2);
    }
}
