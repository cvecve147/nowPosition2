package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bq */
public final class C2983bq implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private static final Handler f8961a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f8962b;

    /* renamed from: c */
    private Application f8963c;

    /* renamed from: d */
    private final PowerManager f8964d;

    /* renamed from: e */
    private final KeyguardManager f8965e;

    /* renamed from: f */
    private final C2701Sp f8966f;

    /* renamed from: g */
    private BroadcastReceiver f8967g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f8968h;

    /* renamed from: i */
    private WeakReference<View> f8969i;

    /* renamed from: j */
    private C2353Gp f8970j;

    /* renamed from: k */
    private boolean f8971k = false;

    /* renamed from: l */
    private int f8972l = -1;

    /* renamed from: m */
    private long f8973m = -3;

    public C2983bq(C2701Sp sp, View view) {
        this.f8966f = sp;
        this.f8962b = sp.f8286b;
        this.f8964d = (PowerManager) this.f8962b.getSystemService("power");
        this.f8965e = (KeyguardManager) this.f8962b.getSystemService("keyguard");
        Context context = this.f8962b;
        if (context instanceof Application) {
            this.f8963c = (Application) context;
            this.f8970j = new C2353Gp((Application) context, this);
        }
        mo9258a(view);
    }

    /* renamed from: a */
    private final void m12028a(Activity activity, int i) {
        Window window;
        if (this.f8969i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f8969i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f8972l = i;
            }
        }
    }

    /* renamed from: b */
    private final void m12030b() {
        f8961a.post(new C3011cq(this));
    }

    /* renamed from: b */
    private final void m12031b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8968h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f8967g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f8967g = new C3041dq(this);
            this.f8962b.registerReceiver(this.f8967g, intentFilter);
        }
        Application application = this.f8963c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f8970j);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m12032c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f8969i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            r2 = -3
            r9.f8973m = r2
            r9.f8971k = r1
            return
        L_0x0015:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.Sp r4 = r9.f8966f
            boolean r4 = r4.mo8845j()
            r5 = 1
            if (r4 != 0) goto L_0x005b
            android.app.KeyguardManager r4 = r9.f8965e
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x0059
            android.app.Activity r4 = com.google.android.gms.internal.ads.C2925_p.m11868a((android.view.View) r0)
            if (r4 == 0) goto L_0x0055
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0046
            r4 = 0
            goto L_0x004a
        L_0x0046:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x004a:
            if (r4 == 0) goto L_0x0055
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0055
            r4 = r5
            goto L_0x0056
        L_0x0055:
            r4 = r1
        L_0x0056:
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = r1
            goto L_0x005c
        L_0x005b:
            r4 = r5
        L_0x005c:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.f8972l
            r8 = -1
            if (r7 == r8) goto L_0x0066
            r6 = r7
        L_0x0066:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0083
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0083
            android.os.PowerManager r0 = r9.f8964d
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0083
            if (r4 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            if (r6 != 0) goto L_0x0083
            r1 = r5
        L_0x0083:
            boolean r0 = r9.f8971k
            if (r0 == r1) goto L_0x0094
            if (r1 == 0) goto L_0x008e
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0090
        L_0x008e:
            r2 = -2
        L_0x0090:
            r9.f8973m = r2
            r9.f8971k = r1
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2983bq.m12032c():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12033c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f8968h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f8968h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f8968h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f8967g
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f8962b     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f8967g = r0
        L_0x0038:
            android.app.Application r4 = r3.f8963c
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.Gp r0 = r3.f8970j     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2983bq.m12033c(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo9257a() {
        if (this.f8973m == -2 && this.f8969i.get() == null) {
            this.f8973m = -3;
        }
        return this.f8973m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9258a(View view) {
        long j;
        WeakReference<View> weakReference = this.f8969i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m12033c(view2);
        }
        this.f8969i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m12031b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f8973m = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m12028a(activity, 0);
        m12032c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m12032c();
    }

    public final void onActivityPaused(Activity activity) {
        m12028a(activity, 4);
        m12032c();
    }

    public final void onActivityResumed(Activity activity) {
        m12028a(activity, 0);
        m12032c();
        m12030b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m12032c();
    }

    public final void onActivityStarted(Activity activity) {
        m12028a(activity, 0);
        m12032c();
    }

    public final void onActivityStopped(Activity activity) {
        m12032c();
    }

    public final void onGlobalLayout() {
        m12032c();
    }

    public final void onScrollChanged() {
        m12032c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f8972l = -1;
        m12031b(view);
        m12032c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f8972l = -1;
        m12032c();
        m12030b();
        m12033c(view);
    }
}
