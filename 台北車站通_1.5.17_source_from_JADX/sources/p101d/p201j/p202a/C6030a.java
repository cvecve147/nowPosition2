package p101d.p201j.p202a;

/* renamed from: d.j.a.a */
public class C6030a {

    /* renamed from: a */
    private int f16865a = 0;

    /* renamed from: b */
    private int f16866b = 0;

    /* renamed from: c */
    private String f16867c = "";

    public C6030a(byte[] bArr) {
        this.f16867c = m22885a(bArr);
        this.f16865a = (m22884a(Byte.valueOf(bArr[25]).intValue()) * 256) + m22884a(Byte.valueOf(bArr[26]).intValue());
        this.f16866b = (m22884a(Byte.valueOf(bArr[27]).intValue()) * 256) + m22884a(Byte.valueOf(bArr[28]).intValue());
    }

    /* renamed from: a */
    private int m22884a(int i) {
        return i < 0 ? i + 256 : i;
    }

    /* renamed from: a */
    private String m22885a(byte[] bArr) {
        String str = "";
        for (int i = 9; i <= 24; i++) {
            str = str + String.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        return str;
    }

    /* renamed from: a */
    public int mo15959a() {
        return this.f16865a;
    }

    /* renamed from: b */
    public int mo15960b() {
        return this.f16866b;
    }

    /* renamed from: c */
    public String mo15961c() {
        return this.f16867c;
    }
}
