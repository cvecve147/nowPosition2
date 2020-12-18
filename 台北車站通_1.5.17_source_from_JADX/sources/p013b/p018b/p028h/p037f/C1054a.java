package p013b.p018b.p028h.p037f;

import android.util.Base64;
import java.util.List;
import p013b.p018b.p028h.p039h.C1100q;

/* renamed from: b.b.h.f.a */
public final class C1054a {

    /* renamed from: a */
    private final String f3966a;

    /* renamed from: b */
    private final String f3967b;

    /* renamed from: c */
    private final String f3968c;

    /* renamed from: d */
    private final List<List<byte[]>> f3969d;

    /* renamed from: e */
    private final int f3970e = 0;

    /* renamed from: f */
    private final String f3971f = (this.f3966a + "-" + this.f3967b + "-" + this.f3968c);

    public C1054a(String str, String str2, String str3, List<List<byte[]>> list) {
        C1100q.m5687a(str);
        this.f3966a = str;
        C1100q.m5687a(str2);
        this.f3967b = str2;
        C1100q.m5687a(str3);
        this.f3968c = str3;
        C1100q.m5687a(list);
        this.f3969d = list;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo5075a() {
        return this.f3969d;
    }

    /* renamed from: b */
    public int mo5076b() {
        return this.f3970e;
    }

    /* renamed from: c */
    public String mo5077c() {
        return this.f3971f;
    }

    /* renamed from: d */
    public String mo5078d() {
        return this.f3966a;
    }

    /* renamed from: e */
    public String mo5079e() {
        return this.f3967b;
    }

    /* renamed from: f */
    public String mo5080f() {
        return this.f3968c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3966a + ", mProviderPackage: " + this.f3967b + ", mQuery: " + this.f3968c + ", mCertificates:");
        for (int i = 0; i < this.f3969d.size(); i++) {
            sb.append(" [");
            List list = this.f3969d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3970e);
        return sb.toString();
    }
}
