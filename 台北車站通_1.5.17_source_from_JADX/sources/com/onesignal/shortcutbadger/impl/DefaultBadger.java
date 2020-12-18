package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.p085a.C4333a;
import com.onesignal.p085a.C4336b;
import com.onesignal.p085a.p086a.C4334a;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements C4333a {
    /* renamed from: a */
    public List<String> mo12458a() {
        return new ArrayList(0);
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (C4334a.m17281a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new C4336b("unable to resolve intent: " + intent.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12539a(Context context) {
        return C4334a.m17281a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}
