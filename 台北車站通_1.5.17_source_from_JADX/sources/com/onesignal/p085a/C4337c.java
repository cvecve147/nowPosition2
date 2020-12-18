package com.onesignal.p085a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.C4422a;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.onesignal.a.c */
public final class C4337c {

    /* renamed from: a */
    private static final List<Class<? extends C4333a>> f12844a = new LinkedList();

    /* renamed from: b */
    private static final Object f12845b = new Object();

    /* renamed from: c */
    private static C4333a f12846c;

    /* renamed from: d */
    private static ComponentName f12847d;

    static {
        f12844a.add(AdwHomeBadger.class);
        f12844a.add(ApexHomeBadger.class);
        f12844a.add(NewHtcHomeBadger.class);
        f12844a.add(NovaHomeBadger.class);
        f12844a.add(SonyHomeBadger.class);
        f12844a.add(C4422a.class);
        f12844a.add(HuaweiHomeBadger.class);
        f12844a.add(OPPOHomeBader.class);
        f12844a.add(SamsungHomeBadger.class);
        f12844a.add(ZukHomeBadger.class);
        f12844a.add(VivoHomeBadger.class);
        f12844a.add(EverythingMeHomeBadger.class);
    }

    /* renamed from: a */
    public static void m17284a(Context context, int i) {
        if (f12846c != null || m17285a(context)) {
            try {
                f12846c.mo12459a(context, f12847d, i);
            } catch (Exception e) {
                throw new C4336b("Unable to execute badge", e);
            }
        } else {
            throw new C4336b("No default launcher available");
        }
    }

    /* renamed from: a */
    private static boolean m17285a(Context context) {
        C4333a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f12847d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends C4333a>> it = f12844a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                aVar = (C4333a) it.next().newInstance();
            } catch (Exception unused) {
                aVar = null;
            }
            if (aVar != null && aVar.mo12458a().contains(str)) {
                f12846c = aVar;
                break;
            }
        }
        if (f12846c != null) {
            return true;
        }
        f12846c = Build.MANUFACTURER.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : Build.MANUFACTURER.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : Build.MANUFACTURER.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
        return true;
    }
}
