package p101d.p129g.p159f.p176g.p177a.p178a;

import p101d.p129g.p159f.p176g.p177a.C5840b;
import p101d.p129g.p159f.p176g.p177a.C5841c;

/* renamed from: d.g.f.g.a.a.b */
final class C5837b {

    /* renamed from: a */
    private final boolean f16134a;

    /* renamed from: b */
    private final C5840b f16135b;

    /* renamed from: c */
    private final C5840b f16136c;

    /* renamed from: d */
    private final C5841c f16137d;

    C5837b(C5840b bVar, C5840b bVar2, C5841c cVar, boolean z) {
        this.f16135b = bVar;
        this.f16136c = bVar2;
        this.f16137d = cVar;
        this.f16134a = z;
    }

    /* renamed from: a */
    private static int m22037a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    private static boolean m22038a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5841c mo15523a() {
        return this.f16137d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5840b mo15524b() {
        return this.f16135b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5840b mo15525c() {
        return this.f16136c;
    }

    /* renamed from: d */
    public boolean mo15526d() {
        return this.f16136c == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5837b)) {
            return false;
        }
        C5837b bVar = (C5837b) obj;
        return m22038a(this.f16135b, bVar.f16135b) && m22038a(this.f16136c, bVar.f16136c) && m22038a(this.f16137d, bVar.f16137d);
    }

    public int hashCode() {
        return (m22037a(this.f16135b) ^ m22037a(this.f16136c)) ^ m22037a(this.f16137d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f16135b);
        sb.append(" , ");
        sb.append(this.f16136c);
        sb.append(" : ");
        C5841c cVar = this.f16137d;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo15546c()));
        sb.append(" ]");
        return sb.toString();
    }
}
