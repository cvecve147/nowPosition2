package p101d.p129g.p152e.p154b.p155a;

import java.util.BitSet;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.U */
class C5631U extends C5593I<BitSet> {
    C5631U() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r8.mo15160k() != 0) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.BitSet m21341a(p101d.p129g.p152e.p158d.C5716b r8) {
        /*
            r7 = this;
            d.g.e.d.c r0 = r8.mo15165p()
            d.g.e.d.c r1 = p101d.p129g.p152e.p158d.C5717c.NULL
            if (r0 != r1) goto L_0x000d
            r8.mo15163n()
            r8 = 0
            return r8
        L_0x000d:
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r8.mo15151a()
            d.g.e.d.c r1 = r8.mo15165p()
            r2 = 0
            r3 = r2
        L_0x001b:
            d.g.e.d.c r4 = p101d.p129g.p152e.p158d.C5717c.END_ARRAY
            if (r1 == r4) goto L_0x0082
            int[] r4 = p101d.p129g.p152e.p154b.p155a.C5641ba.f15605a
            int r5 = r1.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0070
            r6 = 2
            if (r4 == r6) goto L_0x006b
            r6 = 3
            if (r4 != r6) goto L_0x0054
            java.lang.String r1 = r8.mo15164o()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x003d }
            if (r1 == 0) goto L_0x003b
            goto L_0x0076
        L_0x003b:
            r5 = r2
            goto L_0x0076
        L_0x003d:
            d.g.e.D r8 = new d.g.e.D
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x0054:
            d.g.e.D r8 = new d.g.e.D
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid bitset value type: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x006b:
            boolean r5 = r8.mo15158i()
            goto L_0x0076
        L_0x0070:
            int r1 = r8.mo15160k()
            if (r1 == 0) goto L_0x003b
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            r0.set(r3)
        L_0x007b:
            int r3 = r3 + 1
            d.g.e.d.c r1 = r8.mo15165p()
            goto L_0x001b
        L_0x0082:
            r8.mo15154d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.p155a.C5631U.m21341a(d.g.e.d.b):java.util.BitSet");
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, BitSet bitSet) {
        if (bitSet == null) {
            dVar.mo15186h();
            return;
        }
        dVar.mo15174a();
        for (int i = 0; i < bitSet.length(); i++) {
            dVar.mo15175a(bitSet.get(i) ? 1 : 0);
        }
        dVar.mo15180c();
    }
}
