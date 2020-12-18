package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0565s;
import android.support.p011v7.view.menu.C0685z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.ua */
public class C0896ua implements C0685z {

    /* renamed from: a */
    private static Method f3658a;

    /* renamed from: b */
    private static Method f3659b;

    /* renamed from: c */
    private static Method f3660c;

    /* renamed from: A */
    final C0901e f3661A;

    /* renamed from: B */
    private final C0900d f3662B;

    /* renamed from: C */
    private final C0899c f3663C;

    /* renamed from: D */
    private final C0897a f3664D;

    /* renamed from: E */
    private Runnable f3665E;

    /* renamed from: F */
    final Handler f3666F;

    /* renamed from: G */
    private final Rect f3667G;

    /* renamed from: H */
    private Rect f3668H;

    /* renamed from: I */
    private boolean f3669I;

    /* renamed from: J */
    PopupWindow f3670J;

    /* renamed from: d */
    private Context f3671d;

    /* renamed from: e */
    private ListAdapter f3672e;

    /* renamed from: f */
    C0837ha f3673f;

    /* renamed from: g */
    private int f3674g;

    /* renamed from: h */
    private int f3675h;

    /* renamed from: i */
    private int f3676i;

    /* renamed from: j */
    private int f3677j;

    /* renamed from: k */
    private int f3678k;

    /* renamed from: l */
    private boolean f3679l;

    /* renamed from: m */
    private boolean f3680m;

    /* renamed from: n */
    private boolean f3681n;

    /* renamed from: o */
    private boolean f3682o;

    /* renamed from: p */
    private int f3683p;

    /* renamed from: q */
    private boolean f3684q;

    /* renamed from: r */
    private boolean f3685r;

    /* renamed from: s */
    int f3686s;

    /* renamed from: t */
    private View f3687t;

    /* renamed from: u */
    private int f3688u;

    /* renamed from: v */
    private DataSetObserver f3689v;

    /* renamed from: w */
    private View f3690w;

    /* renamed from: x */
    private Drawable f3691x;

    /* renamed from: y */
    private AdapterView.OnItemClickListener f3692y;

    /* renamed from: z */
    private AdapterView.OnItemSelectedListener f3693z;

    /* renamed from: android.support.v7.widget.ua$a */
    private class C0897a implements Runnable {
        C0897a() {
        }

        public void run() {
            C0896ua.this.mo4739a();
        }
    }

    /* renamed from: android.support.v7.widget.ua$b */
    private class C0898b extends DataSetObserver {
        C0898b() {
        }

        public void onChanged() {
            if (C0896ua.this.mo2706w()) {
                C0896ua.this.mo2705v();
            }
        }

        public void onInvalidated() {
            C0896ua.this.dismiss();
        }
    }

