package p250g.p255b.p256a;

import org.apache.http.message.TokenParser;

/* renamed from: g.b.a.j */
public class C6573j extends IllegalArgumentException {

    /* renamed from: a */
    private final C6517d f18299a;

    /* renamed from: b */
    private final C6571i f18300b = null;

    /* renamed from: c */
    private final String f18301c;

    /* renamed from: d */
    private final Number f18302d;

    /* renamed from: e */
    private final String f18303e;

    /* renamed from: f */
    private final Number f18304f;

    /* renamed from: g */
    private final Number f18305g;

    /* renamed from: h */
    private String f18306h;

    public C6573j(C6517d dVar, Number number, Number number2, Number number3) {
        super(m25142a(dVar.mo16835F(), number, number2, number3, (String) null));
        this.f18299a = dVar;
        this.f18301c = dVar.mo16835F();
        this.f18302d = number;
        this.f18303e = null;
        this.f18304f = number2;
        this.f18305g = number3;
        this.f18306h = super.getMessage();
    }

    public C6573j(C6517d dVar, Number number, String str) {
        super(m25142a(dVar.mo16835F(), number, (Number) null, (Number) null, str));
        this.f18299a = dVar;
        this.f18301c = dVar.mo16835F();
        this.f18302d = number;
        this.f18303e = null;
        this.f18304f = null;
        this.f18305g = null;
        this.f18306h = super.getMessage();
    }

    public C6573j(C6517d dVar, String str) {
        super(m25143a(dVar.mo16835F(), str));
        this.f18299a = dVar;
        this.f18301c = dVar.mo16835F();
        this.f18303e = str;
        this.f18302d = null;
        this.f18304f = null;
        this.f18305g = null;
        this.f18306h = super.getMessage();
    }

    /* renamed from: a */
    private static String m25142a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(TokenParser.f19315SP);
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m25143a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Value ");
        if (str2 == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(TokenParser.DQUOTE);
            stringBuffer.append(str2);
            stringBuffer.append(TokenParser.DQUOTE);
        }
        stringBuffer.append(" for ");
        stringBuffer.append(str);
        stringBuffer.append(TokenParser.f19315SP);
        stringBuffer.append("is not supported");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo16977a(String str) {
        if (this.f18306h != null) {
            if (str != null) {
                str = str + ": " + this.f18306h;
            } else {
                return;
            }
        }
        this.f18306h = str;
    }

    public String getMessage() {
        return this.f18306h;
    }
}
