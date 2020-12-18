package p101d.p129g.p152e;

import java.io.IOException;
import java.io.StringWriter;
import p101d.p129g.p152e.p154b.C5603B;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.u */
public abstract class C5737u {
    /* renamed from: a */
    public C5734r mo15310a() {
        if (mo15313e()) {
            return (C5734r) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    /* renamed from: b */
    public C5740x mo15311b() {
        if (mo15315g()) {
            return (C5740x) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public C5585A mo15312c() {
        if (mo15316h()) {
            return (C5585A) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    /* renamed from: d */
    public String mo15083d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public boolean mo15313e() {
        return this instanceof C5734r;
    }

    /* renamed from: f */
    public boolean mo15314f() {
        return this instanceof C5739w;
    }

    /* renamed from: g */
    public boolean mo15315g() {
        return this instanceof C5740x;
    }

    /* renamed from: h */
    public boolean mo15316h() {
        return this instanceof C5585A;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C5718d dVar = new C5718d(stringWriter);
            dVar.mo15277b(true);
            C5603B.m21256a(this, dVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
