package p101d.p108c.p109a;

import android.text.Editable;
import android.text.TextWatcher;
import p101d.p108c.p109a.C5197l;

/* renamed from: d.c.a.j */
class C5195j implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C5197l f14585a;

    C5195j(C5197l lVar) {
        this.f14585a = lVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.toString().length();
        boolean z = false;
        if (!this.f14585a.f14601p.f14670ma) {
            if (length == 0) {
                z = true;
            }
            this.f14585a.mo14363a(C5188c.POSITIVE).setEnabled(!z);
        }
        this.f14585a.mo14364a(length, z);
        C5197l lVar = this.f14585a;
        C5197l.C5198a aVar = lVar.f14601p;
        if (aVar.f14674oa) {
            aVar.f14668la.mo14405a(lVar, charSequence);
        }
    }
}
