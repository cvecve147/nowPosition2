package p101d.p201j.p202a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/* renamed from: d.j.a.h */
public class C6037h {

    /* renamed from: a */
    private static boolean f16899a = false;

    /* renamed from: b */
    private String f16900b = "STOScanManager";

    /* renamed from: c */
    private Context f16901c;

    /* renamed from: d */
    private C6035f f16902d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6044l f16903e;

    /* renamed from: f */
    private C6039b f16904f;

    /* renamed from: g */
    private C6040c f16905g;

    /* renamed from: h */
    private List<String> f16906h;

    /* renamed from: i */
    private Map<String, List<C6036g>> f16907i;

    /* renamed from: j */
    Timer f16908j = new Timer(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6041i f16909k;

    /* renamed from: d.j.a.h$a */
    protected class C6038a implements C6041i {
        protected C6038a() {
        }

        /* renamed from: a */
        public void mo14178a(List<C6036g> list) {
            C6037h.this.m22920a(list.get(0));
        }
    }

    /* renamed from: d.j.a.h$b */
    public enum C6039b {
        GENERALSCANNING,
        PERSECOND
    }

    /* renamed from: d.j.a.h$c */
    protected class C6040c extends BroadcastReceiver {
        protected C6040c() {
        }

        public void onReceive(Context context, Intent intent) {
            List<ScanResult> scanResults = C6037h.this.f16903e.mo15981a().getScanResults();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < scanResults.size(); i++) {
                arrayList.add(new C6036g(scanResults.get(i)));
            }
            C6037h.this.f16909k.mo14178a(arrayList);
            C6037h.this.f16903e.mo15981a().startScan();
        }
    }

    public C6037h(Context context, C6041i iVar, C6039b bVar) {
        this.f16901c = context;
        this.f16909k = iVar;
        this.f16904f = bVar;
        m22923c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m22920a(C6036g gVar) {
        if (this.f16907i.containsKey(gVar.mo15969a())) {
            this.f16907i.get(gVar.mo15969a()).add(gVar);
        } else {
            this.f16906h.add(gVar.mo15969a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            this.f16907i.put(gVar.mo15969a(), arrayList);
        }
    }

    /* renamed from: c */
    private void m22923c() {
        C6041i iVar;
        C6035f fVar;
        C6039b bVar = this.f16904f;
        if (bVar == C6039b.GENERALSCANNING) {
            iVar = this.f16909k;
        } else if (bVar == C6039b.PERSECOND) {
            iVar = new C6038a();
            this.f16906h = new ArrayList();
            this.f16907i = new HashMap();
        } else {
            iVar = null;
        }
        this.f16903e = new C6044l(this.f16901c);
        int i = Build.VERSION.SDK_INT;
        if (i < 18) {
            if (f16899a) {
                Log.i(this.f16900b, "Beacon Scanner not supported prior to API 18.");
            }
            this.f16902d = null;
            return;
        }
        if (i < 21) {
            if (f16899a) {
                Log.i(this.f16900b, "Beacon Scanner Version - API18");
            }
            fVar = new C6032c(this.f16901c, iVar);
        } else {
            if (f16899a) {
                Log.i(this.f16900b, "Beacon Scanner Version - API21");
            }
            fVar = new C6034e(this.f16901c, iVar);
        }
        this.f16902d = fVar;
    }

    /* renamed from: a */
    public void mo15978a() {
        this.f16905g = new C6040c();
        if (this.f16904f == C6039b.GENERALSCANNING) {
            this.f16903e.mo15982a(this.f16905g);
        }
        C6035f fVar = this.f16902d;
        if (fVar != null) {
            fVar.mo15965b();
        }
    }

    /* renamed from: b */
    public void mo15979b() {
        if (this.f16904f == C6039b.GENERALSCANNING) {
            this.f16903e.mo15983b(this.f16905g);
        }
        C6035f fVar = this.f16902d;
        if (fVar != null) {
            fVar.mo15966c();
        }
    }
}
