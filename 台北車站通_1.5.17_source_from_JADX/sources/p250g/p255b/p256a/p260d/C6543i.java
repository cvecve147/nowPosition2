package p250g.p255b.p256a.p260d;

import java.io.IOException;
import org.apache.http.message.TokenParser;

/* renamed from: g.b.a.d.i */
public class C6543i {

    /* renamed from: a */
    private static final double f18174a = Math.log(10.0d);

    /* renamed from: a */
    static int m24924a(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    /* renamed from: a */
    static String m24925a(String str, int i) {
        StringBuilder sb;
        int i2 = i + 32;
        String concat = str.length() <= i2 + 3 ? str : str.substring(0, i2).concat("...");
        if (i <= 0) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
        } else if (i >= str.length()) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append("\" is too short");
            return sb.toString();
        } else {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append("\" is malformed at \"");
            sb.append(concat.substring(i));
        }
        sb.append(TokenParser.DQUOTE);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m24926a(Appendable appendable, int i) {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i >= 10) {
            if (i < 100) {
                int i2 = ((i + 1) * 13421772) >> 27;
                appendable.append((char) (i2 + 48));
                i = (i - (i2 << 3)) - (i2 << 1);
            } else {
                appendable.append(Integer.toString(i));
                return;
            }
        }
        appendable.append((char) (i + 48));
    }

    /* renamed from: a */
    public static void m24927a(Appendable appendable, int i, int i2) {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
        } else if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            i = (i - (i3 << 3)) - (i3 << 1);
        } else {
            int log = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log((double) i) / f18174a)) + 1;
            while (i2 > log) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        appendable.append((char) (i + 48));
    }

    /* renamed from: a */
    public static void m24928a(StringBuffer stringBuffer, int i, int i2) {
        try {
            m24927a((Appendable) stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }
}
