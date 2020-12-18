package p284in.srain.cube.views.ptr.p285a;

import android.graphics.PointF;

/* renamed from: in.srain.cube.views.ptr.a.a */
public class C6779a {

    /* renamed from: a */
    protected int f18822a = 0;

    /* renamed from: b */
    private PointF f18823b = new PointF();

    /* renamed from: c */
    private float f18824c;

    /* renamed from: d */
    private float f18825d;

    /* renamed from: e */
    private int f18826e = 0;

    /* renamed from: f */
    private int f18827f = 0;

    /* renamed from: g */
    private int f18828g;

    /* renamed from: h */
    private int f18829h = 0;

    /* renamed from: i */
    private float f18830i = 1.2f;

    /* renamed from: j */
    private float f18831j = 1.7f;

    /* renamed from: k */
    private boolean f18832k = false;

    /* renamed from: l */
    private int f18833l = -1;

    /* renamed from: m */
    private int f18834m = 0;

    /* renamed from: a */
    public void mo17308a(float f) {
        this.f18830i = f;
        this.f18822a = (int) (((float) this.f18828g) * f);
    }

    /* renamed from: a */
    public final void mo17309a(float f, float f2) {
        PointF pointF = this.f18823b;
        mo17310a(f, f2, f - pointF.x, f2 - pointF.y);
        this.f18823b.set(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17310a(float f, float f2, float f3, float f4) {
        mo17320c(f3, f4 / this.f18831j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17311a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo17312a(C6779a aVar) {
        this.f18826e = aVar.f18826e;
        this.f18827f = aVar.f18827f;
        this.f18828g = aVar.f18828g;
    }

    /* renamed from: a */
    public boolean mo17313a() {
        return this.f18827f < mo17324e() && this.f18826e >= mo17324e();
    }

    /* renamed from: a */
    public boolean mo17314a(int i) {
        return this.f18826e == i;
    }

    /* renamed from: b */
    public int mo17315b() {
        return this.f18826e;
    }

    /* renamed from: b */
    public void mo17316b(float f) {
        this.f18831j = f;
    }

    /* renamed from: b */
    public void mo17317b(float f, float f2) {
        this.f18832k = true;
        this.f18829h = this.f18826e;
        this.f18823b.set(f, f2);
    }

    /* renamed from: b */
    public final void mo17318b(int i) {
        this.f18827f = this.f18826e;
        this.f18826e = i;
        mo17311a(i, this.f18827f);
    }

    /* renamed from: c */
    public int mo17319c() {
        return this.f18827f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17320c(float f, float f2) {
        this.f18824c = f;
        this.f18825d = f2;
    }

    /* renamed from: c */
    public void mo17321c(int i) {
        this.f18828g = i;
        mo17343v();
    }

    /* renamed from: d */
    public int mo17322d() {
        int i = this.f18833l;
        return i >= 0 ? i : this.f18828g;
    }

    /* renamed from: d */
    public void mo17323d(int i) {
        this.f18833l = i;
    }

    /* renamed from: e */
    public int mo17324e() {
        return this.f18822a;
    }

    /* renamed from: e */
    public void mo17325e(int i) {
        this.f18830i = (((float) this.f18828g) * 1.0f) / ((float) i);
        this.f18822a = i;
    }

    /* renamed from: f */
    public float mo17326f() {
        return this.f18824c;
    }

    /* renamed from: f */
    public boolean mo17327f(int i) {
        return i < 0;
    }

    /* renamed from: g */
    public float mo17328g() {
        return this.f18825d;
    }

    /* renamed from: h */
    public float mo17329h() {
        return this.f18830i;
    }

    /* renamed from: i */
    public float mo17330i() {
        return this.f18831j;
    }

    /* renamed from: j */
    public boolean mo17331j() {
        return this.f18826e >= this.f18834m;
    }

    /* renamed from: k */
    public boolean mo17332k() {
        return this.f18827f != 0 && mo17337p();
    }

    /* renamed from: l */
    public boolean mo17333l() {
        return this.f18827f == 0 && mo17335n();
    }

    /* renamed from: m */
    public boolean mo17334m() {
        int i = this.f18827f;
        int i2 = this.f18828g;
        return i < i2 && this.f18826e >= i2;
    }

    /* renamed from: n */
    public boolean mo17335n() {
        return this.f18826e > 0;
    }

    /* renamed from: o */
    public boolean mo17336o() {
        return this.f18826e != this.f18829h;
    }

    /* renamed from: p */
    public boolean mo17337p() {
        return this.f18826e == 0;
    }

    /* renamed from: q */
    public boolean mo17338q() {
        return this.f18826e > mo17322d();
    }

    /* renamed from: r */
    public boolean mo17339r() {
        return this.f18826e >= mo17324e();
    }

    /* renamed from: s */
    public boolean mo17340s() {
        return this.f18832k;
    }

    /* renamed from: t */
    public void mo17341t() {
        this.f18832k = false;
    }

    /* renamed from: u */
    public void mo17342u() {
        this.f18834m = this.f18826e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo17343v() {
        this.f18822a = (int) (this.f18830i * ((float) this.f18828g));
    }
}
