package com.journeyapps.barcodescanner.p077a;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.journeyapps.barcodescanner.a.a */
class C4108a implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C4111d f12191a;

    C4108a(C4111d dVar) {
        this.f12191a = dVar;
    }

    public boolean handleMessage(Message message) {
        if (message.what != this.f12191a.f12201h) {
            return false;
        }
        this.f12191a.m16423e();
        return true;
    }
}
