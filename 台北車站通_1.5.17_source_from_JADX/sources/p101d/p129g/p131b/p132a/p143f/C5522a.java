package p101d.p129g.p131b.p132a.p143f;

import android.os.Bundle;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C4008e;

/* renamed from: d.g.b.a.f.a */
public final class C5522a {

    /* renamed from: a */
    public static final C1850a.C1862g<C4008e> f15425a = new C1850a.C1862g<>();

    /* renamed from: b */
    public static final C1850a.C1862g<C4008e> f15426b = new C1850a.C1862g<>();

    /* renamed from: c */
    public static final C1850a.C1851a<C4008e, C5525c> f15427c = new C5527d();

    /* renamed from: d */
    private static final C1850a.C1851a<C4008e, C5523a> f15428d = new C5528e();

    /* renamed from: e */
    public static final Scope f15429e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f15430f = new Scope("email");

    /* renamed from: g */
    public static final C1850a<C5525c> f15431g = new C1850a<>("SignIn.API", f15427c, f15425a);

    /* renamed from: h */
    public static final C1850a<C5523a> f15432h = new C1850a<>("SignIn.INTERNAL_API", f15428d, f15426b);

    /* renamed from: d.g.b.a.f.a$a */
    public static class C5523a implements C1850a.C1854d.C1857c {

        /* renamed from: a */
        private final Bundle f15433a;

        /* renamed from: b */
        public Bundle mo14971b() {
            return this.f15433a;
        }
    }
}
