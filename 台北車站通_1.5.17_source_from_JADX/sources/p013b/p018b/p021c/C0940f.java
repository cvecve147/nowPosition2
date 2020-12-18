package p013b.p018b.p021c;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: b.b.c.f */
class C0940f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f3755a;

    /* renamed from: b */
    final /* synthetic */ Uri f3756b;

    /* renamed from: c */
    final /* synthetic */ boolean f3757c;

    /* renamed from: d */
    final /* synthetic */ Bundle f3758d;

    /* renamed from: e */
    final /* synthetic */ C0941g f3759e;

    C0940f(C0941g gVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.f3759e = gVar;
        this.f3755a = i;
        this.f3756b = uri;
        this.f3757c = z;
        this.f3758d = bundle;
    }

    public void run() {
        this.f3759e.f3761b.mo4821a(this.f3755a, this.f3756b, this.f3757c, this.f3758d);
        throw null;
    }
}
