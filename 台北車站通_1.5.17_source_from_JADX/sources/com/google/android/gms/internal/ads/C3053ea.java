package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C2092n;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.ea */
final class C3053ea implements C2803We<C3420qv> {

    /* renamed from: a */
    private final /* synthetic */ boolean f9070a;

    /* renamed from: b */
    private final /* synthetic */ double f9071b;

    /* renamed from: c */
    private final /* synthetic */ boolean f9072c;

    /* renamed from: d */
    private final /* synthetic */ String f9073d;

    /* renamed from: e */
    private final /* synthetic */ C2825X f9074e;

    C3053ea(C2825X x, boolean z, double d, boolean z2, String str) {
        this.f9074e = x;
        this.f9070a = z;
        this.f9071b = d;
        this.f9072c = z2;
        this.f9073d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final C3420qv mo8779a(InputStream inputStream) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (this.f9071b * 160.0d);
        if (!this.f9072c) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (Exception e) {
            C2227Cf.m9533b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f9074e.mo9017a(2, this.f9070a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C2092n.m9166g() && C2857Yd.m11614a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C2857Yd.m11615f(sb.toString());
        }
        return new C3420qv(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f9073d), this.f9071b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8778a() {
        this.f9074e.mo9017a(2, this.f9070a);
        return null;
    }
}
