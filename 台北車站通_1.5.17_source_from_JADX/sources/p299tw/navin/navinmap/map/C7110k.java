package p299tw.navin.navinmap.map;

import java.util.ArrayList;
import p267i.p274b.p277b.p280b.p281a.C6722c;
import p267i.p274b.p277b.p280b.p281a.C6729j;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: tw.navin.navinmap.map.k */
class C7110k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6729j.C6731b f19580a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f19581b;

    /* renamed from: c */
    final /* synthetic */ C7112l.C7113a f19582c;

    C7110k(C7112l.C7113a aVar, C6729j.C6731b bVar, ArrayList arrayList) {
        this.f19582c = aVar;
        this.f19580a = bVar;
        this.f19581b = arrayList;
    }

    public void run() {
        this.f19580a.mo17211a((ArrayList<C6722c>) this.f19581b);
    }
}
