package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {

    /* renamed from: a */
    private static boolean f4201a = false;

    /* renamed from: b */
    static final Map<Class<?>, Constructor<? extends Unbinder>> f4202b = new LinkedHashMap();

    public interface Action<T extends View> {
    }

    public interface Setter<T extends View, V> {
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static <T extends View> T m5839a(View view, int i) {
        return view.findViewById(i);
    }

    /* renamed from: a */
    public static Unbinder m5840a(Activity activity) {
        return m5845b(activity, activity.getWindow().getDecorView());
    }

    /* renamed from: a */
    public static Unbinder m5841a(Dialog dialog) {
        return m5845b(dialog, dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public static Unbinder m5842a(View view) {
        return m5845b(view, view);
    }

    /* renamed from: a */
    public static Unbinder m5843a(Object obj, View view) {
        return m5845b(obj, view);
    }

    /* renamed from: a */
    private static Constructor<? extends Unbinder> m5844a(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = f4202b.get(cls);
        if (constructor2 != null) {
            if (f4201a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor2;
        }
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("java.")) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                constructor = classLoader.loadClass(name + "_ViewBinding").getConstructor(new Class[]{cls, View.class});
                if (f4201a) {
                    Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
                }
            } catch (ClassNotFoundException unused) {
                if (f4201a) {
                    Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
                }
                constructor = m5844a((Class<?>) cls.getSuperclass());
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Unable to find binding constructor for " + name, e);
            }
            f4202b.put(cls, constructor);
            return constructor;
        } else if (!f4201a) {
            return null;
        } else {
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
    }

    /* renamed from: b */
    private static Unbinder m5845b(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (f4201a) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> a = m5844a(cls);
        if (a == null) {
            return Unbinder.f4214a;
        }
        try {
            return (Unbinder) a.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + a, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + a, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }
}
