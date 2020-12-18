package p101d.p129g.p159f;

import org.apache.http.message.TokenParser;

/* renamed from: d.g.f.g */
public abstract class C5813g {

    /* renamed from: a */
    private final int f16093a;

    /* renamed from: b */
    private final int f16094b;

    protected C5813g(int i, int i2) {
        this.f16093a = i;
        this.f16094b = i2;
    }

    /* renamed from: a */
    public final int mo15477a() {
        return this.f16094b;
    }

    /* renamed from: a */
    public abstract byte[] mo15478a(int i, byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo15479b();

    /* renamed from: c */
    public final int mo15480c() {
        return this.f16093a;
    }

    /* renamed from: d */
    public boolean mo15481d() {
        return false;
    }

    /* renamed from: e */
    public C5813g mo15482e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f16093a;
        StringBuilder sb = new StringBuilder(this.f16094b * (i + 1));
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < this.f16094b; i2++) {
            bArr = mo15478a(i2, bArr);
            for (int i3 = 0; i3 < this.f16093a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : TokenParser.f19315SP);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
