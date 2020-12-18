package p101d.p206l.p207a;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: d.l.a.b */
class C6056b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C6058d f16965a;

    C6056b(C6058d dVar) {
        this.f16965a = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f16965a.f16969c.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
    }
}
