package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.P */
final class C4067P {

    /* renamed from: a */
    private final Messenger f12071a;

    /* renamed from: b */
    private final zzi f12072b;

    C4067P(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f12071a = new Messenger(iBinder);
            this.f12072b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f12072b = new zzi(iBinder);
            this.f12071a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11497a(Message message) {
        Messenger messenger = this.f12071a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzi zzi = this.f12072b;
        if (zzi != null) {
            zzi.mo11539a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
