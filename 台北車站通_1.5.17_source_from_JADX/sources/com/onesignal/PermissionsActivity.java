package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.C4342b;

public class PermissionsActivity extends Activity {

    /* renamed from: a */
    private static final String f12696a = "com.onesignal.PermissionsActivity";

    /* renamed from: b */
    static boolean f12697b;

    /* renamed from: c */
    static boolean f12698c;

    /* renamed from: d */
    private static C4342b.C4343a f12699d;

    /* renamed from: a */
    static void m17021a() {
        if (!f12697b && !f12698c) {
            f12699d = new C4438vb();
            C4342b.m17294a(f12696a, f12699d);
        }
    }

    /* renamed from: b */
    private void m17022b() {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
        } else if (!f12697b) {
            f12697b = true;
            C4363f.m17339a(this, new String[]{C4264M.f12648c}, 2);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4306Xa.m17176f((Context) this);
        if (bundle == null || !bundle.getBoolean("android:hasCurrentPermissionsRequest", false)) {
            m17022b();
        } else {
            f12697b = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C4306Xa.f12765k) {
            m17022b();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f12698c = true;
        f12697b = false;
        if (i == 2) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                C4264M.m16931e();
            } else {
                C4264M.m16933g();
            }
        }
        C4342b.m17292a(f12696a);
        finish();
    }
}
