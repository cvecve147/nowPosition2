package com.onesignal;

import java.io.File;

/* renamed from: com.onesignal.Fb */
class C4242Fb {
    /* renamed from: a */
    static boolean m16795a() {
        for (String str : new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}) {
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
