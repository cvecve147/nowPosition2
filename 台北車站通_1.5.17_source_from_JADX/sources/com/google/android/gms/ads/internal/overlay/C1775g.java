package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C2169Ae;
import com.google.android.gms.internal.ads.C2478La;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.g */
final class C1775g extends RelativeLayout {

    /* renamed from: a */
    private C2169Ae f5850a;

    /* renamed from: b */
    boolean f5851b;

    public C1775g(Context context, String str, String str2) {
        super(context);
        this.f5850a = new C2169Ae(context, str);
        this.f5850a.mo7812b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5851b) {
            return false;
        }
        this.f5850a.mo7808a(motionEvent);
        return false;
    }
}
