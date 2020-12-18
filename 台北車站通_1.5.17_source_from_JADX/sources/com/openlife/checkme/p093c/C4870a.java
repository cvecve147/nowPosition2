package com.openlife.checkme.p093c;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.openlife.checkme.c.a */
public class C4870a {

    /* renamed from: a */
    private static C4870a f13949a;

    /* renamed from: b */
    private final String f13950b = "com.openlife.checkme.activity";

    /* renamed from: c */
    private final String f13951c = "com.openlife.checkme.checkme_special";

    /* renamed from: d */
    private List<String> f13952d = new ArrayList();

    /* renamed from: a */
    public static C4870a m19168a() {
        C4870a aVar = f13949a;
        if (aVar != null) {
            return aVar;
        }
        f13949a = new C4870a();
        return f13949a;
    }

    /* renamed from: a */
    public void mo13380a(Activity activity) {
        if (activity.getLocalClassName().contains("com.openlife.checkme.activity") || activity.getLocalClassName().contains("com.openlife.checkme.checkme_special")) {
            this.f13952d.add(activity.getLocalClassName());
        }
    }

    /* renamed from: b */
    public List<String> mo13381b() {
        return this.f13952d;
    }

    /* renamed from: b */
    public void mo13382b(Activity activity) {
        if (activity.getLocalClassName().contains("com.openlife.checkme.activity") || activity.getLocalClassName().contains("com.openlife.checkme.checkme_special")) {
            this.f13952d.remove(activity.getLocalClassName());
        }
    }
}
