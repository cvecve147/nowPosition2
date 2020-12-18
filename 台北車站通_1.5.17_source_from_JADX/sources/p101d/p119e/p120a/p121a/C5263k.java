package p101d.p119e.p120a.p121a;

import java.io.UnsupportedEncodingException;
import p101d.p119e.p120a.C5284q;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5296y;

/* renamed from: d.e.a.a.k */
public abstract class C5263k<T> extends C5284q<T> {

    /* renamed from: q */
    private static final String f14893q = String.format("application/json; charset=%s", new Object[]{"utf-8"});

    /* renamed from: r */
    private C5288s.C5290b<T> f14894r;

    /* renamed from: s */
    private final String f14895s;

    public C5263k(int i, String str, String str2, C5288s.C5290b<T> bVar, C5288s.C5289a aVar) {
        super(i, str, aVar);
        this.f14894r = bVar;
        this.f14895s = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo14591B() {
        super.mo14591B();
        this.f14894r = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14592a(T t) {
        C5288s.C5290b<T> bVar = this.f14894r;
        if (bVar != null) {
            bVar.mo14126a(t);
        }
    }

    /* renamed from: a */
    public byte[] mo14593a() {
        try {
            if (this.f14895s == null) {
                return null;
            }
            return this.f14895s.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            C5296y.m20473d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f14895s, "utf-8");
            return null;
        }
    }

    /* renamed from: b */
    public String mo14594b() {
        return f14893q;
    }

    /* renamed from: q */
    public byte[] mo14595q() {
        return mo14593a();
    }

    /* renamed from: r */
    public String mo14596r() {
        return mo14594b();
    }
}
