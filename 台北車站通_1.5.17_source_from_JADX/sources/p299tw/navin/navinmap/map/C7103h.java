package p299tw.navin.navinmap.map;

import java.util.HashSet;
import p299tw.navin.navinmap.map.C7079a;

/* renamed from: tw.navin.navinmap.map.h */
public class C7103h extends C7079a {
    /* renamed from: a */
    static HashSet<String> m26751a(boolean z) {
        return m26752a(new String[]{"ELEVATOR"}, z ? C7079a.C7080a.MODE_INCLUDE : C7079a.C7080a.MODE_EXCLUDE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.HashSet<java.lang.String> m26752a(java.lang.String[] r17, p299tw.navin.navinmap.map.C7079a.C7080a r18) {
        /*
            r0 = r17
            if (r18 != 0) goto L_0x0007
            tw.navin.navinmap.map.a$a r1 = p299tw.navin.navinmap.map.C7079a.C7080a.MODE_INCLUDE
            goto L_0x0009
        L_0x0007:
            r1 = r18
        L_0x0009:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r3 = "N"
            r2.add(r3)
            java.lang.String r4 = "G"
            r2.add(r4)
            java.lang.String r5 = "E"
            r2.add(r5)
            java.lang.String r6 = "DE"
            r2.add(r6)
            java.lang.String r7 = "SU"
            r2.add(r7)
            java.lang.String r8 = "SD"
            r2.add(r8)
            java.lang.String r9 = "ESU"
            r2.add(r9)
            java.lang.String r10 = "ESD"
            r2.add(r10)
            java.lang.String r11 = "AR"
            r2.add(r11)
            if (r0 == 0) goto L_0x010e
            int r12 = r0.length
            if (r12 <= 0) goto L_0x010e
            tw.navin.navinmap.map.a$a r12 = p299tw.navin.navinmap.map.C7079a.C7080a.MODE_INCLUDE
            r13 = -269630058(0xffffffffefedc596, float:-1.4717363E29)
            r14 = -1839162806(0xffffffff92609a4a, float:-7.0872113E-28)
            r16 = 0
            r15 = 1
            if (r1 != r12) goto L_0x00b2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2.add(r3)
            r2.add(r4)
            int r1 = r0.length
            r3 = r16
        L_0x005b:
            if (r3 >= r1) goto L_0x010e
            r4 = r0[r3]
            int r12 = r4.hashCode()
            if (r12 == r14) goto L_0x0082
            if (r12 == r13) goto L_0x0078
            r13 = 782485742(0x2ea3c8ee, float:7.448074E-11)
            if (r12 == r13) goto L_0x006d
            goto L_0x008c
        L_0x006d:
            java.lang.String r12 = "ELEVATOR"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x008c
            r4 = r16
            goto L_0x008d
        L_0x0078:
            java.lang.String r12 = "ESCALATOR"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x008c
            r4 = r15
            goto L_0x008d
        L_0x0082:
            java.lang.String r12 = "STAIRS"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x008c
            r4 = 2
            goto L_0x008d
        L_0x008c:
            r4 = -1
        L_0x008d:
            if (r4 == 0) goto L_0x00a3
            if (r4 == r15) goto L_0x009c
            r12 = 2
            if (r4 == r12) goto L_0x0095
            goto L_0x00ac
        L_0x0095:
            r2.add(r7)
            r2.add(r8)
            goto L_0x00ac
        L_0x009c:
            r2.add(r9)
            r2.add(r10)
            goto L_0x00ac
        L_0x00a3:
            r2.add(r5)
            r2.add(r6)
            r2.add(r11)
        L_0x00ac:
            int r3 = r3 + 1
            r13 = -269630058(0xffffffffefedc596, float:-1.4717363E29)
            goto L_0x005b
        L_0x00b2:
            int r1 = r0.length
            r3 = r16
        L_0x00b5:
            if (r3 >= r1) goto L_0x010e
            r4 = r0[r3]
            int r12 = r4.hashCode()
            if (r12 == r14) goto L_0x00df
            r13 = -269630058(0xffffffffefedc596, float:-1.4717363E29)
            if (r12 == r13) goto L_0x00d5
            r13 = 782485742(0x2ea3c8ee, float:7.448074E-11)
            if (r12 == r13) goto L_0x00ca
            goto L_0x00e9
        L_0x00ca:
            java.lang.String r12 = "ELEVATOR"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x00e9
            r4 = r16
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r12 = "ESCALATOR"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x00e9
            r4 = r15
            goto L_0x00ea
        L_0x00df:
            java.lang.String r12 = "STAIRS"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x00e9
            r4 = 2
            goto L_0x00ea
        L_0x00e9:
            r4 = -1
        L_0x00ea:
            if (r4 == 0) goto L_0x0101
            if (r4 == r15) goto L_0x00f9
            r12 = 2
            if (r4 == r12) goto L_0x00f2
            goto L_0x010b
        L_0x00f2:
            r2.remove(r7)
            r2.remove(r8)
            goto L_0x010b
        L_0x00f9:
            r12 = 2
            r2.remove(r9)
            r2.remove(r10)
            goto L_0x010b
        L_0x0101:
            r12 = 2
            r2.remove(r5)
            r2.remove(r6)
            r2.remove(r11)
        L_0x010b:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x010e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7103h.m26752a(java.lang.String[], tw.navin.navinmap.map.a$a):java.util.HashSet");
    }
}
