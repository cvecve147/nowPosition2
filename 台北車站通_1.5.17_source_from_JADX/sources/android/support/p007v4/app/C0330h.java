package android.support.p007v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.h */
public final class C0330h {

    /* renamed from: android.support.v4.app.h$a */
    static class C0331a {

        /* renamed from: a */
        private static Method f1376a;

        /* renamed from: b */
        private static boolean f1377b;

        /* renamed from: c */
        private static Method f1378c;

        /* renamed from: d */
        private static boolean f1379d;

        /* renamed from: a */
        public static IBinder m1460a(Bundle bundle, String str) {
            if (!f1377b) {
                try {
                    f1376a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1376a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1377b = true;
            }
            Method method = f1376a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1376a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1461a(Bundle bundle, String str, IBinder iBinder) {
            if (!f1379d) {
                try {
                    f1378c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1378c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1379d = true;
            }
            Method method = f1378c;
            if (method != null) {
                try {
                    method.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f1378c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1458a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0331a.m1460a(bundle, str);
    }

    /* renamed from: a */
    public static void m1459a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0331a.m1461a(bundle, str, iBinder);
        }
    }
}
