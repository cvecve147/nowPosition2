package p250g.p255b.p256a.p260d;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p250g.p255b.p256a.C6471b;
import p250g.p255b.p256a.C6567g;

/* renamed from: g.b.a.d.a */
public class C6519a {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, C6520b> f18103a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final AtomicReferenceArray<C6520b> f18104b = new AtomicReferenceArray<>(25);

    /* renamed from: a */
    public static C6520b m24750a(String str) {
        return m24753b(str);
    }

    /* renamed from: a */
    private static String m24751a(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* renamed from: a */
    private static void m24752a(C6521c cVar, String str) {
        boolean z;
        String str2;
        boolean z2;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String a = m24751a(str, iArr);
            int i2 = iArr[0];
            int length2 = a.length();
            if (length2 != 0) {
                char charAt = a.charAt(0);
                if (charAt == '\'') {
                    String substring = a.substring(1);
                    if (substring.length() == 1) {
                        cVar.mo16852a(substring.charAt(0));
                    } else {
                        cVar.mo16862a(new String(substring));
                    }
                } else if (charAt == 'K') {
                    cVar.mo16887g(length2);
                } else if (charAt != 'M') {
                    if (charAt == 'S') {
                        cVar.mo16879d(length2, length2);
                    } else if (charAt == 'a') {
                        cVar.mo16877d();
                    } else if (charAt == 'h') {
                        cVar.mo16867b(length2);
                    } else if (charAt == 'k') {
                        cVar.mo16853a(length2);
                    } else if (charAt == 'm') {
                        cVar.mo16890h(length2);
                    } else if (charAt == 's') {
                        cVar.mo16893j(length2);
                    } else if (charAt == 'G') {
                        cVar.mo16873c();
                    } else if (charAt != 'H') {
                        if (charAt != 'Y') {
                            if (charAt == 'Z') {
                                if (length2 == 1) {
                                    str2 = null;
                                    z2 = false;
                                } else if (length2 == 2) {
                                    str2 = null;
                                    z2 = true;
                                } else {
                                    cVar.mo16886g();
                                }
                                cVar.mo16863a(str2, "Z", z2, 2, 2);
                            } else if (charAt == 'd') {
                                cVar.mo16874c(length2);
                            } else if (charAt != 'e') {
                                switch (charAt) {
                                    case 'C':
                                        cVar.mo16854a(length2, length2);
                                        continue;
                                    case 'D':
                                        cVar.mo16881e(length2);
                                        continue;
                                    case 'E':
                                        if (length2 < 4) {
                                            cVar.mo16851a();
                                            break;
                                        } else {
                                            cVar.mo16866b();
                                            continue;
                                        }
                                    default:
                                        switch (charAt) {
                                            case 'w':
                                                cVar.mo16895k(length2);
                                                continue;
                                            case 'x':
                                            case 'y':
                                                break;
                                            case 'z':
                                                if (length2 < 4) {
                                                    cVar.mo16865a((Map<String, C6567g>) null);
                                                    break;
                                                } else {
                                                    cVar.mo16889h();
                                                    continue;
                                                    continue;
                                                }
                                            default:
                                                throw new IllegalArgumentException("Illegal pattern component: " + a);
                                        }
                                }
                            } else {
                                cVar.mo16878d(length2);
                            }
                        }
                        if (length2 == 2) {
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                z = !m24754c(m24751a(str, iArr));
                                iArr[0] = iArr[0] - 1;
                            } else {
                                z = true;
                            }
                            if (charAt != 'x') {
                                cVar.mo16869b(new C6471b().mo16680g() - 30, z);
                            } else {
                                cVar.mo16855a(new C6471b().mo16679f() - 30, z);
                            }
                        } else {
                            int i3 = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (m24754c(m24751a(str, iArr))) {
                                    i3 = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            if (charAt == 'Y') {
                                cVar.mo16888g(length2, i3);
                            } else if (charAt == 'x') {
                                cVar.mo16882e(length2, i3);
                            } else if (charAt == 'y') {
                                cVar.mo16885f(length2, i3);
                            }
                        }
                    } else {
                        cVar.mo16884f(length2);
                    }
                } else if (length2 < 3) {
                    cVar.mo16892i(length2);
                } else if (length2 >= 4) {
                    cVar.mo16883f();
                } else {
                    cVar.mo16880e();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r3 = f18103a.putIfAbsent(r3, r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p250g.p255b.p256a.p260d.C6520b m24753b(java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x0034
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<java.lang.String, g.b.a.d.b> r0 = f18103a
            java.lang.Object r0 = r0.get(r3)
            g.b.a.d.b r0 = (p250g.p255b.p256a.p260d.C6520b) r0
            if (r0 != 0) goto L_0x0033
            g.b.a.d.c r0 = new g.b.a.d.c
            r0.<init>()
            m24752a((p250g.p255b.p256a.p260d.C6521c) r0, (java.lang.String) r3)
            g.b.a.d.b r0 = r0.mo16891i()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, g.b.a.d.b> r1 = f18103a
            int r1 = r1.size()
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r2) goto L_0x0033
            java.util.concurrent.ConcurrentHashMap<java.lang.String, g.b.a.d.b> r1 = f18103a
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            g.b.a.d.b r3 = (p250g.p255b.p256a.p260d.C6520b) r3
            if (r3 == 0) goto L_0x0033
            r0 = r3
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid pattern specification"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p260d.C6519a.m24753b(java.lang.String):g.b.a.d.b");
    }

    /* renamed from: c */
    private static boolean m24754c(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    break;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
