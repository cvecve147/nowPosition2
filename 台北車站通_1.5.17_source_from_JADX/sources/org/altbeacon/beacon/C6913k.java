package org.altbeacon.beacon;

import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.Set;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.service.C6940d;
import org.altbeacon.beacon.service.C6941e;
import org.altbeacon.beacon.service.C6944h;

/* renamed from: org.altbeacon.beacon.k */
class C6913k {

    /* renamed from: a */
    private static final String f19073a = "k";

    C6913k() {
    }

    /* renamed from: a */
    public void mo18803a(Context context, Intent intent) {
        C6940d dVar;
        C6944h hVar = null;
        if (intent == null || intent.getExtras() == null) {
            dVar = null;
        } else {
            dVar = intent.getExtras().getBundle("monitoringData") != null ? C6940d.m26229a(intent.getExtras().getBundle("monitoringData")) : null;
            if (intent.getExtras().getBundle("rangingData") != null) {
                hVar = C6944h.m26270a(intent.getExtras().getBundle("rangingData"));
            }
        }
        if (hVar != null) {
            C6895d.m26021a(f19073a, "got ranging data", new Object[0]);
            if (hVar.mo18905a() == null) {
                C6895d.m26027d(f19073a, "Ranging data has a null beacons collection", new Object[0]);
            }
            Set<C6915m> r = C6906h.m26069a(context).mo18777r();
            Collection<Beacon> a = hVar.mo18905a();
            if (r != null) {
                for (C6915m a2 : r) {
                    a2.mo17186a(a, hVar.mo18906b());
                }
            } else {
                C6895d.m26021a(f19073a, "but ranging notifier is null, so we're dropping it.", new Object[0]);
            }
            C6915m h = C6906h.m26069a(context).mo18768h();
            if (h != null) {
                h.mo17186a(a, hVar.mo18906b());
            }
        }
        if (dVar != null) {
            C6895d.m26021a(f19073a, "got monitoring data", new Object[0]);
            Set<C6914l> o = C6906h.m26069a(context).mo18774o();
            if (o != null) {
                for (C6914l next : o) {
                    C6895d.m26021a(f19073a, "Calling monitoring notifier: %s", next);
                    Region a3 = dVar.mo18873a();
                    Integer valueOf = Integer.valueOf(dVar.mo18874b() ? 1 : 0);
                    next.mo18804a(valueOf.intValue(), a3);
                    C6941e.m26233a(context).mo18880a(a3, valueOf);
                    if (dVar.mo18874b()) {
                        next.mo18805a(dVar.mo18873a());
                    } else {
                        next.mo18806b(dVar.mo18873a());
                    }
                }
            }
        }
    }
}
