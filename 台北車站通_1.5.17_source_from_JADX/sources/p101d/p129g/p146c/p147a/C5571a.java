package p101d.p129g.p146c.p147a;

/* renamed from: d.g.c.a.a */
public final class C5571a {
    /* renamed from: a */
    public static int m21184a(int i, int i2) {
        m21185a(i, i2, "index");
        return i;
    }

    /* renamed from: a */
    public static int m21185a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m21190b(i, i2, str));
    }

    /* renamed from: a */
    public static <T> T m21186a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static String m21187a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf, i2, indexOf);
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m21188a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m21189b(i, i2, i3));
        }
    }

    /* renamed from: b */
    private static String m21189b(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m21191c(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m21191c(i2, i3, "end index");
        }
        return m21187a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: b */
    private static String m21190b(int i, int i2, String str) {
        if (i < 0) {
            return m21187a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m21187a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: c */
    private static String m21191c(int i, int i2, String str) {
        if (i < 0) {
            return m21187a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m21187a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
