package android.support.p007v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.p007v4.app.C0297Y;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: android.support.v4.app.aa */
class C0307aa {

    /* renamed from: a */
    private static final Object f1310a = new Object();

    /* renamed from: b */
    private static Field f1311b;

    /* renamed from: c */
    private static boolean f1312c;

    /* renamed from: d */
    private static final Object f1313d = new Object();

    /* renamed from: a */
    public static Bundle m1383a(Notification.Builder builder, C0297Y.C0298a aVar) {
        builder.addAction(aVar.mo1187e(), aVar.mo1189g(), aVar.mo1183a());
        Bundle bundle = new Bundle(aVar.mo1186d());
        if (aVar.mo1188f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1387a(aVar.mo1188f()));
        }
        if (aVar.mo1185c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1387a(aVar.mo1185c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1184b());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m1384a(Notification notification) {
        String str;
        String str2;
        synchronized (f1310a) {
            if (f1312c) {
                return null;
            }
            try {
                if (f1311b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1312c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1311b = declaredField;
                }
                Bundle bundle = (Bundle) f1311b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1311b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1312c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1312c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m1385a(C0323da daVar) {
        new Bundle();
        daVar.mo1272a();
        throw null;
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m1386a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m1387a(C0323da[] daVarArr) {
        if (daVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[daVarArr.length];
        if (daVarArr.length <= 0) {
            return bundleArr;
        }
        m1385a(daVarArr[0]);
        throw null;
    }
}
