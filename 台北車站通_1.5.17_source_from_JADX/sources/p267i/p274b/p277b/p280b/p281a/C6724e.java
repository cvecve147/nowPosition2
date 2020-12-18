package p267i.p274b.p277b.p280b.p281a;

import android.content.Context;
import android.content.DialogInterface;
import p267i.p274b.p277b.p280b.p281a.C6729j;

/* renamed from: i.b.b.b.a.e */
class C6724e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f18686a;

    /* renamed from: b */
    final /* synthetic */ C6729j f18687b;

    C6724e(C6729j jVar, Context context) {
        this.f18687b = jVar;
        this.f18686a = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        new C6729j.C6732c(this.f18686a).execute(new Void[0]);
        dialogInterface.dismiss();
    }
}
