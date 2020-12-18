package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.p007v4.view.C0475j;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p101d.p111d.p112a.C5220b;
import p101d.p111d.p112a.C5242d;
import p101d.p111d.p112a.C5244e;
import p101d.p111d.p112a.C5246f;
import p267i.p268a.p269a.C6660a;
import p267i.p268a.p269a.C6668b;
import p267i.p268a.p269a.p270a.C6665e;
import p267i.p268a.p269a.p270a.C6666f;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.C7129n;
import p299tw.navin.navinmap.map.PMISLMain;
import p299tw.navin.navinmap.map.p300a.C7082b;
import p299tw.navin.navinmap.map.p300a.C7084c;
import p299tw.navin.navinmap.map.p300a.C7087e;
import p299tw.navin.navinmap.util.C7173l;
import p299tw.navin.navinmap.util.MathUtils;

/* renamed from: tw.navin.navinmap.map.w */
class C7146w extends SurfaceView implements SurfaceHolder.Callback, PMISLMain.C7059a {

    /* renamed from: a */
    private static int f19728a = 0;

    /* renamed from: b */
    private static int f19729b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f19730c = 2;

    /* renamed from: A */
    private Matrix f19731A;

    /* renamed from: B */
    private PointF f19732B;

    /* renamed from: C */
    private PointF f19733C;

    /* renamed from: D */
    private PointF f19734D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public SparseArray<C7112l.C7123k> f19735E;

    /* renamed from: F */
    private C7112l.C7123k f19736F;

    /* renamed from: G */
    private C7112l.C7123k f19737G;

    /* renamed from: H */
    private float f19738H;

    /* renamed from: I */
    private float f19739I;

    /* renamed from: J */
    private float f19740J;

    /* renamed from: K */
    private float f19741K;

    /* renamed from: L */
    private float f19742L;

    /* renamed from: M */
    private float f19743M;

    /* renamed from: N */
    private float f19744N;

    /* renamed from: O */
    private float f19745O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public float[] f19746P;

    /* renamed from: Q */
    private int f19747Q;

    /* renamed from: R */
    private int f19748R;

    /* renamed from: S */
    private int f19749S;

    /* renamed from: T */
    private int f19750T;

    /* renamed from: U */
    private int f19751U;

    /* renamed from: V */
    private int f19752V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f19753W;

    /* renamed from: aa */
    private boolean f19754aa;

    /* renamed from: ba */
    private boolean f19755ba;

    /* renamed from: ca */
    private boolean f19756ca;

    /* renamed from: d */
    private C7152f f19757d;
    /* access modifiers changed from: private */

    /* renamed from: da */
    public boolean f19758da;

    /* renamed from: e */
    private C7149c f19759e;

    /* renamed from: ea */
    final int f19760ea;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7129n f19761f;

    /* renamed from: fa */
    final int f19762fa;

    /* renamed from: g */
    private final Object f19763g;

    /* renamed from: ga */
    float[] f19764ga;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7084c.C7085a f19765h;

    /* renamed from: ha */
    float[] f19766ha;

    /* renamed from: i */
    private C7104ha f19767i;

    /* renamed from: ia */
    float[] f19768ia;

    /* renamed from: j */
    private Paint f19769j;

    /* renamed from: ja */
    float[] f19770ja;

    /* renamed from: k */
    private Paint f19771k;

    /* renamed from: ka */
    float[] f19772ka;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Paint f19773l;

    /* renamed from: la */
    float[] f19774la;

    /* renamed from: m */
    private Paint f19775m;
    /* access modifiers changed from: private */

    /* renamed from: ma */
    public C5242d f19776ma;

    /* renamed from: n */
    private Paint f19777n;

    /* renamed from: na */
    private C7148b f19778na;

    /* renamed from: o */
    private Bitmap f19779o;

    /* renamed from: oa */
    private int f19780oa;

    /* renamed from: p */
    private Bitmap f19781p;

    /* renamed from: pa */
    boolean f19782pa;

    /* renamed from: q */
    private C7084c f19783q;

    /* renamed from: qa */
    boolean f19784qa;

    /* renamed from: r */
    private Path f19785r;

    /* renamed from: ra */
    private C5244e.C5245a f19786ra;

    /* renamed from: s */
    private Path f19787s;

    /* renamed from: t */
    private Path f19788t;

