package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zu */
final class C3676zu implements Callable<Boolean> {
    C3676zu() {
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
