package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hm */
public abstract class C3150hm implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final C3150hm f9434a = new C3354om(C2641Qm.f8147c);

    /* renamed from: b */
    private static final C3269lm f9435b = (C3007cm.m12090a() ? new C3383pm((C3178im) null) : new C3208jm((C3178im) null));

    /* renamed from: c */
    private int f9436c = 0;

    C3150hm() {
    }

    /* renamed from: a */
    public static C3150hm m12536a(String str) {
        return new C3354om(str.getBytes(C2641Qm.f8145a));
    }

    /* renamed from: a */
    public static C3150hm m12537a(byte[] bArr) {
        return m12538a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C3150hm m12538a(byte[] bArr, int i, int i2) {
        return new C3354om(f9435b.mo9596a(bArr, i, i2));
    }

    /* renamed from: b */
    static int m12539b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: b */
    static C3150hm m12540b(byte[] bArr) {
        return new C3354om(bArr);
    }

    /* renamed from: d */
    static C3297mm m12541d(int i) {
        return new C3297mm(i, (C3178im) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9500a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C3150hm mo9501a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo9502a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo9503a(C3122gm gmVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9504a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: a */
    public final byte[] mo9505a() {
        int size = size();
        if (size == 0) {
            return C2641Qm.f8147c;
        }
        byte[] bArr = new byte[size];
        mo9504a(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: b */
    public final String mo9506b() {
        return size() == 0 ? "" : mo9502a(C2641Qm.f8145a);
    }

    /* renamed from: c */
    public abstract byte mo9507c(int i);

    /* renamed from: c */
    public abstract boolean mo9508c();

    /* renamed from: d */
    public abstract C3411qm mo9509d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo9510e() {
        return this.f9436c;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f9436c;
        if (i == 0) {
            int size = size();
            i = mo9500a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f9436c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C3178im(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
