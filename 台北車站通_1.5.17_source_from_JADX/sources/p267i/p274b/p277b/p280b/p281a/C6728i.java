package p267i.p274b.p277b.p280b.p281a;

import java.util.ArrayList;
import p267i.p274b.p277b.p280b.p281a.C6729j;

/* renamed from: i.b.b.b.a.i */
class C6728i extends Thread {

    /* renamed from: a */
    final /* synthetic */ ArrayList f18692a;

    /* renamed from: b */
    final /* synthetic */ C6729j f18693b;

    C6728i(C6729j jVar, ArrayList arrayList) {
        this.f18693b = jVar;
        this.f18692a = arrayList;
    }

    public void run() {
        ArrayList arrayList;
        C6729j.C6731b bVar;
        if (this.f18692a.size() != 0) {
            bVar = this.f18693b.f18696c;
            arrayList = this.f18692a;
        } else {
            bVar = this.f18693b.f18696c;
            arrayList = null;
        }
        bVar.mo17211a((ArrayList<C6722c>) arrayList);
    }
}
