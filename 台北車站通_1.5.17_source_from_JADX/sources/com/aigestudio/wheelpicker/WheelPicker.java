package com.aigestudio.wheelpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import java.util.Arrays;
import java.util.List;

public class WheelPicker extends View implements C1164a, C1165b, Runnable {

    /* renamed from: a */
    private static final String f4279a = "WheelPicker";

    /* renamed from: A */
    private int f4280A;

    /* renamed from: B */
    private int f4281B;

    /* renamed from: C */
    private int f4282C;

    /* renamed from: D */
    private int f4283D;

    /* renamed from: E */
    private int f4284E;

    /* renamed from: F */
    private int f4285F;

    /* renamed from: G */
    private int f4286G;

    /* renamed from: H */
    private int f4287H;

    /* renamed from: I */
    private int f4288I;

    /* renamed from: J */
    private int f4289J;

    /* renamed from: K */
    private int f4290K;

    /* renamed from: L */
    private int f4291L;

    /* renamed from: M */
    private int f4292M;

    /* renamed from: N */
    private int f4293N;

    /* renamed from: O */
    private int f4294O;

    /* renamed from: P */
    private int f4295P;

    /* renamed from: Q */
    private int f4296Q;

    /* renamed from: R */
    private int f4297R;

    /* renamed from: S */
    private int f4298S;

    /* renamed from: T */
    private int f4299T;

    /* renamed from: U */
    private int f4300U;

    /* renamed from: V */
    private boolean f4301V;

    /* renamed from: W */
    private boolean f4302W;

    /* renamed from: aa */
    private boolean f4303aa;

    /* renamed from: b */
    private final Handler f4304b;

    /* renamed from: ba */
    private boolean f4305ba;

    /* renamed from: c */
    private Paint f4306c;

    /* renamed from: ca */
    private boolean f4307ca;

    /* renamed from: d */
    private Scroller f4308d;

    /* renamed from: da */
    private boolean f4309da;

    /* renamed from: e */
    private VelocityTracker f4310e;

    /* renamed from: ea */
    private boolean f4311ea;

    /* renamed from: f */
    private C1162a f4312f;

    /* renamed from: fa */
    private boolean f4313fa;

    /* renamed from: g */
    private C1163b f4314g;

    /* renamed from: ga */
    private boolean f4315ga;

    /* renamed from: h */
    private Rect f4316h;

    /* renamed from: i */
    private Rect f4317i;

    /* renamed from: j */
    private Rect f4318j;

    /* renamed from: k */
    private Rect f4319k;

    /* renamed from: l */
    private Camera f4320l;

    /* renamed from: m */
    private Matrix f4321m;

    /* renamed from: n */
    private Matrix f4322n;

    /* renamed from: o */
    private List f4323o;

    /* renamed from: p */
    private String f4324p;

    /* renamed from: q */
    private int f4325q;

    /* renamed from: r */
    private int f4326r;

    /* renamed from: s */
    private int f4327s;

    /* renamed from: t */
    private int f4328t;

    /* renamed from: u */
    private int f4329u;

    /* renamed from: v */
    private int f4330v;

    /* renamed from: w */
    private int f4331w;

    /* renamed from: x */
    private int f4332x;

    /* renamed from: y */
    private int f4333y;

    /* renamed from: z */
    private int f4334z;

    /* renamed from: com.aigestudio.wheelpicker.WheelPicker$a */
    public interface C1162a {
        /* renamed from: a */
        void mo5441a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.aigestudio.wheelpicker.WheelPicker$b */
    public interface C1163b {
        /* renamed from: a */
        void mo5442a(int i);

        /* renamed from: b */
        void mo5443b(int i);

        /* renamed from: c */
        void mo5444c(int i);
    }

