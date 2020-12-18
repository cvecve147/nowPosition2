package com.onesignal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;

/* renamed from: com.onesignal.h */
class C4373h {
    /* renamed from: a */
    static int m17368a(Context context, int i) {
        return Build.VERSION.SDK_INT > 22 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: a */
    static int m17369a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }
}
