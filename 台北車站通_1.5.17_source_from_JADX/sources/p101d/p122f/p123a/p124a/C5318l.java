package p101d.p122f.p123a.p124a;

import java.io.File;
import java.util.List;
import p208e.p209a.p210a.p211a.p212a.p215c.p216a.C6103b;
import p208e.p209a.p210a.p211a.p212a.p215c.p216a.C6104c;
import p208e.p209a.p210a.p211a.p212a.p215c.p216a.C6106e;
import p208e.p209a.p210a.p211a.p212a.p217d.C6140g;

/* renamed from: d.f.a.a.l */
class C5318l implements C6140g {

    /* renamed from: a */
    private final C5331x f15053a;

    /* renamed from: b */
    private final C5327t f15054b;

    C5318l(C5331x xVar, C5327t tVar) {
        this.f15053a = xVar;
        this.f15054b = tVar;
    }

    /* renamed from: a */
    public static C5318l m20528a(C5331x xVar) {
        return new C5318l(xVar, new C5327t(new C6106e(new C5326s(new C6104c(1000, 8), 0.1d), new C6103b(5))));
    }

    /* renamed from: a */
    public boolean mo14702a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.f15054b.mo14721a(nanoTime)) {
            if (this.f15053a.mo14702a(list)) {
                this.f15054b.mo14720a();
                return true;
            }
            this.f15054b.mo14722b(nanoTime);
        }
        return false;
    }
}
