package android.support.p011v7.widget;

import org.apache.http.HttpStatus;

/* renamed from: android.support.v7.widget.ia */
class C0842ia implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0850ka f3455a;

    C0842ia(C0850ka kaVar) {
        this.f3455a = kaVar;
    }

    public void run() {
        this.f3455a.mo4550a((int) HttpStatus.SC_INTERNAL_SERVER_ERROR);
    }
}
