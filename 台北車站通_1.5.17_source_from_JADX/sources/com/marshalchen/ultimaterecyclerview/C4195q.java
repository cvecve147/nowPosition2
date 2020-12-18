package com.marshalchen.ultimaterecyclerview;

import android.os.Handler;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.RecyclerView.C0778w;
import android.view.View;
import android.view.ViewGroup;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.marshalchen.ultimaterecyclerview.p078a.C4163a;
import com.marshalchen.ultimaterecyclerview.p081d.C4170a;

/* renamed from: com.marshalchen.ultimaterecyclerview.q */
public abstract class C4195q<VH extends RecyclerView.C0778w> extends RecyclerView.C0748a<VH> implements C4170a<RecyclerView.C0778w>, C4163a {

    /* renamed from: c */
    protected Handler f12484c = new Handler();

    /* renamed from: d */
    protected UltimateRecyclerView.C4158a f12485d = null;

    /* renamed from: e */
    protected View f12486e = null;

    /* renamed from: f */
    protected View f12487f = null;

    /* renamed from: g */
    private boolean f12488g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12489h = 0;

    /* renamed from: i */
    public boolean f12490i = false;

    /* renamed from: j */
    protected int f12491j;

    /* renamed from: k */
    protected int f12492k;

    /* renamed from: l */
    protected final Object f12493l = new Object();

    /* renamed from: m */
    public C4195q<VH>.b f12494m;

    /* renamed from: n */
    protected C4196a f12495n = null;

    /* renamed from: com.marshalchen.ultimaterecyclerview.q$a */
    public interface C4196a {
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.q$b */
    private class C4197b implements Runnable {

        /* renamed from: a */
        private boolean f12496a;

        public C4197b(boolean z) {
            this.f12496a = z;
        }

        public void run() {
            if (!this.f12496a && C4195q.this.f12489h > 0) {
                C4195q qVar = C4195q.this;
                if (qVar.f12486e != null) {
                    int a = qVar.mo337a();
                    if (C4195q.this.mo11799e() > 0) {
                        C4195q qVar2 = C4195q.this;
                        if (qVar2.f12487f != null) {
                            qVar2.mo3802d(a - 1);
                        }
                    }
                    C4195q qVar3 = C4195q.this;
                    qVar3.mo11865d(qVar3.mo11799e(), C4195q.this.mo337a());
                }
            }
            C4195q qVar4 = C4195q.this;
            boolean z = this.f12496a;
            qVar4.f12490i = z;
            if (z && qVar4.f12486e == null) {
                qVar4.f12490i = false;
            }
            if (this.f12496a) {
                C4195q.this.mo11876k();
            }
        }
    }

    /* renamed from: a */
    public int mo337a() {
        return mo11799e() + mo11877l();
    }

    /* renamed from: a */
    public VH mo11859a(View view) {
        return null;
    }

    /* renamed from: a */
    public abstract VH mo11794a(ViewGroup viewGroup);

    /* renamed from: a */
    public void mo11860a(UltimateRecyclerView.C4158a aVar) {
        this.f12485d = aVar;
        this.f12488g = true;
    }

    /* renamed from: a */
    public final void mo11861a(boolean z) {
        this.f12494m = new C4197b(z);
    }

    /* renamed from: b */
    public int mo344b(int i) {
        if (mo11799e() != 0) {
            if (mo11799e() > 0) {
                if (i == mo337a() - 1 && mo11864d()) {
                    return 2;
                }
                if (i != 0 || !mo11873h()) {
                    return (!mo11869f(i) && !mo11866e(i)) ? 0 : 4;
                }
                return 1;
            }
        } else if (i != 0) {
            if (i == 1) {
                if (mo11864d() && mo11873h()) {
                    return 2;
                }
                if ((mo11864d() || !mo11873h()) && mo11864d() && !mo11873h()) {
                }
            }
            return 3;
        } else if (mo11864d() && mo11873h()) {
            return 2;
        } else {
            if (mo11864d() || !mo11873h()) {
                return (!mo11864d() || mo11873h()) ? 3 : 2;
            }
            return 1;
        }
    }

    /* renamed from: b */
    public VH mo11862b(View view) {
        return null;
    }

    /* renamed from: b */
    public VH mo345b(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return i == 1 ? mo11800e((View) this.f12485d) : i == 4 ? mo11859a((View) this.f12485d) : i == 5 ? mo11863c(this.f12485d) : i == 3 ? mo11862b((View) this.f12485d) : mo11794a(viewGroup);
        }
        VH d = mo11797d(this.f12486e);
        this.f12487f = d.f3093b;
        if (mo11799e() == 0) {
            mo11875j();
        }
        if (this.f12490i && mo11799e() > 0) {
            mo11876k();
        }
        return d;
    }

    /* renamed from: b */
    public void mo3796b(RecyclerView recyclerView) {
        super.mo3796b(recyclerView);
        this.f12484c.removeCallbacks(this.f12494m);
    }

    /* renamed from: c */
    public VH mo11863c(View view) {
        return null;
    }

    /* renamed from: d */
    public abstract VH mo11797d(View view);

    /* renamed from: d */
    public final boolean mo11864d() {
        return this.f12490i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo11865d(int i, int i2) {
        if (i == 0) {
            if (i2 == 2) {
                int i3 = this.f12491j;
                if (i3 != UltimateRecyclerView.f12351d && (i3 == UltimateRecyclerView.f12350c || i3 == UltimateRecyclerView.f12348a)) {
                    mo11875j();
                }
            } else if (i2 == 1) {
                int i4 = this.f12491j;
                if (i4 != UltimateRecyclerView.f12351d && (i4 == UltimateRecyclerView.f12350c || i4 == UltimateRecyclerView.f12348a)) {
                    mo11875j();
                }
                return true;
            } else if (i2 == 0) {
                int i5 = this.f12491j;
                if (i5 == UltimateRecyclerView.f12351d || i5 == UltimateRecyclerView.f12350c || i5 == UltimateRecyclerView.f12349b) {
                    mo3798c();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract int mo11799e();

    /* renamed from: e */
    public abstract VH mo11800e(View view);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo11866e(int i) {
        return false;
    }

    /* renamed from: f */
    public final View mo11867f() {
        return this.f12486e;
    }

    /* renamed from: f */
    public final void mo11868f(View view) {
        this.f12486e = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo11869f(int i) {
        return false;
    }

    /* renamed from: g */
    public final int mo11870g() {
        return this.f12491j;
    }

    /* renamed from: g */
    public final void mo11871g(int i) {
        this.f12492k = i;
    }

    /* renamed from: h */
    public final void mo11872h(int i) {
        this.f12491j = i;
    }

    /* renamed from: h */
    public boolean mo11873h() {
        return this.f12488g;
    }

    /* renamed from: i */
    public final void mo11874i() {
        C4195q<VH>.b bVar = this.f12494m;
        if (bVar != null) {
            this.f12484c.post(bVar);
            this.f12489h++;
            this.f12494m = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo11875j() {
        View view = this.f12487f;
        if (view != null && view.getVisibility() != 8) {
            this.f12487f.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo11876k() {
        View view = this.f12487f;
        if (view != null && view.getVisibility() != 0) {
            this.f12487f.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo11877l() {
        int i = mo11873h() ? 1 : 0;
        return mo11864d() ? i + 1 : i;
    }
}
