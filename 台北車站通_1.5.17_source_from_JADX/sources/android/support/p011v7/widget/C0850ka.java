package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.ka */
class C0850ka extends RecyclerView.C0758h implements RecyclerView.C0765m {

    /* renamed from: a */
    private static final int[] f3474a = {16842919};

    /* renamed from: b */
    private static final int[] f3475b = new int[0];

    /* renamed from: A */
    private final int[] f3476A = new int[2];
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ValueAnimator f3477B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f3478C = 0;

    /* renamed from: D */
    private final Runnable f3479D = new C0842ia(this);

    /* renamed from: E */
    private final RecyclerView.C0766n f3480E = new C0847ja(this);

    /* renamed from: c */
    private final int f3481c;

    /* renamed from: d */
    private final int f3482d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final StateListDrawable f3483e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Drawable f3484f;

    /* renamed from: g */
    private final int f3485g;

    /* renamed from: h */
    private final int f3486h;

    /* renamed from: i */
    private final StateListDrawable f3487i;

    /* renamed from: j */
    private final Drawable f3488j;

    /* renamed from: k */
    private final int f3489k;

    /* renamed from: l */
    private final int f3490l;

    /* renamed from: m */
    int f3491m;

    /* renamed from: n */
    int f3492n;

    /* renamed from: o */
    float f3493o;

    /* renamed from: p */
    int f3494p;

    /* renamed from: q */
    int f3495q;

    /* renamed from: r */
    float f3496r;

    /* renamed from: s */
    private int f3497s = 0;

    /* renamed from: t */
    private int f3498t = 0;

    /* renamed from: u */
    private RecyclerView f3499u;

    /* renamed from: v */
    private boolean f3500v = false;

    /* renamed from: w */
    private boolean f3501w = false;

    /* renamed from: x */
    private int f3502x = 0;

    /* renamed from: y */
    private int f3503y = 0;

    /* renamed from: z */
    private final int[] f3504z = new int[2];

    /* renamed from: android.support.v7.widget.ka$a */
    private class C0851a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3505a;

        private C0851a() {
            this.f3505a = false;
        }

        /* synthetic */ C0851a(C0850ka kaVar, C0842ia iaVar) {
            this();
        }

        public void onAnimationCancel(Animator animator) {
            this.f3505a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3505a) {
                this.f3505a = false;
            } else if (((Float) C0850ka.this.f3477B.getAnimatedValue()).floatValue() == 0.0f) {
                int unused = C0850ka.this.f3478C = 0;
                C0850ka.this.m4884c(0);
            } else {
                int unused2 = C0850ka.this.f3478C = 2;
                C0850ka.this.m4889g();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ka$b */
    private class C0852b implements ValueAnimator.AnimatorUpdateListener {
        private C0852b() {
        }

        /* synthetic */ C0852b(C0850ka kaVar, C0842ia iaVar) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0850ka.this.f3483e.setAlpha(floatValue);
            C0850ka.this.f3484f.setAlpha(floatValue);
            C0850ka.this.m4889g();
        }
    }

    C0850ka(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3483e = stateListDrawable;
        this.f3484f = drawable;
        this.f3487i = stateListDrawable2;
        this.f3488j = drawable2;
        this.f3485g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3486h = Math.max(i, drawable.getIntrinsicWidth());
        this.f3489k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3490l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3481c = i2;
        this.f3482d = i3;
        this.f3483e.setAlpha(255);
        this.f3484f.setAlpha(255);
        this.f3477B.addListener(new C0851a(this, (C0842ia) null));
        this.f3477B.addUpdateListener(new C0852b(this, (C0842ia) null));
        mo4552a(recyclerView);
    }

    /* renamed from: a */
    private int m4871a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m4874a(float f) {
        int[] d = m4886d();
        float max = Math.max((float) d[0], Math.min((float) d[1], f));
        if (Math.abs(((float) this.f3495q) - max) >= 2.0f) {
            int a = m4871a(this.f3496r, max, d, this.f3499u.computeHorizontalScrollRange(), this.f3499u.computeHorizontalScrollOffset(), this.f3497s);
            if (a != 0) {
                this.f3499u.scrollBy(a, 0);
            }
            this.f3496r = max;
        }
    }

