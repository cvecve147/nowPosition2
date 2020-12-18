package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0470h;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.view.menu.C0647D;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;
import p013b.p018b.p040i.p050h.C1138c;
import p013b.p018b.p040i.p050h.C1143g;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f3268A;

    /* renamed from: B */
    private boolean f3269B;

    /* renamed from: C */
    private boolean f3270C;

    /* renamed from: D */
    private final ArrayList<View> f3271D;

    /* renamed from: E */
    private final ArrayList<View> f3272E;

    /* renamed from: F */
    private final int[] f3273F;

    /* renamed from: G */
    C0795c f3274G;

    /* renamed from: H */
    private final ActionMenuView.C0700e f3275H;

    /* renamed from: I */
    private C0857lb f3276I;

    /* renamed from: J */
    private ActionMenuPresenter f3277J;

    /* renamed from: K */
    private C0793a f3278K;

    /* renamed from: L */
    private C0679v.C0680a f3279L;

    /* renamed from: M */
    private C0662l.C0663a f3280M;

    /* renamed from: N */
    private boolean f3281N;

    /* renamed from: O */
    private final Runnable f3282O;

    /* renamed from: a */
    private ActionMenuView f3283a;

    /* renamed from: b */
    private TextView f3284b;

    /* renamed from: c */
    private TextView f3285c;

    /* renamed from: d */
    private ImageButton f3286d;

    /* renamed from: e */
    private ImageView f3287e;

    /* renamed from: f */
    private Drawable f3288f;

    /* renamed from: g */
    private CharSequence f3289g;

    /* renamed from: h */
    ImageButton f3290h;

    /* renamed from: i */
    View f3291i;

    /* renamed from: j */
    private Context f3292j;

    /* renamed from: k */
    private int f3293k;

    /* renamed from: l */
    private int f3294l;

    /* renamed from: m */
    private int f3295m;

    /* renamed from: n */
    int f3296n;

    /* renamed from: o */
    private int f3297o;

    /* renamed from: p */
    private int f3298p;

    /* renamed from: q */
    private int f3299q;

    /* renamed from: r */
    private int f3300r;

    /* renamed from: s */
    private int f3301s;

    /* renamed from: t */
    private C0739Oa f3302t;

    /* renamed from: u */
    private int f3303u;

    /* renamed from: v */
    private int f3304v;

    /* renamed from: w */
    private int f3305w;

    /* renamed from: x */
    private CharSequence f3306x;

    /* renamed from: y */
    private CharSequence f3307y;

    /* renamed from: z */
    private int f3308z;

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0843ib();

        /* renamed from: a */
        int f3309a;

        /* renamed from: b */
        boolean f3310b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3309a = parcel.readInt();
            this.f3310b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3309a);
            parcel.writeInt(this.f3310b ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0793a implements C0679v {

        /* renamed from: a */
        C0662l f3311a;

        /* renamed from: b */
        C0668p f3312b;

        C0793a() {
        }

        /* renamed from: a */
        public void mo313a(Context context, C0662l lVar) {
            C0668p pVar;
            C0662l lVar2 = this.f3311a;
            if (!(lVar2 == null || (pVar = this.f3312b) == null)) {
                lVar2.mo2710a(pVar);
            }
            this.f3311a = lVar;
        }

        /* renamed from: a */
        public void mo316a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo318a(C0662l lVar, boolean z) {
        }

        /* renamed from: a */
        public void mo321a(boolean z) {
            if (this.f3312b != null) {
                C0662l lVar = this.f3311a;
                boolean z2 = false;
                if (lVar != null) {
                    int size = lVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f3311a.getItem(i) == this.f3312b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo329b(this.f3311a, this.f3312b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo322a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo323a(C0647D d) {
            return false;
        }

        /* renamed from: a */
        public boolean mo324a(C0662l lVar, C0668p pVar) {
            Toolbar.this.mo4279e();
            ViewParent parent = Toolbar.this.f3290h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3290h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3290h);
            }
            Toolbar.this.f3291i = pVar.getActionView();
            this.f3312b = pVar;
            ViewParent parent2 = Toolbar.this.f3291i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f3291i);
                }
                C0794b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2315a = 8388611 | (toolbar4.f3296n & 112);
                generateDefaultLayoutParams.f3314b = 2;
                toolbar4.f3291i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3291i);
            }
            Toolbar.this.mo4313j();
            Toolbar.this.requestLayout();
            pVar.mo2918a(true);
            View view = Toolbar.this.f3291i;
            if (view instanceof C1138c) {
                ((C1138c) view).onActionViewExpanded();
            }
            return true;
        }

        /* renamed from: b */
        public Parcelable mo325b() {
            return null;
        }

        /* renamed from: b */
        public boolean mo329b(C0662l lVar, C0668p pVar) {
            View view = Toolbar.this.f3291i;
            if (view instanceof C1138c) {
                ((C1138c) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3291i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3290h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3291i = null;
            toolbar3.mo4269a();
            this.f3312b = null;
            Toolbar.this.requestLayout();
            pVar.mo2918a(false);
            return true;
        }

        public int getId() {
            return 0;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0794b extends C0607a.C0608a {

        /* renamed from: b */
        int f3314b = 0;

        public C0794b(int i, int i2) {
            super(i, i2);
            this.f2315a = 8388627;
        }

        public C0794b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0794b(C0607a.C0608a aVar) {
            super(aVar);
        }

        public C0794b(C0794b bVar) {
            super((C0607a.C0608a) bVar);
            this.f3314b = bVar.f3314b;
        }

        public C0794b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0794b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo4348a(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4348a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0795c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3305w = 8388627;
        this.f3271D = new ArrayList<>();
        this.f3272E = new ArrayList<>();
        this.f3273F = new int[2];
        this.f3275H = new C0832fb(this);
        this.f3282O = new C0835gb(this);
        C0829eb a = C0829eb.m4793a(getContext(), attributeSet, C1112j.Toolbar, i, 0);
        this.f3294l = a.mo4486g(C1112j.Toolbar_titleTextAppearance, 0);
        this.f3295m = a.mo4486g(C1112j.Toolbar_subtitleTextAppearance, 0);
        this.f3305w = a.mo4482e(C1112j.Toolbar_android_gravity, this.f3305w);
        this.f3296n = a.mo4482e(C1112j.Toolbar_buttonGravity, 48);
        int b = a.mo4476b(C1112j.Toolbar_titleMargin, 0);
        b = a.mo4487g(C1112j.Toolbar_titleMargins) ? a.mo4476b(C1112j.Toolbar_titleMargins, b) : b;
        this.f3301s = b;
        this.f3300r = b;
        this.f3299q = b;
        this.f3298p = b;
        int b2 = a.mo4476b(C1112j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f3298p = b2;
        }
        int b3 = a.mo4476b(C1112j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f3299q = b3;
        }
        int b4 = a.mo4476b(C1112j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f3300r = b4;
        }
        int b5 = a.mo4476b(C1112j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f3301s = b5;
        }
        this.f3297o = a.mo4478c(C1112j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo4476b(C1112j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo4476b(C1112j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo4478c(C1112j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo4478c(C1112j.Toolbar_contentInsetRight, 0);
        m4636l();
        this.f3302t.mo3594a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f3302t.mo3597b(b6, b7);
        }
        this.f3303u = a.mo4476b(C1112j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3304v = a.mo4476b(C1112j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3288f = a.mo4477b(C1112j.Toolbar_collapseIcon);
        this.f3289g = a.mo4483e(C1112j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo4483e(C1112j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo4483e(C1112j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f3292j = getContext();
        setPopupTheme(a.mo4486g(C1112j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo4477b(C1112j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo4483e(C1112j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo4477b(C1112j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo4483e(C1112j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo4487g(C1112j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo4471a(C1112j.Toolbar_titleTextColor, -1));
        }
        if (a.mo4487g(C1112j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo4471a(C1112j.Toolbar_subtitleTextColor, -1));
        }
        a.mo4474a();
    }

    /* renamed from: a */
    private int m4622a(int i) {
        int i2 = C0487v.m2293i(this);
        int a = C0466f.m2170a(i, i2) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : i2 == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private int m4623a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0470h.m2178b(marginLayoutParams) + C0470h.m2176a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m4624a(View view, int i) {
        C0794b bVar = (C0794b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int b = m4631b(bVar.f2315a);
        if (b == 48) {
            return getPaddingTop() - i2;
        }
        if (b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = bVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = bVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m4625a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m4626a(View view, int i, int[] iArr, int i2) {
        C0794b bVar = (C0794b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m4624a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: a */
    private int m4627a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            C0794b bVar = (C0794b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i5;
            int i8 = bVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i5 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private void m4628a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m4629a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0794b generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0794b) layoutParams;
        generateDefaultLayoutParams.f3314b = 1;
        if (!z || this.f3291i == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f3272E.add(view);
    }

    /* renamed from: a */
    private void m4630a(List<View> list, int i) {
        boolean z = C0487v.m2293i(this) == 1;
        int childCount = getChildCount();
        int a = C0466f.m2170a(i, C0487v.m2293i(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0794b bVar = (C0794b) childAt.getLayoutParams();
                if (bVar.f3314b == 0 && m4635d(childAt) && m4622a(bVar.f2315a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0794b bVar2 = (C0794b) childAt2.getLayoutParams();
            if (bVar2.f3314b == 0 && m4635d(childAt2) && m4622a(bVar2.f2315a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m4631b(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f3305w & 112;
    }

    /* renamed from: b */
    private int m4632b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m4633b(View view, int i, int[] iArr, int i2) {
        C0794b bVar = (C0794b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m4624a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: c */
    private boolean m4634c(View view) {
        return view.getParent() == this || this.f3272E.contains(view);
    }

    /* renamed from: d */
    private boolean m4635d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C1143g(getContext());
    }

    /* renamed from: l */
    private void m4636l() {
        if (this.f3302t == null) {
            this.f3302t = new C0739Oa();
        }
    }

    /* renamed from: m */
    private void m4637m() {
        if (this.f3287e == null) {
            this.f3287e = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m4638n() {
        m4639o();
        if (this.f3283a.mo3206h() == null) {
            C0662l lVar = (C0662l) this.f3283a.getMenu();
            if (this.f3278K == null) {
                this.f3278K = new C0793a();
            }
            this.f3283a.setExpandedActionViewsExclusive(true);
            lVar.mo2857a((C0679v) this.f3278K, this.f3292j);
        }
    }

    /* renamed from: o */
    private void m4639o() {
        if (this.f3283a == null) {
            this.f3283a = new ActionMenuView(getContext());
            this.f3283a.setPopupTheme(this.f3293k);
            this.f3283a.setOnMenuItemClickListener(this.f3275H);
            this.f3283a.mo3189a(this.f3279L, this.f3280M);
            C0794b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2315a = 8388613 | (this.f3296n & 112);
            this.f3283a.setLayoutParams(generateDefaultLayoutParams);
            m4629a((View) this.f3283a, false);
        }
    }

    /* renamed from: p */
    private void m4640p() {
        if (this.f3286d == null) {
            this.f3286d = new C0885s(getContext(), (AttributeSet) null, C1103a.toolbarNavigationButtonStyle);
            C0794b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2315a = 8388611 | (this.f3296n & 112);
            this.f3286d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m4641q() {
        removeCallbacks(this.f3282O);
        post(this.f3282O);
    }

    /* renamed from: r */
    private boolean m4642r() {
        if (!this.f3281N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m4635d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4269a() {
        for (int size = this.f3272E.size() - 1; size >= 0; size--) {
            addView(this.f3272E.get(size));
        }
        this.f3272E.clear();
    }

    /* renamed from: a */
    public void mo4270a(int i, int i2) {
        m4636l();
        this.f3302t.mo3597b(i, i2);
    }

    /* renamed from: a */
    public void mo4271a(Context context, int i) {
        this.f3295m = i;
        TextView textView = this.f3285c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo4272a(C0662l lVar, ActionMenuPresenter actionMenuPresenter) {
        if (lVar != null || this.f3283a != null) {
            m4639o();
            C0662l h = this.f3283a.mo3206h();
            if (h != lVar) {
                if (h != null) {
                    h.mo2874b((C0679v) this.f3277J);
                    h.mo2874b((C0679v) this.f3278K);
                }
                if (this.f3278K == null) {
                    this.f3278K = new C0793a();
                }
                actionMenuPresenter.mo3175b(true);
                if (lVar != null) {
                    lVar.mo2857a((C0679v) actionMenuPresenter, this.f3292j);
                    lVar.mo2857a((C0679v) this.f3278K, this.f3292j);
                } else {
                    actionMenuPresenter.mo313a(this.f3292j, (C0662l) null);
                    this.f3278K.mo313a(this.f3292j, (C0662l) null);
                    actionMenuPresenter.mo321a(true);
                    this.f3278K.mo321a(true);
                }
                this.f3283a.setPopupTheme(this.f3293k);
                this.f3283a.setPresenter(actionMenuPresenter);
                this.f3277J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: a */
    public void mo4273a(C0679v.C0680a aVar, C0662l.C0663a aVar2) {
        this.f3279L = aVar;
        this.f3280M = aVar2;
        ActionMenuView actionMenuView = this.f3283a;
        if (actionMenuView != null) {
            actionMenuView.mo3189a(aVar, aVar2);
        }
    }

    /* renamed from: b */
    public void mo4274b(Context context, int i) {
        this.f3294l = i;
        TextView textView = this.f3284b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3283a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4275b() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            android.support.v7.widget.ActionMenuView r0 = r1.f3283a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo3198g()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.Toolbar.mo4275b():boolean");
    }

    /* renamed from: c */
    public void mo4276c() {
        C0793a aVar = this.f3278K;
        C0668p pVar = aVar == null ? null : aVar.f3312b;
        if (pVar != null) {
            pVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0794b);
    }

    /* renamed from: d */
    public void mo4278d() {
        ActionMenuView actionMenuView = this.f3283a;
        if (actionMenuView != null) {
            actionMenuView.mo3190b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4279e() {
        if (this.f3290h == null) {
            this.f3290h = new C0885s(getContext(), (AttributeSet) null, C1103a.toolbarNavigationButtonStyle);
            this.f3290h.setImageDrawable(this.f3288f);
            this.f3290h.setContentDescription(this.f3289g);
            C0794b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2315a = 8388611 | (this.f3296n & 112);
            generateDefaultLayoutParams.f3314b = 2;
            this.f3290h.setLayoutParams(generateDefaultLayoutParams);
            this.f3290h.setOnClickListener(new C0840hb(this));
        }
    }

    /* renamed from: f */
    public boolean mo4280f() {
        C0793a aVar = this.f3278K;
        return (aVar == null || aVar.f3312b == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo4281g() {
        ActionMenuView actionMenuView = this.f3283a;
        return actionMenuView != null && actionMenuView.mo3193d();
    }

    /* access modifiers changed from: protected */
    public C0794b generateDefaultLayoutParams() {
        return new C0794b(-2, -2);
    }

    public C0794b generateLayoutParams(AttributeSet attributeSet) {
        return new C0794b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0794b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0794b ? new C0794b((C0794b) layoutParams) : layoutParams instanceof C0607a.C0608a ? new C0794b((C0607a.C0608a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0794b((ViewGroup.MarginLayoutParams) layoutParams) : new C0794b(layoutParams);
    }

    public int getContentInsetEnd() {
        C0739Oa oa = this.f3302t;
        if (oa != null) {
            return oa.mo3593a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f3304v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0739Oa oa = this.f3302t;
        if (oa != null) {
            return oa.mo3596b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0739Oa oa = this.f3302t;
        if (oa != null) {
            return oa.mo3598c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0739Oa oa = this.f3302t;
        if (oa != null) {
            return oa.mo3599d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f3303u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo3206h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f3283a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            android.support.v7.view.menu.l r0 = r0.mo3206h()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f3304v
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0487v.m2293i(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0487v.m2293i(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3303u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3287e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3287e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m4638n();
        return this.f3283a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3286d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3286d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3277J;
    }

    public Drawable getOverflowIcon() {
        m4638n();
        return this.f3283a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f3292j;
    }

    public int getPopupTheme() {
        return this.f3293k;
    }

    public CharSequence getSubtitle() {
        return this.f3307y;
    }

    public CharSequence getTitle() {
        return this.f3306x;
    }

    public int getTitleMarginBottom() {
        return this.f3301s;
    }

    public int getTitleMarginEnd() {
        return this.f3299q;
    }

    public int getTitleMarginStart() {
        return this.f3298p;
    }

    public int getTitleMarginTop() {
        return this.f3300r;
    }

    public C0798V getWrapper() {
        if (this.f3276I == null) {
            this.f3276I = new C0857lb(this, true);
        }
        return this.f3276I;
    }

    /* renamed from: h */
    public boolean mo4311h() {
        ActionMenuView actionMenuView = this.f3283a;
        return actionMenuView != null && actionMenuView.mo3196e();
    }

    /* renamed from: i */
    public boolean mo4312i() {
        ActionMenuView actionMenuView = this.f3283a;
        return actionMenuView != null && actionMenuView.mo3197f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4313j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0794b) childAt.getLayoutParams()).f3314b == 2 || childAt == this.f3283a)) {
                removeViewAt(childCount);
                this.f3272E.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo4314k() {
        ActionMenuView actionMenuView = this.f3283a;
        return actionMenuView != null && actionMenuView.mo3207i();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3282O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3270C = false;
        }
        if (!this.f3270C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3270C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3270C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = android.support.p007v4.view.C0487v.m2293i(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f3273F
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p007v4.view.C0487v.m2294j(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f3286d
            boolean r13 = r0.m4635d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f3286d
            int r13 = r0.m4633b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f3286d
            int r13 = r0.m4626a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f3290h
            boolean r15 = r0.m4635d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f3290h
            int r14 = r0.m4633b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f3290h
            int r13 = r0.m4626a(r15, r13, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f3283a
            boolean r15 = r0.m4635d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f3283a
            int r13 = r0.m4626a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f3283a
            int r14 = r0.m4633b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f3291i
            boolean r13 = r0.m4635d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f3291i
            int r10 = r0.m4633b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f3291i
            int r2 = r0.m4626a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f3287e
            boolean r13 = r0.m4635d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f3287e
            int r10 = r0.m4633b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f3287e
            int r2 = r0.m4626a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f3284b
            boolean r13 = r0.m4635d(r13)
            android.widget.TextView r14 = r0.f3285c
            boolean r14 = r0.m4635d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f3284b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$b r15 = (android.support.p011v7.widget.Toolbar.C0794b) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f3284b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f3285c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p011v7.widget.Toolbar.C0794b) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f3285c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0296
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f3284b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f3285c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f3285c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f3284b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$b r4 = (android.support.p011v7.widget.Toolbar.C0794b) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p011v7.widget.Toolbar.C0794b) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f3284b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f3285c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f3305w
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019a
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f3300r
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0183
            int r6 = r12 + r2
            goto L_0x0198
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f3301s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0198
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0198:
            int r8 = r8 + r6
            goto L_0x01b7
        L_0x019a:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f3301s
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b7
        L_0x01a8:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f3300r
            int r8 = r2 + r3
        L_0x01b7:
            if (r1 == 0) goto L_0x022c
            if (r15 == 0) goto L_0x01bf
            int r3 = r0.f3298p
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = 1
            r3 = 0
        L_0x01c1:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f7
            android.widget.TextView r1 = r0.f3284b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p011v7.widget.Toolbar.C0794b) r1
            android.widget.TextView r2 = r0.f3284b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f3284b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f3284b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f3299q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f8
        L_0x01f7:
            r2 = r10
        L_0x01f8:
            if (r18 == 0) goto L_0x0220
            android.widget.TextView r1 = r0.f3285c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p011v7.widget.Toolbar.C0794b) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f3285c
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f3285c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3285c
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f3299q
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0221
        L_0x0220:
            r3 = r10
        L_0x0221:
            if (r15 == 0) goto L_0x0228
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0228:
            r2 = r24
            goto L_0x0128
        L_0x022c:
            if (r15 == 0) goto L_0x0231
            int r3 = r0.f3298p
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0268
            android.widget.TextView r1 = r0.f3284b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p011v7.widget.Toolbar.C0794b) r1
            android.widget.TextView r3 = r0.f3284b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f3284b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3284b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f3299q
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0269
        L_0x0268:
            r3 = r2
        L_0x0269:
            if (r18 == 0) goto L_0x028f
            android.widget.TextView r1 = r0.f3285c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p011v7.widget.Toolbar.C0794b) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f3285c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f3285c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f3285c
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f3299q
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            if (r15 == 0) goto L_0x0296
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0296:
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            r3 = 3
            r0.m4630a((java.util.List<android.view.View>) r1, (int) r3)
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            int r1 = r1.size()
            r3 = r2
            r2 = r7
        L_0x02a4:
            if (r2 >= r1) goto L_0x02b7
            java.util.ArrayList<android.view.View> r4 = r0.f3271D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m4626a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02b7:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            r2 = 5
            r0.m4630a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            int r1 = r1.size()
            r2 = r7
        L_0x02c6:
            if (r2 >= r1) goto L_0x02d7
            java.util.ArrayList<android.view.View> r4 = r0.f3271D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m4633b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d7:
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            r2 = 1
            r0.m4630a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            int r1 = r0.m4627a((java.util.List<android.view.View>) r1, (int[]) r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            if (r1 <= r10) goto L_0x02f9
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fa
        L_0x02f9:
            r3 = r2
        L_0x02fa:
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            int r1 = r1.size()
        L_0x0300:
            if (r7 >= r1) goto L_0x0311
            java.util.ArrayList<android.view.View> r2 = r0.f3271D
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m4626a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0311:
            java.util.ArrayList<android.view.View> r1 = r0.f3271D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f3273F;
        if (C0902ub.m5141a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (m4635d(this.f3286d)) {
            m4628a((View) this.f3286d, i, 0, i2, 0, this.f3297o);
            i5 = this.f3286d.getMeasuredWidth() + m4623a((View) this.f3286d);
            i4 = Math.max(0, this.f3286d.getMeasuredHeight() + m4632b((View) this.f3286d));
            i3 = View.combineMeasuredStates(0, this.f3286d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m4635d(this.f3290h)) {
            m4628a((View) this.f3290h, i, 0, i2, 0, this.f3297o);
            i5 = this.f3290h.getMeasuredWidth() + m4623a((View) this.f3290h);
            i4 = Math.max(i4, this.f3290h.getMeasuredHeight() + m4632b((View) this.f3290h));
            i3 = View.combineMeasuredStates(i3, this.f3290h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m4635d(this.f3283a)) {
            m4628a((View) this.f3283a, i, max, i2, 0, this.f3297o);
            i6 = this.f3283a.getMeasuredWidth() + m4623a((View) this.f3283a);
            i4 = Math.max(i4, this.f3283a.getMeasuredHeight() + m4632b((View) this.f3283a));
            i3 = View.combineMeasuredStates(i3, this.f3283a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m4635d(this.f3291i)) {
            max2 += m4625a(this.f3291i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3291i.getMeasuredHeight() + m4632b(this.f3291i));
            i3 = View.combineMeasuredStates(i3, this.f3291i.getMeasuredState());
        }
        if (m4635d(this.f3287e)) {
            max2 += m4625a((View) this.f3287e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3287e.getMeasuredHeight() + m4632b((View) this.f3287e));
            i3 = View.combineMeasuredStates(i3, this.f3287e.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0794b) childAt.getLayoutParams()).f3314b == 0 && m4635d(childAt)) {
                i11 += m4625a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m4632b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f3300r + this.f3301s;
        int i14 = this.f3298p + this.f3299q;
        if (m4635d(this.f3284b)) {
            m4625a((View) this.f3284b, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f3284b.getMeasuredWidth() + m4623a((View) this.f3284b);
            i7 = this.f3284b.getMeasuredHeight() + m4632b((View) this.f3284b);
            i9 = View.combineMeasuredStates(i3, this.f3284b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m4635d(this.f3285c)) {
            i8 = Math.max(i8, m4625a((View) this.f3285c, i, i11 + i14, i2, i7 + i13, iArr));
            i7 += this.f3285c.getMeasuredHeight() + m4632b((View) this.f3285c);
            i9 = View.combineMeasuredStates(i9, this.f3285c.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i10, i7);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m4642r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        ActionMenuView actionMenuView = this.f3283a;
        C0662l h = actionMenuView != null ? actionMenuView.mo3206h() : null;
        int i = savedState.f3309a;
        if (!(i == 0 || this.f3278K == null || h == null || (findItem = h.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f3310b) {
            m4641q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m4636l();
        C0739Oa oa = this.f3302t;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        oa.mo3595a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0668p pVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0793a aVar = this.f3278K;
        if (!(aVar == null || (pVar = aVar.f3312b) == null)) {
            savedState.f3309a = pVar.getItemId();
        }
        savedState.f3310b = mo4312i();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3269B = false;
        }
        if (!this.f3269B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3269B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3269B = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f3281N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3304v) {
            this.f3304v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3303u) {
            this.f3303u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1118b.m5721b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m4637m();
            if (!m4634c(this.f3287e)) {
                m4629a((View) this.f3287e, true);
            }
        } else {
            ImageView imageView = this.f3287e;
            if (imageView != null && m4634c(imageView)) {
                removeView(this.f3287e);
                this.f3272E.remove(this.f3287e);
            }
        }
        ImageView imageView2 = this.f3287e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4637m();
        }
        ImageView imageView = this.f3287e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4640p();
        }
        ImageButton imageButton = this.f3286d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1118b.m5721b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m4640p();
            if (!m4634c(this.f3286d)) {
                m4629a((View) this.f3286d, true);
            }
        } else {
            ImageButton imageButton = this.f3286d;
            if (imageButton != null && m4634c(imageButton)) {
                removeView(this.f3286d);
                this.f3272E.remove(this.f3286d);
            }
        }
        ImageButton imageButton2 = this.f3286d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m4640p();
        this.f3286d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0795c cVar) {
        this.f3274G = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m4638n();
        this.f3283a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f3293k != i) {
            this.f3293k = i;
            if (i == 0) {
                this.f3292j = getContext();
            } else {
                this.f3292j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3285c == null) {
                Context context = getContext();
                this.f3285c = new C0721I(context);
                this.f3285c.setSingleLine();
                this.f3285c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3295m;
                if (i != 0) {
                    this.f3285c.setTextAppearance(context, i);
                }
                int i2 = this.f3268A;
                if (i2 != 0) {
                    this.f3285c.setTextColor(i2);
                }
            }
            if (!m4634c(this.f3285c)) {
                m4629a((View) this.f3285c, true);
            }
        } else {
            TextView textView = this.f3285c;
            if (textView != null && m4634c(textView)) {
                removeView(this.f3285c);
                this.f3272E.remove(this.f3285c);
            }
        }
        TextView textView2 = this.f3285c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3307y = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f3268A = i;
        TextView textView = this.f3285c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3284b == null) {
                Context context = getContext();
                this.f3284b = new C0721I(context);
                this.f3284b.setSingleLine();
                this.f3284b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3294l;
                if (i != 0) {
                    this.f3284b.setTextAppearance(context, i);
                }
                int i2 = this.f3308z;
                if (i2 != 0) {
                    this.f3284b.setTextColor(i2);
                }
            }
            if (!m4634c(this.f3284b)) {
                m4629a((View) this.f3284b, true);
            }
        } else {
            TextView textView = this.f3284b;
            if (textView != null && m4634c(textView)) {
                removeView(this.f3284b);
                this.f3272E.remove(this.f3284b);
            }
        }
        TextView textView2 = this.f3284b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3306x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f3301s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f3299q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f3298p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f3300r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f3308z = i;
        TextView textView = this.f3284b;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
