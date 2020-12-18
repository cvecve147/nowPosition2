package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0525I;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import org.apache.http.protocol.HttpRequestExecutor;

/* renamed from: com.onesignal.q */
class C4408q extends RelativeLayout {

    /* renamed from: a */
    private static final int f12995a = C4256Ja.m16901a(28);

    /* renamed from: b */
    private static final int f12996b = C4256Ja.m16901a(64);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4409a f12997c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0525I f12998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f12999e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4410b f13000f;

    /* renamed from: com.onesignal.q$a */
    static abstract class C4409a {
        C4409a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo12281a();
    }

    /* renamed from: com.onesignal.q$b */
    static class C4410b {

        /* renamed from: a */
        int f13001a;

        /* renamed from: b */
        int f13002b;

        /* renamed from: c */
        int f13003c;

        /* renamed from: d */
        int f13004d;

        /* renamed from: e */
        int f13005e;

        /* renamed from: f */
        int f13006f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f13007g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f13008h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f13009i;

        C4410b() {
        }
    }

    public C4408q(Context context) {
        super(context);
        setClipChildren(false);
        m17475b();
    }

    /* renamed from: b */
    private void m17475b() {
        this.f12998d = C0525I.m2510a((ViewGroup) this, 1.0f, (C0525I.C0526a) new C4405p(this));
    }

    /* renamed from: a */
    public void mo12531a() {
        this.f12999e = true;
        this.f12998d.mo2152b((View) this, getLeft(), this.f13000f.f13008h);
        C0487v.m2261B(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12532a(C4409a aVar) {
        this.f12997c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12533a(C4410b bVar) {
        int i;
        this.f13000f = bVar;
        int unused = bVar.f13008h = bVar.f13005e + bVar.f13001a + ((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.f13005e) - bVar.f13001a) + f12996b;
        int unused2 = bVar.f13007g = C4256Ja.m16901a((int) HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        if (bVar.f13006f == 0) {
            int unused3 = bVar.f13008h = (-bVar.f13005e) - f12995a;
            int unused4 = bVar.f13007g = -bVar.f13007g;
            i = bVar.f13008h / 3;
        } else {
            i = (bVar.f13005e / 3) + (bVar.f13002b * 2);
        }
        int unused5 = bVar.f13009i = i;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f12998d.mo2146a(true)) {
            C0487v.m2261B(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12999e) {
            return true;
        }
        this.f12998d.mo2141a(motionEvent);
        return false;
    }
}
