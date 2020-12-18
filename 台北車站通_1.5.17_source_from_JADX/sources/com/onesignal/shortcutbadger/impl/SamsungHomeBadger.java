package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.onesignal.p085a.C4333a;
import com.onesignal.p085a.p086a.C4335b;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements C4333a {

    /* renamed from: a */
    private static final String[] f13037a = {"_id", "class"};

    /* renamed from: b */
    private DefaultBadger f13038b;

    public SamsungHomeBadger() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f13038b = new DefaultBadger();
        }
    }

    /* renamed from: a */
    private ContentValues m17557a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public List<String> mo12458a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        DefaultBadger defaultBadger = this.f13038b;
        if (defaultBadger == null || !defaultBadger.mo12539a(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f13037a, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, m17557a(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, m17557a(componentName, i, true));
                    }
                }
            } finally {
                C4335b.m17282a(cursor);
            }
        } else {
            this.f13038b.mo12459a(context, componentName, i);
        }
    }
}
