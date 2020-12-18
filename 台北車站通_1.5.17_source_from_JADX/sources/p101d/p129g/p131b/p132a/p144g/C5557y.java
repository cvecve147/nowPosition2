package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Callable;

/* renamed from: d.g.b.a.g.y */
final class C5557y implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5556x f15489a;

    /* renamed from: b */
    private final /* synthetic */ Callable f15490b;

    C5557y(C5556x xVar, Callable callable) {
        this.f15489a = xVar;
        this.f15490b = callable;
    }

    public final void run() {
        try {
            this.f15489a.mo15014a(this.f15490b.call());
        } catch (Exception e) {
            this.f15489a.mo15013a(e);
        }
    }
}
