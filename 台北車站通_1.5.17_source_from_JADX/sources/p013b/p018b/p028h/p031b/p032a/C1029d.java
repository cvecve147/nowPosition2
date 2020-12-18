package p013b.p018b.p028h.p031b.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: b.b.h.b.a.d */
class C1029d extends Drawable implements Drawable.Callback, C1028c, C1027b {

    /* renamed from: a */
    static final PorterDuff.Mode f3935a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f3936b;

    /* renamed from: c */
    private PorterDuff.Mode f3937c;

    /* renamed from: d */
    private boolean f3938d;

    /* renamed from: e */
    C1030a f3939e;

    /* renamed from: f */
    private boolean f3940f;

    /* renamed from: g */
    Drawable f3941g;

    /* renamed from: b.b.h.b.a.d$a */
    protected static abstract class C1030a extends Drawable.ConstantState {

        /* renamed from: a */
        int f3942a;

        /* renamed from: b */
        Drawable.ConstantState f3943b;

        /* renamed from: c */
        ColorStateList f3944c = null;

        /* renamed from: d */
        PorterDuff.Mode f3945d = C1029d.f3935a;

        C1030a(C1030a aVar, Resources resources) {
            if (aVar != null) {
                this.f3942a = aVar.f3942a;
                this.f3943b = aVar.f3943b;
                this.f3944c = aVar.f3944c;
                this.f3945d = aVar.f3945d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5053a() {
            return this.f3943b != null;
        }

        public int getChangingConfigurations() {
            int i = this.f3942a;
            Drawable.ConstantState constantState = this.f3943b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: b.b.h.b.a.d$b */
    private static class C1031b extends C1030a {
        C1031b(C1030a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1029d(this, resources);
        }
    }

    C1029d(Drawable drawable) {
        this.f3939e = mo5025c();
        mo5023a(drawable);
    }

    C1029d(C1030a aVar, Resources resources) {
        this.f3939e = aVar;
        m5465a(resources);
    }

    /* renamed from: a */
    private void m5465a(Resources resources) {
        Drawable.ConstantState constantState;
        C1030a aVar = this.f3939e;
        if (aVar != null && (constantState = aVar.f3943b) != null) {
            mo5023a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m5466a(int[] iArr) {
        if (!mo5024b()) {
            return false;
        }
        C1030a aVar = this.f3939e;
        ColorStateList colorStateList = aVar.f3944c;
        PorterDuff.Mode mode = aVar.f3945d;
        if (colorStateList == null || mode == null) {
            this.f3938d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f3938d && colorForState == this.f3936b && mode == this.f3937c)) {
                setColorFilter(colorForState, mode);
                this.f3936b = colorForState;
                this.f3937c = mode;
                this.f3938d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo5022a() {
        return this.f3941g;
    }

    /* renamed from: a */
    public final void mo5023a(Drawable drawable) {
        Drawable drawable2 = this.f3941g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3941g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1030a aVar = this.f3939e;
            if (aVar != null) {
                aVar.f3943b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo5024b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1030a mo5025c() {
        return new C1031b(this.f3939e, (Resources) null);
    }

    public void draw(Canvas canvas) {
        this.f3941g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1030a aVar = this.f3939e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f3941g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C1030a aVar = this.f3939e;
        if (aVar == null || !aVar.mo5053a()) {
            return null;
        }
        this.f3939e.f3942a = getChangingConfigurations();
        return this.f3939e;
    }

    public Drawable getCurrent() {
        return this.f3941g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3941g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3941g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3941g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3941g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3941g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3941g.getPadding(rect);
    }

    public int[] getState() {
        return this.f3941g.getState();
    }

    public Region getTransparentRegion() {
        return this.f3941g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3939e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo5024b()
            if (r0 == 0) goto L_0x000d
            b.b.h.b.a.d$a r0 = r1.f3939e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f3944c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f3941g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p031b.p032a.C1029d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f3941g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f3940f && super.mutate() == this) {
            this.f3939e = mo5025c();
            Drawable drawable = this.f3941g;
            if (drawable != null) {
                drawable.mutate();
            }
            C1030a aVar = this.f3939e;
            if (aVar != null) {
                Drawable drawable2 = this.f3941g;
                aVar.f3943b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3940f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3941g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3941g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3941g.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f3941g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3941g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3941g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3941g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m5466a(iArr) || this.f3941g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3939e.f3944c = colorStateList;
        m5466a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3939e.f3945d = mode;
        m5466a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3941g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
