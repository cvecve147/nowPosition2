package com.journeyapps.barcodescanner.p077a;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.C4101C;

/* renamed from: com.journeyapps.barcodescanner.a.p */
public class C4125p extends C4131v {

    /* renamed from: b */
    private static final String f12262b = "p";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo11659a(C4101C c, C4101C c2) {
        if (c.f12161a <= 0 || c.f12162b <= 0) {
            return 0.0f;
        }
        C4101C b = c.mo11564b(c2);
        float f = (((float) b.f12161a) * 1.0f) / ((float) c.f12161a);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) b.f12161a) * 1.0f) / ((float) c2.f12161a)) + ((((float) b.f12162b) * 1.0f) / ((float) c2.f12162b));
        return f * ((1.0f / f2) / f2);
    }

    /* renamed from: b */
    public Rect mo11660b(C4101C c, C4101C c2) {
        C4101C b = c.mo11564b(c2);
        String str = f12262b;
        Log.i(str, "Preview: " + c + "; Scaled: " + b + "; Want: " + c2);
        int i = b.f12161a;
        int i2 = (i - c2.f12161a) / 2;
        int i3 = b.f12162b;
        int i4 = (i3 - c2.f12162b) / 2;
        return new Rect(-i2, -i4, i - i2, i3 - i4);
    }
}
