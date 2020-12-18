package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

public class FirebaseInstanceIdService extends C4088s {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo11478a(Intent intent) {
        return C4083n.m16330a().f12104d.poll();
    }

    /* renamed from: a */
    public void mo11479a() {
    }

    /* renamed from: c */
    public final void mo11480c(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo11479a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m16247b().mo11474i();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m16247b().mo11475j();
            }
        }
    }
}
