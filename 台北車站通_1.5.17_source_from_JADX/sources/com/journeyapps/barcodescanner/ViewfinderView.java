package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.C4140j;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p163b.p164a.C5765k;
import p101d.p129g.p159f.p163b.p164a.C5770p;

public class ViewfinderView extends View {

    /* renamed from: a */
    protected static final int[] f12178a = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b */
    protected final Paint f12179b = new Paint(1);

    /* renamed from: c */
    protected Bitmap f12180c;

    /* renamed from: d */
    protected final int f12181d;

    /* renamed from: e */
    protected final int f12182e;

    /* renamed from: f */
    protected final int f12183f;

    /* renamed from: g */
    protected final int f12184g;

    /* renamed from: h */
    protected int f12185h;

    /* renamed from: i */
    protected List<C5919o> f12186i;

    /* renamed from: j */
    protected List<C5919o> f12187j;

    /* renamed from: k */
    protected C4140j f12188k;

    /* renamed from: l */
    protected Rect f12189l;

    /* renamed from: m */
    protected Rect f12190m;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5770p.zxing_finder);
        this.f12181d = obtainStyledAttributes.getColor(C5770p.zxing_finder_zxing_viewfinder_mask, resources.getColor(C5765k.zxing_viewfinder_mask));
        this.f12182e = obtainStyledAttributes.getColor(C5770p.zxing_finder_zxing_result_view, resources.getColor(C5765k.zxing_result_view));
        this.f12183f = obtainStyledAttributes.getColor(C5770p.zxing_finder_zxing_viewfinder_laser, resources.getColor(C5765k.zxing_viewfinder_laser));
        this.f12184g = obtainStyledAttributes.getColor(C5770p.zxing_finder_zxing_possible_result_points, resources.getColor(C5765k.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.f12185h = 0;
        this.f12186i = new ArrayList(5);
        this.f12187j = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11602a() {
        C4140j jVar = this.f12188k;
        if (jVar != null) {
            Rect framingRect = jVar.getFramingRect();
            Rect previewFramingRect = this.f12188k.getPreviewFramingRect();
            if (framingRect != null && previewFramingRect != null) {
                this.f12189l = framingRect;
                this.f12190m = previewFramingRect;
            }
        }
    }

    /* renamed from: a */
    public void mo11603a(C5919o oVar) {
        List<C5919o> list = this.f12186i;
        list.add(oVar);
        int size = list.size();
        if (size > 20) {
            list.subList(0, size - 10).clear();
        }
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Rect rect;
        mo11602a();
        Rect rect2 = this.f12189l;
        if (rect2 != null && (rect = this.f12190m) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f12179b.setColor(this.f12180c != null ? this.f12182e : this.f12181d);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect2.top, this.f12179b);
            canvas.drawRect(0.0f, (float) rect2.top, (float) rect2.left, (float) (rect2.bottom + 1), this.f12179b);
            float f2 = f;
            canvas.drawRect((float) (rect2.right + 1), (float) rect2.top, f2, (float) (rect2.bottom + 1), this.f12179b);
            canvas.drawRect(0.0f, (float) (rect2.bottom + 1), f2, (float) height, this.f12179b);
            if (this.f12180c != null) {
                this.f12179b.setAlpha(160);
                canvas.drawBitmap(this.f12180c, (Rect) null, rect2, this.f12179b);
                return;
            }
            this.f12179b.setColor(this.f12183f);
            this.f12179b.setAlpha(f12178a[this.f12185h]);
            this.f12185h = (this.f12185h + 1) % f12178a.length;
            int height2 = (rect2.height() / 2) + rect2.top;
            canvas.drawRect((float) (rect2.left + 2), (float) (height2 - 1), (float) (rect2.right - 1), (float) (height2 + 2), this.f12179b);
            float width2 = ((float) rect2.width()) / ((float) rect.width());
            float height3 = ((float) rect2.height()) / ((float) rect.height());
            List<C5919o> list = this.f12186i;
            List<C5919o> list2 = this.f12187j;
            int i = rect2.left;
            int i2 = rect2.top;
            if (list.isEmpty()) {
                this.f12187j = null;
            } else {
                this.f12186i = new ArrayList(5);
                this.f12187j = list;
                this.f12179b.setAlpha(160);
                this.f12179b.setColor(this.f12184g);
                for (C5919o next : list) {
                    canvas.drawCircle((float) (((int) (next.mo15702a() * width2)) + i), (float) (((int) (next.mo15703b() * height3)) + i2), 6.0f, this.f12179b);
                }
            }
            if (list2 != null) {
                this.f12179b.setAlpha(80);
                this.f12179b.setColor(this.f12184g);
                for (C5919o next2 : list2) {
                    canvas.drawCircle((float) (((int) (next2.mo15702a() * width2)) + i), (float) (((int) (next2.mo15703b() * height3)) + i2), 3.0f, this.f12179b);
                }
            }
            postInvalidateDelayed(80, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }

    public void setCameraPreview(C4140j jVar) {
        this.f12188k = jVar;
        jVar.mo11691a((C4140j.C4141a) new C4106F(this));
    }
}
