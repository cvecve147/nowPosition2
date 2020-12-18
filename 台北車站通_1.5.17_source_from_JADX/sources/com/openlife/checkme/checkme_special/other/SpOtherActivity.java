package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class SpOtherActivity extends BaseActivity {
    /* renamed from: a */
    private void m19413a() {
        setTitle(C4961l.other_title);
        mo12577b(true);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, SpOtherFragment.m19416a()).commit();
    }

    /* renamed from: a */
    public static void m19414a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, SpOtherActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_other_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19413a();
    }
}
