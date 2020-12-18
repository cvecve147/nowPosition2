package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.v */
final class C4091v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f12131a;

    /* renamed from: b */
    private final /* synthetic */ C4090u f12132b;

    C4091v(C4090u uVar, Intent intent) {
        this.f12132b = uVar;
        this.f12131a = intent;
    }

    public final void run() {
        String action = this.f12131a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.f12132b.mo11530a();
    }
}
