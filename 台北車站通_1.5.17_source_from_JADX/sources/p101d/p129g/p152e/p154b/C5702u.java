package p101d.p129g.p152e.p154b;

import java.math.BigDecimal;

/* renamed from: d.g.e.b.u */
public final class C5702u extends Number {

    /* renamed from: a */
    private final String f15763a;

    public C5702u(String str) {
        this.f15763a = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f15763a);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f15763a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5702u)) {
            return false;
        }
        String str = this.f15763a;
        String str2 = ((C5702u) obj).f15763a;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f15763a);
    }

    public int hashCode() {
        return this.f15763a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f15763a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f15763a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f15763a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f15763a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f15763a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.C5702u.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f15763a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f15763a).longValue();
        }
    }

    public String toString() {
        return this.f15763a;
    }
}
