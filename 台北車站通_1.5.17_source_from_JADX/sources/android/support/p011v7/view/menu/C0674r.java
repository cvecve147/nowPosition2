package android.support.p011v7.view.menu;

import android.content.Context;
import android.support.p007v4.view.C0463e;
import android.support.p011v7.view.menu.C0669q;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p013b.p018b.p028h.p033c.p034a.C1050b;

/* renamed from: android.support.v7.view.menu.r */
class C0674r extends C0669q {

    /* renamed from: android.support.v7.view.menu.r$a */
    class C0675a extends C0669q.C0670a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        C0463e.C0465b f2604f;

        public C0675a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo1933a(MenuItem menuItem) {
            return this.f2599d.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo1935a(C0463e.C0465b bVar) {
            this.f2604f = bVar;
            this.f2599d.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo1938b() {
            return this.f2599d.isVisible();
        }

        /* renamed from: e */
        public boolean mo1941e() {
            return this.f2599d.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0463e.C0465b bVar = this.f2604f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    C0674r(Context context, C1050b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0669q.C0670a mo2970a(ActionProvider actionProvider) {
        return new C0675a(this.f2474b, actionProvider);
    }
}
