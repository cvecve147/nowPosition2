package p208e.p221b.p228e.p230b;

import p208e.p221b.p227d.C6241c;

/* renamed from: e.b.e.b.b */
public final class C6268b {

    /* renamed from: a */
    static final C6241c<Object, Object> f17379a = new C6269a();

    /* renamed from: e.b.e.b.b$a */
    static final class C6269a implements C6241c<Object, Object> {
        C6269a() {
        }
    }

    /* renamed from: a */
    public static int m23587a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m23588a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* renamed from: a */
    public static int m23589a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m23590a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m23591a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
