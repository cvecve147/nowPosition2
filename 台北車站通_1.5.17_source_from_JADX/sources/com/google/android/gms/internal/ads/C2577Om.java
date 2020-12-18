package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import com.google.android.gms.internal.ads.C2577Om.C2578a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Om */
public abstract class C2577Om<MessageType extends C2577Om<MessageType, BuilderType>, BuilderType extends C2578a<MessageType, BuilderType>> extends C2838Xl<MessageType, BuilderType> {
    private static Map<Object, C2577Om<?, ?>> zzdtv = new ConcurrentHashMap();
    protected C3067eo zzdtt = C3067eo.m12291c();
    private int zzdtu = -1;

    /* renamed from: com.google.android.gms.internal.ads.Om$a */
    public static abstract class C2578a<MessageType extends C2577Om<MessageType, BuilderType>, BuilderType extends C2578a<MessageType, BuilderType>> extends C2866Yl<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f8043a;

        /* renamed from: b */
        protected MessageType f8044b;

        /* renamed from: c */
        private boolean f8045c = false;

        protected C2578a(MessageType messagetype) {
            this.f8043a = messagetype;
            this.f8044b = (C2577Om) messagetype.mo7821a(C2582e.f8050d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m10814a(MessageType messagetype, MessageType messagetype2) {
            C2321Fn.m9790a().mo8085a(messagetype).mo8499a(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final BuilderType mo8623a(MessageType messagetype) {
            mo8628j();
            m10814a(this.f8044b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ C2866Yl mo8624a(C2838Xl xl) {
            mo8623a((C2577Om) xl);
            return this;
        }

        /* renamed from: b */
        public final /* synthetic */ C3498tn mo8625b() {
            if (this.f8045c) {
                return this.f8044b;
            }
            MessageType messagetype = this.f8044b;
            C2321Fn.m9790a().mo8085a(messagetype).mo8504c(messagetype);
            this.f8045c = true;
            return this.f8044b;
        }

        /* renamed from: c */
        public final /* synthetic */ C3498tn mo8626c() {
            boolean z = true;
            if (!this.f8045c) {
                MessageType messagetype = this.f8044b;
                C2321Fn.m9790a().mo8085a(messagetype).mo8504c(messagetype);
                this.f8045c = true;
            }
            MessageType messagetype2 = this.f8044b;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C2321Fn.m9790a().mo8085a(messagetype2).mo8501a(messagetype2);
                    if (booleanValue) {
                        messagetype2.mo7821a(C2582e.f8048b, (Object) z ? messagetype2 : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new C3009co(messagetype2);
        }

        public /* synthetic */ Object clone() {
            C2578a aVar = (C2578a) this.f8043a.mo7821a(C2582e.f8051e, (Object) null, (Object) null);
            if (!this.f8045c) {
                MessageType messagetype = this.f8044b;
                C2321Fn.m9790a().mo8085a(messagetype).mo8504c(messagetype);
                this.f8045c = true;
            }
            aVar.mo8623a(this.f8044b);
            return aVar;
        }

        /* renamed from: d */
        public final /* synthetic */ C3498tn mo8614d() {
            return this.f8043a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final void mo8628j() {
            if (this.f8045c) {
                MessageType messagetype = (C2577Om) this.f8044b.mo7821a(C2582e.f8050d, (Object) null, (Object) null);
                m10814a(messagetype, this.f8044b);
                this.f8044b = messagetype;
                this.f8045c = false;
            }
        }

        /* renamed from: k */
        public final MessageType mo8629k() {
            boolean z = true;
            if (!this.f8045c) {
                MessageType messagetype = this.f8044b;
                C2321Fn.m9790a().mo8085a(messagetype).mo8504c(messagetype);
                this.f8045c = true;
            }
            MessageType messagetype2 = this.f8044b;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C2321Fn.m9790a().mo8085a(messagetype2).mo8501a(messagetype2);
                    if (booleanValue) {
                        messagetype2.mo7821a(C2582e.f8048b, (Object) z ? messagetype2 : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new C3009co(messagetype2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Om$b */
    public static class C2579b<T extends C2577Om<T, ?>> extends C2950am<T> {

        /* renamed from: b */
        private T f8046b;

        public C2579b(T t) {
            this.f8046b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Om$c */
    public static abstract class C2580c<MessageType extends C2580c<MessageType, BuilderType>, BuilderType> extends C2577Om<MessageType, BuilderType> implements C3556vn {
        protected C2350Gm<Object> zzdtz = C2350Gm.m9983g();
    }

    /* renamed from: com.google.android.gms.internal.ads.Om$d */
    public static class C2581d<ContainingType extends C3498tn, Type> extends C3639ym<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.ads.Om$e */
    public static final class C2582e {

        /* renamed from: a */
        public static final int f8047a = 1;

        /* renamed from: b */
        public static final int f8048b = 2;

        /* renamed from: c */
        public static final int f8049c = 3;

        /* renamed from: d */
        public static final int f8050d = 4;

        /* renamed from: e */
        public static final int f8051e = 5;

        /* renamed from: f */
        public static final int f8052f = 6;

        /* renamed from: g */
        public static final int f8053g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f8054h = {f8047a, f8048b, f8049c, f8050d, f8051e, f8052f, f8053g};

        /* renamed from: i */
        public static final int f8055i = 1;

        /* renamed from: j */
        public static final int f8056j = 2;

        /* renamed from: k */
        private static final /* synthetic */ int[] f8057k = {f8055i, f8056j};

        /* renamed from: l */
        public static final int f8058l = 1;

        /* renamed from: m */
        public static final int f8059m = 2;

        /* renamed from: n */
        private static final /* synthetic */ int[] f8060n = {f8058l, f8059m};

        /* renamed from: a */
        public static int[] m10822a() {
            return (int[]) f8054h.clone();
        }
    }

    /* renamed from: a */
    protected static <T extends C2577Om<T, ?>> T m10796a(T t, C3150hm hmVar) {
        boolean z;
        T a = m10797a(t, hmVar, C2206Bm.m9445a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = C2321Fn.m9790a().mo8085a(a).mo8501a(a);
                if (booleanValue) {
                    a.mo7821a(C2582e.f8048b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                C2755Um a2 = new C3009co(a).mo9286a();
                a2.mo8932a(a);
                throw a2;
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = C2321Fn.m9790a().mo8085a(a).mo8501a(a);
                if (booleanValue2) {
                    a.mo7821a(C2582e.f8048b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                C2755Um a3 = new C3009co(a).mo9286a();
                a3.mo8932a(a);
                throw a3;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends C2577Om<T, ?>> T m10797a(T t, C3150hm hmVar, C2206Bm bm) {
        T a;
        try {
            C3411qm d = hmVar.mo9509d();
            a = m10798a(t, d, bm);
            d.mo9939a(0);
            return a;
        } catch (C2755Um e) {
            e.mo8932a(a);
            throw e;
        } catch (C2755Um e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static <T extends C2577Om<T, ?>> T m10798a(T t, C3411qm qmVar, C2206Bm bm) {
        T t2 = (C2577Om) t.mo7821a(C2582e.f8050d, (Object) null, (Object) null);
        try {
            C2321Fn.m9790a().mo8085a(t2).mo8497a(t2, C3497tm.m13888a(qmVar), bm);
            C2321Fn.m9790a().mo8085a(t2).mo8504c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C2755Um) {
                throw ((C2755Um) e.getCause());
            }
            C2755Um um = new C2755Um(e.getMessage());
            um.mo8932a(t2);
            throw um;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C2755Um) {
                throw ((C2755Um) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends C2577Om<T, ?>> T m10799a(T t, byte[] bArr) {
        T b = m10804b(t, bArr);
        if (b != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C2321Fn.m9790a().mo8085a(b).mo8501a(b);
                    if (booleanValue) {
                        b.mo7821a(C2582e.f8048b, (Object) z ? b : null, (Object) null);
                    }
                }
            }
            if (!z) {
                C2755Um a = new C3009co(b).mo9286a();
                a.mo8932a(b);
                throw a;
            }
        }
        return b;
    }

    /* renamed from: a */
    static <T extends C2577Om<?, ?>> T m10800a(Class<T> cls) {
        T t = (C2577Om) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2577Om) zzdtv.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
    }

    /* renamed from: a */
    protected static Object m10801a(C3498tn tnVar, String str, Object[] objArr) {
        return new C2379Hn(tnVar, str, objArr);
    }

    /* renamed from: a */
    static Object m10802a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static <T extends C2577Om<?, ?>> void m10803a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    /* renamed from: b */
    private static <T extends C2577Om<T, ?>> T m10804b(T t, byte[] bArr) {
        T t2 = (C2577Om) t.mo7821a(C2582e.f8050d, (Object) null, (Object) null);
        try {
            C2321Fn.m9790a().mo8085a(t2).mo8500a(t2, bArr, 0, bArr.length, new C3065em());
            C2321Fn.m9790a().mo8085a(t2).mo8504c(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C2755Um) {
                throw ((C2755Um) e.getCause());
            }
            C2755Um um = new C2755Um(e.getMessage());
            um.mo8932a(t2);
            throw um;
        } catch (IndexOutOfBoundsException unused) {
            C2755Um a = C2755Um.m11347a();
            a.mo8932a(t2);
            throw a;
        }
    }

    /* renamed from: k */
    protected static <E> C2728Tm<E> m10805k() {
        return C2351Gn.m9993b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7821a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8612a(int i) {
        this.zzdtu = i;
    }

    /* renamed from: a */
    public final void mo8613a(C3525um umVar) {
        C2321Fn.m9790a().mo8084a(getClass()).mo8498a(this, (C3613xo) C3583wm.m14338a(umVar));
    }

    /* renamed from: d */
    public final /* synthetic */ C3498tn mo8614d() {
        return (C2577Om) mo7821a(C2582e.f8052f, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final int mo8615e() {
        if (this.zzdtu == -1) {
            this.zzdtu = C2321Fn.m9790a().mo8085a(this).mo8502b(this);
        }
        return this.zzdtu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C2577Om) mo7821a(C2582e.f8052f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C2321Fn.m9790a().mo8085a(this).mo8503b(this, (C2577Om) obj);
    }

    /* renamed from: f */
    public final /* synthetic */ C3528un mo8617f() {
        C2578a aVar = (C2578a) mo7821a(C2582e.f8051e, (Object) null, (Object) null);
        aVar.mo8623a(this);
        return aVar;
    }

    /* renamed from: g */
    public final /* synthetic */ C3528un mo8618g() {
        return (C2578a) mo7821a(C2582e.f8051e, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i = this.zzdpf;
        if (i != 0) {
            return i;
        }
        this.zzdpf = C2321Fn.m9790a().mo8085a(this).mo8505d(this);
        return this.zzdpf;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo7821a(C2582e.f8047a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a = C2321Fn.m9790a().mo8085a(this).mo8501a(this);
        if (booleanValue) {
            mo7821a(C2582e.f8048b, (Object) a ? this : null, (Object) null);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo8621j() {
        return this.zzdtu;
    }

    public String toString() {
        return C3584wn.m14379a(this, super.toString());
    }
}
