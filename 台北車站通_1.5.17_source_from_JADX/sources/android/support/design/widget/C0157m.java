package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.C0829eb;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import p013b.p018b.p028h.p035d.C1052a;
import p013b.p018b.p028h.p038g.C1071c;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.design.widget.m */
final class C0157m {

    /* renamed from: a */
    private static final boolean f829a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f830b = null;

    /* renamed from: A */
    private boolean f831A;

    /* renamed from: B */
    private Bitmap f832B;

    /* renamed from: C */
    private Paint f833C;

    /* renamed from: D */
    private float f834D;

    /* renamed from: E */
    private float f835E;

    /* renamed from: F */
    private float f836F;

    /* renamed from: G */
    private float f837G;

    /* renamed from: H */
    private int[] f838H;

    /* renamed from: I */
    private boolean f839I;

    /* renamed from: J */
    private final TextPaint f840J;

    /* renamed from: K */
    private Interpolator f841K;

    /* renamed from: L */
    private Interpolator f842L;

    /* renamed from: M */
    private float f843M;

    /* renamed from: N */
    private float f844N;

    /* renamed from: O */
    private float f845O;

    /* renamed from: P */
    private int f846P;

    /* renamed from: Q */
    private float f847Q;

    /* renamed from: R */
    private float f848R;

    /* renamed from: S */
    private float f849S;

    /* renamed from: T */
    private int f850T;

    /* renamed from: c */
    private final View f851c;

    /* renamed from: d */
    private boolean f852d;

    /* renamed from: e */
    private float f853e;

    /* renamed from: f */
    private final Rect f854f;

    /* renamed from: g */
    private final Rect f855g;

    /* renamed from: h */
    private final RectF f856h;

    /* renamed from: i */
    private int f857i = 16;

    /* renamed from: j */
    private int f858j = 16;

    /* renamed from: k */
    private float f859k = 15.0f;

    /* renamed from: l */
    private float f860l = 15.0f;

    /* renamed from: m */
    private ColorStateList f861m;

    /* renamed from: n */
    private ColorStateList f862n;

    /* renamed from: o */
    private float f863o;

    /* renamed from: p */
    private float f864p;

    /* renamed from: q */
    private float f865q;

    /* renamed from: r */
    private float f866r;

    /* renamed from: s */
    private float f867s;

    /* renamed from: t */
    private float f868t;

    /* renamed from: u */
    private Typeface f869u;

    /* renamed from: v */
    private Typeface f870v;

    /* renamed from: w */
    private Typeface f871w;

    /* renamed from: x */
    private CharSequence f872x;

    /* renamed from: y */
    private CharSequence f873y;

    /* renamed from: z */
    private boolean f874z;

    static {
        Paint paint = f830b;
        if (paint != null) {
            paint.setAntiAlias(true);
            f830b.setColor(-65281);
        }
    }

    public C0157m(View view) {
        this.f851c = view;
        this.f840J = new TextPaint(129);
        this.f855g = new Rect();
        this.f854f = new Rect();
        this.f856h = new RectF();
    }

