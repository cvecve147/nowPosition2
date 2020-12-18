package p101d.p119e.p120a;

import java.util.Collections;
import java.util.Map;

/* renamed from: d.e.a.b */
public interface C5267b {

    /* renamed from: d.e.a.b$a */
    public static class C5268a {

        /* renamed from: a */
        public byte[] f14898a;

        /* renamed from: b */
        public String f14899b;

        /* renamed from: c */
        public long f14900c;

        /* renamed from: d */
        public long f14901d;

        /* renamed from: e */
        public long f14902e;

        /* renamed from: f */
        public long f14903f;

        /* renamed from: g */
        public Map<String, String> f14904g = Collections.emptyMap();

        /* renamed from: a */
        public boolean mo14602a() {
            return this.f14902e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo14603b() {
            return this.f14903f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    void mo14577a();

    /* renamed from: a */
    void mo14578a(String str, C5268a aVar);

    C5268a get(String str);
}
