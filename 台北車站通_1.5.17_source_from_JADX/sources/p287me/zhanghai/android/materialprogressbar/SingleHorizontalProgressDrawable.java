package p287me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: me.zhanghai.android.materialprogressbar.SingleHorizontalProgressDrawable */
class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable {
    private static final int LEVEL_MAX = 10000;

    public SingleHorizontalProgressDrawable(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDrawRect(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level != 0) {
            int save = canvas.save();
            canvas.scale(((float) level) / 10000.0f, 1.0f, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, 0.0f);
            super.onDrawRect(canvas, paint);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }
}
