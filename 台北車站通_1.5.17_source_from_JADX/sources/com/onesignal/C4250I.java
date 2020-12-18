package com.onesignal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.p011v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.onesignal.C4306Xa;
import com.onesignal.C4384jc;
import com.onesignal.C4408q;
import java.lang.ref.WeakReference;
import org.apache.http.HttpStatus;

/* renamed from: com.onesignal.I */
class C4250I {

    /* renamed from: a */
    private static final int f12605a = Color.parseColor("#00000000");

    /* renamed from: b */
    private static final int f12606b = Color.parseColor("#BB000000");

    /* renamed from: c */
    private static final int f12607c = C4256Ja.m16901a(24);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Activity f12608d;

    /* renamed from: e */
    private final Handler f12609e = new Handler();

    /* renamed from: f */
    private int f12610f;

    /* renamed from: g */
    private int f12611g;

    /* renamed from: h */
    private double f12612h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f12613i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12614j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4384jc.C4387c f12615k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WebView f12616l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public RelativeLayout f12617m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4408q f12618n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4251a f12619o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Runnable f12620p;

    /* renamed from: com.onesignal.I$a */
    interface C4251a {
        /* renamed from: a */
        void mo12311a();

        /* renamed from: b */
        void mo12312b();
    }

    C4250I(WebView webView, C4384jc.C4387c cVar, int i, double d) {
        this.f12616l = webView;
        this.f12615k = cVar;
        this.f12611g = i;
        this.f12610f = -1;
        this.f12612h = d;
        this.f12613i = !cVar.mo12508a();
    }

    /* renamed from: a */
    private ValueAnimator m16814a(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return C4326Za.m17234a(view, i, i2, i3, animatorListener);
    }

