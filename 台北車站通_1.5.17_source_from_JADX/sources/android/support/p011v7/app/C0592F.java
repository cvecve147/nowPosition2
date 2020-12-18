package android.support.p011v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.F */
class C0592F {

    /* renamed from: a */
    private static Field f2238a;

    /* renamed from: b */
    private static boolean f2239b;

    /* renamed from: c */
    private static Class f2240c;

    /* renamed from: d */
    private static boolean f2241d;

    /* renamed from: e */
    private static Field f2242e;

    /* renamed from: f */
    private static boolean f2243f;

    /* renamed from: g */
    private static Field f2244g;

    /* renamed from: h */
    private static boolean f2245h;

    /* renamed from: a */
    static boolean m2906a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return m2910d(resources);
        }
        if (i >= 23) {
            return m2909c(resources);
        }
        if (i >= 21) {
            return m2908b(resources);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2907a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2241d) {
            try {
                f2240c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2241d = true;
        }
        Class cls = f2240c;
        if (cls == null) {
            return false;
        }
        if (!f2243f) {
            try {
                f2242e = cls.getDeclaredField("mUnthemedEntries");
                f2242e.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2243f = true;
        }
        Field field = f2242e;
        if (field == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* renamed from: b */
    private static boolean m2908b(Resources resources) {
        Map map;
        if (!f2239b) {
            try {
                f2238a = Resources.class.getDeclaredField("mDrawableCache");
                f2238a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2239b = true;
        }
        Field field = f2238a;
        if (field == null) {
            return false;
        }
        try {
            map = (Map) field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            map = null;
        }
        if (map == null) {
            return false;
        }
        map.clear();
        return true;
    }

    /* renamed from: c */
    private static boolean m2909c(Resources resources) {
        if (!f2239b) {
            try {
                f2238a = Resources.class.getDeclaredField("mDrawableCache");
                f2238a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2239b = true;
        }
        Object obj = null;
        Field field = f2238a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        return (obj == null || obj == null || !m2907a(obj)) ? false : true;
    }

    /* renamed from: d */
    private static boolean m2910d(Resources resources) {
        Object obj;
        if (!f2245h) {
            try {
                f2244g = Resources.class.getDeclaredField("mResourcesImpl");
                f2244g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2245h = true;
        }
        Field field = f2244g;
        if (field == null) {
            return false;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f2239b) {
            try {
                f2238a = obj.getClass().getDeclaredField("mDrawableCache");
                f2238a.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2239b = true;
        }
        Field field2 = f2238a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        return obj2 != null && m2907a(obj2);
    }
}