    /* renamed from: u */
    private Path f19789u;

    /* renamed from: v */
    private Matrix f19790v;

    /* renamed from: w */
    protected Matrix f19791w;

    /* renamed from: x */
    protected Matrix f19792x;

    /* renamed from: y */
    private Matrix f19793y;

    /* renamed from: z */
    private Matrix f19794z;

    /* renamed from: tw.navin.navinmap.map.w$a */
    private class C7147a implements C7129n.C7130a {
        private C7147a() {
        }

        /* renamed from: a */
        public void mo21212a() {
            C7146w wVar = C7146w.this;
            boolean unused = wVar.f19758da = wVar.f19761f.mo21208b() <= 2;
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$b */
    private class C7148b implements C5220b.C5224d {
        private C7148b() {
        }

        /* renamed from: a */
        public void mo14468a(C5246f fVar) {
            fVar.mo14549a(C7146w.this.f19791w);
            C7146w wVar = C7146w.this;
            wVar.f19791w.getValues(wVar.f19746P);
        }

        /* renamed from: a */
        public void mo14469a(C5246f fVar, C5246f fVar2) {
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$c */
    private class C7149c extends Thread {

        /* renamed from: a */
        private C7112l.C7120h f19797a;

        /* renamed from: b */
        private C7129n f19798b = null;

        /* renamed from: c */
        private boolean f19799c = false;

        public C7149c(C7112l.C7120h hVar) {
            this.f19797a = hVar;
        }

        /* renamed from: a */
        private synchronized void m26951a(SparseArray<C7112l.C7123k> sparseArray, ArrayList<? extends C7112l.C7123k> arrayList) {
            Iterator<? extends C7112l.C7123k> it = arrayList.iterator();
            while (it.hasNext()) {
                C7112l.C7123k kVar = (C7112l.C7123k) it.next();
                sparseArray.put(kVar.f19655a, kVar);
                try {
                    if (kVar.f19666l == null && kVar.f19657c != null) {
                        Rect rect = new Rect();
                        C7146w.this.f19773l.getTextBounds(kVar.f19657c, 0, kVar.f19657c.length(), rect);
                        kVar.f19666l = rect;
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
                if (this.f19799c) {
                    break;
                }
            }
        }

        /* renamed from: a */
        public void mo21263a() {
            this.f19799c = true;
            C7129n nVar = this.f19798b;
            if (nVar != null) {
                nVar.mo21203a();
            }
            synchronized (this) {
                this.f19798b = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 100
                r0.<init>(r1)
                tw.navin.navinmap.map.l$h r1 = r5.f19797a
                java.util.ArrayList<tw.navin.navinmap.map.l$e> r1 = r1.f19637s
                if (r1 == 0) goto L_0x0010
                r5.m26951a(r0, r1)
            L_0x0010:
                boolean r1 = r5.f19799c
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                tw.navin.navinmap.map.l$h r1 = r5.f19797a
                java.util.ArrayList<tw.navin.navinmap.map.l$l> r1 = r1.f19635q
                if (r1 == 0) goto L_0x001e
                r5.m26951a(r0, r1)
            L_0x001e:
                boolean r1 = r5.f19799c
                if (r1 == 0) goto L_0x0023
                return
            L_0x0023:
                int r1 = r0.size()
                r2 = 0
                if (r1 == 0) goto L_0x003a
                tw.navin.navinmap.map.n r1 = new tw.navin.navinmap.map.n
                r1.<init>()
                tw.navin.navinmap.map.w$a r3 = new tw.navin.navinmap.map.w$a
                tw.navin.navinmap.map.w r4 = p299tw.navin.navinmap.map.C7146w.this
                r3.<init>()
                r1.mo21207a((p299tw.navin.navinmap.map.C7129n.C7130a) r3)
                goto L_0x003b
            L_0x003a:
                r1 = r2
            L_0x003b:
                boolean r2 = r5.f19799c
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                monitor-enter(r5)
                r2 = 0
                if (r1 == 0) goto L_0x0055
                tw.navin.navinmap.map.l$h r3 = r5.f19797a     // Catch:{ all -> 0x0091 }
                boolean r3 = r3.f19630l     // Catch:{ all -> 0x0091 }
                if (r3 == 0) goto L_0x0052
                r1.mo21209b((android.util.SparseArray<p299tw.navin.navinmap.map.C7112l.C7123k>) r0)     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.l$h r3 = r5.f19797a     // Catch:{ all -> 0x0091 }
                r3.f19630l = r2     // Catch:{ all -> 0x0091 }
                goto L_0x0055
            L_0x0052:
                r1.mo21205a((android.util.SparseArray<p299tw.navin.navinmap.map.C7112l.C7123k>) r0)     // Catch:{ all -> 0x0091 }
            L_0x0055:
                boolean r3 = r5.f19799c     // Catch:{ all -> 0x0091 }
                if (r3 == 0) goto L_0x005b
                monitor-exit(r5)     // Catch:{ all -> 0x0091 }
                return
            L_0x005b:
                tw.navin.navinmap.map.w r3 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                int r4 = p299tw.navin.navinmap.map.C7146w.f19730c     // Catch:{ all -> 0x0091 }
                boolean r3 = r3.m26917a((int) r4)     // Catch:{ all -> 0x0091 }
                if (r3 == 0) goto L_0x008f
                tw.navin.navinmap.map.w r3 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                p299tw.navin.navinmap.map.C7129n unused = r3.f19761f = r1     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.w r1 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                android.util.SparseArray unused = r1.f19735E = r0     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.w r0 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                boolean r0 = r0.mo21255c()     // Catch:{ all -> 0x0091 }
                if (r0 == 0) goto L_0x008f
                tw.navin.navinmap.map.w r0 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                r0.m26916a((boolean) r2)     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.w r0 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.a.c$a r0 = r0.f19765h     // Catch:{ all -> 0x0091 }
                if (r0 == 0) goto L_0x008f
                tw.navin.navinmap.map.w r0 = p299tw.navin.navinmap.map.C7146w.this     // Catch:{ all -> 0x0091 }
                tw.navin.navinmap.map.a.c$a r0 = r0.f19765h     // Catch:{ all -> 0x0091 }
                r0.mo21032a()     // Catch:{ all -> 0x0091 }
            L_0x008f:
                monitor-exit(r5)     // Catch:{ all -> 0x0091 }
                return
            L_0x0091:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0091 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7146w.C7149c.run():void");
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$d */
    private class C7150d implements C7084c.C7085a {
        private C7150d() {
        }

        /* renamed from: a */
        public void mo21032a() {
            C7146w.this.mo21259g();
            if (C7146w.this.mo21255c() && C7146w.this.f19765h != null) {
                C7146w.this.f19765h.mo21032a();
            }
        }

        /* renamed from: b */
        public void mo21033b() {
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$e */
    private class C7151e implements View.OnTouchListener {

        /* renamed from: a */
        private float f19802a;

        /* renamed from: b */
        private float f19803b;

        /* renamed from: c */
        private int f19804c = -1;

        /* renamed from: d */
        private boolean f19805d = false;

        /* renamed from: e */
        private ScaleGestureDetector f19806e;

        public C7151e() {
            this.f19806e = new ScaleGestureDetector(C7146w.this.getContext(), new C7153g());
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i = 0;
            if (!C7146w.this.mo21255c()) {
                return false;
            }
            try {
                this.f19806e.onTouchEvent(motionEvent);
                C7146w.this.f19776ma.onTouch(view, motionEvent);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            int b = C0475j.m2208b(motionEvent);
            if (b == 0) {
                int a = C0475j.m2206a(motionEvent);
                float c = C0475j.m2210c(motionEvent, a);
                float d = C0475j.m2211d(motionEvent, a);
                this.f19802a = c;
                this.f19803b = d;
                this.f19804c = C0475j.m2209b(motionEvent, 0);
                this.f19805d = true;
            } else if (b == 1) {
                this.f19804c = -1;
                view.performClick();
                if (this.f19805d) {
                    C7146w.this.mo21222a(this.f19802a, this.f19803b);
                    this.f19805d = false;
                }
            } else if (b == 2) {
                int a2 = C0475j.m2207a(motionEvent, this.f19804c);
                float c2 = C0475j.m2210c(motionEvent, a2);
                float d2 = C0475j.m2211d(motionEvent, a2);
                if (Math.abs(c2 - this.f19802a) > 5.0f || Math.abs(d2 - this.f19803b) > 5.0f) {
                    this.f19805d = false;
                }
                this.f19802a = c2;
                this.f19803b = d2;
            } else if (b == 3) {
                this.f19804c = -1;
            } else if (b == 6) {
                int a3 = C0475j.m2206a(motionEvent);
                if (C0475j.m2209b(motionEvent, a3) == this.f19804c) {
                    if (a3 == 0) {
                        i = 1;
                    }
                    this.f19802a = C0475j.m2210c(motionEvent, i);
                    this.f19803b = C0475j.m2211d(motionEvent, i);
                    this.f19804c = C0475j.m2209b(motionEvent, i);
                }
            }
            return true;
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$f */
    private class C7152f extends Thread {

        /* renamed from: a */
        private boolean f19808a = true;

        /* renamed from: b */
        private SurfaceHolder f19809b;

        /* renamed from: c */
        private C7146w f19810c;

        public C7152f(SurfaceHolder surfaceHolder, C7146w wVar) {
            this.f19809b = surfaceHolder;
            this.f19810c = wVar;
        }

        /* renamed from: a */
        public synchronized void mo21266a() {
            this.f19808a = false;
        }

        public void run() {
            while (this.f19808a) {
                try {
                    Canvas lockCanvas = this.f19809b.lockCanvas((Rect) null);
                    this.f19810c.mo21250a(lockCanvas);
                    if (this.f19808a) {
                        if (lockCanvas != null) {
                            this.f19809b.unlockCanvasAndPost(lockCanvas);
                        }
                        if (C7146w.this.mo21255c()) {
                            if (C7146w.this.f19753W) {
                                Thread.sleep(42);
                            }
                        }
                        Thread.sleep(500);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f19809b.removeCallback(C7146w.this);
            this.f19809b = null;
            this.f19810c = null;
        }
    }

    /* renamed from: tw.navin.navinmap.map.w$g */
    private class C7153g extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C7153g() {
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            C7146w.this.m26916a(false);
        }
    }

    C7146w(Context context) {
        this(context, (AttributeSet) null, 0, C5244e.C5245a.OUTSIDE);
    }

    C7146w(Context context, AttributeSet attributeSet, int i, C5244e.C5245a aVar) {
        super(context, attributeSet, i);
        this.f19759e = null;
        this.f19763g = new Object();
        this.f19785r = null;
        this.f19787s = null;
        this.f19788t = null;
        this.f19789u = null;
        this.f19736F = null;
        this.f19737G = null;
        this.f19742L = 1.0f;
        this.f19743M = 10.0f;
        this.f19744N = 1.0f;
        this.f19747Q = 0;
        this.f19748R = 0;
        this.f19749S = 0;
        this.f19752V = f19728a;
        this.f19753W = false;
        this.f19754aa = false;
        this.f19755ba = false;
        this.f19756ca = false;
        this.f19758da = false;
        this.f19760ea = 0;
        this.f19762fa = 1;
        this.f19764ga = new float[2];
        this.f19766ha = new float[2];
        this.f19768ia = new float[2];
        this.f19770ja = new float[2];
        this.f19772ka = new float[2];
        this.f19774la = new float[2];
        this.f19780oa = -1;
        this.f19782pa = true;
        this.f19784qa = false;
        this.f19786ra = C5244e.C5245a.OUTSIDE;
        getHolder().addCallback(this);
        this.f19786ra = aVar;
        this.f19776ma = new C5242d(this);
        m26928j();
        setOnTouchListener(new C7151e());
    }

    C7146w(Context context, C5244e.C5245a aVar) {
        this(context, (AttributeSet) null, 0, aVar);
    }

    /* renamed from: a */
    private C7112l.C7123k m26912a(SparseArray<? extends C7112l.C7123k> sparseArray, float f, float f2) {
        float b = C6665e.m25345a().mo17120b();
        for (int i = 0; i < sparseArray.size(); i++) {
            C7112l.C7123k kVar = (C7112l.C7123k) sparseArray.valueAt(i);
            if (!kVar.f19664j) {
                Matrix matrix = this.f19791w;
                float[] fArr = this.f19772ka;
                float[] fArr2 = this.f19774la;
                PointF pointF = kVar.f19661g;
                mo21251a(matrix, fArr, fArr2, pointF.x, pointF.y);
                float[] fArr3 = this.f19774la;
                if (MathUtils.m26961a(f, f2, fArr3[0], fArr3[1]) <= b) {
                    return kVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m26914a(Canvas canvas, C7112l.C7123k kVar, float f, float f2) {
        C7112l.C7123k kVar2;
        C7112l.C7123k kVar3;
        if (this.f19758da || kVar.f19665k || (((kVar2 = this.f19737G) != null && kVar2 == kVar) || ((kVar3 = this.f19736F) != null && kVar3 == kVar))) {
            float centerX = f - ((float) kVar.f19666l.centerX());
            C7112l.C7123k kVar4 = this.f19736F;
            float b = (kVar4 == null || kVar4 != kVar) ? (f2 - C6665e.m25345a().mo17120b()) - C7173l.m26990a(getContext(), 5.0f) : f2 + (C6665e.m25345a().mo17120b() * 2.0f) + C7173l.m26990a(getContext(), 5.0f);
            canvas.drawText(kVar.f19657c, centerX, b, this.f19775m);
            canvas.drawText(kVar.f19657c, centerX, b, this.f19773l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26916a(boolean z) {
        if (this.f19761f != null && mo21255c()) {
            if (z) {
                this.f19761f.mo21211d();
            }
            this.f19761f.mo21204a(getContext(), this.f19791w);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m26917a(int i) {
        synchronized (this.f19763g) {
            if (i == f19730c && this.f19752V != f19729b) {
                return false;
            }
            this.f19752V = i;
            return true;
        }
    }

    /* renamed from: b */
    private void m26920b(float f, float f2) {
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        Matrix matrix = this.f19791w;
        if (matrix != null && this.f19734D != null) {
            fArr[0] = f;
            fArr[1] = f2;
            matrix.mapPoints(fArr2, fArr);
            this.f19776ma.mo14428c().mo14555c(this.f19734D.x - ((float) Math.round(fArr2[0])), this.f19734D.y - ((float) Math.round(fArr2[1])));
            this.f19776ma.mo14444m();
        }
    }

    private int getStatus() {
        int i;
        synchronized (this.f19763g) {
            i = this.f19752V;
        }
        return i;
    }

    /* renamed from: i */
    private void m26927i() {
        boolean z;
        C5244e eVar;
        if (this.f19755ba) {
            eVar = this.f19776ma.mo14421b();
            z = false;
        } else {
            eVar = this.f19776ma.mo14421b();
            z = true;
        }
        eVar.mo14520b(z);
    }

    /* renamed from: j */
    private void m26928j() {
        m26927i();
        this.f19776ma.mo14421b().mo14522c(true);
        this.f19776ma.mo14421b().mo14517a(false);
        this.f19776ma.mo14421b().mo14514a(10.0f);
        this.f19776ma.mo14421b().mo14513a();
        this.f19776ma.mo14421b().mo14516a(this.f19786ra);
    }

    /* renamed from: k */
    private void m26929k() {
        PointF pointF = this.f19732B;
        if (pointF != null && this.f19779o != null) {
            if (!this.f19755ba) {
                mo21251a(this.f19792x, this.f19768ia, this.f19770ja, pointF.x, pointF.y);
                this.f19731A.setTranslate(this.f19738H, this.f19739I);
                this.f19731A.postRotate(this.f19745O + this.f19776ma.mo14428c().mo14551b());
                Matrix matrix = this.f19731A;
                float[] fArr = this.f19770ja;
                matrix.postTranslate(fArr[0], fArr[1]);
            } else {
                mo21254b();
                this.f19793y.set(this.f19791w);
                PointF pointF2 = this.f19734D;
                this.f19793y.postRotate(-this.f19745O, pointF2.x, pointF2.y);
                Matrix matrix2 = this.f19731A;
                PointF pointF3 = this.f19734D;
                matrix2.setTranslate(pointF3.x + this.f19738H, pointF3.y + this.f19739I);
            }
            this.f19794z.set(this.f19731A);
        }
    }

    /* renamed from: l */
    private void m26930l() {
        PointF pointF = this.f19733C;
        if (pointF != null) {
            m26920b(pointF.x, pointF.y);
        }
    }

    /* renamed from: m */
    private void m26931m() {
        C7129n nVar = this.f19761f;
        if (nVar != null) {
            nVar.mo21210c();
        }
    }

    /* renamed from: a */
    public void mo21025a(float f) {
        int round = Math.round(f);
        if (Math.abs(Math.round(this.f19745O) - round) > 5) {
            this.f19745O = (float) round;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21222a(float f, float f2) {
        C7112l.C7123k kVar = null;
        try {
            if (getStatus() == f19730c) {
                if (this.f19735E != null) {
                    kVar = m26912a((SparseArray<? extends C7112l.C7123k>) this.f19735E, f, f2);
                }
                if (kVar != null && (kVar instanceof C7112l.C7117e)) {
                    C7112l.C7117e eVar = (C7112l.C7117e) kVar;
                    if (eVar.f19608n == 33 || eVar.f19608n == 34) {
                        return;
                    }
                }
                if (!((this.f19736F == null && kVar == null) || this.f19767i == null)) {
                    this.f19767i.mo21036a(kVar);
                }
            }
            this.f19736F = kVar;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21223a(Activity activity, C7112l.C7120h hVar, C7084c.C7085a aVar) {
        this.f19765h = aVar;
        this.f19779o = BitmapFactory.decodeResource(getResources(), C6668b.arrows);
        this.f19738H = ((float) (-this.f19779o.getWidth())) / 2.0f;
        this.f19739I = ((float) (-this.f19779o.getHeight())) / 2.0f;
        this.f19781p = BitmapFactory.decodeResource(getResources(), C6668b.icon_destination);
        this.f19740J = ((float) (-this.f19781p.getWidth())) * 0.5f;
        this.f19741K = (float) (-this.f19781p.getHeight());
        this.f19791w = new Matrix();
        this.f19790v = new Matrix();
        this.f19792x = new Matrix();
        this.f19793y = new Matrix();
        this.f19794z = new Matrix();
        this.f19731A = new Matrix();
        this.f19787s = new Path();
        this.f19789u = new Path();
        this.f19746P = new float[9];
        this.f19777n = new Paint();
        this.f19777n.setAntiAlias(true);
        this.f19769j = new Paint();
        this.f19769j.setAntiAlias(true);
        this.f19769j.setColor(-16776961);
        this.f19769j.setStrokeCap(Paint.Cap.ROUND);
        this.f19769j.setStrokeJoin(Paint.Join.ROUND);
        this.f19769j.setStyle(Paint.Style.STROKE);
        this.f19769j.setStrokeWidth(getResources().getDimension(C6660a.routing_road_width));
        this.f19769j.setPathEffect((PathEffect) null);
        this.f19771k = new Paint(this.f19769j);
        this.f19771k.setAlpha(85);
        this.f19773l = new Paint();
        this.f19773l.setFakeBoldText(true);
        this.f19773l.setAntiAlias(true);
        this.f19773l.setColor(-16777216);
        this.f19773l.setTextSize(getResources().getDimension(C6660a.routing_poi_text_size));
        this.f19775m = new Paint();
        this.f19775m.setFakeBoldText(true);
        this.f19775m.setStyle(Paint.Style.STROKE);
        this.f19775m.setStrokeWidth(10.0f);
        this.f19775m.setAntiAlias(true);
        this.f19775m.setColor(-1);
        this.f19775m.setTextSize(getResources().getDimension(C6660a.routing_poi_text_size));
        m26917a(f19729b);
        this.f19759e = new C7149c(hVar);
        this.f19759e.start();
        this.f19783q = hVar.f19625g.equals(C7084c.f19524a) ? new C7087e(activity) : new C7082b(activity);
        this.f19783q.mo21118a((C7084c.C7085a) new C7150d());
        this.f19783q.mo21115a(hVar.f19624f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21250a(Canvas canvas) {
        Matrix matrix;
        Matrix matrix2;
        C6666f a;
        if (canvas != null) {
            try {
                canvas.drawColor(this.f19780oa);
                if (getStatus() == f19730c && mo21255c()) {
                    if (this.f19753W) {
                        if (this.f19755ba) {
                            matrix = this.f19792x;
                            matrix2 = this.f19793y;
                        } else {
                            matrix = this.f19792x;
                            matrix2 = this.f19791w;
                        }
                        matrix.set(matrix2);
                        this.f19783q.mo21114a(canvas, this.f19792x);
                        if (this.f19785r != null) {
                            this.f19785r.transform(this.f19792x, this.f19787s);
                            canvas.drawPath(this.f19787s, this.f19769j);
                            if (this.f19788t != null) {
                                this.f19788t.transform(this.f19792x, this.f19789u);
                                canvas.drawPath(this.f19789u, this.f19771k);
                            }
                            canvas.setMatrix((Matrix) null);
                        }
                        if (this.f19735E != null) {
                            for (int i = 0; i < this.f19735E.size(); i++) {
                                C7112l.C7123k valueAt = this.f19735E.valueAt(i);
                                if ((this.f19758da || !valueAt.f19664j) && (a = C6665e.m25345a().mo17118a(getContext(), valueAt)) != null) {
                                    mo21251a(this.f19792x, this.f19764ga, this.f19766ha, valueAt.f19661g.x, valueAt.f19661g.y);
                                    canvas.drawBitmap(a.f18473a, this.f19766ha[0] - a.f18474b.x, this.f19766ha[1] - a.f18474b.y, this.f19777n);
                                }
                            }
                        }
                        if (this.f19735E != null) {
                            for (int i2 = 0; i2 < this.f19735E.size(); i2++) {
                                C7112l.C7123k valueAt2 = this.f19735E.valueAt(i2);
                                if (!valueAt2.f19664j) {
                                    mo21251a(this.f19792x, this.f19764ga, this.f19766ha, valueAt2.f19661g.x, valueAt2.f19661g.y);
                                    m26914a(canvas, valueAt2, this.f19766ha[0], this.f19766ha[1]);
                                }
                            }
                        }
                        if (!(!this.f19756ca || this.f19733C == null || this.f19781p == null)) {
                            mo21251a(this.f19792x, this.f19764ga, this.f19766ha, this.f19733C.x, this.f19733C.y);
                            canvas.drawBitmap(this.f19781p, this.f19766ha[0] + this.f19740J, this.f19766ha[1] + this.f19741K, this.f19777n);
                        }
                        m26929k();
                        if (this.f19732B != null && this.f19779o != null) {
                            canvas.drawBitmap(this.f19779o, this.f19794z, this.f19777n);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21251a(Matrix matrix, float[] fArr, float[] fArr2, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
        matrix.mapPoints(fArr2, fArr);
    }

    /* renamed from: a */
    public void mo21026a(Path path, Path path2) {
        this.f19785r = path;
        this.f19788t = path2;
        if (this.f19785r == null) {
            this.f19787s = null;
        }
        if (this.f19788t == null) {
            this.f19789u = null;
        }
    }

    /* renamed from: a */
    public void mo21027a(Path path, Path path2, PointF pointF, boolean z) {
        this.f19785r = path;
        this.f19788t = path2;
        this.f19733C = pointF;
        this.f19756ca = z;
        if (pointF == null) {
            this.f19785r = null;
            this.f19787s = null;
            this.f19788t = null;
            this.f19789u = null;
        }
    }

    /* renamed from: a */
    public void mo21028a(PointF pointF) {
        if (!C7109ja.m26767a().mo21177e() || pointF == null) {
            this.f19732B = null;
        } else {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.f19732B;
            if (pointF2 == null) {
                this.f19732B = new PointF(f, f2);
            } else {
                pointF2.set(f, f2);
            }
        }
        if (this.f19782pa && !this.f19784qa && mo21255c() && this.f19753W) {
            this.f19782pa = false;
            mo21254b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21252a(C7112l.C7123k kVar, boolean z) {
        this.f19737G = kVar;
        if (this.f19761f != null) {
            this.f19761f.mo21206a(kVar);
            m26916a(true);
        }
        if (kVar != null) {
            try {
                if (kVar.f19661g != null && kVar.f19661g.x >= 0.0f && kVar.f19661g.y >= 0.0f) {
                    float f = kVar.f19661g.x;
                    float f2 = kVar.f19661g.y;
                    if (this.f19733C == null) {
                        this.f19733C = new PointF(f, f2);
                    } else {
                        this.f19733C.set(f, f2);
                    }
                    if (z) {
                        this.f19784qa = true;
                        m26930l();
                    } else {
                        this.f19784qa = false;
                    }
                    this.f19756ca = true;
                    this.f19736F = kVar;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        this.f19733C = null;
        this.f19736F = null;
        this.f19756ca = false;
        this.f19784qa = false;
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo21253a() {
        if (this.f19732B != null || this.f19755ba) {
            this.f19755ba = !this.f19755ba;
            if (this.f19755ba) {
                this.f19776ma.mo14428c().mo14553b(this.f19790v);
                this.f19776ma.mo14444m();
                this.f19793y.set(this.f19791w);
            } else {
                this.f19776ma.mo14428c().mo14553b(this.f19790v);
                this.f19776ma.mo14444m();
                mo21254b();
            }
            m26927i();
            m26916a(true);
        }
        return this.f19755ba;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo21254b() {
        if (this.f19732B != null) {
            m26920b(this.f19732B.x, this.f19732B.y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo21255c() {
        return this.f19754aa && getStatus() == f19730c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21256d() {
        this.f19791w.set(this.f19790v);
        this.f19776ma.mo14428c().mo14553b(this.f19791w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo21257e() {
        C7152f fVar = this.f19757d;
        if (fVar != null) {
            fVar.mo21266a();
            this.f19757d = null;
        }
        m26931m();
        this.f19765h = null;
        mo21258f();
        if (this.f19779o != null) {
            this.f19779o = null;
        }
        if (this.f19781p != null) {
            this.f19781p = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21258f() {
        this.f19754aa = false;
        this.f19753W = false;
        this.f19758da = false;
        C7148b bVar = this.f19778na;
        if (bVar != null) {
            this.f19776ma.mo14422b((C5220b.C5224d) bVar);
            this.f19778na = null;
        }
        this.f19776ma = new C5242d(this);
        m26928j();
        this.f19776ma.mo14421b().mo14519b(this.f19747Q, this.f19748R);
        C7084c cVar = this.f19783q;
        if (cVar != null) {
            cVar.mo21117c();
            this.f19783q = null;
        }
        this.f19791w = new Matrix();
        this.f19793y = new Matrix();
        this.f19794z = new Matrix();
        this.f19731A = new Matrix();
        this.f19745O = 0.0f;
        this.f19732B = null;
        this.f19742L = 1.0f;
        this.f19785r = null;
        this.f19788t = null;
        this.f19733C = null;
        this.f19782pa = true;
        this.f19784qa = false;
        C7149c cVar2 = this.f19759e;
        if (cVar2 != null) {
            cVar2.mo21263a();
        }
        m26931m();
        m26917a(f19728a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21259g() {
        this.f19750T = this.f19783q.mo21113a();
        this.f19751U = this.f19783q.mo21116b();
        float f = ((float) this.f19748R) / ((float) this.f19751U);
        this.f19744N = f;
        this.f19742L = f;
        this.f19749S = Math.round(((float) (this.f19747Q - Math.round(((float) this.f19750T) * this.f19742L))) / 2.0f);
        if (this.f19749S < 0) {
            this.f19749S = 0;
        }
        this.f19778na = new C7148b();
        this.f19776ma.mo14421b().mo14515a(this.f19750T, this.f19751U);
        this.f19776ma.mo14412a((C5220b.C5224d) this.f19778na);
        this.f19776ma.mo14421b().mo14516a(this.f19786ra);
        this.f19776ma.mo14421b().mo14519b(this.f19747Q, this.f19748R);
        this.f19776ma.mo14444m();
        this.f19776ma.mo14428c().mo14549a(this.f19790v);
        this.f19792x.set(this.f19790v);
        if (this.f19733C != null) {
            m26930l();
        }
        this.f19754aa = true;
        m26916a(false);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f19747Q = i;
        this.f19748R = i2;
        this.f19734D = new PointF(((float) i) * 0.5f, ((float) i2) * 0.5f);
        this.f19776ma.mo14421b().mo14519b(this.f19747Q, this.f19748R);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setBackgroundColor(int i) {
        this.f19780oa = i;
    }

    /* access modifiers changed from: package-private */
    public void setMapFitMethod(C5244e.C5245a aVar) {
        this.f19776ma.mo14421b().mo14516a(aVar);
        this.f19776ma.mo14444m();
    }

    /* access modifiers changed from: package-private */
    public void setOnPoiSelectListener(C7104ha haVar) {
        this.f19767i = haVar;
    }

    /* access modifiers changed from: package-private */
    public void setReadyToShow(boolean z) {
        this.f19753W = z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f19757d = new C7152f(surfaceHolder, this);
        this.f19757d.start();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