    /* renamed from: a */
    private static float m796a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0145a.m781a(f, f2, f3);
    }

    /* renamed from: a */
    private static int m797a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static boolean m798a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static boolean m799a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    private boolean m800a(Typeface typeface, Typeface typeface2) {
        return (typeface != null && !typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    /* renamed from: b */
    private boolean m801b(CharSequence charSequence) {
        boolean z = true;
        if (C0487v.m2293i(this.f851c) != 1) {
            z = false;
        }
        return (z ? C1071c.f4019d : C1071c.f4018c).isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private void m802c(float f) {
        int i;
        TextPaint textPaint;
        m805e(f);
        this.f867s = m796a(this.f865q, this.f866r, f, this.f841K);
        this.f868t = m796a(this.f863o, this.f864p, f, this.f841K);
        m806f(m796a(this.f859k, this.f860l, f, this.f842L));
        if (this.f862n != this.f861m) {
            textPaint = this.f840J;
            i = m797a(m812q(), m811p(), f);
        } else {
            textPaint = this.f840J;
            i = m811p();
        }
        textPaint.setColor(i);
        this.f840J.setShadowLayer(m796a(this.f847Q, this.f843M, f, (Interpolator) null), m796a(this.f848R, this.f844N, f, (Interpolator) null), m796a(this.f849S, this.f845O, f, (Interpolator) null), m797a(this.f850T, this.f846P, f));
        C0487v.m2261B(this.f851c);
    }

    /* renamed from: d */
    private void m803d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f872x != null) {
            float width = (float) this.f855g.width();
            float width2 = (float) this.f854f.width();
            boolean z3 = true;
            if (m798a(f, this.f860l)) {
                float f3 = this.f860l;
                this.f836F = 1.0f;
                if (m800a(this.f871w, this.f869u)) {
                    this.f871w = this.f869u;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f859k;
                if (m800a(this.f871w, this.f870v)) {
                    this.f871w = this.f870v;
                    z = true;
                } else {
                    z = false;
                }
                if (m798a(f, this.f859k)) {
                    this.f836F = 1.0f;
                } else {
                    this.f836F = f / this.f859k;
                }
                float f4 = this.f860l / this.f859k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f837G != f2 || this.f839I || z;
                this.f837G = f2;
                this.f839I = false;
            }
            if (this.f873y == null || z) {
                this.f840J.setTextSize(this.f837G);
                this.f840J.setTypeface(this.f871w);
                TextPaint textPaint = this.f840J;
                if (this.f836F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f872x, this.f840J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f873y)) {
                    this.f873y = ellipsize;
                    this.f874z = m801b(this.f873y);
                }
            }
        }
    }

    /* renamed from: e */
    private Typeface m804e(int i) {
        TypedArray obtainStyledAttributes = this.f851c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    private void m805e(float f) {
        this.f856h.left = m796a((float) this.f854f.left, (float) this.f855g.left, f, this.f841K);
        this.f856h.top = m796a(this.f863o, this.f864p, f, this.f841K);
        this.f856h.right = m796a((float) this.f854f.right, (float) this.f855g.right, f, this.f841K);
        this.f856h.bottom = m796a((float) this.f854f.bottom, (float) this.f855g.bottom, f, this.f841K);
    }

    /* renamed from: f */
    private void m806f(float f) {
        m803d(f);
        this.f831A = f829a && this.f836F != 1.0f;
        if (this.f831A) {
            m810o();
        }
        C0487v.m2261B(this.f851c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m807l() {
        /*
            r11 = this;
            float r0 = r11.f837G
            float r1 = r11.f860l
            r11.m803d((float) r1)
            java.lang.CharSequence r1 = r11.f873y
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.f840J
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            int r4 = r11.f858j
            boolean r5 = r11.f874z
            int r4 = android.support.p007v4.view.C0466f.m2170a(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.f840J
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f840J
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f840J
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f855g
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f864p = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.f855g
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.f855g
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f840J
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.f864p = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.f855g
            int r1 = r1.left
            float r1 = (float) r1
            r11.f866r = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.f855g
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.f855g
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.f866r = r4
        L_0x0084:
            float r1 = r11.f859k
            r11.m803d((float) r1)
            java.lang.CharSequence r1 = r11.f873y
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.f840J
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.f857i
            boolean r2 = r11.f874z
            int r1 = android.support.p007v4.view.C0466f.m2170a(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.f840J
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.f840J
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.f840J
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f854f
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.f863o = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.f854f
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.f854f
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.f840J
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.f863o = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ec
            if (r1 == r9) goto L_0x00e6
            android.graphics.Rect r1 = r11.f854f
            int r1 = r1.left
            float r1 = (float) r1
        L_0x00e3:
            r11.f865q = r1
            goto L_0x00f6
        L_0x00e6:
            android.graphics.Rect r1 = r11.f854f
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f4
        L_0x00ec:
            android.graphics.Rect r1 = r11.f854f
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f4:
            float r1 = r1 - r3
            goto L_0x00e3
        L_0x00f6:
            r11.m809n()
            r11.m806f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0157m.m807l():void");
    }

    /* renamed from: m */
    private void m808m() {
        m802c(this.f853e);
    }

    /* renamed from: n */
    private void m809n() {
        Bitmap bitmap = this.f832B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f832B = null;
        }
    }

    /* renamed from: o */
    private void m810o() {
        if (this.f832B == null && !this.f854f.isEmpty() && !TextUtils.isEmpty(this.f873y)) {
            m802c(0.0f);
            this.f834D = this.f840J.ascent();
            this.f835E = this.f840J.descent();
            TextPaint textPaint = this.f840J;
            CharSequence charSequence = this.f873y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f835E - this.f834D);
            if (round > 0 && round2 > 0) {
                this.f832B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f832B);
                CharSequence charSequence2 = this.f873y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f840J.descent(), this.f840J);
                if (this.f833C == null) {
                    this.f833C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p */
    private int m811p() {
        int[] iArr = this.f838H;
        return iArr != null ? this.f862n.getColorForState(iArr, 0) : this.f862n.getDefaultColor();
    }

    /* renamed from: q */
    private int m812q() {
        int[] iArr = this.f838H;
        return iArr != null ? this.f861m.getColorForState(iArr, 0) : this.f861m.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo859a() {
        return this.f862n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo860a(float f) {
        if (this.f859k != f) {
            this.f859k = f;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo861a(int i) {
        C0829eb a = C0829eb.m4791a(this.f851c.getContext(), i, C1112j.TextAppearance);
        if (a.mo4487g(C1112j.TextAppearance_android_textColor)) {
            this.f862n = a.mo4472a(C1112j.TextAppearance_android_textColor);
        }
        if (a.mo4487g(C1112j.TextAppearance_android_textSize)) {
            this.f860l = (float) a.mo4478c(C1112j.TextAppearance_android_textSize, (int) this.f860l);
        }
        this.f846P = a.mo4480d(C1112j.TextAppearance_android_shadowColor, 0);
        this.f844N = a.mo4470a(C1112j.TextAppearance_android_shadowDx, 0.0f);
        this.f845O = a.mo4470a(C1112j.TextAppearance_android_shadowDy, 0.0f);
        this.f843M = a.mo4470a(C1112j.TextAppearance_android_shadowRadius, 0.0f);
        a.mo4474a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.f869u = m804e(i);
        }
        mo887k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo862a(int i, int i2, int i3, int i4) {
        if (!m799a(this.f855g, i, i2, i3, i4)) {
            this.f855g.set(i, i2, i3, i4);
            this.f839I = true;
            mo886j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo863a(ColorStateList colorStateList) {
        if (this.f862n != colorStateList) {
            this.f862n = colorStateList;
            mo887k();
        }
    }

    /* renamed from: a */
    public void mo864a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f873y != null && this.f852d) {
            float f2 = this.f867s;
            float f3 = this.f868t;
            boolean z = this.f831A && this.f832B != null;
            if (z) {
                f = this.f834D * this.f836F;
                float f4 = this.f835E;
            } else {
                f = this.f840J.ascent() * this.f836F;
                this.f840J.descent();
                float f5 = this.f836F;
            }
            if (z) {
                f3 += f;
            }
            float f6 = f3;
            float f7 = this.f836F;
            if (f7 != 1.0f) {
                canvas.scale(f7, f7, f2, f6);
            }
            if (z) {
                canvas.drawBitmap(this.f832B, f2, f6, this.f833C);
            } else {
                CharSequence charSequence = this.f873y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f6, this.f840J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo865a(Typeface typeface) {
        if (m800a(this.f869u, typeface)) {
            this.f869u = typeface;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo866a(Interpolator interpolator) {
        this.f841K = interpolator;
        mo887k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo867a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f872x)) {
            this.f872x = charSequence;
            this.f873y = null;
            m809n();
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo868a(int[] iArr) {
        this.f838H = iArr;
        if (!mo885i()) {
            return false;
        }
        mo887k();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo869b() {
        return this.f858j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo870b(float f) {
        float a = C1052a.m5543a(f, 0.0f, 1.0f);
        if (a != this.f853e) {
            this.f853e = a;
            m808m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo871b(int i) {
        if (this.f858j != i) {
            this.f858j = i;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo872b(int i, int i2, int i3, int i4) {
        if (!m799a(this.f854f, i, i2, i3, i4)) {
            this.f854f.set(i, i2, i3, i4);
            this.f839I = true;
            mo886j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo873b(ColorStateList colorStateList) {
        if (this.f861m != colorStateList) {
            this.f861m = colorStateList;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo874b(Typeface typeface) {
        if (m800a(this.f870v, typeface)) {
            this.f870v = typeface;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo875b(Interpolator interpolator) {
        this.f842L = interpolator;
        mo887k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo876c() {
        return this.f860l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo877c(int i) {
        C0829eb a = C0829eb.m4791a(this.f851c.getContext(), i, C1112j.TextAppearance);
        if (a.mo4487g(C1112j.TextAppearance_android_textColor)) {
            this.f861m = a.mo4472a(C1112j.TextAppearance_android_textColor);
        }
        if (a.mo4487g(C1112j.TextAppearance_android_textSize)) {
            this.f859k = (float) a.mo4478c(C1112j.TextAppearance_android_textSize, (int) this.f859k);
        }
        this.f850T = a.mo4480d(C1112j.TextAppearance_android_shadowColor, 0);
        this.f848R = a.mo4470a(C1112j.TextAppearance_android_shadowDx, 0.0f);
        this.f849S = a.mo4470a(C1112j.TextAppearance_android_shadowDy, 0.0f);
        this.f847Q = a.mo4470a(C1112j.TextAppearance_android_shadowRadius, 0.0f);
        a.mo4474a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.f870v = m804e(i);
        }
        mo887k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo878c(Typeface typeface) {
        this.f870v = typeface;
        this.f869u = typeface;
        mo887k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Typeface mo879d() {
        Typeface typeface = this.f869u;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo880d(int i) {
        if (this.f857i != i) {
            this.f857i = i;
            mo887k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo881e() {
        return this.f857i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Typeface mo882f() {
        Typeface typeface = this.f870v;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo883g() {
        return this.f853e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence mo884h() {
        return this.f872x;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f861m;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo885i() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f862n
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f861m
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0157m.mo885i():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo886j() {
        this.f852d = this.f855g.width() > 0 && this.f855g.height() > 0 && this.f854f.width() > 0 && this.f854f.height() > 0;
    }

    /* renamed from: k */
    public void mo887k() {
        if (this.f851c.getHeight() > 0 && this.f851c.getWidth() > 0) {
            m807l();
            m808m();
        }
    }
}
