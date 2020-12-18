package p013b.p018b.p040i.p049g;

/* renamed from: b.b.i.g.b */
public class C1126b implements C1134e {

    /* renamed from: a */
    final C1134e f4104a;

    /* renamed from: b */
    int f4105b = 0;

    /* renamed from: c */
    int f4106c = -1;

    /* renamed from: d */
    int f4107d = -1;

    /* renamed from: e */
    Object f4108e = null;

    public C1126b(C1134e eVar) {
        this.f4104a = eVar;
    }

    /* renamed from: a */
    public void mo5297a() {
        int i = this.f4105b;
        if (i != 0) {
            if (i == 1) {
                this.f4104a.mo5295b(this.f4106c, this.f4107d);
            } else if (i == 2) {
                this.f4104a.mo5296c(this.f4106c, this.f4107d);
            } else if (i == 3) {
                this.f4104a.mo5294a(this.f4106c, this.f4107d, this.f4108e);
            }
            this.f4108e = null;
            this.f4105b = 0;
        }
    }

    /* renamed from: a */
    public void mo5293a(int i, int i2) {
        mo5297a();
        this.f4104a.mo5293a(i, i2);
    }

    /* renamed from: a */
    public void mo5294a(int i, int i2, Object obj) {
        int i3;
        if (this.f4105b == 3) {
            int i4 = this.f4106c;
            int i5 = this.f4107d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4108e == obj) {
                this.f4106c = Math.min(i, i4);
                this.f4107d = Math.max(i5 + i4, i3) - this.f4106c;
                return;
            }
        }
        mo5297a();
        this.f4106c = i;
        this.f4107d = i2;
        this.f4108e = obj;
        this.f4105b = 3;
    }

    /* renamed from: b */
    public void mo5295b(int i, int i2) {
        int i3;
        if (this.f4105b == 1 && i >= (i3 = this.f4106c)) {
            int i4 = this.f4107d;
            if (i <= i3 + i4) {
                this.f4107d = i4 + i2;
                this.f4106c = Math.min(i, i3);
                return;
            }
        }
        mo5297a();
        this.f4106c = i;
        this.f4107d = i2;
        this.f4105b = 1;
    }

    /* renamed from: c */
    public void mo5296c(int i, int i2) {
        int i3;
        if (this.f4105b != 2 || (i3 = this.f4106c) < i || i3 > i + i2) {
            mo5297a();
            this.f4106c = i;
            this.f4107d = i2;
            this.f4105b = 2;
            return;
        }
        this.f4107d += i2;
        this.f4106c = i;
    }
}
