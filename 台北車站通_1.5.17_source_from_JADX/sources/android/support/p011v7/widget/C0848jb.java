package android.support.p011v7.widget;

import android.support.p011v7.view.menu.C0649a;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.widget.jb */
class C0848jb implements View.OnClickListener {

    /* renamed from: a */
    final C0649a f3469a = new C0649a(this.f3470b.f3517a.getContext(), 0, 16908332, 0, 0, this.f3470b.f3525i);

    /* renamed from: b */
    final /* synthetic */ C0857lb f3470b;

    C0848jb(C0857lb lbVar) {
        this.f3470b = lbVar;
    }

    public void onClick(View view) {
        C0857lb lbVar = this.f3470b;
        Window.Callback callback = lbVar.f3528l;
        if (callback != null && lbVar.f3529m) {
            callback.onMenuItemSelected(0, this.f3469a);
        }
    }
}
