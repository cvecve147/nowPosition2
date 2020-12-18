package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.C1515o;
import p013b.p018b.p028h.p029a.C1020d;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f4747a = (CustomTabMainActivity.class.getSimpleName() + ".extra_params");

    /* renamed from: b */
    public static final String f4748b = (CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage");

    /* renamed from: c */
    public static final String f4749c = (CustomTabMainActivity.class.getSimpleName() + ".extra_url");

    /* renamed from: d */
    public static final String f4750d = (CustomTabMainActivity.class.getSimpleName() + ".action_refresh");

    /* renamed from: e */
    private boolean f4751e = true;

    /* renamed from: f */
    private BroadcastReceiver f4752f;

    /* renamed from: a */
    public static final String m6474a() {
        return "fb" + C1601x.m7389c() + "://authorize";
    }

    /* renamed from: a */
    private void m6475a(int i, Intent intent) {
        C1020d.m5430a((Context) this).mo5018a(this.f4752f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C1529k.f5236a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f4747a);
            new C1515o("oauth", bundleExtra).mo6241a(this, getIntent().getStringExtra(f4748b));
            this.f4751e = false;
            this.f4752f = new C1530l(this);
            C1020d.m5430a((Context) this).mo5019a(this.f4752f, new IntentFilter(C1529k.f5236a));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f4750d.equals(intent.getAction())) {
            C1020d.m5430a((Context) this).mo5020a(new Intent(C1529k.f5237b));
        } else if (!C1529k.f5236a.equals(intent.getAction())) {
            return;
        }
        m6475a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f4751e) {
            m6475a(0, (Intent) null);
        }
        this.f4751e = true;
    }
}
