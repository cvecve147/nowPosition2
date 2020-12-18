package android.support.p011v7.widget;

import android.graphics.Rect;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.Aa */
public abstract class C0687Aa {

    /* renamed from: a */
    protected final RecyclerView.C0759i f2622a;

    /* renamed from: b */
    private int f2623b;

    /* renamed from: c */
    final Rect f2624c;

    private C0687Aa(RecyclerView.C0759i iVar) {
        this.f2623b = Integer.MIN_VALUE;
        this.f2624c = new Rect();
        this.f2622a = iVar;
    }

    /* synthetic */ C0687Aa(RecyclerView.C0759i iVar, C0913ya yaVar) {
        this(iVar);
    }

    /* renamed from: a */
    public static C0687Aa m3425a(RecyclerView.C0759i iVar) {
        return new C0913ya(iVar);
    }

    /* renamed from: a */
    public static C0687Aa m3426a(RecyclerView.C0759i iVar, int i) {
        if (i == 0) {
            return m3425a(iVar);
        }
        if (i == 1) {
            return m3427b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C0687Aa m3427b(RecyclerView.C0759i iVar) {
        return new C0915za(iVar);
    }

    /* renamed from: a */
    public abstract int mo3073a();

    /* renamed from: a */
    public abstract int mo3074a(View view);

    /* renamed from: a */
    public abstract void mo3075a(int i);

    /* renamed from: b */
    public abstract int mo3076b();

    /* renamed from: b */
    public abstract int mo3077b(View view);

    /* renamed from: c */
    public abstract int mo3078c();

    /* renamed from: c */
    public abstract int mo3079c(View view);

    /* renamed from: d */
    public abstract int mo3080d();

    /* renamed from: d */
    public abstract int mo3081d(View view);

    /* renamed from: e */
    public abstract int mo3082e();

    /* renamed from: e */
    public abstract int mo3083e(View view);

    /* renamed from: f */
    public abstract int mo3084f();

    /* renamed from: f */
    public abstract int mo3085f(View view);

    /* renamed from: g */
    public abstract int mo3086g();

    /* renamed from: h */
    public int mo3087h() {
        if (Integer.MIN_VALUE == this.f2623b) {
            return 0;
        }
        return mo3086g() - this.f2623b;
    }

    /* renamed from: i */
    public void mo3088i() {
        this.f2623b = mo3086g();
    }
}
