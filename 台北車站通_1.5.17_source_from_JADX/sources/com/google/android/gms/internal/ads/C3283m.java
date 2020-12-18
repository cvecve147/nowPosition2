package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.m */
public final class C3283m extends C3311n implements C1718E<C3520uh> {

    /* renamed from: c */
    private final C3520uh f9769c;

    /* renamed from: d */
    private final Context f9770d;

    /* renamed from: e */
    private final WindowManager f9771e;

    /* renamed from: f */
    private final C3647yu f9772f;

    /* renamed from: g */
    private DisplayMetrics f9773g;

    /* renamed from: h */
    private float f9774h;

    /* renamed from: i */
    private int f9775i = -1;

    /* renamed from: j */
    private int f9776j = -1;

    /* renamed from: k */
    private int f9777k;

    /* renamed from: l */
    private int f9778l = -1;

    /* renamed from: m */
    private int f9779m = -1;

    /* renamed from: n */
    private int f9780n = -1;

    /* renamed from: o */
    private int f9781o = -1;

    public C3283m(C3520uh uhVar, Context context, C3647yu yuVar) {
        super(uhVar);
        this.f9769c = uhVar;
        this.f9770d = context;
        this.f9772f = yuVar;
        this.f9771e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo9707a(int i, int i2) {
        int i3 = 0;
        if (this.f9770d instanceof Activity) {
            i3 = C1697X.m7698e().mo9459c((Activity) this.f9770d)[0];
        }
        if (this.f9769c.mo8192rb() == null || !this.f9769c.mo8192rb().mo9497d()) {
            C3390pt.m13453a();
            this.f9780n = C3432rf.m13605b(this.f9770d, this.f9769c.getWidth());
            C3390pt.m13453a();
            this.f9781o = C3432rf.m13605b(this.f9770d, this.f9769c.getHeight());
        }
        mo9767b(i, i2 - i3, this.f9780n, this.f9781o);
        this.f9769c.mo8182mb().mo9226a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        this.f9773g = new DisplayMetrics();
        Display defaultDisplay = this.f9771e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f9773g);
        this.f9774h = this.f9773g.density;
        this.f9777k = defaultDisplay.getRotation();
        C3390pt.m13453a();
        DisplayMetrics displayMetrics = this.f9773g;
        this.f9775i = C3432rf.m13606b(displayMetrics, displayMetrics.widthPixels);
        C3390pt.m13453a();
        DisplayMetrics displayMetrics2 = this.f9773g;
        this.f9776j = C3432rf.m13606b(displayMetrics2, displayMetrics2.heightPixels);
        Activity eb = this.f9769c.mo8163eb();
        if (eb == null || eb.getWindow() == null) {
            this.f9778l = this.f9775i;
            i = this.f9776j;
        } else {
            C1697X.m7698e();
            int[] a = C3114ge.m12421a(eb);
            C3390pt.m13453a();
            this.f9778l = C3432rf.m13606b(this.f9773g, a[0]);
            C3390pt.m13453a();
            i = C3432rf.m13606b(this.f9773g, a[1]);
        }
        this.f9779m = i;
        if (this.f9769c.mo8192rb().mo9497d()) {
            this.f9780n = this.f9775i;
            this.f9781o = this.f9776j;
        } else {
            this.f9769c.measure(0, 0);
        }
        mo9765a(this.f9775i, this.f9776j, this.f9778l, this.f9779m, this.f9774h, this.f9777k);
        C3254l lVar = new C3254l();
        lVar.mo9673b(this.f9772f.mo10256a());
        lVar.mo9672a(this.f9772f.mo10257b());
        lVar.mo9674c(this.f9772f.mo10259d());
        lVar.mo9675d(this.f9772f.mo10258c());
        lVar.mo9676e(true);
        this.f9769c.mo8150a("onDeviceFeaturesReceived", new C3193j(lVar).mo9590a());
        int[] iArr = new int[2];
        this.f9769c.getLocationOnScreen(iArr);
        C3390pt.m13453a();
        int b = C3432rf.m13605b(this.f9770d, iArr[0]);
        C3390pt.m13453a();
        mo9707a(b, C3432rf.m13605b(this.f9770d, iArr[1]));
        if (C2227Cf.m9531a(2)) {
            C2227Cf.m9534c("Dispatching Ready Event.");
        }
        mo9768b(this.f9769c.mo8201ub().f10855a);
    }
}
