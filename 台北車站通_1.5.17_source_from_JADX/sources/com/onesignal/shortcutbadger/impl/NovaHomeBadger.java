package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.onesignal.p085a.C4333a;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements C4333a {
    /* renamed from: a */
    public List<String> mo12458a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
