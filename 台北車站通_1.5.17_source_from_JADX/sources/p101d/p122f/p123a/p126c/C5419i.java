package p101d.p122f.p123a.p126c;

import android.content.DialogInterface;
import p101d.p122f.p123a.p126c.C5421j;

/* renamed from: d.f.a.c.i */
class C5419i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C5421j.C5422a f15280a;

    /* renamed from: b */
    final /* synthetic */ C5421j.C5423b f15281b;

    C5419i(C5421j.C5422a aVar, C5421j.C5423b bVar) {
        this.f15280a = aVar;
        this.f15281b = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f15280a.mo14868a(true);
        this.f15281b.mo14870a(true);
        dialogInterface.dismiss();
    }
}
