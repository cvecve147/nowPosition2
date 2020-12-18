package com.journeyapps.barcodescanner.p077a;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C4101C;

/* renamed from: com.journeyapps.barcodescanner.a.s */
public class C4128s extends C4131v {
    /* renamed from: a */
    private static float m16496a(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo11659a(C4101C c, C4101C c2) {
        int i = c.f12161a;
        if (i <= 0 || c.f12162b <= 0) {
            return 0.0f;
        }
        float a = (1.0f / m16496a((((float) i) * 1.0f) / ((float) c2.f12161a))) / m16496a((((float) c.f12162b) * 1.0f) / ((float) c2.f12162b));
        float a2 = m16496a(((((float) c.f12161a) * 1.0f) / ((float) c.f12162b)) / ((((float) c2.f12161a) * 1.0f) / ((float) c2.f12162b)));
        return a * (((1.0f / a2) / a2) / a2);
    }

    /* renamed from: b */
    public Rect mo11660b(C4101C c, C4101C c2) {
        return new Rect(0, 0, c2.f12161a, c2.f12162b);
    }
}
