package p000a.p001a.p003b;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.Timer;

/* renamed from: a.a.b.f */
public class C0013f {

    /* renamed from: a */
    private String f42a = "STOScanManager";

    /* renamed from: b */
    private Context f43b;

    /* renamed from: c */
    private C0012e f44c;

    /* renamed from: d */
    private C0014a f45d;

    /* renamed from: e */
    Timer f46e = new Timer(false);

    /* renamed from: f */
    private C0015g f47f;

    /* renamed from: a.a.b.f$a */
    public enum C0014a {
        GENERALSCANNING,
        PERSECOND
    }

    public C0013f(Context context, C0015g gVar, C0014a aVar) {
        this.f43b = context;
        this.f47f = gVar;
        this.f45d = aVar;
        m40c();
    }

    /* renamed from: c */
    private void m40c() {
        C0012e eVar;
        C0015g gVar = this.f45d == C0014a.GENERALSCANNING ? this.f47f : null;
        int i = Build.VERSION.SDK_INT;
        if (i < 18) {
            Log.i(this.f42a, "Beacon Scanner not supported prior to API 18.");
            this.f44c = null;
            return;
        }
        if (i < 21) {
            Log.i(this.f42a, "Beacon Scanner Version - API18");
            eVar = new C0009b(this.f43b, gVar);
        } else {
            Log.i(this.f42a, "Beacon Scanner Version - API21");
            eVar = new C0011d(this.f43b, gVar);
        }
        this.f44c = eVar;
    }

    /* renamed from: a */
    public void mo18a() {
        C0012e eVar = this.f44c;
        if (eVar != null) {
            eVar.mo15b();
        }
    }

    /* renamed from: b */
    public void mo19b() {
        C0012e eVar = this.f44c;
        if (eVar != null) {
            eVar.mo16c();
        }
    }
}
