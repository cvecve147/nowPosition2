package p299tw.navin.navinmap.util;

import java.util.Locale;

/* renamed from: tw.navin.navinmap.util.c */
public class C7159c {
    /* renamed from: a */
    public static String m26968a() {
        return m26969a(Locale.getDefault().getLanguage());
    }

    /* renamed from: a */
    private static String m26969a(String str) {
        return str.equals(Locale.TRADITIONAL_CHINESE.getLanguage()) ? "zh-cht" : str.equals(Locale.SIMPLIFIED_CHINESE.getLanguage()) ? "zh-chs" : str.equals(Locale.JAPANESE.getLanguage()) ? "jp" : str.equals(Locale.KOREAN.getLanguage()) ? "ko" : "en";
    }

    /* renamed from: b */
    public static boolean m26970b() {
        String a = m26968a();
        return a.equals("zh-cht") || a.equals("zh-chs");
    }
}
