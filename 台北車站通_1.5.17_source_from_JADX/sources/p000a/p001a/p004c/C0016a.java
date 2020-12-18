package p000a.p001a.p004c;

/* renamed from: a.a.c.a */
public class C0016a {

    /* renamed from: a */
    private int f51a = 0;

    /* renamed from: b */
    private int f52b = 0;

    /* renamed from: c */
    private String f53c = "";

    public C0016a(byte[] bArr) {
        this.f53c = m45a(bArr);
        this.f51a = (m44a(Byte.valueOf(bArr[25]).intValue()) * 256) + m44a(Byte.valueOf(bArr[26]).intValue());
        this.f52b = (m44a(Byte.valueOf(bArr[27]).intValue()) * 256) + m44a(Byte.valueOf(bArr[28]).intValue());
    }

    /* renamed from: a */
    private int m44a(int i) {
        return i < 0 ? i + 256 : i;
    }

    /* renamed from: a */
    private String m45a(byte[] bArr) {
        String str = "";
        for (int i = 9; i <= 24; i++) {
            str = str + String.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        return str;
    }

    /* renamed from: a */
    public int mo20a() {
        return this.f51a;
    }

    /* renamed from: b */
    public int mo21b() {
        return this.f52b;
    }

    /* renamed from: c */
    public String mo22c() {
        return this.f53c;
    }
}
