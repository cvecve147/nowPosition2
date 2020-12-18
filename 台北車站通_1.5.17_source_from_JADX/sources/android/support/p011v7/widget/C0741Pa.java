package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.Pa */
class C0741Pa {
    /* renamed from: a */
    static int m3878a(RecyclerView.C0775t tVar, C0687Aa aa, View view, View view2, RecyclerView.C0759i iVar, boolean z) {
        if (iVar.mo3903e() == 0 || tVar.mo4011a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(iVar.mo3923l(view) - iVar.mo3923l(view2)) + 1;
        }
        return Math.min(aa.mo3086g(), aa.mo3074a(view2) - aa.mo3081d(view));
    }

    /* renamed from: a */
    static int m3879a(RecyclerView.C0775t tVar, C0687Aa aa, View view, View view2, RecyclerView.C0759i iVar, boolean z, boolean z2) {
        if (iVar.mo3903e() == 0 || tVar.mo4011a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (tVar.mo4011a() - Math.max(iVar.mo3923l(view), iVar.mo3923l(view2))) - 1) : Math.max(0, Math.min(iVar.mo3923l(view), iVar.mo3923l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(aa.mo3074a(view2) - aa.mo3081d(view))) / ((float) (Math.abs(iVar.mo3923l(view) - iVar.mo3923l(view2)) + 1)))) + ((float) (aa.mo3084f() - aa.mo3081d(view))));
    }

    /* renamed from: b */
    static int m3880b(RecyclerView.C0775t tVar, C0687Aa aa, View view, View view2, RecyclerView.C0759i iVar, boolean z) {
        if (iVar.mo3903e() == 0 || tVar.mo4011a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return tVar.mo4011a();
        }
        return (int) ((((float) (aa.mo3074a(view2) - aa.mo3081d(view))) / ((float) (Math.abs(iVar.mo3923l(view) - iVar.mo3923l(view2)) + 1))) * ((float) tVar.mo4011a()));
    }
}
