package com.journeyapps.barcodescanner.p077a;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C4101C;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.a.q */
public class C4126q {

    /* renamed from: a */
    private C4101C f12263a;

    /* renamed from: b */
    private int f12264b;

    /* renamed from: c */
    private boolean f12265c = false;

    /* renamed from: d */
    private C4131v f12266d = new C4127r();

    public C4126q(int i, C4101C c) {
        this.f12264b = i;
        this.f12263a = c;
    }

    /* renamed from: a */
    public int mo11661a() {
        return this.f12264b;
    }

    /* renamed from: a */
    public Rect mo11662a(C4101C c) {
        return this.f12266d.mo11660b(c, this.f12263a);
    }

    /* renamed from: a */
    public C4101C mo11663a(List<C4101C> list, boolean z) {
        return this.f12266d.mo11671b(list, mo11664a(z));
    }

    /* renamed from: a */
    public C4101C mo11664a(boolean z) {
        C4101C c = this.f12263a;
        if (c == null) {
            return null;
        }
        return z ? c.mo11563a() : c;
    }

    /* renamed from: a */
    public void mo11665a(C4131v vVar) {
        this.f12266d = vVar;
    }
}
