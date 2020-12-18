package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.p077a.C4118k;
import com.journeyapps.barcodescanner.p077a.C4121m;
import com.journeyapps.barcodescanner.p077a.C4123n;
import com.journeyapps.barcodescanner.p077a.C4125p;
import com.journeyapps.barcodescanner.p077a.C4126q;
import com.journeyapps.barcodescanner.p077a.C4127r;
import com.journeyapps.barcodescanner.p077a.C4128s;
import com.journeyapps.barcodescanner.p077a.C4131v;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p159f.p163b.p164a.C5770p;

/* renamed from: com.journeyapps.barcodescanner.j */
public class C4140j extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12281a = "j";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C4141a f12282A = new C4139i(this);

    /* renamed from: b */
    private C4118k f12283b;

    /* renamed from: c */
    private WindowManager f12284c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f12285d;

    /* renamed from: e */
    private boolean f12286e = false;

    /* renamed from: f */
    private SurfaceView f12287f;

    /* renamed from: g */
    private TextureView f12288g;

    /* renamed from: h */
    private boolean f12289h = false;

    /* renamed from: i */
    private C4099B f12290i;

    /* renamed from: j */
    private int f12291j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C4141a> f12292k = new ArrayList();

    /* renamed from: l */
    private C4126q f12293l;

    /* renamed from: m */
    private C4121m f12294m = new C4121m();

    /* renamed from: n */
    private C4101C f12295n;

    /* renamed from: o */
    private C4101C f12296o;

    /* renamed from: p */
    private Rect f12297p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C4101C f12298q;

    /* renamed from: r */
    private Rect f12299r = null;

    /* renamed from: s */
    private Rect f12300s = null;

    /* renamed from: t */
    private C4101C f12301t = null;

    /* renamed from: u */
    private double f12302u = 0.1d;

    /* renamed from: v */
    private C4131v f12303v = null;

    /* renamed from: w */
    private boolean f12304w = false;

    /* renamed from: x */
    private final SurfaceHolder.Callback f12305x = new C4135e(this);

    /* renamed from: y */
    private final Handler.Callback f12306y = new C4136f(this);

    /* renamed from: z */
    private C4157z f12307z = new C4138h(this);

    /* renamed from: com.journeyapps.barcodescanner.j$a */
    public interface C4141a {
        /* renamed from: a */
        void mo11598a();

        /* renamed from: a */
        void mo11599a(Exception exc);

        /* renamed from: b */
        void mo11600b();

        /* renamed from: c */
        void mo11601c();
    }

    public C4140j(Context context) {
        super(context);
        m16517a(context, (AttributeSet) null, 0, 0);
    }

    public C4140j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16517a(context, attributeSet, 0, 0);
    }

    public C4140j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16517a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m16517a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        mo11690a(attributeSet);
        this.f12284c = (WindowManager) context.getSystemService("window");
        this.f12285d = new Handler(this.f12306y);
        this.f12290i = new C4099B();
    }

    /* renamed from: a */
    private void m16518a(C4101C c) {
        this.f12295n = c;
        C4118k kVar = this.f12283b;
        if (kVar != null && kVar.mo11625d() == null) {
            this.f12293l = new C4126q(getDisplayRotation(), c);
            this.f12293l.mo11665a(getPreviewScalingStrategy());
            this.f12283b.mo11620a(this.f12293l);
            this.f12283b.mo11624c();
            boolean z = this.f12304w;
            if (z) {
                this.f12283b.mo11622a(z);
            }
        }
    }

    /* renamed from: a */
    private void m16519a(C4123n nVar) {
        if (!this.f12289h && this.f12283b != null) {
            Log.i(f12281a, "Starting preview");
            this.f12283b.mo11619a(nVar);
            this.f12283b.mo11628g();
            this.f12289h = true;
            mo11557f();
            this.f12282A.mo11601c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16522b(C4101C c) {
        this.f12296o = c;
        if (this.f12295n != null) {
            mo11559h();
            requestLayout();
            m16531l();
        }
    }

    private int getDisplayRotation() {
        return this.f12284c.getDefaultDisplay().getRotation();
    }

    /* renamed from: h */
    private void mo11559h() {
        C4101C c;
        C4126q qVar;
        C4101C c2 = this.f12295n;
        if (c2 == null || (c = this.f12296o) == null || (qVar = this.f12293l) == null) {
            this.f12300s = null;
            this.f12299r = null;
            this.f12297p = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = c.f12161a;
        int i2 = c.f12162b;
        int i3 = c2.f12161a;
        int i4 = c2.f12162b;
        this.f12297p = qVar.mo11662a(c);
        this.f12299r = mo11689a(new Rect(0, 0, i3, i4), this.f12297p);
        Rect rect = new Rect(this.f12299r);
        Rect rect2 = this.f12297p;
        rect.offset(-rect2.left, -rect2.top);
        this.f12300s = new Rect((rect.left * i) / this.f12297p.width(), (rect.top * i2) / this.f12297p.height(), (rect.right * i) / this.f12297p.width(), (rect.bottom * i2) / this.f12297p.height());
        if (this.f12300s.width() <= 0 || this.f12300s.height() <= 0) {
            this.f12300s = null;
            this.f12299r = null;
            Log.w(f12281a, "Preview frame is too small");
            return;
        }
        this.f12282A.mo11598a();
    }

    /* renamed from: i */
    private void mo11560i() {
        if (this.f12283b != null) {
            Log.w(f12281a, "initCamera called twice");
            return;
        }
        this.f12283b = mo11692b();
        this.f12283b.mo11617a(this.f12285d);
        this.f12283b.mo11627f();
        this.f12291j = getDisplayRotation();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m16529j() {
        if (mo11693c() && getDisplayRotation() != this.f12291j) {
            mo11556e();
            mo11695g();
        }
    }

    @SuppressLint({"NewAPI"})
    /* renamed from: k */
    private void m16530k() {
        View view;
        if (!this.f12286e || Build.VERSION.SDK_INT < 14) {
            this.f12287f = new SurfaceView(getContext());
            if (Build.VERSION.SDK_INT < 11) {
                this.f12287f.getHolder().setType(3);
            }
            this.f12287f.getHolder().addCallback(this.f12305x);
            view = this.f12287f;
        } else {
            this.f12288g = new TextureView(getContext());
            this.f12288g.setSurfaceTextureListener(m16532m());
            view = this.f12288g;
        }
        addView(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m16531l() {
        Rect rect;
        C4123n nVar;
        C4101C c = this.f12298q;
        if (c != null && this.f12296o != null && (rect = this.f12297p) != null) {
            if (this.f12287f == null || !c.equals(new C4101C(rect.width(), this.f12297p.height()))) {
                TextureView textureView = this.f12288g;
                if (textureView != null && Build.VERSION.SDK_INT >= 14 && textureView.getSurfaceTexture() != null) {
                    if (this.f12296o != null) {
                        this.f12288g.setTransform(mo11688a(new C4101C(this.f12288g.getWidth(), this.f12288g.getHeight()), this.f12296o));
                    }
                    nVar = new C4123n(this.f12288g.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                nVar = new C4123n(this.f12287f.getHolder());
            }
            m16519a(nVar);
        }
    }

    @TargetApi(14)
    /* renamed from: m */
    private TextureView.SurfaceTextureListener m16532m() {
        return new C4134d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Matrix mo11688a(C4101C c, C4101C c2) {
        float f;
        float f2 = ((float) c.f12161a) / ((float) c.f12162b);
        float f3 = ((float) c2.f12161a) / ((float) c2.f12162b);
        float f4 = 1.0f;
        if (f2 < f3) {
            f = f3 / f2;
        } else {
            f4 = f2 / f3;
            f = 1.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f4);
        int i = c.f12161a;
        int i2 = c.f12162b;
        matrix.postTranslate((((float) i) - (((float) i) * f)) / 2.0f, (((float) i2) - (((float) i2) * f4)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Rect mo11689a(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f12301t != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f12301t.f12161a) / 2), Math.max(0, (rect3.height() - this.f12301t.f12162b) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.f12302u, ((double) rect3.height()) * this.f12302u);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11690a(AttributeSet attributeSet) {
        C4131v sVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5770p.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(C5770p.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C5770p.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f12301t = new C4101C(dimension, dimension2);
        }
        this.f12286e = obtainStyledAttributes.getBoolean(C5770p.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(C5770p.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            sVar = new C4125p();
        } else if (integer == 2) {
            sVar = new C4127r();
        } else {
            if (integer == 3) {
                sVar = new C4128s();
            }
            obtainStyledAttributes.recycle();
        }
        this.f12303v = sVar;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo11691a(C4141a aVar) {
        this.f12292k.add(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4118k mo11692b() {
        C4118k kVar = new C4118k(getContext());
        kVar.mo11618a(this.f12294m);
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo11693c() {
        return this.f12283b != null;
    }

    /* renamed from: d */
    public boolean mo11694d() {
        return this.f12289h;
    }

    /* renamed from: e */
    public void mo11556e() {
        TextureView textureView;
        SurfaceView surfaceView;
        C4105E.m16407a();
        Log.d(f12281a, "pause()");
        this.f12291j = -1;
        C4118k kVar = this.f12283b;
        if (kVar != null) {
            kVar.mo11623b();
            this.f12283b = null;
            this.f12289h = false;
        }
        if (this.f12298q == null && (surfaceView = this.f12287f) != null) {
            surfaceView.getHolder().removeCallback(this.f12305x);
        }
        if (this.f12298q == null && (textureView = this.f12288g) != null && Build.VERSION.SDK_INT >= 14) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f12295n = null;
        this.f12296o = null;
        this.f12300s = null;
        this.f12290i.mo11553a();
        this.f12282A.mo11600b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11557f() {
    }

    /* renamed from: g */
    public void mo11695g() {
        C4105E.m16407a();
        Log.d(f12281a, "resume()");
        mo11560i();
        if (this.f12298q != null) {
            m16531l();
        } else {
            SurfaceView surfaceView = this.f12287f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f12305x);
            } else {
                TextureView textureView = this.f12288g;
                if (textureView != null && Build.VERSION.SDK_INT >= 14) {
                    if (textureView.isAvailable()) {
                        m16532m().onSurfaceTextureAvailable(this.f12288g.getSurfaceTexture(), this.f12288g.getWidth(), this.f12288g.getHeight());
                    } else {
                        this.f12288g.setSurfaceTextureListener(m16532m());
                    }
                }
            }
        }
        requestLayout();
        this.f12290i.mo11554a(getContext(), this.f12307z);
    }

    public C4118k getCameraInstance() {
        return this.f12283b;
    }

    public C4121m getCameraSettings() {
        return this.f12294m;
    }

    public Rect getFramingRect() {
        return this.f12299r;
    }

    public C4101C getFramingRectSize() {
        return this.f12301t;
    }

    public double getMarginFraction() {
        return this.f12302u;
    }

    public Rect getPreviewFramingRect() {
        return this.f12300s;
    }

    public C4131v getPreviewScalingStrategy() {
        C4131v vVar = this.f12303v;
        return vVar != null ? vVar : this.f12288g != null ? new C4125p() : new C4127r();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m16530k();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m16518a(new C4101C(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f12287f;
        if (surfaceView != null) {
            Rect rect = this.f12297p;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f12288g;
            if (textureView != null && Build.VERSION.SDK_INT >= 14) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f12304w);
        return bundle;
    }

    public void setCameraSettings(C4121m mVar) {
        this.f12294m = mVar;
    }

    public void setFramingRectSize(C4101C c) {
        this.f12301t = c;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f12302u = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(C4131v vVar) {
        this.f12303v = vVar;
    }

    public void setTorch(boolean z) {
        this.f12304w = z;
        C4118k kVar = this.f12283b;
        if (kVar != null) {
            kVar.mo11622a(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f12286e = z;
    }
}
