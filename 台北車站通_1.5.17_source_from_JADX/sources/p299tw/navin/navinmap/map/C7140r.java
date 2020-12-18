package p299tw.navin.navinmap.map;

import android.content.Context;
import android.os.AsyncTask;
import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p270a.C6661a;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p299tw.navin.navinmap.util.C7157a;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.r */
class C7140r extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    final /* synthetic */ C7143u f19712a;

    C7140r(C7143u uVar) {
        this.f19712a = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        new C6661a(this.f19712a.f19715a).mo17101e();
        if (C7173l.m26999a((Context) this.f19712a.f19715a)) {
            this.f19712a.m26892j();
            return null;
        } else if (C6667g.m25367g(this.f19712a.f19715a)) {
            this.f19712a.m26894l();
            if (this.f19712a.f19718d == null) {
                return null;
            }
            this.f19712a.f19718d.mo21018a();
            return null;
        } else {
            C7157a.m26966b("## No network connection.");
            if (this.f19712a.f19718d == null) {
                return null;
            }
            C6705b.C6706a aVar = new C6705b.C6706a();
            aVar.f18622a = String.valueOf(320101);
            aVar.f18623b = this.f19712a.f19715a.getString(C6689e.dialog_network_unavailable_for_mission_msg);
            this.f19712a.f19718d.mo21019a(aVar);
            return null;
        }
    }
}
