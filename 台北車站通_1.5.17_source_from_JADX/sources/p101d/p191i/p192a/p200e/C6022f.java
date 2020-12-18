package p101d.p191i.p192a.p200e;

import android.content.Context;
import android.widget.Toast;

/* renamed from: d.i.a.e.f */
class C6022f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f16842a;

    /* renamed from: b */
    final /* synthetic */ String f16843b;

    /* renamed from: c */
    final /* synthetic */ int f16844c;

    C6022f(Context context, String str, int i) {
        this.f16842a = context;
        this.f16843b = str;
        this.f16844c = i;
    }

    public void run() {
        Toast.makeText(this.f16842a.getApplicationContext(), this.f16843b, this.f16844c).show();
    }
}
