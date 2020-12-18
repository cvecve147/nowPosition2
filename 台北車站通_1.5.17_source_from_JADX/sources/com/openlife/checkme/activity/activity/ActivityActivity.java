package com.openlife.checkme.activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class ActivityActivity extends BaseActivity {
    /* renamed from: a */
    private void m17888a() {
        setTitle(C4961l.activity_title);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, ActivityFragment.m17892b()).commit();
    }

    /* renamed from: a */
    public static void m17889a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, ActivityActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_activity_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17888a();
    }
}
