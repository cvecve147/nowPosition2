package p245f.p246a.p247a.p248a.p249a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.message.TokenParser;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: f.a.a.a.a.e */
public class C6451e implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f17856a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    private static String f17857b = "                                                              ";

    /* renamed from: c */
    private final char[] f17858c = new char[8192];

    /* renamed from: d */
    private int f17859d;

    /* renamed from: e */
    private Writer f17860e;

    /* renamed from: f */
    private OutputStream f17861f;

    /* renamed from: g */
    private CharsetEncoder f17862g;

    /* renamed from: h */
    private ByteBuffer f17863h = ByteBuffer.allocate(8192);

    /* renamed from: i */
    private boolean f17864i = false;

    /* renamed from: j */
    private boolean f17865j;

    /* renamed from: k */
    private int f17866k = 0;

    /* renamed from: l */
    private boolean f17867l = true;

    /* renamed from: a */
    private void m24087a() {
        int position = this.f17863h.position();
        if (position > 0) {
            this.f17863h.flip();
            this.f17861f.write(this.f17863h.array(), 0, position);
            this.f17863h.clear();
        }
    }

    /* renamed from: a */
    private void m24088a(char c) {
        int i = this.f17859d;
        if (i >= 8191) {
            flush();
            i = this.f17859d;
        }
        this.f17858c[i] = c;
        this.f17859d = i + 1;
    }

    /* renamed from: a */
    private void m24089a(int i) {
        int i2 = i * 4;
        if (i2 > f17857b.length()) {
            i2 = f17857b.length();
        }
        m24091a(f17857b, 0, i2);
    }

    /* renamed from: a */
    private void m24090a(String str) {
        m24091a(str, 0, str.length());
    }

    /* renamed from: a */
    private void m24091a(String str, int i, int i2) {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m24091a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f17859d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f17859d;
        }
        str.getChars(i, i + i2, this.f17858c, i5);
        this.f17859d = i5 + i2;
    }

    /* renamed from: a */
    private void m24092a(char[] cArr, int i, int i2) {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m24092a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f17859d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f17859d;
        }
        System.arraycopy(cArr, i, this.f17858c, i5, i2);
        this.f17859d = i5 + i2;
    }

    /* renamed from: b */
    private void m24093b(String str) {
        String str2;
        int length = str.length();
        String[] strArr = f17856a;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    m24091a(str, i2, i - i2);
                }
                i2 = i + 1;
                m24090a(str2);
            }
            i++;
        }
        if (i2 < i) {
            m24091a(str, i2, i - i2);
        }
    }

    /* renamed from: b */
    private void m24094b(char[] cArr, int i, int i2) {
        String str;
        String[] strArr = f17856a;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    m24092a(cArr, i4, i - i4);
                }
                i4 = i + 1;
                m24090a(str);
            }
            i++;
        }
        if (i4 < i) {
            m24092a(cArr, i4, i - i4);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        m24088a((char) TokenParser.f19315SP);
        if (str != null) {
            m24090a(str);
            m24088a(':');
        }
        m24090a(str2);
        m24090a("=\"");
        m24093b(str3);
        m24088a((char) TokenParser.DQUOTE);
        this.f17867l = false;
        return this;
    }

    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    public void endDocument() {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) {
        String str3;
        this.f17866k--;
        if (this.f17865j) {
            str3 = " />\n";
        } else {
            if (this.f17864i && this.f17867l) {
                m24089a(this.f17866k);
            }
            m24090a("</");
            if (str != null) {
                m24090a(str);
                m24088a(':');
            }
            m24090a(str2);
            str3 = ">\n";
        }
        m24090a(str3);
        this.f17867l = true;
        this.f17865j = false;
        return this;
    }

    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public void flush() {
        int i = this.f17859d;
        if (i > 0) {
            if (this.f17861f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f17858c, 0, i);
                CharsetEncoder charsetEncoder = this.f17862g;
                ByteBuffer byteBuffer = this.f17863h;
                while (true) {
                    CoderResult encode = charsetEncoder.encode(wrap, byteBuffer, true);
                    if (!encode.isError()) {
                        if (!encode.isOverflow()) {
                            m24087a();
                            this.f17861f.flush();
                            break;
                        }
                        m24087a();
                        charsetEncoder = this.f17862g;
                        byteBuffer = this.f17863h;
                    } else {
                        throw new IOException(encode.toString());
                    }
                }
            } else {
                this.f17860e.write(this.f17858c, 0, i);
                this.f17860e.flush();
            }
            this.f17859d = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.f17864i = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.f17862g = Charset.forName(str).newEncoder();
                this.f17861f = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setOutput(Writer writer) {
        this.f17860e = writer;
    }

    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        sb.append("' ?>\n");
        m24090a(sb.toString());
        this.f17867l = true;
    }

    public XmlSerializer startTag(String str, String str2) {
        if (this.f17865j) {
            m24090a(">\n");
        }
        if (this.f17864i) {
            m24089a(this.f17866k);
        }
        this.f17866k++;
        m24088a('<');
        if (str != null) {
            m24090a(str);
            m24088a(':');
        }
        m24090a(str2);
        this.f17865j = true;
        this.f17867l = false;
        return this;
    }

    public XmlSerializer text(String str) {
        boolean z = false;
        if (this.f17865j) {
            m24090a(">");
            this.f17865j = false;
        }
        m24093b(str);
        if (this.f17864i) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == 10) {
                z = true;
            }
            this.f17867l = z;
        }
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        if (this.f17865j) {
            m24090a(">");
            this.f17865j = false;
        }
        m24094b(cArr, i, i2);
        if (this.f17864i) {
            int i3 = i + i2;
            boolean z = true;
            if (cArr[i3 - 1] != 10) {
                z = false;
            }
            this.f17867l = z;
        }
        return this;
    }
}
