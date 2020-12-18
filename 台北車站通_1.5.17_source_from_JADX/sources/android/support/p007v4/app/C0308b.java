package android.support.p007v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: android.support.v4.app.b */
public class C0308b extends C1006a {

    /* renamed from: c */
    private static C0310b f1314c;

    /* renamed from: android.support.v4.app.b$a */
    public interface C0309a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.b$b */
    public interface C0310b {
        /* renamed from: a */
        boolean mo1235a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo1236a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.b$c */
    public interface C0311c {
        /* renamed from: b */
        void mo1237b(int i);
    }

    /* renamed from: a */
    public static C0310b m1388a() {
        return f1314c;
    }

    /* renamed from: a */
    public static void m1389a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1390a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m1391a(Activity activity, String[] strArr, int i) {
        C0310b bVar = f1314c;
        if (bVar != null && bVar.mo1236a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0311c) {
                ((C0311c) activity).mo1237b(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0309a) {
            new Handler(Looper.getMainLooper()).post(new C0306a(strArr, activity, i));
        }
    }
}
