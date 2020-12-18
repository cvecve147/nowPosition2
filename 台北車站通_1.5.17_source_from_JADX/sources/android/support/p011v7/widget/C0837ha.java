package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.widget.C0562p;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p045d.p046a.C1121a;

/* renamed from: android.support.v7.widget.ha */
class C0837ha extends ListView {

    /* renamed from: a */
    private final Rect f3438a = new Rect();

    /* renamed from: b */
    private int f3439b = 0;

    /* renamed from: c */
    private int f3440c = 0;

    /* renamed from: d */
    private int f3441d = 0;

    /* renamed from: e */
    private int f3442e = 0;

    /* renamed from: f */
    private int f3443f;

    /* renamed from: g */
    private Field f3444g;

    /* renamed from: h */
    private C0838a f3445h;

    /* renamed from: i */
    private boolean f3446i;

    /* renamed from: j */
    private boolean f3447j;

    /* renamed from: k */
    private boolean f3448k;

    /* renamed from: l */
    private C0429H f3449l;

    /* renamed from: m */
    private C0562p f3450m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C0839b f3451n;

    /* renamed from: android.support.v7.widget.ha$a */
    private static class C0838a extends C1121a {

        /* renamed from: b */
        private boolean f3452b = true;

        C0838a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4505a(boolean z) {
            this.f3452b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f3452b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3452b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3452b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f3452b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3452b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ha$b */
    private class C0839b implements Runnable {
        private C0839b() {
        }

        /* renamed from: a */
        public void mo4511a() {
            C0839b unused = C0837ha.this.f3451n = null;
            C0837ha.this.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo4512b() {
            C0837ha.this.post(this);
        }

        public void run() {
            C0839b unused = C0837ha.this.f3451n = null;
            C0837ha.this.drawableStateChanged();
        }
    }

    C0837ha(Context context, boolean z) {
        super(context, (AttributeSet) null, C1103a.dropDownListViewStyle);
        this.f3447j = z;
        setCacheColorHint(0);
        try {
            this.f3444g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3444g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m4821a() {
        this.f3448k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3443f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0429H h = this.f3449l;
        if (h != null) {
            h.mo1758a();
            this.f3449l = null;
        }
    }

    /* renamed from: a */
    private void m4822a(int i, View view) {
        Rect rect = this.f3438a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3439b;
        rect.top -= this.f3440c;
        rect.right += this.f3441d;
        rect.bottom += this.f3442e;
        try {
            boolean z = this.f3444g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3444g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m4823a(int i, View view, float f, float f2) {
        m4827b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C1026a.m5445a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m4824a(Canvas canvas) {
        Drawable selector;
        if (!this.f3438a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f3438a);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m4825a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m4826a(View view, int i, float f, float f2) {
        View childAt;
        this.f3448k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f3443f;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f3443f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m4823a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m4827b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m4822a(i, view);
        if (z2) {
            Rect rect = this.f3438a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C1026a.m5445a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m4828b() {
        return this.f3448k;
    }

    /* renamed from: c */
    private void m4829c() {
        Drawable selector = getSelector();
        if (selector != null && m4828b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0838a aVar = this.f3445h;
        if (aVar != null) {
            aVar.mo4505a(z);
        }
    }

    /* renamed from: a */
    public int mo4492a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4493a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = r1
            r3 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r1
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r2
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m4826a((android.view.View) r3, (int) r5, (float) r4, (float) r9)
            if (r0 != r2) goto L_0x000e
            r7.m4825a((android.view.View) r3, (int) r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m4821a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            android.support.v4.widget.p r9 = r7.f3450m
            if (r9 != 0) goto L_0x005a
            android.support.v4.widget.p r9 = new android.support.v4.widget.p
            r9.<init>(r7)
            r7.f3450m = r9
        L_0x005a:
            android.support.v4.widget.p r9 = r7.f3450m
            r9.mo2265a((boolean) r2)
            android.support.v4.widget.p r9 = r7.f3450m
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            android.support.v4.widget.p r8 = r7.f3450m
            if (r8 == 0) goto L_0x006c
            r8.mo2265a((boolean) r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0837ha.mo4493a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m4824a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f3451n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m4829c();
        }
    }

    public boolean hasFocus() {
        return this.f3447j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f3447j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3447j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f3447j && this.f3446i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3451n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3451n == null) {
            this.f3451n = new C0839b();
            this.f3451n.mo4512b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m4829c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3443f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0839b bVar = this.f3451n;
        if (bVar != null) {
            bVar.mo4511a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f3446i = z;
    }

    public void setSelector(Drawable drawable) {
        this.f3445h = drawable != null ? new C0838a(drawable) : null;
        super.setSelector(this.f3445h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3439b = rect.left;
        this.f3440c = rect.top;
        this.f3441d = rect.right;
        this.f3442e = rect.bottom;
    }
}
