package p208e.p209a.p210a.p211a.p212a.p214b;

import java.io.InputStream;
import p208e.p209a.p210a.p211a.p212a.p214b.C6096y;

/* renamed from: e.a.a.a.a.b.x */
class C6095x implements C6096y.C6099c {

    /* renamed from: a */
    boolean f17054a = true;

    /* renamed from: b */
    final /* synthetic */ StringBuilder f17055b;

    /* renamed from: c */
    final /* synthetic */ C6096y f17056c;

    C6095x(C6096y yVar, StringBuilder sb) {
        this.f17056c = yVar;
        this.f17055b = sb;
    }

    /* renamed from: a */
    public void mo14825a(InputStream inputStream, int i) {
        if (this.f17054a) {
            this.f17054a = false;
        } else {
            this.f17055b.append(", ");
        }
        this.f17055b.append(i);
    }
}
