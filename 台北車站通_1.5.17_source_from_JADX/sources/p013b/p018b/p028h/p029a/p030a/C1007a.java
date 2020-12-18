package p013b.p018b.p028h.p029a.p030a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;
import org.xmlpull.v1.XmlPullParser;
import p013b.p018b.p019a.C0931b;
import p013b.p018b.p028h.p037f.C1054a;

/* renamed from: b.b.h.a.a.a */
public class C1007a {

    /* renamed from: b.b.h.a.a.a$a */
    public interface C1008a {
    }

    /* renamed from: b.b.h.a.a.a$b */
    public static final class C1009b implements C1008a {

        /* renamed from: a */
        private final C1010c[] f3902a;

        public C1009b(C1010c[] cVarArr) {
            this.f3902a = cVarArr;
        }

        /* renamed from: a */
        public C1010c[] mo5002a() {
            return this.f3902a;
        }
    }

    /* renamed from: b.b.h.a.a.a$c */
    public static final class C1010c {

        /* renamed from: a */
        private final String f3903a;

        /* renamed from: b */
        private int f3904b;

        /* renamed from: c */
        private boolean f3905c;

        /* renamed from: d */
        private int f3906d;

        public C1010c(String str, int i, boolean z, int i2) {
            this.f3903a = str;
            this.f3904b = i;
            this.f3905c = z;
            this.f3906d = i2;
        }

        /* renamed from: a */
        public String mo5003a() {
            return this.f3903a;
        }

        /* renamed from: b */
        public int mo5004b() {
            return this.f3906d;
        }

        /* renamed from: c */
        public int mo5005c() {
            return this.f3904b;
        }

        /* renamed from: d */
        public boolean mo5006d() {
            return this.f3905c;
        }
    }

    /* renamed from: b.b.h.a.a.a$d */
    public static final class C1011d implements C1008a {

        /* renamed from: a */
        private final C1054a f3907a;

        /* renamed from: b */
        private final int f3908b;

        /* renamed from: c */
        private final int f3909c;

        public C1011d(C1054a aVar, int i, int i2) {
            this.f3907a = aVar;
            this.f3909c = i;
            this.f3908b = i2;
        }

        /* renamed from: a */
        public int mo5007a() {
            return this.f3909c;
        }

        /* renamed from: b */
        public C1054a mo5008b() {
            return this.f3907a;
        }

        /* renamed from: c */
        public int mo5009c() {
            return this.f3908b;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static p013b.p018b.p028h.p029a.p030a.C1007a.C1008a m5395a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            b.b.h.a.a.a$a r3 = m5399b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p029a.p030a.C1007a.m5395a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):b.b.h.a.a.a$a");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m5396a(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(m5397a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(m5397a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m5397a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m5398a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static C1008a m5399b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m5400c(xmlPullParser, resources);
        }
        m5398a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C1008a m5400c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0931b.FontFamily);
        String string = obtainAttributes.getString(C0931b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0931b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0931b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0931b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0931b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0931b.FontFamily_fontProviderFetchTimeout, HttpStatus.SC_INTERNAL_SERVER_ERROR);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m5401d(xmlPullParser, resources));
                    } else {
                        m5398a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1009b((C1010c[]) arrayList.toArray(new C1010c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m5398a(xmlPullParser);
        }
        return new C1011d(new C1054a(string, string2, string3, m5396a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C1010c m5401d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0931b.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0931b.FontFamilyFont_fontWeight) ? C0931b.FontFamilyFont_fontWeight : C0931b.FontFamilyFont_android_fontWeight, HttpStatus.SC_BAD_REQUEST);
        boolean z = true;
        if (1 != obtainAttributes.getInt(obtainAttributes.hasValue(C0931b.FontFamilyFont_fontStyle) ? C0931b.FontFamilyFont_fontStyle : C0931b.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(C0931b.FontFamilyFont_font) ? C0931b.FontFamilyFont_font : C0931b.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m5398a(xmlPullParser);
        }
        return new C1010c(string, i, z, resourceId);
    }
}
