package p287me.tatarka.support.p288os;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PersistableBundle;
import java.util.Map;
import java.util.Set;

@TargetApi(21)
/* renamed from: me.tatarka.support.os.b */
class C6814b {

    /* renamed from: a */
    public static final Object f18934a = (Build.VERSION.SDK_INT >= 21 ? PersistableBundle.EMPTY : Bundle.EMPTY);

    /* renamed from: a */
    static Object m25918a() {
        return Build.VERSION.SDK_INT >= 21 ? new PersistableBundle() : new Bundle();
    }

    /* renamed from: a */
    static Object m25919a(Parcel parcel) {
        return Build.VERSION.SDK_INT >= 21 ? parcel.readPersistableBundle() : parcel.readBundle();
    }

    /* renamed from: a */
    static Object m25920a(Object obj, String str) {
        return Build.VERSION.SDK_INT >= 21 ? ((PersistableBundle) obj).get(str) : ((Bundle) obj).get(str);
    }

    /* renamed from: a */
    static Set<String> m25921a(Object obj) {
        return Build.VERSION.SDK_INT >= 21 ? ((PersistableBundle) obj).keySet() : ((Bundle) obj).keySet();
    }

    /* renamed from: a */
    static void m25922a(Parcel parcel, Object obj) {
        if (Build.VERSION.SDK_INT >= 21) {
            parcel.writePersistableBundle((PersistableBundle) obj);
        } else {
            parcel.writeBundle((Bundle) obj);
        }
    }

    /* renamed from: a */
    static void m25923a(Object obj, String str, double d) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putDouble(str, d);
        } else {
            ((Bundle) obj).putDouble(str, d);
        }
    }

    /* renamed from: a */
    static void m25924a(Object obj, String str, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putInt(str, i);
        } else {
            ((Bundle) obj).putInt(str, i);
        }
    }

    /* renamed from: a */
    static void m25925a(Object obj, String str, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putLong(str, j);
        } else {
            ((Bundle) obj).putLong(str, j);
        }
    }

    /* renamed from: a */
    static void m25926a(Object obj, String str, Object obj2) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putPersistableBundle(str, (PersistableBundle) obj2);
        } else {
            ((Bundle) obj).putBundle(str, (Bundle) obj2);
        }
    }

    /* renamed from: a */
    static void m25927a(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putString(str, str2);
        } else {
            ((Bundle) obj).putString(str, str2);
        }
    }

    /* renamed from: a */
    static void m25928a(Object obj, String str, double[] dArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putDoubleArray(str, dArr);
        } else {
            ((Bundle) obj).putDoubleArray(str, dArr);
        }
    }

    /* renamed from: a */
    static void m25929a(Object obj, String str, int[] iArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putIntArray(str, iArr);
        } else {
            ((Bundle) obj).putIntArray(str, iArr);
        }
    }

    /* renamed from: a */
    static void m25930a(Object obj, String str, long[] jArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putLongArray(str, jArr);
        } else {
            ((Bundle) obj).putLongArray(str, jArr);
        }
    }

    /* renamed from: a */
    static void m25931a(Object obj, String str, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((PersistableBundle) obj).putStringArray(str, strArr);
        } else {
            ((Bundle) obj).putStringArray(str, strArr);
        }
    }

    /* renamed from: a */
    static void m25932a(Object obj, Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                m25924a(obj, str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                m25925a(obj, str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                m25923a(obj, str, ((Double) value).doubleValue());
            } else if (value instanceof String) {
                m25927a(obj, str, (String) value);
            } else if (value instanceof int[]) {
                m25929a(obj, str, (int[]) value);
            } else if (value instanceof long[]) {
                m25930a(obj, str, (long[]) value);
            } else if (value instanceof double[]) {
                m25928a(obj, str, (double[]) value);
            } else if (value instanceof String[]) {
                m25931a(obj, str, (String[]) value);
            } else if (value instanceof Map) {
                Object a = m25918a();
                m25932a(a, (Map<String, Object>) (Map) value);
                m25926a(obj, str, a);
            } else {
                throw new IllegalArgumentException("Bad value in PersistableBundle key=" + str + " value=" + value);
            }
        }
    }

    /* renamed from: b */
    static Object m25933b(Object obj) {
        return Build.VERSION.SDK_INT >= 21 ? new PersistableBundle((PersistableBundle) obj) : new Bundle((Bundle) obj);
    }
}
