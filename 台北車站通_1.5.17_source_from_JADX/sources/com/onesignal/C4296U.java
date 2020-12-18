package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.onesignal.U */
public class C4296U extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4299V.m17076a((Context) this, getIntent());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C4299V.m17076a((Context) this, getIntent());
        finish();
    }
}
