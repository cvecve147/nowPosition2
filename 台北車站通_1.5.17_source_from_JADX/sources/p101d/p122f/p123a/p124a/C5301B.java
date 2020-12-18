package p101d.p122f.p123a.p124a;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* renamed from: d.f.a.a.B */
final class C5301B {

    /* renamed from: a */
    public final C5304C f14988a;

    /* renamed from: b */
    public final long f14989b;

    /* renamed from: c */
    public final C5303b f14990c;

    /* renamed from: d */
    public final Map<String, String> f14991d;

    /* renamed from: e */
    public final String f14992e;

    /* renamed from: f */
    public final Map<String, Object> f14993f;

    /* renamed from: g */
    public final String f14994g;

    /* renamed from: h */
    public final Map<String, Object> f14995h;

    /* renamed from: i */
    private String f14996i;

    /* renamed from: d.f.a.a.B$a */
    static class C5302a {

        /* renamed from: a */
        final C5303b f14997a;

        /* renamed from: b */
        final long f14998b = System.currentTimeMillis();

        /* renamed from: c */
        Map<String, String> f14999c = null;

        /* renamed from: d */
        String f15000d = null;

        /* renamed from: e */
        Map<String, Object> f15001e = null;

        /* renamed from: f */
        String f15002f = null;

        /* renamed from: g */
        Map<String, Object> f15003g = null;

        public C5302a(C5303b bVar) {
            this.f14997a = bVar;
        }

        /* renamed from: a */
        public C5302a mo14666a(Map<String, Object> map) {
            this.f15001e = map;
            return this;
        }

        /* renamed from: a */
        public C5301B mo14667a(C5304C c) {
            return new C5301B(c, this.f14998b, this.f14997a, this.f14999c, this.f15000d, this.f15001e, this.f15002f, this.f15003g);
        }

        /* renamed from: b */
        public C5302a mo14668b(Map<String, String> map) {
            this.f14999c = map;
            return this;
        }
    }

    /* renamed from: d.f.a.a.B$b */
    enum C5303b {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    private C5301B(C5304C c, long j, C5303b bVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f14988a = c;
        this.f14989b = j;
        this.f14990c = bVar;
        this.f14991d = map;
        this.f14992e = str;
        this.f14993f = map2;
        this.f14994g = str2;
        this.f14995h = map3;
    }

    /* renamed from: a */
    public static C5302a m20483a(long j) {
        C5302a aVar = new C5302a(C5303b.INSTALL);
        aVar.mo14668b(Collections.singletonMap("installedAt", String.valueOf(j)));
        return aVar;
    }

    /* renamed from: a */
    public static C5302a m20484a(C5303b bVar, Activity activity) {
        Map singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        C5302a aVar = new C5302a(bVar);
        aVar.mo14668b(singletonMap);
        return aVar;
    }

    /* renamed from: a */
    public static C5302a m20485a(String str) {
        Map singletonMap = Collections.singletonMap("sessionId", str);
        C5302a aVar = new C5302a(C5303b.CRASH);
        aVar.mo14668b(singletonMap);
        return aVar;
    }

    /* renamed from: a */
    public static C5302a m20486a(String str, String str2) {
        C5302a a = m20485a(str);
        a.mo14666a((Map<String, Object>) Collections.singletonMap("exceptionName", str2));
        return a;
    }

    public String toString() {
        if (this.f14996i == null) {
            this.f14996i = "[" + C5301B.class.getSimpleName() + ": " + "timestamp=" + this.f14989b + ", type=" + this.f14990c + ", details=" + this.f14991d + ", customType=" + this.f14992e + ", customAttributes=" + this.f14993f + ", predefinedType=" + this.f14994g + ", predefinedAttributes=" + this.f14995h + ", metadata=[" + this.f14988a + "]]";
        }
        return this.f14996i;
    }
}
