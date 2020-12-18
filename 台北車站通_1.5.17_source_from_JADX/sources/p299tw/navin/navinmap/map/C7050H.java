package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import p267i.p268a.p269a.C6689e;
import p299tw.navin.navinmap.map.C7030F;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.H */
class C7050H implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7030F.C7045o f19397a;

    C7050H(C7030F.C7045o oVar) {
        this.f19397a = oVar;
    }

    public void run() {
        int i;
        Activity activity;
        C7030F.this.f19351f.mo21095i();
        if (C7030F.this.f19345O) {
            activity = C7030F.this.f19352g;
            i = C6689e.dialog_barrier_free_route_not_found_msg;
        } else {
            activity = C7030F.this.f19352g;
            i = C6689e.dialog_route_not_found_msg;
        }
        C7173l.m26996a((Context) activity, -1, i, false, (DialogInterface.OnClickListener) null);
    }
}
