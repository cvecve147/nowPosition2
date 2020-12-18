package com.openlife.checkme.activity.gift.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;

public class GiftListActivity extends BaseActivity {
    /* renamed from: a */
    private void m18112a() {
        setTitle((CharSequence) null);
        mo12577b(true);
        mo12578c(false);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, GiftListFragment.m18129b()).commit();
    }

    /* renamed from: a */
    public static void m18113a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, GiftListActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_gift_list_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18112a();
    }
}
