package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.Iterator;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.PMISLMain;
import p299tw.navin.navinmap.map.p300a.C7084c;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.x */
class C7154x extends C7146w implements PMISLMain.C7060b {

    /* renamed from: sa */
    private static boolean f19813sa = false;

    /* renamed from: Aa */
    private Paint f19814Aa;

    /* renamed from: Ba */
    private Paint f19815Ba;

    /* renamed from: Ca */
    private Paint f19816Ca;

    /* renamed from: Da */
    private Paint f19817Da;

    /* renamed from: Ea */
    private Paint f19818Ea;

    /* renamed from: Fa */
    private Paint f19819Fa;

    /* renamed from: Ga */
    private Paint f19820Ga;

    /* renamed from: Ha */
    private C7112l.C7119g f19821Ha;

    /* renamed from: Ia */
    private C7112l.C7119g f19822Ia;

    /* renamed from: Ja */
    private PointF f19823Ja;

    /* renamed from: Ka */
    private C7112l.C7121i f19824Ka;

    /* renamed from: La */
    private Paint f19825La;

    /* renamed from: Ma */
    private Paint f19826Ma;

    /* renamed from: Na */
    private Paint f19827Na;

    /* renamed from: Oa */
    private Paint f19828Oa;

    /* renamed from: Pa */
    private Paint f19829Pa;

    /* renamed from: Qa */
    private Paint f19830Qa;

    /* renamed from: Ra */
    private float f19831Ra = 350.0f;

    /* renamed from: ta */
    private boolean f19832ta = false;

    /* renamed from: ua */
    private String f19833ua = "";

    /* renamed from: va */
    private Paint f19834va;

    /* renamed from: wa */
    private Paint f19835wa;

    /* renamed from: xa */
    private Paint f19836xa;

    /* renamed from: ya */
    private Paint f19837ya;

    /* renamed from: za */
    private Paint f19838za;

    C7154x(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21223a(Activity activity, C7112l.C7120h hVar, C7084c.C7085a aVar) {
        this.f19835wa = new Paint();
        this.f19835wa.setColor(Color.argb(255, 255, 131, 124));
        this.f19825La = new Paint();
        this.f19825La.setColor(Color.argb(255, 255, 0, 0));
        this.f19826Ma = new Paint();
        this.f19826Ma.setColor(Color.argb(255, 0, 255, 0));
        this.f19827Na = new Paint();
        this.f19827Na.setColor(Color.argb(255, 0, 0, 255));
        this.f19828Oa = new Paint();
        this.f19828Oa.setColor(Color.argb(255, 255, 255, 255));
        this.f19829Pa = new Paint();
        this.f19829Pa.setColor(Color.argb(100, 255, 163, 0));
        this.f19830Qa = new Paint();
        this.f19830Qa.setStrokeWidth(5.0f);
        this.f19830Qa.setStyle(Paint.Style.STROKE);
        this.f19830Qa.setColor(Color.argb(255, 255, 163, 0));
        this.f19834va = new Paint();
        this.f19834va.setTextSize(70.0f);
        this.f19838za = new Paint();
        this.f19838za.setColor(Color.argb(255, 0, 0, 0));
        this.f19838za.setTextSize(30.0f);
        this.f19838za.setStrokeWidth(5.0f);
        this.f19814Aa = new Paint();
        this.f19814Aa.setColor(Color.argb(255, 138, 7, 78));
        this.f19815Ba = new Paint();
        this.f19815Ba.setColor(Color.argb(255, 255, 255, 255));
        this.f19816Ca = new Paint();
        this.f19816Ca.setColor(Color.argb(150, 0, 0, 0));
        this.f19817Da = new Paint();
        this.f19817Da.setColor(Color.argb(255, 100, 5, 150));
        this.f19818Ea = new Paint();
        this.f19818Ea.setColor(Color.argb(255, 255, 79, 0));
        this.f19819Fa = new Paint();
        this.f19819Fa.setColor(Color.argb(255, 255, 131, 124));
        this.f19819Fa.setStrokeWidth(10.0f);
        this.f19820Ga = new Paint();
        this.f19820Ga.setColor(Color.argb(255, 127, 56, 147));
        this.f19820Ga.setStrokeWidth(10.0f);
        if (f19813sa) {
            this.f19836xa = new Paint();
            this.f19836xa.setColor(-256);
            this.f19837ya = new Paint();
            this.f19837ya.setAntiAlias(true);
            this.f19837ya.setColor(-16777216);
            this.f19837ya.setTextSize(C7173l.m26990a((Context) activity, 12.0f));
        }
        super.mo21223a(activity, hVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21250a(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (canvas2 != null) {
            try {
                super.mo21250a(canvas);
                C7112l.C7120h d = C7109ja.m26767a().mo21176d();
                if (d != null) {
                    Iterator<C7112l.C7119g> it = d.f19631m.iterator();
                    while (it.hasNext()) {
                        C7112l.C7119g next = it.next();
                        Paint paint = next.f19615l.equals("S") ? this.f19814Aa : this.f19835wa;
                        mo21251a(this.f19792x, this.f19764ga, this.f19766ha, next.f19616m.x, next.f19616m.y);
                        canvas2.drawCircle(this.f19766ha[0], this.f19766ha[1], 20.0f, paint);
                        if (f19813sa) {
                            canvas2.drawText(String.valueOf(next.f18678c), this.f19766ha[0], this.f19766ha[1] - 20.0f, this.f19837ya);
                        }
                    }
                }
                if (d != null) {
                    if (d.f19633o != null) {
                        Iterator<C7112l.C7121i> it2 = d.f19633o.iterator();
                        while (it2.hasNext()) {
                            C7112l.C7121i next2 = it2.next();
                            PointF pointF = next2.f19641d.f19650c;
                            mo21251a(this.f19792x, this.f19764ga, this.f19766ha, pointF.x, pointF.y);
                            float f = this.f19766ha[0];
                            float f2 = this.f19766ha[1];
                            PointF pointF2 = next2.f19642e.f19650c;
                            mo21251a(this.f19792x, this.f19764ga, this.f19766ha, pointF2.x, pointF2.y);
                            canvas.drawLine(f, f2, this.f19766ha[0], this.f19766ha[1], this.f19819Fa);
                        }
                    }
                    if (d.f19632n != null) {
                        Iterator<C7112l.C7122j> it3 = d.f19632n.iterator();
                        while (it3.hasNext()) {
                            C7112l.C7122j next3 = it3.next();
                            mo21251a(this.f19792x, this.f19764ga, this.f19766ha, next3.f19650c.x, next3.f19650c.y);
                            canvas2.drawCircle(this.f19766ha[0], this.f19766ha[1], 20.0f, this.f19825La);
                            if (f19813sa) {
                                canvas2.drawText(String.valueOf(next3.f19648a), this.f19766ha[0], this.f19766ha[1] - 20.0f, this.f19837ya);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo21064a(C7112l.C7119g gVar, C7112l.C7119g gVar2) {
        this.f19821Ha = gVar;
        this.f19822Ia = gVar2;
    }

    /* renamed from: b */
    public void mo21065b(PointF pointF) {
        this.f19823Ja = pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21258f() {
        super.mo21258f();
        this.f19824Ka = null;
        this.f19823Ja = null;
        this.f19821Ha = null;
        this.f19822Ia = null;
        this.f19832ta = false;
    }
}
