package p245f.p246a.p247a.p248a.p249a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: f.a.a.a.a.g */
public class C6455g {

    /* renamed from: f.a.a.a.a.g$a */
    public interface C6456a {
        /* renamed from: a */
        Object mo16626a(XmlPullParser xmlPullParser, String str);
    }

    /* renamed from: f.a.a.a.a.g$b */
    public interface C6457b {
        /* renamed from: a */
        void mo16627a(Object obj, String str, XmlSerializer xmlSerializer);
    }

    /* renamed from: a */
    private static final Object m24105a(XmlPullParser xmlPullParser, String str) {
        try {
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value")));
            }
            if (str.equals("long")) {
                return Long.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("float")) {
                return Float.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("double")) {
                return Double.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            if (str.equals("boolean")) {
                return Boolean.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            }
            return null;
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need value attribute in <" + str + ">");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in value attribute in <" + str + ">");
        }
    }

    /* renamed from: a */
    private static final Object m24106a(XmlPullParser xmlPullParser, String[] strArr, C6456a aVar) {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else {
                obj = m24105a(xmlPullParser, name);
                if (obj == null) {
                    if (name.equals("int-array")) {
                        int[] b = m24122b(xmlPullParser, "int-array", strArr);
                        strArr[0] = attributeValue;
                        return b;
                    } else if (name.equals("long-array")) {
                        long[] d = m24125d(xmlPullParser, "long-array", strArr);
                        strArr[0] = attributeValue;
                        return d;
                    } else if (name.equals("double-array")) {
                        double[] a = m24120a(xmlPullParser, "double-array", strArr);
                        strArr[0] = attributeValue;
                        return a;
                    } else if (name.equals("string-array")) {
                        String[] g = m24128g(xmlPullParser, "string-array", strArr);
                        strArr[0] = attributeValue;
                        return g;
                    } else if (name.equals("map")) {
                        xmlPullParser.next();
                        HashMap<String, ?> e = m24126e(xmlPullParser, "map", strArr);
                        strArr[0] = attributeValue;
                        return e;
                    } else if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList c = m24123c(xmlPullParser, "list", strArr);
                        strArr[0] = attributeValue;
                        return c;
                    } else if (name.equals("set")) {
                        xmlPullParser.next();
                        HashSet f = m24127f(xmlPullParser, "set", strArr);
                        strArr[0] = attributeValue;
                        return f;
                    } else if (aVar != null) {
                        Object a2 = aVar.mo16626a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return a2;
                    } else {
                        throw new XmlPullParserException("Unknown tag: " + name);
                    }
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m24107a(XmlPullParser xmlPullParser, String str, String[] strArr, C6456a aVar) {
        HashMap<String, ?> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], m24106a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: a */
    public static final void m24108a(Object obj, String str, XmlSerializer xmlSerializer) {
        m24109a(obj, str, xmlSerializer, (C6457b) null);
    }

    /* renamed from: a */
    private static final void m24109a(Object obj, String str, XmlSerializer xmlSerializer, C6457b bVar) {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag((String) null, "null");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag((String) null, "string");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                m24115a((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                m24117a((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof long[]) {
                m24118a((long[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof double[]) {
                m24116a((double[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof String[]) {
                m24119a((String[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                m24111a((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                m24110a((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                m24114a((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag((String) null, "string");
                if (str != null) {
                    xmlSerializer.attribute((String) null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag((String) null, "string");
                return;
            } else if (bVar != null) {
                bVar.mo16627a(obj, str, xmlSerializer);
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    /* renamed from: a */
    public static final void m24110a(List list, String str, XmlSerializer xmlSerializer) {
        if (list == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "list");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m24108a(list.get(i), (String) null, xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "list");
    }

    /* renamed from: a */
    public static final void m24111a(Map map, String str, XmlSerializer xmlSerializer) {
        m24112a(map, str, xmlSerializer, (C6457b) null);
    }

    /* renamed from: a */
    public static final void m24112a(Map map, String str, XmlSerializer xmlSerializer, C6457b bVar) {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        m24113a(map, xmlSerializer, bVar);
        xmlSerializer.endTag((String) null, "map");
    }

    /* renamed from: a */
    public static final void m24113a(Map map, XmlSerializer xmlSerializer, C6457b bVar) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                m24109a(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
            }
        }
    }

    /* renamed from: a */
    public static final void m24114a(Set set, String str, XmlSerializer xmlSerializer) {
        if (set == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "set");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        for (Object a : set) {
            m24108a(a, (String) null, xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "set");
    }

    /* renamed from: a */
    public static final void m24115a(byte[] bArr, String str, XmlSerializer xmlSerializer) {
        if (bArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r8));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b >> 4;
            sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
            byte b2 = b & 255;
            sb.append(b2 >= 10 ? (b2 + 97) - 10 : b2 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag((String) null, "byte-array");
    }

    /* renamed from: a */
    public static final void m24116a(double[] dArr, String str, XmlSerializer xmlSerializer) {
        if (dArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "double-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (double d : dArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", Double.toString(d));
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "double-array");
    }

    /* renamed from: a */
    public static final void m24117a(int[] iArr, String str, XmlSerializer xmlSerializer) {
        if (iArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "int-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (int num : iArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", Integer.toString(num));
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "int-array");
    }

    /* renamed from: a */
    public static final void m24118a(long[] jArr, String str, XmlSerializer xmlSerializer) {
        if (jArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "long-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (long l : jArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", Long.toString(l));
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "long-array");
    }

    /* renamed from: a */
    public static final void m24119a(String[] strArr, String str, XmlSerializer xmlSerializer) {
        if (strArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "string-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (String attribute : strArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", attribute);
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "string-array");
    }

    /* renamed from: a */
    public static final double[] m24120a(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            double[] dArr = new double[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            dArr[i] = Double.parseDouble(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    /* renamed from: b */
    private static final ArrayList m24121b(XmlPullParser xmlPullParser, String str, String[] strArr, C6456a aVar) {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m24106a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: b */
    public static final int[] m24122b(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            int[] iArr = new int[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    /* renamed from: c */
    public static final ArrayList m24123c(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m24121b(xmlPullParser, str, strArr, (C6456a) null);
    }

    /* renamed from: c */
    private static final HashSet m24124c(XmlPullParser xmlPullParser, String str, String[] strArr, C6456a aVar) {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m24106a(xmlPullParser, strArr, aVar));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: d */
    public static final long[] m24125d(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            long[] jArr = new long[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            jArr[i] = Long.parseLong(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    /* renamed from: e */
    public static final HashMap<String, ?> m24126e(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m24107a(xmlPullParser, str, strArr, (C6456a) null);
    }

    /* renamed from: f */
    public static final HashSet m24127f(XmlPullParser xmlPullParser, String str, String[] strArr) {
        return m24124c(xmlPullParser, str, strArr, (C6456a) null);
    }

    /* renamed from: g */
    public static final String[] m24128g(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"));
            xmlPullParser.next();
            String[] strArr2 = new String[parseInt];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            strArr2[i] = xmlPullParser.getAttributeValue((String) null, "value");
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }
}
