package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.p085a.C4333a;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger implements C4333a {

    /* renamed from: a */
    private final Uri f13042a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public List<String> mo12458a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f13042a, "setAppBadgeCount", (String) null, bundle);
    }
}
