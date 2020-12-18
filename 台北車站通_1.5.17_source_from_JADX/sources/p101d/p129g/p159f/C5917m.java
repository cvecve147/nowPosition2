package p101d.p129g.p159f;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: d.g.f.m */
public final class C5917m {

    /* renamed from: a */
    private final String f16354a;

    /* renamed from: b */
    private final byte[] f16355b;

    /* renamed from: c */
    private C5919o[] f16356c;

    /* renamed from: d */
    private final C5743a f16357d;

    /* renamed from: e */
    private Map<C5918n, Object> f16358e;

    /* renamed from: f */
    private final long f16359f;

    public C5917m(String str, byte[] bArr, C5919o[] oVarArr, C5743a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    public C5917m(String str, byte[] bArr, C5919o[] oVarArr, C5743a aVar, long j) {
        this.f16354a = str;
        this.f16355b = bArr;
        this.f16356c = oVarArr;
        this.f16357d = aVar;
        this.f16358e = null;
        this.f16359f = j;
    }

    /* renamed from: a */
    public C5743a mo15693a() {
        return this.f16357d;
    }

    /* renamed from: a */
    public void mo15694a(C5918n nVar, Object obj) {
        if (this.f16358e == null) {
            this.f16358e = new EnumMap(C5918n.class);
        }
        this.f16358e.put(nVar, obj);
    }

    /* renamed from: a */
    public void mo15695a(Map<C5918n, Object> map) {
        if (map != null) {
            Map<C5918n, Object> map2 = this.f16358e;
            if (map2 == null) {
                this.f16358e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: a */
    public void mo15696a(C5919o[] oVarArr) {
        C5919o[] oVarArr2 = this.f16356c;
        if (oVarArr2 == null) {
            this.f16356c = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            C5919o[] oVarArr3 = new C5919o[(oVarArr2.length + oVarArr.length)];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f16356c = oVarArr3;
        }
    }

    /* renamed from: b */
    public byte[] mo15697b() {
        return this.f16355b;
    }

    /* renamed from: c */
    public Map<C5918n, Object> mo15698c() {
        return this.f16358e;
    }

    /* renamed from: d */
    public C5919o[] mo15699d() {
        return this.f16356c;
    }

    /* renamed from: e */
    public String mo15700e() {
        return this.f16354a;
    }

    public String toString() {
        return this.f16354a;
    }
}
