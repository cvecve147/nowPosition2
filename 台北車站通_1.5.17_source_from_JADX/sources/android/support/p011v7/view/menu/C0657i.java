package android.support.p011v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.C0904va;
import android.support.p011v7.widget.C0907wa;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p040i.p041a.C1106d;
import p013b.p018b.p040i.p041a.C1109g;

/* renamed from: android.support.v7.view.menu.i */
final class C0657i extends C0676s implements C0679v, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    boolean f2485A;

    /* renamed from: b */
    private final Context f2486b;

    /* renamed from: c */
    private final int f2487c;

    /* renamed from: d */
    private final int f2488d;

    /* renamed from: e */
    private final int f2489e;

    /* renamed from: f */
    private final boolean f2490f;

    /* renamed from: g */
    final Handler f2491g;

    /* renamed from: h */
    private final List<C0662l> f2492h = new ArrayList();

    /* renamed from: i */
    final List<C0658a> f2493i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f2494j = new C0653e(this);

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f2495k = new C0654f(this);

    /* renamed from: l */
    private final C0904va f2496l = new C0656h(this);

    /* renamed from: m */
    private int f2497m = 0;

    /* renamed from: n */
    private int f2498n = 0;

    /* renamed from: o */
    private View f2499o;

    /* renamed from: p */
    View f2500p;

    /* renamed from: q */
    private int f2501q;

    /* renamed from: r */
    private boolean f2502r;

    /* renamed from: s */
    private boolean f2503s;

    /* renamed from: t */
    private int f2504t;

    /* renamed from: u */
    private int f2505u;

    /* renamed from: v */
    private boolean f2506v;

    /* renamed from: w */
    private boolean f2507w;

    /* renamed from: x */
    private C0679v.C0680a f2508x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ViewTreeObserver f2509y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f2510z;

    /* renamed from: android.support.v7.view.menu.i$a */
    private static class C0658a {

        /* renamed from: a */
        public final C0907wa f2511a;

        /* renamed from: b */
        public final C0662l f2512b;

        /* renamed from: c */
        public final int f2513c;

        public C0658a(C0907wa waVar, C0662l lVar, int i) {
            this.f2511a = waVar;
            this.f2512b = lVar;
            this.f2513c = i;
        }

        /* renamed from: a */
        public ListView mo2827a() {
            return this.f2511a.mo2707x();
        }
    }

    public C0657i(Context context, View view, int i, int i2, boolean z) {
        this.f2486b = context;
        this.f2499o = view;
        this.f2488d = i;
        this.f2489e = i2;
        this.f2490f = z;
        this.f2506v = false;
        this.f2501q = m3230f();
        Resources resources = context.getResources();
        this.f2487c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1106d.abc_config_prefDialogWidth));
        this.f2491g = new Handler();
    }

    /* renamed from: a */
    private MenuItem m3221a(C0662l lVar, C0662l lVar2) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.hasSubMenu() && lVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m3222a(C0658a aVar, C0662l lVar) {
        int i;
        C0661k kVar;
        int firstVisiblePosition;
        MenuItem a = m3221a(aVar.f2512b, lVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo2827a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            kVar = (C0661k) headerViewListAdapter.getWrappedAdapter();
        } else {
            kVar = (C0661k) adapter;
            i = 0;
        }
        int count = kVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == kVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m3226c(C0662l lVar) {
        int size = this.f2493i.size();
        for (int i = 0; i < size; i++) {
            if (lVar == this.f2493i.get(i).f2512b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m3227d(int i) {
        List<C0658a> list = this.f2493i;
        ListView a = list.get(list.size() - 1).mo2827a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2500p.getWindowVisibleDisplayFrame(rect);
        return this.f2501q == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m3228d(C0662l lVar) {
        View view;
        C0658a aVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f2486b);
        C0661k kVar = new C0661k(lVar, from, this.f2490f);
        if (!mo2706w() && this.f2506v) {
            kVar.mo2840a(true);
        } else if (mo2706w()) {
            kVar.mo2840a(C0676s.m3373b(lVar));
        }
        int a = C0676s.m3371a(kVar, (ViewGroup) null, this.f2486b, this.f2487c);
        C0907wa e = m3229e();
        e.mo3271a((ListAdapter) kVar);
        e.mo4748b(a);
        e.mo4751c(this.f2498n);
        if (this.f2493i.size() > 0) {
            List<C0658a> list = this.f2493i;
            aVar = list.get(list.size() - 1);
            view = m3222a(aVar, lVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            e.mo4778c(false);
            e.mo4776a((Object) null);
            int d = m3227d(a);
            boolean z = d == 1;
            this.f2501q = d;
            if (Build.VERSION.SDK_INT >= 26) {
                e.mo4743a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2499o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2498n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2499o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2498n & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                e.mo4753d(i3);
                e.mo4749b(true);
                e.mo4760h(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                e.mo4753d(i3);
                e.mo4749b(true);
                e.mo4760h(i2);
            }
            i3 = i + a;
            e.mo4753d(i3);
            e.mo4749b(true);
            e.mo4760h(i2);
        } else {
            if (this.f2502r) {
                e.mo4753d(this.f2504t);
            }
            if (this.f2503s) {
                e.mo4760h(this.f2505u);
            }
            e.mo4741a(mo3034d());
        }
        this.f2493i.add(new C0658a(e, lVar, this.f2501q));
        e.mo2705v();
        ListView x = e.mo2707x();
        x.setOnKeyListener(this);
        if (aVar == null && this.f2507w && lVar.mo2892h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1109g.abc_popup_menu_header_item_layout, x, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(lVar.mo2892h());
            x.addHeaderView(frameLayout, (Object) null, false);
            e.mo2705v();
        }
    }

    /* renamed from: e */
    private C0907wa m3229e() {
        C0907wa waVar = new C0907wa(this.f2486b, (AttributeSet) null, this.f2488d, this.f2489e);
        waVar.mo4775a(this.f2496l);
        waVar.mo4744a((AdapterView.OnItemClickListener) this);
        waVar.mo4745a((PopupWindow.OnDismissListener) this);
        waVar.mo4743a(this.f2499o);
        waVar.mo4751c(this.f2498n);
        waVar.mo4746a(true);
        waVar.mo4755e(2);
        return waVar;
    }

    /* renamed from: f */
    private int m3230f() {
        return C0487v.m2293i(this.f2499o) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo2693a(int i) {
        if (this.f2497m != i) {
            this.f2497m = i;
            this.f2498n = C0466f.m2170a(i, C0487v.m2293i(this.f2499o));
        }
    }

    /* renamed from: a */
    public void mo316a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo2694a(C0662l lVar) {
        lVar.mo2857a((C0679v) this, this.f2486b);
        if (mo2706w()) {
            m3228d(lVar);
        } else {
            this.f2492h.add(lVar);
        }
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        int c = m3226c(lVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f2493i.size()) {
                this.f2493i.get(i).f2512b.mo2860a(false);
            }
            C0658a remove = this.f2493i.remove(c);
            remove.f2512b.mo2874b((C0679v) this);
            if (this.f2485A) {
                remove.f2511a.mo4777b((Object) null);
                remove.f2511a.mo4740a(0);
            }
            remove.f2511a.dismiss();
            int size = this.f2493i.size();
            this.f2501q = size > 0 ? this.f2493i.get(size - 1).f2513c : m3230f();
            if (size == 0) {
                dismiss();
                C0679v.C0680a aVar = this.f2508x;
                if (aVar != null) {
                    aVar.mo2484a(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f2509y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f2509y.removeGlobalOnLayoutListener(this.f2494j);
                    }
                    this.f2509y = null;
                }
                this.f2500p.removeOnAttachStateChangeListener(this.f2495k);
                this.f2510z.onDismiss();
            } else if (z) {
                this.f2493i.get(0).f2512b.mo2860a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo2695a(C0679v.C0680a aVar) {
        this.f2508x = aVar;
    }

    /* renamed from: a */
    public void mo2696a(View view) {
        if (this.f2499o != view) {
            this.f2499o = view;
            this.f2498n = C0466f.m2170a(this.f2497m, C0487v.m2293i(this.f2499o));
        }
    }

    /* renamed from: a */
    public void mo2697a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2510z = onDismissListener;
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        for (C0658a a : this.f2493i) {
            C0676s.m3372a(a.mo2827a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo322a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        for (C0658a next : this.f2493i) {
            if (d == next.f2512b) {
                next.mo2827a().requestFocus();
                return true;
            }
        }
        if (!d.hasVisibleItems()) {
            return false;
        }
        mo2694a((C0662l) d);
        C0679v.C0680a aVar = this.f2508x;
        if (aVar != null) {
            aVar.mo2485a(d);
        }
        return true;
    }

    /* renamed from: b */
    public Parcelable mo325b() {
        return null;
    }

    /* renamed from: b */
    public void mo2698b(int i) {
        this.f2502r = true;
        this.f2504t = i;
    }

    /* renamed from: b */
    public void mo2699b(boolean z) {
        this.f2506v = z;
    }

    /* renamed from: c */
    public void mo2700c(int i) {
        this.f2503s = true;
        this.f2505u = i;
    }

    /* renamed from: c */
    public void mo2701c(boolean z) {
        this.f2507w = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2824c() {
        return false;
    }

    public void dismiss() {
        int size = this.f2493i.size();
        if (size > 0) {
            C0658a[] aVarArr = (C0658a[]) this.f2493i.toArray(new C0658a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0658a aVar = aVarArr[i];
                if (aVar.f2511a.mo2706w()) {
                    aVar.f2511a.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        C0658a aVar;
        int size = this.f2493i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f2493i.get(i);
            if (!aVar.f2511a.mo2706w()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f2512b.mo2860a(false);
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
        if (!mo2706w()) {
            for (C0662l d : this.f2492h) {
                m3228d(d);
            }
            this.f2492h.clear();
            this.f2500p = this.f2499o;
            if (this.f2500p != null) {
                boolean z = this.f2509y == null;
                this.f2509y = this.f2500p.getViewTreeObserver();
                if (z) {
                    this.f2509y.addOnGlobalLayoutListener(this.f2494j);
                }
                this.f2500p.addOnAttachStateChangeListener(this.f2495k);
            }
        }
    }

    /* renamed from: w */
    public boolean mo2706w() {
        return this.f2493i.size() > 0 && this.f2493i.get(0).f2511a.mo2706w();
    }

    /* renamed from: x */
    public ListView mo2707x() {
        if (this.f2493i.isEmpty()) {
            return null;
        }
        List<C0658a> list = this.f2493i;
        return list.get(list.size() - 1).mo2827a();
    }
}
