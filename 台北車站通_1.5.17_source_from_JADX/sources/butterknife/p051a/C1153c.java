package butterknife.p051a;

import android.util.TypedValue;
import android.view.View;

/* renamed from: butterknife.a.c */
public final class C1153c {

    /* renamed from: a */
    private static final TypedValue f4217a = new TypedValue();

    /* renamed from: a */
    public static View m5849a(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        String a = m5851a(view, i);
        throw new IllegalStateException("Required view '" + a + "' with ID " + i + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    /* renamed from: a */
    public static <T> T m5850a(View view, int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            String a = m5851a(view, i);
            throw new IllegalStateException("View '" + a + "' with ID " + i + " for " + str + " was of the wrong type. See cause for more info.", e);
        }
    }

    /* renamed from: a */
    private static String m5851a(View view, int i) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i);
    }

    /* renamed from: b */
    public static <T> T m5852b(View view, int i, String str, Class<T> cls) {
        return m5850a(view.findViewById(i), i, str, cls);
    }

    /* renamed from: c */
    public static <T> T m5853c(View view, int i, String str, Class<T> cls) {
        return m5850a(m5849a(view, i, str), i, str, cls);
    }
}
