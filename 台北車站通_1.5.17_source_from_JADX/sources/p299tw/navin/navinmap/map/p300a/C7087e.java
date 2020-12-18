package p299tw.navin.navinmap.map.p300a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.caverock.androidsvg.SVG;

/* renamed from: tw.navin.navinmap.map.a.e */
public class C7087e extends C7084c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SVG f19529d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Picture f19530e;

    public C7087e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo21113a() {
        SVG svg = this.f19529d;
        if (svg != null) {
            return (int) svg.getDocumentWidth();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo21114a(Canvas canvas, Matrix matrix) {
        canvas.setMatrix(matrix);
        canvas.drawPicture(this.f19530e);
        canvas.setMatrix((Matrix) null);
    }

    /* renamed from: a */
    public void mo21115a(String str) {
        new C7086d(this, str).start();
    }

    /* renamed from: b */
    public int mo21116b() {
        SVG svg = this.f19529d;
        if (svg != null) {
            return (int) svg.getDocumentHeight();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo21117c() {
        this.f19529d = null;
        this.f19530e = null;
        super.mo21117c();
    }
}
