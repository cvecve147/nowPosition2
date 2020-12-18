package com.openlife.checkme.p091b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.openlife.checkme.p094d.C4947j;
import java.util.Locale;

/* renamed from: com.openlife.checkme.b.a */
public class C4837a extends ContextWrapper {
    public C4837a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static ContextWrapper m19033a(Context context, String str) {
        Configuration configuration = context.getResources().getConfiguration();
        if (!str.equals("")) {
            Locale locale = new Locale(str);
            Locale.setDefault(locale);
            if (Build.VERSION.SDK_INT >= 24) {
                m19037b(configuration, locale);
            } else {
                m19036a(configuration, locale);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                context = context.createConfigurationContext(configuration);
            } else {
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            }
        }
        return new C4837a(context);
    }

    /* renamed from: a */
    public static String m19034a(C4947j jVar, int i, Context context) {
        String e = jVar.mo13554e().mo13533e();
        if (e == null) {
            e = "zh";
        }
        Locale a = m19035a(e);
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(a);
            return context.createConfigurationContext(configuration).getText(i).toString();
        }
        Resources resources = context.getResources();
        Configuration configuration2 = resources.getConfiguration();
        Locale locale = configuration2.locale;
        configuration2.locale = a;
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        String string = resources.getString(i);
        configuration2.locale = locale;
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        return string;
    }

    /* renamed from: a */
    private static Locale m19035a(String str) {
        return new Locale(str);
    }

    /* renamed from: a */
    public static void m19036a(Configuration configuration, Locale locale) {
        configuration.locale = locale;
    }

    @TargetApi(24)
    /* renamed from: b */
    public static void m19037b(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
