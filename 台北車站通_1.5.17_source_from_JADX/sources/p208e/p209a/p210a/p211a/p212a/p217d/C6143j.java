package p208e.p209a.p210a.p211a.p212a.p217d;

import android.content.Context;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;

/* renamed from: e.a.a.a.a.d.j */
public class C6143j implements Runnable {

    /* renamed from: a */
    private final Context f17140a;

    /* renamed from: b */
    private final C6139f f17141b;

    public C6143j(Context context, C6139f fVar) {
        this.f17140a = context;
        this.f17141b = fVar;
    }

    public void run() {
        try {
            C6080l.m23054c(this.f17140a, "Performing time based file roll over.");
            if (!this.f17141b.mo14712b()) {
                this.f17141b.mo14713c();
            }
        } catch (Exception e) {
            C6080l.m23040a(this.f17140a, "Failed to roll over file", (Throwable) e);
        }
    }
}
