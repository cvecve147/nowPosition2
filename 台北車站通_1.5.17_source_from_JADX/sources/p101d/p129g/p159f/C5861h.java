package p101d.p129g.p159f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p101d.p129g.p159f.p160a.C5748b;
import p101d.p129g.p159f.p170d.C5791a;
import p101d.p129g.p159f.p173e.C5807a;
import p101d.p129g.p159f.p176g.C5852i;
import p101d.p129g.p159f.p180h.C5878b;
import p101d.p129g.p159f.p184i.C5883a;

/* renamed from: d.g.f.h */
public final class C5861h implements C5915k {

    /* renamed from: a */
    private Map<C5806e, ?> f16211a;

    /* renamed from: b */
    private C5915k[] f16212b;

    /* renamed from: c */
    private C5917m m22157c(C5771c cVar) {
        C5915k[] kVarArr = this.f16212b;
        if (kVarArr != null) {
            int length = kVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return kVarArr[i].mo15334a(cVar, this.f16211a);
                } catch (C5916l unused) {
                    i++;
                }
            }
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        mo15565a((Map<C5806e, ?>) null);
        return m22157c(cVar);
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        mo15565a(map);
        return m22157c(cVar);
    }

    /* renamed from: a */
    public void mo15565a(Map<C5806e, ?> map) {
        this.f16211a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C5806e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(C5806e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C5743a.UPC_A) && !collection.contains(C5743a.UPC_E) && !collection.contains(C5743a.EAN_13) && !collection.contains(C5743a.EAN_8) && !collection.contains(C5743a.CODABAR) && !collection.contains(C5743a.CODE_39) && !collection.contains(C5743a.CODE_93) && !collection.contains(C5743a.CODE_128) && !collection.contains(C5743a.ITF) && !collection.contains(C5743a.RSS_14) && !collection.contains(C5743a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C5852i(map));
            }
            if (collection.contains(C5743a.QR_CODE)) {
                arrayList.add(new C5883a());
            }
            if (collection.contains(C5743a.DATA_MATRIX)) {
                arrayList.add(new C5791a());
            }
            if (collection.contains(C5743a.AZTEC)) {
                arrayList.add(new C5748b());
            }
            if (collection.contains(C5743a.PDF_417)) {
                arrayList.add(new C5878b());
            }
            if (collection.contains(C5743a.MAXICODE)) {
                arrayList.add(new C5807a());
            }
            if (z && z2) {
                arrayList.add(new C5852i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C5852i(map));
            }
            arrayList.add(new C5883a());
            arrayList.add(new C5791a());
            arrayList.add(new C5748b());
            arrayList.add(new C5878b());
            arrayList.add(new C5807a());
            if (z2) {
                arrayList.add(new C5852i(map));
            }
        }
        this.f16212b = (C5915k[]) arrayList.toArray(new C5915k[arrayList.size()]);
    }

    /* renamed from: b */
    public C5917m mo15566b(C5771c cVar) {
        if (this.f16212b == null) {
            mo15565a((Map<C5806e, ?>) null);
        }
        return m22157c(cVar);
    }

    public void reset() {
        C5915k[] kVarArr = this.f16212b;
        if (kVarArr != null) {
            for (C5915k reset : kVarArr) {
                reset.reset();
            }
        }
    }
}
