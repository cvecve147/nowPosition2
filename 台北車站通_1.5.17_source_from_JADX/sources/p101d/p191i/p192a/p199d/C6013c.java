package p101d.p191i.p192a.p199d;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p101d.p191i.p192a.C6027i;

/* renamed from: d.i.a.d.c */
public class C6013c extends C6010a {

    /* renamed from: c */
    private List<int[]> f16812c = new ArrayList();

    /* renamed from: d */
    private int f16813d = 0;

    /* renamed from: e */
    private int f16814e = -16776961;

    /* renamed from: f */
    private int f16815f = -7303024;

    /* renamed from: g */
    private Paint f16816g;

    /* renamed from: h */
    private Paint f16817h;

    /* renamed from: i */
    private float f16818i;

    public C6013c(C6027i iVar) {
        m22823a(iVar);
    }

    /* renamed from: a */
    private void m22823a(C6027i iVar) {
        this.f16816g = new Paint(1);
        this.f16816g.setAntiAlias(true);
        this.f16816g.setPathEffect(new DashPathEffect(new float[]{15.0f, 20.0f}, 0.0f));
        this.f16816g.setStyle(Paint.Style.STROKE);
        this.f16816g.setStrokeWidth(10.0f);
        this.f16816g.setColor(this.f16814e);
        this.f16816g.setShadowLayer(5.0f, 3.0f, 3.0f, this.f16815f);
        this.f16817h = new Paint(1);
        this.f16817h.setColor(this.f16814e);
        this.f16817h.setStrokeWidth(20.0f);
        this.f16817h.setDither(true);
        this.f16817h.setStyle(Paint.Style.STROKE);
        this.f16817h.setStrokeJoin(Paint.Join.ROUND);
        this.f16817h.setStrokeCap(Paint.Cap.ROUND);
        this.f16817h.setPathEffect(new CornerPathEffect(10.0f));
        this.f16817h.setAntiAlias(true);
        this.f16818i = 0.0f;
    }

    /* renamed from: a */
    public int mo15907a() {
        return this.f16813d;
    }

    /* renamed from: a */
    public void mo15846a(Canvas canvas, Matrix matrix, float f, float f2) {
        float f3;
        float f4;
        canvas.save();
        if (this.f16757b && this.f16812c.size() > 1) {
            Path path = new Path();
            int i = 0;
            while (i < this.f16812c.size() - 1) {
                float[] fArr = {(float) this.f16812c.get(i)[0], (float) this.f16812c.get(i)[1]};
                int i2 = i + 1;
                float[] fArr2 = {(float) this.f16812c.get(i2)[0], (float) this.f16812c.get(i2)[1]};
                matrix.mapPoints(fArr);
                matrix.mapPoints(fArr2);
                if (i == 0) {
                    path.moveTo(fArr[0], fArr[1]);
                    f4 = fArr2[0];
                    f3 = fArr2[1];
                } else {
                    f4 = fArr2[0];
                    f3 = fArr2[1];
                }
                path.lineTo(f4, f3);
                i = i2;
            }
            canvas.drawPath(path, this.f16817h);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo15908a(int[] iArr) {
        List<int[]> list = this.f16812c;
        list.removeAll(list);
        if (iArr != null) {
            int[] iArr2 = {iArr[0], iArr[1], iArr[2]};
            double d = 0.0d;
            int length = iArr.length / 3;
            int[] iArr3 = iArr2;
            int i = 0;
            while (i < length) {
                int i2 = i * 3;
                int[] iArr4 = {iArr[i2], iArr[i2 + 1], iArr[i2 + 2]};
                this.f16812c.add(iArr4);
                int abs = Math.abs(iArr4[0] - iArr3[0]);
                int abs2 = Math.abs(iArr4[1] - iArr3[2]);
                d += Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
                i++;
                iArr3 = iArr4;
            }
            this.f16813d = (int) (d / ((double) 80));
        }
    }

    /* renamed from: b */
    public List mo15909b() {
        return this.f16812c;
    }
}
