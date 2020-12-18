package p013b.p018b.p028h.p029a.p030a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b.b.h.a.a.e */
public class C1016e {
    /* renamed from: a */
    public static float m5418a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m5423a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m5419a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m5423a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m5420a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m5421a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m5423a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m5422a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m5423a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m5423a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m5424b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m5423a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m5425b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m5423a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m5426c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m5423a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