    /* renamed from: a */
    private CardView m16815a(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f12615k == C4384jc.C4387c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        cardView.setRadius((float) C4256Ja.m16901a(8));
        cardView.setCardElevation((float) C4256Ja.m16901a(5));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        return cardView;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onesignal.C4408q.C4410b m16817a(int r5, com.onesignal.C4384jc.C4387c r6) {
        /*
            r4 = this;
            com.onesignal.q$b r0 = new com.onesignal.q$b
            r0.<init>()
            int r1 = f12607c
            r0.f13003c = r1
            r0.f13002b = r1
            r0.f13005e = r5
            int r1 = r4.m16843d()
            r0.f13004d = r1
            com.onesignal.jc$c r1 = com.onesignal.C4384jc.C4387c.FULL_SCREEN
            r2 = 2
            if (r6 != r1) goto L_0x0022
            int r5 = r4.m16843d()
            int r1 = f12607c
            int r1 = r1 * r2
            int r5 = r5 - r1
            r0.f13005e = r5
        L_0x0022:
            int[] r1 = com.onesignal.C4246H.f12596a
            int r3 = r6.ordinal()
            r1 = r1[r3]
            if (r1 == r2) goto L_0x0042
            r3 = 3
            if (r1 == r3) goto L_0x0033
            r3 = 4
            if (r1 == r3) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            int r1 = r4.m16843d()
            int r1 = r1 / r2
            int r5 = r5 / r2
            int r1 = r1 - r5
            r0.f13002b = r1
            int r1 = r4.m16843d()
            int r1 = r1 / r2
            goto L_0x0046
        L_0x0042:
            int r1 = r4.m16843d()
        L_0x0046:
            int r1 = r1 - r5
            r0.f13001a = r1
        L_0x0049:
            com.onesignal.jc$c r5 = com.onesignal.C4384jc.C4387c.TOP_BANNER
            if (r6 != r5) goto L_0x004f
            r5 = 0
            goto L_0x0050
        L_0x004f:
            r5 = 1
        L_0x0050:
            r0.f13006f = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4250I.m16817a(int, com.onesignal.jc$c):com.onesignal.q$b");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16820a(Context context, LinearLayout.LayoutParams layoutParams, C4408q.C4410b bVar) {
        this.f12618n = new C4408q(context);
        if (layoutParams != null) {
            this.f12618n.setLayoutParams(layoutParams);
        }
        this.f12618n.mo12533a(bVar);
        this.f12618n.mo12532a((C4408q.C4409a) new C4228C(this));
        if (this.f12616l.getParent() != null) {
            ((ViewGroup) this.f12616l.getParent()).removeAllViews();
        }
        CardView a = m16815a(context);
        a.addView(this.f12616l);
        C4408q qVar = this.f12618n;
        int i = f12607c;
        qVar.setPadding(i, i, i, i);
        this.f12618n.setClipChildren(false);
        this.f12618n.setClipToPadding(false);
        this.f12618n.addView(a);
    }

    /* renamed from: a */
    private void m16821a(View view, int i) {
        C4326Za.m17235a(view, (float) (i + f12607c), 0.0f, 1000, new C4330_a(0.1d, 8.0d), (Animation.AnimationListener) null).start();
    }

    /* renamed from: a */
    private void m16822a(View view, View view2) {
        Animation a = C4326Za.m17236a(view, 1000, new C4330_a(0.1d, 8.0d), (Animation.AnimationListener) null);
        ValueAnimator a2 = m16814a(view2, (int) HttpStatus.SC_BAD_REQUEST, f12605a, f12606b, (Animator.AnimatorListener) null);
        a.start();
        a2.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16823a(View view, C4384jc.C4386b bVar) {
        View view2 = view;
        m16814a(view2, (int) HttpStatus.SC_BAD_REQUEST, f12606b, f12605a, (Animator.AnimatorListener) new C4243G(this, bVar)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16830a(C4384jc.C4387c cVar, View view, View view2) {
        int i = C4246H.f12596a[cVar.ordinal()];
        if (i == 1) {
            m16836b(((ViewGroup) view).getChildAt(0), this.f12616l.getHeight());
        } else if (i == 2) {
            m16821a(((ViewGroup) view).getChildAt(0), this.f12616l.getHeight());
        } else if (i == 3 || i == 4) {
            m16822a(view, view2);
        }
    }

    /* renamed from: a */
    private void m16831a(C4384jc.C4387c cVar, RelativeLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, C4408q.C4410b bVar, WindowManager.LayoutParams layoutParams3) {
        C4252Ia.m16867a((Runnable) new C4225B(this, layoutParams, layoutParams2, bVar, layoutParams3, cVar));
    }

    /* renamed from: b */
    private WindowManager.LayoutParams m16833b(int i) {
        int i2;
        if (this.f12613i) {
            i = -1;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i, this.f12613i ? -1 : -2, 1003, 8, -3);
        layoutParams.token = this.f12608d.getWindow().getDecorView().getApplicationWindowToken();
        if (Build.VERSION.SDK_INT >= 18) {
            layoutParams.rotationAnimation = 1;
        }
        if (!this.f12613i) {
            int i3 = C4246H.f12596a[this.f12615k.ordinal()];
            if (i3 == 1) {
                i2 = 49;
            } else if (i3 == 2) {
                i2 = 81;
            }
            layoutParams.gravity = i2;
        }
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16835b(Context context) {
        this.f12617m = new RelativeLayout(context);
        this.f12617m.setBackgroundColor(f12605a);
        this.f12617m.setClipChildren(false);
        this.f12617m.setClipToPadding(false);
        this.f12617m.addView(this.f12618n);
    }

    /* renamed from: b */
    private void m16836b(View view, int i) {
        C4326Za.m17235a(view, (float) ((-i) - f12607c), 0.0f, 1000, new C4330_a(0.1d, 8.0d), (Animation.AnimationListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m16838b(C4384jc.C4386b bVar) {
        C4252Ia.m16868a((Runnable) new C4240F(this, bVar), 600);
    }

    /* renamed from: c */
    private LinearLayout.LayoutParams m16839c() {
        int i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12610f, -1);
        int i2 = C4246H.f12596a[this.f12615k.ordinal()];
        if (i2 == 1) {
            i = 49;
        } else if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                i = 17;
            }
            return layoutParams;
        } else {
            i = 81;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16840c(Activity activity) {
        if (activity.getWindow().getDecorView().getApplicationWindowToken() == null || this.f12617m != null) {
            new Handler().postDelayed(new C4235E(this, activity), 200);
        } else {
            mo12304a(activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16842c(C4384jc.C4386b bVar) {
        Runnable runnable = this.f12620p;
        if (runnable != null) {
            this.f12609e.removeCallbacks(runnable);
            this.f12620p = null;
        }
        C4408q qVar = this.f12618n;
        if (qVar != null) {
            qVar.removeAllViews();
        }
        m16844d(this.f12608d);
        C4251a aVar = this.f12619o;
        if (aVar != null) {
            aVar.mo12311a();
        }
        m16849f();
        if (bVar != null) {
            bVar.mo12461c();
        }
    }

    /* renamed from: d */
    private int m16843d() {
        return C4256Ja.m16902a(this.f12608d);
    }

    /* renamed from: d */
    private void m16844d(Activity activity) {
        WindowManager windowManager = activity.getWindowManager();
        RelativeLayout relativeLayout = this.f12617m;
        if (relativeLayout != null && windowManager != null) {
            windowManager.removeViewImmediate(relativeLayout);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16847e() {
        if (this.f12612h > 0.0d && this.f12620p == null) {
            this.f12620p = new C4231D(this);
            this.f12609e.postDelayed(this.f12620p, ((long) this.f12612h) * 1000);
        }
    }

    /* renamed from: f */
    private void m16849f() {
        this.f12617m = null;
        this.f12618n = null;
        this.f12616l = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12302a() {
        if (this.f12614j) {
            this.f12614j = false;
            m16838b((C4384jc.C4386b) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12303a(int i) {
        this.f12611g = i;
        C4252Ia.m16867a((Runnable) new C4222A(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12304a(Activity activity) {
        this.f12608d = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f12611g);
        layoutParams.addRule(13);
        LinearLayout.LayoutParams c = this.f12613i ? m16839c() : null;
        C4384jc.C4387c cVar = this.f12615k;
        m16831a(cVar, layoutParams, c, m16817a(this.f12611g, cVar), m16833b(this.f12610f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12305a(WebView webView) {
        this.f12616l = webView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12306a(C4251a aVar) {
        this.f12619o = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12307a(C4384jc.C4386b bVar) {
        C4408q qVar = this.f12618n;
        if (qVar == null) {
            C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already");
            m16849f();
            if (bVar != null) {
                bVar.mo12461c();
                return;
            }
            return;
        }
        qVar.mo12531a();
        m16838b(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12308a(WeakReference<Activity> weakReference) {
        if (weakReference.get() != null) {
            C4408q qVar = this.f12618n;
            if (qVar != null) {
                qVar.removeAllViews();
            }
            if (this.f12617m != null) {
                m16844d((Activity) weakReference.get());
                this.f12617m.removeAllViews();
            }
        }
        m16849f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4384jc.C4387c mo12309b() {
        return this.f12615k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12310b(Activity activity) {
        m16840c(activity);
    }
}
