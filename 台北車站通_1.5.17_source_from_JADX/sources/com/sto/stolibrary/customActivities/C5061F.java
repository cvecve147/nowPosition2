package com.sto.stolibrary.customActivities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.sto.stolibrary.customActivities.F */
public class C5061F {

    /* renamed from: a */
    private static C5061F f14360a = null;

    /* renamed from: b */
    public static String f14361b = "NON_TOKEN";

    /* renamed from: c */
    public static Integer f14362c = 2412;

    /* renamed from: d */
    public static Integer f14363d = 2413;

    /* renamed from: e */
    public static Integer f14364e = 2415;

    /* renamed from: f */
    public static Integer f14365f = 2416;

    /* renamed from: g */
    private C5062a f14366g = null;

    /* renamed from: com.sto.stolibrary.customActivities.F$a */
    public interface C5062a {
        /* renamed from: a */
        void mo5618a();

        /* renamed from: a */
        void mo5619a(Boolean bool);

        /* renamed from: a */
        void mo5620a(Boolean bool, String str);

        /* renamed from: a */
        void mo5621a(String str, String str2, String str3);

        /* renamed from: b */
        void mo5622b(Boolean bool);

        /* renamed from: c */
        void mo5623c(Boolean bool);
    }

    /* renamed from: b */
    public static C5061F m19898b() {
        if (f14360a == null) {
            f14360a = new C5061F();
        }
        return f14360a;
    }

    /* renamed from: a */
    public C5062a mo14132a() {
        return this.f14366g;
    }

    /* renamed from: a */
    public void mo14133a(Context context) {
        ((Activity) context).startActivityForResult(new Intent(context, BuildingSelectActivity2.class), f14362c.intValue());
        C5062a aVar = this.f14366g;
        if (aVar != null) {
            aVar.mo5620a(true, (String) null);
        }
    }

    /* renamed from: a */
    public void mo14134a(C5062a aVar) {
        this.f14366g = aVar;
    }

    /* renamed from: a */
    public void mo14135a(String str) {
        f14361b = str;
    }
}
