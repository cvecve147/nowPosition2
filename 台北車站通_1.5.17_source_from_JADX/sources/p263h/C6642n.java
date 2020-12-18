package p263h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p263h.C6616c;

/* renamed from: h.n */
class C6642n {

    /* renamed from: a */
    private static final C6642n f18368a = m25230c();

    /* renamed from: h.n$a */
    static class C6643a extends C6642n {

        /* renamed from: h.n$a$a */
        static class C6644a implements Executor {

            /* renamed from: a */
            private final Handler f18369a = new Handler(Looper.getMainLooper());

            C6644a() {
            }

            public void execute(Runnable runnable) {
                this.f18369a.post(runnable);
            }
        }

        C6643a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6616c.C6617a mo17034a(Executor executor) {
            return new C6623h(executor);
        }

        /* renamed from: a */
        public Executor mo17036a() {
            return new C6644a();
        }
    }

    /* renamed from: h.n$b */
    static class C6645b extends C6642n {

        /* renamed from: h.n$b$a */
        static class C6646a implements Executor {

            /* renamed from: a */
            private static Object f18370a;

            /* renamed from: b */
            private static Method f18371b;

            static {
                try {
                    Class<?> cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f18370a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke((Object) null, new Object[0]);
                    f18371b = cls.getDeclaredMethod("addOperation", new Class[]{Runnable.class});
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }

            C6646a() {
            }

            public void execute(Runnable runnable) {
                try {
                    f18371b.invoke(f18370a, new Object[]{runnable});
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        C6645b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6616c.C6617a mo17034a(Executor executor) {
            return new C6623h(executor);
        }

        /* renamed from: a */
        public Executor mo17036a() {
            return new C6646a();
        }
    }

    /* renamed from: h.n$c */
    static class C6647c extends C6642n {
        C6647c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo17035a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17037a(Method method) {
            return method.isDefault();
        }
    }

    C6642n() {
    }

    /* renamed from: b */
    static C6642n m25229b() {
        return f18368a;
    }

    /* renamed from: c */
    private static C6642n m25230c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C6643a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C6647c();
        } catch (ClassNotFoundException unused2) {
            try {
                Class.forName("org.robovm.apple.foundation.NSObject");
                return new C6645b();
            } catch (ClassNotFoundException unused3) {
                return new C6642n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6616c.C6617a mo17034a(Executor executor) {
        return executor != null ? new C6623h(executor) : C6621f.f18328a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo17035a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Executor mo17036a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17037a(Method method) {
        return false;
    }
}
