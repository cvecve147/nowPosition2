package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
final class C3844g implements Cloneable {

    /* renamed from: a */
    private C3836e<?, ?> f11458a;

    /* renamed from: b */
    private Object f11459b;

    /* renamed from: c */
    private List<C3864l> f11460c = new ArrayList();

    C3844g() {
    }

    /* renamed from: e */
    private final byte[] m15451e() {
        byte[] bArr = new byte[mo10734d()];
        mo10731a(C3824b.m15343a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C3844g clone() {
        Object clone;
        C3844g gVar = new C3844g();
        try {
            gVar.f11458a = this.f11458a;
            if (this.f11460c == null) {
                gVar.f11460c = null;
            } else {
                gVar.f11460c.addAll(this.f11460c);
            }
            if (this.f11459b != null) {
                if (this.f11459b instanceof C3856j) {
                    clone = (C3856j) ((C3856j) this.f11459b).clone();
                } else if (this.f11459b instanceof byte[]) {
                    clone = ((byte[]) this.f11459b).clone();
                } else {
                    int i = 0;
                    if (this.f11459b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f11459b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        gVar.f11459b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f11459b instanceof boolean[]) {
                        clone = ((boolean[]) this.f11459b).clone();
                    } else if (this.f11459b instanceof int[]) {
                        clone = ((int[]) this.f11459b).clone();
                    } else if (this.f11459b instanceof long[]) {
                        clone = ((long[]) this.f11459b).clone();
                    } else if (this.f11459b instanceof float[]) {
                        clone = ((float[]) this.f11459b).clone();
                    } else if (this.f11459b instanceof double[]) {
                        clone = ((double[]) this.f11459b).clone();
                    } else if (this.f11459b instanceof C3856j[]) {
                        C3856j[] jVarArr = (C3856j[]) this.f11459b;
                        C3856j[] jVarArr2 = new C3856j[jVarArr.length];
                        gVar.f11459b = jVarArr2;
                        while (i < jVarArr.length) {
                            jVarArr2[i] = (C3856j) jVarArr[i].clone();
                            i++;
                        }
                    }
                }
                gVar.f11459b = clone;
            }
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10731a(C3824b bVar) {
        Object obj = this.f11459b;
        if (obj != null) {
            C3836e<?, ?> eVar = this.f11458a;
            if (eVar.f11416b) {
                int length = Array.getLength(obj);
                int i = 0;
                while (i < length) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 == null) {
                        i++;
                    } else {
                        eVar.mo10689a(obj2, bVar);
                        throw null;
                    }
                }
                return;
            }
            eVar.mo10689a(obj, bVar);
            throw null;
        }
        for (C3864l next : this.f11460c) {
            bVar.mo10673c(next.f11525a);
            bVar.mo10672b(next.f11526b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10732a(C3864l lVar) {
        List<C3864l> list = this.f11460c;
        if (list != null) {
            list.add(lVar);
            return;
        }
        Object obj = this.f11459b;
        if (obj instanceof C3856j) {
            byte[] bArr = lVar.f11526b;
            C3820a a = C3820a.m15286a(bArr, 0, bArr.length);
            int e = a.mo10649e();
            if (e == bArr.length - C3824b.m15339a(e)) {
                C3856j a2 = ((C3856j) this.f11459b).mo10404a(a);
                this.f11458a = this.f11458a;
                this.f11459b = a2;
                this.f11460c = null;
                return;
            }
            throw C3852i.m15481a();
        } else if (obj instanceof C3856j[]) {
            this.f11458a.mo10688a((List<C3864l>) Collections.singletonList(lVar));
            throw null;
        } else {
            this.f11458a.mo10688a((List<C3864l>) Collections.singletonList(lVar));
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo10734d() {
        Object obj = this.f11459b;
        if (obj != null) {
            C3836e<?, ?> eVar = this.f11458a;
            if (eVar.f11416b) {
                int length = Array.getLength(obj);
                int i = 0;
                while (i < length) {
                    if (Array.get(obj, i) == null) {
                        i++;
                    } else {
                        eVar.mo10687a(Array.get(obj, i));
                        throw null;
                    }
                }
                return 0;
            }
            eVar.mo10687a(obj);
            throw null;
        }
        int i2 = 0;
        for (C3864l next : this.f11460c) {
            i2 += C3824b.m15352d(next.f11525a) + 0 + next.f11526b.length;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        List<C3864l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3844g)) {
            return false;
        }
        C3844g gVar = (C3844g) obj;
        if (this.f11459b == null || gVar.f11459b == null) {
            List<C3864l> list2 = this.f11460c;
            if (list2 != null && (list = gVar.f11460c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m15451e(), gVar.m15451e());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C3836e<?, ?> eVar = this.f11458a;
            if (eVar != gVar.f11458a) {
                return false;
            }
            if (!eVar.f11415a.isArray()) {
                return this.f11459b.equals(gVar.f11459b);
            }
            Object obj2 = this.f11459b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) gVar.f11459b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) gVar.f11459b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) gVar.f11459b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) gVar.f11459b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) gVar.f11459b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) gVar.f11459b) : Arrays.deepEquals((Object[]) obj2, (Object[]) gVar.f11459b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m15451e()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
