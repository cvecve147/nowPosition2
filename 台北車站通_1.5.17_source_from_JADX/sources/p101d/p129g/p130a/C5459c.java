package p101d.p129g.p130a;

import com.google.android.gms.ads.C1642d;
import org.apache.http.HttpStatus;

@Deprecated
/* renamed from: d.g.a.c */
public final class C5459c {

    /* renamed from: a */
    public static final C5459c f15367a = new C5459c(-1, -2, "mb");

    /* renamed from: b */
    public static final C5459c f15368b = new C5459c(320, 50, "mb");

    /* renamed from: c */
    public static final C5459c f15369c = new C5459c(HttpStatus.SC_MULTIPLE_CHOICES, 250, "as");

    /* renamed from: d */
    public static final C5459c f15370d = new C5459c(468, 60, "as");

    /* renamed from: e */
    public static final C5459c f15371e = new C5459c(728, 90, "as");

    /* renamed from: f */
    public static final C5459c f15372f = new C5459c(160, 600, "as");

    /* renamed from: g */
    private final C1642d f15373g;

    private C5459c(int i, int i2, String str) {
        this(new C1642d(i, i2));
    }

    public C5459c(C1642d dVar) {
        this.f15373g = dVar;
    }

    /* renamed from: a */
    public final int mo14914a() {
        return this.f15373g.mo6578a();
    }

    /* renamed from: b */
    public final int mo14915b() {
        return this.f15373g.mo6580b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5459c)) {
            return false;
        }
        return this.f15373g.equals(((C5459c) obj).f15373g);
    }

    public final int hashCode() {
        return this.f15373g.hashCode();
    }

    public final String toString() {
        return this.f15373g.toString();
    }
}
