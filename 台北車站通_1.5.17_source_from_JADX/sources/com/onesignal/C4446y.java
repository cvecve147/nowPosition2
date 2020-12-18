package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import org.apache.http.protocol.HTTP;

/* renamed from: com.onesignal.y */
class C4446y implements Runnable {
    C4446y() {
    }

    public void run() {
        Activity activity = C4342b.f12860f;
        if (activity != null && !C4306Xa.f12737F.f12786f) {
            String a = C4252Ia.m16864a((Context) activity, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String a2 = C4252Ia.m16864a((Context) activity, "onesignal_gms_missing_alert_button_update", "Update");
            String a3 = C4252Ia.m16864a((Context) activity, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(activity).setMessage(a).setPositiveButton(a2, new C4443x(this, activity)).setNegativeButton(a3, new C4439w(this)).setNeutralButton(C4252Ia.m16864a((Context) activity, "onesignal_gms_missing_alert_button_close", HTTP.CONN_CLOSE), (DialogInterface.OnClickListener) null).create().show();
        }
    }
}
