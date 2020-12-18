package p101d.p122f.p123a.p124a;

import android.annotation.SuppressLint;
import android.content.Context;
import p208e.p209a.p210a.p211a.p212a.p219f.C6163c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;

/* renamed from: d.f.a.a.k */
class C5317k {

    /* renamed from: a */
    private final C6163c f15052a;

    C5317k(C6163c cVar) {
        this.f15052a = cVar;
    }

    /* renamed from: a */
    public static C5317k m20525a(Context context) {
        return new C5317k(new C6164d(context, "settings"));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo14700a() {
        return this.f15052a.get().getBoolean("analytics_launched", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public void mo14701b() {
        C6163c cVar = this.f15052a;
        cVar.mo16235a(cVar.edit().putBoolean("analytics_launched", true));
    }
}
