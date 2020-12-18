package com.onesignal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: com.onesignal.Jb */
class C4257Jb implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C4273Mb f12633a;

    C4257Jb(C4273Mb mb) {
        this.f12633a = mb;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            Method a = C4273Mb.m16957c((Class) Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
            a.setAccessible(true);
            Object unused = this.f12633a.f12671d = a.invoke((Object) null, new Object[]{iBinder});
            this.f12633a.m16958c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        int unused = C4273Mb.f12668a = -99;
        Object unused2 = this.f12633a.f12671d = null;
    }
}
