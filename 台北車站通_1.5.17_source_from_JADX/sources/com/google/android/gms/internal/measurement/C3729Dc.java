package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Dc */
public final class C3729Dc extends C3832d<C3729Dc> {

    /* renamed from: c */
    public long[] f11075c;

    /* renamed from: d */
    public long[] f11076d;

    public C3729Dc() {
        long[] jArr = C3868m.f11540b;
        this.f11075c = jArr;
        this.f11076d = jArr;
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        long[] jArr;
        int a = super.mo10403a();
        long[] jArr2 = this.f11075c;
        int i = 0;
        if (jArr2 != null && jArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr = this.f11075c;
                if (i2 >= jArr.length) {
                    break;
                }
                i3 += C3824b.m15340a(jArr[i2]);
                i2++;
            }
            a = a + i3 + (jArr.length * 1);
        }
        long[] jArr3 = this.f11076d;
        if (jArr3 == null || jArr3.length <= 0) {
            return a;
        }
        int i4 = 0;
        while (true) {
            long[] jArr4 = this.f11076d;
            if (i >= jArr4.length) {
                return a + i4 + (jArr4.length * 1);
            }
            i4 += C3824b.m15340a(jArr4[i]);
            i++;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        int i;
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c != 8) {
                if (c == 10) {
                    i = aVar.mo10639a(aVar.mo10649e());
                    int a = aVar.mo10638a();
                    int i2 = 0;
                    while (aVar.mo10654i() > 0) {
                        aVar.mo10651f();
                        i2++;
                    }
                    aVar.mo10650e(a);
                    long[] jArr = this.f11075c;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(i2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11075c, 0, jArr2, 0, length);
                    }
                    while (length < jArr2.length) {
                        jArr2[length] = aVar.mo10651f();
                        length++;
                    }
                    this.f11075c = jArr2;
                } else if (c == 16) {
                    int a2 = C3868m.m15505a(aVar, 16);
                    long[] jArr3 = this.f11076d;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(a2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f11076d, 0, jArr4, 0, length2);
                    }
                    while (length2 < jArr4.length - 1) {
                        jArr4[length2] = aVar.mo10651f();
                        aVar.mo10645c();
                        length2++;
                    }
                    jArr4[length2] = aVar.mo10651f();
                    this.f11076d = jArr4;
                } else if (c == 18) {
                    i = aVar.mo10639a(aVar.mo10649e());
                    int a3 = aVar.mo10638a();
                    int i3 = 0;
                    while (aVar.mo10654i() > 0) {
                        aVar.mo10651f();
                        i3++;
                    }
                    aVar.mo10650e(a3);
                    long[] jArr5 = this.f11076d;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    long[] jArr6 = new long[(i3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f11076d, 0, jArr6, 0, length3);
                    }
                    while (length3 < jArr6.length) {
                        jArr6[length3] = aVar.mo10651f();
                        length3++;
                    }
                    this.f11076d = jArr6;
                } else if (!super.mo10679a(aVar, c)) {
                    return this;
                }
                aVar.mo10647d(i);
            } else {
                int a4 = C3868m.m15505a(aVar, 8);
                long[] jArr7 = this.f11075c;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                long[] jArr8 = new long[(a4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f11075c, 0, jArr8, 0, length4);
                }
                while (length4 < jArr8.length - 1) {
                    jArr8[length4] = aVar.mo10651f();
                    aVar.mo10645c();
                    length4++;
                }
                jArr8[length4] = aVar.mo10651f();
                this.f11075c = jArr8;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        long[] jArr = this.f11075c;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.f11075c;
                if (i2 >= jArr2.length) {
                    break;
                }
                bVar.mo10666a(1, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.f11076d;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f11076d;
                if (i >= jArr4.length) {
                    break;
                }
                bVar.mo10666a(2, jArr4[i]);
                i++;
            }
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3729Dc)) {
            return false;
        }
        C3729Dc dc = (C3729Dc) obj;
        if (!C3848h.m15460a(this.f11075c, dc.f11075c) || !C3848h.m15460a(this.f11076d, dc.f11076d)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(dc.f11405b);
        }
        C3840f fVar2 = dc.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (((((C3729Dc.class.getName().hashCode() + 527) * 31) + C3848h.m15457a(this.f11075c)) * 31) + C3848h.m15457a(this.f11076d)) * 31;
        C3840f fVar = this.f11405b;
        return hashCode + ((fVar == null || fVar.mo10723d()) ? 0 : this.f11405b.hashCode());
    }
}
