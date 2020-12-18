package com.openlife.checkme.activity.other;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class OtherActivity extends BaseActivity {
    /* renamed from: a */
    private void m18686a() {
        setTitle(C4961l.other_title);
        mo12577b(true);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, OtherFragment.m18690b()).commit();
    }

    /* renamed from: a */
    public static void m18687a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, OtherActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_other_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18686a();
    }
}
