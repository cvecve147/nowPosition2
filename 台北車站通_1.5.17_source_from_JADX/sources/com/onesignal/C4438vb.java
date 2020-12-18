package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.C4342b;

/* renamed from: com.onesignal.vb */
class C4438vb extends C4342b.C4343a {
    C4438vb() {
    }

    /* renamed from: a */
    public void mo12462a(Activity activity) {
        if (!activity.getClass().equals(PermissionsActivity.class)) {
            Intent intent = new Intent(activity, PermissionsActivity.class);
            intent.setFlags(131072);
            activity.startActivity(intent);
        }
    }
}
