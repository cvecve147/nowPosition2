package com.openlife.checkme.activity.gift.detail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class GiftDetailActivity extends BaseActivity {

    /* renamed from: f */
    int f13337f;

    /* renamed from: a */
    private void m18069a() {
        int i;
        String queryParameter;
        if (getIntent() == null) {
            finish();
        }
        Uri data = getIntent().getData();
        if (data == null) {
            i = getIntent().getIntExtra("id", 0);
        } else if (!data.getHost().equals(getString(C4961l.host_gift)) || !data.getPath().equals(getString(C4961l.path_detail)) || (queryParameter = data.getQueryParameter("id")) == null || queryParameter.isEmpty()) {
            finish();
            return;
        } else {
            i = Integer.parseInt(queryParameter);
        }
        this.f13337f = i;
    }

    /* renamed from: a */
    public static void m18070a(Activity activity, int i) {
        Intent intent = new Intent(activity, GiftDetailActivity.class);
        intent.putExtra("id", i);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m18071p() {
        setTitle((CharSequence) null);
        mo12577b(true);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, GiftDetailFragment.m18074a(this.f13337f)).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_gift_detail_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18069a();
        m18071p();
    }
}
