package p101d.p111d.p112a.p114b;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import p101d.p111d.p112a.C5220b;
import p101d.p111d.p112a.C5242d;
import p101d.p111d.p112a.C5246f;
import p101d.p111d.p112a.p116c.C5240b;
import p101d.p111d.p112a.p116c.C5241c;
import p101d.p111d.p112a.p117d.p118a.C5243a;

/* renamed from: d.d.a.b.b */
public class C5231b {

    /* renamed from: a */
    private static final RectF f14761a = new RectF();

    /* renamed from: b */
    private static final Point f14762b = new Point();

    /* renamed from: c */
    private final float f14763c;

    /* renamed from: d */
    private final C5220b f14764d;

    /* renamed from: e */
    private final C5243a f14765e;

    /* renamed from: f */
    private float f14766f = 1.0f;

    /* renamed from: g */
    private boolean f14767g;

    /* renamed from: h */
    private boolean f14768h;

    /* renamed from: i */
    private boolean f14769i;

    /* renamed from: j */
    private boolean f14770j;

    /* renamed from: k */
    private boolean f14771k;

    /* renamed from: l */
    private float f14772l;

    /* renamed from: m */
    private float f14773m = 1.0f;

    /* renamed from: n */
    private float f14774n;

    /* renamed from: o */
    private float f14775o;

    /* renamed from: p */
    private float f14776p;

    public C5231b(View view, C5220b bVar) {
        this.f14764d = bVar;
        this.f14765e = view instanceof C5243a ? (C5243a) view : null;
        this.f14763c = C5235f.m20219a(view.getContext(), 30.0f);
    }

    /* renamed from: c */
    private boolean m20194c(float f) {
        if (!this.f14764d.mo14421b().mo14544y()) {
            return true;
        }
        C5246f c = this.f14764d.mo14428c();
        this.f14764d.mo14432d().mo14566a(c, f14761a);
        if (f <= 0.0f || ((float) C5246f.m20299a(c.mo14557d(), f14761a.bottom)) >= 0.0f) {
            return f < 0.0f && ((float) C5246f.m20299a(c.mo14557d(), f14761a.top)) > 0.0f;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m20195i() {
        C5243a aVar;
        if (!this.f14764d.mo14421b().mo14540u() || (aVar = this.f14765e) == null) {
            return false;
        }
        aVar.mo14510a().mo14411b();
        throw null;
    }

    /* renamed from: j */
    private void m20196j() {
        if (mo14479a()) {
            C5220b bVar = this.f14764d;
            if (bVar instanceof C5242d) {
                ((C5242d) bVar).mo14509c(false);
            }
            this.f14764d.mo14421b().mo14518b();
            this.f14765e.mo14510a().mo14410a();
            throw null;
        }
        this.f14770j = false;
        this.f14771k = false;
        this.f14766f = 1.0f;
        this.f14774n = 0.0f;
        this.f14772l = 0.0f;
        this.f14773m = 1.0f;
    }

    /* renamed from: k */
    private boolean m20197k() {
        C5246f c = this.f14764d.mo14428c();
        return C5246f.m20299a(c.mo14560e(), this.f14764d.mo14432d().mo14564a(c)) <= 0;
    }

    /* renamed from: l */
    private void m20198l() {
        this.f14764d.mo14421b().mo14513a();
        C5220b bVar = this.f14764d;
        if (bVar instanceof C5242d) {
            ((C5242d) bVar).mo14509c(true);
        }
    }

    /* renamed from: m */
    private void m20199m() {
        this.f14765e.mo14510a().mo14409a(this.f14764d.mo14428c(), this.f14766f);
        throw null;
    }

    /* renamed from: a */
    public boolean mo14479a() {
        return this.f14770j || this.f14771k;
    }

    /* renamed from: a */
    public boolean mo14480a(float f) {
        if (!m20197k()) {
            this.f14769i = true;
        }
        if (!this.f14769i && !mo14479a() && m20195i() && !this.f14768h && m20197k() && f < 1.0f) {
            this.f14773m *= f;
            if (this.f14773m < 0.75f) {
                this.f14771k = true;
                this.f14776p = this.f14764d.mo14428c().mo14560e();
                m20198l();
            }
        }
        if (!this.f14771k) {
            return mo14479a();
        }
        this.f14766f = (this.f14764d.mo14428c().mo14560e() * f) / this.f14776p;
        this.f14766f = C5241c.m20241b(this.f14766f, 0.01f, 1.0f);
        C5240b.m20235a(this.f14764d.mo14421b(), f14762b);
        if (this.f14766f == 1.0f) {
            C5246f c = this.f14764d.mo14428c();
            float f2 = this.f14776p;
            Point point = f14762b;
            c.mo14559d(f2, (float) point.x, (float) point.y);
        } else {
            C5246f c2 = this.f14764d.mo14428c();
            Point point2 = f14762b;
            c2.mo14556c(((f - 1.0f) * 0.75f) + 1.0f, (float) point2.x, (float) point2.y);
        }
        m20199m();
        throw null;
    }

    /* renamed from: b */
    public boolean mo14481b() {
        return mo14479a();
    }

    /* renamed from: b */
    public boolean mo14482b(float f) {
        if (!mo14479a() && m20195i() && !this.f14767g && !this.f14768h && m20197k() && !m20194c(f)) {
            this.f14772l += f;
            if (Math.abs(this.f14772l) > this.f14763c) {
                this.f14770j = true;
                this.f14775o = this.f14764d.mo14428c().mo14557d();
                m20198l();
            }
        }
        if (!this.f14770j) {
            return mo14479a();
        }
        if (this.f14774n == 0.0f) {
            this.f14774n = Math.signum(f);
        }
        if (this.f14766f < 0.75f && Math.signum(f) == this.f14774n) {
            f *= this.f14766f / 0.75f;
        }
        this.f14766f = 1.0f - (((this.f14764d.mo14428c().mo14557d() + f) - this.f14775o) / ((this.f14774n * 0.5f) * ((float) Math.max(this.f14764d.mo14421b().mo14530k(), this.f14764d.mo14421b().mo14529j()))));
        this.f14766f = C5241c.m20241b(this.f14766f, 0.01f, 1.0f);
        if (this.f14766f == 1.0f) {
            this.f14764d.mo14428c().mo14558d(this.f14764d.mo14428c().mo14554c(), this.f14775o);
        } else {
            this.f14764d.mo14428c().mo14555c(0.0f, f);
        }
        m20199m();
        throw null;
    }

    /* renamed from: c */
    public boolean mo14483c() {
        return mo14479a();
    }

    /* renamed from: d */
    public void mo14484d() {
        this.f14768h = true;
    }

    /* renamed from: e */
    public void mo14485e() {
        this.f14768h = false;
    }

    /* renamed from: f */
    public void mo14486f() {
        this.f14767g = true;
    }

    /* renamed from: g */
    public void mo14487g() {
        this.f14767g = false;
        this.f14769i = false;
        if (this.f14771k) {
            m20196j();
        }
    }

    /* renamed from: h */
    public void mo14488h() {
        m20196j();
    }
}
