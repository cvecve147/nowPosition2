package p267i.p274b.p277b.p280b.p281a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6900d;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.C6912j;
import org.altbeacon.beacon.C6915m;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p292b.C6884b;
import p267i.p274b.p277b.C6702a;

/* renamed from: i.b.b.b.a.b */
public class C6719b extends C6729j implements C6900d {

    /* renamed from: A */
    private C6735m f18664A;

    /* renamed from: B */
    private int f18665B;

    /* renamed from: C */
    private C6721b f18666C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f18667D;

    /* renamed from: w */
    private final String f18668w;

    /* renamed from: x */
    private C6906h f18669x;

    /* renamed from: y */
    private Region f18670y;

    /* renamed from: z */
    private C6884b f18671z;

    /* renamed from: i.b.b.b.a.b$a */
    private class C6720a implements C6915m {
        private C6720a() {
        }

        @SuppressLint({"DefaultLocale"})
        /* renamed from: a */
        public void mo17186a(Collection<Beacon> collection, Region region) {
            if (collection.size() > 0) {
                synchronized (C6719b.this.f18667D) {
                    for (Beacon a : collection) {
                        C6719b.this.mo17200a(C6719b.this.mo17178a(a));
                    }
                }
            }
        }
    }

    /* renamed from: i.b.b.b.a.b$b */
    private class C6721b extends Thread {

        /* renamed from: a */
        boolean f18673a = false;

        /* renamed from: b */
        int f18674b = 0;

        C6721b(int i) {
            this.f18674b = i;
        }

        public void interrupt() {
            this.f18673a = false;
            super.interrupt();
        }

        public void run() {
            this.f18673a = true;
            while (this.f18673a) {
                try {
                    Thread.sleep((long) this.f18674b);
                    if (this.f18673a) {
                        synchronized (C6719b.this.f18667D) {
                            C6719b.this.mo17207e();
                            C6719b.this.mo17206d();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public C6719b(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this(context, z, z2, z3, z4, (C6910i) null);
    }

    public C6719b(Context context, boolean z, boolean z2, boolean z3, boolean z4, C6910i iVar) {
        super(context, z, z2, z3, z4);
        this.f18668w = "SangoRangingUniqueId";
        this.f18669x = null;
        this.f18670y = null;
        this.f18665B = 32;
        this.f18666C = new C6721b(1000);
        this.f18667D = new Object();
        iVar = iVar == null ? new C6910i() : iVar;
        this.f18669x = C6906h.m26069a(context);
        List<C6910i> f = this.f18669x.mo18767f();
        iVar.mo18786a("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24");
        f.add(iVar);
        this.f18671z = new C6884b(0.42093d, 6.9476d, 0.54992d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6722c mo17178a(Beacon beacon) {
        String upperCase = beacon.mo18698h().toString().toUpperCase(Locale.getDefault());
        int b = beacon.mo18700i().mo18797b();
        int b2 = beacon.mo18701j().mo18797b();
        int k = beacon.mo18702k();
        int m = beacon.mo18704m();
        String a = beacon.mo18686a();
        String b3 = beacon.mo18690b();
        int i = this.f18665B;
        double a2 = i == 33 ? this.f18671z.mo18728a(beacon.mo18704m(), (double) k) : i == 32 ? beacon.mo18694d() : i == 34 ? this.f18664A.mo17219a(upperCase, b, b2, k) : -1.0d;
        C6722c cVar = new C6722c();
        cVar.f18676a = upperCase;
        cVar.f18677b = b;
        cVar.f18678c = b2;
        cVar.f18680e = k;
        cVar.f18679d = a2;
        cVar.f18681f = m;
        cVar.f18683h = a;
        cVar.f18682g = b3;
        return cVar;
    }

    /* renamed from: a */
    public void mo17179a() {
        this.f18669x.mo18759a((C6915m) new C6720a());
        try {
            this.f18670y = new Region("SangoRangingUniqueId", (C6912j) null, (C6912j) null, (C6912j) null);
            this.f18669x.mo18757a(this.f18670y);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public void mo17180a(ServiceConnection serviceConnection) {
        this.f18695b.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public boolean mo17181a(Intent intent, ServiceConnection serviceConnection, int i) {
        if (this.f18695b.bindService(intent, serviceConnection, i)) {
            return true;
        }
        C6702a.m25440a("## bind ibeacon failed..");
        return true;
    }

    /* renamed from: b */
    public Context mo17182b() {
        return this.f18695b.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17183c() {
        if (this.f18665B == 34) {
            this.f18664A = new C6735m();
        }
        mo17206d();
        super.mo17183c();
        this.f18669x.mo18758a((C6900d) this);
        this.f18666C.start();
    }

    /* renamed from: c */
    public void mo17184c(int i) {
        if (i == 32 || i == 33 || i == 34) {
            this.f18665B = i;
            return;
        }
        C6702a.m25441b("## Set distance calculating mode failed. No mode value of '" + i + "'");
    }

    /* renamed from: f */
    public void mo17185f() {
        C6721b bVar = this.f18666C;
        if (bVar != null) {
            bVar.interrupt();
            this.f18666C = null;
        }
        try {
            if (this.f18670y != null) {
                this.f18669x.mo18761b(this.f18670y);
            }
            this.f18669x.mo18762b((C6900d) this);
            this.f18670y = null;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        super.mo17185f();
    }
}
