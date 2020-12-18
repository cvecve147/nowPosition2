package p101d.p119e.p120a;

import java.io.Serializable;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: d.e.a.l */
public class C5279l implements Serializable {

    /* renamed from: a */
    public final int f14930a;

    /* renamed from: b */
    public final byte[] f14931b;

    /* renamed from: c */
    public final Map<String, String> f14932c;

    /* renamed from: d */
    public final boolean f14933d;

    /* renamed from: e */
    public final long f14934e;

    public C5279l(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f14930a = i;
        this.f14931b = bArr;
        this.f14932c = map;
        this.f14933d = z;
        this.f14934e = j;
    }

    public C5279l(byte[] bArr, Map<String, String> map) {
        this(HttpStatus.SC_OK, bArr, map, false, 0);
    }
}
