package android.support.p007v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.p007v4.app.C0308b;

/* renamed from: android.support.v4.app.a */
class C0306a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f1307a;

    /* renamed from: b */
    final /* synthetic */ Activity f1308b;

    /* renamed from: c */
    final /* synthetic */ int f1309c;

    C0306a(String[] strArr, Activity activity, int i) {
        this.f1307a = strArr;
        this.f1308b = activity;
        this.f1309c = i;
    }

    public void run() {
        int[] iArr = new int[this.f1307a.length];
        PackageManager packageManager = this.f1308b.getPackageManager();
        String packageName = this.f1308b.getPackageName();
        int length = this.f1307a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f1307a[i], packageName);
        }
        ((C0308b.C0309a) this.f1308b).onRequestPermissionsResult(this.f1309c, this.f1307a, iArr);
    }
}
