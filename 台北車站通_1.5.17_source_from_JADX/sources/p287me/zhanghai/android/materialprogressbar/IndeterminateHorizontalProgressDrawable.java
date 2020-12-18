package p287me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Keep;
import p287me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

/* renamed from: me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable */
public class IndeterminateHorizontalProgressDrawable extends BaseIndeterminateProgressDrawable implements ShowBackgroundDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    private static final RectTransformX RECT_1_TRANSFORM_X = new RectTransformX(-522.6f, 0.1f);
    private static final RectTransformX RECT_2_TRANSFORM_X = new RectTransformX(-197.6f, 0.1f);
    private static final RectF RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
    private static final RectF RECT_PROGRESS = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);
    private float mBackgroundAlpha;
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;
    private RectTransformX mRect1TransformX = new RectTransformX(RECT_1_TRANSFORM_X);
    private RectTransformX mRect2TransformX = new RectTransformX(RECT_2_TRANSFORM_X);
    private boolean mShowBackground = true;

    /* renamed from: me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable$RectTransformX */
    private static class RectTransformX {
        public float mScaleX;
        public float mTranslateX;

        public RectTransformX(float f, float f2) {
            this.mTranslateX = f;
            this.mScaleX = f2;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.mTranslateX = rectTransformX.mTranslateX;
            this.mScaleX = rectTransformX.mScaleX;
        }

        @Keep
        public void setScaleX(float f) {
            this.mScaleX = f;
        }

        @Keep
        public void setTranslateX(float f) {
            this.mTranslateX = f;
        }
    }

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicHeight = Math.round(4.0f * f);
        this.mPaddedIntrinsicHeight = Math.round(f * 16.0f);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, context);
        this.mAnimators = new Animator[]{Animators.createIndeterminateHorizontalRect1(this.mRect1TransformX), Animators.createIndeterminateHorizontalRect2(this.mRect2TransformX)};
    }

    private static void drawBackgroundRect(Canvas canvas, Paint paint) {
        canvas.drawRect(RECT_BOUND, paint);
    }

    private static void drawProgressRect(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int save = canvas.save();
        canvas.translate(rectTransformX.mTranslateX, 0.0f);
        canvas.scale(rectTransformX.mScaleX, 1.0f);
        canvas.drawRect(RECT_PROGRESS, paint);
        canvas.restoreToCount(save);
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public int getIntrinsicHeight() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas, int i, int i2, Paint paint) {
        RectF rectF;
        float f;
        if (this.mUseIntrinsicPadding) {
            canvas.scale(((float) i) / RECT_PADDED_BOUND.width(), ((float) i2) / RECT_PADDED_BOUND.height());
            f = RECT_PADDED_BOUND.width() / 2.0f;
            rectF = RECT_PADDED_BOUND;
        } else {
            canvas.scale(((float) i) / RECT_BOUND.width(), ((float) i2) / RECT_BOUND.height());
            f = RECT_BOUND.width() / 2.0f;
            rectF = RECT_BOUND;
        }
        canvas.translate(f, rectF.height() / 2.0f);
        if (this.mShowBackground) {
            paint.setAlpha(Math.round(((float) this.mAlpha) * this.mBackgroundAlpha));
            drawBackgroundRect(canvas, paint);
            paint.setAlpha(this.mAlpha);
        }
        drawProgressRect(canvas, this.mRect2TransformX, paint);
        drawProgressRect(canvas, this.mRect1TransformX, paint);
    }

    /* access modifiers changed from: protected */
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public void setShowBackground(boolean z) {
        if (this.mShowBackground != z) {
            this.mShowBackground = z;
            invalidateSelf();
        }
    }

    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
