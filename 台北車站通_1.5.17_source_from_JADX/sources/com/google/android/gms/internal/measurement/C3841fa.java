package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.fa */
class C3841fa extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3839ec f11451a;

    /* renamed from: b */
    private boolean f11452b;

    /* renamed from: c */
    private boolean f11453c;

    C3841fa(C3839ec ecVar) {
        C2061y.m9067a(ecVar);
        this.f11451a = ecVar;
    }

    /* renamed from: a */
    public final void mo10727a() {
        this.f11451a.mo10714n();
        this.f11451a.mo10388e();
        this.f11451a.mo10388e();
        if (this.f11452b) {
            this.f11451a.mo10385b().mo10580F().mo10592a("Unregistering connectivity change receiver");
            this.f11452b = false;
            this.f11453c = false;
            try {
                this.f11451a.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f11451a.mo10385b().mo10585y().mo10593a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo10728b() {
        this.f11451a.mo10714n();
        this.f11451a.mo10388e();
        if (!this.f11452b) {
            this.f11451a.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f11453c = this.f11451a.mo10713m().mo10658y();
            this.f11451a.mo10385b().mo10580F().mo10593a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f11453c));
            this.f11452b = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f11451a.mo10714n();
        String action = intent.getAction();
        this.f11451a.mo10385b().mo10580F().mo10593a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.f11451a.mo10713m().mo10658y();
            if (this.f11453c != y) {
                this.f11453c = y;
                this.f11451a.mo10386c().mo11020a((Runnable) new C3845ga(this, y));
                return;
            }
            return;
        }
        this.f11451a.mo10385b().mo10576B().mo10593a("NetworkBroadcastReceiver received unknown action", action);
    }
}
