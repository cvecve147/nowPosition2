package p208e.p209a.p210a.p211a.p212a.p214b;

/* renamed from: e.a.a.a.a.b.b */
class C6068b {

    /* renamed from: a */
    public final String f16986a;

    /* renamed from: b */
    public final boolean f16987b;

    C6068b(String str, boolean z) {
        this.f16986a = str;
        this.f16987b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6068b.class != obj.getClass()) {
            return false;
        }
        C6068b bVar = (C6068b) obj;
        if (this.f16987b != bVar.f16987b) {
            return false;
        }
        String str = this.f16986a;
        return str == null ? bVar.f16986a == null : str.equals(bVar.f16986a);
    }

    public int hashCode() {
        String str = this.f16986a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f16987b ? 1 : 0);
    }
}
