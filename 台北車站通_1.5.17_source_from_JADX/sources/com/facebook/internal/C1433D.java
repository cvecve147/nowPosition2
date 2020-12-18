package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.internal.D */
class C1433D implements FilenameFilter {
    C1433D() {
    }

    public boolean accept(File file, String str) {
        return !str.startsWith("buffer");
    }
}
