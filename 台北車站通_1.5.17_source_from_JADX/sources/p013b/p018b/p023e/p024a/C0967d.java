package p013b.p018b.p023e.p024a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p013b.p018b.p028h.p029a.p030a.C1016e;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: b.b.e.a.d */
public class C0967d extends C0976j implements C0965b {

    /* renamed from: b */
    private C0968a f3792b;

    /* renamed from: c */
    private Context f3793c;

    /* renamed from: d */
    private ArgbEvaluator f3794d;

    /* renamed from: e */
    private Animator.AnimatorListener f3795e;

    /* renamed from: f */
    private ArrayList<Object> f3796f;

    /* renamed from: g */
    final Drawable.Callback f3797g;

    /* renamed from: b.b.e.a.d$a */
    private static class C0968a extends Drawable.ConstantState {

        /* renamed from: a */
        int f3798a;

        /* renamed from: b */
        C0977k f3799b;

        /* renamed from: c */
        AnimatorSet f3800c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ArrayList<Animator> f3801d;

        /* renamed from: e */
        C1080b<Animator, String> f3802e;

        public C0968a(Context context, C0968a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f3798a = aVar.f3798a;
                C0977k kVar = aVar.f3799b;
                if (kVar != null) {
                    Drawable.ConstantState constantState = kVar.getConstantState();
                    this.f3799b = (C0977k) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0977k kVar2 = this.f3799b;
                    kVar2.mutate();
                    this.f3799b = kVar2;
                    this.f3799b.setCallback(callback);
                    this.f3799b.setBounds(aVar.f3799b.getBounds());
                    this.f3799b.mo4911a(false);
                }
                ArrayList<Animator> arrayList = aVar.f3801d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3801d = new ArrayList<>(size);
                    this.f3802e = new C1080b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f3801d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f3802e.get(animator);
                        clone.setTarget(this.f3799b.mo4910a(str));
                        this.f3801d.add(clone);
                        this.f3802e.put(clone, str);
                    }
                    mo4896a();
                }
            }
        }

        /* renamed from: a */
        public void mo4896a() {
            if (this.f3800c == null) {
                this.f3800c = new AnimatorSet();
            }
            this.f3800c.playTogether(this.f3801d);
        }

        public int getChangingConfigurations() {
            return this.f3798a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: b.b.e.a.d$b */
    private static class C0969b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3803a;

        public C0969b(Drawable.ConstantState constantState) {
            this.f3803a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3803a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3803a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0967d dVar = new C0967d();
            dVar.f3808a = this.f3803a.newDrawable();
            dVar.f3808a.setCallback(dVar.f3797g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0967d dVar = new C0967d();
            dVar.f3808a = this.f3803a.newDrawable(resources);
            dVar.f3808a.setCallback(dVar.f3797g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0967d dVar = new C0967d();
            dVar.f3808a = this.f3803a.newDrawable(resources, theme);
            dVar.f3808a.setCallback(dVar.f3797g);
            return dVar;
        }
    }

    C0967d() {
        this((Context) null, (C0968a) null, (Resources) null);
    }

    private C0967d(Context context) {
        this(context, (C0968a) null, (Resources) null);
    }

    private C0967d(Context context, C0968a aVar, Resources resources) {
        this.f3794d = null;
        this.f3795e = null;
        this.f3796f = null;
        this.f3797g = new C0966c(this);
        this.f3793c = context;
        if (aVar != null) {
            this.f3792b = aVar;
        } else {
            this.f3792b = new C0968a(context, aVar, this.f3797g, resources);
        }
    }

    /* renamed from: a */
    public static C0967d m5260a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0967d dVar = new C0967d(context);
        dVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return dVar;
    }

    /* renamed from: a */
    private void m5261a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m5261a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3794d == null) {
                    this.f3794d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3794d);
            }
        }
    }

    /* renamed from: a */
    private void m5262a(String str, Animator animator) {
        animator.setTarget(this.f3792b.f3799b.mo4910a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m5261a(animator);
        }
        if (this.f3792b.f3801d == null) {
            ArrayList unused = this.f3792b.f3801d = new ArrayList();
            this.f3792b.f3802e = new C1080b<>();
        }
        this.f3792b.f3801d.add(animator);
        this.f3792b.f3802e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5448a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            return C1026a.m5452a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3792b.f3799b.draw(canvas);
        if (this.f3792b.f3800c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3808a;
        return drawable != null ? C1026a.m5456c(drawable) : this.f3792b.f3799b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3792b.f3798a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f3808a;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0969b(drawable.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3792b.f3799b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3792b.f3799b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getOpacity() : this.f3792b.f3799b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5449a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3783e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0977k a = C0977k.m5295a(resources, resourceId, theme);
                        a.mo4911a(false);
                        a.setCallback(this.f3797g);
                        C0977k kVar = this.f3792b.f3799b;
                        if (kVar != null) {
                            kVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3792b.f3799b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0964a.f3784f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3793c;
                        if (context != null) {
                            m5262a(string, C0972g.m5270a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3792b.mo4896a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3808a;
        return drawable != null ? C1026a.m5459f(drawable) : this.f3792b.f3799b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3808a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3792b.f3800c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.isStateful() : this.f3792b.f3799b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3792b.f3799b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.setLevel(i) : this.f3792b.f3799b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.setState(iArr) : this.f3792b.f3799b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3792b.f3799b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5451a(drawable, z);
        } else {
            this.f3792b.f3799b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3792b.f3799b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5455b(drawable, i);
        } else {
            this.f3792b.f3799b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5447a(drawable, colorStateList);
        } else {
            this.f3792b.f3799b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5450a(drawable, mode);
        } else {
            this.f3792b.f3799b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3792b.f3799b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3792b.f3800c.isStarted()) {
            this.f3792b.f3800c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3792b.f3800c.end();
        }
    }
}
