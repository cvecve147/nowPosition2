package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.nf */
public final class C3318nf {

    /* renamed from: a */
    private final BroadcastReceiver f9861a = new C3347of(this);

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f9862b = new WeakHashMap();

    /* renamed from: c */
    private boolean f9863c = false;

    /* renamed from: d */
    private boolean f9864d;

    /* renamed from: e */
    private Context f9865e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m13147a(Context context, Intent intent) {
        for (Map.Entry next : this.f9862b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) next.getKey()).onReceive(context, intent);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9785a(Context context) {
        if (!this.f9863c) {
            this.f9865e = context.getApplicationContext();
            if (this.f9865e == null) {
                this.f9865e = context;
            }
            C2558Nu.m10773a(this.f9865e);
            this.f9864d = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7855_c)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f9865e.registerReceiver(this.f9861a, intentFilter);
            this.f9863c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo9786a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f9864d) {
            this.f9862b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: a */
    public final synchronized void mo9787a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f9864d) {
            this.f9862b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
