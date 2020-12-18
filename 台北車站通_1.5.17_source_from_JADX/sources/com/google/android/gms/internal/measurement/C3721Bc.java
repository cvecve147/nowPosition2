package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Bc */
public final class C3721Bc extends C3832d<C3721Bc> {

    /* renamed from: c */
    public C3725Cc[] f11023c = C3725Cc.m14907e();

    public C3721Bc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        C3725Cc[] ccArr = this.f11023c;
        if (ccArr != null && ccArr.length > 0) {
            int i = 0;
            while (true) {
                C3725Cc[] ccArr2 = this.f11023c;
                if (i >= ccArr2.length) {
                    break;
                }
                C3725Cc cc = ccArr2[i];
                if (cc != null) {
                    a += C3824b.m15348b(1, (C3856j) cc);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                int a = C3868m.m15505a(aVar, 10);
                C3725Cc[] ccArr = this.f11023c;
                int length = ccArr == null ? 0 : ccArr.length;
                C3725Cc[] ccArr2 = new C3725Cc[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11023c, 0, ccArr2, 0, length);
                }
                while (length < ccArr2.length - 1) {
                    ccArr2[length] = new C3725Cc();
                    aVar.mo10640a((C3856j) ccArr2[length]);
                    aVar.mo10645c();
                    length++;
                }
                ccArr2[length] = new C3725Cc();
                aVar.mo10640a((C3856j) ccArr2[length]);
                this.f11023c = ccArr2;
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        C3725Cc[] ccArr = this.f11023c;
        if (ccArr != null && ccArr.length > 0) {
            int i = 0;
            while (true) {
                C3725Cc[] ccArr2 = this.f11023c;
                if (i >= ccArr2.length) {
                    break;
                }
                C3725Cc cc = ccArr2[i];
                if (cc != null) {
                    bVar.mo10667a(1, (C3856j) cc);
                }
                i++;
            }
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3721Bc)) {
            return false;
        }
        C3721Bc bc = (C3721Bc) obj;
        if (!C3848h.m15461a((Object[]) this.f11023c, (Object[]) bc.f11023c)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(bc.f11405b);
        }
        C3840f fVar2 = bc.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (((C3721Bc.class.getName().hashCode() + 527) * 31) + C3848h.m15458a((Object[]) this.f11023c)) * 31;
        C3840f fVar = this.f11405b;
        return hashCode + ((fVar == null || fVar.mo10723d()) ? 0 : this.f11405b.hashCode());
    }
}
