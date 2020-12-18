package p101d.p191i.p192a.p194b.p195a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p101d.p191i.p192a.C6029j;
import p101d.p191i.p192a.p199d.C6010a;

/* renamed from: d.i.a.b.a.d */
public class C5986d extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: A */
    private PointF f16618A = new PointF();

    /* renamed from: B */
    private float f16619B;

    /* renamed from: C */
    private float f16620C;

    /* renamed from: D */
    private float f16621D = 0.0f;

    /* renamed from: E */
    private float f16622E = 0.0f;

    /* renamed from: F */
    private float f16623F = 0.0f;

    /* renamed from: G */
    private float f16624G = 0.0f;

    /* renamed from: H */
    private float f16625H = 1.0f;

    /* renamed from: I */
    private float f16626I = 1.0f;

    /* renamed from: J */
    private boolean f16627J = false;

    /* renamed from: K */
    private Rect f16628K = null;

    /* renamed from: L */
    private List<C5987a> f16629L = new ArrayList();

    /* renamed from: M */
    final Handler f16630M = new Handler();

    /* renamed from: N */
    Runnable f16631N = new C5984b(this);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f16632a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6029j f16633b = null;

    /* renamed from: c */
    private SurfaceHolder f16634c;

    /* renamed from: d */
    private List<C6010a> f16635d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5989f f16636e;

    /* renamed from: f */
    private boolean f16637f = true;

    /* renamed from: g */
    private boolean f16638g = true;

    /* renamed from: h */
    private boolean f16639h = true;

    /* renamed from: i */
    private boolean f16640i = false;

    /* renamed from: j */
    private boolean f16641j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f16642k = false;

    /* renamed from: l */
    private int f16643l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HashMap<String, PointF> f16644m = null;

    /* renamed from: n */
    private float f16645n;

    /* renamed from: o */
    private float f16646o;

    /* renamed from: p */
    private float f16647p;

    /* renamed from: q */
    private float f16648q;

    /* renamed from: r */
    private float f16649r;

    /* renamed from: s */
    private float f16650s = 1.0f;

    /* renamed from: t */
    private float f16651t = 5.0f;

    /* renamed from: u */
    private float f16652u = 1.0f;

    /* renamed from: v */
    private boolean f16653v = true;

    /* renamed from: w */
    private boolean f16654w = true;

    /* renamed from: x */
    private Matrix f16655x = new Matrix();

    /* renamed from: y */
    private Matrix f16656y = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public PointF f16657z = new PointF();

    /* renamed from: d.i.a.b.a.d$a */
    public interface C5987a {
        /* renamed from: a */
        void mo15778a();

        /* renamed from: a */
        void mo15779a(float f);

        /* renamed from: a */
        void mo15780a(float f, float f2);

        /* renamed from: b */
        void mo15781b(float f);
    }

    public C5986d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22667b();
    }

    /* renamed from: a */
    private float m22656a(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2((double) (motionEvent.getY(0) - motionEvent.getY(1)), (double) (motionEvent.getX(0) - motionEvent.getX(1))));
    }

    /* renamed from: a */
    private void m22660a(float f) {
        if (this.f16629L != null) {
            for (int i = 0; i < this.f16629L.size(); i++) {
                this.f16629L.get(i).mo15779a(f);
            }
        }
    }

    /* renamed from: a */
    private void m22661a(PointF pointF, MotionEvent motionEvent) {
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22663a(boolean r6, boolean r7) {
        /*
            r5 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.Matrix r1 = r5.f16655x
            r0.set(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            d.i.a.b.a.f r2 = r5.f16636e
            android.graphics.Picture r2 = r2.mo15845a()
            int r2 = r2.getWidth()
            float r2 = (float) r2
            d.i.a.b.a.f r3 = r5.f16636e
            android.graphics.Picture r3 = r3.mo15845a()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r0 = r1.width()
            float r2 = r1.height()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L_0x0064
            int r7 = r5.getHeight()
            float r7 = (float) r7
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0049
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r2 = r1.top
        L_0x0047:
            float r7 = r7 - r2
            goto L_0x0065
        L_0x0049:
            float r7 = r1.top
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0051
            float r7 = -r7
            goto L_0x0065
        L_0x0051:
            float r7 = r1.bottom
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float r2 = r1.bottom
            goto L_0x0047
        L_0x0064:
            r7 = r4
        L_0x0065:
            if (r6 == 0) goto L_0x009c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x007c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 / r3
            float r0 = r1.left
        L_0x0079:
            float r4 = r6 - r0
            goto L_0x0097
        L_0x007c:
            float r6 = r1.left
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            float r4 = -r6
            goto L_0x0097
        L_0x0084:
            float r6 = r1.right
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r1.right
            goto L_0x0079
        L_0x0097:
            android.graphics.Matrix r6 = r5.f16655x
            r6.postTranslate(r4, r7)
        L_0x009c:
            r5.mo15815a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p195a.C5986d.m22663a(boolean, boolean):void");
    }

    /* renamed from: b */
    private float m22665b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: b */
    private void m22667b() {
        this.f16635d = new C5983a(this);
        this.f16634c = getHolder();
        this.f16634c.addCallback(this);
    }

    /* renamed from: b */
    private void m22668b(float f) {
        if (this.f16629L != null) {
            for (int i = 0; i < this.f16629L.size(); i++) {
                this.f16629L.get(i).mo15781b(f);
            }
        }
    }

    /* renamed from: c */
    private void m22669c() {
        if (this.f16629L != null) {
            for (int i = 0; i < this.f16629L.size(); i++) {
                this.f16629L.get(i).mo15778a();
            }
        }
    }

    /* renamed from: d */
    private void m22672d() {
        float currentRotateDegrees;
        if (getCurrentRotateDegrees() > 360.0f) {
            currentRotateDegrees = getCurrentRotateDegrees() % 360.0f;
        } else if (getCurrentRotateDegrees() < 0.0f) {
            currentRotateDegrees = (getCurrentRotateDegrees() % 360.0f) + 360.0f;
        } else {
            return;
        }
        this.f16624G = currentRotateDegrees;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m22674e(float f, float f2) {
        if (this.f16629L != null) {
            for (int i = 0; i < this.f16629L.size(); i++) {
                this.f16629L.get(i).mo15780a(f, f2);
            }
        }
    }

    /* renamed from: a */
    public void mo15815a() {
        if (this.f16627J) {
            try {
                if (this.f16634c != null) {
                    synchronized (this.f16634c) {
                        Canvas lockCanvas = this.f16634c.lockCanvas(this.f16628K);
                        while (!this.f16627J) {
                            try {
                                this.f16634c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (lockCanvas != null) {
                            lockCanvas.drawColor(-1);
                            for (int i = 0; i < this.f16635d.size(); i++) {
                                if (this.f16635d.get(i).f16757b) {
                                    this.f16635d.get(i).mo15846a(lockCanvas, this.f16655x, this.f16626I, this.f16624G);
                                }
                            }
                        } else {
                            Log.d("MapMainView", "DO Nothing~~~~~~~~~~~");
                        }
                        this.f16634c.unlockCanvasAndPost(lockCanvas);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo15816a(float f, float f2, float f3) {
        if (this.f16637f) {
            this.f16655x.postRotate((-this.f16624G) + f, f2, f3);
            this.f16624G = f;
            this.f16623F = f;
            m22672d();
            mo15815a();
        }
    }

    /* renamed from: a */
    public void mo15817a(C5987a aVar) {
        this.f16629L.add(aVar);
    }

    /* renamed from: a */
    public void mo15818a(C6029j jVar) {
        this.f16633b = jVar;
    }

    /* renamed from: a */
    public void mo15819a(String str) {
        mo15820a(str, (List<String>) null);
    }

    /* renamed from: a */
    public void mo15820a(String str, List<String> list) {
        this.f16642k = false;
        new C5985c(this, str, list).start();
    }

    /* renamed from: a */
    public float[] mo15821a(float f, float f2) {
        Matrix matrix = new Matrix();
        float[] fArr = {f, f2};
        this.f16655x.invert(matrix);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: b */
    public void mo15822b(float f, float f2, float f3) {
        Matrix matrix = this.f16655x;
        float f4 = f / this.f16626I;
        matrix.postScale(f4, f4, f2, f3);
        this.f16626I = f;
        this.f16625H = f;
        mo15815a();
    }

    /* renamed from: b */
    public float[] mo15823b(float f, float f2) {
        float[] fArr = {f, f2};
        this.f16655x.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: c */
    public void mo15824c(float f, float f2) {
        this.f16655x.postTranslate(f, f2);
    }

    /* renamed from: d */
    public void mo15825d(float f, float f2) {
        this.f16655x.postTranslate(f, f2);
        this.f16656y.set(this.f16655x);
        mo15815a();
    }

    public void getCurrentMap() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            for (C6010a a : this.f16635d) {
                a.mo15846a(canvas, this.f16655x, this.f16626I, this.f16624G);
            }
            if (this.f16633b != null) {
                this.f16633b.mo15775a(createBitmap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float getCurrentRotateDegrees() {
        return this.f16624G;
    }

    public float getCurrentZoomValue() {
        return this.f16626I;
    }

    public HashMap<String, PointF> getMapInfo() {
        return this.f16644m;
    }

    public float getMaxZoomValue() {
        return this.f16651t;
    }

    public float getMinZoomValue() {
        return this.f16650s;
    }

    public List<C6010a> getOverLays() {
        return this.f16635d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0133, code lost:
        if (r1 > r2) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025b, code lost:
        if (r5 > r7) goto L_0x0255;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r10.m22669c()
            boolean r0 = r10.f16642k
            r1 = 0
            if (r0 == 0) goto L_0x0335
            d.i.a.b.a.f r0 = r10.f16636e
            if (r0 != 0) goto L_0x000e
            goto L_0x0335
        L_0x000e:
            int r0 = r11.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = "MapMainView"
            r3 = 1
            if (r0 == 0) goto L_0x0315
            r4 = 0
            if (r0 == r3) goto L_0x02d0
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 2
            if (r0 == r8) goto L_0x007a
            if (r0 == r7) goto L_0x0067
            r11 = 6
            if (r0 == r11) goto L_0x0029
            goto L_0x0334
        L_0x0029:
            boolean r11 = r10.f16632a
            if (r11 == 0) goto L_0x0032
            java.lang.String r11 = "ACTION_POINTER_UP"
            android.util.Log.d(r2, r11)
        L_0x0032:
            r10.f16653v = r3
            r10.mo15815a()
            int r11 = r10.f16643l
            if (r11 != r8) goto L_0x0040
            float r11 = r10.f16626I
            r10.f16625H = r11
            goto L_0x004e
        L_0x0040:
            if (r11 != r5) goto L_0x0047
        L_0x0042:
            float r11 = r10.f16624G
            r10.f16623F = r11
            goto L_0x004e
        L_0x0047:
            if (r11 != r7) goto L_0x004e
            float r11 = r10.f16626I
            r10.f16625H = r11
            goto L_0x0042
        L_0x004e:
            r10.f16654w = r1
            boolean r11 = r10.f16637f
            if (r11 != 0) goto L_0x0057
            r10.m22663a((boolean) r3, (boolean) r3)
        L_0x0057:
            r10.f16643l = r1
            float r11 = r10.getCurrentZoomValue()
            float r0 = r10.getMinZoomValue()
            float r11 = r11 / r0
            r10.m22668b((float) r11)
            goto L_0x0334
        L_0x0067:
            boolean r0 = r10.f16632a
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "ACTION_POINTER_DOWN"
            android.util.Log.d(r2, r0)
        L_0x0070:
            int r11 = r11.getPointerCount()
            if (r11 != r8) goto L_0x0334
            r10.f16643l = r6
            goto L_0x0334
        L_0x007a:
            boolean r0 = r10.f16632a
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "ACTION_MOVE"
            android.util.Log.d(r2, r0)
        L_0x0083:
            int r0 = r10.f16643l
            if (r0 != r6) goto L_0x00f1
            boolean r0 = r10.f16653v
            if (r0 == 0) goto L_0x00b4
            android.graphics.PointF r0 = r10.f16618A
            r10.m22661a((android.graphics.PointF) r0, (android.view.MotionEvent) r11)
            float r0 = r11.getX(r1)
            r10.f16648q = r0
            float r0 = r11.getY(r1)
            r10.f16649r = r0
            float r0 = r11.getX(r1)
            float r11 = r11.getY(r1)
            android.graphics.PointF r2 = r10.f16618A
            float r4 = r2.x
            float r2 = r2.y
            float r11 = p101d.p191i.p192a.p194b.p196b.C5990a.m22697a(r0, r11, r4, r2)
            r10.f16645n = r11
            r10.f16653v = r1
            goto L_0x0334
        L_0x00b4:
            android.graphics.Matrix r0 = r10.f16656y
            android.graphics.Matrix r2 = r10.f16655x
            r0.set(r2)
            float r0 = r10.f16648q
            float r2 = r10.f16649r
            float r4 = r11.getX(r1)
            float r5 = r11.getY(r1)
            float r0 = p101d.p191i.p192a.p194b.p196b.C5990a.m22697a(r0, r2, r4, r5)
            r10.f16646o = r0
            android.graphics.PointF r0 = r10.f16618A
            float r2 = r0.x
            float r0 = r0.y
            float r4 = r11.getX(r1)
            float r1 = r11.getY(r1)
            float r0 = p101d.p191i.p192a.p194b.p196b.C5990a.m22697a(r2, r0, r4, r1)
            r10.f16647p = r0
            float r0 = r10.m22656a((android.view.MotionEvent) r11)
            r10.f16619B = r0
            float r11 = r10.m22665b((android.view.MotionEvent) r11)
            r10.f16620C = r11
            r10.f16643l = r7
            goto L_0x0334
        L_0x00f1:
            if (r0 != r8) goto L_0x0147
            boolean r0 = r10.f16638g
            if (r0 == 0) goto L_0x0334
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.Matrix r1 = r10.f16656y
            r0.set(r1)
            boolean r0 = r10.f16641j
            if (r0 == 0) goto L_0x0108
            android.graphics.PointF r0 = r10.f16618A
            r10.m22661a((android.graphics.PointF) r0, (android.view.MotionEvent) r11)
            goto L_0x011c
        L_0x0108:
            android.graphics.PointF r0 = r10.f16618A
            int r1 = r10.getWidth()
            int r1 = r1 / r8
            float r1 = (float) r1
            r0.x = r1
            android.graphics.PointF r0 = r10.f16618A
            int r1 = r10.getHeight()
            int r1 = r1 / r8
            float r1 = (float) r1
            r0.y = r1
        L_0x011c:
            float r11 = r10.m22665b((android.view.MotionEvent) r11)
            float r0 = r10.f16620C
            float r11 = r11 / r0
            float r0 = r10.f16625H
            float r1 = r0 * r11
            float r2 = r10.f16650s
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x012f
        L_0x012d:
            r1 = r2
            goto L_0x0136
        L_0x012f:
            float r2 = r10.f16651t
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0138
            goto L_0x012d
        L_0x0136:
            float r11 = r1 / r0
        L_0x0138:
            r10.f16626I = r1
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.PointF r1 = r10.f16618A
            float r2 = r1.x
            float r1 = r1.y
            r0.postScale(r11, r11, r2, r1)
            goto L_0x0211
        L_0x0147:
            java.lang.String r1 = "TOUCH_STATE_ROTATE: degree:"
            r6 = 1135869952(0x43b40000, float:360.0)
            if (r0 != r5) goto L_0x01b6
            boolean r0 = r10.f16637f
            if (r0 == 0) goto L_0x0334
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.Matrix r5 = r10.f16656y
            r0.set(r5)
            boolean r0 = r10.f16640i
            if (r0 == 0) goto L_0x0162
            android.graphics.PointF r0 = r10.f16618A
            r10.m22661a((android.graphics.PointF) r0, (android.view.MotionEvent) r11)
            goto L_0x0176
        L_0x0162:
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getWidth()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.x = r5
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getHeight()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.y = r5
        L_0x0176:
            float r11 = r10.m22656a((android.view.MotionEvent) r11)
            float r0 = r10.f16619B
            float r11 = r11 - r0
            float r0 = r10.f16623F
            float r0 = r0 + r11
            float r0 = r0 % r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            float r0 = r0 + r6
        L_0x0187:
            r10.f16624G = r0
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.PointF r4 = r10.f16618A
            float r5 = r4.x
            float r4 = r4.y
            r0.postRotate(r11, r5, r4)
            r10.mo15815a()
            float r11 = r10.f16624G
            r10.m22660a((float) r11)
            boolean r11 = r10.f16632a
            if (r11 == 0) goto L_0x0334
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            float r0 = r10.f16624G
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r2, r11)
            goto L_0x0334
        L_0x01b6:
            if (r0 != r3) goto L_0x0216
            boolean r0 = r10.f16639h
            if (r0 == 0) goto L_0x0334
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.Matrix r1 = r10.f16656y
            r0.set(r1)
            float r0 = r11.getX()
            android.graphics.PointF r1 = r10.f16657z
            float r1 = r1.x
            float r0 = r0 - r1
            float r11 = r11.getY()
            android.graphics.PointF r1 = r10.f16657z
            float r1 = r1.y
            float r11 = r11 - r1
            float r1 = r10.f16621D
            float r4 = java.lang.Math.abs(r0)
            float r1 = r1 + r4
            r10.f16621D = r1
            float r1 = r10.f16622E
            float r4 = java.lang.Math.abs(r11)
            float r1 = r1 + r4
            r10.f16622E = r1
            boolean r1 = r10.f16632a
            if (r1 == 0) goto L_0x020c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "(dx, dy) = ("
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r11)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x020c:
            android.graphics.Matrix r1 = r10.f16655x
            r1.postTranslate(r0, r11)
        L_0x0211:
            r10.mo15815a()
            goto L_0x0334
        L_0x0216:
            if (r0 != r7) goto L_0x0334
            boolean r0 = r10.f16638g
            if (r0 == 0) goto L_0x0271
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.Matrix r5 = r10.f16656y
            r0.set(r5)
            boolean r0 = r10.f16641j
            if (r0 == 0) goto L_0x022d
            android.graphics.PointF r0 = r10.f16618A
            r10.m22661a((android.graphics.PointF) r0, (android.view.MotionEvent) r11)
            goto L_0x0241
        L_0x022d:
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getWidth()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.x = r5
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getHeight()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.y = r5
        L_0x0241:
            float r0 = r10.m22665b((android.view.MotionEvent) r11)
            float r5 = r10.f16620C
            float r0 = r0 / r5
            r10.f16652u = r0
            float r0 = r10.f16625H
            float r5 = r10.f16652u
            float r5 = r5 * r0
            float r7 = r10.f16650s
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0257
        L_0x0255:
            r5 = r7
            goto L_0x025e
        L_0x0257:
            float r7 = r10.f16651t
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0262
            goto L_0x0255
        L_0x025e:
            float r0 = r5 / r0
            r10.f16652u = r0
        L_0x0262:
            r10.f16626I = r5
            android.graphics.Matrix r0 = r10.f16655x
            float r5 = r10.f16652u
            android.graphics.PointF r7 = r10.f16618A
            float r9 = r7.x
            float r7 = r7.y
            r0.postScale(r5, r5, r9, r7)
        L_0x0271:
            boolean r0 = r10.f16637f
            if (r0 == 0) goto L_0x0211
            boolean r0 = r10.f16640i
            if (r0 == 0) goto L_0x027f
            android.graphics.PointF r0 = r10.f16618A
            r10.m22661a((android.graphics.PointF) r0, (android.view.MotionEvent) r11)
            goto L_0x0293
        L_0x027f:
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getWidth()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.x = r5
            android.graphics.PointF r0 = r10.f16618A
            int r5 = r10.getHeight()
            int r5 = r5 / r8
            float r5 = (float) r5
            r0.y = r5
        L_0x0293:
            float r11 = r10.m22656a((android.view.MotionEvent) r11)
            float r0 = r10.f16619B
            float r11 = r11 - r0
            float r0 = r10.f16623F
            float r0 = r0 + r11
            float r0 = r0 % r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x02a3
            goto L_0x02a4
        L_0x02a3:
            float r0 = r0 + r6
        L_0x02a4:
            r10.f16624G = r0
            android.graphics.Matrix r0 = r10.f16655x
            android.graphics.PointF r4 = r10.f16618A
            float r5 = r4.x
            float r4 = r4.y
            r0.postRotate(r11, r5, r4)
            float r11 = r10.f16624G
            r10.m22660a((float) r11)
            boolean r11 = r10.f16632a
            if (r11 == 0) goto L_0x0211
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            float r0 = r10.f16624G
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r2, r11)
            goto L_0x0211
        L_0x02d0:
            boolean r11 = r10.f16632a
            if (r11 == 0) goto L_0x02d9
            java.lang.String r11 = "ACTION_UP"
            android.util.Log.d(r2, r11)
        L_0x02d9:
            float r11 = r10.f16621D
            float r11 = java.lang.Math.abs(r11)
            r0 = 1092616192(0x41200000, float:10.0)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x02e7
            r11 = r3
            goto L_0x02e8
        L_0x02e7:
            r11 = r1
        L_0x02e8:
            float r2 = r10.f16622E
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f4
            r0 = r3
            goto L_0x02f5
        L_0x02f4:
            r0 = r1
        L_0x02f5:
            r11 = r11 & r0
            boolean r0 = r10.f16654w
            r11 = r11 & r0
            if (r11 == 0) goto L_0x030c
            android.graphics.PointF r11 = r10.f16657z
            float r0 = r11.x
            float r11 = r11.y
            float[] r11 = r10.mo15821a((float) r0, (float) r11)
            r0 = r11[r1]
            r11 = r11[r3]
            r10.m22674e(r0, r11)
        L_0x030c:
            r10.f16621D = r4
            r10.f16622E = r4
            r10.f16654w = r3
            r10.f16643l = r1
            goto L_0x0334
        L_0x0315:
            boolean r0 = r10.f16632a
            if (r0 == 0) goto L_0x031e
            java.lang.String r0 = "ACTION_DOWN"
            android.util.Log.d(r2, r0)
        L_0x031e:
            android.graphics.Matrix r0 = r10.f16656y
            android.graphics.Matrix r1 = r10.f16655x
            r0.set(r1)
            android.graphics.PointF r0 = r10.f16657z
            float r1 = r11.getX()
            float r11 = r11.getY()
            r0.set(r1, r11)
            r10.f16643l = r3
        L_0x0334:
            return r3
        L_0x0335:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p195a.C5986d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxZoomValue(float f) {
        this.f16651t = f;
    }

    public void setMinZoomValue(float f) {
        this.f16650s = f;
    }

    public void setRotateWithTouchEventCenter(boolean z) {
        this.f16640i = z;
    }

    public void setRotationGestureEnabled(boolean z) {
        this.f16637f = z;
    }

    public void setScrollGestureEnabled(boolean z) {
        this.f16639h = z;
    }

    public void setZoomGestureEnabled(boolean z) {
        this.f16638g = z;
    }

    public void setZoomWithTouchEventCenter(boolean z) {
        this.f16641j = z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d("MapMainView", "surfaceChanged");
        synchronized (this.f16634c) {
            this.f16627J = true;
            synchronized (this) {
                notifyAll();
            }
        }
        Rect rect = this.f16628K;
        if (rect == null || rect.bottom == 0 || rect.right == 0) {
            this.f16628K = new Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f16634c != null) {
            mo15815a();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("MapMainView", "surfaceCreated");
        synchronized (this) {
            Canvas lockCanvas = this.f16634c.lockCanvas();
            lockCanvas.drawColor(-1);
            this.f16634c.unlockCanvasAndPost(lockCanvas);
            this.f16627J = true;
            notifyAll();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("MapMainView", "surfaceDestroyed");
        synchronized (this.f16634c) {
            this.f16627J = false;
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
