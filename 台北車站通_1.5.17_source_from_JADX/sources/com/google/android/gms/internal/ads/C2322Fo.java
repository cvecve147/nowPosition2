package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Fo */
final class C2322Fo implements Cloneable {

    /* renamed from: a */
    private C2265Do<?, ?> f7004a;

    /* renamed from: b */
    private Object f7005b;

    /* renamed from: c */
    private List<C2464Ko> f7006c = new ArrayList();

    C2322Fo() {
    }

    /* renamed from: e */
    private final byte[] m9794e() {
        byte[] bArr = new byte[mo8089d()];
        mo8086a(C2180Ao.m9369a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C2322Fo clone() {
        Object clone;
        C2322Fo fo = new C2322Fo();
        try {
            fo.f7004a = this.f7004a;
            if (this.f7006c == null) {
                fo.f7006c = null;
            } else {
                fo.f7006c.addAll(this.f7006c);
            }
            if (this.f7005b != null) {
                if (this.f7005b instanceof C2408Io) {
                    clone = (C2408Io) ((C2408Io) this.f7005b).clone();
                } else if (this.f7005b instanceof byte[]) {
                    clone = ((byte[]) this.f7005b).clone();
                } else {
                    int i = 0;
                    if (this.f7005b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f7005b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        fo.f7005b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f7005b instanceof boolean[]) {
                        clone = ((boolean[]) this.f7005b).clone();
                    } else if (this.f7005b instanceof int[]) {
                        clone = ((int[]) this.f7005b).clone();
                    } else if (this.f7005b instanceof long[]) {
                        clone = ((long[]) this.f7005b).clone();
                    } else if (this.f7005b instanceof float[]) {
                        clone = ((float[]) this.f7005b).clone();
                    } else if (this.f7005b instanceof double[]) {
                        clone = ((double[]) this.f7005b).clone();
                    } else if (this.f7005b instanceof C2408Io[]) {
                        C2408Io[] ioArr = (C2408Io[]) this.f7005b;
                        C2408Io[] ioArr2 = new C2408Io[ioArr.length];
                        fo.f7005b = ioArr2;
                        while (i < ioArr.length) {
                            ioArr2[i] = (C2408Io) ioArr[i].clone();
                            i++;
                        }
                    }
                }
                fo.f7005b = clone;
            }
            return fo;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8086a(C2180Ao ao) {
        if (this.f7005b == null) {
            for (C2464Ko next : this.f7006c) {
                ao.mo7839d(next.f7467a);
                ao.mo7838c(next.f7468b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8087a(C2464Ko ko) {
        List<C2464Ko> list = this.f7006c;
        if (list != null) {
            list.add(ko);
            return;
        }
        Object obj = this.f7005b;
        if (obj instanceof C2408Io) {
            byte[] bArr = ko.f7468b;
            C3641yo a = C3641yo.m14599a(bArr, 0, bArr.length);
            int h = a.mo10249h();
            if (h == bArr.length - C2180Ao.m9372b(h)) {
                C2408Io a2 = ((C2408Io) this.f7005b).mo7847a(a);
                this.f7004a = this.f7004a;
                this.f7005b = a2;
                this.f7006c = null;
                return;
            }
            throw C2380Ho.m10167a();
        } else if (obj instanceof C2408Io[]) {
            Collections.singletonList(ko);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(ko);
            throw new NoSuchMethodError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo8089d() {
        if (this.f7005b == null) {
            int i = 0;
            for (C2464Ko next : this.f7006c) {
                i += C2180Ao.m9379c(next.f7467a) + 0 + next.f7468b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<C2464Ko> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2322Fo)) {
            return false;
        }
        C2322Fo fo = (C2322Fo) obj;
        if (this.f7005b == null || fo.f7005b == null) {
            List<C2464Ko> list2 = this.f7006c;
            if (list2 != null && (list = fo.f7006c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m9794e(), fo.m9794e());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C2265Do<?, ?> doR = this.f7004a;
            if (doR != fo.f7004a) {
                return false;
            }
            if (!doR.f6906a.isArray()) {
                return this.f7005b.equals(fo.f7005b);
            }
            Object obj2 = this.f7005b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) fo.f7005b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) fo.f7005b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) fo.f7005b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) fo.f7005b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) fo.f7005b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fo.f7005b) : Arrays.deepEquals((Object[]) obj2, (Object[]) fo.f7005b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m9794e()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
