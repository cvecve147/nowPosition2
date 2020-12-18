package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.facebook.internal.aa */
class C1477aa implements FilenameFilter {
    C1477aa() {
    }

    public boolean accept(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }
}
