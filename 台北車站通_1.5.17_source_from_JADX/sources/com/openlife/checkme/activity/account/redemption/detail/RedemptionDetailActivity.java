package com.openlife.checkme.activity.account.redemption.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;

public class RedemptionDetailActivity extends BaseActivity {

    /* renamed from: f */
    private int f13205f;

    /* renamed from: g */
    private boolean f13206g;

    /* renamed from: a */
    private void m17832a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13205f = getIntent().getIntExtra("ID", 0);
        this.f13206g = getIntent().getBooleanExtra("ENABLE", true);
    }

    /* renamed from: a */
    private void m17833a(int i, boolean z) {
        setTitle((CharSequence) null);
        mo12577b(true);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, RedemptionDetailFragment.m17836a(i, z)).commit();
    }

    /* renamed from: a */
    public static void m17834a(Activity activity, int i, boolean z) {
        Intent intent = new Intent(activity, RedemptionDetailActivity.class);
        intent.putExtra("ID", i);
        intent.putExtra("ENABLE", z);
        activity.startActivityForResult(intent, 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_redemption_detail_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17832a();
        m17833a(this.f13205f, this.f13206g);
    }
}
