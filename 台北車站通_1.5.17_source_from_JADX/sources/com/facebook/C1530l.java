package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.l */
class C1530l extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ CustomTabMainActivity f5239a;

    C1530l(CustomTabMainActivity customTabMainActivity) {
        this.f5239a = customTabMainActivity;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(this.f5239a, CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.f4750d);
        String str = CustomTabMainActivity.f4749c;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        this.f5239a.startActivity(intent2);
    }
}
