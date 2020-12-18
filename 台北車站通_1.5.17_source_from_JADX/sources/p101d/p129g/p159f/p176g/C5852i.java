package p101d.p129g.p159f.p176g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5916l;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.p167c.C5772a;
import p101d.p129g.p159f.p176g.p177a.C5843e;
import p101d.p129g.p159f.p176g.p177a.p178a.C5839d;

/* renamed from: d.g.f.g.i */
public final class C5852i extends C5854k {

    /* renamed from: a */
    private final C5854k[] f16190a;

    public C5852i(Map<C5806e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C5806e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C5806e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C5743a.EAN_13) || collection.contains(C5743a.UPC_A) || collection.contains(C5743a.EAN_8) || collection.contains(C5743a.UPC_E)) {
                arrayList.add(new C5853j(map));
            }
            if (collection.contains(C5743a.CODE_39)) {
                arrayList.add(new C5846c(z));
            }
            if (collection.contains(C5743a.CODE_93)) {
                arrayList.add(new C5847d());
            }
            if (collection.contains(C5743a.CODE_128)) {
                arrayList.add(new C5845b());
            }
            if (collection.contains(C5743a.ITF)) {
                arrayList.add(new C5851h());
            }
            if (collection.contains(C5743a.CODABAR)) {
                arrayList.add(new C5814a());
            }
            if (collection.contains(C5743a.RSS_14)) {
                arrayList.add(new C5843e());
            }
            if (collection.contains(C5743a.RSS_EXPANDED)) {
                arrayList.add(new C5839d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5853j(map));
            arrayList.add(new C5846c());
            arrayList.add(new C5814a());
            arrayList.add(new C5847d());
            arrayList.add(new C5845b());
            arrayList.add(new C5851h());
            arrayList.add(new C5843e());
            arrayList.add(new C5839d());
        }
        this.f16190a = (C5854k[]) arrayList.toArray(new C5854k[arrayList.size()]);
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        C5854k[] kVarArr = this.f16190a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo15484a(i, aVar, map);
            } catch (C5916l unused) {
                i2++;
            }
        }
        throw C5882i.m22303a();
    }

    public void reset() {
        for (C5854k reset : this.f16190a) {
            reset.reset();
        }
    }
}