    /* renamed from: android.support.v7.widget.ua$c */
    private class C0899c implements AbsListView.OnScrollListener {
        C0899c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0896ua.this.mo4759g() && C0896ua.this.f3670J.getContentView() != null) {
                C0896ua uaVar = C0896ua.this;
                uaVar.f3666F.removeCallbacks(uaVar.f3661A);
                C0896ua.this.f3661A.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ua$d */
    private class C0900d implements View.OnTouchListener {
        C0900d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0896ua.this.f3670J) != null && popupWindow.isShowing() && x >= 0 && x < C0896ua.this.f3670J.getWidth() && y >= 0 && y < C0896ua.this.f3670J.getHeight()) {
                C0896ua uaVar = C0896ua.this;
                uaVar.f3666F.postDelayed(uaVar.f3661A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0896ua uaVar2 = C0896ua.this;
                uaVar2.f3666F.removeCallbacks(uaVar2.f3661A);
                return false;
            }
        }
    }

    /* renamed from: android.support.v7.widget.ua$e */
    private class C0901e implements Runnable {
        C0901e() {
        }

        public void run() {
            C0837ha haVar = C0896ua.this.f3673f;
            if (haVar != null && C0487v.m2308x(haVar) && C0896ua.this.f3673f.getCount() > C0896ua.this.f3673f.getChildCount()) {
                int childCount = C0896ua.this.f3673f.getChildCount();
                C0896ua uaVar = C0896ua.this;
                if (childCount <= uaVar.f3686s) {
                    uaVar.f3670J.setInputMethodMode(2);
                    C0896ua.this.mo2705v();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f3658a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f3659b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f3660c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0896ua(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0896ua(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3674g = -2;
        this.f3675h = -2;
        this.f3678k = 1002;
        this.f3680m = true;
        this.f3683p = 0;
        this.f3684q = false;
        this.f3685r = false;
        this.f3686s = Integer.MAX_VALUE;
        this.f3688u = 0;
        this.f3661A = new C0901e();
        this.f3662B = new C0900d();
        this.f3663C = new C0899c();
        this.f3664D = new C0897a();
        this.f3667G = new Rect();
        this.f3671d = context;
        this.f3666F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.ListPopupWindow, i, i2);
        this.f3676i = obtainStyledAttributes.getDimensionPixelOffset(C1112j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f3677j = obtainStyledAttributes.getDimensionPixelOffset(C1112j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f3677j != 0) {
            this.f3679l = true;
        }
        obtainStyledAttributes.recycle();
        this.f3670J = new C0903v(context, attributeSet, i, i2);
        this.f3670J.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m5107a(View view, int i, boolean z) {
        Method method = f3659b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f3670J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3670J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void mo4778c(boolean z) {
        Method method = f3658a;
        if (method != null) {
            try {
                method.invoke(this.f3670J, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.support.v7.widget.ha} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.support.v7.widget.ha} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: android.support.v7.widget.ha} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0153  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo3274i() {
        /*
            r12 = this;
            android.support.v7.widget.ha r0 = r12.f3673f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00c0
            android.content.Context r0 = r12.f3671d
            android.support.v7.widget.sa r5 = new android.support.v7.widget.sa
            r5.<init>(r12)
            r12.f3665E = r5
            boolean r5 = r12.f3669I
            r5 = r5 ^ r3
            android.support.v7.widget.ha r5 = r12.mo4738a(r0, r5)
            r12.f3673f = r5
            android.graphics.drawable.Drawable r5 = r12.f3691x
            if (r5 == 0) goto L_0x0024
            android.support.v7.widget.ha r6 = r12.f3673f
            r6.setSelector(r5)
        L_0x0024:
            android.support.v7.widget.ha r5 = r12.f3673f
            android.widget.ListAdapter r6 = r12.f3672e
            r5.setAdapter(r6)
            android.support.v7.widget.ha r5 = r12.f3673f
            android.widget.AdapterView$OnItemClickListener r6 = r12.f3692y
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.ha r5 = r12.f3673f
            r5.setFocusable(r3)
            android.support.v7.widget.ha r5 = r12.f3673f
            r5.setFocusableInTouchMode(r3)
            android.support.v7.widget.ha r5 = r12.f3673f
            android.support.v7.widget.ta r6 = new android.support.v7.widget.ta
            r6.<init>(r12)
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.ha r5 = r12.f3673f
            android.support.v7.widget.ua$c r6 = r12.f3663C
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f3693z
            if (r5 == 0) goto L_0x0056
            android.support.v7.widget.ha r6 = r12.f3673f
            r6.setOnItemSelectedListener(r5)
        L_0x0056:
            android.support.v7.widget.ha r5 = r12.f3673f
            android.view.View r6 = r12.f3687t
            if (r6 == 0) goto L_0x00b9
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f3688u
            if (r8 == 0) goto L_0x0091
            if (r8 == r3) goto L_0x008a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f3688u
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0097
        L_0x008a:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0097
        L_0x0091:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0097:
            int r0 = r12.f3675h
            if (r0 < 0) goto L_0x009d
            r5 = r1
            goto L_0x009f
        L_0x009d:
            r0 = r4
            r5 = r0
        L_0x009f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00ba
        L_0x00b9:
            r0 = r4
        L_0x00ba:
            android.widget.PopupWindow r6 = r12.f3670J
            r6.setContentView(r5)
            goto L_0x00de
        L_0x00c0:
            android.widget.PopupWindow r0 = r12.f3670J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f3687t
            if (r0 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00de
        L_0x00dd:
            r0 = r4
        L_0x00de:
            android.widget.PopupWindow r5 = r12.f3670J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00fa
            android.graphics.Rect r6 = r12.f3667G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f3667G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f3679l
            if (r7 != 0) goto L_0x0100
            int r6 = -r6
            r12.f3677j = r6
            goto L_0x0100
        L_0x00fa:
            android.graphics.Rect r5 = r12.f3667G
            r5.setEmpty()
            r5 = r4
        L_0x0100:
            android.widget.PopupWindow r6 = r12.f3670J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r3 = r4
        L_0x010b:
            android.view.View r4 = r12.mo4747b()
            int r6 = r12.f3677j
            int r3 = r12.m5107a(r4, r6, r3)
            boolean r4 = r12.f3684q
            if (r4 != 0) goto L_0x0164
            int r4 = r12.f3674g
            if (r4 != r2) goto L_0x011e
            goto L_0x0164
        L_0x011e:
            int r4 = r12.f3675h
            r6 = -2
            if (r4 == r6) goto L_0x012d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012d
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x012b:
            r7 = r1
            goto L_0x0146
        L_0x012d:
            android.content.Context r2 = r12.f3671d
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f3667G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x012b
        L_0x0146:
            android.support.v7.widget.ha r6 = r12.f3673f
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo4492a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0162
            android.support.v7.widget.ha r2 = r12.f3673f
            int r2 = r2.getPaddingTop()
            android.support.v7.widget.ha r3 = r12.f3673f
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0162:
            int r1 = r1 + r0
            return r1
        L_0x0164:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0896ua.mo3274i():int");
    }

    /* renamed from: j */
    private void mo3275j() {
        View view = this.f3687t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3687t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0837ha mo4738a(Context context, boolean z) {
        return new C0837ha(context, z);
    }

    /* renamed from: a */
    public void mo4739a() {
        C0837ha haVar = this.f3673f;
        if (haVar != null) {
            haVar.setListSelectionHidden(true);
            haVar.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo4740a(int i) {
        this.f3670J.setAnimationStyle(i);
    }

    /* renamed from: a */
    public void mo4741a(Rect rect) {
        this.f3668H = rect;
    }

    /* renamed from: a */
    public void mo4742a(Drawable drawable) {
        this.f3670J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo4743a(View view) {
        this.f3690w = view;
    }

    /* renamed from: a */
    public void mo4744a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3692y = onItemClickListener;
    }

    /* renamed from: a */
    public void mo3271a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3689v;
        if (dataSetObserver == null) {
            this.f3689v = new C0898b();
        } else {
            ListAdapter listAdapter2 = this.f3672e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3672e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3689v);
        }
        C0837ha haVar = this.f3673f;
        if (haVar != null) {
            haVar.setAdapter(this.f3672e);
        }
    }

    /* renamed from: a */
    public void mo4745a(PopupWindow.OnDismissListener onDismissListener) {
        this.f3670J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo4746a(boolean z) {
        this.f3669I = z;
        this.f3670J.setFocusable(z);
    }

    /* renamed from: b */
    public View mo4747b() {
        return this.f3690w;
    }

    /* renamed from: b */
    public void mo4748b(int i) {
        Drawable background = this.f3670J.getBackground();
        if (background != null) {
            background.getPadding(this.f3667G);
            Rect rect = this.f3667G;
            this.f3675h = rect.left + rect.right + i;
            return;
        }
        mo4762i(i);
    }

    /* renamed from: b */
    public void mo4749b(boolean z) {
        this.f3682o = true;
        this.f3681n = z;
    }

    /* renamed from: c */
    public Drawable mo4750c() {
        return this.f3670J.getBackground();
    }

    /* renamed from: c */
    public void mo4751c(int i) {
        this.f3683p = i;
    }

    /* renamed from: d */
    public int mo4752d() {
        return this.f3676i;
    }

    /* renamed from: d */
    public void mo4753d(int i) {
        this.f3676i = i;
    }

    public void dismiss() {
        this.f3670J.dismiss();
        mo3275j();
        this.f3670J.setContentView((View) null);
        this.f3673f = null;
        this.f3666F.removeCallbacks(this.f3661A);
    }

    /* renamed from: e */
    public int mo4754e() {
        if (!this.f3679l) {
            return 0;
        }
        return this.f3677j;
    }

    /* renamed from: e */
    public void mo4755e(int i) {
        this.f3670J.setInputMethodMode(i);
    }

    /* renamed from: f */
    public int mo4756f() {
        return this.f3675h;
    }

    /* renamed from: f */
    public void mo4757f(int i) {
        this.f3688u = i;
    }

    /* renamed from: g */
    public void mo4758g(int i) {
        C0837ha haVar = this.f3673f;
        if (mo2706w() && haVar != null) {
            haVar.setListSelectionHidden(false);
            haVar.setSelection(i);
            if (haVar.getChoiceMode() != 0) {
                haVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: g */
    public boolean mo4759g() {
        return this.f3670J.getInputMethodMode() == 2;
    }

    /* renamed from: h */
    public void mo4760h(int i) {
        this.f3677j = i;
        this.f3679l = true;
    }

    /* renamed from: h */
    public boolean mo4761h() {
        return this.f3669I;
    }

    /* renamed from: i */
    public void mo4762i(int i) {
        this.f3675h = i;
    }

    /* renamed from: v */
    public void mo2705v() {
        int i = mo3274i();
        boolean g = mo4759g();
        C0565s.m2763a(this.f3670J, this.f3678k);
        boolean z = true;
        if (!this.f3670J.isShowing()) {
            int i2 = this.f3675h;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = mo4747b().getWidth();
            }
            int i3 = this.f3674g;
            if (i3 == -1) {
                i = -1;
            } else if (i3 != -2) {
                i = i3;
            }
            this.f3670J.setWidth(i2);
            this.f3670J.setHeight(i);
            mo4778c(true);
            this.f3670J.setOutsideTouchable(!this.f3685r && !this.f3684q);
            this.f3670J.setTouchInterceptor(this.f3662B);
            if (this.f3682o) {
                C0565s.m2765a(this.f3670J, this.f3681n);
            }
            Method method = f3660c;
            if (method != null) {
                try {
                    method.invoke(this.f3670J, new Object[]{this.f3668H});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0565s.m2764a(this.f3670J, mo4747b(), this.f3676i, this.f3677j, this.f3683p);
            this.f3673f.setSelection(-1);
            if (!this.f3669I || this.f3673f.isInTouchMode()) {
                mo4739a();
            }
            if (!this.f3669I) {
                this.f3666F.post(this.f3664D);
            }
        } else if (C0487v.m2308x(mo4747b())) {
            int i4 = this.f3675h;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = mo4747b().getWidth();
            }
            int i5 = this.f3674g;
            if (i5 == -1) {
                if (!g) {
                    i = -1;
                }
                if (g) {
                    this.f3670J.setWidth(this.f3675h == -1 ? -1 : 0);
                    this.f3670J.setHeight(0);
                } else {
                    this.f3670J.setWidth(this.f3675h == -1 ? -1 : 0);
                    this.f3670J.setHeight(-1);
                }
            } else if (i5 != -2) {
                i = i5;
            }
            PopupWindow popupWindow = this.f3670J;
            if (this.f3685r || this.f3684q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f3670J.update(mo4747b(), this.f3676i, this.f3677j, i4 < 0 ? -1 : i4, i < 0 ? -1 : i);
        }
    }

    /* renamed from: w */
    public boolean mo2706w() {
        return this.f3670J.isShowing();
    }

    /* renamed from: x */
    public ListView mo2707x() {
        return this.f3673f;
    }
}
