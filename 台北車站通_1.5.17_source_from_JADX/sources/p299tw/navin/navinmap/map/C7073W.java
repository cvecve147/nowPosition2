package p299tw.navin.navinmap.map;

import android.content.DialogInterface;
import p299tw.navin.navinmap.map.C7076Z;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: tw.navin.navinmap.map.W */
class C7073W implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C7112l.C7116d f19506a;

    /* renamed from: b */
    final /* synthetic */ C7076Z.C7077a f19507b;

    C7073W(C7076Z.C7077a aVar, C7112l.C7116d dVar) {
        this.f19507b = aVar;
        this.f19506a = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C7076Z.this.mo21095i();
        this.f19507b.m26652b(this.f19506a);
    }
}
