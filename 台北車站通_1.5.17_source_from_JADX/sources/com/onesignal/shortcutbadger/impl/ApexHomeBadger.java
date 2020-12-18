package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.p085a.C4333a;
import com.onesignal.p085a.C4336b;
import com.onesignal.p085a.p086a.C4334a;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements C4333a {
    /* renamed from: a */
    public List<String> mo12458a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (C4334a.m17281a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new C4336b("unable to resolve intent: " + intent.toString());
    }
}
