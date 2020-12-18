package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.SurfaceHolder;
import java.util.Iterator;
import p101d.p111d.p112a.C5244e;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.p300a.C7084c;

/* renamed from: tw.navin.navinmap.map.p */
public class C7135p extends C7146w {

    /* renamed from: sa */
    private C7112l.C7118f f19701sa;

    /* renamed from: ta */
    private C7136a f19702ta;

    /* renamed from: ua */
    boolean f19703ua = false;

    /* renamed from: tw.navin.navinmap.map.p$a */
    interface C7136a {
        /* renamed from: a */
        void mo21112a(C7112l.C7116d dVar);
    }

    C7135p(Context context) {
        super(context, C5244e.C5245a.INSIDE);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo21025a(float f) {
        super.mo21025a(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21222a(float f, float f2) {
        float[] fArr = {f, f2};
        float[] fArr2 = new float[2];
        Matrix matrix = new Matrix();
        this.f19791w.invert(matrix);
        matrix.mapPoints(fArr2, fArr);
        Iterator<C7112l.C7116d> it = this.f19701sa.f19611t.iterator();
        while (it.hasNext()) {
            C7112l.C7116d next = it.next();
            RectF[] rectFArr = next.f19605b;
            int length = rectFArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (rectFArr[i].contains(fArr2[0], fArr2[1])) {
                        C7136a aVar = this.f19702ta;
                        if (aVar != null) {
                            aVar.mo21112a(next);
                            return;
                        }
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21223a(Activity activity, C7112l.C7120h hVar, C7084c.C7085a aVar) {
        super.mo21223a(activity, hVar, aVar);
        this.f19701sa = (C7112l.C7118f) hVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo21026a(Path path, Path path2) {
        super.mo21026a(path, path2);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo21027a(Path path, Path path2, PointF pointF, boolean z) {
        super.mo21027a(path, path2, pointF, z);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo21028a(PointF pointF) {
        super.mo21028a(pointF);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21224a(String str) {
        PointF pointF;
        if (this.f19703ua) {
            if (str != null) {
                C7112l.C7116d dVar = this.f19701sa.f19612u.get(str);
                if (dVar != null) {
                    pointF = dVar.f19607d;
                } else {
                    return;
                }
            } else {
                pointF = null;
            }
            mo21028a(pointF);
        }
    }

    public /* bridge */ /* synthetic */ void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean performClick() {
        return super.performClick();
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
    }

    /* access modifiers changed from: package-private */
    public void setOnGlobalAreaSelectListener(C7136a aVar) {
        this.f19702ta = aVar;
    }

    public /* bridge */ /* synthetic */ void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    public /* bridge */ /* synthetic */ void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    public /* bridge */ /* synthetic */ void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }
}
