package com.onesignal;

import java.security.SecureRandom;

/* renamed from: com.onesignal.bb */
class C4349bb extends C4339ab {

    /* renamed from: a */
    private static boolean f12870a;

    /* renamed from: a */
    static void m17319a(String str, String str2, String str3) {
        if (!f12870a && !C4306Xa.f12745N.f12944b && str2 != null) {
            String str4 = "?app_id=" + str + "&user_id=" + str2;
            if (str3 != null) {
                str4 = str4 + "&ad_id=" + str3;
            }
            f12870a = C4339ab.m17287a("https://onesignal.com/android_frame.html" + (str4 + "&cbs_id=" + new SecureRandom().nextInt(Integer.MAX_VALUE)), false);
        }
    }
}
