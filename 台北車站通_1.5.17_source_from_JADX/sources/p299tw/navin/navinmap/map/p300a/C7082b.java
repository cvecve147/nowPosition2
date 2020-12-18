package p299tw.navin.navinmap.map.p300a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import p299tw.navin.navinmap.map.p300a.C7084c;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.a.b */
public class C7082b extends C7084c {

    /* renamed from: d */
    private ImageLoader f19521d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Bitmap f19522e;

    /* renamed from: tw.navin.navinmap.map.a.b$a */
    private class C7083a implements ImageLoadingListener {
        private C7083a() {
        }

        public void onLoadingCancelled(String str, View view) {
        }

        public void onLoadingComplete(String str, View view, Bitmap bitmap) {
            Bitmap unused = C7082b.this.f19522e = bitmap;
            C7084c.C7085a aVar = C7082b.this.f19526c;
            if (aVar != null) {
                aVar.mo21032a();
            }
        }

        public void onLoadingFailed(String str, View view, FailReason failReason) {
            C7084c.C7085a aVar = C7082b.this.f19526c;
            if (aVar != null) {
                aVar.mo21033b();
            }
        }

        public void onLoadingStarted(String str, View view) {
        }
    }

    public C7082b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo21113a() {
        Bitmap bitmap = this.f19522e;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo21114a(Canvas canvas, Matrix matrix) {
        Bitmap bitmap = this.f19522e;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f19522e, matrix, (Paint) null);
        }
    }

    /* renamed from: a */
    public void mo21115a(String str) {
        try {
            Uri b = mo21119b(str);
            if (b != null) {
                str = b.toString();
            }
            this.f19521d = C7173l.m27002b(this.f19525b);
            this.f19521d.loadImage(str, new C7083a());
        } catch (NullPointerException e) {
            e.printStackTrace();
            C7084c.C7085a aVar = this.f19526c;
            if (aVar != null) {
                aVar.mo21033b();
            }
        }
    }

    /* renamed from: b */
    public int mo21116b() {
        Bitmap bitmap = this.f19522e;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo21117c() {
        ImageLoader imageLoader = this.f19521d;
        if (imageLoader != null) {
            imageLoader.destroy();
            this.f19521d = null;
        }
        Bitmap bitmap = this.f19522e;
        if (bitmap != null) {
            bitmap.recycle();
            this.f19522e = null;
        }
        super.mo21117c();
    }
}
