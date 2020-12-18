package com.facebook.p062b.p063a;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* renamed from: com.facebook.b.a.a */
class C1418a implements NsdManager.RegistrationListener {

    /* renamed from: a */
    final /* synthetic */ String f4974a;

    /* renamed from: b */
    final /* synthetic */ String f4975b;

    C1418a(String str, String str2) {
        this.f4974a = str;
        this.f4975b = str2;
    }

    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        C1419b.m6749a(this.f4975b);
    }

    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (!this.f4974a.equals(nsdServiceInfo.getServiceName())) {
            C1419b.m6749a(this.f4975b);
        }
    }

    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
    }

    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }
}
