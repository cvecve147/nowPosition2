package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0486u;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.B */
public class C0701B extends Spinner implements C0486u {

    /* renamed from: a */
    private static final int[] f2730a = {16843505};

    /* renamed from: b */
    private final C0854l f2731b;

    /* renamed from: c */
    private final Context f2732c;

    /* renamed from: d */
    private C0859ma f2733d;

    /* renamed from: e */
    private SpinnerAdapter f2734e;

    /* renamed from: f */
    private final boolean f2735f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0703b f2736g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f2737h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Rect f2738i;

    /* renamed from: android.support.v7.widget.B$a */
    private static class C0702a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f2739a;

        /* renamed from: b */
        private ListAdapter f2740b;

        public C0702a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2739a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2740b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0815ab) {
                C0815ab abVar = (C0815ab) spinnerAdapter;
                if (abVar.getDropDownViewTheme() == null) {
                    abVar.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2740b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2740b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2739a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.B$b */
    private class C0703b extends C0896ua {

        /* renamed from: K */
        private CharSequence f2741K;

        /* renamed from: L */
        ListAdapter f2742L;

        /* renamed from: M */
        private final Rect f2743M = new Rect();

        public C0703b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo4743a((View) C0701B.this);
            mo4746a(true);
            mo4757f(0);
            mo4744a((AdapterView.OnItemClickListener) new C0705C(this, C0701B.this));
        }

        /* renamed from: a */
        public void mo3271a(ListAdapter listAdapter) {
            super.mo3271a(listAdapter);
            this.f2742L = listAdapter;
        }

        /* renamed from: a */
        public void mo3272a(CharSequence charSequence) {
            this.f2741K = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3273b(View view) {
            return C0487v.m2308x(view) && view.getGlobalVisibleRect(this.f2743M);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3274i() {
            int i;
            Drawable c = mo4750c();
            int i2 = 0;
            if (c != null) {
                c.getPadding(C0701B.this.f2738i);
                i2 = C0902ub.m5141a(C0701B.this) ? C0701B.this.f2738i.right : -C0701B.this.f2738i.left;
            } else {
                Rect b = C0701B.this.f2738i;
                C0701B.this.f2738i.right = 0;
                b.left = 0;
            }
            int paddingLeft = C0701B.this.getPaddingLeft();
            int paddingRight = C0701B.this.getPaddingRight();
            int width = C0701B.this.getWidth();
            if (C0701B.this.f2737h == -2) {
                int a = C0701B.this.mo3236a((SpinnerAdapter) this.f2742L, mo4750c());
                int i3 = (C0701B.this.getContext().getResources().getDisplayMetrics().widthPixels - C0701B.this.f2738i.left) - C0701B.this.f2738i.right;
                if (a > i3) {
                    a = i3;
                }
                i = Math.max(a, (width - paddingLeft) - paddingRight);
            } else {
                i = C0701B.this.f2737h == -1 ? (width - paddingLeft) - paddingRight : C0701B.this.f2737h;
            }
            mo4748b(i);
            mo4753d(C0902ub.m5141a(C0701B.this) ? i2 + ((width - paddingRight) - mo4756f()) : i2 + paddingLeft);
        }

        /* renamed from: j */
        public CharSequence mo3275j() {
            return this.f2741K;
        }

        /* renamed from: v */
        public void mo2705v() {
            ViewTreeObserver viewTreeObserver;
            boolean w = mo2706w();
            mo3274i();
            mo4755e(2);
            super.mo2705v();
            mo2707x().setChoiceMode(1);
            mo4758g(C0701B.this.getSelectedItemPosition());
            if (!w && (viewTreeObserver = C0701B.this.getViewTreeObserver()) != null) {
                C0708D d = new C0708D(this);
                viewTreeObserver.addOnGlobalLayoutListener(d);
                mo4745a((PopupWindow.OnDismissListener) new C0710E(this, d));
            }
        }
    }

    public C0701B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.spinnerStyle);
    }

    public C0701B(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0701B(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0701B(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2738i = r0
            int[] r0 = p013b.p018b.p040i.p041a.C1112j.Spinner
            r1 = 0
            android.support.v7.widget.eb r0 = android.support.p011v7.widget.C0829eb.m4793a(r8, r9, r0, r10, r1)
            android.support.v7.widget.l r2 = new android.support.v7.widget.l
            r2.<init>(r7)
            r7.f2731b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            b.b.i.h.d r3 = new b.b.i.h.d
            r3.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
        L_0x0020:
            r7.f2732c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = p013b.p018b.p040i.p041a.C1112j.Spinner_popupTheme
            int r12 = r0.mo4486g(r12, r1)
            if (r12 == 0) goto L_0x0031
            b.b.i.h.d r3 = new b.b.i.h.d
            r3.<init>((android.content.Context) r8, (int) r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f2732c = r12
        L_0x003c:
            android.content.Context r12 = r7.f2732c
            r3 = 1
            if (r12 == 0) goto L_0x00aa
            r12 = -1
            if (r11 != r12) goto L_0x0072
            int[] r12 = f2730a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0054
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005a }
        L_0x0054:
            if (r12 == 0) goto L_0x0072
        L_0x0056:
            r12.recycle()
            goto L_0x0072
        L_0x005a:
            r4 = move-exception
            goto L_0x0061
        L_0x005c:
            r8 = move-exception
            r12 = r2
            goto L_0x006c
        L_0x005f:
            r4 = move-exception
            r12 = r2
        L_0x0061:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006b }
            if (r12 == 0) goto L_0x0072
            goto L_0x0056
        L_0x006b:
            r8 = move-exception
        L_0x006c:
            if (r12 == 0) goto L_0x0071
            r12.recycle()
        L_0x0071:
            throw r8
        L_0x0072:
            if (r11 != r3) goto L_0x00aa
            android.support.v7.widget.B$b r11 = new android.support.v7.widget.B$b
            android.content.Context r12 = r7.f2732c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f2732c
            int[] r4 = p013b.p018b.p040i.p041a.C1112j.Spinner
            android.support.v7.widget.eb r12 = android.support.p011v7.widget.C0829eb.m4793a(r12, r9, r4, r10, r1)
            int r1 = p013b.p018b.p040i.p041a.C1112j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo4484f(r1, r4)
            r7.f2737h = r1
            int r1 = p013b.p018b.p040i.p041a.C1112j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo4477b(r1)
            r11.mo4742a((android.graphics.drawable.Drawable) r1)
            int r1 = p013b.p018b.p040i.p041a.C1112j.Spinner_android_prompt
            java.lang.String r1 = r0.mo4481d(r1)
            r11.mo3272a((java.lang.CharSequence) r1)
            r12.mo4474a()
            r7.f2736g = r11
            android.support.v7.widget.A r12 = new android.support.v7.widget.A
            r12.<init>(r7, r7, r11)
            r7.f2733d = r12
        L_0x00aa:
            int r11 = p013b.p018b.p040i.p041a.C1112j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo4485f(r11)
            if (r11 == 0) goto L_0x00c2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p013b.p018b.p040i.p041a.C1109g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter((android.widget.SpinnerAdapter) r12)
        L_0x00c2:
            r0.mo4474a()
            r7.f2735f = r3
            android.widget.SpinnerAdapter r8 = r7.f2734e
            if (r8 == 0) goto L_0x00d0
            r7.setAdapter((android.widget.SpinnerAdapter) r8)
            r7.f2734e = r2
        L_0x00d0:
            android.support.v7.widget.l r8 = r7.f2731b
            r8.mo4563a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0701B.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3236a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f2738i);
        Rect rect = this.f2738i;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            lVar.mo4558a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            return bVar.mo4752d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            return bVar.mo4754e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f2736g != null) {
            return this.f2737h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            return bVar.mo4750c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f2736g != null) {
            return this.f2732c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        C0703b bVar = this.f2736g;
        return bVar != null ? bVar.mo3275j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            return lVar.mo4564b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            return lVar.mo4566c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0703b bVar = this.f2736g;
        if (bVar != null && bVar.mo2706w()) {
            this.f2736g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2736g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo3236a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0859ma maVar = this.f2733d;
        if (maVar == null || !maVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0703b bVar = this.f2736g;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.mo2706w()) {
            return true;
        }
        this.f2736g.mo2705v();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2735f) {
            this.f2734e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2736g != null) {
            Context context = this.f2732c;
            if (context == null) {
                context = getContext();
            }
            this.f2736g.mo3271a((ListAdapter) new C0702a(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            lVar.mo4562a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            lVar.mo4559a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            bVar.mo4753d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            bVar.mo4760h(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f2736g != null) {
            this.f2737h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            bVar.mo4742a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1118b.m5721b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0703b bVar = this.f2736g;
        if (bVar != null) {
            bVar.mo3272a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            lVar.mo4565b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0854l lVar = this.f2731b;
        if (lVar != null) {
            lVar.mo4561a(mode);
        }
    }
}
