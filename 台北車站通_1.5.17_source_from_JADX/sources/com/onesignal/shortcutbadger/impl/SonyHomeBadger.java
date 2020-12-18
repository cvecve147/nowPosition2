package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.onesignal.p085a.C4333a;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements C4333a {

    /* renamed from: a */
    private final Uri f13039a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    private AsyncQueryHandler f13040b;

    /* renamed from: a */
    private ContentValues m17560a(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* renamed from: a */
    private void m17561a(ContentValues contentValues) {
        this.f13040b.startInsert(0, (Object) null, this.f13039a, contentValues);
    }

    /* renamed from: a */
    private void m17562a(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f13039a, contentValues);
    }

    /* renamed from: a */
    private static boolean m17563a(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    /* renamed from: b */
    private static void m17564b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    /* renamed from: c */
    private void m17565c(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues a = m17560a(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f13040b == null) {
                    this.f13040b = new C4423b(this, context.getApplicationContext().getContentResolver());
                }
                m17561a(a);
                return;
            }
            m17562a(context, a);
        }
    }

    /* renamed from: a */
    public List<String> mo12458a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: a */
    public void mo12459a(Context context, ComponentName componentName, int i) {
        if (m17563a(context)) {
            m17565c(context, componentName, i);
        } else {
            m17564b(context, componentName, i);
        }
    }
}
