package p013b.p018b.p028h.p038g;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: b.b.h.g.d */
public final class C1078d {

    /* renamed from: a */
    private static final Locale f4029a = new Locale("", "");

    /* renamed from: a */
    public static int m5597a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f4029a)) {
            return 0;
        }
        String a = C1069a.m5586a(locale);
        return a == null ? m5598b(locale) : (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    /* renamed from: b */
    private static int m5598b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
