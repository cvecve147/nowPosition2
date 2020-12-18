package p101d.p129g.p152e.p154b.p155a;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.C5585A;
import p101d.p129g.p152e.C5734r;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.C5739w;
import p101d.p129g.p152e.C5740x;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.j */
public final class C5657j extends C5718d {

    /* renamed from: l */
    private static final Writer f15619l = new C5655i();

    /* renamed from: m */
    private static final C5585A f15620m = new C5585A("closed");

    /* renamed from: n */
    private final List<C5737u> f15621n = new ArrayList();

    /* renamed from: o */
    private String f15622o;

    /* renamed from: p */
    private C5737u f15623p = C5739w.f15854a;

    public C5657j() {
        super(f15619l);
    }

    /* renamed from: a */
    private void m21420a(C5737u uVar) {
        if (this.f15622o != null) {
            if (!uVar.mo15314f() || mo15279e()) {
                ((C5740x) m21421j()).mo15321a(this.f15622o, uVar);
            }
            this.f15622o = null;
        } else if (this.f15621n.isEmpty()) {
            this.f15623p = uVar;
        } else {
            C5737u j = m21421j();
            if (j instanceof C5734r) {
                ((C5734r) j).mo15305a(uVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private C5737u m21421j() {
        List<C5737u> list = this.f15621n;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public C5718d mo15174a() {
        C5734r rVar = new C5734r();
        m21420a((C5737u) rVar);
        this.f15621n.add(rVar);
        return this;
    }

    /* renamed from: a */
    public C5718d mo15175a(long j) {
        m21420a((C5737u) new C5585A((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C5718d mo15176a(Boolean bool) {
        if (bool == null) {
            mo15186h();
            return this;
        }
        m21420a((C5737u) new C5585A(bool));
        return this;
    }

    /* renamed from: a */
    public C5718d mo15177a(Number number) {
        if (number == null) {
            mo15186h();
            return this;
        }
        if (!mo15281g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m21420a((C5737u) new C5585A(number));
        return this;
    }

    /* renamed from: a */
    public C5718d mo15178a(String str) {
        if (this.f15621n.isEmpty() || this.f15622o != null) {
            throw new IllegalStateException();
        } else if (m21421j() instanceof C5740x) {
            this.f15622o = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public C5718d mo15179b() {
        C5740x xVar = new C5740x();
        m21420a((C5737u) xVar);
        this.f15621n.add(xVar);
        return this;
    }

    /* renamed from: c */
    public C5718d mo15180c() {
        if (this.f15621n.isEmpty() || this.f15622o != null) {
            throw new IllegalStateException();
        } else if (m21421j() instanceof C5734r) {
            List<C5737u> list = this.f15621n;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public C5718d mo15181c(String str) {
        if (str == null) {
            mo15186h();
            return this;
        }
        m21420a((C5737u) new C5585A(str));
        return this;
    }

    public void close() {
        if (this.f15621n.isEmpty()) {
            this.f15621n.add(f15620m);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C5718d mo15183d() {
        if (this.f15621n.isEmpty() || this.f15622o != null) {
            throw new IllegalStateException();
        } else if (m21421j() instanceof C5740x) {
            List<C5737u> list = this.f15621n;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public C5718d mo15184d(boolean z) {
        m21420a((C5737u) new C5585A(Boolean.valueOf(z)));
        return this;
    }

    public void flush() {
    }

    /* renamed from: h */
    public C5718d mo15186h() {
        m21420a((C5737u) C5739w.f15854a);
        return this;
    }

    /* renamed from: i */
    public C5737u mo15187i() {
        if (this.f15621n.isEmpty()) {
            return this.f15623p;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f15621n);
    }
}
