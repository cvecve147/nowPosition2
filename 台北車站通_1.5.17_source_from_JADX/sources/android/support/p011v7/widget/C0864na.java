package android.support.p011v7.widget;

import android.support.p011v7.widget.C0867oa;
import java.util.Comparator;

/* renamed from: android.support.v7.widget.na */
class C0864na implements Comparator<C0867oa.C0869b> {
    C0864na() {
    }

    /* renamed from: a */
    public int compare(C0867oa.C0869b bVar, C0867oa.C0869b bVar2) {
        if ((bVar.f3569d == null) != (bVar2.f3569d == null)) {
            return bVar.f3569d == null ? 1 : -1;
        }
        boolean z = bVar.f3566a;
        if (z != bVar2.f3566a) {
            return z ? -1 : 1;
        }
        int i = bVar2.f3567b - bVar.f3567b;
        if (i != 0) {
            return i;
        }
        int i2 = bVar.f3568c - bVar2.f3568c;
        if (i2 != 0) {
            return i2;
        }
        return 0;
    }
}
