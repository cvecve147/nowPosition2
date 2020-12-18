package android.support.p007v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.app.g */
abstract class C0328g extends C0326f {

    /* renamed from: a */
    boolean f1373a;

    C0328g() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f1373a && i != -1) {
            C0326f.m1455c(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1372a && i != -1) {
            C0326f.m1455c(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
