package p101d.p129g.p159f.p167c;

import java.util.List;

/* renamed from: d.g.f.c.e */
public final class C5782e {

    /* renamed from: a */
    private final byte[] f16004a;

    /* renamed from: b */
    private final String f16005b;

    /* renamed from: c */
    private final List<byte[]> f16006c;

    /* renamed from: d */
    private final String f16007d;

    /* renamed from: e */
    private Integer f16008e;

    /* renamed from: f */
    private Integer f16009f;

    /* renamed from: g */
    private Object f16010g;

    /* renamed from: h */
    private final int f16011h;

    /* renamed from: i */
    private final int f16012i;

    public C5782e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C5782e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f16004a = bArr;
        this.f16005b = str;
        this.f16006c = list;
        this.f16007d = str2;
        this.f16011h = i2;
        this.f16012i = i;
    }

    /* renamed from: a */
    public List<byte[]> mo15425a() {
        return this.f16006c;
    }

    /* renamed from: a */
    public void mo15426a(Integer num) {
        this.f16009f = num;
    }

    /* renamed from: a */
    public void mo15427a(Object obj) {
        this.f16010g = obj;
    }

    /* renamed from: b */
    public String mo15428b() {
        return this.f16007d;
    }

    /* renamed from: b */
    public void mo15429b(Integer num) {
        this.f16008e = num;
    }

    /* renamed from: c */
    public Object mo15430c() {
        return this.f16010g;
    }

    /* renamed from: d */
    public byte[] mo15431d() {
        return this.f16004a;
    }

    /* renamed from: e */
    public int mo15432e() {
        return this.f16011h;
    }

    /* renamed from: f */
    public int mo15433f() {
        return this.f16012i;
    }

    /* renamed from: g */
    public String mo15434g() {
        return this.f16005b;
    }

    /* renamed from: h */
    public boolean mo15435h() {
        return this.f16011h >= 0 && this.f16012i >= 0;
    }
}
