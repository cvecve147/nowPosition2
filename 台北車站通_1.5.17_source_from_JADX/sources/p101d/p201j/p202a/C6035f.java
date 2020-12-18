package p101d.p201j.p202a;

import android.content.Context;
import android.util.Log;

/* renamed from: d.j.a.f */
public abstract class C6035f {

    /* renamed from: a */
    private static boolean f16881a = false;

    /* renamed from: b */
    private String f16882b = "STOBeaconScanManager";

    /* renamed from: c */
    protected Context f16883c;

    /* renamed from: d */
    protected C6041i f16884d;

    public C6035f(Context context, C6041i iVar) {
        this.f16883c = context;
        this.f16884d = iVar;
        mo15963a();
        if (f16881a) {
            Log.i(this.f16882b, "constructor is called");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15963a();

    /* renamed from: b */
    public abstract void mo15965b();

    /* renamed from: c */
    public abstract void mo15966c();
}
