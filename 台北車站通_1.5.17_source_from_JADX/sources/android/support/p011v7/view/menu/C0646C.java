package android.support.p011v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.C0907wa;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1106d;
import p013b.p018b.p040i.p041a.C1109g;

/* renamed from: android.support.v7.view.menu.C */
final class C0646C extends C0676s implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0679v, View.OnKeyListener {

    /* renamed from: b */
    private final Context f2402b;

    /* renamed from: c */
    private final C0662l f2403c;

    /* renamed from: d */
    private final C0661k f2404d;

    /* renamed from: e */
    private final boolean f2405e;

    /* renamed from: f */
    private final int f2406f;

    /* renamed from: g */
    private final int f2407g;

    /* renamed from: h */
    private final int f2408h;

    /* renamed from: i */
    final C0907wa f2409i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f2410j = new C0642A(this);

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f2411k = new C0645B(this);

    /* renamed from: l */
    private PopupWindow.OnDismissListener f2412l;

    /* renamed from: m */
    private View f2413m;

    /* renamed from: n */
    View f2414n;

    /* renamed from: o */
    private C0679v.C0680a f2415o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ViewTreeObserver f2416p;

    /* renamed from: q */
    private boolean f2417q;

    /* renamed from: r */
    private boolean f2418r;

    /* renamed from: s */
    private int f2419s;

    /* renamed from: t */
    private int f2420t = 0;

    /* renamed from: u */
    private boolean f2421u;

    public C0646C(Context context, C0662l lVar, View view, int i, int i2, boolean z) {
        this.f2402b = context;
        this.f2403c = lVar;
        this.f2405e = z;
        this.f2404d = new C0661k(lVar, LayoutInflater.from(context), this.f2405e);
        this.f2407g = i;
        this.f2408h = i2;
        Resources resources = context.getResources();
        this.f2406f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1106d.abc_config_prefDialogWidth));
        this.f2413m = view;
        this.f2409i = new C0907wa(this.f2402b, (AttributeSet) null, this.f2407g, this.f2408h);
        lVar.mo2857a((C0679v) this, context);
    }

    /* renamed from: e */
    private boolean m3158e() {
        View view;
        if (mo2706w()) {
            return true;
        }
        if (this.f2417q || (view = this.f2413m) == null) {
            return false;
        }
        this.f2414n = view;
        this.f2409i.mo4745a((PopupWindow.OnDismissListener) this);
        this.f2409i.mo4744a((AdapterView.OnItemClickListener) this);
        this.f2409i.mo4746a(true);
        View view2 = this.f2414n;
        boolean z = this.f2416p == null;
        this.f2416p = view2.getViewTreeObserver();
        if (z) {
            this.f2416p.addOnGlobalLayoutListener(this.f2410j);
        }
        view2.addOnAttachStateChangeListener(this.f2411k);
        this.f2409i.mo4743a(view2);
        this.f2409i.mo4751c(this.f2420t);
        if (!this.f2418r) {
            this.f2419s = C0676s.m3371a(this.f2404d, (ViewGroup) null, this.f2402b, this.f2406f);
            this.f2418r = true;
        }
        this.f2409i.mo4748b(this.f2419s);
        this.f2409i.mo4755e(2);
        this.f2409i.mo4741a(mo3034d());
        this.f2409i.mo2705v();
        ListView x = this.f2409i.mo2707x();
        x.setOnKeyListener(this);
        if (this.f2421u && this.f2403c.mo2892h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2402b).inflate(C1109g.abc_popup_menu_header_item_layout, x, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2403c.mo2892h());
            }
            frameLayout.setEnabled(false);
            x.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f2409i.mo3271a((ListAdapter) this.f2404d);
        this.f2409i.mo2705v();
        return true;
    }

    /* renamed from: a */
    public void mo2693a(int i) {
        this.f2420t = i;
    }

    /* renamed from: a */
    public void mo316a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo2694a(C0662l lVar) {
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        if (lVar == this.f2403c) {
            dismiss();
            C0679v.C0680a aVar = this.f2415o;
            if (aVar != null) {
                aVar.mo2484a(lVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo2695a(C0679v.C0680a aVar) {
        this.f2415o = aVar;
    }

    /* renamed from: a */
    public void mo2696a(View view) {
        this.f2413m = view;
    }

    /* renamed from: a */
    public void mo2697a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2412l = onDismissListener;
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        this.f2418r = false;
        C0661k kVar = this.f2404d;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo322a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        if (d.hasVisibleItems()) {
            C0678u uVar = new C0678u(this.f2402b, d, this.f2414n, this.f2405e, this.f2407g, this.f2408h);
            uVar.mo3039a(this.f2415o);
            uVar.mo3042a(C0676s.m3373b((C0662l) d));
            uVar.mo3038a(this.f2420t);
            uVar.mo3041a(this.f2412l);
            this.f2412l = null;
            this.f2403c.mo2860a(false);
            if (uVar.mo3043a(this.f2409i.mo4752d(), this.f2409i.mo4754e())) {
                C0679v.C0680a aVar = this.f2415o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo2485a(d);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Parcelable mo325b() {
        return null;
    }

    /* renamed from: b */
    public void mo2698b(int i) {
        this.f2409i.mo4753d(i);
    }

    /* renamed from: b */
    public void mo2699b(boolean z) {
        this.f2404d.mo2840a(z);
    }

    /* renamed from: c */
    public void mo2700c(int i) {
        this.f2409i.mo4760h(i);
    }

    /* renamed from: c */
    public void mo2701c(boolean z) {
        this.f2421u = z;
    }

    public void dismiss() {
        if (mo2706w()) {
            this.f2409i.dismiss();
        }
    }

    public void onDismiss() {
        this.f2417q = true;
        this.f2403c.close();
        ViewTreeObserver viewTreeObserver = this.f2416p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2416p = this.f2414n.getViewTreeObserver();
            }
            this.f2416p.removeGlobalOnLayoutListener(this.f2410j);
            this.f2416p = null;
        }
        this.f2414n.removeOnAttachStateChangeListener(this.f2411k);
        PopupWindow.OnDismissListener onDismissListener = this.f2412l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: v */
    public void mo2705v() {
        if (!m3158e()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: w */
    public boolean mo2706w() {
        return !this.f2417q && this.f2409i.mo2706w();
    }

    /* renamed from: x */
    public ListView mo2707x() {
        return this.f2409i.mo2707x();
    }
}
