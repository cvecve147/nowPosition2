package p101d.p122f.p123a.p126c;

import android.annotation.SuppressLint;
import p208e.p209a.p210a.p211a.p212a.p219f.C6163c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: d.f.a.c.ca */
class C5402ca {

    /* renamed from: a */
    private final C6163c f15250a;

    public C5402ca(C6163c cVar) {
        this.f15250a = cVar;
    }

    /* renamed from: a */
    public static C5402ca m20735a(C6163c cVar, C5351F f) {
        if (!cVar.get().getBoolean("preferences_migration_complete", false)) {
            C6164d dVar = new C6164d(f);
            if (!cVar.get().contains("always_send_reports_opt_in") && dVar.get().contains("always_send_reports_opt_in")) {
                cVar.mo16235a(cVar.edit().putBoolean("always_send_reports_opt_in", dVar.get().getBoolean("always_send_reports_opt_in", false)));
            }
            cVar.mo16235a(cVar.edit().putBoolean("preferences_migration_complete", true));
        }
        return new C5402ca(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14822a(boolean z) {
        C6163c cVar = this.f15250a;
        cVar.mo16235a(cVar.edit().putBoolean("always_send_reports_opt_in", z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14823a() {
        return this.f15250a.get().getBoolean("always_send_reports_opt_in", false);
    }
}
