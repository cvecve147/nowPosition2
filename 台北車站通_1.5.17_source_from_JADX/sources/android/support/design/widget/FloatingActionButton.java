package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.C0167w;
import android.support.design.widget.CoordinatorLayout;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0527J;
import android.support.p011v7.widget.C0890t;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p013b.p018b.p022d.C0956b;
import p013b.p018b.p022d.C0963i;

@CoordinatorLayout.C0105c(Behavior.class)
public class FloatingActionButton extends C0144X {

    /* renamed from: b */
    private ColorStateList f641b;

    /* renamed from: c */
    private PorterDuff.Mode f642c;

    /* renamed from: d */
    private int f643d;

    /* renamed from: e */
    private int f644e;

    /* renamed from: f */
    private int f645f;

    /* renamed from: g */
    int f646g;

    /* renamed from: h */
    private int f647h;

    /* renamed from: i */
    boolean f648i;

    /* renamed from: j */
    final Rect f649j;

    /* renamed from: k */
    private final Rect f650k;

    /* renamed from: l */
    private C0890t f651l;

    /* renamed from: m */
    private C0167w f652m;

    public static class Behavior extends CoordinatorLayout.C0104b<FloatingActionButton> {

        /* renamed from: a */
        private Rect f653a;

        /* renamed from: b */
        private C0114a f654b;

        /* renamed from: c */
        private boolean f655c;

        public Behavior() {
            this.f655c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.FloatingActionButton_Behavior_Layout);
            this.f655c = obtainStyledAttributes.getBoolean(C0963i.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m622a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f649j;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0107e eVar = (CoordinatorLayout.C0107e) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0487v.m2283b((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0487v.m2267a((View) floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private boolean m623a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m625a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f653a == null) {
                this.f653a = new Rect();
            }
            Rect rect = this.f653a;
            C0527J.m2562a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo624a(this.f654b, false);
                return true;
            }
            floatingActionButton.mo626b(this.f654b, false);
            return true;
        }

        /* renamed from: a */
        private static boolean m624a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0107e) {
                return ((CoordinatorLayout.C0107e) layoutParams).mo608d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m625a(View view, FloatingActionButton floatingActionButton) {
            return this.f655c && ((CoordinatorLayout.C0107e) floatingActionButton.getLayoutParams()).mo607c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: b */
        private boolean m626b(View view, FloatingActionButton floatingActionButton) {
            if (!m625a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0107e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo624a(this.f654b, false);
                return true;
            }
            floatingActionButton.mo626b(this.f654b, false);
            return true;
        }

        /* renamed from: a */
        public void mo583a(CoordinatorLayout.C0107e eVar) {
            if (eVar.f622h == 0) {
                eVar.f622h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo406a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b = coordinatorLayout.mo533b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m624a(view) && m626b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m623a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo540c((View) floatingActionButton, i);
            m622a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo588a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f649j;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo426b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m623a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m624a(view)) {
                return false;
            } else {
                m626b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0114a {
        /* renamed from: a */
        public abstract void mo657a(FloatingActionButton floatingActionButton);

        /* renamed from: b */
        public abstract void mo658b(FloatingActionButton floatingActionButton);
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C0115b implements C0110D {
        C0115b() {
        }

        /* renamed from: a */
        public void mo616a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f649j.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            int i5 = floatingActionButton.f646g;
            floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
        }

        /* renamed from: a */
        public void mo617a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public boolean mo618a() {
            return FloatingActionButton.this.f648i;
        }

        /* renamed from: b */
        public float mo619b() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    /* renamed from: a */
    private int m614a(int i) {
        Resources resources = getResources();
        int i2 = this.f645f;
        if (i2 != 0) {
            return i2;
        }
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m614a(1) : m614a(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C0956b.design_fab_size_normal : C0956b.design_fab_size_mini);
    }

    /* renamed from: a */
    private static int m615a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    /* renamed from: a */
    private C0167w.C0170c m616a(C0114a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0163s(this, aVar);
    }

    /* renamed from: a */
    private C0167w m617a() {
        return Build.VERSION.SDK_INT >= 21 ? new C0173x(this, new C0115b()) : new C0167w(this, new C0115b());
    }

    private C0167w getImpl() {
        if (this.f652m == null) {
            this.f652m = m617a();
        }
        return this.f652m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo624a(C0114a aVar, boolean z) {
        getImpl().mo907a(m616a(aVar), z);
    }

    /* renamed from: a */
    public boolean mo625a(Rect rect) {
        if (!C0487v.m2309y(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        int i = rect.left;
        Rect rect2 = this.f649j;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo626b(C0114a aVar, boolean z) {
        getImpl().mo911b(m616a(aVar), z);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo908a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f641b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f642c;
    }

    public float getCompatElevation() {
        return getImpl().mo909b();
    }

    public Drawable getContentBackground() {
        return getImpl().mo900a();
    }

    public int getCustomSize() {
        return this.f645f;
    }

    public int getRippleColor() {
        return this.f643d;
    }

    public int getSize() {
        return this.f644e;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m614a(this.f644e);
    }

    public boolean getUseCompatPadding() {
        return this.f648i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo914e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo915f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo917h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f646g = (sizeDimension - this.f647h) / 2;
        getImpl().mo920k();
        int min = Math.min(m615a(sizeDimension, i), m615a(sizeDimension, i2));
        Rect rect = this.f649j;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && mo625a(this.f650k) && !this.f650k.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f641b != colorStateList) {
            this.f641b = colorStateList;
            getImpl().mo904a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f642c != mode) {
            this.f642c = mode;
            getImpl().mo905a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo901a(f);
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f645f = i;
            return;
        }
        throw new IllegalArgumentException("Custom size should be non-negative.");
    }

    public void setImageResource(int i) {
        this.f651l.mo4707a(i);
    }

    public void setRippleColor(int i) {
        if (this.f643d != i) {
            this.f643d = i;
            getImpl().mo903a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f644e) {
            this.f644e = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f648i != z) {
            this.f648i = z;
            getImpl().mo916g();
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
