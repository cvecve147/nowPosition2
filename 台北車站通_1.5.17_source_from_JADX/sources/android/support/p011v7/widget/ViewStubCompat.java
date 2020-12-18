package android.support.p011v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f3317a;

    /* renamed from: b */
    private int f3318b;

    /* renamed from: c */
    private WeakReference<View> f3319c;

    /* renamed from: d */
    private LayoutInflater f3320d;

    /* renamed from: e */
    private C0800a f3321e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0800a {
        /* renamed from: a */
        void mo4414a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3317a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.ViewStubCompat, i, 0);
        this.f3318b = obtainStyledAttributes.getResourceId(C1112j.ViewStubCompat_android_inflatedId, -1);
        this.f3317a = obtainStyledAttributes.getResourceId(C1112j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C1112j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo4402a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3317a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f3320d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3317a, viewGroup, false);
            int i = this.f3318b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3319c = new WeakReference<>(inflate);
            C0800a aVar = this.f3321e;
            if (aVar != null) {
                aVar.mo4414a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3318b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3320d;
    }

    public int getLayoutResource() {
        return this.f3317a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f3318b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3320d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f3317a = i;
    }

    public void setOnInflateListener(C0800a aVar) {
        this.f3321e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f3319c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo4402a();
        }
    }
}
