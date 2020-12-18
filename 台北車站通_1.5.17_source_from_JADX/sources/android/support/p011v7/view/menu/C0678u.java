package android.support.p011v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0679v;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.u */
public class C0678u implements C0666n {

    /* renamed from: a */
    private final Context f2608a;

    /* renamed from: b */
    private final C0662l f2609b;

    /* renamed from: c */
    private final boolean f2610c;

    /* renamed from: d */
    private final int f2611d;

    /* renamed from: e */
    private final int f2612e;

    /* renamed from: f */
    private View f2613f;

    /* renamed from: g */
    private int f2614g;

    /* renamed from: h */
    private boolean f2615h;

    /* renamed from: i */
    private C0679v.C0680a f2616i;

    /* renamed from: j */
    private C0676s f2617j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f2618k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f2619l;

    public C0678u(Context context, C0662l lVar, View view, boolean z, int i) {
        this(context, lVar, view, z, i, 0);
    }

    public C0678u(Context context, C0662l lVar, View view, boolean z, int i, int i2) {
        this.f2614g = 8388611;
        this.f2619l = new C0677t(this);
        this.f2608a = context;
        this.f2609b = lVar;
        this.f2613f = view;
        this.f2610c = z;
        this.f2611d = i;
        this.f2612e = i2;
    }

    /* renamed from: a */
    private void m3388a(int i, int i2, boolean z, boolean z2) {
        C0676s b = mo3044b();
        b.mo2701c(z2);
        if (z) {
            if ((C0466f.m2170a(this.f2614g, C0487v.m2293i(this.f2613f)) & 7) == 5) {
                i += this.f2613f.getWidth();
            }
            b.mo2698b(i);
            b.mo2700c(i2);
            int i3 = (int) ((this.f2608a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo3033a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo2705v();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.v, android.support.v7.view.menu.s] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.C] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p011v7.view.menu.C0676s m3389g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f2608a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f2608a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p013b.p018b.p040i.p041a.C1106d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.i r0 = new android.support.v7.view.menu.i
            android.content.Context r2 = r14.f2608a
            android.view.View r3 = r14.f2613f
            int r4 = r14.f2611d
            int r5 = r14.f2612e
            boolean r6 = r14.f2610c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.C r0 = new android.support.v7.view.menu.C
            android.content.Context r8 = r14.f2608a
            android.support.v7.view.menu.l r9 = r14.f2609b
            android.view.View r10 = r14.f2613f
            int r11 = r14.f2611d
            int r12 = r14.f2612e
            boolean r13 = r14.f2610c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.l r1 = r14.f2609b
            r0.mo2694a((android.support.p011v7.view.menu.C0662l) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f2619l
            r0.mo2697a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f2613f
            r0.mo2696a((android.view.View) r1)
            android.support.v7.view.menu.v$a r1 = r14.f2616i
            r0.mo2695a((android.support.p011v7.view.menu.C0679v.C0680a) r1)
            boolean r1 = r14.f2615h
            r0.mo2699b((boolean) r1)
            int r1 = r14.f2614g
            r0.mo2693a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.view.menu.C0678u.m3389g():android.support.v7.view.menu.s");
    }

    /* renamed from: a */
    public void mo3037a() {
        if (mo3045c()) {
            this.f2617j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo3038a(int i) {
        this.f2614g = i;
    }

    /* renamed from: a */
    public void mo3039a(C0679v.C0680a aVar) {
        this.f2616i = aVar;
        C0676s sVar = this.f2617j;
        if (sVar != null) {
            sVar.mo2695a(aVar);
        }
    }

    /* renamed from: a */
    public void mo3040a(View view) {
        this.f2613f = view;
    }

    /* renamed from: a */
    public void mo3041a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2618k = onDismissListener;
    }

    /* renamed from: a */
    public void mo3042a(boolean z) {
        this.f2615h = z;
        C0676s sVar = this.f2617j;
        if (sVar != null) {
            sVar.mo2699b(z);
        }
    }

    /* renamed from: a */
    public boolean mo3043a(int i, int i2) {
        if (mo3045c()) {
            return true;
        }
        if (this.f2613f == null) {
            return false;
        }
        m3388a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0676s mo3044b() {
        if (this.f2617j == null) {
            this.f2617j = m3389g();
        }
        return this.f2617j;
    }

    /* renamed from: c */
    public boolean mo3045c() {
        C0676s sVar = this.f2617j;
        return sVar != null && sVar.mo2706w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3046d() {
        this.f2617j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2618k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo3047e() {
        if (!mo3048f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo3048f() {
        if (mo3045c()) {
            return true;
        }
        if (this.f2613f == null) {
            return false;
        }
        m3388a(0, 0, false, false);
        return true;
    }
}
