package p267i.p274b.p283d;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: i.b.d.f */
class C6770f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f18782a;

    /* renamed from: b */
    final /* synthetic */ Activity f18783b;

    C6770f(boolean z, Activity activity) {
        this.f18782a = z;
        this.f18783b = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f18782a) {
            this.f18783b.finish();
        }
    }
}
