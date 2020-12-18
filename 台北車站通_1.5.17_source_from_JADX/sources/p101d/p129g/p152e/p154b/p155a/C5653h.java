package p101d.p129g.p152e.p154b.p155a;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import p101d.p129g.p152e.C5585A;
import p101d.p129g.p152e.C5734r;
import p101d.p129g.p152e.C5739w;
import p101d.p129g.p152e.C5740x;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;

/* renamed from: d.g.e.b.a.h */
public final class C5653h extends C5716b {

    /* renamed from: q */
    private static final Reader f15613q = new C5651g();

    /* renamed from: r */
    private static final Object f15614r = new Object();

    /* renamed from: s */
    private Object[] f15615s;

    /* renamed from: t */
    private int f15616t;

    /* renamed from: u */
    private String[] f15617u;

    /* renamed from: v */
    private int[] f15618v;

    /* renamed from: a */
    private void m21391a(C5717c cVar) {
        if (mo15165p() != cVar) {
            throw new IllegalStateException("Expected " + cVar + " but was " + mo15165p() + m21393s());
        }
    }

    /* renamed from: a */
    private void m21392a(Object obj) {
        int i = this.f15616t;
        Object[] objArr = this.f15615s;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f15618v, 0, iArr, 0, this.f15616t);
            System.arraycopy(this.f15617u, 0, strArr, 0, this.f15616t);
            this.f15615s = objArr2;
            this.f15618v = iArr;
            this.f15617u = strArr;
        }
        Object[] objArr3 = this.f15615s;
        int i2 = this.f15616t;
        this.f15616t = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: s */
    private String m21393s() {
        return " at path " + mo15156f();
    }

    /* renamed from: t */
    private Object m21394t() {
        return this.f15615s[this.f15616t - 1];
    }

    /* renamed from: u */
    private Object m21395u() {
        Object[] objArr = this.f15615s;
        int i = this.f15616t - 1;
        this.f15616t = i;
        Object obj = objArr[i];
        objArr[this.f15616t] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo15151a() {
        m21391a(C5717c.BEGIN_ARRAY);
        m21392a((Object) ((C5734r) m21394t()).iterator());
        this.f15618v[this.f15616t - 1] = 0;
    }

    /* renamed from: b */
    public void mo15152b() {
        m21391a(C5717c.BEGIN_OBJECT);
        m21392a((Object) ((C5740x) m21394t()).mo15324i().iterator());
    }

    public void close() {
        this.f15615s = new Object[]{f15614r};
        this.f15616t = 1;
    }

    /* renamed from: d */
    public void mo15154d() {
        m21391a(C5717c.END_ARRAY);
        m21395u();
        m21395u();
        int i = this.f15616t;
        if (i > 0) {
            int[] iArr = this.f15618v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo15155e() {
        m21391a(C5717c.END_OBJECT);
        m21395u();
        m21395u();
        int i = this.f15616t;
        if (i > 0) {
            int[] iArr = this.f15618v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public String mo15156f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f15616t) {
            Object[] objArr = this.f15615s;
            if (objArr[i] instanceof C5734r) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f15618v[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C5740x) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f15617u;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo15157g() {
        C5717c p = mo15165p();
        return (p == C5717c.END_OBJECT || p == C5717c.END_ARRAY) ? false : true;
    }

    /* renamed from: i */
    public boolean mo15158i() {
        m21391a(C5717c.BOOLEAN);
        boolean i = ((C5585A) m21395u()).mo15086i();
        int i2 = this.f15616t;
        if (i2 > 0) {
            int[] iArr = this.f15618v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return i;
    }

    /* renamed from: j */
    public double mo15159j() {
        C5717c p = mo15165p();
        if (p == C5717c.NUMBER || p == C5717c.STRING) {
            double o = ((C5585A) m21394t()).mo15088o();
            if (mo15274h() || (!Double.isNaN(o) && !Double.isInfinite(o))) {
                m21395u();
                int i = this.f15616t;
                if (i > 0) {
                    int[] iArr = this.f15618v;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return o;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + o);
        }
        throw new IllegalStateException("Expected " + C5717c.NUMBER + " but was " + p + m21393s());
    }

    /* renamed from: k */
    public int mo15160k() {
        C5717c p = mo15165p();
        if (p == C5717c.NUMBER || p == C5717c.STRING) {
            int p2 = ((C5585A) m21394t()).mo15089p();
            m21395u();
            int i = this.f15616t;
            if (i > 0) {
                int[] iArr = this.f15618v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return p2;
        }
        throw new IllegalStateException("Expected " + C5717c.NUMBER + " but was " + p + m21393s());
    }

    /* renamed from: l */
    public long mo15161l() {
        C5717c p = mo15165p();
        if (p == C5717c.NUMBER || p == C5717c.STRING) {
            long q = ((C5585A) m21394t()).mo15090q();
            m21395u();
            int i = this.f15616t;
            if (i > 0) {
                int[] iArr = this.f15618v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return q;
        }
        throw new IllegalStateException("Expected " + C5717c.NUMBER + " but was " + p + m21393s());
    }

    /* renamed from: m */
    public String mo15162m() {
        m21391a(C5717c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m21394t()).next();
        String str = (String) entry.getKey();
        this.f15617u[this.f15616t - 1] = str;
        m21392a(entry.getValue());
        return str;
    }

    /* renamed from: n */
    public void mo15163n() {
        m21391a(C5717c.NULL);
        m21395u();
        int i = this.f15616t;
        if (i > 0) {
            int[] iArr = this.f15618v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: o */
    public String mo15164o() {
        C5717c p = mo15165p();
        if (p == C5717c.STRING || p == C5717c.NUMBER) {
            String d = ((C5585A) m21395u()).mo15083d();
            int i = this.f15616t;
            if (i > 0) {
                int[] iArr = this.f15618v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return d;
        }
        throw new IllegalStateException("Expected " + C5717c.STRING + " but was " + p + m21393s());
    }

    /* renamed from: p */
    public C5717c mo15165p() {
        if (this.f15616t == 0) {
            return C5717c.END_DOCUMENT;
        }
        Object t = m21394t();
        if (t instanceof Iterator) {
            boolean z = this.f15615s[this.f15616t - 2] instanceof C5740x;
            Iterator it = (Iterator) t;
            if (!it.hasNext()) {
                return z ? C5717c.END_OBJECT : C5717c.END_ARRAY;
            }
            if (z) {
                return C5717c.NAME;
            }
            m21392a(it.next());
            return mo15165p();
        } else if (t instanceof C5740x) {
            return C5717c.BEGIN_OBJECT;
        } else {
            if (t instanceof C5734r) {
                return C5717c.BEGIN_ARRAY;
            }
            if (t instanceof C5585A) {
                C5585A a = (C5585A) t;
                if (a.mo15094u()) {
                    return C5717c.STRING;
                }
                if (a.mo15092s()) {
                    return C5717c.BOOLEAN;
                }
                if (a.mo15093t()) {
                    return C5717c.NUMBER;
                }
                throw new AssertionError();
            } else if (t instanceof C5739w) {
                return C5717c.NULL;
            } else {
                if (t == f15614r) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: q */
    public void mo15166q() {
        if (mo15165p() == C5717c.NAME) {
            mo15162m();
            this.f15617u[this.f15616t - 2] = "null";
        } else {
            m21395u();
            this.f15617u[this.f15616t - 1] = "null";
        }
        int[] iArr = this.f15618v;
        int i = this.f15616t - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: r */
    public void mo15167r() {
        m21391a(C5717c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m21394t()).next();
        m21392a(entry.getValue());
        m21392a((Object) new C5585A((String) entry.getKey()));
    }

    public String toString() {
        return C5653h.class.getSimpleName();
    }
}