    /* renamed from: a */
    private void m4875a(Canvas canvas) {
        int i = this.f3498t;
        int i2 = this.f3489k;
        int i3 = i - i2;
        int i4 = this.f3495q;
        int i5 = this.f3494p;
        int i6 = i4 - (i5 / 2);
        this.f3487i.setBounds(0, 0, i5, i2);
        this.f3488j.setBounds(0, 0, this.f3497s, this.f3490l);
        canvas.translate(0.0f, (float) i3);
        this.f3488j.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3487i.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m4876b() {
        this.f3499u.removeCallbacks(this.f3479D);
    }

    /* renamed from: b */
    private void m4877b(float f) {
        int[] e = m4887e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f3492n) - max) >= 2.0f) {
            int a = m4871a(this.f3493o, max, e, this.f3499u.computeVerticalScrollRange(), this.f3499u.computeVerticalScrollOffset(), this.f3498t);
            if (a != 0) {
                this.f3499u.scrollBy(0, a);
            }
            this.f3493o = max;
        }
    }

    /* renamed from: b */
    private void m4878b(int i) {
        m4876b();
        this.f3499u.postDelayed(this.f3479D, (long) i);
    }

    /* renamed from: b */
    private void m4879b(Canvas canvas) {
        int i = this.f3497s;
        int i2 = this.f3485g;
        int i3 = i - i2;
        int i4 = this.f3492n;
        int i5 = this.f3491m;
        int i6 = i4 - (i5 / 2);
        this.f3483e.setBounds(0, 0, i2, i5);
        this.f3484f.setBounds(0, 0, this.f3486h, this.f3498t);
        if (m4888f()) {
            this.f3484f.draw(canvas);
            canvas.translate((float) this.f3485g, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3483e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3485g;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f3484f.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f3483e.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: c */
    private void m4883c() {
        this.f3499u.mo3653b((RecyclerView.C0758h) this);
        this.f3499u.mo3654b((RecyclerView.C0765m) this);
        this.f3499u.mo3655b(this.f3480E);
        m4876b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4884c(int i) {
        int i2;
        if (i == 2 && this.f3502x != 2) {
            this.f3483e.setState(f3474a);
            m4876b();
        }
        if (i == 0) {
            m4889g();
        } else {
            mo4549a();
        }
        if (this.f3502x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3502x = i;
        }
        this.f3483e.setState(f3475b);
        i2 = 1200;
        m4878b(i2);
        this.f3502x = i;
    }

    /* renamed from: d */
    private int[] m4886d() {
        int[] iArr = this.f3476A;
        int i = this.f3482d;
        iArr[0] = i;
        iArr[1] = this.f3497s - i;
        return iArr;
    }

    /* renamed from: e */
    private int[] m4887e() {
        int[] iArr = this.f3504z;
        int i = this.f3482d;
        iArr[0] = i;
        iArr[1] = this.f3498t - i;
        return iArr;
    }

    /* renamed from: f */
    private boolean m4888f() {
        return C0487v.m2293i(this.f3499u) == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m4889g() {
        this.f3499u.invalidate();
    }

    /* renamed from: h */
    private void m4890h() {
        this.f3499u.mo3633a((RecyclerView.C0758h) this);
        this.f3499u.mo3635a((RecyclerView.C0765m) this);
        this.f3499u.mo3636a(this.f3480E);
    }

    /* renamed from: a */
    public void mo4549a() {
        int i = this.f3478C;
        if (i != 0) {
            if (i == 3) {
                this.f3477B.cancel();
            } else {
                return;
            }
        }
        this.f3478C = 1;
        ValueAnimator valueAnimator = this.f3477B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3477B.setDuration(500);
        this.f3477B.setStartDelay(0);
        this.f3477B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4550a(int i) {
        int i2 = this.f3478C;
        if (i2 == 1) {
            this.f3477B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3478C = 3;
        ValueAnimator valueAnimator = this.f3477B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3477B.setDuration((long) i);
        this.f3477B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4551a(int i, int i2) {
        int computeVerticalScrollRange = this.f3499u.computeVerticalScrollRange();
        int i3 = this.f3498t;
        this.f3500v = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3481c;
        int computeHorizontalScrollRange = this.f3499u.computeHorizontalScrollRange();
        int i4 = this.f3497s;
        this.f3501w = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3481c;
        if (this.f3500v || this.f3501w) {
            if (this.f3500v) {
                float f = (float) i3;
                this.f3492n = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3491m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3501w) {
                float f2 = (float) i4;
                this.f3495q = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3494p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3502x;
            if (i5 == 0 || i5 == 1) {
                m4884c(1);
            }
        } else if (this.f3502x != 0) {
            m4884c(0);
        }
    }

    /* renamed from: a */
    public void mo4552a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3499u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4883c();
            }
            this.f3499u = recyclerView;
            if (this.f3499u != null) {
                m4890h();
            }
        }
    }

    /* renamed from: a */
    public void mo3947a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3502x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo4554b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo4553a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f3503y = 1;
                        this.f3496r = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f3503y = 2;
                        this.f3493o = (float) ((int) motionEvent.getY());
                    }
                    m4884c(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3502x == 2) {
                this.f3493o = 0.0f;
                this.f3496r = 0.0f;
                m4884c(1);
                this.f3503y = 0;
            } else if (motionEvent.getAction() == 2 && this.f3502x == 2) {
                mo4549a();
                if (this.f3503y == 1) {
                    m4874a(motionEvent.getX());
                }
                if (this.f3503y == 2) {
                    m4877b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3948a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4553a(float f, float f2) {
        if (f2 >= ((float) (this.f3498t - this.f3489k))) {
            int i = this.f3495q;
            int i2 = this.f3494p;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: b */
    public void mo3847b(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0775t tVar) {
        if (this.f3497s != this.f3499u.getWidth() || this.f3498t != this.f3499u.getHeight()) {
            this.f3497s = this.f3499u.getWidth();
            this.f3498t = this.f3499u.getHeight();
            m4884c(0);
        } else if (this.f3478C != 0) {
            if (this.f3500v) {
                m4879b(canvas);
            }
            if (this.f3501w) {
                m4875a(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4554b(float f, float f2) {
        if (!m4888f() ? f >= ((float) (this.f3497s - this.f3485g)) : f <= ((float) (this.f3485g / 2))) {
            int i = this.f3492n;
            int i2 = this.f3491m;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: b */
    public boolean mo3949b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3502x;
        if (i == 1) {
            boolean b = mo4554b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo4553a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f3503y = 1;
                this.f3496r = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f3503y = 2;
                this.f3493o = (float) ((int) motionEvent.getY());
            }
            m4884c(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }
}
