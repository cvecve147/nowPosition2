package p101d.p191i.p192a.p194b.p195a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.util.Log;
import p101d.p191i.p192a.p199d.C6010a;

/* renamed from: d.i.a.b.a.f */
public class C5989f extends C6010a {

    /* renamed from: c */
    private boolean f16659c = false;

    /* renamed from: d */
    private C5986d f16660d;

    /* renamed from: e */
    private Picture f16661e;

    /* renamed from: f */
    private Paint f16662f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f16663g;

    public C5989f(C5986d dVar) {
        this.f16660d = dVar;
        this.f16662f = new Paint();
        this.f16756a = 0;
    }

    /* renamed from: a */
    private float m22690a(float f, float f2, float f3, float f4) {
        float f5 = f / f3;
        float f6 = f2 / f4;
        if (f4 * f5 <= f2) {
            return f5;
        }
        if (f3 * f6 <= f) {
            return f6;
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22692b() {
        float a = m22690a((float) this.f16660d.getWidth(), (float) this.f16660d.getHeight(), (float) this.f16661e.getWidth(), (float) this.f16661e.getHeight());
        if (this.f16659c) {
            Log.i("MapLayer", a + " = zoom");
        }
        this.f16660d.setMinZoomValue(a);
        this.f16660d.mo15822b(a, 0.0f, 0.0f);
        float height = ((float) this.f16660d.getHeight()) - (((float) this.f16661e.getHeight()) * a);
        this.f16660d.mo15824c((((float) this.f16660d.getWidth()) - (a * ((float) this.f16661e.getWidth()))) / 2.0f, height / 2.0f);
        this.f16660d.mo15815a();
        this.f16663g = true;
    }

    /* renamed from: a */
    public Picture mo15845a() {
        return this.f16661e;
    }

    /* renamed from: a */
    public void mo15846a(Canvas canvas, Matrix matrix, float f, float f2) {
        canvas.save();
        if (this.f16661e != null) {
            canvas.setMatrix(matrix);
            canvas.drawPicture(this.f16661e);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo15847a(Picture picture) {
        this.f16661e = picture;
        if (this.f16660d.getWidth() == 0) {
            this.f16660d.getViewTreeObserver().addOnPreDrawListener(new C5988e(this));
        } else if (!this.f16663g) {
            m22692b();
        }
    }
}
