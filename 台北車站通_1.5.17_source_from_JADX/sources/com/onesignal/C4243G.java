package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.onesignal.C4384jc;

/* renamed from: com.onesignal.G */
class C4243G extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4384jc.C4386b f12591a;

    /* renamed from: b */
    final /* synthetic */ C4250I f12592b;

    C4243G(C4250I i, C4384jc.C4386b bVar) {
        this.f12592b = i;
        this.f12591a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f12592b.m16842c(this.f12591a);
    }
}
