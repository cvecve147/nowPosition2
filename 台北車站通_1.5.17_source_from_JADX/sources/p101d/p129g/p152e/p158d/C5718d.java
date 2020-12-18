package p101d.p129g.p152e.p158d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: d.g.e.d.d */
public class C5718d implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f15818a = new String[128];

    /* renamed from: b */
    private static final String[] f15819b;

    /* renamed from: c */
    private final Writer f15820c;

    /* renamed from: d */
    private int[] f15821d = new int[32];

    /* renamed from: e */
    private int f15822e = 0;

    /* renamed from: f */
    private String f15823f;

    /* renamed from: g */
    private String f15824g;

    /* renamed from: h */
    private boolean f15825h;

    /* renamed from: i */
    private boolean f15826i;

    /* renamed from: j */
    private String f15827j;

    /* renamed from: k */
    private boolean f15828k;

    static {
        for (int i = 0; i <= 31; i++) {
            f15818a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f15818a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f15819b = (String[]) strArr.clone();
        String[] strArr2 = f15819b;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C5718d(Writer writer) {
        m21606a(6);
        this.f15824g = ":";
        this.f15828k = true;
        if (writer != null) {
            this.f15820c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    private C5718d m21604a(int i, int i2, String str) {
        int l = m21612l();
        if (l != i2 && l != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f15827j == null) {
            this.f15822e--;
            if (l == i2) {
                m21611k();
            }
            this.f15820c.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f15827j);
        }
    }

    /* renamed from: a */
    private C5718d m21605a(int i, String str) {
        m21610j();
        m21606a(i);
        this.f15820c.write(str);
        return this;
    }

    /* renamed from: a */
    private void m21606a(int i) {
        int i2 = this.f15822e;
        int[] iArr = this.f15821d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f15821d = iArr2;
        }
        int[] iArr3 = this.f15821d;
        int i3 = this.f15822e;
        this.f15822e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    private void m21607b(int i) {
        this.f15821d[this.f15822e - 1] = i;
    }

    /* renamed from: d */
    private void m21608d(String str) {
        String str2;
        String[] strArr = this.f15826i ? f15819b : f15818a;
        this.f15820c.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f15820c.write(str, i, i2 - i);
            }
            this.f15820c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f15820c.write(str, i, length - i);
        }
        this.f15820c.write("\"");
    }

    /* renamed from: i */
    private void mo15187i() {
        int l = m21612l();
        if (l == 5) {
            this.f15820c.write(44);
        } else if (l != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m21611k();
        m21607b(4);
    }

    /* renamed from: j */
    private void m21610j() {
        int l = m21612l();
        if (l == 1) {
            m21607b(2);
        } else if (l == 2) {
            this.f15820c.append(',');
        } else if (l != 4) {
            if (l != 6) {
                if (l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f15825h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m21607b(7);
            return;
        } else {
            this.f15820c.append(this.f15824g);
            m21607b(5);
            return;
        }
        m21611k();
    }

    /* renamed from: k */
    private void m21611k() {
        if (this.f15823f != null) {
            this.f15820c.write("\n");
            int i = this.f15822e;
            for (int i2 = 1; i2 < i; i2++) {
                this.f15820c.write(this.f15823f);
            }
        }
    }

    /* renamed from: l */
    private int m21612l() {
        int i = this.f15822e;
        if (i != 0) {
            return this.f15821d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    private void m21613m() {
        if (this.f15827j != null) {
            mo15187i();
            m21608d(this.f15827j);
            this.f15827j = null;
        }
    }

    /* renamed from: a */
    public C5718d mo15174a() {
        m21613m();
        m21605a(1, "[");
        return this;
    }

    /* renamed from: a */
    public C5718d mo15175a(long j) {
        m21613m();
        m21610j();
        this.f15820c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C5718d mo15176a(Boolean bool) {
        if (bool == null) {
            return mo15186h();
        }
        m21613m();
        m21610j();
        this.f15820c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C5718d mo15177a(Number number) {
        if (number == null) {
            return mo15186h();
        }
        m21613m();
        String obj = number.toString();
        if (this.f15825h || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m21610j();
            this.f15820c.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: a */
    public C5718d mo15178a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f15827j != null) {
            throw new IllegalStateException();
        } else if (this.f15822e != 0) {
            this.f15827j = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public final void mo15275a(boolean z) {
        this.f15826i = z;
    }

    /* renamed from: b */
    public C5718d mo15179b() {
        m21613m();
        m21605a(3, "{");
        return this;
    }

    /* renamed from: b */
    public final void mo15276b(String str) {
        String str2;
        if (str.length() == 0) {
            this.f15823f = null;
            str2 = ":";
        } else {
            this.f15823f = str;
            str2 = ": ";
        }
        this.f15824g = str2;
    }

    /* renamed from: b */
    public final void mo15277b(boolean z) {
        this.f15825h = z;
    }

    /* renamed from: c */
    public C5718d mo15180c() {
        m21604a(1, 2, "]");
        return this;
    }

    /* renamed from: c */
    public C5718d mo15181c(String str) {
        if (str == null) {
            return mo15186h();
        }
        m21613m();
        m21610j();
        m21608d(str);
        return this;
    }

    /* renamed from: c */
    public final void mo15278c(boolean z) {
        this.f15828k = z;
    }

    public void close() {
        this.f15820c.close();
        int i = this.f15822e;
        if (i > 1 || (i == 1 && this.f15821d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15822e = 0;
    }

    /* renamed from: d */
    public C5718d mo15183d() {
        m21604a(3, 5, "}");
        return this;
    }

    /* renamed from: d */
    public C5718d mo15184d(boolean z) {
        m21613m();
        m21610j();
        this.f15820c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: e */
    public final boolean mo15279e() {
        return this.f15828k;
    }

    /* renamed from: f */
    public final boolean mo15280f() {
        return this.f15826i;
    }

    public void flush() {
        if (this.f15822e != 0) {
            this.f15820c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo15281g() {
        return this.f15825h;
    }

    /* renamed from: h */
    public C5718d mo15186h() {
        if (this.f15827j != null) {
            if (this.f15828k) {
                m21613m();
            } else {
                this.f15827j = null;
                return this;
            }
        }
        m21610j();
        this.f15820c.write("null");
        return this;
    }
}
