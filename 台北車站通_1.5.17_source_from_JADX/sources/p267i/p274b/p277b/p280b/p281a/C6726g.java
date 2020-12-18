package p267i.p274b.p277b.p280b.p281a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: i.b.b.b.a.g */
class C6726g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f18689a;

    /* renamed from: b */
    final /* synthetic */ C6729j f18690b;

    C6726g(C6729j jVar, Context context) {
        this.f18690b = jVar;
        this.f18689a = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f18689a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        dialogInterface.dismiss();
    }
}
