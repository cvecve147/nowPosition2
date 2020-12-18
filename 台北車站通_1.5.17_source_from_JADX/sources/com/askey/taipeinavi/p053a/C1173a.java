package com.askey.taipeinavi.p053a;

import android.os.Handler;
import android.os.Message;
import com.askey.taipeinavi.R;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.a.a */
class C1173a extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1178b f4345a;

    C1173a(C1178b bVar) {
        this.f4345a = bVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == R.id.request_failed) {
            this.f4345a.f4352b.mo5474a(message.arg1, (C6695b.C6696a) message.obj);
        } else if (i == R.id.request_success) {
            this.f4345a.f4352b.mo5473a(message.arg1);
        }
    }
}
