package p101d.p129g.p152e.p158d;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.apache.http.message.TokenParser;
import p101d.p129g.p152e.p154b.C5701t;

/* renamed from: d.g.e.d.b */
public class C5716b implements Closeable {

    /* renamed from: a */
    private static final char[] f15791a = ")]}'\n".toCharArray();

    /* renamed from: b */
    private final Reader f15792b;

    /* renamed from: c */
    private boolean f15793c = false;

    /* renamed from: d */
    private final char[] f15794d = new char[1024];

    /* renamed from: e */
    private int f15795e = 0;

    /* renamed from: f */
    private int f15796f = 0;

    /* renamed from: g */
    private int f15797g = 0;

    /* renamed from: h */
    private int f15798h = 0;

    /* renamed from: i */
    int f15799i = 0;

    /* renamed from: j */
    private long f15800j;

    /* renamed from: k */
    private int f15801k;

    /* renamed from: l */
    private String f15802l;

    /* renamed from: m */
    private int[] f15803m = new int[32];

    /* renamed from: n */
    private int f15804n = 0;

    /* renamed from: o */
    private String[] f15805o;

    /* renamed from: p */
    private int[] f15806p;

    static {
        C5701t.f15762a = new C5715a();
    }

    public C5716b(Reader reader) {
        int[] iArr = this.f15803m;
        int i = this.f15804n;
        this.f15804n = i + 1;
        iArr[i] = 6;
        this.f15805o = new String[32];
        this.f15806p = new int[32];
        if (reader != null) {
            this.f15792b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    private boolean m21569a(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo15167r();
        return false;
    }

    /* renamed from: a */
    private boolean m21570a(int i) {
        int i2;
        char[] cArr = this.f15794d;
        int i3 = this.f15798h;
        int i4 = this.f15795e;
        this.f15798h = i3 - i4;
        int i5 = this.f15796f;
        if (i5 != i4) {
            this.f15796f = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.f15796f);
        } else {
            this.f15796f = 0;
        }
        this.f15795e = 0;
        do {
            Reader reader = this.f15792b;
            int i6 = this.f15796f;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            this.f15796f += read;
            if (this.f15797g == 0 && (i2 = this.f15798h) == 0 && this.f15796f > 0 && cArr[0] == 65279) {
                this.f15795e++;
                this.f15798h = i2 + 1;
                i++;
            }
        } while (this.f15796f < i);
        return true;
    }

    /* renamed from: a */
    private boolean m21571a(String str) {
        while (true) {
            int i = 0;
            if (this.f15795e + str.length() > this.f15796f && !m21570a(str.length())) {
                return false;
            }
            char[] cArr = this.f15794d;
            int i2 = this.f15795e;
            if (cArr[i2] == 10) {
                this.f15797g++;
                this.f15798h = i2 + 1;
            } else {
                while (i < str.length()) {
                    if (this.f15794d[this.f15795e + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f15795e++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f15795e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f15795e--;
        r2 = m21570a(2);
        r7.f15795e++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r2 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        mo15167r();
        r2 = r7.f15795e;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == '*') goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r3 == '/') goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r7.f15795e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r7.f15795e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (m21571a("*/") == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        m21573b("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r1 != '#') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r7.f15795e = r4;
        mo15167r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r7.f15795e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m21572b(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f15794d
        L_0x0002:
            int r1 = r7.f15795e
        L_0x0004:
            int r2 = r7.f15796f
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f15795e = r1
            boolean r1 = r7.m21570a((int) r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.m21579t()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f15795e
            int r2 = r7.f15796f
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f15797g
            int r1 = r1 + r3
            r7.f15797g = r1
            r7.f15798h = r4
            goto L_0x00a6
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a6
            r5 = 13
            if (r1 == r5) goto L_0x00a6
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a6
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0099
            r7.f15795e = r4
            r6 = 2
            if (r4 != r2) goto L_0x006b
            int r2 = r7.f15795e
            int r2 = r2 - r3
            r7.f15795e = r2
            boolean r2 = r7.m21570a((int) r6)
            int r4 = r7.f15795e
            int r4 = r4 + r3
            r7.f15795e = r4
            if (r2 != 0) goto L_0x006b
            return r1
        L_0x006b:
            r7.mo15167r()
            int r2 = r7.f15795e
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0081
            if (r3 == r5) goto L_0x0079
            return r1
        L_0x0079:
            int r2 = r2 + 1
            r7.f15795e = r2
        L_0x007d:
            r7.m21584y()
            goto L_0x0002
        L_0x0081:
            int r2 = r2 + 1
            r7.f15795e = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m21571a((java.lang.String) r1)
            if (r1 == 0) goto L_0x0092
            int r1 = r7.f15795e
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0092:
            java.lang.String r8 = "Unterminated comment"
            r7.m21573b((java.lang.String) r8)
            r8 = 0
            throw r8
        L_0x0099:
            r2 = 35
            if (r1 != r2) goto L_0x00a3
            r7.f15795e = r4
            r7.mo15167r()
            goto L_0x007d
        L_0x00a3:
            r7.f15795e = r4
            return r1
        L_0x00a6:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p158d.C5716b.m21572b(boolean):int");
    }

    /* renamed from: b */
    private IOException m21573b(String str) {
        throw new C5719e(str + m21579t());
    }

    /* renamed from: b */
    private String m21574b(char c) {
        char[] cArr = this.f15794d;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.f15795e;
            int i2 = this.f15796f;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f15795e = i4;
                        sb.append(cArr, i3, (i4 - i3) - 1);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f15795e = i4;
                        sb.append(cArr, i3, (i4 - i3) - 1);
                        sb.append(m21583x());
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f15797g++;
                            this.f15798h = i4;
                        }
                        i = i4;
                    }
                } else {
                    sb.append(cArr, i3, i - i3);
                    this.f15795e = i;
                    if (!m21570a(1)) {
                        m21573b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m21575b(int i) {
        int i2 = this.f15804n;
        int[] iArr = this.f15803m;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f15806p, 0, iArr3, 0, this.f15804n);
            System.arraycopy(this.f15805o, 0, strArr, 0, this.f15804n);
            this.f15803m = iArr2;
            this.f15806p = iArr3;
            this.f15805o = strArr;
        }
        int[] iArr4 = this.f15803m;
        int i3 = this.f15804n;
        this.f15804n = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: c */
    private void m21576c(char c) {
        char[] cArr = this.f15794d;
        while (true) {
            int i = this.f15795e;
            int i2 = this.f15796f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f15795e = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f15795e = i3;
                        m21583x();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f15797g++;
                            this.f15798h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f15795e = i;
                    if (!m21570a(1)) {
                        m21573b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private void mo15167r() {
        if (!this.f15793c) {
            m21573b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: s */
    private void m21578s() {
        m21572b(true);
        this.f15795e--;
        int i = this.f15795e;
        char[] cArr = f15791a;
        if (i + cArr.length <= this.f15796f || m21570a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f15791a;
                if (i2 >= cArr2.length) {
                    this.f15795e += cArr2.length;
                    return;
                } else if (this.f15794d[this.f15795e + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public String m21579t() {
        return " at line " + (this.f15797g + 1) + " column " + ((this.f15795e - this.f15798h) + 1) + " path " + mo15156f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        mo15167r();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m21580u() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = r0
        L_0x0004:
            int r3 = r6.f15795e
            int r4 = r3 + r1
            int r5 = r6.f15796f
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.f15794d
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005d
            r4 = 10
            if (r3 == r4) goto L_0x005d
            r4 = 12
            if (r3 == r4) goto L_0x005d
            r4 = 13
            if (r3 == r4) goto L_0x005d
            r4 = 32
            if (r3 == r4) goto L_0x005d
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005d
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 58
            if (r3 == r4) goto L_0x005d
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005d;
                case 92: goto L_0x004b;
                case 93: goto L_0x005d;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.mo15167r()
            goto L_0x005d
        L_0x004f:
            char[] r3 = r6.f15794d
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005f
            int r3 = r1 + 1
            boolean r3 = r6.m21570a((int) r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0004
        L_0x005d:
            r0 = r1
            goto L_0x0079
        L_0x005f:
            if (r2 != 0) goto L_0x0066
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0066:
            char[] r3 = r6.f15794d
            int r4 = r6.f15795e
            r2.append(r3, r4, r1)
            int r3 = r6.f15795e
            int r3 = r3 + r1
            r6.f15795e = r3
            r1 = 1
            boolean r1 = r6.m21570a((int) r1)
            if (r1 != 0) goto L_0x0003
        L_0x0079:
            if (r2 != 0) goto L_0x0085
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f15794d
            int r3 = r6.f15795e
            r1.<init>(r2, r3, r0)
            goto L_0x0090
        L_0x0085:
            char[] r1 = r6.f15794d
            int r3 = r6.f15795e
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0090:
            int r2 = r6.f15795e
            int r2 = r2 + r0
            r6.f15795e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p158d.C5716b.m21580u():java.lang.String");
    }

    /* renamed from: v */
    private int m21581v() {
        String str;
        String str2;
        int i;
        char c = this.f15794d[this.f15795e];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f15795e + i2 >= this.f15796f && !m21570a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f15794d[this.f15795e + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f15795e + length < this.f15796f || m21570a(length + 1)) && m21569a(this.f15794d[this.f15795e + length])) {
            return 0;
        }
        this.f15795e += length;
        this.f15799i = i;
        return i;
    }

    /* renamed from: w */
    private int m21582w() {
        int i;
        char c;
        char[] cArr = this.f15794d;
        int i2 = this.f15795e;
        int i3 = 0;
        int i4 = this.f15796f;
        boolean z = true;
        int i5 = 0;
        char c2 = 0;
        boolean z2 = false;
        long j = 0;
        while (true) {
            if (i2 + i5 == i4) {
                if (i5 == cArr.length) {
                    return i3;
                }
                if (!m21570a(i5 + 1)) {
                    break;
                }
                i2 = this.f15795e;
                i4 = this.f15796f;
            }
            c = cArr[i2 + i5];
            char c3 = 3;
            if (c == '+') {
                c3 = 6;
                i3 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else if (c == '-') {
                c3 = 6;
                i3 = 0;
                if (c2 == 0) {
                    c2 = 1;
                    z2 = true;
                    i5++;
                } else if (c2 != 5) {
                    return 0;
                }
            } else if (c == '.') {
                i3 = 0;
                if (c2 != 2) {
                    return 0;
                }
            } else if (c >= '0' && c <= '9') {
                if (c2 == 1 || c2 == 0) {
                    j = (long) (-(c - '0'));
                    c2 = 2;
                } else if (c2 != 2) {
                    if (c2 == 3) {
                        i3 = 0;
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        i3 = 0;
                        c2 = 7;
                    }
                    i5++;
                } else if (j == 0) {
                    return 0;
                } else {
                    long j2 = (10 * j) - ((long) (c - '0'));
                    int i6 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                    boolean z3 = i6 > 0 || (i6 == 0 && j2 < j);
                    j = j2;
                    z = z3 & z;
                }
                i3 = 0;
                i5++;
            }
            c2 = c3;
            i5++;
        }
        if (m21569a(c)) {
            return 0;
        }
        if (c2 == 2 && z && (j != Long.MIN_VALUE || z2)) {
            if (!z2) {
                j = -j;
            }
            this.f15800j = j;
            this.f15795e += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f15801k = i5;
            i = 16;
        }
        this.f15799i = i;
        return i;
    }

    /* renamed from: x */
    private char m21583x() {
        int i;
        int i2;
        if (this.f15795e != this.f15796f || m21570a(1)) {
            char[] cArr = this.f15794d;
            int i3 = this.f15795e;
            this.f15795e = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f15797g++;
                this.f15798h = this.f15795e;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return TokenParser.f19312CR;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m21573b("Invalid escape sequence");
                    throw null;
                } else if (this.f15795e + 4 <= this.f15796f || m21570a(4)) {
                    char c2 = 0;
                    int i4 = this.f15795e;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f15794d[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f15794d, this.f15795e, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f15795e += 4;
                    return c2;
                } else {
                    m21573b("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        m21573b("Unterminated escape sequence");
        throw null;
    }

    /* renamed from: y */
    private void m21584y() {
        char c;
        do {
            if (this.f15795e < this.f15796f || m21570a(1)) {
                char[] cArr = this.f15794d;
                int i = this.f15795e;
                this.f15795e = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f15797g++;
                    this.f15798h = this.f15795e;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo15167r();
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21585z() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f15795e
            int r2 = r1 + r0
            int r3 = r4.f15796f
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f15794d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo15167r()
        L_0x004b:
            int r1 = r4.f15795e
            int r1 = r1 + r0
            r4.f15795e = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f15795e = r1
            r0 = 1
            boolean r0 = r4.m21570a((int) r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p158d.C5716b.m21585z():void");
    }

    /* renamed from: a */
    public void mo15151a() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 3) {
            m21575b(1);
            this.f15806p[this.f15804n - 1] = 0;
            this.f15799i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo15165p() + m21579t());
    }

    /* renamed from: a */
    public final void mo15272a(boolean z) {
        this.f15793c = z;
    }

    /* renamed from: b */
    public void mo15152b() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 1) {
            m21575b(3);
            this.f15799i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo15165p() + m21579t());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo15273c() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f15803m
            int r2 = r0.f15804n
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 8
            r5 = 39
            r6 = 34
            r7 = 93
            r8 = 3
            r9 = 7
            r10 = 59
            r11 = 44
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 != r15) goto L_0x0023
            int r2 = r2 - r15
            r1[r2] = r13
            goto L_0x00a3
        L_0x0023:
            if (r3 != r13) goto L_0x003c
            int r1 = r0.m21572b((boolean) r15)
            if (r1 == r11) goto L_0x00a3
            if (r1 == r10) goto L_0x0038
            if (r1 != r7) goto L_0x0032
            r0.f15799i = r12
            return r12
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.m21573b((java.lang.String) r1)
            throw r14
        L_0x0038:
            r16.mo15167r()
            goto L_0x00a3
        L_0x003c:
            r13 = 5
            if (r3 == r8) goto L_0x0117
            if (r3 != r13) goto L_0x0043
            goto L_0x0117
        L_0x0043:
            if (r3 != r12) goto L_0x0077
            int r2 = r2 - r15
            r1[r2] = r13
            int r1 = r0.m21572b((boolean) r15)
            r2 = 58
            if (r1 == r2) goto L_0x00a3
            r2 = 61
            if (r1 != r2) goto L_0x0071
            r16.mo15167r()
            int r1 = r0.f15795e
            int r2 = r0.f15796f
            if (r1 < r2) goto L_0x0063
            boolean r1 = r0.m21570a((int) r15)
            if (r1 == 0) goto L_0x00a3
        L_0x0063:
            char[] r1 = r0.f15794d
            int r2 = r0.f15795e
            char r1 = r1[r2]
            r13 = 62
            if (r1 != r13) goto L_0x00a3
            int r2 = r2 + r15
            r0.f15795e = r2
            goto L_0x00a3
        L_0x0071:
            java.lang.String r1 = "Expected ':'"
            r0.m21573b((java.lang.String) r1)
            throw r14
        L_0x0077:
            r1 = 6
            if (r3 != r1) goto L_0x0089
            boolean r1 = r0.f15793c
            if (r1 == 0) goto L_0x0081
            r16.m21578s()
        L_0x0081:
            int[] r1 = r0.f15803m
            int r2 = r0.f15804n
            int r2 = r2 - r15
            r1[r2] = r9
            goto L_0x00a3
        L_0x0089:
            if (r3 != r9) goto L_0x00a1
            r1 = 0
            int r1 = r0.m21572b((boolean) r1)
            r2 = -1
            if (r1 != r2) goto L_0x0098
            r1 = 17
        L_0x0095:
            r0.f15799i = r1
            return r1
        L_0x0098:
            r16.mo15167r()
            int r1 = r0.f15795e
            int r1 = r1 - r15
            r0.f15795e = r1
            goto L_0x00a3
        L_0x00a1:
            if (r3 == r4) goto L_0x010f
        L_0x00a3:
            int r1 = r0.m21572b((boolean) r15)
            if (r1 == r6) goto L_0x010c
            if (r1 == r5) goto L_0x0106
            if (r1 == r11) goto L_0x00ef
            if (r1 == r10) goto L_0x00ef
            r2 = 91
            if (r1 == r2) goto L_0x00ec
            if (r1 == r7) goto L_0x00e7
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00e4
            int r1 = r0.f15795e
            int r1 = r1 - r15
            r0.f15795e = r1
            int r1 = r16.m21581v()
            if (r1 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            int r1 = r16.m21582w()
            if (r1 == 0) goto L_0x00cc
            return r1
        L_0x00cc:
            char[] r1 = r0.f15794d
            int r2 = r0.f15795e
            char r1 = r1[r2]
            boolean r1 = r0.m21569a((char) r1)
            if (r1 == 0) goto L_0x00de
            r16.mo15167r()
            r1 = 10
            goto L_0x0095
        L_0x00de:
            java.lang.String r1 = "Expected value"
            r0.m21573b((java.lang.String) r1)
            throw r14
        L_0x00e4:
            r0.f15799i = r15
            return r15
        L_0x00e7:
            if (r3 != r15) goto L_0x00ef
            r0.f15799i = r12
            return r12
        L_0x00ec:
            r0.f15799i = r8
            return r8
        L_0x00ef:
            if (r3 == r15) goto L_0x00fb
            r1 = 2
            if (r3 != r1) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = "Unexpected value"
            r0.m21573b((java.lang.String) r1)
            throw r14
        L_0x00fb:
            r16.mo15167r()
            int r1 = r0.f15795e
            int r1 = r1 - r15
            r0.f15795e = r1
            r0.f15799i = r9
            return r9
        L_0x0106:
            r16.mo15167r()
            r0.f15799i = r4
            return r4
        L_0x010c:
            r1 = 9
            goto L_0x0095
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0117:
            int[] r1 = r0.f15803m
            int r2 = r0.f15804n
            int r2 = r2 - r15
            r1[r2] = r12
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L_0x0138
            int r2 = r0.m21572b((boolean) r15)
            if (r2 == r11) goto L_0x0138
            if (r2 == r10) goto L_0x0135
            if (r2 != r1) goto L_0x012f
        L_0x012c:
            r1 = 2
            goto L_0x0095
        L_0x012f:
            java.lang.String r1 = "Unterminated object"
            r0.m21573b((java.lang.String) r1)
            throw r14
        L_0x0135:
            r16.mo15167r()
        L_0x0138:
            int r2 = r0.m21572b((boolean) r15)
            if (r2 == r6) goto L_0x0169
            if (r2 == r5) goto L_0x0162
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x015b
            r16.mo15167r()
            int r1 = r0.f15795e
            int r1 = r1 - r15
            r0.f15795e = r1
            char r1 = (char) r2
            boolean r1 = r0.m21569a((char) r1)
            if (r1 == 0) goto L_0x0157
            r1 = 14
            goto L_0x0095
        L_0x0157:
            r0.m21573b((java.lang.String) r4)
            throw r14
        L_0x015b:
            if (r3 == r13) goto L_0x015e
            goto L_0x012c
        L_0x015e:
            r0.m21573b((java.lang.String) r4)
            throw r14
        L_0x0162:
            r16.mo15167r()
            r1 = 12
            goto L_0x0095
        L_0x0169:
            r1 = 13
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p158d.C5716b.mo15273c():int");
    }

    public void close() {
        this.f15799i = 0;
        this.f15803m[0] = 8;
        this.f15804n = 1;
        this.f15792b.close();
    }

    /* renamed from: d */
    public void mo15154d() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 4) {
            this.f15804n--;
            int[] iArr = this.f15806p;
            int i2 = this.f15804n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f15799i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo15165p() + m21579t());
    }

    /* renamed from: e */
    public void mo15155e() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 2) {
            this.f15804n--;
            String[] strArr = this.f15805o;
            int i2 = this.f15804n;
            strArr[i2] = null;
            int[] iArr = this.f15806p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15799i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo15165p() + m21579t());
    }

    /* renamed from: f */
    public String mo15156f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f15804n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f15803m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f15806p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f15805o;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo15157g() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: h */
    public final boolean mo15274h() {
        return this.f15793c;
    }

    /* renamed from: i */
    public boolean mo15158i() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 5) {
            this.f15799i = 0;
            int[] iArr = this.f15806p;
            int i2 = this.f15804n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f15799i = 0;
            int[] iArr2 = this.f15806p;
            int i3 = this.f15804n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo15165p() + m21579t());
        }
    }

    /* renamed from: j */
    public double mo15159j() {
        String str;
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 15) {
            this.f15799i = 0;
            int[] iArr = this.f15806p;
            int i2 = this.f15804n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f15800j;
        }
        if (i == 16) {
            this.f15802l = new String(this.f15794d, this.f15795e, this.f15801k);
            this.f15795e += this.f15801k;
        } else {
            if (i == 8 || i == 9) {
                str = m21574b(i == 8 ? '\'' : TokenParser.DQUOTE);
            } else if (i == 10) {
                str = m21580u();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo15165p() + m21579t());
            }
            this.f15802l = str;
        }
        this.f15799i = 11;
        double parseDouble = Double.parseDouble(this.f15802l);
        if (this.f15793c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f15802l = null;
            this.f15799i = 0;
            int[] iArr2 = this.f15806p;
            int i3 = this.f15804n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C5719e("JSON forbids NaN and infinities: " + parseDouble + m21579t());
    }

    /* renamed from: k */
    public int mo15160k() {
        String b;
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 15) {
            long j = this.f15800j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f15799i = 0;
                int[] iArr = this.f15806p;
                int i3 = this.f15804n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f15800j + m21579t());
        }
        if (i == 16) {
            this.f15802l = new String(this.f15794d, this.f15795e, this.f15801k);
            this.f15795e += this.f15801k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m21580u();
            } else {
                b = m21574b(i == 8 ? '\'' : TokenParser.DQUOTE);
            }
            this.f15802l = b;
            try {
                int parseInt = Integer.parseInt(this.f15802l);
                this.f15799i = 0;
                int[] iArr2 = this.f15806p;
                int i4 = this.f15804n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo15165p() + m21579t());
        }
        this.f15799i = 11;
        double parseDouble = Double.parseDouble(this.f15802l);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f15802l = null;
            this.f15799i = 0;
            int[] iArr3 = this.f15806p;
            int i6 = this.f15804n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f15802l + m21579t());
    }

    /* renamed from: l */
    public long mo15161l() {
        String b;
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 15) {
            this.f15799i = 0;
            int[] iArr = this.f15806p;
            int i2 = this.f15804n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f15800j;
        }
        if (i == 16) {
            this.f15802l = new String(this.f15794d, this.f15795e, this.f15801k);
            this.f15795e += this.f15801k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m21580u();
            } else {
                b = m21574b(i == 8 ? '\'' : TokenParser.DQUOTE);
            }
            this.f15802l = b;
            try {
                long parseLong = Long.parseLong(this.f15802l);
                this.f15799i = 0;
                int[] iArr2 = this.f15806p;
                int i3 = this.f15804n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo15165p() + m21579t());
        }
        this.f15799i = 11;
        double parseDouble = Double.parseDouble(this.f15802l);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f15802l = null;
            this.f15799i = 0;
            int[] iArr3 = this.f15806p;
            int i4 = this.f15804n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f15802l + m21579t());
    }

    /* renamed from: m */
    public String mo15162m() {
        String str;
        char c;
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 14) {
            str = m21580u();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = TokenParser.DQUOTE;
            } else {
                throw new IllegalStateException("Expected a name but was " + mo15165p() + m21579t());
            }
            str = m21574b(c);
        }
        this.f15799i = 0;
        this.f15805o[this.f15804n - 1] = str;
        return str;
    }

    /* renamed from: n */
    public void mo15163n() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 7) {
            this.f15799i = 0;
            int[] iArr = this.f15806p;
            int i2 = this.f15804n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo15165p() + m21579t());
    }

