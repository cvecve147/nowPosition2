package com.journeyapps.barcodescanner.p077a;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.C4101C;
import java.util.Collections;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.a.v */
public abstract class C4131v {

    /* renamed from: a */
    private static final String f12270a = "v";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo11659a(C4101C c, C4101C c2);

    /* renamed from: a */
    public List<C4101C> mo11670a(List<C4101C> list, C4101C c) {
        if (c == null) {
            return list;
        }
        Collections.sort(list, new C4130u(this, c));
        return list;
    }

    /* renamed from: b */
    public abstract Rect mo11660b(C4101C c, C4101C c2);

    /* renamed from: b */
    public C4101C mo11671b(List<C4101C> list, C4101C c) {
        mo11670a(list, c);
        String str = f12270a;
        Log.i(str, "Viewfinder size: " + c);
        String str2 = f12270a;
        Log.i(str2, "Preview in order of preference: " + list);
        return list.get(0);
    }
}
