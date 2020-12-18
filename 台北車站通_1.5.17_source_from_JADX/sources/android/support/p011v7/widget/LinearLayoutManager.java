package android.support.p011v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.p012a.C0813a;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends RecyclerView.C0759i implements C0813a, RecyclerView.C0772s.C0774b {

    /* renamed from: A */
    int f2825A;

    /* renamed from: B */
    int f2826B;

    /* renamed from: C */
    private boolean f2827C;

    /* renamed from: D */
    SavedState f2828D;

    /* renamed from: E */
    final C0730a f2829E;

    /* renamed from: F */
    private final C0731b f2830F;

    /* renamed from: G */
    private int f2831G;

    /* renamed from: s */
    int f2832s;

    /* renamed from: t */
    private C0732c f2833t;

    /* renamed from: u */
    C0687Aa f2834u;

    /* renamed from: v */
    private boolean f2835v;

    /* renamed from: w */
    private boolean f2836w;

    /* renamed from: x */
    boolean f2837x;

    /* renamed from: y */
    private boolean f2838y;

    /* renamed from: z */
    private boolean f2839z;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0883ra();

        /* renamed from: a */
        int f2840a;

        /* renamed from: b */
        int f2841b;

        /* renamed from: c */
        boolean f2842c;

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2840a = parcel.readInt();
            this.f2841b = parcel.readInt();
            this.f2842c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f2840a = savedState.f2840a;
            this.f2841b = savedState.f2841b;
            this.f2842c = savedState.f2842c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3526a() {
            return this.f2840a >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3527b() {
            this.f2840a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2840a);
            parcel.writeInt(this.f2841b);
            parcel.writeInt(this.f2842c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C0730a {

        /* renamed from: a */
        C0687Aa f2843a;

        /* renamed from: b */
        int f2844b;

        /* renamed from: c */
        int f2845c;

        /* renamed from: d */
        boolean f2846d;

        /* renamed from: e */
        boolean f2847e;

        C0730a() {
            mo3533b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3530a() {
            this.f2845c = this.f2846d ? this.f2843a.mo3076b() : this.f2843a.mo3084f();
        }

        /* renamed from: a */
        public void mo3531a(View view, int i) {
            this.f2845c = this.f2846d ? this.f2843a.mo3074a(view) + this.f2843a.mo3087h() : this.f2843a.mo3081d(view);
            this.f2844b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3532a(View view, RecyclerView.C0775t tVar) {
            RecyclerView.C0762j jVar = (RecyclerView.C0762j) view.getLayoutParams();
            return !jVar.mo3942c() && jVar.mo3940a() >= 0 && jVar.mo3940a() < tVar.mo4011a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3533b() {
            this.f2844b = -1;
            this.f2845c = Integer.MIN_VALUE;
            this.f2846d = false;
            this.f2847e = false;
        }

        /* renamed from: b */
        public void mo3534b(View view, int i) {
            int h = this.f2843a.mo3087h();
            if (h >= 0) {
                mo3531a(view, i);
                return;
            }
            this.f2844b = i;
            if (this.f2846d) {
                int b = (this.f2843a.mo3076b() - h) - this.f2843a.mo3074a(view);
                this.f2845c = this.f2843a.mo3076b() - b;
                if (b > 0) {
                    int b2 = this.f2845c - this.f2843a.mo3077b(view);
                    int f = this.f2843a.mo3084f();
                    int min = b2 - (f + Math.min(this.f2843a.mo3081d(view) - f, 0));
                    if (min < 0) {
                        this.f2845c += Math.min(b, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d = this.f2843a.mo3081d(view);
            int f2 = d - this.f2843a.mo3084f();
            this.f2845c = d;
            if (f2 > 0) {
                int b3 = (this.f2843a.mo3076b() - Math.min(0, (this.f2843a.mo3076b() - h) - this.f2843a.mo3074a(view))) - (d + this.f2843a.mo3077b(view));
                if (b3 < 0) {
                    this.f2845c -= Math.min(f2, -b3);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2844b + ", mCoordinate=" + this.f2845c + ", mLayoutFromEnd=" + this.f2846d + ", mValid=" + this.f2847e + '}';
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0731b {

        /* renamed from: a */
        public int f2848a;

        /* renamed from: b */
        public boolean f2849b;

        /* renamed from: c */
        public boolean f2850c;

        /* renamed from: d */
        public boolean f2851d;

        protected C0731b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3536a() {
            this.f2848a = 0;
            this.f2849b = false;
            this.f2850c = false;
            this.f2851d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0732c {

        /* renamed from: a */
        boolean f2852a = true;

        /* renamed from: b */
        int f2853b;

        /* renamed from: c */
        int f2854c;

        /* renamed from: d */
        int f2855d;

        /* renamed from: e */
        int f2856e;

        /* renamed from: f */
        int f2857f;

        /* renamed from: g */
        int f2858g;

        /* renamed from: h */
        int f2859h = 0;

        /* renamed from: i */
        boolean f2860i = false;

        /* renamed from: j */
        int f2861j;

        /* renamed from: k */
        List<RecyclerView.C0778w> f2862k = null;

        /* renamed from: l */
        boolean f2863l;

        C0732c() {
        }

        /* renamed from: b */
        private View m3799b() {
            int size = this.f2862k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2862k.get(i).f3093b;
                RecyclerView.C0762j jVar = (RecyclerView.C0762j) view.getLayoutParams();
                if (!jVar.mo3942c() && this.f2855d == jVar.mo3940a()) {
                    mo3539a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo3537a(RecyclerView.C0769p pVar) {
            if (this.f2862k != null) {
                return m3799b();
            }
            View d = pVar.mo3988d(this.f2855d);
            this.f2855d += this.f2856e;
            return d;
        }

        /* renamed from: a */
        public void mo3538a() {
            mo3539a((View) null);
        }

        /* renamed from: a */
        public void mo3539a(View view) {
            View b = mo3541b(view);
            this.f2855d = b == null ? -1 : ((RecyclerView.C0762j) b.getLayoutParams()).mo3940a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3540a(RecyclerView.C0775t tVar) {
            int i = this.f2855d;
            return i >= 0 && i < tVar.mo4011a();
        }

        /* renamed from: b */
        public View mo3541b(View view) {
            int a;
            int size = this.f2862k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2862k.get(i2).f3093b;
                RecyclerView.C0762j jVar = (RecyclerView.C0762j) view3.getLayoutParams();
                if (view3 != view && !jVar.mo3942c() && (a = (jVar.mo3940a() - this.f2855d) * this.f2856e) >= 0 && a < i) {
                    if (a == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2832s = 1;
        this.f2836w = false;
        this.f2837x = false;
        this.f2838y = false;
        this.f2839z = true;
        this.f2825A = -1;
        this.f2826B = Integer.MIN_VALUE;
        this.f2828D = null;
        this.f2829E = new C0730a();
        this.f2830F = new C0731b();
        this.f2831G = 2;
        mo3523j(i);
        mo3508a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2832s = 1;
        this.f2836w = false;
        this.f2837x = false;
        this.f2838y = false;
        this.f2839z = true;
        this.f2825A = -1;
        this.f2826B = Integer.MIN_VALUE;
        this.f2828D = null;
        this.f2829E = new C0730a();
        this.f2830F = new C0731b();
        this.f2831G = 2;
        RecyclerView.C0759i.C0761b a = RecyclerView.C0759i.m4093a(context, attributeSet, i, i2);
        mo3523j(a.f3038a);
        mo3508a(a.f3040c);
        mo3387b(a.f3041d);
    }

    /* renamed from: L */
    private View mo3367L() {
        return mo3890c(this.f2837x ? 0 : mo3903e() - 1);
    }

    /* renamed from: M */
    private View mo11848M() {
        return mo3890c(this.f2837x ? mo3903e() - 1 : 0);
    }

    /* renamed from: N */
    private void m3716N() {
        this.f2837x = (this.f2832s == 1 || !mo3498J()) ? this.f2836w : !this.f2836w;
    }

    /* renamed from: a */
    private int m3717a(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, boolean z) {
        int b;
        int b2 = this.f2834u.mo3076b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -mo3514c(-b2, pVar, tVar);
        int i3 = i + i2;
        if (!z || (b = this.f2834u.mo3076b() - i3) <= 0) {
            return i2;
        }
        this.f2834u.mo3075a(b);
        return b + i2;
    }

    /* renamed from: a */
    private View m3718a(boolean z, boolean z2) {
        int e;
        int i;
        if (this.f2837x) {
            e = 0;
            i = mo3903e();
        } else {
            e = mo3903e() - 1;
            i = -1;
        }
        return mo3502a(e, i, z, z2);
    }

    /* renamed from: a */
    private void m3719a(int i, int i2, boolean z, RecyclerView.C0775t tVar) {
        int i3;
        this.f2833t.f2863l = mo3499K();
        this.f2833t.f2859h = mo3520h(tVar);
        C0732c cVar = this.f2833t;
        cVar.f2857f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f2859h += this.f2834u.mo3078c();
            View L = mo3367L();
            C0732c cVar2 = this.f2833t;
            if (!this.f2837x) {
                i4 = 1;
            }
            cVar2.f2856e = i4;
            C0732c cVar3 = this.f2833t;
            int l = mo3923l(L);
            C0732c cVar4 = this.f2833t;
            cVar3.f2855d = l + cVar4.f2856e;
            cVar4.f2853b = this.f2834u.mo3074a(L);
            i3 = this.f2834u.mo3074a(L) - this.f2834u.mo3076b();
        } else {
            View M = mo11848M();
            this.f2833t.f2859h += this.f2834u.mo3084f();
            C0732c cVar5 = this.f2833t;
            if (this.f2837x) {
                i4 = 1;
            }
            cVar5.f2856e = i4;
            C0732c cVar6 = this.f2833t;
            int l2 = mo3923l(M);
            C0732c cVar7 = this.f2833t;
            cVar6.f2855d = l2 + cVar7.f2856e;
            cVar7.f2853b = this.f2834u.mo3081d(M);
            i3 = (-this.f2834u.mo3081d(M)) + this.f2834u.mo3084f();
        }
        C0732c cVar8 = this.f2833t;
        cVar8.f2854c = i2;
        if (z) {
            cVar8.f2854c -= i3;
        }
        this.f2833t.f2858g = i3;
    }

    /* renamed from: a */
    private void m3720a(C0730a aVar) {
        mo3391f(aVar.f2844b, aVar.f2845c);
    }

    /* renamed from: a */
    private void m3721a(RecyclerView.C0769p pVar, int i) {
        int e = mo3903e();
        if (i >= 0) {
            int a = this.f2834u.mo3073a() - i;
            if (this.f2837x) {
                for (int i2 = 0; i2 < e; i2++) {
                    View c = mo3890c(i2);
                    if (this.f2834u.mo3081d(c) < a || this.f2834u.mo3085f(c) < a) {
                        m3722a(pVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = e - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View c2 = mo3890c(i4);
                if (this.f2834u.mo3081d(c2) < a || this.f2834u.mo3085f(c2) < a) {
                    m3722a(pVar, i3, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3722a(RecyclerView.C0769p pVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo3852a(i3, pVar);
                }
                return;
            }
            while (i > i2) {
                mo3852a(i, pVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m3723a(RecyclerView.C0769p pVar, C0732c cVar) {
        if (cVar.f2852a && !cVar.f2863l) {
            if (cVar.f2857f == -1) {
                m3721a(pVar, cVar.f2858g);
            } else {
                m3729b(pVar, cVar.f2858g);
            }
        }
    }

    /* renamed from: a */
    private boolean m3724a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, C0730a aVar) {
        boolean z = false;
        if (mo3903e() == 0) {
            return false;
        }
        View g = mo3912g();
        if (g != null && aVar.mo3532a(g, tVar)) {
            aVar.mo3534b(g, mo3923l(g));
            return true;
        } else if (this.f2835v != this.f2838y) {
            return false;
        } else {
            View l = aVar.f2846d ? m3743l(pVar, tVar) : m3744m(pVar, tVar);
            if (l == null) {
                return false;
            }
            aVar.mo3531a(l, mo3923l(l));
            if (!tVar.mo4016d() && mo3366D()) {
                if (this.f2834u.mo3081d(l) >= this.f2834u.mo3076b() || this.f2834u.mo3074a(l) < this.f2834u.mo3084f()) {
                    z = true;
                }
                if (z) {
                    aVar.f2845c = aVar.f2846d ? this.f2834u.mo3076b() : this.f2834u.mo3084f();
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m3725a(RecyclerView.C0775t tVar, C0730a aVar) {
        int i;
        boolean z = false;
        if (!tVar.mo4016d() && (i = this.f2825A) != -1) {
            if (i < 0 || i >= tVar.mo4011a()) {
                this.f2825A = -1;
                this.f2826B = Integer.MIN_VALUE;
            } else {
                aVar.f2844b = this.f2825A;
                SavedState savedState = this.f2828D;
                if (savedState != null && savedState.mo3526a()) {
                    aVar.f2846d = this.f2828D.f2842c;
                    aVar.f2845c = aVar.f2846d ? this.f2834u.mo3076b() - this.f2828D.f2841b : this.f2834u.mo3084f() + this.f2828D.f2841b;
                    return true;
                } else if (this.f2826B == Integer.MIN_VALUE) {
                    View b = mo3511b(this.f2825A);
                    if (b == null) {
                        if (mo3903e() > 0) {
                            if ((this.f2825A < mo3923l(mo3890c(0))) == this.f2837x) {
                                z = true;
                            }
                            aVar.f2846d = z;
                        }
                        aVar.mo3530a();
                    } else if (this.f2834u.mo3077b(b) > this.f2834u.mo3086g()) {
                        aVar.mo3530a();
                        return true;
                    } else if (this.f2834u.mo3081d(b) - this.f2834u.mo3084f() < 0) {
                        aVar.f2845c = this.f2834u.mo3084f();
                        aVar.f2846d = false;
                        return true;
                    } else if (this.f2834u.mo3076b() - this.f2834u.mo3074a(b) < 0) {
                        aVar.f2845c = this.f2834u.mo3076b();
                        aVar.f2846d = true;
                        return true;
                    } else {
                        aVar.f2845c = aVar.f2846d ? this.f2834u.mo3074a(b) + this.f2834u.mo3087h() : this.f2834u.mo3081d(b);
                    }
                    return true;
                } else {
                    boolean z2 = this.f2837x;
                    aVar.f2846d = z2;
                    aVar.f2845c = z2 ? this.f2834u.mo3076b() - this.f2826B : this.f2834u.mo3084f() + this.f2826B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m3726b(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, boolean z) {
        int f;
        int f2 = i - this.f2834u.mo3084f();
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -mo3514c(f2, pVar, tVar);
        int i3 = i + i2;
        if (!z || (f = i3 - this.f2834u.mo3084f()) <= 0) {
            return i2;
        }
        this.f2834u.mo3075a(-f);
        return i2 - f;
    }

    /* renamed from: b */
    private View m3727b(boolean z, boolean z2) {
        int i;
        int e;
        if (this.f2837x) {
            i = mo3903e() - 1;
            e = -1;
        } else {
            i = 0;
            e = mo3903e();
        }
        return mo3502a(i, e, z, z2);
    }

    /* renamed from: b */
    private void m3728b(C0730a aVar) {
        m3735g(aVar.f2844b, aVar.f2845c);
    }

    /* renamed from: b */
    private void m3729b(RecyclerView.C0769p pVar, int i) {
        if (i >= 0) {
            int e = mo3903e();
            if (this.f2837x) {
                int i2 = e - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View c = mo3890c(i3);
                    if (this.f2834u.mo3074a(c) > i || this.f2834u.mo3083e(c) > i) {
                        m3722a(pVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < e; i4++) {
                View c2 = mo3890c(i4);
                if (this.f2834u.mo3074a(c2) > i || this.f2834u.mo3083e(c2) > i) {
                    m3722a(pVar, 0, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m3730b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i, int i2) {
        RecyclerView.C0769p pVar2 = pVar;
        RecyclerView.C0775t tVar2 = tVar;
        if (tVar.mo4017e() && mo3903e() != 0 && !tVar.mo4016d() && mo3366D()) {
            List<RecyclerView.C0778w> f = pVar.mo3992f();
            int size = f.size();
            int l = mo3923l(mo3890c(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0778w wVar = f.get(i5);
                if (!wVar.mo4048o()) {
                    boolean z = true;
                    if ((wVar.mo4041h() < l) != this.f2837x) {
                        z = true;
                    }
                    if (z) {
                        i3 += this.f2834u.mo3077b(wVar.f3093b);
                    } else {
                        i4 += this.f2834u.mo3077b(wVar.f3093b);
                    }
                }
            }
            this.f2833t.f2862k = f;
            if (i3 > 0) {
                m3735g(mo3923l(mo11848M()), i);
                C0732c cVar = this.f2833t;
                cVar.f2859h = i3;
                cVar.f2854c = 0;
                cVar.mo3538a();
                mo3500a(pVar2, this.f2833t, tVar2, false);
            }
            if (i4 > 0) {
                mo3391f(mo3923l(mo3367L()), i2);
                C0732c cVar2 = this.f2833t;
                cVar2.f2859h = i4;
                cVar2.f2854c = 0;
                cVar2.mo3538a();
                mo3500a(pVar2, this.f2833t, tVar2, false);
            }
            this.f2833t.f2862k = null;
        }
    }

    /* renamed from: b */
    private void m3731b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, C0730a aVar) {
        if (!m3725a(tVar, aVar) && !m3724a(pVar, tVar, aVar)) {
            aVar.mo3530a();
            aVar.f2844b = this.f2838y ? tVar.mo4011a() - 1 : 0;
        }
    }

    /* renamed from: f */
    private View m3732f(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo3518e(0, mo3903e());
    }

    /* renamed from: f */
    private void mo3391f(int i, int i2) {
        this.f2833t.f2854c = this.f2834u.mo3076b() - i2;
        this.f2833t.f2856e = this.f2837x ? -1 : 1;
        C0732c cVar = this.f2833t;
        cVar.f2855d = i;
        cVar.f2857f = 1;
        cVar.f2853b = i2;
        cVar.f2858g = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    private View m3734g(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo3372a(pVar, tVar, 0, mo3903e(), tVar.mo4011a());
    }

    /* renamed from: g */
    private void m3735g(int i, int i2) {
        this.f2833t.f2854c = i2 - this.f2834u.mo3084f();
        C0732c cVar = this.f2833t;
        cVar.f2855d = i;
        cVar.f2856e = this.f2837x ? 1 : -1;
        C0732c cVar2 = this.f2833t;
        cVar2.f2857f = -1;
        cVar2.f2853b = i2;
        cVar2.f2858g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    private View m3736h(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo3518e(mo3903e() - 1, -1);
    }

    /* renamed from: i */
    private int m3737i(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        mo3494F();
        C0687Aa aa = this.f2834u;
        View b = m3727b(!this.f2839z, true);
        return C0741Pa.m3878a(tVar, aa, b, m3718a(!this.f2839z, true), this, this.f2839z);
    }

    /* renamed from: i */
    private View m3738i(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo3372a(pVar, tVar, mo3903e() - 1, -1, tVar.mo4011a());
    }

    /* renamed from: j */
    private int m3739j(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        mo3494F();
        C0687Aa aa = this.f2834u;
        View b = m3727b(!this.f2839z, true);
        return C0741Pa.m3879a(tVar, aa, b, m3718a(!this.f2839z, true), this, this.f2839z, this.f2837x);
    }

    /* renamed from: j */
    private View m3740j(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f2837x ? m3732f(pVar, tVar) : m3736h(pVar, tVar);
    }

    /* renamed from: k */
    private int m3741k(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        mo3494F();
        C0687Aa aa = this.f2834u;
        View b = m3727b(!this.f2839z, true);
        return C0741Pa.m3880b(tVar, aa, b, m3718a(!this.f2839z, true), this, this.f2839z);
    }

    /* renamed from: k */
    private View m3742k(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f2837x ? m3736h(pVar, tVar) : m3732f(pVar, tVar);
    }

    /* renamed from: l */
    private View m3743l(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f2837x ? m3734g(pVar, tVar) : m3738i(pVar, tVar);
    }

    /* renamed from: m */
    private View m3744m(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f2837x ? m3738i(pVar, tVar) : m3734g(pVar, tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3492B() {
        return (mo3916i() == 1073741824 || mo3933s() == 1073741824 || !mo3934t()) ? false : true;
    }

    /* renamed from: D */
    public boolean mo3366D() {
        return this.f2828D == null && this.f2835v == this.f2838y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C0732c mo3493E() {
        return new C0732c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo3494F() {
        if (this.f2833t == null) {
            this.f2833t = mo3493E();
        }
    }

    /* renamed from: G */
    public int mo3495G() {
        View a = mo3502a(0, mo3903e(), false, true);
        if (a == null) {
            return -1;
        }
        return mo3923l(a);
    }

    /* renamed from: H */
    public int mo3496H() {
        View a = mo3502a(mo3903e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo3923l(a);
    }

    /* renamed from: I */
    public int mo3497I() {
        return this.f2832s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo3498J() {
        return mo3920k() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo3499K() {
        return this.f2834u.mo3080d() == 0 && this.f2834u.mo3073a() == 0;
    }

    /* renamed from: a */
    public int mo3368a(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (this.f2832s == 1) {
            return 0;
        }
        return mo3514c(i, pVar, tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3500a(RecyclerView.C0769p pVar, C0732c cVar, RecyclerView.C0775t tVar, boolean z) {
        int i = cVar.f2854c;
        int i2 = cVar.f2858g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2858g = i2 + i;
            }
            m3723a(pVar, cVar);
        }
        int i3 = cVar.f2854c + cVar.f2859h;
        C0731b bVar = this.f2830F;
        while (true) {
            if ((!cVar.f2863l && i3 <= 0) || !cVar.mo3540a(tVar)) {
                break;
            }
            bVar.mo3536a();
            mo3377a(pVar, tVar, cVar, bVar);
            if (!bVar.f2849b) {
                cVar.f2853b += bVar.f2848a * cVar.f2857f;
                if (!bVar.f2850c || this.f2833t.f2862k != null || !tVar.mo4016d()) {
                    int i4 = cVar.f2854c;
                    int i5 = bVar.f2848a;
                    cVar.f2854c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2858g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f2858g = i6 + bVar.f2848a;
                    int i7 = cVar.f2854c;
                    if (i7 < 0) {
                        cVar.f2858g += i7;
                    }
                    m3723a(pVar, cVar);
                }
                if (z && bVar.f2851d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2854c;
    }

    /* renamed from: a */
    public int mo3501a(RecyclerView.C0775t tVar) {
        return m3737i(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3502a(int i, int i2, boolean z, boolean z2) {
        mo3494F();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2832s == 0 ? this.f3024e : this.f3025f).mo4699a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3372a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, int i, int i2, int i3) {
        mo3494F();
        int f = this.f2834u.mo3084f();
        int b = this.f2834u.mo3076b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c = mo3890c(i);
            int l = mo3923l(c);
            if (l >= 0 && l < i3) {
                if (((RecyclerView.C0762j) c.getLayoutParams()).mo3942c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if (this.f2834u.mo3081d(c) < b && this.f2834u.mo3074a(c) >= f) {
                    return c;
                } else {
                    if (view == null) {
                        view = c;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public View mo3373a(View view, int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        int i2;
        m3716N();
        if (mo3903e() == 0 || (i2 = mo3522i(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo3494F();
        mo3494F();
        m3719a(i2, (int) (((float) this.f2834u.mo3086g()) * 0.33333334f), false, tVar);
        C0732c cVar = this.f2833t;
        cVar.f2858g = Integer.MIN_VALUE;
        cVar.f2852a = false;
        mo3500a(pVar, cVar, tVar, true);
        View k = i2 == -1 ? m3742k(pVar, tVar) : m3740j(pVar, tVar);
        View M = i2 == -1 ? mo11848M() : mo3367L();
        if (!M.hasFocusable()) {
            return k;
        }
        if (k == null) {
            return null;
        }
        return M;
    }

    /* renamed from: a */
    public void mo3503a(int i, int i2, RecyclerView.C0775t tVar, RecyclerView.C0759i.C0760a aVar) {
        if (this.f2832s != 0) {
            i = i2;
        }
        if (mo3903e() != 0 && i != 0) {
            mo3494F();
            m3719a(i > 0 ? 1 : -1, Math.abs(i), true, tVar);
            mo3379a(tVar, this.f2833t, aVar);
        }
    }

    /* renamed from: a */
    public void mo3504a(int i, RecyclerView.C0759i.C0760a aVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f2828D;
        int i3 = -1;
        if (savedState == null || !savedState.mo3526a()) {
            m3716N();
            z = this.f2837x;
            i2 = this.f2825A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f2828D;
            z = savedState2.f2842c;
            i2 = savedState2.f2840a;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.f2831G && i4 >= 0 && i4 < i; i5++) {
            aVar.mo3939a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo3505a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2828D = (SavedState) parcelable;
            mo3938z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3376a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, C0730a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3377a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, C0732c cVar, C0731b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3537a(pVar);
        if (a == null) {
            bVar.f2849b = true;
            return;
        }
        RecyclerView.C0762j jVar = (RecyclerView.C0762j) a.getLayoutParams();
        if (cVar.f2862k == null) {
            if (this.f2837x == (cVar.f2857f == -1)) {
                mo3885b(a);
            } else {
                mo3886b(a, 0);
            }
        } else {
            if (this.f2837x == (cVar.f2857f == -1)) {
                mo3861a(a);
            } else {
                mo3862a(a, 0);
            }
        }
        mo3863a(a, 0, 0);
        bVar.f2848a = this.f2834u.mo3077b(a);
        if (this.f2832s == 1) {
            if (mo3498J()) {
                i5 = mo3932r() - mo3930p();
                i4 = i5 - this.f2834u.mo3079c(a);
            } else {
                i4 = mo3928o();
                i5 = this.f2834u.mo3079c(a) + i4;
            }
            if (cVar.f2857f == -1) {
                int i6 = cVar.f2853b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f2848a;
            } else {
                int i7 = cVar.f2853b;
                i3 = i7;
                i2 = i5;
                i = bVar.f2848a + i7;
            }
        } else {
            int q = mo3931q();
            int c = this.f2834u.mo3079c(a) + q;
            if (cVar.f2857f == -1) {
                int i8 = cVar.f2853b;
                i2 = i8;
                i3 = q;
                i = c;
                i4 = i8 - bVar.f2848a;
            } else {
                int i9 = cVar.f2853b;
                i3 = q;
                i2 = bVar.f2848a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo3864a(a, i4, i3, i2, i);
        if (jVar.mo3942c() || jVar.mo3941b()) {
            bVar.f2850c = true;
        }
        bVar.f2851d = a.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3379a(RecyclerView.C0775t tVar, C0732c cVar, RecyclerView.C0759i.C0760a aVar) {
        int i = cVar.f2855d;
        if (i >= 0 && i < tVar.mo4011a()) {
            aVar.mo3939a(i, Math.max(0, cVar.f2858g));
        }
    }

    /* renamed from: a */
    public void mo3506a(AccessibilityEvent accessibilityEvent) {
        super.mo3506a(accessibilityEvent);
        if (mo3903e() > 0) {
            accessibilityEvent.setFromIndex(mo3495G());
            accessibilityEvent.setToIndex(mo3496H());
        }
    }

    /* renamed from: a */
    public void mo3507a(String str) {
        if (this.f2828D == null) {
            super.mo3507a(str);
        }
    }

    /* renamed from: a */
    public void mo3508a(boolean z) {
        mo3507a((String) null);
        if (z != this.f2836w) {
            this.f2836w = z;
            mo3938z();
        }
    }

    /* renamed from: a */
    public boolean mo3509a() {
        return this.f2832s == 0;
    }

    /* renamed from: b */
    public int mo3384b(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (this.f2832s == 0) {
            return 0;
        }
        return mo3514c(i, pVar, tVar);
    }

    /* renamed from: b */
    public int mo3510b(RecyclerView.C0775t tVar) {
        return m3739j(tVar);
    }

    /* renamed from: b */
    public View mo3511b(int i) {
        int e = mo3903e();
        if (e == 0) {
            return null;
        }
        int l = i - mo3923l(mo3890c(0));
        if (l >= 0 && l < e) {
            View c = mo3890c(l);
            if (mo3923l(c) == i) {
                return c;
            }
        }
        return super.mo3511b(i);
    }

    /* renamed from: b */
    public void mo3512b(RecyclerView recyclerView, RecyclerView.C0769p pVar) {
        super.mo3512b(recyclerView, pVar);
        if (this.f2827C) {
            mo3883b(pVar);
            pVar.mo3967a();
        }
    }

    /* renamed from: b */
    public void mo3387b(boolean z) {
        mo3507a((String) null);
        if (this.f2838y != z) {
            this.f2838y = z;
            mo3938z();
        }
    }

    /* renamed from: b */
    public boolean mo3513b() {
        return this.f2832s == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3514c(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (mo3903e() == 0 || i == 0) {
            return 0;
        }
        this.f2833t.f2852a = true;
        mo3494F();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3719a(i2, abs, true, tVar);
        C0732c cVar = this.f2833t;
        int a = cVar.f2858g + mo3500a(pVar, cVar, tVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2834u.mo3075a(-i);
        this.f2833t.f2861j = i;
        return i;
    }

    /* renamed from: c */
    public int mo3515c(RecyclerView.C0775t tVar) {
        return m3741k(tVar);
    }

    /* renamed from: c */
    public RecyclerView.C0762j mo3388c() {
        return new RecyclerView.C0762j(-2, -2);
    }

    /* renamed from: d */
    public int mo3516d(RecyclerView.C0775t tVar) {
        return m3737i(tVar);
    }

    /* renamed from: e */
    public int mo3517e(RecyclerView.C0775t tVar) {
        return m3739j(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo3518e(int i, int i2) {
        int i3;
        int i4;
        mo3494F();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo3890c(i);
        }
        if (this.f2834u.mo3081d(mo3890c(i)) < this.f2834u.mo3084f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2832s == 0 ? this.f3024e : this.f3025f).mo4699a(i, i2, i4, i3);
    }

    /* renamed from: e */
    public void mo3390e(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View b;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f2828D == null && this.f2825A == -1) && tVar.mo4011a() == 0) {
            mo3883b(pVar);
            return;
        }
        SavedState savedState = this.f2828D;
        if (savedState != null && savedState.mo3526a()) {
            this.f2825A = this.f2828D.f2840a;
        }
        mo3494F();
        this.f2833t.f2852a = false;
        m3716N();
        View g = mo3912g();
        if (!this.f2829E.f2847e || this.f2825A != -1 || this.f2828D != null) {
            this.f2829E.mo3533b();
            C0730a aVar = this.f2829E;
            aVar.f2846d = this.f2837x ^ this.f2838y;
            m3731b(pVar, tVar, aVar);
            this.f2829E.f2847e = true;
        } else if (g != null && (this.f2834u.mo3081d(g) >= this.f2834u.mo3076b() || this.f2834u.mo3074a(g) <= this.f2834u.mo3084f())) {
            this.f2829E.mo3534b(g, mo3923l(g));
        }
        int h = mo3520h(tVar);
        if (this.f2833t.f2861j >= 0) {
            i = h;
            h = 0;
        } else {
            i = 0;
        }
        int f = h + this.f2834u.mo3084f();
        int c = i + this.f2834u.mo3078c();
        if (!(!tVar.mo4016d() || (i7 = this.f2825A) == -1 || this.f2826B == Integer.MIN_VALUE || (b = mo3511b(i7)) == null)) {
            if (this.f2837x) {
                i8 = this.f2834u.mo3076b() - this.f2834u.mo3074a(b);
                i9 = this.f2826B;
            } else {
                i9 = this.f2834u.mo3081d(b) - this.f2834u.mo3084f();
                i8 = this.f2826B;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                f += i11;
            } else {
                c -= i11;
            }
        }
        if (!this.f2829E.f2846d ? !this.f2837x : this.f2837x) {
            i10 = 1;
        }
        mo3376a(pVar, tVar, this.f2829E, i10);
        mo3855a(pVar);
        this.f2833t.f2863l = mo3499K();
        this.f2833t.f2860i = tVar.mo4016d();
        C0730a aVar2 = this.f2829E;
        if (aVar2.f2846d) {
            m3728b(aVar2);
            C0732c cVar = this.f2833t;
            cVar.f2859h = f;
            mo3500a(pVar, cVar, tVar, false);
            C0732c cVar2 = this.f2833t;
            i3 = cVar2.f2853b;
            int i12 = cVar2.f2855d;
            int i13 = cVar2.f2854c;
            if (i13 > 0) {
                c += i13;
            }
            m3720a(this.f2829E);
            C0732c cVar3 = this.f2833t;
            cVar3.f2859h = c;
            cVar3.f2855d += cVar3.f2856e;
            mo3500a(pVar, cVar3, tVar, false);
            C0732c cVar4 = this.f2833t;
            i2 = cVar4.f2853b;
            int i14 = cVar4.f2854c;
            if (i14 > 0) {
                m3735g(i12, i3);
                C0732c cVar5 = this.f2833t;
                cVar5.f2859h = i14;
                mo3500a(pVar, cVar5, tVar, false);
                i3 = this.f2833t.f2853b;
            }
        } else {
            m3720a(aVar2);
            C0732c cVar6 = this.f2833t;
            cVar6.f2859h = c;
            mo3500a(pVar, cVar6, tVar, false);
            C0732c cVar7 = this.f2833t;
            i2 = cVar7.f2853b;
            int i15 = cVar7.f2855d;
            int i16 = cVar7.f2854c;
            if (i16 > 0) {
                f += i16;
            }
            m3728b(this.f2829E);
            C0732c cVar8 = this.f2833t;
            cVar8.f2859h = f;
            cVar8.f2855d += cVar8.f2856e;
            mo3500a(pVar, cVar8, tVar, false);
            C0732c cVar9 = this.f2833t;
            i3 = cVar9.f2853b;
            int i17 = cVar9.f2854c;
            if (i17 > 0) {
                mo3391f(i15, i2);
                C0732c cVar10 = this.f2833t;
                cVar10.f2859h = i17;
                mo3500a(pVar, cVar10, tVar, false);
                i2 = this.f2833t.f2853b;
            }
        }
        if (mo3903e() > 0) {
            if (this.f2837x ^ this.f2838y) {
                int a = m3717a(i2, pVar, tVar, true);
                i5 = i3 + a;
                i4 = i2 + a;
                i6 = m3726b(i5, pVar, tVar, false);
            } else {
                int b2 = m3726b(i3, pVar, tVar, true);
                i5 = i3 + b2;
                i4 = i2 + b2;
                i6 = m3717a(i4, pVar, tVar, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        m3730b(pVar, tVar, i3, i2);
        if (!tVar.mo4016d()) {
            this.f2834u.mo3088i();
        } else {
            this.f2829E.mo3533b();
        }
        this.f2835v = this.f2838y;
    }

    /* renamed from: f */
    public int mo3519f(RecyclerView.C0775t tVar) {
        return m3741k(tVar);
    }

    /* renamed from: g */
    public void mo3392g(RecyclerView.C0775t tVar) {
        super.mo3392g(tVar);
        this.f2828D = null;
        this.f2825A = -1;
        this.f2826B = Integer.MIN_VALUE;
        this.f2829E.mo3533b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo3520h(RecyclerView.C0775t tVar) {
        if (tVar.mo4015c()) {
            return this.f2834u.mo3086g();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo3521h(int i) {
        this.f2825A = i;
        this.f2826B = Integer.MIN_VALUE;
        SavedState savedState = this.f2828D;
        if (savedState != null) {
            savedState.mo3527b();
        }
        mo3938z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo3522i(int i) {
        if (i == 1) {
            return (this.f2832s != 1 && mo3498J()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2832s != 1 && mo3498J()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f2832s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f2832s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f2832s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f2832s == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: j */
    public void mo3523j(int i) {
        if (i == 0 || i == 1) {
            mo3507a((String) null);
            if (i != this.f2832s || this.f2834u == null) {
                this.f2834u = C0687Aa.m3426a(this, i);
                this.f2829E.f2843a = this.f2834u;
                this.f2832s = i;
                mo3938z();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: v */
    public boolean mo3524v() {
        return true;
    }

    /* renamed from: y */
    public Parcelable mo3525y() {
        SavedState savedState = this.f2828D;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (mo3903e() > 0) {
            mo3494F();
            boolean z = this.f2835v ^ this.f2837x;
            savedState2.f2842c = z;
            if (z) {
                View L = mo3367L();
                savedState2.f2841b = this.f2834u.mo3076b() - this.f2834u.mo3074a(L);
                savedState2.f2840a = mo3923l(L);
            } else {
                View M = mo11848M();
                savedState2.f2840a = mo3923l(M);
                savedState2.f2841b = this.f2834u.mo3081d(M) - this.f2834u.mo3084f();
            }
        } else {
            savedState2.mo3527b();
        }
        return savedState2;
    }
}
