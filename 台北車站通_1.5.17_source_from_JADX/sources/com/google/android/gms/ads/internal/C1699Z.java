package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.C2169Ae;
import com.google.android.gms.internal.ads.C2857Yd;
import com.google.android.gms.internal.ads.C3404qf;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.Z */
public final class C1699Z extends ViewSwitcher {

    /* renamed from: a */
    private final C2169Ae f5640a;

    /* renamed from: b */
    private final C3404qf f5641b;

    /* renamed from: c */
    private boolean f5642c = true;

    public C1699Z(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f5640a = new C2169Ae(context);
        this.f5640a.mo7809a(str);
        this.f5640a.mo7812b(str2);
        if (context instanceof Activity) {
            this.f5641b = new C3404qf((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f5641b = new C3404qf((Activity) null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f5641b.mo9932c();
    }

    /* renamed from: a */
    public final C2169Ae mo6847a() {
        return this.f5640a;
    }

    /* renamed from: b */
    public final void mo6848b() {
        C2857Yd.m11615f("Disable position monitoring on adFrame.");
        C3404qf qfVar = this.f5641b;
        if (qfVar != null) {
            qfVar.mo9933d();
        }
    }

    /* renamed from: c */
    public final void mo6849c() {
        C2857Yd.m11615f("Enable debug gesture detector on adFrame.");
        this.f5642c = true;
    }

    /* renamed from: d */
    public final void mo6850d() {
        C2857Yd.m11615f("Disable debug gesture detector on adFrame.");
        this.f5642c = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3404qf qfVar = this.f5641b;
        if (qfVar != null) {
            qfVar.mo9929a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3404qf qfVar = this.f5641b;
        if (qfVar != null) {
            qfVar.mo9931b();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5642c) {
            return false;
        }
        this.f5640a.mo7808a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof C3520uh)) {
                arrayList.add((C3520uh) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C3520uh) obj).destroy();
        }
    }
}
