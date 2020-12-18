package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import com.onesignal.C4306Xa;

/* renamed from: com.onesignal.Ua */
class C4297Ua implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4306Xa.C4316j f12724a;

    /* renamed from: b */
    final /* synthetic */ String f12725b;

    C4297Ua(C4306Xa.C4316j jVar, String str) {
        this.f12724a = jVar;
        this.f12725b = str;
    }

    public void run() {
        Activity activity = C4342b.f12860f;
        if (activity != null) {
            new AlertDialog.Builder(activity).setTitle(this.f12724a.toString()).setMessage(this.f12725b).show();
        }
    }
}
