package p263h;

import java.lang.reflect.Array;

/* renamed from: h.l */
class C6630l extends C6631m<Object> {

    /* renamed from: a */
    final /* synthetic */ C6631m f18346a;

    C6630l(C6631m mVar) {
        this.f18346a = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17027a(C6648o oVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f18346a.mo17027a(oVar, Array.get(obj, i));
            }
        }
    }
}
