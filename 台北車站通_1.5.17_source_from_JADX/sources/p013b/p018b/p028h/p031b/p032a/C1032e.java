package p013b.p018b.p028h.p031b.p032a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p013b.p018b.p028h.p031b.p032a.C1029d;

/* renamed from: b.b.h.b.a.e */
class C1032e extends C1029d {

    /* renamed from: b.b.h.b.a.e$a */
    private static class C1033a extends C1029d.C1030a {
        C1033a(C1029d.C1030a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1032e(this, resources);
        }
    }

    C1032e(Drawable drawable) {
        super(drawable);
    }

    C1032e(C1029d.C1030a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1029d.C1030a mo5025c() {
        return new C1033a(this.f3939e, (Resources) null);
    }

    public boolean isAutoMirrored() {
        return this.f3941g.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.f3941g.setAutoMirrored(z);
    }
}
