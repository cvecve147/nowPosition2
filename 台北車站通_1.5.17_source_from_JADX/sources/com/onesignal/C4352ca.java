package com.onesignal;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.onesignal.ca */
class C4352ca {
    /* renamed from: a */
    static void m17321a(TimerTask timerTask, String str, long j) {
        new Timer("trigger_timer:" + str).schedule(timerTask, j);
    }
}
