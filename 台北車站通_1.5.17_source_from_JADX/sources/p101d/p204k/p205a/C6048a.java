package p101d.p204k.p205a;

/* renamed from: d.k.a.a */
public class C6048a {

    /* renamed from: a */
    public final String f16951a;

    /* renamed from: b */
    public final boolean f16952b;

    /* renamed from: c */
    public final boolean f16953c;

    public C6048a(String str, boolean z, boolean z2) {
        this.f16951a = str;
        this.f16952b = z;
        this.f16953c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6048a.class != obj.getClass()) {
            return false;
        }
        C6048a aVar = (C6048a) obj;
        if (this.f16952b == aVar.f16952b && this.f16953c == aVar.f16953c) {
            return this.f16951a.equals(aVar.f16951a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f16951a.hashCode() * 31) + (this.f16952b ? 1 : 0)) * 31) + (this.f16953c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f16951a + '\'' + ", granted=" + this.f16952b + ", shouldShowRequestPermissionRationale=" + this.f16953c + '}';
    }
}
