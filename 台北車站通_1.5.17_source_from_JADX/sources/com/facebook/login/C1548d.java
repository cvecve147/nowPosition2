package com.facebook.login;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.internal.C1450J;
import com.facebook.internal.C1453K;

/* renamed from: com.facebook.login.d */
class C1548d implements C1450J.C1452b {

    /* renamed from: a */
    final /* synthetic */ TextView f5315a;

    /* renamed from: b */
    final /* synthetic */ DeviceAuthDialog f5316b;

    C1548d(DeviceAuthDialog deviceAuthDialog, TextView textView) {
        this.f5316b = deviceAuthDialog;
        this.f5315a = textView;
    }

    /* renamed from: a */
    public void mo6149a(C1453K k) {
        if (k.mo6150a() != null) {
            this.f5315a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new BitmapDrawable(this.f5316b.mo1415t(), Bitmap.createScaledBitmap(k.mo6150a(), 24, 24, false)), (Drawable) null);
        }
    }
}
