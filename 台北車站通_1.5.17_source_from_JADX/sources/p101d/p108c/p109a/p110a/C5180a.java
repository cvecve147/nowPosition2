package p101d.p108c.p109a.p110a;

import android.view.inputmethod.InputMethodManager;
import p101d.p108c.p109a.C5197l;

/* renamed from: d.c.a.a.a */
class C5180a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5197l f14559a;

    /* renamed from: b */
    final /* synthetic */ C5197l.C5198a f14560b;

    C5180a(C5197l lVar, C5197l.C5198a aVar) {
        this.f14559a = lVar;
        this.f14560b = aVar;
    }

    public void run() {
        this.f14559a.mo14368d().requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f14560b.mo14388b().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f14559a.mo14368d(), 1);
        }
    }
}
