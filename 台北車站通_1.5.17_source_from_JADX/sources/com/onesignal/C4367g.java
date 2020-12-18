package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;

@TargetApi(23)
/* renamed from: com.onesignal.g */
class C4367g {
    /* renamed from: a */
    static void m17345a(Activity activity, String[] strArr, int i) {
        if (activity instanceof C4377i) {
            ((C4377i) activity).mo12506b(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
