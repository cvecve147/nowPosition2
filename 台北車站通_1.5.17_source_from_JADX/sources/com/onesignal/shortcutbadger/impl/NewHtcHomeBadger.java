package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.p085a.C4333a;
import com.onesignal.p085a.C4336b;
import com.onesignal.p085a.p086a.C4334a;
import java.util.Arrays;
import java.util.List;

public class NewHtcHomeBadger implements C4333a {
    /* renamed from: a */
    public List<String> mo12458a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (C4334a.m17281a(context, intent) || C4334a.m17281a(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
            return;
        }
        throw new C4336b("unable to resolve intent: " + intent2.toString());
    }
}
