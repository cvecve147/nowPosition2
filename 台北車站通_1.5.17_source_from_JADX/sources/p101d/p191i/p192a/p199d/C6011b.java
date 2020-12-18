package p101d.p191i.p192a.p199d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.TypedValue;
import p101d.p191i.p192a.C6027i;

/* renamed from: d.i.a.d.b */
public class C6011b extends C6010a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f16758c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f16759d = "SVGMapLocationOverlay";

    /* renamed from: A */
    private Context f16760A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Boolean f16761B;

    /* renamed from: C */
    private SensorManager f16762C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Sensor f16763D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Sensor f16764E;

    /* renamed from: F */
    private String f16765F;

    /* renamed from: G */
    private String f16766G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Sensor f16767H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public float[] f16768I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public float[] f16769J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f16770K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f16771L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public float[] f16772M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public float[] f16773N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public float[] f16774O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public float f16775P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f16776Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f16777R;

    /* renamed from: S */
    private float[] f16778S;

    /* renamed from: T */
    private float f16779T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public float f16780U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public float f16781V;

    /* renamed from: W */
    private float f16782W;

    /* renamed from: X */
    private Boolean f16783X;

    /* renamed from: Y */
    private float f16784Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public float f16785Z;

    /* renamed from: aa */
    private Bitmap f16786aa;

    /* renamed from: ba */
    private Boolean f16787ba;

    /* renamed from: ca */
    private C6012a f16788ca;

    /* renamed from: e */
    private float f16789e;

    /* renamed from: f */
    private int f16790f;

    /* renamed from: g */
    private float f16791g;

    /* renamed from: h */
    private float f16792h;

    /* renamed from: i */
    private float f16793i;

    /* renamed from: j */
    private float f16794j;

    /* renamed from: k */
    private float f16795k;

    /* renamed from: l */
    private float f16796l;

    /* renamed from: m */
    private float f16797m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f16798n;

    /* renamed from: o */
    private float f16799o = 0.0f;

    /* renamed from: p */
    private Bitmap f16800p;

    /* renamed from: q */
    private Bitmap f16801q;

    /* renamed from: r */
    private Boolean f16802r;

    /* renamed from: s */
    private Paint f16803s;

    /* renamed from: t */
    private Paint f16804t;

    /* renamed from: u */
    private Paint f16805u;

    /* renamed from: v */
    private Paint f16806v;

    /* renamed from: w */
    private Paint f16807w;

    /* renamed from: x */
    private PointF f16808x;

    /* renamed from: y */
    private float f16809y;

    /* renamed from: z */
    private int f16810z;

    /* renamed from: d.i.a.d.b$a */
    class C6012a implements SensorEventListener {
        C6012a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r11) {
            /*
                r10 = this;
                android.hardware.Sensor r0 = r11.sensor
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                android.hardware.Sensor r1 = r1.f16763D
                java.lang.String r2 = ", degreeCompensator: "
                r3 = 1
                r4 = 1135869952(0x43b40000, float:360.0)
                r5 = 4645040803167600640(0x4076800000000000, double:360.0)
                r7 = 0
                if (r0 != r1) goto L_0x0025
                float[] r0 = r11.values
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r1 = r1.f16768I
                float[] r11 = r11.values
                int r11 = r11.length
            L_0x0020:
                java.lang.System.arraycopy(r0, r7, r1, r7, r11)
                goto L_0x00e1
            L_0x0025:
                android.hardware.Sensor r0 = r11.sensor
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                android.hardware.Sensor r1 = r1.f16764E
                if (r0 != r1) goto L_0x003b
                float[] r0 = r11.values
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r1 = r1.f16769J
                float[] r11 = r11.values
                int r11 = r11.length
                goto L_0x0020
            L_0x003b:
                android.hardware.Sensor r0 = r11.sensor
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                android.hardware.Sensor r1 = r1.f16767H
                if (r0 != r1) goto L_0x00e1
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r0 = r0.f16773N
                float[] r11 = r11.values
                android.hardware.SensorManager.getRotationMatrixFromVector(r0, r11)
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16773N
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r0 = r0.f16773N
                r1 = 2
                android.hardware.SensorManager.remapCoordinateSystem(r11, r3, r1, r0)
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16773N
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r0 = r0.f16774O
                android.hardware.SensorManager.getOrientation(r11, r0)
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16774O
                r11 = r11[r7]
                boolean r0 = p101d.p191i.p192a.p199d.C6011b.f16758c
                if (r0 == 0) goto L_0x00a9
                java.lang.String r0 = p101d.p191i.p192a.p199d.C6011b.f16759d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "rot degree: "
                r1.append(r8)
                double r8 = (double) r11
                double r8 = java.lang.Math.toDegrees(r8)
                double r8 = r8 + r5
                float r8 = (float) r8
                float r8 = r8 % r4
                r1.append(r8)
                r1.append(r2)
                d.i.a.d.b r8 = p101d.p191i.p192a.p199d.C6011b.this
                float r8 = r8.f16781V
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L_0x00a9:
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float r1 = r0.f16785Z
                d.i.a.d.b r8 = p101d.p191i.p192a.p199d.C6011b.this
                float r8 = r8.f16781V
                float r1 = r1 + r8
                double r8 = (double) r11
                double r8 = java.lang.Math.toDegrees(r8)
                double r8 = r8 + r5
                float r11 = (float) r8
                float r11 = r11 % r4
                float r1 = r1 + r11
                float unused = r0.f16780U = r1
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float r0 = r11.f16780U
                float r0 = -r0
                float unused = r11.f16775P = r0
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                java.lang.Boolean r11 = r11.f16761B
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x00e1
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float r0 = r11.f16780U
                float unused = r11.f16798n = r0
            L_0x00e1:
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                boolean r11 = r11.f16770K
                if (r11 == 0) goto L_0x01a1
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                boolean r11 = r11.f16771L
                if (r11 == 0) goto L_0x01a1
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16772M
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r0 = r0.f16768I
                d.i.a.d.b r1 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r1 = r1.f16769J
                r8 = 0
                android.hardware.SensorManager.getRotationMatrix(r11, r8, r0, r1)
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16772M
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r0 = r0.f16774O
                android.hardware.SensorManager.getOrientation(r11, r0)
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float[] r11 = r11.f16774O
                r11 = r11[r7]
                boolean r0 = p101d.p191i.p192a.p199d.C6011b.f16758c
                if (r0 == 0) goto L_0x0150
                java.lang.String r0 = p101d.p191i.p192a.p199d.C6011b.f16759d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "degree: "
                r1.append(r8)
                double r8 = (double) r11
                double r8 = java.lang.Math.toDegrees(r8)
                double r8 = r8 + r5
                float r8 = (float) r8
                float r8 = r8 % r4
                r1.append(r8)
                r1.append(r2)
                d.i.a.d.b r2 = p101d.p191i.p192a.p199d.C6011b.this
                float r2 = r2.f16781V
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L_0x0150:
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                float r1 = r0.f16785Z
                d.i.a.d.b r2 = p101d.p191i.p192a.p199d.C6011b.this
                float r2 = r2.f16781V
                float r1 = r1 + r2
                double r8 = (double) r11
                double r8 = java.lang.Math.toDegrees(r8)
                double r8 = r8 + r5
                float r11 = (float) r8
                float r11 = r11 % r4
                float r1 = r1 + r11
                float unused = r0.f16780U = r1
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float r0 = r11.f16780U
                float r0 = -r0
                float unused = r11.f16775P = r0
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                java.lang.Boolean r11 = r11.f16761B
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x0188
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                float r0 = r11.f16780U
                float unused = r11.f16798n = r0
            L_0x0188:
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                int r11 = r11.f16777R
                d.i.a.d.b r0 = p101d.p191i.p192a.p199d.C6011b.this
                int r0 = r0.f16776Q
                int r0 = r0 - r3
                if (r11 != r0) goto L_0x019c
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                int unused = r11.f16777R = r7
            L_0x019c:
                d.i.a.d.b r11 = p101d.p191i.p192a.p199d.C6011b.this
                p101d.p191i.p192a.p199d.C6011b.m22795j(r11)
            L_0x01a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p199d.C6011b.C6012a.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    public C6011b(Context context, C6027i iVar) {
        this.f16802r = false;
        this.f16808x = null;
        this.f16809y = 9999.0f;
        this.f16810z = 0;
        this.f16765F = "n/a";
        this.f16768I = new float[3];
        this.f16769J = new float[3];
        this.f16770K = false;
        this.f16771L = false;
        this.f16772M = new float[9];
        this.f16773N = new float[16];
        this.f16774O = new float[3];
        this.f16775P = 0.0f;
        this.f16776Q = 100;
        this.f16777R = 0;
        this.f16778S = new float[this.f16776Q];
        this.f16779T = 0.0f;
        this.f16780U = 0.0f;
        this.f16781V = 0.0f;
        this.f16782W = 1.0f;
        this.f16783X = false;
        this.f16784Y = 0.0f;
        this.f16785Z = 0.0f;
        this.f16787ba = false;
        this.f16788ca = new C6012a();
        this.f16760A = context;
        m22782a(iVar);
        for (int i = 0; i < this.f16776Q; i++) {
            this.f16778S[i] = 0.0f;
        }
    }

    /* renamed from: a */
    private void m22782a(C6027i iVar) {
        this.f16756a = Integer.MAX_VALUE;
        this.f16789e = TypedValue.applyDimension(1, 8.0f, iVar.getResources().getDisplayMetrics());
        this.f16790f = (int) (this.f16789e * 3.0f);
        this.f16804t = new Paint(1);
        this.f16805u = new Paint(1);
        this.f16805u.setDither(true);
        this.f16794j = TypedValue.applyDimension(1, 38.0f, iVar.getResources().getDisplayMetrics());
        this.f16793i = TypedValue.applyDimension(1, 0.5f, iVar.getResources().getDisplayMetrics());
        this.f16792h = TypedValue.applyDimension(1, 1.3f, iVar.getResources().getDisplayMetrics());
        this.f16791g = TypedValue.applyDimension(1, 2.3f, iVar.getResources().getDisplayMetrics());
        this.f16795k = TypedValue.applyDimension(1, 4.0f, iVar.getResources().getDisplayMetrics());
        this.f16796l = TypedValue.applyDimension(1, 2.6f, iVar.getResources().getDisplayMetrics());
        this.f16797m = TypedValue.applyDimension(1, 15.0f, iVar.getResources().getDisplayMetrics());
        this.f16803s = new Paint(1);
        this.f16803s.setAntiAlias(true);
        this.f16803s.setStrokeWidth(this.f16792h);
        this.f16806v = new Paint(1);
        this.f16806v.setAntiAlias(true);
        this.f16806v.setStyle(Paint.Style.FILL);
        this.f16806v.setShadowLayer(3.0f, 1.0f, 1.0f, -7303024);
        this.f16806v.setColor(-16715521);
        this.f16807w = new Paint(1);
        this.f16807w.setStyle(Paint.Style.STROKE);
        this.f16807w.setColor(-374131);
        this.f16807w.setStrokeWidth(this.f16795k);
    }

    /* renamed from: j */
    static /* synthetic */ int m22795j(C6011b bVar) {
        int i = bVar.f16777R;
        bVar.f16777R = i + 1;
        return i;
    }

    /* renamed from: a */
    public void mo15886a(float f) {
        this.f16784Y = f;
    }

    /* renamed from: a */
    public void mo15887a(int i) {
        this.f16786aa = BitmapFactory.decodeResource(this.f16760A.getResources(), i);
        this.f16782W = ((float) this.f16786aa.getWidth()) / ((float) this.f16786aa.getHeight());
        this.f16787ba = true;
    }

    /* renamed from: a */
    public void mo15888a(Bitmap bitmap) {
        this.f16800p = bitmap;
    }

    /* renamed from: a */
    public void mo15889a(Bitmap bitmap, Bitmap bitmap2) {
        mo15888a(bitmap);
        if (!this.f16802r.booleanValue()) {
            this.f16801q = bitmap2;
            this.f16802r = true;
        }
    }

    /* renamed from: a */
    public void mo15846a(Canvas canvas, Matrix matrix, float f, float f2) {
        PointF pointF;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        RectF rectF;
        float f8;
        float f9;
        RectF rectF2;
        int i;
        Canvas canvas2 = canvas;
        canvas.save();
        if (this.f16757b && (pointF = this.f16808x) != null) {
            float[] fArr = {pointF.x, pointF.y};
            matrix.mapPoints(fArr);
            if ((((this.f16810z != 4) | (this.f16784Y > 0.0f)) && (this.f16810z != 2)) && !this.f16787ba.booleanValue()) {
                this.f16805u.setShader(new RadialGradient(fArr[0], fArr[1], (this.f16789e + 20.0f) * (this.f16784Y + 1.0f), -2136956768, -2136956768, Shader.TileMode.CLAMP));
                canvas2.drawCircle(fArr[0], fArr[1], (this.f16789e + 20.0f) * (this.f16784Y + 1.0f), this.f16805u);
                Paint paint = this.f16804t;
                float f10 = fArr[0];
                float f11 = this.f16789e;
                paint.setShader(new LinearGradient(f10 - f11, fArr[1] - f11, fArr[0] + f11, fArr[1] + f11, -12664887, -16743796, Shader.TileMode.MIRROR));
                canvas2.drawCircle(fArr[0], fArr[1], this.f16789e, this.f16804t);
            }
            int i2 = this.f16810z;
            if (i2 == 1) {
                int i3 = 0;
                while (true) {
                    float f12 = (float) i3;
                    if (f12 >= 72.0f) {
                        break;
                    }
                    canvas.save();
                    canvas2.rotate(5.0f * f12, fArr[0], fArr[1]);
                    if (f12 % 18.0f == 0.0f) {
                        float f13 = fArr[0];
                        float f14 = fArr[1];
                        float f15 = this.f16794j;
                        float f16 = this.f16793i;
                        i = i3;
                        canvas.drawLine(f13, (f14 - f15) + f16, fArr[0], ((fArr[1] - f15) + f16) - this.f16791g, this.f16803s);
                    } else {
                        i = i3;
                        canvas2.drawCircle(fArr[0], fArr[1] - this.f16794j, this.f16793i, new Paint());
                    }
                    canvas.restore();
                    i3 = i + 1;
                }
                if (this.f16800p != null) {
                    canvas.save();
                    canvas2.rotate(this.f16798n, fArr[0], fArr[1]);
                    Bitmap bitmap = this.f16800p;
                    canvas2.drawBitmap(bitmap, fArr[0] - ((float) (bitmap.getWidth() / 2)), (fArr[1] - this.f16789e) - this.f16797m, new Paint());
                    canvas.restore();
                    if (360.0f - (this.f16798n - this.f16799o) > 180.0f) {
                        float f17 = fArr[0];
                        float f18 = this.f16794j;
                        rectF2 = new RectF(f17 - f18, fArr[1] - f18, fArr[0] + f18, fArr[1] + f18);
                        float f19 = this.f16799o;
                        f9 = f19 - 0.049804688f;
                        f8 = this.f16798n - f19;
                    } else {
                        float f20 = fArr[0];
                        float f21 = this.f16794j;
                        rectF2 = new RectF(f20 - f21, fArr[1] - f21, fArr[0] + f21, fArr[1] + f21);
                        float f22 = this.f16798n;
                        f9 = f22 - 0.049804688f;
                        f8 = 360.0f - (f22 - this.f16799o);
                    }
                    canvas.drawArc(rectF2, f9, f8, false, this.f16807w);
                }
                canvas.save();
                canvas2.rotate(this.f16799o, fArr[0], fArr[1]);
                canvas2.drawCircle(fArr[0], fArr[1] - this.f16794j, this.f16796l, this.f16806v);
            } else {
                if (i2 == 3) {
                    if (this.f16800p != null) {
                        canvas.save();
                        canvas2.rotate(this.f16798n, fArr[0], fArr[1]);
                        Bitmap bitmap2 = this.f16800p;
                        canvas2.drawBitmap(bitmap2, fArr[0] - ((float) (bitmap2.getWidth() / 2)), (fArr[1] - this.f16789e) - this.f16797m, new Paint());
                        canvas.restore();
                    }
                    if (this.f16787ba.booleanValue()) {
                        canvas.save();
                        canvas2.rotate(this.f16798n, fArr[0], fArr[1]);
                        Bitmap bitmap3 = this.f16786aa;
                        float f23 = fArr[0];
                        float f24 = (float) this.f16790f;
                        float f25 = this.f16782W * f24;
                        canvas2.drawBitmap(bitmap3, (Rect) null, new Rect((int) (f23 - f25), (int) (fArr[1] - f24), (int) (fArr[0] + f25), (int) (fArr[1] + f24)), this.f16804t);
                        canvas.restore();
                    }
                    canvas.save();
                    f5 = this.f16799o;
                    f4 = fArr[0];
                    f3 = fArr[1];
                } else if (i2 == 2) {
                    if (this.f16800p != null) {
                        canvas.save();
                        canvas2.rotate(this.f16798n, fArr[0], fArr[1]);
                        Bitmap bitmap4 = this.f16800p;
                        canvas2.drawBitmap(bitmap4, fArr[0] - ((float) (bitmap4.getWidth() / 2)), fArr[1] - ((float) (this.f16800p.getHeight() / 2)), new Paint());
                        canvas.restore();
                        if (360.0f - (this.f16798n - this.f16799o) > 180.0f) {
                            float f26 = fArr[0];
                            float f27 = this.f16794j;
                            rectF = new RectF(f26 - f27, fArr[1] - f27, fArr[0] + f27, fArr[1] + f27);
                            float f28 = this.f16799o;
                            f7 = f28 - 0.049804688f;
                            f6 = this.f16798n - f28;
                        } else {
                            float f29 = fArr[0];
                            float f30 = this.f16794j;
                            rectF = new RectF(f29 - f30, fArr[1] - f30, fArr[0] + f30, fArr[1] + f30);
                            float f31 = this.f16798n;
                            f7 = f31 - 0.049804688f;
                            f6 = 360.0f - (f31 - this.f16799o);
                        }
                        canvas.drawArc(rectF, f7, f6, false, this.f16807w);
                    }
                    canvas.save();
                    f5 = this.f16799o;
                    f4 = fArr[0];
                    f3 = fArr[1];
                }
                canvas2.rotate(f5, f4, f3);
            }
            canvas.restore();
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo15890a(PointF pointF) {
        this.f16808x = pointF;
    }

    /* renamed from: a */
    public void mo15891a(String str) {
        this.f16765F = str;
    }

    /* renamed from: b */
    public void mo15892b(float f) {
        this.f16781V = f;
    }

    /* renamed from: b */
    public void mo15893b(int i) {
        this.f16810z = i;
        this.f16757b = this.f16810z != 4;
    }

    /* renamed from: b */
    public void mo15894b(Bitmap bitmap) {
        this.f16786aa = bitmap;
        this.f16782W = ((float) this.f16786aa.getWidth()) / ((float) this.f16786aa.getHeight());
        this.f16787ba = true;
    }

    /* renamed from: b */
    public void mo15895b(String str) {
        this.f16766G = str;
    }

    /* renamed from: c */
    public String mo15896c() {
        return this.f16765F;
    }

    /* renamed from: c */
    public void mo15897c(float f) {
        this.f16798n = f % 360.0f;
        this.f16761B = false;
    }

    /* renamed from: d */
    public String mo15898d() {
        return this.f16766G;
    }

    /* renamed from: d */
    public void mo15899d(float f) {
        this.f16781V = f;
        this.f16761B = true;
    }

    /* renamed from: e */
    public float mo15900e() {
        return this.f16775P;
    }

    /* renamed from: f */
    public Bitmap mo15901f() {
        return this.f16801q;
    }

    /* renamed from: g */
    public PointF mo15902g() {
        return this.f16808x;
    }

    /* renamed from: h */
    public void mo15903h() {
        this.f16762C = (SensorManager) this.f16760A.getSystemService("sensor");
        this.f16763D = this.f16762C.getDefaultSensor(9);
        this.f16764E = this.f16762C.getDefaultSensor(2);
        this.f16767H = this.f16762C.getDefaultSensor(11);
        if (!this.f16783X.booleanValue()) {
            this.f16762C.registerListener(this.f16788ca, this.f16767H, 1);
            this.f16783X = true;
        }
    }

    /* renamed from: i */
    public void mo15904i() {
        this.f16761B = true;
    }
}