    public WheelPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4304b = new Handler();
        this.f4290K = 50;
        this.f4291L = 8000;
        this.f4300U = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1168e.WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(C1168e.WheelPicker_wheel_data, 0);
        this.f4323o = Arrays.asList(getResources().getStringArray(resourceId == 0 ? C1166c.WheelArrayDefault : resourceId));
        this.f4332x = obtainStyledAttributes.getDimensionPixelSize(C1168e.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(C1167d.WheelItemTextSize));
        this.f4325q = obtainStyledAttributes.getInt(C1168e.WheelPicker_wheel_visible_item_count, 7);
        this.f4286G = obtainStyledAttributes.getInt(C1168e.WheelPicker_wheel_selected_item_position, 0);
        this.f4301V = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_same_width, false);
        this.f4297R = obtainStyledAttributes.getInt(C1168e.WheelPicker_wheel_maximum_width_text_position, -1);
        this.f4324p = obtainStyledAttributes.getString(C1168e.WheelPicker_wheel_maximum_width_text);
        this.f4331w = obtainStyledAttributes.getColor(C1168e.WheelPicker_wheel_selected_item_text_color, -1);
        this.f4330v = obtainStyledAttributes.getColor(C1168e.WheelPicker_wheel_item_text_color, -7829368);
        this.f4281B = obtainStyledAttributes.getDimensionPixelSize(C1168e.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(C1167d.WheelItemSpace));
        this.f4307ca = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_cyclic, false);
        this.f4302W = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_indicator, false);
        this.f4334z = obtainStyledAttributes.getColor(C1168e.WheelPicker_wheel_indicator_color, -1166541);
        this.f4333y = obtainStyledAttributes.getDimensionPixelSize(C1168e.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(C1167d.WheelIndicatorSize));
        this.f4303aa = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_curtain, false);
        this.f4280A = obtainStyledAttributes.getColor(C1168e.WheelPicker_wheel_curtain_color, -1996488705);
        this.f4305ba = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_atmospheric, false);
        this.f4309da = obtainStyledAttributes.getBoolean(C1168e.WheelPicker_wheel_curved, false);
        this.f4282C = obtainStyledAttributes.getInt(C1168e.WheelPicker_wheel_item_align, 0);
        obtainStyledAttributes.recycle();
        m5902g();
        this.f4306c = new Paint(69);
        this.f4306c.setTextSize((float) this.f4332x);
        m5901f();
        m5900e();
        this.f4308d = new Scroller(getContext());
        if (Build.VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f4290K = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4291L = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4300U = viewConfiguration.getScaledTouchSlop();
        }
        this.f4316h = new Rect();
        this.f4317i = new Rect();
        this.f4318j = new Rect();
        this.f4319k = new Rect();
        this.f4320l = new Camera();
        this.f4321m = new Matrix();
        this.f4322n = new Matrix();
    }

    /* renamed from: a */
    private int m5891a(int i) {
        return (int) (((double) this.f4285F) - (Math.cos(Math.toRadians((double) i)) * ((double) this.f4285F)));
    }

    /* renamed from: a */
    private int m5892a(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: a */
    private void m5893a() {
        if (this.f4303aa || this.f4331w != -1) {
            Rect rect = this.f4319k;
            Rect rect2 = this.f4316h;
            int i = rect2.left;
            int i2 = this.f4293N;
            int i3 = this.f4284E;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
        }
    }

    /* renamed from: b */
    private int m5894b(int i) {
        if (Math.abs(i) <= this.f4284E) {
            return -i;
        }
        return (this.f4296Q < 0 ? -this.f4283D : this.f4283D) - i;
    }

    /* renamed from: b */
    private void m5895b() {
        int i = this.f4282C;
        this.f4294O = i != 1 ? i != 2 ? this.f4292M : this.f4316h.right : this.f4316h.left;
        this.f4295P = (int) (((float) this.f4293N) - ((this.f4306c.ascent() + this.f4306c.descent()) / 2.0f));
    }

    /* renamed from: c */
    private int m5896c(int i) {
        return (int) (Math.sin(Math.toRadians((double) i)) * ((double) this.f4285F));
    }

    /* renamed from: c */
    private void m5897c() {
        int i = this.f4286G;
        int i2 = this.f4283D;
        int i3 = i * i2;
        this.f4288I = this.f4307ca ? Integer.MIN_VALUE : ((-i2) * (this.f4323o.size() - 1)) + i3;
        if (this.f4307ca) {
            i3 = Integer.MAX_VALUE;
        }
        this.f4289J = i3;
    }

    /* renamed from: d */
    private void m5898d() {
        if (this.f4302W) {
            int i = this.f4333y / 2;
            int i2 = this.f4293N;
            int i3 = this.f4284E;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f4317i;
            Rect rect2 = this.f4316h;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f4318j;
            Rect rect4 = this.f4316h;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* renamed from: d */
    private boolean m5899d(int i) {
        return i >= 0 && i < this.f4323o.size();
    }

    /* renamed from: e */
    private void m5900e() {
        Paint paint;
        String str;
        float measureText;
        this.f4329u = 0;
        this.f4328t = 0;
        if (this.f4301V) {
            measureText = this.f4306c.measureText(String.valueOf(this.f4323o.get(0)));
        } else {
            if (m5899d(this.f4297R)) {
                paint = this.f4306c;
                str = String.valueOf(this.f4323o.get(this.f4297R));
            } else if (!TextUtils.isEmpty(this.f4324p)) {
                paint = this.f4306c;
                str = this.f4324p;
            } else {
                for (Object valueOf : this.f4323o) {
                    String valueOf2 = String.valueOf(valueOf);
                    this.f4328t = Math.max(this.f4328t, (int) this.f4306c.measureText(valueOf2));
                }
                Paint.FontMetrics fontMetrics = this.f4306c.getFontMetrics();
                this.f4329u = (int) (fontMetrics.bottom - fontMetrics.top);
            }
            measureText = paint.measureText(str);
        }
        this.f4328t = (int) measureText;
        Paint.FontMetrics fontMetrics2 = this.f4306c.getFontMetrics();
        this.f4329u = (int) (fontMetrics2.bottom - fontMetrics2.top);
    }

    /* renamed from: f */
    private void m5901f() {
        Paint paint;
        Paint.Align align;
        int i = this.f4282C;
        if (i == 1) {
            paint = this.f4306c;
            align = Paint.Align.LEFT;
        } else if (i != 2) {
            paint = this.f4306c;
            align = Paint.Align.CENTER;
        } else {
            paint = this.f4306c;
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
    }

    /* renamed from: g */
    private void m5902g() {
        int i = this.f4325q;
        if (i >= 2) {
            if (i % 2 == 0) {
                this.f4325q = i + 1;
            }
            this.f4326r = this.f4325q + 2;
            this.f4327s = this.f4326r / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    public int getCurrentItemPosition() {
        return this.f4287H;
    }

    public int getCurtainColor() {
        return this.f4280A;
    }

    public List getData() {
        return this.f4323o;
    }

    public int getIndicatorColor() {
        return this.f4334z;
    }

    public int getIndicatorSize() {
        return this.f4333y;
    }

    public int getItemAlign() {
        return this.f4282C;
    }

    public int getItemSpace() {
        return this.f4281B;
    }

    public int getItemTextColor() {
        return this.f4330v;
    }

    public int getItemTextSize() {
        return this.f4332x;
    }

    public String getMaximumWidthText() {
        return this.f4324p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f4297R;
    }

    public int getSelectedItemPosition() {
        return this.f4286G;
    }

    public int getSelectedItemTextColor() {
        return this.f4331w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f4306c;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f4325q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.aigestudio.wheelpicker.WheelPicker$b r1 = r0.f4314g
            if (r1 == 0) goto L_0x000d
            int r2 = r0.f4296Q
            r1.mo5442a(r2)
        L_0x000d:
            int r1 = r0.f4296Q
            int r1 = -r1
            int r2 = r0.f4283D
            int r1 = r1 / r2
            int r2 = r0.f4327s
            int r8 = r1 - r2
            int r1 = r0.f4286G
            int r1 = r1 + r8
            int r2 = -r2
            r9 = r1
            r10 = r2
        L_0x001d:
            int r1 = r0.f4286G
            int r1 = r1 + r8
            int r2 = r0.f4326r
            int r1 = r1 + r2
            if (r9 >= r1) goto L_0x01f4
            boolean r1 = r0.f4307ca
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r0.f4323o
            int r1 = r1.size()
            int r1 = r9 % r1
            if (r1 >= 0) goto L_0x003a
            java.util.List r2 = r0.f4323o
            int r2 = r2.size()
            int r1 = r1 + r2
        L_0x003a:
            java.util.List r2 = r0.f4323o
            java.lang.Object r1 = r2.get(r1)
            goto L_0x004d
        L_0x0041:
            boolean r1 = r0.m5899d(r9)
            if (r1 == 0) goto L_0x0052
            java.util.List r1 = r0.f4323o
            java.lang.Object r1 = r1.get(r9)
        L_0x004d:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0054
        L_0x0052:
            java.lang.String r1 = ""
        L_0x0054:
            android.graphics.Paint r2 = r0.f4306c
            int r3 = r0.f4330v
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f4306c
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            int r2 = r0.f4295P
            int r3 = r0.f4283D
            int r4 = r10 * r3
            int r4 = r4 + r2
            int r5 = r0.f4296Q
            int r5 = r5 % r3
            int r4 = r4 + r5
            boolean r3 = r0.f4309da
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0114
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            android.graphics.Rect r3 = r0.f4316h
            int r3 = r3.top
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r12 = r0.f4295P
            int r3 = r12 - r3
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1
            if (r4 <= r12) goto L_0x008c
            r12 = r3
            goto L_0x0091
        L_0x008c:
            if (r4 >= r12) goto L_0x0090
            r12 = -1
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            float r2 = r6 - r2
            float r2 = -r2
            r13 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 * r13
            float r12 = (float) r12
            float r2 = r2 * r12
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a0
            r2 = r12
        L_0x00a0:
            int r12 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a5
            r2 = r13
        L_0x00a5:
            int r12 = (int) r2
            int r13 = r0.m5896c(r12)
            int r14 = r0.f4292M
            int r15 = r0.f4282C
            if (r15 == r3) goto L_0x00b9
            r3 = 2
            if (r15 == r3) goto L_0x00b4
            goto L_0x00bd
        L_0x00b4:
            android.graphics.Rect r3 = r0.f4316h
            int r14 = r3.right
            goto L_0x00bd
        L_0x00b9:
            android.graphics.Rect r3 = r0.f4316h
            int r14 = r3.left
        L_0x00bd:
            int r3 = r0.f4293N
            int r3 = r3 - r13
            android.graphics.Camera r15 = r0.f4320l
            r15.save()
            android.graphics.Camera r15 = r0.f4320l
            r15.rotateX(r2)
            android.graphics.Camera r2 = r0.f4320l
            android.graphics.Matrix r15 = r0.f4321m
            r2.getMatrix(r15)
            android.graphics.Camera r2 = r0.f4320l
            r2.restore()
            android.graphics.Matrix r2 = r0.f4321m
            int r15 = -r14
            float r15 = (float) r15
            int r11 = -r3
            float r11 = (float) r11
            r2.preTranslate(r15, r11)
            android.graphics.Matrix r2 = r0.f4321m
            float r14 = (float) r14
            float r3 = (float) r3
            r2.postTranslate(r14, r3)
            android.graphics.Camera r2 = r0.f4320l
            r2.save()
            android.graphics.Camera r2 = r0.f4320l
            int r12 = r0.m5891a(r12)
            float r12 = (float) r12
            r5 = 0
            r2.translate(r5, r5, r12)
            android.graphics.Camera r2 = r0.f4320l
            android.graphics.Matrix r5 = r0.f4322n
            r2.getMatrix(r5)
            android.graphics.Camera r2 = r0.f4320l
            r2.restore()
            android.graphics.Matrix r2 = r0.f4322n
            r2.preTranslate(r15, r11)
            android.graphics.Matrix r2 = r0.f4322n
            r2.postTranslate(r14, r3)
            android.graphics.Matrix r2 = r0.f4321m
            android.graphics.Matrix r3 = r0.f4322n
            r2.postConcat(r3)
            goto L_0x0115
        L_0x0114:
            r13 = 0
        L_0x0115:
            boolean r2 = r0.f4305ba
            if (r2 == 0) goto L_0x0134
            int r2 = r0.f4295P
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r3 = r0.f4295P
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r3
            int r11 = (int) r2
            if (r11 >= 0) goto L_0x012f
            r11 = 0
        L_0x012f:
            android.graphics.Paint r2 = r0.f4306c
            r2.setAlpha(r11)
        L_0x0134:
            boolean r2 = r0.f4309da
            if (r2 == 0) goto L_0x013c
            int r2 = r0.f4295P
            int r4 = r2 - r13
        L_0x013c:
            int r2 = r0.f4331w
            r3 = -1
            if (r2 == r3) goto L_0x017c
            r17.save()
            boolean r2 = r0.f4309da
            if (r2 == 0) goto L_0x014d
            android.graphics.Matrix r2 = r0.f4321m
            r7.concat(r2)
        L_0x014d:
            android.graphics.Rect r2 = r0.f4319k
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r2, r3)
            int r2 = r0.f4294O
            float r2 = (float) r2
            float r3 = (float) r4
            android.graphics.Paint r4 = r0.f4306c
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            android.graphics.Paint r2 = r0.f4306c
            int r4 = r0.f4331w
            r2.setColor(r4)
            r17.save()
            boolean r2 = r0.f4309da
            if (r2 == 0) goto L_0x0173
            android.graphics.Matrix r2 = r0.f4321m
            r7.concat(r2)
        L_0x0173:
            android.graphics.Rect r2 = r0.f4319k
            r7.clipRect(r2)
            int r2 = r0.f4294O
            float r2 = (float) r2
            goto L_0x0191
        L_0x017c:
            r17.save()
            android.graphics.Rect r2 = r0.f4316h
            r7.clipRect(r2)
            boolean r2 = r0.f4309da
            if (r2 == 0) goto L_0x018d
            android.graphics.Matrix r2 = r0.f4321m
            r7.concat(r2)
        L_0x018d:
            int r2 = r0.f4294O
            float r2 = (float) r2
            float r3 = (float) r4
        L_0x0191:
            android.graphics.Paint r4 = r0.f4306c
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            boolean r1 = r0.f4315ga
            if (r1 == 0) goto L_0x01ee
            r17.save()
            android.graphics.Rect r1 = r0.f4316h
            r7.clipRect(r1)
            android.graphics.Paint r1 = r0.f4306c
            r2 = -1166541(0xffffffffffee3333, float:NaN)
            r1.setColor(r2)
            int r1 = r0.f4293N
            int r2 = r0.f4283D
            int r2 = r2 * r10
            int r11 = r1 + r2
            android.graphics.Rect r1 = r0.f4316h
            int r2 = r1.left
            float r2 = (float) r2
            float r5 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.f4306c
            r2 = -13421586(0xffffffffff3333ee, float:-2.3820145E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f4306c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            int r1 = r0.f4284E
            int r11 = r11 - r1
            android.graphics.Rect r1 = r0.f4316h
            int r2 = r1.left
            float r2 = (float) r2
            float r3 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            int r1 = r0.f4283D
            int r11 = r11 + r1
            float r5 = (float) r11
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            r17.restore()
        L_0x01ee:
            int r9 = r9 + 1
            int r10 = r10 + 1
            goto L_0x001d
        L_0x01f4:
            boolean r1 = r0.f4303aa
            if (r1 == 0) goto L_0x020d
            android.graphics.Paint r1 = r0.f4306c
            int r2 = r0.f4280A
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f4306c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f4319k
            android.graphics.Paint r2 = r0.f4306c
            r7.drawRect(r1, r2)
        L_0x020d:
            boolean r1 = r0.f4302W
            if (r1 == 0) goto L_0x022d
            android.graphics.Paint r1 = r0.f4306c
            int r2 = r0.f4334z
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f4306c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f4317i
            android.graphics.Paint r2 = r0.f4306c
            r7.drawRect(r1, r2)
            android.graphics.Rect r1 = r0.f4318j
            android.graphics.Paint r2 = r0.f4306c
            r7.drawRect(r1, r2)
        L_0x022d:
            boolean r1 = r0.f4315ga
            if (r1 == 0) goto L_0x029b
            android.graphics.Paint r1 = r0.f4306c
            r2 = 1144254003(0x4433ee33, float:719.72186)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f4306c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            r2 = 0
            r3 = 0
            int r1 = r16.getPaddingLeft()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getPaddingTop()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            int r1 = r16.getWidth()
            int r2 = r16.getPaddingRight()
            int r1 = r1 - r2
            float r2 = (float) r1
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            r2 = 0
            int r1 = r16.getHeight()
            int r3 = r16.getPaddingBottom()
            int r1 = r1 - r3
            float r3 = (float) r1
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f4306c
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aigestudio.wheelpicker.WheelPicker.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f4328t;
        int i4 = this.f4329u;
        int i5 = this.f4325q;
        int i6 = (i4 * i5) + (this.f4281B * (i5 - 1));
        if (this.f4309da) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        if (this.f4315ga) {
            String str = f4279a;
            Log.i(str, "Wheel's content size is (" + i3 + ":" + i6 + ")");
        }
        int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i6 + getPaddingTop() + getPaddingBottom();
        if (this.f4315ga) {
            String str2 = f4279a;
            Log.i(str2, "Wheel's size is (" + paddingLeft + ":" + paddingTop + ")");
        }
        setMeasuredDimension(m5892a(mode, size, paddingLeft), m5892a(mode2, size2, paddingTop));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f4316h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f4315ga) {
            String str = f4279a;
            Log.i(str, "Wheel's drawn rect size is (" + this.f4316h.width() + ":" + this.f4316h.height() + ") and location is (" + this.f4316h.left + ":" + this.f4316h.top + ")");
        }
        this.f4292M = this.f4316h.centerX();
        this.f4293N = this.f4316h.centerY();
        m5895b();
        this.f4285F = this.f4316h.height() / 2;
        this.f4283D = this.f4316h.height() / this.f4325q;
        this.f4284E = this.f4283D / 2;
        m5897c();
        m5898d();
        m5893a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r14 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r14 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0115
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L_0x0077
            r4 = 2
            if (r0 == r4) goto L_0x002b
            r14 = 3
            if (r0 == r14) goto L_0x0013
            goto L_0x014d
        L_0x0013:
            android.view.ViewParent r14 = r13.getParent()
            if (r14 == 0) goto L_0x0020
            android.view.ViewParent r14 = r13.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
        L_0x0020:
            android.view.VelocityTracker r14 = r13.f4310e
            if (r14 == 0) goto L_0x014d
        L_0x0024:
            r14.recycle()
            r13.f4310e = r2
            goto L_0x014d
        L_0x002b:
            int r0 = r13.f4299T
            float r0 = (float) r0
            float r2 = r14.getY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r13.f4300U
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            r13.f4311ea = r1
            goto L_0x014d
        L_0x0042:
            r13.f4311ea = r3
            android.view.VelocityTracker r0 = r13.f4310e
            r0.addMovement(r14)
            com.aigestudio.wheelpicker.WheelPicker$b r0 = r13.f4314g
            if (r0 == 0) goto L_0x0050
            r0.mo5443b(r1)
        L_0x0050:
            float r0 = r14.getY()
            int r2 = r13.f4298S
            float r2 = (float) r2
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            goto L_0x014d
        L_0x0064:
            int r2 = r13.f4296Q
            float r2 = (float) r2
            float r2 = r2 + r0
            int r0 = (int) r2
            r13.f4296Q = r0
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f4298S = r14
            r13.invalidate()
            goto L_0x014d
        L_0x0077:
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0084
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0084:
            boolean r0 = r13.f4311ea
            if (r0 == 0) goto L_0x008a
            goto L_0x014d
        L_0x008a:
            android.view.VelocityTracker r0 = r13.f4310e
            r0.addMovement(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 4
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r14 < r0) goto L_0x009f
            android.view.VelocityTracker r14 = r13.f4310e
            int r0 = r13.f4291L
            float r0 = (float) r0
            r14.computeCurrentVelocity(r4, r0)
            goto L_0x00a4
        L_0x009f:
            android.view.VelocityTracker r14 = r13.f4310e
            r14.computeCurrentVelocity(r4)
        L_0x00a4:
            r13.f4313fa = r3
            android.view.VelocityTracker r14 = r13.f4310e
            float r14 = r14.getYVelocity()
            int r8 = (int) r14
            int r14 = java.lang.Math.abs(r8)
            int r0 = r13.f4290K
            if (r14 <= r0) goto L_0x00dc
            android.widget.Scroller r4 = r13.f4308d
            r5 = 0
            int r6 = r13.f4296Q
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = r13.f4288I
            int r12 = r13.f4289J
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            android.widget.Scroller r14 = r13.f4308d
            int r0 = r14.getFinalY()
            android.widget.Scroller r3 = r13.f4308d
            int r3 = r3.getFinalY()
            int r4 = r13.f4283D
            int r3 = r3 % r4
            int r3 = r13.m5894b(r3)
            int r0 = r0 + r3
            r14.setFinalY(r0)
            goto L_0x00eb
        L_0x00dc:
            android.widget.Scroller r14 = r13.f4308d
            int r0 = r13.f4296Q
            int r4 = r13.f4283D
            int r4 = r0 % r4
            int r4 = r13.m5894b(r4)
            r14.startScroll(r3, r0, r3, r4)
        L_0x00eb:
            boolean r14 = r13.f4307ca
            if (r14 != 0) goto L_0x010a
            android.widget.Scroller r14 = r13.f4308d
            int r14 = r14.getFinalY()
            int r0 = r13.f4289J
            if (r14 <= r0) goto L_0x00ff
        L_0x00f9:
            android.widget.Scroller r14 = r13.f4308d
            r14.setFinalY(r0)
            goto L_0x010a
        L_0x00ff:
            android.widget.Scroller r14 = r13.f4308d
            int r14 = r14.getFinalY()
            int r0 = r13.f4288I
            if (r14 >= r0) goto L_0x010a
            goto L_0x00f9
        L_0x010a:
            android.os.Handler r14 = r13.f4304b
            r14.post(r13)
            android.view.VelocityTracker r14 = r13.f4310e
            if (r14 == 0) goto L_0x014d
            goto L_0x0024
        L_0x0115:
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0122
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0122:
            android.view.VelocityTracker r0 = r13.f4310e
            if (r0 != 0) goto L_0x012d
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.f4310e = r0
            goto L_0x0130
        L_0x012d:
            r0.clear()
        L_0x0130:
            android.view.VelocityTracker r0 = r13.f4310e
            r0.addMovement(r14)
            android.widget.Scroller r0 = r13.f4308d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0144
            android.widget.Scroller r0 = r13.f4308d
            r0.abortAnimation()
            r13.f4313fa = r1
        L_0x0144:
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f4298S = r14
            r13.f4299T = r14
        L_0x014d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aigestudio.wheelpicker.WheelPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void run() {
        List list = this.f4323o;
        if (list != null && list.size() != 0) {
            if (this.f4308d.isFinished() && !this.f4313fa) {
                int i = this.f4283D;
                if (i != 0) {
                    int size = (((-this.f4296Q) / i) + this.f4286G) % this.f4323o.size();
                    if (size < 0) {
                        size += this.f4323o.size();
                    }
                    if (this.f4315ga) {
                        String str = f4279a;
                        Log.i(str, size + ":" + this.f4323o.get(size) + ":" + this.f4296Q);
                    }
                    this.f4287H = size;
                    C1162a aVar = this.f4312f;
                    if (aVar != null) {
                        aVar.mo5441a(this, this.f4323o.get(size), size);
                    }
                    C1163b bVar = this.f4314g;
                    if (bVar != null) {
                        bVar.mo5444c(size);
                        this.f4314g.mo5443b(0);
                    }
                } else {
                    return;
                }
            }
            if (this.f4308d.computeScrollOffset()) {
                C1163b bVar2 = this.f4314g;
                if (bVar2 != null) {
                    bVar2.mo5443b(2);
                }
                this.f4296Q = this.f4308d.getCurrY();
                postInvalidate();
                this.f4304b.postDelayed(this, 16);
            }
        }
    }

    public void setAtmospheric(boolean z) {
        this.f4305ba = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f4303aa = z;
        m5893a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f4280A = i;
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f4309da = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f4307ca = z;
        m5897c();
        invalidate();
    }

    public void setData(List list) {
        int i;
        if (list != null) {
            this.f4323o = list;
            if (this.f4286G > list.size() - 1 || this.f4287H > list.size() - 1) {
                i = list.size() - 1;
                this.f4287H = i;
            } else {
                i = this.f4287H;
            }
            this.f4286G = i;
            this.f4296Q = 0;
            m5900e();
            m5897c();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setDebug(boolean z) {
        this.f4315ga = z;
    }

    public void setIndicator(boolean z) {
        this.f4302W = z;
        m5898d();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f4334z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f4333y = i;
        m5898d();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f4282C = i;
        m5901f();
        m5895b();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f4281B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f4330v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f4332x = i;
        this.f4306c.setTextSize((float) this.f4332x);
        m5900e();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f4324p = str;
            m5900e();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m5899d(i)) {
            this.f4297R = i;
            m5900e();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f4323o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(C1162a aVar) {
        this.f4312f = aVar;
    }

    public void setOnWheelChangeListener(C1163b bVar) {
        this.f4314g = bVar;
    }

    public void setSameWidth(boolean z) {
        this.f4301V = z;
        m5900e();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        int max = Math.max(Math.min(i, this.f4323o.size() - 1), 0);
        this.f4286G = max;
        this.f4287H = max;
        this.f4296Q = 0;
        m5897c();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f4331w = i;
        m5893a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f4306c;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m5900e();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f4325q = i;
        m5902g();
        requestLayout();
    }
}
