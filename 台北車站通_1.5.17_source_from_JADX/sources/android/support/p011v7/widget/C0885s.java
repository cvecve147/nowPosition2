package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p007v4.view.C0486u;
import android.support.p007v4.widget.C0522F;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: android.support.v7.widget.s */
public class C0885s extends ImageButton implements C0486u, C0522F {

    /* renamed from: a */
    private final C0854l f3634a;

    /* renamed from: b */
    private final C0890t f3635b;

    public C0885s(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0885s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.imageButtonStyle);
    }

    public C0885s(Context context, AttributeSet attributeSet, int i) {
        super(C0818bb.m4769a(context), attributeSet, i);
        this.f3634a = new C0854l(this);
        this.f3634a.mo4563a(attributeSet, i);
        this.f3635b = new C0890t(this);
        this.f3635b.mo4710a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            lVar.mo4558a();
        }
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4706a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            return lVar.mo4564b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            return lVar.mo4566c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            return tVar.mo4711b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            return tVar.mo4712c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f3635b.mo4713d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            lVar.mo4562a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            lVar.mo4559a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4706a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4706a();
        }
    }

    public void setImageResource(int i) {
        this.f3635b.mo4707a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4706a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            lVar.mo4565b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0854l lVar = this.f3634a;
        if (lVar != null) {
            lVar.mo4561a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4708a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0890t tVar = this.f3635b;
        if (tVar != null) {
            tVar.mo4709a(mode);
        }
    }
}
