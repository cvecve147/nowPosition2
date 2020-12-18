package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.firebase.iid.L */
final /* synthetic */ class C4063L implements Handler.Callback {

    /* renamed from: a */
    private final C4062K f12066a;

    C4063L(C4062K k) {
        this.f12066a = k;
    }

    public final boolean handleMessage(Message message) {
        return this.f12066a.mo11488a(message);
    }
}