    /* renamed from: o */
    public String mo15164o() {
        String str;
        char c;
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        if (i == 10) {
            str = m21580u();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = TokenParser.DQUOTE;
            } else if (i == 11) {
                str = this.f15802l;
                this.f15802l = null;
            } else if (i == 15) {
                str = Long.toString(this.f15800j);
            } else if (i == 16) {
                str = new String(this.f15794d, this.f15795e, this.f15801k);
                this.f15795e += this.f15801k;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo15165p() + m21579t());
            }
            str = m21574b(c);
        }
        this.f15799i = 0;
        int[] iArr = this.f15806p;
        int i2 = this.f15804n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: p */
    public C5717c mo15165p() {
        int i = this.f15799i;
        if (i == 0) {
            i = mo15273c();
        }
        switch (i) {
            case 1:
                return C5717c.BEGIN_OBJECT;
            case 2:
                return C5717c.END_OBJECT;
            case 3:
                return C5717c.BEGIN_ARRAY;
            case 4:
                return C5717c.END_ARRAY;
            case 5:
            case 6:
                return C5717c.BOOLEAN;
            case 7:
                return C5717c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C5717c.STRING;
            case 12:
            case 13:
            case 14:
                return C5717c.NAME;
            case 15:
            case 16:
                return C5717c.NUMBER;
            case 17:
                return C5717c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public void mo15166q() {
        char c;
        int i = 0;
        do {
            int i2 = this.f15799i;
            if (i2 == 0) {
                i2 = mo15273c();
            }
            if (i2 == 3) {
                m21575b(1);
            } else if (i2 == 1) {
                m21575b(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f15804n--;
                i--;
                this.f15799i = 0;
            } else if (i2 == 14 || i2 == 10) {
                m21585z();
                this.f15799i = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = TokenParser.DQUOTE;
                } else {
                    if (i2 == 16) {
                        this.f15795e += this.f15801k;
                    }
                    this.f15799i = 0;
                }
                m21576c(c);
                this.f15799i = 0;
            }
            i++;
            this.f15799i = 0;
        } while (i != 0);
        int[] iArr = this.f15806p;
        int i3 = this.f15804n;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f15805o[i3 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + m21579t();
    }
}
