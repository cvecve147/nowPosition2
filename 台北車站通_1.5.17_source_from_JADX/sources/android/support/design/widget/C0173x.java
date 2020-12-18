package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.x */
class C0173x extends C0167w {

    /* renamed from: t */
    private InsetDrawable f916t;

    C0173x(C0144X x, C0110D d) {
        super(x, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo902a(float f, float f2) {
        float f3 = f;
        float f4 = f2;
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f905p.isEnabled()) {
                this.f905p.setElevation(f3);
                if (this.f905p.isFocused() || this.f905p.isPressed()) {
                    this.f905p.setTranslationZ(f4);
                }
            } else {
                this.f905p.setElevation(0.0f);
            }
            this.f905p.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f905p, "elevation", new float[]{f3}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f905p, View.TRANSLATION_Z, new float[]{f4}).setDuration(100));
            animatorSet.setInterpolator(C0167w.f890a);
            stateListAnimator.addState(C0167w.f891b, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.f905p, "elevation", new float[]{f3}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f905p, View.TRANSLATION_Z, new float[]{f4}).setDuration(100));
            animatorSet2.setInterpolator(C0167w.f890a);
            stateListAnimator.addState(C0167w.f892c, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f905p, "elevation", new float[]{f3}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                C0144X x = this.f905p;
                arrayList.add(ObjectAnimator.ofFloat(x, View.TRANSLATION_Z, new float[]{x.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f905p, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(C0167w.f890a);
            stateListAnimator.addState(C0167w.f893d, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.f905p, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f905p, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet4.setInterpolator(C0167w.f890a);
            stateListAnimator.addState(C0167w.f894e, animatorSet4);
            this.f905p.setStateListAnimator(stateListAnimator);
        }
        if (this.f906q.mo618a()) {
            mo920k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo903a(int i) {
        Drawable drawable = this.f900k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo903a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo906a(Rect rect) {
        if (this.f906q.mo618a()) {
            float b = this.f906q.mo619b();
            float b2 = mo909b() + this.f904o;
            int ceil = (int) Math.ceil((double) C0100C.m489a(b2, b, false));
            int ceil2 = (int) Math.ceil((double) C0100C.m490b(b2, b, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo908a(int[] iArr) {
    }

    /* renamed from: b */
    public float mo909b() {
        return this.f905p.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo910b(Rect rect) {
        C0110D d;
        Drawable drawable;
        if (this.f906q.mo618a()) {
            this.f916t = new InsetDrawable(this.f900k, rect.left, rect.top, rect.right, rect.bottom);
            d = this.f906q;
            drawable = this.f916t;
        } else {
            d = this.f906q;
            drawable = this.f900k;
        }
        d.mo617a(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo914e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo916g() {
        mo920k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo919j() {
        return false;
    }
}
