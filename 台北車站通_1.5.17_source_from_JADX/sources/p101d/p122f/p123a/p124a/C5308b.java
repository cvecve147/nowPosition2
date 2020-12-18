package p101d.p122f.p123a.p124a;

import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p220g.C6167b;

/* renamed from: d.f.a.a.b */
class C5308b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6167b f15031a;

    /* renamed from: b */
    final /* synthetic */ String f15032b;

    /* renamed from: c */
    final /* synthetic */ C5314h f15033c;

    C5308b(C5314h hVar, C6167b bVar, String str) {
        this.f15033c = hVar;
        this.f15031a = bVar;
        this.f15032b = str;
    }

    public void run() {
        try {
            this.f15033c.f15047g.mo14711a(this.f15031a, this.f15032b);
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to set analytics settings data", e);
        }
    }
}
