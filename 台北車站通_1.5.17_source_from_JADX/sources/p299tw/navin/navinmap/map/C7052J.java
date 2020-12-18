package p299tw.navin.navinmap.map;

import android.content.Context;
import android.content.DialogInterface;
import p267i.p268a.p269a.C6689e;
import p299tw.navin.navinmap.map.C7030F;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.J */
class C7052J implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7030F.C7048r f19399a;

    C7052J(C7030F.C7048r rVar) {
        this.f19399a = rVar;
    }

    public void run() {
        C7173l.m26996a((Context) C7030F.this.f19352g, -1, C6689e.dialog_not_in_beacon_region_msg, false, (DialogInterface.OnClickListener) null);
    }
}
