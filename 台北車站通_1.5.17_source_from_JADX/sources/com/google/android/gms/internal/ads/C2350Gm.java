package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2406Im;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gm */
final class C2350Gm<FieldDescriptorType extends C2406Im<FieldDescriptorType>> {

    /* renamed from: a */
    private static final C2350Gm f7081a = new C2350Gm(true);

    /* renamed from: b */
    private final C2583On<FieldDescriptorType, Object> f7082b = C2583On.m10824a(16);

    /* renamed from: c */
    private boolean f7083c;

    /* renamed from: d */
    private boolean f7084d = false;

    private C2350Gm() {
    }

    private C2350Gm(boolean z) {
        mo8228f();
    }

    /* renamed from: a */
    static int m9973a(C3442ro roVar, int i, Object obj) {
        int e = C3525um.m14097e(i);
        if (roVar == C3442ro.GROUP) {
            C2641Qm.m10990a((C3498tn) obj);
            e <<= 1;
        }
        return e + m9980b(roVar, obj);
    }

    /* renamed from: a */
    private final Object m9974a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f7082b.get(fielddescriptortype);
        if (!(obj instanceof C2839Xm)) {
            return obj;
        }
        C2839Xm.m11590c();
        throw null;
    }

    /* renamed from: a */
    private static Object m9975a(Object obj) {
        if (obj instanceof C2179An) {
            return ((C2179An) obj).mo7829a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private final void m9976a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo8343g()) {
            m9977a(fielddescriptortype.mo8345i(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m9977a(fielddescriptortype.mo8345i(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C2839Xm) {
            this.f7084d = true;
        }
        this.f7082b.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.C2839Xm) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.C2671Rm) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9977a(com.google.android.gms.internal.ads.C3442ro r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.C2641Qm.m10987a(r3)
            int[] r0 = com.google.android.gms.internal.ads.C2378Hm.f7183a
            com.google.android.gms.internal.ads.wo r2 = r2.mo9987a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.C3498tn
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.C2839Xm
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.C2671Rm
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = r0
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.C3150hm
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0026
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0026
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0026
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0026
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0026
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L_0x0026
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2350Gm.m9977a(com.google.android.gms.internal.ads.ro, java.lang.Object):void");
    }

    /* renamed from: a */
    private static boolean m9978a(Map.Entry<FieldDescriptorType, Object> entry) {
        C2406Im im = (C2406Im) entry.getKey();
        if (im.mo8346j() == C3585wo.MESSAGE) {
            if (im.mo8343g()) {
                for (C3498tn isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C3498tn) {
                    if (!((C3498tn) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C2839Xm) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m9979b(C2406Im<?> im, Object obj) {
        C3442ro i = im.mo8345i();
        int d = im.mo8342d();
        if (!im.mo8343g()) {
            return m9973a(i, d, obj);
        }
        int i2 = 0;
        if (im.mo8344h()) {
            for (Object b : (List) obj) {
                i2 += m9980b(i, b);
            }
            return C3525um.m14097e(d) + i2 + C3525um.m14119l(i2);
        }
        for (Object a : (List) obj) {
            i2 += m9973a(i, d, a);
        }
        return i2;
    }

    /* renamed from: b */
    private static int m9980b(C3442ro roVar, Object obj) {
        switch (C2378Hm.f7184b[roVar.ordinal()]) {
            case 1:
                return C3525um.m14079b(((Double) obj).doubleValue());
            case 2:
                return C3525um.m14080b(((Float) obj).floatValue());
            case 3:
                return C3525um.m14096d(((Long) obj).longValue());
            case 4:
                return C3525um.m14099e(((Long) obj).longValue());
            case 5:
                return C3525um.m14100f(((Integer) obj).intValue());
            case 6:
                return C3525um.m14107g(((Long) obj).longValue());
            case 7:
                return C3525um.m14112i(((Integer) obj).intValue());
            case 8:
                return C3525um.m14089b(((Boolean) obj).booleanValue());
            case 9:
                return C3525um.m14088b((C3498tn) obj);
            case 10:
                return obj instanceof C2839Xm ? C3525um.m14073a((C2980bn) (C2839Xm) obj) : C3525um.m14075a((C3498tn) obj);
            case 11:
                return obj instanceof C3150hm ? C3525um.m14074a((C3150hm) obj) : C3525um.m14077a((String) obj);
            case 12:
                return obj instanceof C3150hm ? C3525um.m14074a((C3150hm) obj) : C3525um.m14090b((byte[]) obj);
            case 13:
                return C3525um.m14104g(((Integer) obj).intValue());
            case 14:
                return C3525um.m14115j(((Integer) obj).intValue());
            case 15:
                return C3525um.m14111h(((Long) obj).longValue());
            case 16:
                return C3525um.m14108h(((Integer) obj).intValue());
            case 17:
                return C3525um.m14103f(((Long) obj).longValue());
            case 18:
                return obj instanceof C2671Rm ? C3525um.m14117k(((C2671Rm) obj).mo8218d()) : C3525um.m14117k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m9981b(Map.Entry<FieldDescriptorType, Object> entry) {
        C2406Im im = (C2406Im) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2839Xm) {
            C2839Xm.m11590c();
            throw null;
        } else if (im.mo8343g()) {
            Object a = m9974a(im);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m9975a(a2));
            }
            this.f7082b.put(im, a);
        } else if (im.mo8346j() == C3585wo.MESSAGE) {
            Object a3 = m9974a(im);
            if (a3 == null) {
                this.f7082b.put(im, m9975a(value));
            } else {
                this.f7082b.put(im, a3 instanceof C2179An ? im.mo8340a((C2179An) a3, (C2179An) value) : im.mo8341a(((C3498tn) a3).mo8617f(), (C3498tn) value).mo8626c());
            }
        } else {
            this.f7082b.put(im, m9975a(value));
        }
    }

    /* renamed from: c */
    private static int m9982c(Map.Entry<FieldDescriptorType, Object> entry) {
        C2406Im im = (C2406Im) entry.getKey();
        Object value = entry.getValue();
        return (im.mo8346j() != C3585wo.MESSAGE || im.mo8343g() || im.mo8344h()) ? m9979b((C2406Im<?>) im, value) : value instanceof C2839Xm ? C3525um.m14083b(((C2406Im) entry.getKey()).mo8342d(), (C2980bn) (C2839Xm) value) : C3525um.m14084b(((C2406Im) entry.getKey()).mo8342d(), (C3498tn) value);
    }

    /* renamed from: g */
    public static <T extends C2406Im<T>> C2350Gm<T> m9983g() {
        return f7081a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo8220a() {
        return this.f7084d ? new C2951an(this.f7082b.mo8638e().iterator()) : this.f7082b.mo8638e().iterator();
    }

    /* renamed from: a */
    public final void mo8221a(C2350Gm<FieldDescriptorType> gm) {
        for (int i = 0; i < gm.f7082b.mo8634c(); i++) {
            m9981b(gm.f7082b.mo8632b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : gm.f7082b.mo8637d()) {
            m9981b(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo8222b() {
        return this.f7082b.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo8223c() {
        return this.f7083c;
    }

    public final /* synthetic */ Object clone() {
        C2350Gm gm = new C2350Gm();
        for (int i = 0; i < this.f7082b.mo8634c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f7082b.mo8632b(i);
            gm.m9976a((C2406Im) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f7082b.mo8637d()) {
            gm.m9976a((C2406Im) next.getKey(), next.getValue());
        }
        gm.f7084d = this.f7084d;
        return gm;
    }

    /* renamed from: d */
    public final boolean mo8225d() {
        for (int i = 0; i < this.f7082b.mo8634c(); i++) {
            if (!m9978a(this.f7082b.mo8632b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f7082b.mo8637d()) {
            if (!m9978a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo8226e() {
        return this.f7084d ? new C2951an(this.f7082b.entrySet().iterator()) : this.f7082b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2350Gm)) {
            return false;
        }
        return this.f7082b.equals(((C2350Gm) obj).f7082b);
    }

    /* renamed from: f */
    public final void mo8228f() {
        if (!this.f7083c) {
            this.f7082b.mo8633b();
            this.f7083c = true;
        }
    }

    /* renamed from: h */
    public final int mo8229h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7082b.mo8634c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> b = this.f7082b.mo8632b(i2);
            i += m9979b((C2406Im<?>) (C2406Im) b.getKey(), b.getValue());
        }
        for (Map.Entry next : this.f7082b.mo8637d()) {
            i += m9979b((C2406Im<?>) (C2406Im) next.getKey(), next.getValue());
        }
        return i;
    }

    public final int hashCode() {
        return this.f7082b.hashCode();
    }

    /* renamed from: i */
    public final int mo8231i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7082b.mo8634c(); i2++) {
            i += m9982c(this.f7082b.mo8632b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> c : this.f7082b.mo8637d()) {
            i += m9982c(c);
        }
        return i;
    }
}
