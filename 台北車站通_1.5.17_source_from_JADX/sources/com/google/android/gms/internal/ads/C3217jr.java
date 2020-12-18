package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1697X;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.jr */
public final class C3217jr implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private static final long f9640a = ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7814Sb)).longValue();

    /* renamed from: b */
    private final Context f9641b;

    /* renamed from: c */
    private Application f9642c;

    /* renamed from: d */
    private final WindowManager f9643d;

    /* renamed from: e */
    private final PowerManager f9644e;

    /* renamed from: f */
    private final KeyguardManager f9645f;

    /* renamed from: g */
    private BroadcastReceiver f9646g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f9647h;

    /* renamed from: i */
    private WeakReference<View> f9648i;

    /* renamed from: j */
    private C3359or f9649j;

    /* renamed from: k */
    private C3115gf f9650k = new C3115gf(f9640a);

    /* renamed from: l */
    private boolean f9651l = false;

    /* renamed from: m */
    private int f9652m = -1;

    /* renamed from: n */
    private final HashSet<C3331nr> f9653n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f9654o;

    /* renamed from: p */
    private final Rect f9655p;

    public C3217jr(Context context, View view) {
        this.f9641b = context.getApplicationContext();
        this.f9643d = (WindowManager) context.getSystemService("window");
        this.f9644e = (PowerManager) this.f9641b.getSystemService("power");
        this.f9645f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f9641b;
        if (context2 instanceof Application) {
            this.f9642c = (Application) context2;
            this.f9649j = new C3359or((Application) context2, this);
        }
        this.f9654o = context.getResources().getDisplayMetrics();
        this.f9655p = new Rect();
        this.f9655p.right = this.f9643d.getDefaultDisplay().getWidth();
        this.f9655p.bottom = this.f9643d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f9648i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m12814b(view2);
        }
        this.f9648i = new WeakReference<>(view);
        if (view != null) {
            if (C1697X.m7700g().mo9723a(view)) {
                m12810a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    private final Rect m12807a(Rect rect) {
        return new Rect(m12812b(rect.left), m12812b(rect.top), m12812b(rect.right), m12812b(rect.bottom));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12808a(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        int i2 = i;
        if (this.f9653n.size() != 0 && (weakReference = this.f9648i) != null) {
            View view = (View) weakReference.get();
            boolean z3 = false;
            boolean z4 = i2 == 1;
            boolean z5 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    C2227Cf.m9533b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            int i3 = 8;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i4 = this.f9652m;
            if (i4 != -1) {
                windowVisibility = i4;
            }
            boolean z6 = !z5 && C1697X.m7698e().mo9453a(view, this.f9644e, this.f9645f) && z2 && z && windowVisibility == 0;
            if (z4 && !this.f9650k.mo9462a() && z6 == this.f9651l) {
                return;
            }
            if (z6 || this.f9651l || i2 != 1) {
                long b = C1697X.m7705l().mo7726b();
                boolean isScreenOn = this.f9644e.isScreenOn();
                if (view != null) {
                    z3 = C1697X.m7700g().mo9723a(view);
                }
                boolean z7 = z3;
                if (view != null) {
                    i3 = view.getWindowVisibility();
                }
                C3302mr mrVar = new C3302mr(b, isScreenOn, z7, i3, m12807a(this.f9655p), m12807a(rect), m12807a(rect2), z2, m12807a(rect3), z, m12807a(rect4), this.f9654o.density, z6);
                Iterator<C3331nr> it = this.f9653n.iterator();
                while (it.hasNext()) {
                    it.next().mo8146a(mrVar);
                }
                this.f9651l = z6;
            }
        }
    }

    /* renamed from: a */
    private final void m12809a(Activity activity, int i) {
        Window window;
        if (this.f9648i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f9648i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f9652m = i;
            }
        }
    }

    /* renamed from: a */
    private final void m12810a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f9647h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f9646g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f9646g = new C3274lr(this);
            C1697X.m7692E().mo9787a(this.f9641b, this.f9646g, intentFilter);
        }
        Application application = this.f9642c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f9649j);
            } catch (Exception e) {
                C2227Cf.m9533b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: b */
    private final int m12812b(int i) {
        return (int) (((float) i) / this.f9654o.density);
    }

    /* renamed from: b */
    private final void m12813b() {
        C1697X.m7698e();
        C3114ge.f9351a.post(new C3245kr(this));
    }

    /* renamed from: b */
    private final void m12814b(View view) {
        try {
            if (this.f9647h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9647h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9647h = null;
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C2227Cf.m9533b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f9646g != null) {
            try {
                C1697X.m7692E().mo9786a(this.f9641b, this.f9646g);
            } catch (IllegalStateException e3) {
                C2227Cf.m9533b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C1697X.m7702i().mo8319a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f9646g = null;
        }
        Application application = this.f9642c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f9649j);
            } catch (Exception e5) {
                C2227Cf.m9533b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo9610a() {
        m12808a(4);
    }

    /* renamed from: a */
    public final void mo9611a(C3331nr nrVar) {
        this.f9653n.add(nrVar);
        m12808a(3);
    }

    /* renamed from: b */
    public final void mo9612b(C3331nr nrVar) {
        this.f9653n.remove(nrVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m12809a(activity, 0);
        m12808a(3);
        m12813b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m12808a(3);
        m12813b();
    }

    public final void onActivityPaused(Activity activity) {
        m12809a(activity, 4);
        m12808a(3);
        m12813b();
    }

    public final void onActivityResumed(Activity activity) {
        m12809a(activity, 0);
        m12808a(3);
        m12813b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m12808a(3);
        m12813b();
    }

    public final void onActivityStarted(Activity activity) {
        m12809a(activity, 0);
        m12808a(3);
        m12813b();
    }

    public final void onActivityStopped(Activity activity) {
        m12808a(3);
        m12813b();
    }

    public final void onGlobalLayout() {
        m12808a(2);
        m12813b();
    }

    public final void onScrollChanged() {
        m12808a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f9652m = -1;
        m12810a(view);
        m12808a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f9652m = -1;
        m12808a(3);
        m12813b();
        m12814b(view);
    }
}
