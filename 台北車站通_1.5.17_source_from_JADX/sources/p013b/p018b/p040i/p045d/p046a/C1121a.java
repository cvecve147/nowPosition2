package p013b.p018b.p040i.p045d.p046a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p013b.p018b.p028h.p031b.p032a.C1026a;

/* renamed from: b.b.i.d.a.a */
public class C1121a extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f4101a;

    public C1121a(Drawable drawable) {
        mo5264a(drawable);
    }

    /* renamed from: a */
    public Drawable mo5263a() {
        return this.f4101a;
    }

    /* renamed from: a */
    public void mo5264a(Drawable drawable) {
        Drawable drawable2 = this.f4101a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4101a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4101a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f4101a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f4101a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4101a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4101a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4101a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4101a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4101a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f4101a.getPadding(rect);
    }

    public int[] getState() {
        return this.f4101a.getState();
    }

    public Region getTransparentRegion() {
        return this.f4101a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C1026a.m5459f(this.f4101a);
    }

    public boolean isStateful() {
        return this.f4101a.isStateful();
    }

    public void jumpToCurrentState() {
        C1026a.m5460g(this.f4101a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4101a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4101a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4101a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C1026a.m5451a(this.f4101a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f4101a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4101a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4101a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4101a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C1026a.m5445a(this.f4101a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1026a.m5446a(this.f4101a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f4101a.setState(iArr);
    }

    public void setTint(int i) {
        C1026a.m5455b(this.f4101a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C1026a.m5447a(this.f4101a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1026a.m5450a(this.f4101a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4101a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
