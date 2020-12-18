package afu.org.checkerframework.checker.nullness;

public final class NullnessUtils {
    private NullnessUtils() {
        throw new AssertionError("shouldn't be instantiated");
    }

    /* renamed from: a */
    private static void m57a(Object obj) {
        Class<?> componentType = obj.getClass().getComponentType();
        if (componentType != null && !componentType.isPrimitive()) {
            m58a((T[]) (Object[]) obj);
        }
    }

    /* renamed from: a */
    private static <T> T[] m58a(T[] tArr) {
        for (T a : tArr) {
            m57a((Object) a);
        }
        return tArr;
    }

    public static <T> T castNonNull(T t) {
        return t;
    }

    public static <T> T[] castNonNullDeep(T[] tArr) {
        m58a(tArr);
        return tArr;
    }

    public static <T> T[][] castNonNullDeep(T[][] tArr) {
        m58a((T[]) tArr);
        return (Object[][]) tArr;
    }

    public static <T> T[][][] castNonNullDeep(T[][][] tArr) {
        m58a((T[]) tArr);
        return (Object[][][]) tArr;
    }

    public static <T> T[][][][] castNonNullDeep(T[][][][] tArr) {
        m58a((T[]) tArr);
        return (Object[][][][]) tArr;
    }

    public static <T> T[][][][][] castNonNullDeep(T[][][][][] tArr) {
        m58a((T[]) tArr);
        return (Object[][][][][]) tArr;
    }
}
