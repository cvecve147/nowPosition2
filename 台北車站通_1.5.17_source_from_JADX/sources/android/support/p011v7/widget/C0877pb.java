package android.support.p011v7.widget;

import android.support.p007v4.view.C0487v;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.pb */
class C0877pb implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private static C0877pb f3597a;

    /* renamed from: b */
    private static C0877pb f3598b;

    /* renamed from: c */
    private final View f3599c;

    /* renamed from: d */
    private final CharSequence f3600d;

    /* renamed from: e */
    private final Runnable f3601e = new C0865nb(this);

    /* renamed from: f */
    private final Runnable f3602f = new C0870ob(this);

    /* renamed from: g */
    private int f3603g;

    /* renamed from: h */
    private int f3604h;

    /* renamed from: i */
    private C0881qb f3605i;

    /* renamed from: j */
    private boolean f3606j;

    private C0877pb(View view, CharSequence charSequence) {
        this.f3599c = view;
        this.f3600d = charSequence;
        this.f3599c.setOnLongClickListener(this);
        this.f3599c.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m5027a() {
        this.f3599c.removeCallbacks(this.f3601e);
    }

    /* renamed from: a */
    public static void m5030a(View view, CharSequence charSequence) {
        C0877pb pbVar = f3597a;
        if (pbVar != null && pbVar.f3599c == view) {
            m5033b((C0877pb) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0877pb pbVar2 = f3598b;
            if (pbVar2 != null && pbVar2.f3599c == view) {
                pbVar2.m5032b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0877pb(view, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5031a(boolean z) {
        long j;
        if (C0487v.m2308x(this.f3599c)) {
            m5033b((C0877pb) null);
            C0877pb pbVar = f3598b;
            if (pbVar != null) {
                pbVar.m5032b();
            }
            f3598b = this;
            this.f3606j = z;
            this.f3605i = new C0881qb(this.f3599c.getContext());
            this.f3605i.mo4684a(this.f3599c, this.f3603g, this.f3604h, this.f3606j, this.f3600d);
            this.f3599c.addOnAttachStateChangeListener(this);
            if (this.f3606j) {
                j = 2500;
            } else {
                j = ((C0487v.m2301q(this.f3599c) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3599c.removeCallbacks(this.f3602f);
            this.f3599c.postDelayed(this.f3602f, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5032b() {
        if (f3598b == this) {
            f3598b = null;
            C0881qb qbVar = this.f3605i;
            if (qbVar != null) {
                qbVar.mo4683a();
                this.f3605i = null;
                this.f3599c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3597a == this) {
            m5033b((C0877pb) null);
        }
        this.f3599c.removeCallbacks(this.f3602f);
    }

    /* renamed from: b */
    private static void m5033b(C0877pb pbVar) {
        C0877pb pbVar2 = f3597a;
        if (pbVar2 != null) {
            pbVar2.m5027a();
        }
        f3597a = pbVar;
        C0877pb pbVar3 = f3597a;
        if (pbVar3 != null) {
            pbVar3.m5034c();
        }
    }

    /* renamed from: c */
    private void m5034c() {
        this.f3599c.postDelayed(this.f3601e, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3605i != null && this.f3606j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3599c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m5032b();
            }
        } else if (this.f3599c.isEnabled() && this.f3605i == null) {
            this.f3603g = (int) motionEvent.getX();
            this.f3604h = (int) motionEvent.getY();
            m5033b(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f3603g = view.getWidth() / 2;
        this.f3604h = view.getHeight() / 2;
        m5031a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        m5032b();
    }
}
