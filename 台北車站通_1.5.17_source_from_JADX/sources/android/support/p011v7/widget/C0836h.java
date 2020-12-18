package android.support.p011v7.widget;

import android.support.p011v7.view.menu.C0685z;
import android.support.p011v7.widget.ActionMenuPresenter;
import android.view.View;

/* renamed from: android.support.v7.widget.h */
class C0836h extends C0859ma {

    /* renamed from: j */
    final /* synthetic */ ActionMenuPresenter f3436j;

    /* renamed from: k */
    final /* synthetic */ ActionMenuPresenter.C0693d f3437k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0836h(ActionMenuPresenter.C0693d dVar, View view, ActionMenuPresenter actionMenuPresenter) {
        super(view);
        this.f3437k = dVar;
        this.f3436j = actionMenuPresenter;
    }

    /* renamed from: a */
    public C0685z mo2688a() {
        ActionMenuPresenter.C0694e eVar = ActionMenuPresenter.this.f2695z;
        if (eVar == null) {
            return null;
        }
        return eVar.mo3044b();
    }

    /* renamed from: b */
    public boolean mo2689b() {
        ActionMenuPresenter.this.mo3183j();
        return true;
    }

    /* renamed from: c */
    public boolean mo4491c() {
        ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
        if (actionMenuPresenter.f2676B != null) {
            return false;
        }
        actionMenuPresenter.mo3179f();
        return true;
    }
}
