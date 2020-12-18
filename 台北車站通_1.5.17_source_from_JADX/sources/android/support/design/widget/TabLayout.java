package android.support.design.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0483r;
import android.support.p007v4.view.C0484s;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.ViewPager;
import android.support.p007v4.widget.C0508D;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.widget.C0862mb;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpStatus;
import p013b.p018b.p022d.C0956b;
import p013b.p018b.p022d.C0960f;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;
import p013b.p018b.p028h.p039h.C1097n;
import p013b.p018b.p028h.p039h.C1098o;
import p013b.p018b.p028h.p039h.C1099p;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;

@ViewPager.C0435a
public class TabLayout extends HorizontalScrollView {

    /* renamed from: a */
    private static final C1097n<C0136e> f702a = new C1099p(16);

    /* renamed from: A */
    private DataSetObserver f703A;

    /* renamed from: B */
    private C0137f f704B;

    /* renamed from: C */
    private C0132a f705C;

    /* renamed from: D */
    private boolean f706D;

    /* renamed from: E */
    private final C1097n<C0138g> f707E;

    /* renamed from: b */
    private final ArrayList<C0136e> f708b;

    /* renamed from: c */
    private C0136e f709c;

    /* renamed from: d */
    private final C0135d f710d;

    /* renamed from: e */
    int f711e;

    /* renamed from: f */
    int f712f;

    /* renamed from: g */
    int f713g;

    /* renamed from: h */
    int f714h;

    /* renamed from: i */
    int f715i;

    /* renamed from: j */
    ColorStateList f716j;

    /* renamed from: k */
    float f717k;

    /* renamed from: l */
    float f718l;

    /* renamed from: m */
    final int f719m;

    /* renamed from: n */
    int f720n;

    /* renamed from: o */
    private final int f721o;

    /* renamed from: p */
    private final int f722p;

    /* renamed from: q */
    private final int f723q;

    /* renamed from: r */
    private int f724r;

    /* renamed from: s */
    int f725s;

    /* renamed from: t */
    int f726t;

    /* renamed from: u */
    private C0133b f727u;

    /* renamed from: v */
    private final ArrayList<C0133b> f728v;

    /* renamed from: w */
    private C0133b f729w;

    /* renamed from: x */
    private ValueAnimator f730x;

    /* renamed from: y */
    ViewPager f731y;

    /* renamed from: z */
    private C0483r f732z;

    /* renamed from: android.support.design.widget.TabLayout$a */
    private class C0132a implements ViewPager.C0439e {

        /* renamed from: a */
        private boolean f733a;

        C0132a() {
        }

