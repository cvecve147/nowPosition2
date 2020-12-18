package com.openlife.checkme.activity.browser;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class TinyGameActivity extends BaseActivity {

    /* renamed from: f */
    private TinyGameFragment f13252f;

    /* renamed from: g */
    private String f13253g;

    /* renamed from: a */
    private void m17926a() {
        String str;
        if (getIntent() == null) {
            finish();
        }
        Uri data = getIntent().getData();
        if (data == null) {
            str = getIntent().getStringExtra("url");
        } else if (!data.getHost().equals(getString(C4961l.host_tinygame)) || (str = data.getQueryParameter("url")) == null || str.isEmpty()) {
            finish();
            return;
        }
        this.f13253g = str;
    }

    /* renamed from: p */
    private void m17927p() {
        this.f13252f = TinyGameFragment.m17930g(this.f13253g);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13252f).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_tinygame_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17926a();
        m17927p();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f13252f.mo12710g();
        return true;
    }
}
