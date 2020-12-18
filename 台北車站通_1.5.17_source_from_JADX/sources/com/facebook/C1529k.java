package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.facebook.k */
public class C1529k extends Activity {

    /* renamed from: a */
    public static final String f5236a = (C1529k.class.getSimpleName() + ".action_customTabRedirect");

    /* renamed from: b */
    public static final String f5237b = (C1529k.class.getSimpleName() + ".action_destroy");

    /* renamed from: c */
    private BroadcastReceiver f5238c;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f5236a);
            intent2.putExtra(CustomTabMainActivity.f4749c, getIntent().getDataString());
            C1020d.m5430a((Context) this).mo5020a(intent2);
            this.f5238c = new C1528j(this);
            C1020d.m5430a((Context) this).mo5019a(this.f5238c, new IntentFilter(f5237b));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f5236a);
        intent.putExtra(CustomTabMainActivity.f4749c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1020d.m5430a((Context) this).mo5018a(this.f5238c);
        super.onDestroy();
    }
}
