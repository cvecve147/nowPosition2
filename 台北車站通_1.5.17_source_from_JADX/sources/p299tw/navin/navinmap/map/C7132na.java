package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.os.Handler;
import p267i.p268a.p269a.p271b.C6681d;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: tw.navin.navinmap.map.na */
abstract class C7132na {

    /* renamed from: a */
    protected Activity f19697a;

    /* renamed from: b */
    protected C6681d f19698b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f19699c = new C7126la(this);

    protected C7132na(Activity activity) {
        this.f19697a = activity;
        this.f19698b = C6681d.m25398a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21216a() {
        this.f19698b.mo17126a((C6681d.C6682a) new C7128ma(this));
        this.f19698b.mo17128b(this.f19697a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo21217a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo21218a(C6705b.C6706a aVar) {
        if (Integer.parseInt(aVar.f18622a) != 310104) {
            return false;
        }
        mo21216a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21219b() {
        this.f19697a = null;
        C6681d dVar = this.f19698b;
        if (dVar != null) {
            dVar.mo17127b();
            this.f19698b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo21220b(C6705b.C6706a aVar);
}
