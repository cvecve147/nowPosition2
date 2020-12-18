package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.E */
class C1434E implements FilenameFilter {
    C1434E() {
    }

    public boolean accept(File file, String str) {
        return str.startsWith("buffer");
    }
}
