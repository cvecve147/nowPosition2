package p299tw.navin.navinmap.map;

import android.content.DialogInterface;
import p299tw.navin.navinmap.map.C7066T;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: tw.navin.navinmap.map.Q */
class C7064Q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C7066T.C7067a f19448a;

    C7064Q(C7066T.C7067a aVar) {
        this.f19448a = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C7112l.C7120h hVar = (C7112l.C7120h) C7066T.this.f19496u.get(i);
        if (!C7066T.this.f19500y) {
            C7066T.this.mo21095i();
            C7066T.this.mo21083a(hVar);
            return;
        }
        C7066T.this.mo21081a((DialogInterface.OnClickListener) new C7058P(this, hVar));
    }
}
