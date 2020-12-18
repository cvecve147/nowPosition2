package com.askey.taipeinavi.home;

import android.content.Context;
import com.askey.taipeinavi.p058d.C1213g;
import p250g.p255b.p256a.C6471b;

/* renamed from: com.askey.taipeinavi.home.a */
public class C1231a {

    /* renamed from: a */
    private final int f4445a = 3;

    /* renamed from: b */
    private final int f4446b = 9;

    /* renamed from: c */
    private boolean f4447c;

    /* renamed from: d */
    private C6471b f4448d;

    /* renamed from: e */
    private int f4449e;

    /* renamed from: f */
    private int f4450f;

    /* renamed from: g */
    private boolean f4451g;

    C1231a(Context context) {
        this.f4447c = C1213g.m6066i(context);
        this.f4449e = C1213g.m6045a(context, 3);
        this.f4450f = C1213g.m6063g(context);
        this.f4451g = C1213g.m6067j(context);
        String h = C1213g.m6065h(context);
        if (h != null) {
            this.f4448d = C6471b.m24200a(h);
        }
    }

    /* renamed from: a */
    private boolean m6170a() {
        if (!this.f4447c) {
            return false;
        }
        return this.f4448d == null || C6471b.m24202h().mo16678d() > this.f4448d.mo16678d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5558a(Context context) {
        this.f4449e += 3;
        if (this.f4449e > 9) {
            mo5559b(context);
            return;
        }
        this.f4448d = C6471b.m24202h();
        this.f4450f = 0;
        C1213g.m6049b(context, this.f4450f);
        C1213g.m6052c(context, this.f4449e);
        C1213g.m6056d(context, this.f4448d.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5559b(Context context) {
        this.f4447c = false;
        C1213g.m6054c(context, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5560c(Context context) {
        if (!m6170a()) {
            return false;
        }
        this.f4450f++;
        int i = this.f4450f;
        if (i >= this.f4449e) {
            return true;
        }
        C1213g.m6049b(context, i);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo5561d(Context context) {
        if (!m6170a()) {
            return false;
        }
        if (this.f4451g) {
            return mo5560c(context);
        }
        this.f4451g = true;
        C1213g.m6079v(context);
        return true;
    }
}
