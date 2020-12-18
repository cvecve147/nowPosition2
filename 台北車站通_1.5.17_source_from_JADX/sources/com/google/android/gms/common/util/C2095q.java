package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: com.google.android.gms.common.util.q */
public class C2095q {
    @Deprecated
    /* renamed from: a */
    public static void m9176a(Context context, SharedPreferences.Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, String.valueOf(str).concat(".xml")).setReadable(true, false);
    }
}
