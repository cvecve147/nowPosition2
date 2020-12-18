package com.openlife.checkme;

import android.os.Bundle;
import android.os.Handler;
import android.support.p011v7.app.C0623m;

public class CleanLeakActivity extends C0623m {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler().postDelayed(new C4836b(this), 500);
    }
}