        /* renamed from: a */
        public void mo746a(ViewPager viewPager, C0483r rVar, C0483r rVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f731y == viewPager) {
                tabLayout.mo714a(rVar2, this.f733a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo747a(boolean z) {
            this.f733a = z;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    public interface C0133b {
        /* renamed from: a */
        void mo748a(C0136e eVar);

        /* renamed from: b */
        void mo749b(C0136e eVar);

        /* renamed from: c */
        void mo750c(C0136e eVar);
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    private class C0134c extends DataSetObserver {
        C0134c() {
        }

        public void onChanged() {
            TabLayout.this.mo721b();
        }

        public void onInvalidated() {
            TabLayout.this.mo721b();
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    private class C0135d extends LinearLayout {

        /* renamed from: a */
        private int f736a;

        /* renamed from: b */
        private final Paint f737b;

        /* renamed from: c */
        int f738c = -1;

        /* renamed from: d */
        float f739d;

        /* renamed from: e */
        private int f740e = -1;

        /* renamed from: f */
        private int f741f = -1;

        /* renamed from: g */
        private int f742g = -1;

        /* renamed from: h */
        private ValueAnimator f743h;

        C0135d(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f737b = new Paint();
        }

        /* renamed from: c */
        private void m709c() {
            int i;
            int i2;
            View childAt = getChildAt(this.f738c);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f739d > 0.0f && this.f738c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f738c + 1);
                    float left = this.f739d * ((float) childAt2.getLeft());
                    float f = this.f739d;
                    i = (int) (left + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f739d) * ((float) i2)));
                }
            }
            mo759b(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo753a(int i) {
            if (this.f737b.getColor() != i) {
                this.f737b.setColor(i);
                C0487v.m2261B(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo754a(int i, float f) {
            ValueAnimator valueAnimator = this.f743h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f743h.cancel();
            }
            this.f738c = i;
            this.f739d = f;
            m709c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo755a(int i, int i2) {
            int i3;
            int i4;
            ValueAnimator valueAnimator = this.f743h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f743h.cancel();
            }
            boolean z = C0487v.m2293i(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                m709c();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (Math.abs(i - this.f738c) <= 1) {
                i4 = this.f741f;
                i3 = this.f742g;
            } else {
                int a = TabLayout.this.mo705a(24);
                i4 = (i >= this.f738c ? !z : z) ? left - a : a + right;
                i3 = i4;
            }
            if (i4 != left || i3 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f743h = valueAnimator2;
                valueAnimator2.setInterpolator(C0145a.f817b);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator2.addUpdateListener(new C0119J(this, i4, left, i3, right));
                valueAnimator2.addListener(new C0120K(this, i));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo756a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo757b() {
            return ((float) this.f738c) + this.f739d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo758b(int i) {
            if (this.f736a != i) {
                this.f736a = i;
                C0487v.m2261B(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo759b(int i, int i2) {
            if (i != this.f741f || i2 != this.f742g) {
                this.f741f = i;
                this.f742g = i2;
                C0487v.m2261B(this);
            }
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            int i = this.f741f;
            if (i >= 0 && this.f742g > i) {
                canvas.drawRect((float) i, (float) (getHeight() - this.f736a), (float) this.f742g, (float) getHeight(), this.f737b);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f743h;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m709c();
                return;
            }
            this.f743h.cancel();
            mo755a(this.f738c, Math.round((1.0f - this.f743h.getAnimatedFraction()) * ((float) this.f743h.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f726t == 1 && tabLayout.f725s == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.mo705a(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f725s = 0;
                            tabLayout2.mo715a(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f740e != i) {
                requestLayout();
                this.f740e = i;
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    public static final class C0136e {

        /* renamed from: a */
        private Object f745a;

        /* renamed from: b */
        private Drawable f746b;

        /* renamed from: c */
        private CharSequence f747c;

        /* renamed from: d */
        private CharSequence f748d;

        /* renamed from: e */
        private int f749e = -1;

        /* renamed from: f */
        private View f750f;

        /* renamed from: g */
        TabLayout f751g;

        /* renamed from: h */
        C0138g f752h;

        C0136e() {
        }

        /* renamed from: a */
        public C0136e mo764a(int i) {
            mo766a(LayoutInflater.from(this.f752h.getContext()).inflate(i, this.f752h, false));
            return this;
        }

        /* renamed from: a */
        public C0136e mo765a(Drawable drawable) {
            this.f746b = drawable;
            mo779i();
            return this;
        }

        /* renamed from: a */
        public C0136e mo766a(View view) {
            this.f750f = view;
            mo779i();
            return this;
        }

        /* renamed from: a */
        public C0136e mo767a(CharSequence charSequence) {
            this.f748d = charSequence;
            mo779i();
            return this;
        }

        /* renamed from: a */
        public CharSequence mo768a() {
            return this.f748d;
        }

        /* renamed from: b */
        public C0136e mo769b(CharSequence charSequence) {
            this.f747c = charSequence;
            mo779i();
            return this;
        }

        /* renamed from: b */
        public View mo770b() {
            return this.f750f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo771b(int i) {
            this.f749e = i;
        }

        /* renamed from: c */
        public Drawable mo772c() {
            return this.f746b;
        }

        /* renamed from: c */
        public C0136e mo773c(int i) {
            TabLayout tabLayout = this.f751g;
            if (tabLayout != null) {
                mo769b(tabLayout.getResources().getText(i));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: d */
        public int mo774d() {
            return this.f749e;
        }

        /* renamed from: e */
        public CharSequence mo775e() {
            return this.f747c;
        }

        /* renamed from: f */
        public boolean mo776f() {
            TabLayout tabLayout = this.f751g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f749e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo777g() {
            this.f751g = null;
            this.f752h = null;
            this.f745a = null;
            this.f746b = null;
            this.f747c = null;
            this.f748d = null;
            this.f749e = -1;
            this.f750f = null;
        }

        /* renamed from: h */
        public void mo778h() {
            TabLayout tabLayout = this.f751g;
            if (tabLayout != null) {
                tabLayout.mo723b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo779i() {
            C0138g gVar = this.f752h;
            if (gVar != null) {
                gVar.mo786b();
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    public static class C0137f implements ViewPager.C0440f {

        /* renamed from: a */
        private final WeakReference<TabLayout> f753a;

        /* renamed from: b */
        private int f754b;

        /* renamed from: c */
        private int f755c;

        public C0137f(TabLayout tabLayout) {
            this.f753a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo780a() {
            this.f755c = 0;
            this.f754b = 0;
        }

        /* renamed from: a */
        public void mo781a(int i) {
            this.f754b = this.f755c;
            this.f755c = i;
        }

        /* renamed from: a */
        public void mo782a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f753a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f755c != 2 || this.f754b == 1;
                if (!(this.f755c == 2 && this.f754b == 0)) {
                    z = true;
                }
                tabLayout.mo708a(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo783b(int i) {
            TabLayout tabLayout = (TabLayout) this.f753a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f755c;
                tabLayout.mo724b(tabLayout.mo720b(i), i2 == 0 || (i2 == 2 && this.f754b == 0));
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    class C0138g extends LinearLayout {

        /* renamed from: a */
        private C0136e f756a;

        /* renamed from: b */
        private TextView f757b;

        /* renamed from: c */
        private ImageView f758c;

        /* renamed from: d */
        private View f759d;

        /* renamed from: e */
        private TextView f760e;

        /* renamed from: f */
        private ImageView f761f;

        /* renamed from: g */
        private int f762g = 2;

        public C0138g(Context context) {
            super(context);
            int i = TabLayout.this.f719m;
            if (i != 0) {
                C0487v.m2273a((View) this, C1118b.m5721b(context, i));
            }
            C0487v.m2269a(this, TabLayout.this.f711e, TabLayout.this.f712f, TabLayout.this.f713g, TabLayout.this.f714h);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0487v.m2276a((View) this, C0484s.m2258a(getContext(), 1002));
        }

        /* renamed from: a */
        private float m737a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: a */
        private void m738a(TextView textView, ImageView imageView) {
            C0136e eVar = this.f756a;
            CharSequence charSequence = null;
            Drawable c = eVar != null ? eVar.mo772c() : null;
            C0136e eVar2 = this.f756a;
            CharSequence e = eVar2 != null ? eVar2.mo775e() : null;
            C0136e eVar3 = this.f756a;
            CharSequence a = eVar3 != null ? eVar3.mo768a() : null;
            int i = 0;
            if (imageView != null) {
                if (c != null) {
                    imageView.setImageDrawable(c);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
                imageView.setContentDescription(a);
            }
            boolean z = !TextUtils.isEmpty(e);
            if (textView != null) {
                if (z) {
                    textView.setText(e);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(a);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = TabLayout.this.mo705a(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence = a;
            }
            C0862mb.m4963a(this, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo784a() {
            mo785a((C0136e) null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo785a(C0136e eVar) {
            if (eVar != this.f756a) {
                this.f756a = eVar;
                mo786b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo786b() {
            ImageView imageView;
            TextView textView;
            C0136e eVar = this.f756a;
            ImageView imageView2 = null;
            View b = eVar != null ? eVar.mo770b() : null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f759d = b;
                TextView textView2 = this.f757b;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView3 = this.f758c;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                    this.f758c.setImageDrawable((Drawable) null);
                }
                this.f760e = (TextView) b.findViewById(16908308);
                TextView textView3 = this.f760e;
                if (textView3 != null) {
                    this.f762g = C0508D.m2424b(textView3);
                }
                imageView2 = (ImageView) b.findViewById(16908294);
            } else {
                View view = this.f759d;
                if (view != null) {
                    removeView(view);
                    this.f759d = null;
                }
                this.f760e = null;
            }
            this.f761f = imageView2;
            boolean z = false;
            if (this.f759d == null) {
                if (this.f758c == null) {
                    ImageView imageView4 = (ImageView) LayoutInflater.from(getContext()).inflate(C0960f.design_layout_tab_icon, this, false);
                    addView(imageView4, 0);
                    this.f758c = imageView4;
                }
                if (this.f757b == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(C0960f.design_layout_tab_text, this, false);
                    addView(textView4);
                    this.f757b = textView4;
                    this.f762g = C0508D.m2424b(this.f757b);
                }
                C0508D.m2421a(this.f757b, TabLayout.this.f715i);
                ColorStateList colorStateList = TabLayout.this.f716j;
                if (colorStateList != null) {
                    this.f757b.setTextColor(colorStateList);
                }
                textView = this.f757b;
                imageView = this.f758c;
            } else {
                if (!(this.f760e == null && this.f761f == null)) {
                    textView = this.f760e;
                    imageView = this.f761f;
                }
                if (eVar != null && eVar.mo776f()) {
                    z = true;
                }
                setSelected(z);
            }
            m738a(textView, imageView);
            z = true;
            setSelected(z);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0607a.C0610c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0607a.C0610c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f720n, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f757b != null) {
                getResources();
                float f = TabLayout.this.f717k;
                int i3 = this.f762g;
                ImageView imageView = this.f758c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f757b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f718l;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f757b.getTextSize();
                int lineCount = this.f757b.getLineCount();
                int b = C0508D.m2424b(this.f757b);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (b >= 0 && i3 != b)) {
                    if (TabLayout.this.f726t == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f757b.getLayout()) == null || m737a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f757b.setTextSize(0, f);
                        this.f757b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f756a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f756a.mo778h();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f757b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f758c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f759d;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$h */
    public static class C0139h implements C0133b {

        /* renamed from: a */
        private final ViewPager f764a;

        public C0139h(ViewPager viewPager) {
            this.f764a = viewPager;
        }

        /* renamed from: a */
        public void mo748a(C0136e eVar) {
        }

        /* renamed from: b */
        public void mo749b(C0136e eVar) {
        }

        /* renamed from: c */
        public void mo750c(C0136e eVar) {
            this.f764a.setCurrentItem(eVar.mo774d());
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f708b = new ArrayList<>();
        this.f720n = Integer.MAX_VALUE;
        this.f728v = new ArrayList<>();
        this.f707E = new C1098o(12);
        C0128S.m655a(context);
        setHorizontalScrollBarEnabled(false);
        this.f710d = new C0135d(context);
        super.addView(this.f710d, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.TabLayout, i, C0962h.Widget_Design_TabLayout);
        this.f710d.mo758b(obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabIndicatorHeight, 0));
        this.f710d.mo753a(obtainStyledAttributes.getColor(C0963i.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabPadding, 0);
        this.f714h = dimensionPixelSize;
        this.f713g = dimensionPixelSize;
        this.f712f = dimensionPixelSize;
        this.f711e = dimensionPixelSize;
        this.f711e = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabPaddingStart, this.f711e);
        this.f712f = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabPaddingTop, this.f712f);
        this.f713g = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabPaddingEnd, this.f713g);
        this.f714h = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabPaddingBottom, this.f714h);
        this.f715i = obtainStyledAttributes.getResourceId(C0963i.TabLayout_tabTextAppearance, C0962h.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f715i, C1112j.TextAppearance);
        try {
            this.f717k = (float) obtainStyledAttributes2.getDimensionPixelSize(C1112j.TextAppearance_android_textSize, 0);
            this.f716j = obtainStyledAttributes2.getColorStateList(C1112j.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(C0963i.TabLayout_tabTextColor)) {
                this.f716j = obtainStyledAttributes.getColorStateList(C0963i.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C0963i.TabLayout_tabSelectedTextColor)) {
                this.f716j = m670a(this.f716j.getDefaultColor(), obtainStyledAttributes.getColor(C0963i.TabLayout_tabSelectedTextColor, 0));
            }
            this.f721o = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabMinWidth, -1);
            this.f722p = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabMaxWidth, -1);
            this.f719m = obtainStyledAttributes.getResourceId(C0963i.TabLayout_tabBackground, 0);
            this.f724r = obtainStyledAttributes.getDimensionPixelSize(C0963i.TabLayout_tabContentStart, 0);
            this.f726t = obtainStyledAttributes.getInt(C0963i.TabLayout_tabMode, 1);
            this.f725s = obtainStyledAttributes.getInt(C0963i.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f718l = (float) resources.getDimensionPixelSize(C0956b.design_tab_text_size_2line);
            this.f723q = resources.getDimensionPixelSize(C0956b.design_tab_scrollable_min_width);
            m679d();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private int m669a(int i, float f) {
        int i2 = 0;
        if (this.f726t != 0) {
            return 0;
        }
        View childAt = this.f710d.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f710d.getChildCount() ? this.f710d.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        return C0487v.m2293i(this) == 0 ? left + i4 : left - i4;
    }

    /* renamed from: a */
    private static ColorStateList m670a(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: a */
    private void m671a(C0117H h) {
        C0136e a = mo706a();
        CharSequence charSequence = h.f660a;
        if (charSequence != null) {
            a.mo769b(charSequence);
        }
        Drawable drawable = h.f661b;
        if (drawable != null) {
            a.mo765a(drawable);
        }
        int i = h.f662c;
        if (i != 0) {
            a.mo764a(i);
        }
        if (!TextUtils.isEmpty(h.getContentDescription())) {
            a.mo767a(h.getContentDescription());
        }
        mo710a(a);
    }

    /* renamed from: a */
    private void m672a(C0136e eVar, int i) {
        eVar.mo771b(i);
        this.f708b.add(i, eVar);
        int size = this.f708b.size();
        while (true) {
            i++;
            if (i < size) {
                this.f708b.get(i).mo771b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m673a(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f731y;
        if (viewPager2 != null) {
            C0137f fVar = this.f704B;
            if (fVar != null) {
                viewPager2.mo1799b((ViewPager.C0440f) fVar);
            }
            C0132a aVar = this.f705C;
            if (aVar != null) {
                this.f731y.mo1798b((ViewPager.C0439e) aVar);
            }
        }
        C0133b bVar = this.f729w;
        if (bVar != null) {
            mo722b(bVar);
            this.f729w = null;
        }
        if (viewPager != null) {
            this.f731y = viewPager;
            if (this.f704B == null) {
                this.f704B = new C0137f(this);
            }
            this.f704B.mo780a();
            viewPager.mo1786a((ViewPager.C0440f) this.f704B);
            this.f729w = new C0139h(viewPager);
            mo709a(this.f729w);
            C0483r adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo714a(adapter, z);
            }
            if (this.f705C == null) {
                this.f705C = new C0132a();
            }
            this.f705C.mo747a(z);
            viewPager.mo1785a((ViewPager.C0439e) this.f705C);
            mo707a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f731y = null;
            mo714a((C0483r) null, false);
        }
        this.f706D = z2;
    }

    /* renamed from: a */
    private void m674a(View view) {
        if (view instanceof C0117H) {
            m671a((C0117H) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: a */
    private void m675a(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f726t == 1 && this.f725s == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: c */
    private void m676c(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0487v.m2309y(this) || this.f710d.mo756a()) {
                mo707a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m669a(i, 0.0f);
            if (scrollX != a) {
                m683f();
                this.f730x.setIntValues(new int[]{scrollX, a});
                this.f730x.start();
            }
            this.f710d.mo755a(i, (int) HttpStatus.SC_MULTIPLE_CHOICES);
        }
    }

    /* renamed from: c */
    private void m677c(C0136e eVar) {
        this.f710d.addView(eVar.f752h, eVar.mo774d(), m681e());
    }

    /* renamed from: d */
    private C0138g m678d(C0136e eVar) {
        C1097n<C0138g> nVar = this.f707E;
        C0138g a = nVar != null ? nVar.mo5227a() : null;
        if (a == null) {
            a = new C0138g(getContext());
        }
        a.mo785a(eVar);
        a.setFocusable(true);
        a.setMinimumWidth(getTabMinWidth());
        return a;
    }

    /* renamed from: d */
    private void m679d() {
        C0487v.m2269a(this.f710d, this.f726t == 0 ? Math.max(0, this.f724r - this.f711e) : 0, 0, 0, 0);
        int i = this.f726t;
        if (i == 0) {
            this.f710d.setGravity(8388611);
        } else if (i == 1) {
            this.f710d.setGravity(1);
        }
        mo715a(true);
    }

    /* renamed from: d */
    private void m680d(int i) {
        C0138g gVar = (C0138g) this.f710d.getChildAt(i);
        this.f710d.removeViewAt(i);
        if (gVar != null) {
            gVar.mo784a();
            this.f707E.mo5228a(gVar);
        }
        requestLayout();
    }

    /* renamed from: e */
    private LinearLayout.LayoutParams m681e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m675a(layoutParams);
        return layoutParams;
    }

    /* renamed from: e */
    private void m682e(C0136e eVar) {
        for (int size = this.f728v.size() - 1; size >= 0; size--) {
            this.f728v.get(size).mo748a(eVar);
        }
    }

    /* renamed from: f */
    private void m683f() {
        if (this.f730x == null) {
            this.f730x = new ValueAnimator();
            this.f730x.setInterpolator(C0145a.f817b);
            this.f730x.setDuration(300);
            this.f730x.addUpdateListener(new C0118I(this));
        }
    }

    /* renamed from: f */
    private void m684f(C0136e eVar) {
        for (int size = this.f728v.size() - 1; size >= 0; size--) {
            this.f728v.get(size).mo750c(eVar);
        }
    }

    /* renamed from: g */
    private void m685g() {
        int size = this.f708b.size();
        for (int i = 0; i < size; i++) {
            this.f708b.get(i).mo779i();
        }
    }

    /* renamed from: g */
    private void m686g(C0136e eVar) {
        for (int size = this.f728v.size() - 1; size >= 0; size--) {
            this.f728v.get(size).mo749b(eVar);
        }
    }

    private int getDefaultHeight() {
        int size = this.f708b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C0136e eVar = this.f708b.get(i);
                if (eVar != null && eVar.mo772c() != null && !TextUtils.isEmpty(eVar.mo775e())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.f710d.mo757b();
    }

    private int getTabMinWidth() {
        int i = this.f721o;
        if (i != -1) {
            return i;
        }
        if (this.f726t == 0) {
            return this.f723q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f710d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f710d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f710d.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo705a(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: a */
    public C0136e mo706a() {
        C0136e a = f702a.mo5227a();
        if (a == null) {
            a = new C0136e();
        }
        a.f751g = this;
        a.f752h = m678d(a);
        return a;
    }

    /* renamed from: a */
    public void mo707a(int i, float f, boolean z) {
        mo708a(i, f, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo708a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f710d.getChildCount()) {
            if (z2) {
                this.f710d.mo754a(i, f);
            }
            ValueAnimator valueAnimator = this.f730x;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f730x.cancel();
            }
            scrollTo(m669a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public void mo709a(C0133b bVar) {
        if (!this.f728v.contains(bVar)) {
            this.f728v.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo710a(C0136e eVar) {
        mo712a(eVar, this.f708b.isEmpty());
    }

    /* renamed from: a */
    public void mo711a(C0136e eVar, int i, boolean z) {
        if (eVar.f751g == this) {
            m672a(eVar, i);
            m677c(eVar);
            if (z) {
                eVar.mo778h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    public void mo712a(C0136e eVar, boolean z) {
        mo711a(eVar, this.f708b.size(), z);
    }

    /* renamed from: a */
    public void mo713a(ViewPager viewPager, boolean z) {
        m673a(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo714a(C0483r rVar, boolean z) {
        DataSetObserver dataSetObserver;
        C0483r rVar2 = this.f732z;
        if (!(rVar2 == null || (dataSetObserver = this.f703A) == null)) {
            rVar2.mo1989c(dataSetObserver);
        }
        this.f732z = rVar;
        if (z && rVar != null) {
            if (this.f703A == null) {
                this.f703A = new C0134c();
            }
            rVar.mo1976a(this.f703A);
        }
        mo721b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo715a(boolean z) {
        for (int i = 0; i < this.f710d.getChildCount(); i++) {
            View childAt = this.f710d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m675a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m674a(view);
    }

    public void addView(View view, int i) {
        m674a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m674a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m674a(view);
    }

    /* renamed from: b */
    public C0136e mo720b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f708b.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo721b() {
        int currentItem;
        mo725c();
        C0483r rVar = this.f732z;
        if (rVar != null) {
            int a = rVar.mo1972a();
            for (int i = 0; i < a; i++) {
                C0136e a2 = mo706a();
                a2.mo769b(this.f732z.mo1974a(i));
                mo712a(a2, false);
            }
            ViewPager viewPager = this.f731y;
            if (viewPager != null && a > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo723b(mo720b(currentItem));
            }
        }
    }

    /* renamed from: b */
    public void mo722b(C0133b bVar) {
        this.f728v.remove(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo723b(C0136e eVar) {
        mo724b(eVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo724b(C0136e eVar, boolean z) {
        C0136e eVar2 = this.f709c;
        if (eVar2 != eVar) {
            int d = eVar != null ? eVar.mo774d() : -1;
            if (z) {
                if ((eVar2 == null || eVar2.mo774d() == -1) && d != -1) {
                    mo707a(d, 0.0f, true);
                } else {
                    m676c(d);
                }
                if (d != -1) {
                    setSelectedTabView(d);
                }
            }
            if (eVar2 != null) {
                m686g(eVar2);
            }
            this.f709c = eVar;
            if (eVar != null) {
                m684f(eVar);
            }
        } else if (eVar2 != null) {
            m682e(eVar);
            m676c(eVar.mo774d());
        }
    }

    /* renamed from: c */
    public void mo725c() {
        for (int childCount = this.f710d.getChildCount() - 1; childCount >= 0; childCount--) {
            m680d(childCount);
        }
        Iterator<C0136e> it = this.f708b.iterator();
        while (it.hasNext()) {
            C0136e next = it.next();
            it.remove();
            next.mo777g();
            f702a.mo5228a(next);
        }
        this.f709c = null;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C0136e eVar = this.f709c;
        if (eVar != null) {
            return eVar.mo774d();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f708b.size();
    }

    public int getTabGravity() {
        return this.f725s;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f720n;
    }

    public int getTabMode() {
        return this.f726t;
    }

    public ColorStateList getTabTextColors() {
        return this.f716j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f731y == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m673a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f706D) {
            setupWithViewPager((ViewPager) null);
            this.f706D = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = mo705a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(a, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f722p;
            if (i3 <= 0) {
                i3 = size - mo705a(56);
            }
            this.f720n = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            boolean z = false;
            View childAt = getChildAt(0);
            int i4 = this.f726t;
            if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C0133b bVar) {
        C0133b bVar2 = this.f727u;
        if (bVar2 != null) {
            mo722b(bVar2);
        }
        this.f727u = bVar;
        if (bVar != null) {
            mo709a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m683f();
        this.f730x.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f710d.mo753a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f710d.mo758b(i);
    }

    public void setTabGravity(int i) {
        if (this.f725s != i) {
            this.f725s = i;
            m679d();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f726t) {
            this.f726t = i;
            m679d();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f716j != colorStateList) {
            this.f716j = colorStateList;
            m685g();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0483r rVar) {
        mo714a(rVar, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo713a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
